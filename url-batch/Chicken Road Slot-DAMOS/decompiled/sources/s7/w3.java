package s7;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class w3 {

    /* renamed from: a, reason: collision with root package name */
    public static final b8.s f9091a;

    static {
        b8.d dVar = b8.g.f1423e;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        z4.w.j(24, objArr);
        f9091a = b8.g.k(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.j0 j0Var, b8.x xVar, b8.x xVar2, b8.a0 a0Var, char[] cArr, int i3, int i10, int i11, String str, String str2, String str3, boolean z10, boolean z11) {
        v3 v3Var;
        char c10;
        int c11 = c(j0Var);
        if (c11 > 0 && (i10 != 1 || i3 != 1)) {
            cArr[c11] = '2';
        }
        if (g(j0Var, xVar2) == com.google.android.gms.internal.measurement.k0.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            if (j0Var == com.google.android.gms.internal.measurement.j0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i11 == 1 && a0Var.f1413r.equals(str)) {
                if (c11 > 0 && cArr[c11] != '2') {
                    cArr[c11] = '1';
                }
                return true;
            }
            if (xVar.containsKey(j0Var) && (v3Var = (v3) xVar.get(j0Var)) != null) {
                int ordinal = v3Var.ordinal();
                com.google.android.gms.internal.measurement.k0 k0Var = com.google.android.gms.internal.measurement.k0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    com.google.android.gms.internal.measurement.k0 k0Var2 = com.google.android.gms.internal.measurement.k0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return g(j0Var, xVar2) == k0Var ? f(j0Var, cArr, str3, z11) : e(j0Var, cArr, str2, z10);
                        }
                        if (ordinal == 3) {
                            return g(j0Var, xVar2) == k0Var2 ? e(j0Var, cArr, str2, z10) : f(j0Var, cArr, str3, z11);
                        }
                    } else if (g(j0Var, xVar2) != k0Var2) {
                        return f(j0Var, cArr, str3, z11);
                    }
                } else if (g(j0Var, xVar2) != k0Var) {
                    return e(j0Var, cArr, str2, z10);
                }
                c10 = '8';
            }
            c10 = '0';
        }
        if (c11 <= 0 || cArr[c11] == '2') {
            return false;
        }
        cArr[c11] = c10;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.j0 j0Var) {
        if (j0Var == com.google.android.gms.internal.measurement.j0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (j0Var == com.google.android.gms.internal.measurement.j0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (j0Var == com.google.android.gms.internal.measurement.j0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return j0Var == com.google.android.gms.internal.measurement.j0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.j0 j0Var, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < j0Var.a()) ? "0" : String.valueOf(str.charAt(j0Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= j0Var.a()) {
            str3 = String.valueOf(str2.charAt(j0Var.a() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.j0 j0Var, char[] cArr, String str, boolean z10) {
        char c10;
        int c11 = c(j0Var);
        if (!z10) {
            c10 = '4';
        } else {
            if (str.length() >= j0Var.a()) {
                char charAt = str.charAt(j0Var.a() - 1);
                boolean z11 = charAt == '1';
                if (c11 > 0 && cArr[c11] != '2') {
                    cArr[c11] = charAt != '1' ? '6' : '1';
                }
                return z11;
            }
            c10 = '0';
        }
        if (c11 > 0 && cArr[c11] != '2') {
            cArr[c11] = c10;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.j0 j0Var, char[] cArr, String str, boolean z10) {
        char c10;
        int c11 = c(j0Var);
        if (!z10) {
            c10 = '5';
        } else {
            if (str.length() >= j0Var.a()) {
                char charAt = str.charAt(j0Var.a() - 1);
                boolean z11 = charAt == '1';
                if (c11 > 0 && cArr[c11] != '2') {
                    cArr[c11] = charAt != '1' ? '7' : '1';
                }
                return z11;
            }
            c10 = '0';
        }
        if (c11 > 0 && cArr[c11] != '2') {
            cArr[c11] = c10;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.k0 g(com.google.android.gms.internal.measurement.j0 j0Var, b8.x xVar) {
        Object obj = xVar.get(j0Var);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.k0.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (com.google.android.gms.internal.measurement.k0) obj;
    }
}
