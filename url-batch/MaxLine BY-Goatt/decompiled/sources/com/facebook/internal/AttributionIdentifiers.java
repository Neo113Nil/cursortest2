package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import defpackage.lh;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AttributionIdentifiers {
    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 3600000;
    private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    public static volatile AttributionIdentifiers cachedIdentifiers;
    private String androidAdvertiserIdValue;
    private String androidInstallerPackage;
    private String attributionId;
    private long fetchTime;
    private boolean isTrackingLimited;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = AttributionIdentifiers.class.getCanonicalName();

    public static final AttributionIdentifiers getAttributionIdentifiers(Context context) {
        return Companion.getAttributionIdentifiers(context);
    }

    public static final boolean isTrackingLimited(Context context) {
        return Companion.isTrackingLimited(context);
    }

    public final String getAndroidAdvertiserId() {
        if (FacebookSdk.isInitialized() && FacebookSdk.getAdvertiserIDCollectionEnabled()) {
            return this.androidAdvertiserIdValue;
        }
        return null;
    }

    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    public final String getAttributionId() {
        return this.attributionId;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class GoogleAdInfo implements IInterface {
        public static final Companion Companion = new Companion(null);
        private static final int FIRST_TRANSACTION_CODE = 1;
        private static final int SECOND_TRANSACTION_CODE = 2;
        private final IBinder binder;

        public GoogleAdInfo(IBinder iBinder) {
            iBinder.getClass();
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public final String getAdvertiserId() {
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            Parcel obtain2 = Parcel.obtain();
            obtain2.getClass();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean isTrackingLimited() {
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            Parcel obtain2 = Parcel.obtain();
            obtain2.getClass();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.binder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers attributionIdentifiers) {
            attributionIdentifiers.fetchTime = System.currentTimeMillis();
            AttributionIdentifiers.cachedIdentifiers = attributionIdentifiers;
            return attributionIdentifiers;
        }

        private final AttributionIdentifiers getAndroidId(Context context) {
            AttributionIdentifiers androidIdViaReflection = getAndroidIdViaReflection(context);
            if (androidIdViaReflection != null) {
                return androidIdViaReflection;
            }
            AttributionIdentifiers androidIdViaService = getAndroidIdViaService(context);
            return androidIdViaService == null ? new AttributionIdentifiers() : androidIdViaService;
        }

        private final AttributionIdentifiers getAndroidIdViaReflection(Context context) {
            Method methodQuietly;
            Object invokeMethodQuietly;
            try {
                if (!isGooglePlayServicesAvailable(context) || (methodQuietly = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class})) == null || (invokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context)) == null) {
                    return null;
                }
                Method methodQuietly2 = Utility.getMethodQuietly(invokeMethodQuietly.getClass(), "getId", (Class<?>[]) new Class[0]);
                Method methodQuietly3 = Utility.getMethodQuietly(invokeMethodQuietly.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                if (methodQuietly2 != null && methodQuietly3 != null) {
                    AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                    attributionIdentifiers.androidAdvertiserIdValue = (String) Utility.invokeMethodQuietly(invokeMethodQuietly, methodQuietly2, new Object[0]);
                    Boolean bool = (Boolean) Utility.invokeMethodQuietly(invokeMethodQuietly, methodQuietly3, new Object[0]);
                    attributionIdentifiers.isTrackingLimited = bool != null ? bool.booleanValue() : false;
                    return attributionIdentifiers;
                }
                return null;
            } catch (Exception e) {
                Utility.logd("android_id", e);
                return null;
            }
        }

        private final AttributionIdentifiers getAndroidIdViaService(Context context) {
            if (isGooglePlayServicesAvailable(context)) {
                GoogleAdServiceConnection googleAdServiceConnection = new GoogleAdServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    try {
                        if (context.bindService(intent, googleAdServiceConnection, 1)) {
                            GoogleAdInfo googleAdInfo = new GoogleAdInfo(googleAdServiceConnection.getBinder());
                            AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                            attributionIdentifiers.androidAdvertiserIdValue = googleAdInfo.getAdvertiserId();
                            attributionIdentifiers.isTrackingLimited = googleAdInfo.isTrackingLimited();
                            return attributionIdentifiers;
                        }
                    } catch (Exception e) {
                        Utility.logd("android_id", e);
                        return null;
                    } finally {
                        context.unbindService(googleAdServiceConnection);
                    }
                } catch (SecurityException unused) {
                }
            }
            return null;
        }

        private final String getInstallerPackageName(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final boolean isGooglePlayServicesAvailable(Context context) {
            Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
            if (methodQuietly == null) {
                return false;
            }
            Object invokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context);
            return (invokeMethodQuietly instanceof Integer) && invokeMethodQuietly.equals(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003c, B:13:0x0057, B:15:0x0062, B:17:0x007f, B:19:0x0085, B:21:0x008a, B:23:0x008f, B:48:0x006c, B:50:0x0077, B:52:0x00ec, B:53:0x00f3), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003c, B:13:0x0057, B:15:0x0062, B:17:0x007f, B:19:0x0085, B:21:0x008a, B:23:0x008f, B:48:0x006c, B:50:0x0077, B:52:0x00ec, B:53:0x00f3), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[Catch: all -> 0x0033, Exception -> 0x0037, TRY_LEAVE, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003c, B:13:0x0057, B:15:0x0062, B:17:0x007f, B:19:0x0085, B:21:0x008a, B:23:0x008f, B:48:0x006c, B:50:0x0077, B:52:0x00ec, B:53:0x00f3), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AttributionIdentifiers getAttributionIdentifiers(Context context) {
            Throwable th;
            Exception exc;
            Cursor cursor;
            Uri uri;
            Uri parse;
            String installerPackageName;
            context.getClass();
            AttributionIdentifiers androidId = getAndroidId(context);
            ?? r5 = 0;
            try {
                try {
                    if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
                        throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                    }
                    AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.cachedIdentifiers;
                    if (attributionIdentifiers != null && System.currentTimeMillis() - attributionIdentifiers.fetchTime < AttributionIdentifiers.IDENTIFIER_REFRESH_INTERVAL_MILLIS) {
                        return attributionIdentifiers;
                    }
                    String[] strArr = {AttributionIdentifiers.ATTRIBUTION_ID_COLUMN_NAME, AttributionIdentifiers.ANDROID_ID_COLUMN_NAME, AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME};
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, 0);
                    ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI, 0);
                    if (resolveContentProvider != null) {
                        String str = resolveContentProvider.packageName;
                        str.getClass();
                        if (FacebookSignatureValidator.validateSignature(context, str)) {
                            parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                            uri = parse;
                            installerPackageName = getInstallerPackageName(context);
                            if (installerPackageName != null) {
                                androidId.androidInstallerPackage = installerPackageName;
                            }
                            if (uri == null) {
                                return cacheAndReturnIdentifiers(androidId);
                            }
                            cursor = context.getContentResolver().query(uri, strArr, null, null, null);
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        int columnIndex = cursor.getColumnIndex(AttributionIdentifiers.ATTRIBUTION_ID_COLUMN_NAME);
                                        int columnIndex2 = cursor.getColumnIndex(AttributionIdentifiers.ANDROID_ID_COLUMN_NAME);
                                        int columnIndex3 = cursor.getColumnIndex(AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME);
                                        androidId.attributionId = cursor.getString(columnIndex);
                                        if (columnIndex2 > 0 && columnIndex3 > 0 && androidId.getAndroidAdvertiserId() == null) {
                                            androidId.androidAdvertiserIdValue = cursor.getString(columnIndex2);
                                            androidId.isTrackingLimited = Boolean.parseBoolean(cursor.getString(columnIndex3));
                                        }
                                        cursor.close();
                                        return cacheAndReturnIdentifiers(androidId);
                                    }
                                } catch (Exception e) {
                                    exc = e;
                                    Utility.logd(AttributionIdentifiers.TAG, "Caught unexpected exception in getAttributionId(): " + exc);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return null;
                                }
                            }
                            AttributionIdentifiers cacheAndReturnIdentifiers = cacheAndReturnIdentifiers(androidId);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return cacheAndReturnIdentifiers;
                        }
                    }
                    if (resolveContentProvider2 != null) {
                        String str2 = resolveContentProvider2.packageName;
                        str2.getClass();
                        if (FacebookSignatureValidator.validateSignature(context, str2)) {
                            parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = parse;
                            installerPackageName = getInstallerPackageName(context);
                            if (installerPackageName != null) {
                            }
                            if (uri == null) {
                            }
                        }
                    }
                    uri = null;
                    installerPackageName = getInstallerPackageName(context);
                    if (installerPackageName != null) {
                    }
                    if (uri == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r5 = context;
                    if (r5 != 0) {
                        throw th;
                    }
                    r5.close();
                    throw th;
                }
            } catch (Exception e2) {
                exc = e2;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                if (r5 != 0) {
                }
            }
        }

        public final boolean isTrackingLimited(Context context) {
            context.getClass();
            AttributionIdentifiers attributionIdentifiers = getAttributionIdentifiers(context);
            return attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited();
        }

        private Companion() {
        }

        public static /* synthetic */ void getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations() {
        }

        public static /* synthetic */ void getCachedIdentifiers$facebook_core_release$annotations() {
        }
    }

    public final boolean isTrackingLimited() {
        return this.isTrackingLimited;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class GoogleAdServiceConnection implements ServiceConnection {
        private final AtomicBoolean consumed = new AtomicBoolean(false);
        private final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        public final IBinder getBinder() {
            if (!this.consumed.compareAndSet(false, true)) {
                lh.g("Binder already consumed");
                return null;
            }
            IBinder take = this.queue.take();
            take.getClass();
            return take;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.queue.put(iBinder);
                } catch (InterruptedException e) {
                    Utility.logd(AttributionIdentifiers.TAG, "Service connection interrupted", e);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
