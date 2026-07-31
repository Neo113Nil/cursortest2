package g2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f2941a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2942b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2943c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2944d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2945e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2946f;

    public f0(e0 e0Var, l lVar, long j7) {
        this.f2941a = e0Var;
        this.f2942b = lVar;
        this.f2943c = j7;
        ArrayList arrayList = (ArrayList) lVar.f2975e;
        float f6 = 0.0f;
        this.f2944d = arrayList.isEmpty() ? 0.0f : ((o) arrayList.get(0)).f2983a.f2897d.c(0);
        if (!arrayList.isEmpty()) {
            o oVar = (o) d6.m.X(arrayList);
            f6 = oVar.f2983a.f2897d.c(r4.f3108f - 1) + oVar.f2988f;
        }
        this.f2945e = f6;
        this.f2946f = (ArrayList) lVar.f2974d;
    }

    public final int a(int i) {
        l lVar = this.f2942b;
        ArrayList arrayList = (ArrayList) lVar.f2975e;
        o oVar = (o) arrayList.get(i >= ((e) ((n) lVar.f2973c).f2979b).f2928e.length() ? s6.a.t(arrayList) : i < 0 ? 0 : a0.c(i, arrayList));
        return oVar.f2983a.f2897d.f3107e.getLineForOffset(oVar.a(i)) + oVar.f2986d;
    }

    public final int b(float f6) {
        ArrayList arrayList = (ArrayList) this.f2942b.f2975e;
        int i = 0;
        if (f6 > 0.0f) {
            if (f6 < ((o) d6.m.X(arrayList)).f2989g) {
                int size = arrayList.size() - 1;
                int i8 = 0;
                while (true) {
                    if (i8 > size) {
                        i = -(i8 + 1);
                        break;
                    }
                    int i9 = (i8 + size) >>> 1;
                    o oVar = (o) arrayList.get(i9);
                    char c8 = oVar.f2988f > f6 ? (char) 1 : oVar.f2989g <= f6 ? (char) 65535 : (char) 0;
                    if (c8 >= 0) {
                        if (c8 <= 0) {
                            i = i9;
                            break;
                        }
                        size = i9 - 1;
                    } else {
                        i8 = i9 + 1;
                    }
                }
            } else {
                i = s6.a.t(arrayList);
            }
        }
        o oVar2 = (o) arrayList.get(i);
        int i10 = oVar2.f2985c;
        int i11 = oVar2.f2986d;
        if (i10 - oVar2.f2984b == 0) {
            return i11;
        }
        a aVar = oVar2.f2983a;
        float f8 = f6 - oVar2.f2988f;
        h2.j jVar = aVar.f2897d;
        return jVar.f3107e.getLineForVertical(((int) f8) - jVar.f3109g) + i11;
    }

    public final int c(int i) {
        l lVar = this.f2942b;
        lVar.b(i);
        ArrayList arrayList = (ArrayList) lVar.f2975e;
        o oVar = (o) arrayList.get(a0.d(i, arrayList));
        a aVar = oVar.f2983a;
        return aVar.f2897d.f3107e.getLineStart(i - oVar.f2986d) + oVar.f2984b;
    }

    public final float d(int i) {
        l lVar = this.f2942b;
        lVar.b(i);
        ArrayList arrayList = (ArrayList) lVar.f2975e;
        o oVar = (o) arrayList.get(a0.d(i, arrayList));
        a aVar = oVar.f2983a;
        return aVar.f2897d.f(i - oVar.f2986d) + oVar.f2988f;
    }

    public final q2.j e(int i) {
        l lVar = this.f2942b;
        ArrayList arrayList = (ArrayList) lVar.f2975e;
        n nVar = (n) lVar.f2973c;
        boolean z3 = false;
        if (i >= 0 && i <= ((e) nVar.f2979b).f2928e.length()) {
            z3 = true;
        }
        if (!z3) {
            StringBuilder l3 = a0.q.l("offset(", i, ") is out of bounds [0, ");
            l3.append(((e) nVar.f2979b).f2928e.length());
            l3.append(']');
            l2.a.a(l3.toString());
        }
        o oVar = (o) arrayList.get(i == ((e) ((n) lVar.f2973c).f2979b).f2928e.length() ? s6.a.t(arrayList) : a0.c(i, arrayList));
        a aVar = oVar.f2983a;
        int a8 = oVar.a(i);
        h2.j jVar = aVar.f2897d;
        return jVar.f3107e.getParagraphDirection(jVar.f3107e.getLineForOffset(a8)) == 1 ? q2.j.f6052d : q2.j.f6053e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return q6.i.a(this.f2941a, f0Var.f2941a) && this.f2942b.equals(f0Var.f2942b) && r2.k.a(this.f2943c, f0Var.f2943c) && this.f2944d == f0Var.f2944d && this.f2945e == f0Var.f2945e && q6.i.a(this.f2946f, f0Var.f2946f);
    }

    public final int hashCode() {
        return this.f2946f.hashCode() + a0.q.a(this.f2945e, a0.q.a(this.f2944d, a0.q.c((this.f2942b.hashCode() + (this.f2941a.hashCode() * 31)) * 31, 31, this.f2943c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f2941a + ", multiParagraph=" + this.f2942b + ", size=" + ((Object) r2.k.b(this.f2943c)) + ", firstBaseline=" + this.f2944d + ", lastBaseline=" + this.f2945e + ", placeholderRects=" + this.f2946f + ')';
    }
}
