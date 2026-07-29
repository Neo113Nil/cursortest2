package com.mopub.common.privacy;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.provider.Settings;
import android.text.TextUtils;
import com.mopub.common.GpsHelper;
import com.mopub.common.Preconditions;
import com.mopub.common.SdkInitializationListener;
import com.mopub.common.SharedPreferencesHelper;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.tapjoy.TapjoyConstants;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class MoPubIdentifier {
    private static final int MISSING_VALUE = -1;
    private static final String PREF_AD_INFO_GROUP = "com.mopub.settings.identifier";
    private static final String PREF_IDENTIFIER_TIME = "privacy.identifier.time";
    private static final String PREF_IFA_IDENTIFIER = "privacy.identifier.ifa";
    private static final String PREF_LIMIT_AD_TRACKING = "privacy.limit.ad.tracking";
    private static final String PREF_MOPUB_IDENTIFIER = "privacy.identifier.mopub";
    private boolean initialized;
    private AdvertisingId mAdInfo;
    private final Context mAppContext;
    private AdvertisingIdChangeListener mIdChangeListener;
    private SdkInitializationListener mInitializationListener;
    private boolean mRefreshingAdvertisingInfo;

    public interface AdvertisingIdChangeListener {
        void onIdChanged(AdvertisingId advertisingId, AdvertisingId advertisingId2);
    }

    public MoPubIdentifier(Context context) {
        this(context, null);
    }

    @VisibleForTesting
    MoPubIdentifier(Context context, AdvertisingIdChangeListener advertisingIdChangeListener) {
        Preconditions.NoThrow.checkNotNull(context);
        this.mAppContext = context;
        this.mIdChangeListener = advertisingIdChangeListener;
        this.mAdInfo = readIdFromStorage(this.mAppContext);
        if (this.mAdInfo == null) {
            this.mAdInfo = AdvertisingId.generateExpiredAdvertisingId();
        }
        refreshAdvertisingInfo();
    }

    public AdvertisingId getAdvertisingInfo() {
        AdvertisingId advertisingId = this.mAdInfo;
        refreshAdvertisingInfo();
        return advertisingId;
    }

    private void refreshAdvertisingInfo() {
        if (this.mRefreshingAdvertisingInfo) {
            return;
        }
        this.mRefreshingAdvertisingInfo = true;
        new RefreshAdvertisingInfoAsyncTask().execute(new Void[0]);
    }

    void refreshAdvertisingInfoBackgroundThread() {
        GpsHelper.AdvertisingInfo fetchAdvertisingInfoSync;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (isPlayServicesAvailable() && (fetchAdvertisingInfoSync = GpsHelper.fetchAdvertisingInfoSync(this.mAppContext)) != null) {
            AdvertisingId advertisingId = this.mAdInfo;
            if (fetchAdvertisingInfoSync.limitAdTracking && advertisingId.isRotationRequired()) {
                setAdvertisingInfo(fetchAdvertisingInfoSync.advertisingId, AdvertisingId.generateIdString(), fetchAdvertisingInfoSync.limitAdTracking, timeInMillis);
                return;
            } else {
                setAdvertisingInfo(fetchAdvertisingInfoSync.advertisingId, advertisingId.mMopubId, fetchAdvertisingInfoSync.limitAdTracking, advertisingId.mLastRotation.getTimeInMillis());
                return;
            }
        }
        AdvertisingId amazonAdvertisingInfo = getAmazonAdvertisingInfo(this.mAppContext);
        if (amazonAdvertisingInfo != null) {
            AdvertisingId advertisingId2 = this.mAdInfo;
            if (amazonAdvertisingInfo.isDoNotTrack() && advertisingId2.isRotationRequired()) {
                setAdvertisingInfo(amazonAdvertisingInfo.mAdvertisingId, AdvertisingId.generateIdString(), amazonAdvertisingInfo.mDoNotTrack, timeInMillis);
                return;
            } else {
                setAdvertisingInfo(amazonAdvertisingInfo.mAdvertisingId, advertisingId2.mMopubId, amazonAdvertisingInfo.mDoNotTrack, advertisingId2.mLastRotation.getTimeInMillis());
                return;
            }
        }
        rotateMopubId();
    }

    private static synchronized AdvertisingId readIdFromStorage(Context context) {
        synchronized (MoPubIdentifier.class) {
            Preconditions.checkNotNull(context);
            Calendar calendar = Calendar.getInstance();
            try {
                SharedPreferences sharedPreferences = SharedPreferencesHelper.getSharedPreferences(context, PREF_AD_INFO_GROUP);
                String string = sharedPreferences.getString(PREF_IFA_IDENTIFIER, "");
                String string2 = sharedPreferences.getString(PREF_MOPUB_IDENTIFIER, "");
                long j = sharedPreferences.getLong(PREF_IDENTIFIER_TIME, calendar.getTimeInMillis());
                boolean z = sharedPreferences.getBoolean(PREF_LIMIT_AD_TRACKING, false);
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    return new AdvertisingId(string, string2, z, j);
                }
            } catch (ClassCastException unused) {
                MoPubLog.e("Cannot read identifier from shared preferences");
            }
            return null;
        }
    }

    private static synchronized void writeIdToStorage(Context context, AdvertisingId advertisingId) {
        synchronized (MoPubIdentifier.class) {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(advertisingId);
            SharedPreferences.Editor edit = SharedPreferencesHelper.getSharedPreferences(context, PREF_AD_INFO_GROUP).edit();
            edit.putBoolean(PREF_LIMIT_AD_TRACKING, advertisingId.mDoNotTrack);
            edit.putString(PREF_IFA_IDENTIFIER, advertisingId.mAdvertisingId);
            edit.putString(PREF_MOPUB_IDENTIFIER, advertisingId.mMopubId);
            edit.putLong(PREF_IDENTIFIER_TIME, advertisingId.mLastRotation.getTimeInMillis());
            edit.apply();
        }
    }

    @VisibleForTesting
    static synchronized void clearStorage(Context context) {
        synchronized (MoPubIdentifier.class) {
            Preconditions.checkNotNull(context);
            SharedPreferences.Editor edit = SharedPreferencesHelper.getSharedPreferences(context, PREF_AD_INFO_GROUP).edit();
            edit.remove(PREF_LIMIT_AD_TRACKING);
            edit.remove(PREF_IFA_IDENTIFIER);
            edit.remove(PREF_MOPUB_IDENTIFIER);
            edit.remove(PREF_IDENTIFIER_TIME);
            edit.apply();
        }
    }

    private void rotateMopubId() {
        if (!this.mAdInfo.isRotationRequired()) {
            setAdvertisingInfo(this.mAdInfo);
        } else {
            setAdvertisingInfo(AdvertisingId.generateFreshAdvertisingId());
        }
    }

    private void setAdvertisingInfo(String str, String str2, boolean z, long j) {
        Preconditions.NoThrow.checkNotNull(str);
        Preconditions.NoThrow.checkNotNull(str2);
        setAdvertisingInfo(new AdvertisingId(str, str2, z, j));
    }

    private void setAdvertisingInfo(AdvertisingId advertisingId) {
        AdvertisingId advertisingId2 = this.mAdInfo;
        this.mAdInfo = advertisingId;
        writeIdToStorage(this.mAppContext, this.mAdInfo);
        if (!this.mAdInfo.equals(advertisingId2) || !this.initialized) {
            notifyIdChangeListener(advertisingId2, this.mAdInfo);
        }
        if (this.initialized) {
            return;
        }
        reportInitializationComplete();
    }

    public void setIdChangeListener(AdvertisingIdChangeListener advertisingIdChangeListener) {
        this.mIdChangeListener = advertisingIdChangeListener;
    }

    void setInitializationListener(SdkInitializationListener sdkInitializationListener) {
        this.mInitializationListener = sdkInitializationListener;
        if (this.initialized) {
            reportInitializationComplete();
        }
    }

    private void reportInitializationComplete() {
        if (this.mInitializationListener != null) {
            this.mInitializationListener.onInitializationFinished();
            this.mInitializationListener = null;
        }
        this.initialized = true;
    }

    private void notifyIdChangeListener(AdvertisingId advertisingId, AdvertisingId advertisingId2) {
        Preconditions.checkNotNull(advertisingId2);
        if (this.mIdChangeListener != null) {
            this.mIdChangeListener.onIdChanged(advertisingId, advertisingId2);
        }
    }

    private boolean isPlayServicesAvailable() {
        return GpsHelper.isPlayServicesAvailable(this.mAppContext);
    }

    private AdvertisingId getAmazonAdvertisingInfo(Context context) {
        Preconditions.NoThrow.checkNotNull(context);
        ContentResolver contentResolver = context.getContentResolver();
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", -1);
        String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
        if (i == -1 || TextUtils.isEmpty(string)) {
            return null;
        }
        boolean z = i != 0;
        AdvertisingId advertisingId = this.mAdInfo;
        return new AdvertisingId(string, advertisingId.mMopubId, z, advertisingId.mLastRotation.getTimeInMillis());
    }

    private class RefreshAdvertisingInfoAsyncTask extends AsyncTask<Void, Void, Void> {
        private RefreshAdvertisingInfoAsyncTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            MoPubIdentifier.this.refreshAdvertisingInfoBackgroundThread();
            MoPubIdentifier.this.mRefreshingAdvertisingInfo = false;
            return null;
        }
    }
}
