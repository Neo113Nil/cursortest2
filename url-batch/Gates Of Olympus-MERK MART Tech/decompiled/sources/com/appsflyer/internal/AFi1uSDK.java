package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1pSDK;
import com.appsflyer.internal.AFi1wSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFi1uSDK extends AFi1zSDK {
    private final ExecutorService AFKeystoreWrapper;
    private final Runnable d;
    private final AFi1ySDK e;
    private String force;
    private final AFd1pSDK valueOf;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFi1ySDK.values().length];
            iArr[AFi1ySDK.FACEBOOK.ordinal()] = 1;
            iArr[AFi1ySDK.INSTAGRAM.ordinal()] = 2;
            AFInAppEventType = iArr;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void AFInAppEventType(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!AFKeystoreWrapper(context)) {
            this.d.run();
        } else {
            this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1uSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1uSDK.AFInAppEventType(AFi1uSDK.this, context);
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
    private final boolean AFKeystoreWrapper(Context context) {
        if (!AFInAppEventParameterName()) {
            AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by counter.");
            return false;
        }
        String AFInAppEventParameterName = this.valueOf.AFInAppEventParameterName("com.facebook.sdk.ApplicationId");
        String str = AFInAppEventParameterName;
        String str2 = null;
        if (str == null || str.length() == 0) {
            AFLogger.afDebugLog("[MetaReferrer]: Facebook app id Manifest metadata is not found.");
            AFInAppEventParameterName = null;
        }
        if (AFInAppEventParameterName == null) {
            AFInAppEventParameterName = this.valueOf.valueOf("facebook_application_id");
            String str3 = AFInAppEventParameterName;
            if (str3 == null || str3.length() == 0) {
                AFLogger.afDebugLog("[MetaReferrer]: Facebook app id string resource is not found.");
                AFInAppEventParameterName = null;
            }
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = this.valueOf.AFInAppEventParameterName("com.appsflyer.FacebookApplicationId");
                String str4 = AFInAppEventParameterName;
                if (str4 == null || str4.length() == 0) {
                    AFLogger.afDebugLog("[MetaReferrer]: AF Facebook app id Manifest metadata is not found.");
                    AFInAppEventParameterName = null;
                }
            }
        }
        str2 = AFInAppEventParameterName;
        this.force = str2;
        if (str2 == null) {
            AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing Facebook app id.");
            return false;
        }
        if (valueOf(context)) {
            return true;
        }
        AFLogger.afDebugLog("[MetaReferrer]: Referrer collection disallowed by missing content providers.");
        return false;
    }

    private final boolean valueOf(Context context) {
        int i = AFa1uSDK.AFInAppEventType[this.e.ordinal()];
        if (i == 1) {
            return values(context);
        }
        if (i == 2) {
            return AFInAppEventParameterName(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean values(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1uSDK(AFd1pSDK aFd1pSDK, ExecutorService executorService, AFi1ySDK aFi1ySDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFd1pSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFi1ySDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFi1wSDK.AFa1vSDK.AFInAppEventParameterName[aFi1ySDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "instagram";
        }
        this.valueOf = aFd1pSDK;
        this.AFKeystoreWrapper = executorService;
        this.e = aFi1ySDK;
        this.d = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019f, code lost:
    
        if (r11 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0192, code lost:
    
        if (r11 != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AFInAppEventType(AFi1uSDK aFi1uSDK, Context context) {
        ContentProviderClient contentProviderClient;
        Uri parse;
        Uri uri;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(aFi1uSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFi1uSDK.AFLogger = System.currentTimeMillis();
        aFi1uSDK.registerClient = AFi1pSDK.AFa1tSDK.STARTED;
        aFi1uSDK.addObserver(new AFi1pSDK.AnonymousClass2());
        String str3 = aFi1uSDK.force;
        Intrinsics.checkNotNull(str3);
        Cursor cursor = null;
        cursor = null;
        try {
            int i = AFa1uSDK.AFInAppEventType[aFi1uSDK.e.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (AFInAppEventParameterName(context)) {
                    AFLogger.afDebugLog("[MetaReferrer]: Found Instagram content provider");
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(String.valueOf(str3)));
                    uri = parse;
                } else {
                    AFLogger.afDebugLog("[MetaReferrer]: Instagram content provider not found");
                    uri = null;
                }
            } else if (values(context)) {
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
                                    AFLogger.afDebugLog(new StringBuilder("[MetaReferrer]: No such column, ").append(aFi1uSDK.e).append(" provider").toString());
                                    str = null;
                                }
                                if (str != null) {
                                    AFLogger.afDebugLog(new StringBuilder("[MetaReferrer]: Collected ").append(aFi1uSDK.e).append(" attribution data.").toString());
                                    Map<String, Object> map = aFi1uSDK.values;
                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                    map.put("response", "OK");
                                    Map<String, Object> map2 = aFi1uSDK.values;
                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                    map2.put("referrer", str);
                                    int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                    Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                    if (valueOf != null) {
                                        aFi1uSDK.values.put("click_ts", Long.valueOf(valueOf.longValue()));
                                    }
                                    int columnIndex3 = query.getColumnIndex("is_ct");
                                    Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                    if (valueOf2 != null) {
                                        aFi1uSDK.values.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                    }
                                    int i2 = AFa1uSDK.AFInAppEventType[aFi1uSDK.e.ordinal()];
                                    if (i2 == 1) {
                                        str2 = "com.facebook.katana";
                                    } else {
                                        if (i2 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        str2 = "com.instagram.android";
                                    }
                                    Map<String, Object> map3 = aFi1uSDK.values;
                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                    map3.put("api_ver", Long.valueOf(AFb1rSDK.AFKeystoreWrapper(context, str2)));
                                    Map<String, Object> map4 = aFi1uSDK.values;
                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                    map4.put("api_ver_name", AFb1rSDK.AFInAppEventType(context, str2));
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
        aFi1uSDK.AFKeystoreWrapper();
        aFi1uSDK.d.run();
    }
}
