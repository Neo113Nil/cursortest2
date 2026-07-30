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
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFj1ySDK extends AFi1cSDK {
    private final AFj1zSDK AFAdRevenueData;
    private final Runnable component2;
    private final AFc1oSDK getCurrencyIso4217Code;
    private final ExecutorService getMonetizationNetwork;
    private String hashCode;

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!AFAdRevenueData(context)) {
            this.component2.run();
        } else {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1ySDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1ySDK.getRevenue(AFj1ySDK.this, context);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r0 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        String removePrefix = currencyIso4217Code != null ? StringsKt.removePrefix(currencyIso4217Code, (CharSequence) "fb") : null;
        String str2 = removePrefix;
        if (str2 == null || str2.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            removePrefix = null;
        }
        if (removePrefix == null) {
            String revenue = this.getCurrencyIso4217Code.getRevenue("facebook_application_id");
            removePrefix = revenue != null ? StringsKt.removePrefix(revenue, (CharSequence) "fb") : null;
            String str3 = removePrefix;
            if (str3 == null || str3.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                removePrefix = null;
            }
            if (removePrefix == null) {
                String currencyIso4217Code2 = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                removePrefix = currencyIso4217Code2 != null ? StringsKt.removePrefix(currencyIso4217Code2, (CharSequence) "fb") : null;
                String str4 = removePrefix;
                if (str4 == null || str4.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    removePrefix = null;
                }
            }
        }
        str = removePrefix;
        this.hashCode = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getMediationNetwork(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private final boolean getMediationNetwork(Context context) {
        int i = AFa1vSDK.getRevenue[this.AFAdRevenueData.ordinal()];
        if (i == 1) {
            return getRevenue(context);
        }
        if (i == 2) {
            return getCurrencyIso4217Code(context);
        }
        if (i == 3) {
            return component3(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1ySDK(AFc1oSDK aFc1oSDK, ExecutorService executorService, AFj1zSDK aFj1zSDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFc1oSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.getMonetizationNetwork = executorService;
        this.AFAdRevenueData = aFj1zSDK;
        this.component2 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0262, code lost:
    
        if (r9 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024b, code lost:
    
        if (r9 != null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115 A[Catch: all -> 0x026e, TRY_LEAVE, TryCatch #4 {all -> 0x026e, blocks: (B:10:0x004c, B:12:0x0052, B:18:0x0115, B:85:0x0078, B:87:0x008d, B:88:0x0092, B:89:0x0093, B:91:0x0099, B:92:0x00be, B:93:0x00d2, B:95:0x00d8, B:96:0x00fd), top: B:5:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ac A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1ySDK aFj1ySDK, Context context) {
        String str;
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        int i;
        Uri parse;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1ySDK.component1 = System.currentTimeMillis();
        aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass1());
        String str4 = aFj1ySDK.hashCode;
        Intrinsics.checkNotNull(str4);
        try {
            i = AFa1vSDK.getRevenue[aFj1ySDK.AFAdRevenueData.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
        } catch (Throwable th2) {
            th = th2;
            str = "Error while collecting Meta Install Referrer for ";
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (component3(context)) {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str4);
                        if (parse == null) {
                            contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                            try {
                                Cursor query = contentProviderClient != null ? contentProviderClient.query(parse, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                                if (query != null) {
                                    try {
                                        if (query.moveToFirst()) {
                                            int columnIndex = query.getColumnIndex("install_referrer");
                                            if (columnIndex != -1) {
                                                str2 = query.getString(columnIndex);
                                            } else {
                                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.AFAdRevenueData + " provider", false, 4, null);
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.AFAdRevenueData + " attribution data.", false, 4, null);
                                                Map<String, Object> map = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map, "");
                                                map.put("response", "OK");
                                                Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                                map2.put("referrer", str2);
                                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                if (valueOf != null) {
                                                    aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                }
                                                int columnIndex3 = query.getColumnIndex("is_ct");
                                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                if (valueOf2 != null) {
                                                    aFj1ySDK.getMediationNetwork.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                }
                                                int i2 = AFa1vSDK.getRevenue[aFj1ySDK.AFAdRevenueData.ordinal()];
                                                if (i2 == 1) {
                                                    str3 = "com.facebook.katana";
                                                } else if (i2 == 2) {
                                                    str3 = "com.instagram.android";
                                                } else {
                                                    if (i2 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    str3 = "com.facebook.lite";
                                                }
                                                Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map3, "");
                                                map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str3)));
                                                Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
                                                Intrinsics.checkNotNullExpressionValue(map4, "");
                                                map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str3));
                                            }
                                            query.close();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = query;
                                        try {
                                            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.AFAdRevenueData.name() + " provider", th, false, false, false, false, 120, null);
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
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = null;
                                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.AFAdRevenueData.name() + " provider", th, false, false, false, false, 120, null);
                            }
                        }
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (getCurrencyIso4217Code(context)) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str4);
                    if (parse == null) {
                    }
                } else {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (getRevenue(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str4);
                if (parse == null) {
                }
            } else {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            contentProviderClient = null;
            cursor = null;
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.AFAdRevenueData.name() + " provider", th, false, false, false, false, 120, null);
        }
        aFj1ySDK.getMediationNetwork();
        aFj1ySDK.component2.run();
    }

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
}
