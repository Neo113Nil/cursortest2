package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.AFj1xSDK;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;
import com.ironsource.ms;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFj1zSDK extends AFi1dSDK {
    private final Runnable component3;
    private final AFj1ySDK getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;
    private String hashCode;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFj1ySDK.values().length];
            try {
                iArr[AFj1ySDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1ySDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1ySDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1zSDK(AFc1pSDK aFc1pSDK, ExecutorService executorService, AFj1ySDK aFj1ySDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFc1pSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i4 = AFj1xSDK.AFa1ySDK.getMonetizationNetwork[aFj1ySDK.ordinal()];
        if (i4 == 1) {
            str = "facebook";
        } else if (i4 == 2) {
            str = "instagram";
        } else {
            if (i4 != 3) {
                throw new W1.m();
            }
            str = "facebook_lite";
        }
        this.getMediationNetwork = aFc1pSDK;
        this.getMonetizationNetwork = executorService;
        this.getCurrencyIso4217Code = aFj1ySDK;
        this.component3 = runnable2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        String v02 = currencyIso4217Code != null ? StringsKt.v0(currencyIso4217Code, "fb") : null;
        if (v02 == null || v02.length() == 0) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            v02 = null;
        }
        if (v02 == null) {
            String revenue = this.getMediationNetwork.getRevenue("facebook_application_id");
            v02 = revenue != null ? StringsKt.v0(revenue, "fb") : null;
            if (v02 == null || v02.length() == 0) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                v02 = null;
            }
            if (v02 == null) {
                String currencyIso4217Code2 = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                v02 = currencyIso4217Code2 != null ? StringsKt.v0(currencyIso4217Code2, "fb") : null;
                if (v02 == null || v02.length() == 0) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    v02 = null;
                }
            }
        }
        str = v02;
        this.hashCode = str;
        if (str == null) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i4 = AFa1vSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i4 == 1) {
            return getMediationNetwork(context);
        }
        if (i4 == 2) {
            return getMonetizationNetwork(context);
        }
        if (i4 == 3) {
            return component2(context);
        }
        throw new W1.m();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.T
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1zSDK.getMonetizationNetwork(AFj1zSDK.this, context);
                }
            });
        } else {
            this.component3.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0247, code lost:
    
        if (r20 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0232, code lost:
    
        r20.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0230, code lost:
    
        if (r20 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0279, code lost:
    
        if (r20 == null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0104 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:3:0x002b, B:7:0x003e, B:9:0x0044, B:15:0x0104, B:82:0x0072, B:84:0x0084, B:85:0x0089, B:86:0x008a, B:88:0x0090, B:89:0x00b5, B:90:0x00c5, B:92:0x00cb, B:93:0x00f0), top: B:2:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMonetizationNetwork(AFj1zSDK aFj1zSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        Cursor cursor2;
        Uri parse;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1zSDK.component1 = System.currentTimeMillis();
        aFj1zSDK.component4 = AFj1qSDK.AFa1ySDK.STARTED;
        aFj1zSDK.addObserver(new AFj1qSDK.AnonymousClass5());
        String str3 = aFj1zSDK.hashCode;
        Intrinsics.checkNotNull(str3);
        try {
            AFj1ySDK aFj1ySDK = aFj1zSDK.getCurrencyIso4217Code;
            int[] iArr = AFa1vSDK.getMonetizationNetwork;
            int i4 = iArr[aFj1ySDK.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new W1.m();
                    }
                    if (component2(context)) {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str3);
                        if (parse == null) {
                            contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                            try {
                                Cursor query = contentProviderClient != null ? contentProviderClient.query(parse, new String[]{ReferrerDetails.KEY_INSTALL_REFERRER, "is_ct", "actual_timestamp"}, null, null, null) : null;
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            int columnIndex = query.getColumnIndex(ReferrerDetails.KEY_INSTALL_REFERRER);
                                            if (columnIndex != -1) {
                                                str = query.getString(columnIndex);
                                            } else {
                                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1zSDK.getCurrencyIso4217Code + " provider", false, 4, null);
                                                str = null;
                                            }
                                            if (str != null) {
                                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1zSDK.getCurrencyIso4217Code + " attribution data.", false, 4, null);
                                                Map<String, Object> map = aFj1zSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map, "");
                                                map.put(ms.f18193n, "OK");
                                                Map<String, Object> map2 = aFj1zSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                                map2.put("referrer", str);
                                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                if (valueOf != null) {
                                                    aFj1zSDK.AFAdRevenueData.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                }
                                                int columnIndex3 = query.getColumnIndex("is_ct");
                                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                if (valueOf2 != null) {
                                                    aFj1zSDK.AFAdRevenueData.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                }
                                                int i5 = iArr[aFj1zSDK.getCurrencyIso4217Code.ordinal()];
                                                if (i5 == 1) {
                                                    str2 = "com.facebook.katana";
                                                } else if (i5 == 2) {
                                                    str2 = "com.instagram.android";
                                                } else {
                                                    if (i5 != 3) {
                                                        throw new W1.m();
                                                    }
                                                    str2 = "com.facebook.lite";
                                                }
                                                Map<String, Object> map3 = aFj1zSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map3, "");
                                                map3.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, str2)));
                                                Map<String, Object> map4 = aFj1zSDK.AFAdRevenueData;
                                                Intrinsics.checkNotNullExpressionValue(map4, "");
                                                map4.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, str2));
                                            }
                                            query.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = query;
                                        try {
                                            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1zSDK.getCurrencyIso4217Code.name() + " provider", th, false, false, false, false, 120, null);
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            Cursor cursor3 = cursor;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (contentProviderClient != null) {
                                                contentProviderClient.close();
                                            }
                                            throw th3;
                                        }
                                    }
                                }
                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = null;
                                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1zSDK.getCurrencyIso4217Code.name() + " provider", th, false, false, false, false, 120, null);
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                            }
                        }
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (getMonetizationNetwork(context)) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str3);
                    if (parse == null) {
                    }
                } else {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (getMediationNetwork(context)) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str3);
                if (parse == null) {
                }
            } else {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClient = null;
        }
        aFj1zSDK.getMediationNetwork();
        aFj1zSDK.component3.run();
    }
}
