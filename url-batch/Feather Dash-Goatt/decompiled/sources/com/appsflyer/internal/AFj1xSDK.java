package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.appsflyer.internal.AFj1zSDK;
import defpackage.hk0;
import defpackage.ik0;
import defpackage.ip0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1xSDK extends AFi1hSDK {
    private final Runnable component1;
    private final AFj1vSDK component3;
    private String equals;
    private final AFc1kSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1vSDK.values().length];
            try {
                iArr[AFj1vSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1vSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1vSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1xSDK(AFc1kSDK aFc1kSDK, ExecutorService executorService, AFj1vSDK aFj1vSDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFc1kSDK, runnable);
        String str;
        aFc1kSDK.getClass();
        executorService.getClass();
        aFj1vSDK.getClass();
        runnable.getClass();
        runnable2.getClass();
        int i = AFj1ySDK.AFa1ySDK.getMediationNetwork[aFj1vSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                l.a();
                throw null;
            }
            str = "facebook_lite";
        }
        this.getMediationNetwork = aFc1kSDK;
        this.getMonetizationNetwork = executorService;
        this.component3 = aFj1vSDK;
        this.component1 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0232, code lost:
    
        if (r25 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x021d, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021b, code lost:
    
        if (r25 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #3 {all -> 0x0069, blocks: (B:3:0x0035, B:8:0x004a, B:10:0x0050, B:16:0x00e8, B:80:0x0071, B:82:0x0082, B:83:0x0087, B:84:0x0088, B:86:0x008e, B:87:0x00a6, B:88:0x00b6, B:90:0x00bc, B:91:0x00d4), top: B:2:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AFAdRevenueData(AFj1xSDK aFj1xSDK, Context context) {
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClient;
        int[] iArr;
        int i;
        Uri parse;
        String str;
        String str2;
        aFj1xSDK.getClass();
        context.getClass();
        aFj1xSDK.areAllFieldsValid = System.currentTimeMillis();
        aFj1xSDK.component2 = AFj1zSDK.AFa1ySDK.STARTED;
        aFj1xSDK.addObserver(new AFj1zSDK.AnonymousClass3());
        String str3 = aFj1xSDK.equals;
        str3.getClass();
        try {
            AFj1vSDK aFj1vSDK = aFj1xSDK.component3;
            iArr = AFa1vSDK.getCurrencyIso4217Code;
            i = iArr[aFj1vSDK.ordinal()];
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            contentProviderClient = null;
        }
        if (i == 1) {
            if (AFAdRevenueData(context)) {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
                if (parse == null) {
                }
                aFj1xSDK.getCurrencyIso4217Code();
                aFj1xSDK.component1.run();
            }
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1xSDK.getCurrencyIso4217Code();
            aFj1xSDK.component1.run();
        }
        if (i == 2) {
            if (getRevenue(context)) {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                if (parse == null) {
                }
                aFj1xSDK.getCurrencyIso4217Code();
                aFj1xSDK.component1.run();
            }
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1xSDK.getCurrencyIso4217Code();
            aFj1xSDK.component1.run();
        }
        if (i != 3) {
            throw new ip0();
        }
        if (!component1(context)) {
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1xSDK.getCurrencyIso4217Code();
            aFj1xSDK.component1.run();
        }
        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str3));
        if (parse == null) {
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
            try {
                Cursor query = acquireUnstableContentProviderClient != null ? acquireUnstableContentProviderClient.query(parse, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("install_referrer");
                            if (columnIndex != -1) {
                                str = query.getString(columnIndex);
                            } else {
                                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1xSDK.component3 + " provider", false, 4, null);
                                str = null;
                            }
                            if (str != null) {
                                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1xSDK.component3 + " attribution data.", false, 4, null);
                                Map<String, Object> map = aFj1xSDK.getCurrencyIso4217Code;
                                map.getClass();
                                map.put("response", "OK");
                                Map<String, Object> map2 = aFj1xSDK.getCurrencyIso4217Code;
                                map2.getClass();
                                map2.put("referrer", str);
                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                if (valueOf != null) {
                                    aFj1xSDK.getCurrencyIso4217Code.put("click_ts", Long.valueOf(valueOf.longValue()));
                                }
                                int columnIndex3 = query.getColumnIndex("is_ct");
                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                if (valueOf2 != null) {
                                    Pair[] pairArr = {new Pair("is_ct", Integer.valueOf(valueOf2.intValue()))};
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(hk0.a(1));
                                    ik0.d(linkedHashMap, pairArr);
                                    aFj1xSDK.getCurrencyIso4217Code.put("meta_custom", linkedHashMap);
                                }
                                int i2 = iArr[aFj1xSDK.component3.ordinal()];
                                if (i2 == 1) {
                                    str2 = "com.facebook.katana";
                                } else if (i2 == 2) {
                                    str2 = "com.instagram.android";
                                } else {
                                    if (i2 != 3) {
                                        throw new ip0();
                                    }
                                    str2 = "com.facebook.lite";
                                }
                                Map<String, Object> map3 = aFj1xSDK.getCurrencyIso4217Code;
                                map3.getClass();
                                map3.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, str2)));
                                Map<String, Object> map4 = aFj1xSDK.getCurrencyIso4217Code;
                                map4.getClass();
                                map4.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, str2));
                            }
                            query.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = query;
                        contentProviderClient = acquireUnstableContentProviderClient;
                        try {
                            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1xSDK.component3.name() + " provider", th, false, false, false, false, 120, null);
                            aFj1xSDK.getCurrencyIso4217Code();
                            aFj1xSDK.component1.run();
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (contentProviderClient != null) {
                                contentProviderClient.close();
                            }
                        }
                    }
                }
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th4) {
                th = th4;
                contentProviderClient = acquireUnstableContentProviderClient;
                cursor = null;
            }
        }
        aFj1xSDK.getCurrencyIso4217Code();
        aFj1xSDK.component1.run();
    }

    private static boolean component1(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getCurrencyIso4217Code(Context context) {
        if (!getMonetizationNetwork()) {
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String monetizationNetwork = this.getMediationNetwork.getMonetizationNetwork("com.facebook.sdk.ApplicationId");
        String str = null;
        String o = monetizationNetwork != null ? StringsKt.o(monetizationNetwork) : null;
        if (o == null || o.length() == 0) {
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            o = null;
        }
        if (o == null) {
            String revenue = this.getMediationNetwork.getRevenue("facebook_application_id");
            o = revenue != null ? StringsKt.o(revenue) : null;
            if (o == null || o.length() == 0) {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                o = null;
            }
            if (o == null) {
                String monetizationNetwork2 = this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.FacebookApplicationId");
                o = monetizationNetwork2 != null ? StringsKt.o(monetizationNetwork2) : null;
                if (o == null || o.length() == 0) {
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    o = null;
                }
            }
        }
        str = o;
        this.equals = str;
        if (str == null) {
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getMediationNetwork(context)) {
            return true;
        }
        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private final boolean getMediationNetwork(Context context) {
        int i = AFa1vSDK.getCurrencyIso4217Code[this.component3.ordinal()];
        if (i == 1) {
            return AFAdRevenueData(context);
        }
        if (i == 2) {
            return getRevenue(context);
        }
        if (i == 3) {
            return component1(context);
        }
        l.a();
        return false;
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        context.getClass();
        if (getCurrencyIso4217Code(context)) {
            this.getMonetizationNetwork.execute(new g(this, 6, context));
        } else {
            this.component1.run();
        }
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }
}
