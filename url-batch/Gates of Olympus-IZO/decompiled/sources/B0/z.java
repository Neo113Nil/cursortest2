package B0;

import H2.AbstractC0080b;
import a.AbstractC0157a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final y f394a;

    /* renamed from: b, reason: collision with root package name */
    public final j f395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f396c;

    /* renamed from: d, reason: collision with root package name */
    public final float f397d;

    /* renamed from: e, reason: collision with root package name */
    public final float f398e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f399f;

    public z(y yVar, j jVar, long j3) {
        this.f394a = yVar;
        this.f395b = jVar;
        this.f396c = j3;
        ArrayList arrayList = jVar.f275h;
        float f3 = 0.0f;
        this.f397d = arrayList.isEmpty() ? 0.0f : ((l) arrayList.get(0)).f278a.f243d.c(0);
        if (!arrayList.isEmpty()) {
            l lVar = (l) M1.l.s0(arrayList);
            f3 = lVar.f278a.f243d.c(r4.f430f - 1) + lVar.f283f;
        }
        this.f398e = f3;
        this.f399f = jVar.f274g;
    }

    public final int a(int i3) {
        j jVar = this.f395b;
        int length = ((C0007d) jVar.f268a.f193b).f251a.length();
        ArrayList arrayList = jVar.f275h;
        l lVar = (l) arrayList.get(i3 >= length ? M1.m.b0(arrayList) : i3 < 0 ? 0 : AbstractC0157a.A(i3, arrayList));
        return lVar.f278a.f243d.f429e.getLineForOffset(lVar.a(i3)) + lVar.f281d;
    }

    public final int b(float f3) {
        ArrayList arrayList = this.f395b.f275h;
        int i3 = 0;
        if (f3 > 0.0f) {
            if (f3 < ((l) M1.l.s0(arrayList)).f284g) {
                int size = arrayList.size() - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > size) {
                        i3 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + size) >>> 1;
                    l lVar = (l) arrayList.get(i5);
                    char c3 = lVar.f283f > f3 ? (char) 1 : lVar.f284g <= f3 ? (char) 65535 : (char) 0;
                    if (c3 >= 0) {
                        if (c3 <= 0) {
                            i3 = i5;
                            break;
                        }
                        size = i5 - 1;
                    } else {
                        i4 = i5 + 1;
                    }
                }
            } else {
                i3 = M1.m.b0(arrayList);
            }
        }
        l lVar2 = (l) arrayList.get(i3);
        int i6 = lVar2.f280c - lVar2.f279b;
        int i7 = lVar2.f281d;
        if (i6 == 0) {
            return i7;
        }
        float f4 = f3 - lVar2.f283f;
        C0.C c4 = lVar2.f278a.f243d;
        return i7 + c4.f429e.getLineForVertical(((int) f4) - c4.f431g);
    }

    public final int c(int i3) {
        j jVar = this.f395b;
        jVar.b(i3);
        ArrayList arrayList = jVar.f275h;
        l lVar = (l) arrayList.get(AbstractC0157a.B(i3, arrayList));
        C0004a c0004a = lVar.f278a;
        return c0004a.f243d.f429e.getLineStart(i3 - lVar.f281d) + lVar.f279b;
    }

    public final float d(int i3) {
        j jVar = this.f395b;
        jVar.b(i3);
        ArrayList arrayList = jVar.f275h;
        l lVar = (l) arrayList.get(AbstractC0157a.B(i3, arrayList));
        C0004a c0004a = lVar.f278a;
        return c0004a.f243d.f(i3 - lVar.f281d) + lVar.f283f;
    }

    public final int e(int i3) {
        j jVar = this.f395b;
        A2.w wVar = jVar.f268a;
        if (i3 < 0 || i3 > ((C0007d) wVar.f193b).f251a.length()) {
            StringBuilder l3 = AbstractC0080b.l("offset(", i3, ") is out of bounds [0, ");
            l3.append(((C0007d) wVar.f193b).f251a.length());
            l3.append(']');
            throw new IllegalArgumentException(l3.toString().toString());
        }
        int length = ((C0007d) jVar.f268a.f193b).f251a.length();
        ArrayList arrayList = jVar.f275h;
        l lVar = (l) arrayList.get(i3 == length ? M1.m.b0(arrayList) : AbstractC0157a.A(i3, arrayList));
        C0004a c0004a = lVar.f278a;
        int a3 = lVar.a(i3);
        C0.C c3 = c0004a.f243d;
        return c3.f429e.getParagraphDirection(c3.f429e.getLineForOffset(a3)) == 1 ? 1 : 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Z1.i.a(this.f394a, zVar.f394a) && this.f395b.equals(zVar.f395b) && M0.i.a(this.f396c, zVar.f396c) && this.f397d == zVar.f397d && this.f398e == zVar.f398e && Z1.i.a(this.f399f, zVar.f399f);
    }

    public final int hashCode() {
        return this.f399f.hashCode() + AbstractC0080b.a(this.f398e, AbstractC0080b.a(this.f397d, AbstractC0080b.d((this.f395b.hashCode() + (this.f394a.hashCode() * 31)) * 31, 31, this.f396c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f394a + ", multiParagraph=" + this.f395b + ", size=" + ((Object) M0.i.d(this.f396c)) + ", firstBaseline=" + this.f397d + ", lastBaseline=" + this.f398e + ", placeholderRects=" + this.f399f + ')';
    }
}
