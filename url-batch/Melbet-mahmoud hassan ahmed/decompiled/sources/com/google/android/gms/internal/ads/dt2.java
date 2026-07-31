package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dt2 {
    public static cv a(Throwable th) {
        if (th instanceof e52) {
            e52 e52Var = (e52) th;
            return c(e52Var.a(), e52Var.b());
        }
        if (th instanceof fz1) {
            return th.getMessage() == null ? d(((fz1) th).a(), null, null) : d(((fz1) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof a3.e0)) {
            return d(1, null, null);
        }
        a3.e0 e0Var = (a3.e0) th;
        return new cv(e0Var.a(), b53.c(e0Var.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static cv b(Throwable th, f52 f52Var) {
        cv cvVar;
        cv a7 = a(th);
        int i7 = a7.f3954f;
        if ((i7 == 3 || i7 == 0) && (cvVar = a7.f3957i) != null && !cvVar.f3956h.equals("com.google.android.gms.ads")) {
            a7.f3957i = null;
        }
        if (((Boolean) sw.c().b(m10.f8191e6)).booleanValue() && f52Var != null) {
            a7.f3958j = f52Var.a();
        }
        return a7;
    }

    public static cv c(int i7, cv cvVar) {
        if (i7 == 0) {
            throw null;
        }
        if (i7 == 8) {
            if (((Integer) sw.c().b(m10.f8167b6)).intValue() > 0) {
                return cvVar;
            }
            i7 = 8;
        }
        return d(i7, null, cvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cv d(int i7, String str, cv cvVar) {
        String str2;
        String str3;
        if (str == null) {
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            switch (i8) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    str2 = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case c4.w0.f2149o /* 7 */:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case c4.w0.f2150p /* 8 */:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) sw.c().b(m10.f8199f6)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    str2 = "No fill.";
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
            int i9 = i7 - 1;
            if (i7 != 0) {
                throw null;
            }
            int i10 = 0;
            switch (i9) {
                case 0:
                case 11:
                case 15:
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case 1:
                case 5:
                case 6:
                case 9:
                case 16:
                    i10 = 1;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case 2:
                case 10:
                case 18:
                    i10 = 3;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case 3:
                    i10 = 8;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case 4:
                case c4.w0.f2150p /* 8 */:
                case 17:
                    i10 = 2;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case c4.w0.f2149o /* 7 */:
                    i10 = 4;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case 12:
                    if (((Integer) sw.c().b(m10.f8199f6)).intValue() <= 0) {
                        i10 = 9;
                        return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                    }
                    i10 = 3;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case 13:
                    i10 = 10;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                case 14:
                    i10 = 11;
                    return new cv(i10, str2, "com.google.android.gms.ads", cvVar, null);
                default:
                    switch (i7) {
                        case 1:
                            str3 = "INTERNAL_ERROR";
                            break;
                        case 2:
                            str3 = "INVALID_REQUEST";
                            break;
                        case 3:
                            str3 = "NO_FILL";
                            break;
                        case 4:
                            str3 = "APP_ID_MISSING";
                            break;
                        case 5:
                            str3 = "NETWORK_ERROR";
                            break;
                        case 6:
                            str3 = "INVALID_AD_UNIT_ID";
                            break;
                        case c4.w0.f2149o /* 7 */:
                            str3 = "INVALID_AD_SIZE";
                            break;
                        case c4.w0.f2150p /* 8 */:
                            str3 = "MEDIATION_SHOW_ERROR";
                            break;
                        case 9:
                            str3 = "NOT_READY";
                            break;
                        case 10:
                            str3 = "AD_REUSED";
                            break;
                        case 11:
                            str3 = "APP_NOT_FOREGROUND";
                            break;
                        case 12:
                            str3 = "INTERNAL_SHOW_ERROR";
                            break;
                        case 13:
                            str3 = "MEDIATION_NO_FILL";
                            break;
                        case 14:
                            str3 = "REQUEST_ID_MISMATCH";
                            break;
                        case 15:
                            str3 = "INVALID_AD_STRING";
                            break;
                        case 16:
                            str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                            break;
                        case 17:
                            str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                            break;
                        case 18:
                            str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                            break;
                        default:
                            str3 = "AD_INSPECTOR_ALREADY_OPEN";
                            break;
                    }
                    throw new AssertionError("Unknown SdkError: ".concat(str3));
            }
        }
        str2 = str;
        int i92 = i7 - 1;
        if (i7 != 0) {
        }
    }
}
