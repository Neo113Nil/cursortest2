package m0;

import E.AbstractC0005f;
import W.J;
import a.AbstractC0124a;
import java.util.regex.Pattern;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14340d;

    public C1288a(String str, int i4, int i5, int i6) {
        this.f14337a = i4;
        this.f14338b = str;
        this.f14339c = i5;
        this.f14340d = i6;
    }

    public static C1288a a(String str) {
        String str2 = J.f3263a;
        String[] split = str.split(" ", 2);
        AbstractC0124a.h(split.length == 2);
        String str3 = split[0];
        Pattern pattern = z.f14477a;
        try {
            int parseInt = Integer.parseInt(str3);
            int i4 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            AbstractC0124a.h(split2.length >= 2);
            String str4 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str4);
                if (split2.length == 3) {
                    String str5 = split2[2];
                    try {
                        i4 = Integer.parseInt(str5);
                    } catch (NumberFormatException e4) {
                        throw T.G.b(str5, e4);
                    }
                }
                return new C1288a(split2[0], parseInt, parseInt2, i4);
            } catch (NumberFormatException e5) {
                throw T.G.b(str4, e5);
            }
        } catch (NumberFormatException e6) {
            throw T.G.b(str3, e6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1288a.class == obj.getClass()) {
            C1288a c1288a = (C1288a) obj;
            if (this.f14337a == c1288a.f14337a && this.f14338b.equals(c1288a.f14338b) && this.f14339c == c1288a.f14339c && this.f14340d == c1288a.f14340d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0005f.f((217 + this.f14337a) * 31, 31, this.f14338b) + this.f14339c) * 31) + this.f14340d;
    }
}
