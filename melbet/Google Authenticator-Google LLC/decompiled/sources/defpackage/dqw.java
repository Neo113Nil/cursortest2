package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqw {
    public final String a;
    public final cvl b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public dqw(String str, cvl cvlVar, String str2, String str3, String str4, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null accountId");
        }
        this.a = str;
        if (cvlVar == null) {
            throw new NullPointerException("Null criticalAlertData");
        }
        this.b = cvlVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public static dqw a(String str, cvl cvlVar) {
        int i;
        String str2;
        String str3;
        String str4;
        hsf hsfVar;
        cvk cvkVar = cvlVar.i;
        if (cvkVar == null) {
            cvkVar = cvk.a;
        }
        int i2 = cvkVar.b;
        int i3 = 0;
        boolean z = true;
        char c = i2 != 0 ? i2 != 1 ? (char) 0 : (char) 3 : (char) 2;
        if (c == 0 || c != 3) {
            Log.e("OneGoogle", "Target type of Critical alert data is not of type Octarine.");
            return null;
        }
        String str5 = cvkVar.c;
        Charset charset = hse.a;
        str5.getClass();
        charset.getClass();
        int i4 = 0;
        while (i4 < str5.length() && ":/\\?#".indexOf(str5.charAt(i4)) < 0) {
            i4++;
        }
        if (i4 <= 0 || !str5.startsWith(":", i4)) {
            i = 0;
            str2 = null;
        } else {
            String substring = str5.substring(0, i4);
            i = i4 + 1;
            str2 = substring;
        }
        if (str5.startsWith("//", i)) {
            int i5 = i + 2;
            int i6 = i5;
            while (i6 < str5.length() && "/\\?#".indexOf(str5.charAt(i6)) < 0) {
                i6++;
            }
            str3 = str5.substring(i5, i6);
            i = i6;
        } else {
            str3 = null;
        }
        int i7 = i;
        while (i7 < str5.length() && "?#".indexOf(str5.charAt(i7)) < 0) {
            i7++;
        }
        String substring2 = i7 > i ? str5.substring(i, i7) : null;
        if (str5.startsWith("?", i7)) {
            int i8 = i7 + 1;
            while (i7 < str5.length() && str5.charAt(i7) != '#') {
                i7++;
            }
            str4 = str5.substring(i8, i7);
        } else {
            str4 = null;
        }
        String substring3 = str5.startsWith("#", i7) ? str5.substring(i7 + 1) : null;
        hsd hsdVar = ((str2 == null || str2.equals(hsd.a(str2))) && charset.equals(charset)) ? new hsd(str2, str3, substring2, str4, substring3, charset, str5) : new hsd(str2, str3, substring2, str4, substring3, charset);
        if (hsdVar.c == null) {
            String str6 = hsdVar.a;
            if (str6 == null) {
                hsfVar = hsf.a;
            } else {
                Charset charset2 = hsdVar.b;
                charset2.getClass();
                hsf hsfVar2 = new hsf(new hgu(12));
                if (!str6.isEmpty()) {
                    String name = charset2.name();
                    int length = name.length();
                    if ((length < 9 || !name.regionMatches(true, length - 9, "SHIFT_JIS", 0, 9)) && (length < 11 || !name.regionMatches(true, length - 11, "WINDOWS-31J", 0, 11))) {
                        z = false;
                    }
                    while (i3 <= str6.length()) {
                        int indexOf = str6.indexOf(38, i3);
                        if (indexOf == -1) {
                            indexOf = str6.length();
                        }
                        int indexOf2 = str6.indexOf(61, i3);
                        if (indexOf2 > indexOf) {
                            indexOf2 = -1;
                        }
                        hsfVar2.n(hsf.e(str6, i3, indexOf2 == -1 ? indexOf : indexOf2, charset2, z), indexOf2 == -1 ? "" : hsf.e(str6, indexOf2 + 1, indexOf, charset2, z));
                        i3 = indexOf + 1;
                    }
                }
                hsfVar = new hsf(new hia(hsfVar2.b));
            }
            hsdVar.c = hsfVar;
        }
        hsf hsfVar3 = hsdVar.c;
        String b = b(hsfVar3, "rfn");
        String b2 = b(hsfVar3, "rfnc");
        String b3 = b(hsfVar3, "eid");
        boolean equals = Objects.equals(b(hsfVar3, "msg_ctr"), "true");
        if ((b != null && b2 != null && b3 != null) || equals) {
            return new dqw(str, cvlVar, hoq.R(b), hoq.R(b2), hoq.R(b3), equals);
        }
        Log.e("OneGoogle", "Critical alert URL data is not valid.");
        return null;
    }

    private static String b(hsf hsfVar, String str) {
        List c = hsfVar.c(str);
        if (c.size() != 1) {
            return null;
        }
        return (String) c.get(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqw) {
            dqw dqwVar = (dqw) obj;
            if (this.a.equals(dqwVar.a) && this.b.equals(dqwVar.b) && this.c.equals(dqwVar.c) && this.d.equals(dqwVar.d) && this.e.equals(dqwVar.e) && this.f == dqwVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        return "ValidCriticalAlertData{accountId=" + this.a + ", criticalAlertData=" + this.b.toString() + ", rfn=" + this.c + ", rfnc=" + this.d + ", securityEventId=" + this.e + ", isMessageCenterEvent=" + this.f + "}";
    }

    public dqw() {
        throw null;
    }
}
