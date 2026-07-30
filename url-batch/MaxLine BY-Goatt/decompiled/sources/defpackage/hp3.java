package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class hp3 {
    public static final i82 a;

    static {
        g11 g11Var = k11.n;
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
        yk3.t(24, objArr);
        a = k11.f(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, BuildConfig.FLAVOR);
        } catch (ClassCastException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final boolean b(xl3 xl3Var, n82 n82Var, n82 n82Var2, nl2 nl2Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        gp3 gp3Var;
        char c;
        int c2 = c(xl3Var);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(xl3Var, n82Var2) == yl3.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (xl3Var == xl3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && nl2Var.p.equals(str)) {
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = '1';
                }
                return true;
            }
            if (n82Var.containsKey(xl3Var) && (gp3Var = (gp3) n82Var.get(xl3Var)) != null) {
                int ordinal = gp3Var.ordinal();
                yl3 yl3Var = yl3.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    yl3 yl3Var2 = yl3.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return g(xl3Var, n82Var2) == yl3Var ? f(xl3Var, cArr, str3, z2) : e(xl3Var, cArr, str2, z);
                        }
                        if (ordinal == 3) {
                            return g(xl3Var, n82Var2) == yl3Var2 ? e(xl3Var, cArr, str2, z) : f(xl3Var, cArr, str3, z2);
                        }
                    } else if (g(xl3Var, n82Var2) != yl3Var2) {
                        return f(xl3Var, cArr, str3, z2);
                    }
                } else if (g(xl3Var, n82Var2) != yl3Var) {
                    return e(xl3Var, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 <= 0 || cArr[c2] == '2') {
            return false;
        }
        cArr[c2] = c;
        return false;
    }

    public static final int c(xl3 xl3Var) {
        if (xl3Var == xl3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (xl3Var == xl3.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (xl3Var == xl3.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return xl3Var == xl3.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(xl3 xl3Var, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        String valueOf = (isEmpty || str.length() < xl3Var.zza()) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : String.valueOf(str.charAt(xl3Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= xl3Var.zza()) {
            str3 = String.valueOf(str2.charAt(xl3Var.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean e(xl3 xl3Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(xl3Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= xl3Var.zza()) {
                char charAt = str.charAt(xl3Var.zza() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(xl3 xl3Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(xl3Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= xl3Var.zza()) {
                char charAt = str.charAt(xl3Var.zza() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final yl3 g(xl3 xl3Var, n82 n82Var) {
        Object obj = n82Var.get(xl3Var);
        if (obj == null) {
            obj = yl3.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (yl3) obj;
    }
}
