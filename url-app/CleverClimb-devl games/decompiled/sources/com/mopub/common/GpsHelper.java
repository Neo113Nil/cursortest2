package com.mopub.common;

import android.content.Context;
import android.os.AsyncTask;
import com.mopub.common.factories.MethodBuilderFactory;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Reflection;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class GpsHelper {
    public static final String ADVERTISING_ID_KEY = "advertisingId";
    public static final int GOOGLE_PLAY_SUCCESS_CODE = 0;
    public static final String IS_LIMIT_AD_TRACKING_ENABLED_KEY = "isLimitAdTrackingEnabled";
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    private static String sAdvertisingIdClientClassName = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static String sPlayServicesUtilClassName = "com.google.android.gms.common.GooglePlayServicesUtil";

    public interface GpsHelperListener {
        void onFetchAdInfoCompleted();
    }

    public static class AdvertisingInfo {
        public final String advertisingId;
        public final boolean limitAdTracking;

        public AdvertisingInfo(String str, boolean z) {
            this.advertisingId = str;
            this.limitAdTracking = z;
        }
    }

    public static boolean isPlayServicesAvailable(Context context) {
        try {
            Integer num = (Integer) MethodBuilderFactory.create(null, "isGooglePlayServicesAvailable").setStatic(Class.forName(sPlayServicesUtilClassName)).addParam((Class<Class>) Context.class, (Class) context).execute();
            if (num == null) {
                return false;
            }
            if (num.intValue() != 0) {
                if (num.intValue() != 2) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isLimitAdTrackingEnabled(Context context) {
        if (isPlayServicesAvailable(context)) {
            return SharedPreferencesHelper.getSharedPreferences(context).getBoolean(IS_LIMIT_AD_TRACKING_ENABLED_KEY, false);
        }
        return false;
    }

    public static void fetchAdvertisingInfoAsync(Context context, GpsHelperListener gpsHelperListener) {
        boolean isPlayServicesAvailable = isPlayServicesAvailable(context);
        if (isPlayServicesAvailable) {
            internalFetchAdvertisingInfoAsync(context, gpsHelperListener);
            return;
        }
        if (gpsHelperListener != null) {
            gpsHelperListener.onFetchAdInfoCompleted();
        }
        if (isPlayServicesAvailable) {
            internalFetchAdvertisingInfoAsync(context, null);
        }
    }

    public static AdvertisingInfo fetchAdvertisingInfoSync(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Object execute = MethodBuilderFactory.create(null, "getAdvertisingIdInfo").setStatic(Class.forName(sAdvertisingIdClientClassName)).addParam((Class<Class>) Context.class, (Class) context).execute();
            return new AdvertisingInfo(reflectedGetAdvertisingId(execute, null), reflectedIsLimitAdTrackingEnabled(execute, false));
        } catch (Exception unused) {
            MoPubLog.d("Unable to obtain Google AdvertisingIdClient.Info via reflection.");
            return null;
        }
    }

    private static void internalFetchAdvertisingInfoAsync(Context context, GpsHelperListener gpsHelperListener) {
        if (!Reflection.classFound(sAdvertisingIdClientClassName)) {
            if (gpsHelperListener != null) {
                gpsHelperListener.onFetchAdInfoCompleted();
                return;
            }
            return;
        }
        try {
            AsyncTasks.safeExecuteOnExecutor(new FetchAdvertisingInfoTask(context, gpsHelperListener), new Void[0]);
        } catch (Exception e) {
            MoPubLog.d("Error executing FetchAdvertisingInfoTask", e);
            if (gpsHelperListener != null) {
                gpsHelperListener.onFetchAdInfoCompleted();
            }
        }
    }

    private static class FetchAdvertisingInfoTask extends AsyncTask<Void, Void, Void> {
        private AdvertisingInfo info;
        private WeakReference<Context> mContextWeakReference;
        private WeakReference<GpsHelperListener> mGpsHelperListenerWeakReference;

        public FetchAdvertisingInfoTask(Context context, GpsHelperListener gpsHelperListener) {
            this.mContextWeakReference = new WeakReference<>(context);
            this.mGpsHelperListenerWeakReference = new WeakReference<>(gpsHelperListener);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            Context context;
            try {
                context = this.mContextWeakReference.get();
            } catch (Exception unused) {
                MoPubLog.d("Unable to obtain Google AdvertisingIdClient.Info via reflection.");
            }
            if (context == null) {
                return null;
            }
            MethodBuilderFactory.create(null, "getAdvertisingIdInfo").setStatic(Class.forName(GpsHelper.sAdvertisingIdClientClassName)).addParam((Class<Class>) Context.class, (Class) context).execute();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r1) {
            GpsHelperListener gpsHelperListener = this.mGpsHelperListenerWeakReference.get();
            if (gpsHelperListener != null) {
                gpsHelperListener.onFetchAdInfoCompleted();
            }
        }
    }

    static String reflectedGetAdvertisingId(Object obj, String str) {
        try {
            return (String) MethodBuilderFactory.create(obj, "getId").execute();
        } catch (Exception unused) {
            return str;
        }
    }

    static boolean reflectedIsLimitAdTrackingEnabled(Object obj, boolean z) {
        try {
            Boolean bool = (Boolean) MethodBuilderFactory.create(obj, IS_LIMIT_AD_TRACKING_ENABLED_KEY).execute();
            return bool != null ? bool.booleanValue() : z;
        } catch (Exception unused) {
            return z;
        }
    }

    @Deprecated
    public static void setClassNamesForTesting() {
        sPlayServicesUtilClassName = "java.lang.Class";
        sAdvertisingIdClientClassName = "java.lang.Class";
    }
}
