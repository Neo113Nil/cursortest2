package defpackage;

import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jz0 {
    public String a;
    public String d;
    public final ArrayList f;
    public ArrayList g;
    public String h;
    public String b = BuildConfig.FLAVOR;
    public String c = BuildConfig.FLAVOR;
    public int e = -1;

    public jz0() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add(BuildConfig.FLAVOR);
    }

    public final kz0 a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            lh.g("scheme == null");
            return null;
        }
        String q = u30.q(this.b, 0, 0, 7);
        String q2 = u30.q(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            lh.g("host == null");
            return null;
        }
        int b = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(rv.l(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(u30.q((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(rv.l(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? u30.q(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new kz0(str, q, q2, str2, b, arrayList3, arrayList, str4 != null ? u30.q(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (Intrinsics.b(str, "http")) {
            return 80;
        }
        return Intrinsics.b(str, TournamentShareDialogURIBuilder.scheme) ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x01f8, code lost:
    
        if (r9 < 65536) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r12 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kz0 kz0Var, String str) {
        int i;
        int i2;
        int e;
        int i3;
        char charAt;
        byte[] bArr = n33.a;
        int k = n33.k(str, 0, str.length());
        int l = n33.l(str, k, str.length());
        char c = 65535;
        if (l - k >= 2) {
            char charAt2 = str.charAt(k);
            if ((Intrinsics.c(charAt2, 97) >= 0 && Intrinsics.c(charAt2, 122) <= 0) || (Intrinsics.c(charAt2, 65) >= 0 && Intrinsics.c(charAt2, 90) <= 0)) {
                i = k + 1;
                while (true) {
                    if (i >= l) {
                        break;
                    }
                    char charAt3 = str.charAt(i);
                    if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i++;
                    }
                }
            }
        }
        i = -1;
        int i4 = 1;
        if (i != -1) {
            if (tp2.n(str, "https:", k, true)) {
                this.a = TournamentShareDialogURIBuilder.scheme;
                k += 6;
            } else {
                if (!tp2.n(str, "http:", k, true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.a = "http";
                k += 5;
            }
        } else {
            if (kz0Var == null) {
                lh.e("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? wp2.M(6, str).concat("...") : str));
                return;
            }
            this.a = kz0Var.a;
        }
        int i5 = k;
        int i6 = 0;
        while (true) {
            i2 = i4;
            if (i5 >= l || !((charAt = str.charAt(i5)) == '\\' || charAt == '/')) {
                break;
            }
            i6++;
            i5++;
            i4 = i2;
        }
        ArrayList arrayList = this.f;
        char c2 = '#';
        if (i6 >= 2 || kz0Var == null || !Intrinsics.b(kz0Var.a, this.a)) {
            int i7 = k + i6;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                e = n33.e(str, i7, l, "@/\\?#");
                char charAt4 = e != l ? str.charAt(e) : c;
                if (charAt4 == c || charAt4 == c2 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (i8 == 0) {
                        int d = n33.d(str, ':', i7, e);
                        String g = u30.g(str, i7, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (i9 != 0) {
                            g = this.b + "%40" + g;
                        }
                        this.b = g;
                        if (d != e) {
                            this.c = u30.g(str, d + 1, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                            i8 = i2;
                        }
                        i9 = i2;
                    } else {
                        this.c += "%40" + u30.g(str, i7, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                    }
                    i7 = e + 1;
                    c = 65535;
                    c2 = '#';
                }
            }
            int i10 = i7;
            while (true) {
                if (i10 >= e) {
                    i10 = e;
                    break;
                }
                char charAt5 = str.charAt(i10);
                if (charAt5 == '[') {
                    do {
                        i10++;
                        if (i10 >= e) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                } else if (charAt5 == ':') {
                    break;
                }
                i10++;
            }
            int i11 = i10 + 1;
            if (i11 < e) {
                this.d = tk3.h0(u30.q(str, i7, i10, 4));
                try {
                    i3 = Integer.parseInt(u30.g(str, i11, e, BuildConfig.FLAVOR, 248));
                    if (i2 <= i3) {
                    }
                } catch (NumberFormatException unused) {
                }
                i3 = -1;
                this.e = i3;
                if (i3 == -1) {
                    ey.h(str.substring(i11, e), "Invalid URL port: \"");
                    return;
                }
            } else {
                this.d = tk3.h0(u30.q(str, i7, i10, 4));
                String str2 = this.a;
                str2.getClass();
                this.e = str2.equals("http") ? 80 : str2.equals(TournamentShareDialogURIBuilder.scheme) ? 443 : -1;
            }
            if (this.d == null) {
                ey.h(str.substring(i7, i10), "Invalid URL host: \"");
                return;
            }
            k = e;
        } else {
            this.b = kz0Var.e();
            this.c = kz0Var.a();
            this.d = kz0Var.d;
            this.e = kz0Var.e;
            arrayList.clear();
            arrayList.addAll(kz0Var.c());
            if (k == l || str.charAt(k) == '#') {
                String d2 = kz0Var.d();
                this.g = d2 != null ? u30.s(u30.g(d2, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int e2 = n33.e(str, k, l, "?#");
        if (k != e2) {
            char charAt6 = str.charAt(k);
            if (charAt6 == '/' || charAt6 == '\\') {
                arrayList.clear();
                arrayList.add(BuildConfig.FLAVOR);
                k++;
            } else {
                arrayList.set(arrayList.size() - 1, BuildConfig.FLAVOR);
            }
            while (k < e2) {
                int e3 = n33.e(str, k, e2, "/\\");
                boolean z = e3 < e2;
                String g2 = u30.g(str, k, e3, " \"<>^`{}|/\\?#", 240);
                if (!g2.equals(".") && !g2.equalsIgnoreCase("%2e")) {
                    if (!g2.equals("..") && !g2.equalsIgnoreCase("%2e.") && !g2.equalsIgnoreCase(".%2e") && !g2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, g2);
                        } else {
                            arrayList.add(g2);
                        }
                        if (z) {
                            arrayList.add(BuildConfig.FLAVOR);
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add(BuildConfig.FLAVOR);
                    } else {
                        arrayList.set(arrayList.size() - 1, BuildConfig.FLAVOR);
                    }
                }
                k = z ? e3 + 1 : e3;
            }
        }
        if (e2 < l && str.charAt(e2) == '?') {
            int d3 = n33.d(str, '#', e2, l);
            this.g = u30.s(u30.g(str, e2 + 1, d3, " \"'<>#", 208));
            e2 = d3;
        }
        if (e2 >= l || str.charAt(e2) != '#') {
            return;
        }
        this.h = u30.g(str, e2 + 1, l, BuildConfig.FLAVOR, 176);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (up2.p(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int b = b();
            String str3 = this.a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals(TournamentShareDialogURIBuilder.scheme)) {
                    i = 443;
                }
            }
            sb.append(':');
            sb.append(b);
        }
        ArrayList arrayList = this.f;
        arrayList.getClass();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            u30.t(arrayList2, sb);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
