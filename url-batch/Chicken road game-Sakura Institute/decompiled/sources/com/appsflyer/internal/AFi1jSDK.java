package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1gSDK;
import com.appsflyer.internal.AFi1hSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFi1jSDK extends AFi1rSDK {
    private final AFd1sSDK AFInAppEventType;
    private final Runnable AFLogger;
    private String i;
    private final AFi1fSDK registerClient;
    private final ExecutorService valueOf;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFi1fSDK.values().length];
            iArr[AFi1fSDK.FACEBOOK.ordinal()] = 1;
            iArr[AFi1fSDK.INSTAGRAM.ordinal()] = 2;
            values = iArr;
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!AFInAppEventType(context)) {
            this.AFLogger.run();
        } else {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1jSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1jSDK.AFKeystoreWrapper(AFi1jSDK.this, context);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFInAppEventType(Context context) {
        if (!valueOf()) {
            AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by counter.");
            return false;
        }
        String AFInAppEventType = this.AFInAppEventType.AFInAppEventType("com.facebook.sdk.ApplicationId");
        String str = AFInAppEventType;
        String str2 = null;
        if (str == null || str.length() == 0) {
            AFLogger.afDebugLog("[MetaReferrer]: Facebook app id Manifest metadata is not found.");
            AFInAppEventType = null;
        }
        if (AFInAppEventType == null) {
            AFInAppEventType = this.AFInAppEventType.AFKeystoreWrapper("facebook_application_id");
            String str3 = AFInAppEventType;
            if (str3 == null || str3.length() == 0) {
                AFLogger.afDebugLog("[MetaReferrer]: Facebook app id string resource is not found.");
                AFInAppEventType = null;
            }
            if (AFInAppEventType == null) {
                AFInAppEventType = this.AFInAppEventType.AFInAppEventType("com.appsflyer.FacebookApplicationId");
                String str4 = AFInAppEventType;
                if (str4 == null || str4.length() == 0) {
                    AFLogger.afDebugLog("[MetaReferrer]: AF Facebook app id Manifest metadata is not found.");
                    AFInAppEventType = null;
                }
            }
        }
        str2 = AFInAppEventType;
        this.i = str2;
        if (str2 == null) {
            AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing Facebook app id.");
            return false;
        }
        if (AFInAppEventParameterName(context)) {
            return true;
        }
        AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing content providers.");
        return false;
    }

    private final boolean AFInAppEventParameterName(Context context) {
        int i = AFa1uSDK.values[this.registerClient.ordinal()];
        if (i == 1) {
            return AFKeystoreWrapper(context);
        }
        if (i == 2) {
            return valueOf(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean AFKeystoreWrapper(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean valueOf(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1jSDK(AFd1sSDK aFd1sSDK, ExecutorService executorService, AFi1fSDK aFi1fSDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFd1sSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFi1fSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFi1gSDK.AFa1vSDK.AFInAppEventType[aFi1fSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "instagram";
        }
        this.AFInAppEventType = aFd1sSDK;
        this.valueOf = executorService;
        this.registerClient = aFi1fSDK;
        this.AFLogger = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a0, code lost:
    
        if (r6 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0193, code lost:
    
        if (r6 != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AFKeystoreWrapper(AFi1jSDK aFi1jSDK, Context context) {
        ContentProviderClient contentProviderClient;
        Uri parse;
        Uri uri;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFi1jSDK.e = System.currentTimeMillis();
        aFi1jSDK.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
        aFi1jSDK.addObserver(new AFi1hSDK.AnonymousClass1());
        String str3 = aFi1jSDK.i;
        Intrinsics.checkNotNull(str3);
        Cursor cursor = null;
        cursor = null;
        try {
            int i = AFa1uSDK.values[aFi1jSDK.registerClient.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (valueOf(context)) {
                    AFLogger.afDebugLog("[MetaReferrer]: Found Instagram content provider");
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(String.valueOf(str3)));
                    uri = parse;
                } else {
                    AFLogger.afDebugLog("[MetaReferrer]: Instagram content provider not found");
                    uri = null;
                }
            } else if (AFKeystoreWrapper(context)) {
                AFLogger.afDebugLog("[MetaReferrer]: Found Facebook content provider");
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(String.valueOf(str3)));
                uri = parse;
            } else {
                AFLogger.afDebugLog("[MetaReferrer]: Facebook content provider noy found");
                uri = null;
            }
            if (uri != null) {
                contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor query = contentProviderClient != null ? contentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                int columnIndex = query.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    str = query.getString(columnIndex);
                                } else {
                                    AFLogger.afDebugLog(new StringBuilder("[MetaReferrer]: No such column, ").append(aFi1jSDK.registerClient).append(" provider").toString());
                                    str = null;
                                }
                                if (str != null) {
                                    AFLogger.afDebugLog(new StringBuilder("[MetaReferrer]: Collected ").append(aFi1jSDK.registerClient).append(" attribution data.").toString());
                                    Map<String, Object> map = aFi1jSDK.AFInAppEventParameterName;
                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                    map.put("response", "OK");
                                    Map<String, Object> map2 = aFi1jSDK.AFInAppEventParameterName;
                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                    map2.put("referrer", str);
                                    int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                    Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                    if (valueOf != null) {
                                        aFi1jSDK.AFInAppEventParameterName.put("click_ts", Long.valueOf(valueOf.longValue()));
                                    }
                                    int columnIndex3 = query.getColumnIndex("is_ct");
                                    Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                    if (valueOf2 != null) {
                                        aFi1jSDK.AFInAppEventParameterName.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                    }
                                    int i2 = AFa1uSDK.values[aFi1jSDK.registerClient.ordinal()];
                                    if (i2 == 1) {
                                        str2 = "com.facebook.katana";
                                    } else {
                                        if (i2 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        str2 = "com.instagram.android";
                                    }
                                    Map<String, Object> map3 = aFi1jSDK.AFInAppEventParameterName;
                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                    map3.put("api_ver", Long.valueOf(AFb1uSDK.values(context, str2)));
                                    Map<String, Object> map4 = aFi1jSDK.AFInAppEventParameterName;
                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                    map4.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, str2));
                                }
                                query.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            try {
                                AFLogger.afErrorLog("[MetaReferrer]: Error while collecting Meta Install Referrer", th);
                            } finally {
                                Cursor cursor2 = cursor;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClient != null) {
                                    contentProviderClient.close();
                                }
                            }
                        }
                    }
                    AFLogger.afDebugLog("[MetaReferrer]: Content provider returned no data");
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            contentProviderClient = null;
        }
        aFi1jSDK.values();
        aFi1jSDK.AFLogger.run();
    }
}
