package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.AFj1tSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.p0;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFj1ySDK extends AFi1cSDK {
    private final AFc1oSDK AFAdRevenueData;
    private final Runnable component2;
    private String equals;
    private final ExecutorService getCurrencyIso4217Code;
    private final AFj1zSDK getMonetizationNetwork;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.values().length];
            try {
                iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1ySDK(AFc1oSDK aFc1oSDK, ExecutorService executorService, AFj1zSDK aFj1zSDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFc1oSDK, runnable);
        String str;
        aFc1oSDK.getClass();
        executorService.getClass();
        aFj1zSDK.getClass();
        runnable.getClass();
        runnable2.getClass();
        int i3 = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i3 == 1) {
            str = "facebook";
        } else if (i3 == 2) {
            str = "instagram";
        } else {
            if (i3 != 3) {
                a2.r.p();
                throw null;
            }
            str = "facebook_lite";
        }
        this.AFAdRevenueData = aFc1oSDK;
        this.getCurrencyIso4217Code = executorService;
        this.getMonetizationNetwork = aFj1zSDK;
        this.component2 = runnable2;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i3 = AFa1vSDK.getRevenue[this.getMonetizationNetwork.ordinal()];
        if (i3 == 1) {
            return getMediationNetwork(context);
        }
        if (i3 == 2) {
            return AFAdRevenueData(context);
        }
        if (i3 == 3) {
            return component3(context);
        }
        a2.r.p();
        return false;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x022a, code lost:
    
        if (r25 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0215, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0213, code lost:
    
        if (r25 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #3 {all -> 0x0069, blocks: (B:3:0x0035, B:8:0x004a, B:10:0x0050, B:16:0x00e8, B:80:0x0071, B:82:0x0082, B:83:0x0087, B:84:0x0088, B:86:0x008e, B:87:0x00a6, B:88:0x00b6, B:90:0x00bc, B:91:0x00d4), top: B:2:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMonetizationNetwork(AFj1ySDK aFj1ySDK, Context context) {
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClient;
        int[] iArr;
        int i3;
        Uri parse;
        String str;
        String str2;
        aFj1ySDK.getClass();
        context.getClass();
        aFj1ySDK.component1 = System.currentTimeMillis();
        aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass1());
        String str3 = aFj1ySDK.equals;
        str3.getClass();
        try {
            AFj1zSDK aFj1zSDK = aFj1ySDK.getMonetizationNetwork;
            iArr = AFa1vSDK.getRevenue;
            i3 = iArr[aFj1zSDK.ordinal()];
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            contentProviderClient = null;
        }
        if (i3 == 1) {
            if (getMediationNetwork(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
                if (parse == null) {
                }
                aFj1ySDK.getMediationNetwork();
                aFj1ySDK.component2.run();
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1ySDK.getMediationNetwork();
            aFj1ySDK.component2.run();
        }
        if (i3 == 2) {
            if (AFAdRevenueData(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                if (parse == null) {
                }
                aFj1ySDK.getMediationNetwork();
                aFj1ySDK.component2.run();
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1ySDK.getMediationNetwork();
            aFj1ySDK.component2.run();
        }
        if (i3 != 3) {
            throw new hd.j();
        }
        if (!component3(context)) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
            parse = null;
            if (parse == null) {
            }
            aFj1ySDK.getMediationNetwork();
            aFj1ySDK.component2.run();
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
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
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.getMonetizationNetwork + " provider", false, 4, null);
                                str = null;
                            }
                            if (str != null) {
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.getMonetizationNetwork + " attribution data.", false, 4, null);
                                Map<String, Object> map = aFj1ySDK.getMediationNetwork;
                                map.getClass();
                                map.put("response", "OK");
                                Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
                                map2.getClass();
                                map2.put("referrer", str);
                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                if (valueOf != null) {
                                    aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(valueOf.longValue()));
                                }
                                int columnIndex3 = query.getColumnIndex("is_ct");
                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                if (valueOf2 != null) {
                                    aFj1ySDK.getMediationNetwork.put("meta_custom", p0.e(new Pair("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                }
                                int i10 = iArr[aFj1ySDK.getMonetizationNetwork.ordinal()];
                                if (i10 == 1) {
                                    str2 = "com.facebook.katana";
                                } else if (i10 == 2) {
                                    str2 = "com.instagram.android";
                                } else {
                                    if (i10 != 3) {
                                        throw new hd.j();
                                    }
                                    str2 = "com.facebook.lite";
                                }
                                Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
                                map3.getClass();
                                map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str2)));
                                Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
                                map4.getClass();
                                map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str2));
                            }
                            query.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = query;
                        contentProviderClient = acquireUnstableContentProviderClient;
                        try {
                            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1ySDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
                            aFj1ySDK.getMediationNetwork();
                            aFj1ySDK.component2.run();
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
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th4) {
                th = th4;
                contentProviderClient = acquireUnstableContentProviderClient;
                cursor = null;
            }
        }
        aFj1ySDK.getMediationNetwork();
        aFj1ySDK.component2.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        String u2 = currencyIso4217Code != null ? StringsKt.u(currencyIso4217Code) : null;
        if (u2 == null || u2.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            u2 = null;
        }
        if (u2 == null) {
            String revenue = this.AFAdRevenueData.getRevenue("facebook_application_id");
            u2 = revenue != null ? StringsKt.u(revenue) : null;
            if (u2 == null || u2.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                u2 = null;
            }
            if (u2 == null) {
                String currencyIso4217Code2 = this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                u2 = currencyIso4217Code2 != null ? StringsKt.u(currencyIso4217Code2) : null;
                if (u2 == null || u2.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    u2 = null;
                }
            }
        }
        str = u2;
        this.equals = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        context.getClass();
        if (!getRevenue(context)) {
            this.component2.run();
        } else {
            this.getCurrencyIso4217Code.execute(new g(5, this, context));
        }
    }
}
