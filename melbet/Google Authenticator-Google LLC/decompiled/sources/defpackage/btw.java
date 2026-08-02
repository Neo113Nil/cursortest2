package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btw {
    private static final hkh g = hkh.l("com/google/android/apps/authenticator2/main/DisplayedOtp");
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final bpc f;

    public btw(String str, String str2, boolean z, String str3, boolean z2, bpc bpcVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = bpcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static btw a(bpc bpcVar, boolean z) {
        boolean z2;
        String str;
        String str2;
        String C;
        String str3 = "_ _ _ _ _ _";
        try {
        } catch (cak e) {
            ((hkf) ((hkf) ((hkf) g.g()).h(e)).i("com/google/android/apps/authenticator2/main/DisplayedOtp", "create", '$', "DisplayedOtp.java")).s("Could not create a TOTP code from local database");
            z2 = true;
        }
        if (bpcVar.e.equals("hotp")) {
            if (z) {
                C = kt.C(bpcVar);
            }
            z2 = false;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 0) {
                str = str3.substring(0, str3.length() >> 1) + " " + str3.substring(str3.length() >> 1);
            } else {
                str = str3.substring(str3.length() >> 1) + " " + str3.substring(0, str3.length() >> 1);
            }
            String str4 = str;
            boolean equals = bpcVar.e.equals("hotp");
            str2 = bpcVar.g;
            if (str2 != null) {
                throw new NullPointerException("Null uniqueId");
            }
            String f = bpcVar.f();
            if (f == null) {
                throw new NullPointerException("Null name");
            }
            if (bpcVar != null) {
                return new btw(f, str4, equals, str2, z2, bpcVar);
            }
            throw new NullPointerException("Null otp");
        }
        C = kt.C(bpcVar);
        str3 = C;
        z2 = false;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 0) {
        }
        String str42 = str;
        boolean equals2 = bpcVar.e.equals("hotp");
        str2 = bpcVar.g;
        if (str2 != null) {
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btw) {
            btw btwVar = (btw) obj;
            if (this.a.equals(btwVar.a) && this.b.equals(btwVar.b) && this.c == btwVar.c && this.d.equals(btwVar.d) && this.e == btwVar.e && this.f.equals(btwVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        return "DisplayedOtp{name=" + this.a + ", code=" + this.b + ", isHotp=" + this.c + ", uniqueId=" + this.d + ", isOtpCorrupted=" + this.e + ", otp=" + String.valueOf(this.f) + "}";
    }

    public btw() {
        throw null;
    }
}
