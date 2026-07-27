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
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import y2.C1338m;
import z2.C1412P;

/* loaded from: classes.dex */
public final class AFi1jSDK extends AFi1rSDK {
    private final AFd1sSDK AFInAppEventType;
    private final Runnable AFLogger;

    /* renamed from: i, reason: collision with root package name */
    private String f5961i;
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
        int i2 = AFi1gSDK.AFa1vSDK.AFInAppEventType[aFi1fSDK.ordinal()];
        if (i2 == 1) {
            str = "facebook";
        } else {
            if (i2 != 2) {
                throw new C1338m();
            }
            str = "instagram";
        }
        this.AFInAppEventType = aFd1sSDK;
        this.valueOf = executorService;
        this.registerClient = aFi1fSDK;
        this.AFLogger = runnable2;
    }

    private final boolean AFInAppEventParameterName(Context context) {
        int i2 = AFa1uSDK.values[this.registerClient.ordinal()];
        if (i2 == 1) {
            return AFKeystoreWrapper(context);
        }
        if (i2 == 2) {
            return valueOf(context);
        }
        throw new C1338m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
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
        String str = null;
        if (AFInAppEventType == null || AFInAppEventType.length() == 0) {
            AFLogger.afDebugLog("[MetaReferrer]: Facebook app id Manifest metadata is not found.");
            AFInAppEventType = null;
        }
        if (AFInAppEventType == null) {
            AFInAppEventType = this.AFInAppEventType.AFKeystoreWrapper("facebook_application_id");
            if (AFInAppEventType == null || AFInAppEventType.length() == 0) {
                AFLogger.afDebugLog("[MetaReferrer]: Facebook app id string resource is not found.");
                AFInAppEventType = null;
            }
            if (AFInAppEventType == null) {
                AFInAppEventType = this.AFInAppEventType.AFInAppEventType("com.appsflyer.FacebookApplicationId");
                if (AFInAppEventType == null || AFInAppEventType.length() == 0) {
                    AFLogger.afDebugLog("[MetaReferrer]: AF Facebook app id Manifest metadata is not found.");
                    AFInAppEventType = null;
                }
            }
        }
        str = AFInAppEventType;
        this.f5961i = str;
        if (str == null) {
            AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing Facebook app id.");
            return false;
        }
        if (AFInAppEventParameterName(context)) {
            return true;
        }
        AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing content providers.");
        return false;
    }

    private static boolean AFKeystoreWrapper(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean valueOf(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFInAppEventType(context)) {
            this.valueOf.execute(new g(this, 2, context));
        } else {
            this.AFLogger.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0199, code lost:
    
        if (r6 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x018b, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0189, code lost:
    
        if (r6 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a6, code lost:
    
        if (r6 != null) goto L62;
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
        aFi1jSDK.f5960e = System.currentTimeMillis();
        aFi1jSDK.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
        aFi1jSDK.addObserver(new AFi1hSDK.AnonymousClass1());
        String str3 = aFi1jSDK.f5961i;
        Intrinsics.c(str3);
        Cursor cursor = null;
        cursor = null;
        try {
            AFi1fSDK aFi1fSDK = aFi1jSDK.registerClient;
            int[] iArr = AFa1uSDK.values;
            int i2 = iArr[aFi1fSDK.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new C1338m();
                }
                if (valueOf(context)) {
                    AFLogger.afDebugLog("[MetaReferrer]: Found Instagram content provider");
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                    uri = parse;
                } else {
                    AFLogger.afDebugLog("[MetaReferrer]: Instagram content provider not found");
                    uri = null;
                }
            } else if (AFKeystoreWrapper(context)) {
                AFLogger.afDebugLog("[MetaReferrer]: Found Facebook content provider");
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
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
                                    StringBuilder sb = new StringBuilder("[MetaReferrer]: No such column, ");
                                    sb.append(aFi1jSDK.registerClient);
                                    sb.append(" provider");
                                    AFLogger.afDebugLog(sb.toString());
                                    str = null;
                                }
                                if (str != null) {
                                    StringBuilder sb2 = new StringBuilder("[MetaReferrer]: Collected ");
                                    sb2.append(aFi1jSDK.registerClient);
                                    sb2.append(" attribution data.");
                                    AFLogger.afDebugLog(sb2.toString());
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
                                        aFi1jSDK.AFInAppEventParameterName.put("meta_custom", C1412P.f(new Pair("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                    }
                                    int i4 = iArr[aFi1jSDK.registerClient.ordinal()];
                                    if (i4 == 1) {
                                        str2 = "com.facebook.katana";
                                    } else {
                                        if (i4 != 2) {
                                            throw new C1338m();
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
                                if (cursor != null) {
                                    cursor.close();
                                }
                            } catch (Throwable th2) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClient != null) {
                                    contentProviderClient.close();
                                }
                                throw th2;
                            }
                        }
                    }
                    AFLogger.afDebugLog("[MetaReferrer]: Content provider returned no data");
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            contentProviderClient = null;
        }
        aFi1jSDK.values();
        aFi1jSDK.AFLogger.run();
    }
}
