package e1;

import W.u;
import java.util.regex.Pattern;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8418c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f8419d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final u f8420a = new u();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f8421b = new StringBuilder();

    public static String a(u uVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i4 = uVar.f3352b;
        int i5 = uVar.f3353c;
        while (i4 < i5 && !z) {
            char c4 = (char) uVar.f3351a[i4];
            if ((c4 < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                z = true;
            } else {
                i4++;
                sb.append(c4);
            }
        }
        uVar.N(i4 - uVar.f3352b);
        return sb.toString();
    }

    public static String b(u uVar, StringBuilder sb) {
        c(uVar);
        if (uVar.a() == 0) {
            return null;
        }
        String a3 = a(uVar, sb);
        if (!a3.isEmpty()) {
            return a3;
        }
        return "" + ((char) uVar.z());
    }

    public static void c(u uVar) {
        while (true) {
            for (boolean z = true; uVar.a() > 0 && z; z = false) {
                int i4 = uVar.f3352b;
                byte[] bArr = uVar.f3351a;
                byte b4 = bArr[i4];
                char c4 = (char) b4;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    uVar.N(1);
                } else {
                    int i5 = uVar.f3353c;
                    int i6 = i4 + 2;
                    if (i6 <= i5) {
                        int i7 = i4 + 1;
                        if (b4 == 47 && bArr[i7] == 42) {
                            while (true) {
                                int i8 = i6 + 1;
                                if (i8 >= i5) {
                                    break;
                                }
                                if (((char) bArr[i6]) == '*' && ((char) bArr[i8]) == '/') {
                                    i6 += 2;
                                    i5 = i6;
                                } else {
                                    i6 = i8;
                                }
                            }
                            uVar.N(i5 - uVar.f3352b);
                        }
                    }
                }
            }
            return;
        }
    }
}
