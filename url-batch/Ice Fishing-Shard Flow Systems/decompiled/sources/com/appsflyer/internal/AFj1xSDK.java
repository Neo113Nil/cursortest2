package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.appsflyer.internal.AFj1zSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFj1xSDK extends AFi1hSDK {
    private final Runnable component1;
    private final AFj1vSDK component3;
    private String equals;
    private final AFc1kSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;

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
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1vSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i2 = AFj1ySDK.AFa1ySDK.getMediationNetwork[aFj1vSDK.ordinal()];
        if (i2 == 1) {
            str = "facebook";
        } else if (i2 == 2) {
            str = "instagram";
        } else {
            if (i2 != 3) {
                throw new R5.k();
            }
            str = "facebook_lite";
        }
        this.getMediationNetwork = aFc1kSDK;
        this.getMonetizationNetwork = executorService;
        this.component3 = aFj1vSDK;
        this.component1 = runnable2;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component1(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
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
        String D7 = monetizationNetwork != null ? StringsKt.D(monetizationNetwork, "fb") : null;
        if (D7 == null || D7.length() == 0) {
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            D7 = null;
        }
        if (D7 == null) {
            String revenue = this.getMediationNetwork.getRevenue("facebook_application_id");
            D7 = revenue != null ? StringsKt.D(revenue, "fb") : null;
            if (D7 == null || D7.length() == 0) {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                D7 = null;
            }
            if (D7 == null) {
                String monetizationNetwork2 = this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.FacebookApplicationId");
                D7 = monetizationNetwork2 != null ? StringsKt.D(monetizationNetwork2, "fb") : null;
                if (D7 == null || D7.length() == 0) {
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    D7 = null;
                }
            }
        }
        str = D7;
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
        int i2 = AFa1vSDK.getCurrencyIso4217Code[this.component3.ordinal()];
        if (i2 == 1) {
            return AFAdRevenueData(context);
        }
        if (i2 == 2) {
            return getRevenue(context);
        }
        if (i2 == 3) {
            return component1(context);
        }
        throw new R5.k();
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getCurrencyIso4217Code(context)) {
            this.getMonetizationNetwork.execute(new g(this, 6, context));
        } else {
            this.component1.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0225, code lost:
    
        if (r25 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0210, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020e, code lost:
    
        if (r25 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0257, code lost:
    
        if (r25 == null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #4 {all -> 0x006b, blocks: (B:10:0x004c, B:12:0x0052, B:18:0x00e9, B:81:0x0072, B:83:0x0083, B:84:0x0088, B:85:0x0089, B:87:0x008f, B:88:0x00a7, B:89:0x00b7, B:91:0x00bd, B:92:0x00d5), top: B:5:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AFAdRevenueData(AFj1xSDK aFj1xSDK, Context context) {
        String str;
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClient;
        int[] iArr;
        int i2;
        Uri parse;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aFj1xSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1xSDK.areAllFieldsValid = System.currentTimeMillis();
        aFj1xSDK.component2 = AFj1zSDK.AFa1ySDK.STARTED;
        aFj1xSDK.addObserver(new AFj1zSDK.AnonymousClass3());
        String str4 = aFj1xSDK.equals;
        Intrinsics.b(str4);
        try {
            AFj1vSDK aFj1vSDK = aFj1xSDK.component3;
            iArr = AFa1vSDK.getCurrencyIso4217Code;
            i2 = iArr[aFj1vSDK.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
        } catch (Throwable th2) {
            th = th2;
            str = "Error while collecting Meta Install Referrer for ";
        }
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new R5.k();
                    }
                    if (component1(context)) {
                        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str4));
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
                                                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1xSDK.component3 + " provider", false, 4, null);
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1xSDK.component3 + " attribution data.", false, 4, null);
                                                Map<String, Object> map = aFj1xSDK.getCurrencyIso4217Code;
                                                Intrinsics.checkNotNullExpressionValue(map, "");
                                                map.put("response", "OK");
                                                Map<String, Object> map2 = aFj1xSDK.getCurrencyIso4217Code;
                                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                                map2.put("referrer", str2);
                                                int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                if (valueOf != null) {
                                                    aFj1xSDK.getCurrencyIso4217Code.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                }
                                                int columnIndex3 = query.getColumnIndex("is_ct");
                                                Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                if (valueOf2 != null) {
                                                    aFj1xSDK.getCurrencyIso4217Code.put("meta_custom", I.f(new Pair("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                }
                                                int i5 = iArr[aFj1xSDK.component3.ordinal()];
                                                if (i5 == 1) {
                                                    str3 = "com.facebook.katana";
                                                } else if (i5 == 2) {
                                                    str3 = "com.instagram.android";
                                                } else {
                                                    if (i5 != 3) {
                                                        throw new R5.k();
                                                    }
                                                    str3 = "com.facebook.lite";
                                                }
                                                Map<String, Object> map3 = aFj1xSDK.getCurrencyIso4217Code;
                                                Intrinsics.checkNotNullExpressionValue(map3, "");
                                                map3.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, str3)));
                                                Map<String, Object> map4 = aFj1xSDK.getCurrencyIso4217Code;
                                                Intrinsics.checkNotNullExpressionValue(map4, "");
                                                map4.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, str3));
                                            }
                                            query.close();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = query;
                                        try {
                                            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1xSDK.component3.name() + " provider", th, false, false, false, false, 120, null);
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (Throwable th4) {
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (contentProviderClient != null) {
                                                contentProviderClient.close();
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (query != null) {
                                    query.close();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                cursor = null;
                            }
                        }
                    } else {
                        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        parse = null;
                        if (parse == null) {
                        }
                    }
                } else if (getRevenue(context)) {
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str4));
                    if (parse == null) {
                    }
                } else {
                    AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (AFAdRevenueData(context)) {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str4));
                if (parse == null) {
                }
            } else {
                AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
            cursor = null;
            contentProviderClient = null;
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1xSDK.component3.name() + " provider", th, false, false, false, false, 120, null);
            if (cursor != null) {
            }
        }
        aFj1xSDK.getCurrencyIso4217Code();
        aFj1xSDK.component1.run();
    }
}
