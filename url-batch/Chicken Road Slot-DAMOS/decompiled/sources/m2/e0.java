package m2;

import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f6457a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.m f6458b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6459c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6460d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6461e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6462f;

    public e0(d0 d0Var, b1.m mVar, long j) {
        this.f6457a = d0Var;
        this.f6458b = mVar;
        this.f6459c = j;
        ArrayList arrayList = (ArrayList) mVar.f1011e;
        float f3 = 0.0f;
        this.f6460d = arrayList.isEmpty() ? 0.0f : ((m) arrayList.get(0)).f6492a.f6419d.c(0);
        if (!arrayList.isEmpty()) {
            m mVar2 = (m) CollectionsKt.C(arrayList);
            f3 = mVar2.f6492a.f6419d.c(r4.f7012f - 1) + mVar2.f6497f;
        }
        this.f6461e = f3;
        this.f6462f = (ArrayList) mVar.f1010d;
    }

    public final int a(int i3) {
        b1.m mVar = this.f6458b;
        ArrayList arrayList = (ArrayList) mVar.f1011e;
        m mVar2 = (m) arrayList.get(i3 >= ((e) ((se) mVar.f1009c).f2798d).f6454e.length() ? kotlin.collections.y.e(arrayList) : i3 < 0 ? 0 : z.c(i3, arrayList));
        return mVar2.f6492a.f6419d.f7011e.getLineForOffset(mVar2.a(i3)) + mVar2.f6495d;
    }

    public final int b(float f3) {
        ArrayList arrayList = (ArrayList) this.f6458b.f1011e;
        int i3 = 0;
        if (f3 > 0.0f) {
            if (f3 < ((m) CollectionsKt.C(arrayList)).g) {
                int size = arrayList.size() - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > size) {
                        i3 = -(i10 + 1);
                        break;
                    }
                    int i11 = (i10 + size) >>> 1;
                    m mVar = (m) arrayList.get(i11);
                    char c10 = mVar.f6497f > f3 ? (char) 1 : mVar.g <= f3 ? (char) 65535 : (char) 0;
                    if (c10 >= 0) {
                        if (c10 <= 0) {
                            i3 = i11;
                            break;
                        }
                        size = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
            } else {
                i3 = arrayList.size() - 1;
            }
        }
        m mVar2 = (m) arrayList.get(i3);
        int i12 = mVar2.f6494c;
        int i13 = mVar2.f6495d;
        if (i12 - mVar2.f6493b == 0) {
            return i13;
        }
        a aVar = mVar2.f6492a;
        float f10 = f3 - mVar2.f6497f;
        n2.h hVar = aVar.f6419d;
        return hVar.f7011e.getLineForVertical(((int) f10) - hVar.g) + i13;
    }

    public final int c(int i3) {
        b1.m mVar = this.f6458b;
        mVar.h(i3);
        ArrayList arrayList = (ArrayList) mVar.f1011e;
        m mVar2 = (m) arrayList.get(z.d(i3, arrayList));
        a aVar = mVar2.f6492a;
        return aVar.f6419d.f7011e.getLineStart(i3 - mVar2.f6495d) + mVar2.f6493b;
    }

    public final float d(int i3) {
        b1.m mVar = this.f6458b;
        mVar.h(i3);
        ArrayList arrayList = (ArrayList) mVar.f1011e;
        m mVar2 = (m) arrayList.get(z.d(i3, arrayList));
        a aVar = mVar2.f6492a;
        return aVar.f6419d.f(i3 - mVar2.f6495d) + mVar2.f6497f;
    }

    public final w2.j e(int i3) {
        b1.m mVar = this.f6458b;
        e eVar = (e) ((se) mVar.f1009c).f2798d;
        if (i3 < 0 || i3 > eVar.f6454e.length()) {
            StringBuilder i10 = n0.l.i(i3, "offset(", ") is out of bounds [0, ");
            i10.append(eVar.f6454e.length());
            i10.append(']');
            r2.a.a(i10.toString());
        }
        int length = ((e) ((se) mVar.f1009c).f2798d).f6454e.length();
        ArrayList arrayList = (ArrayList) mVar.f1011e;
        m mVar2 = (m) arrayList.get(i3 == length ? kotlin.collections.y.e(arrayList) : z.c(i3, arrayList));
        a aVar = mVar2.f6492a;
        int a9 = mVar2.a(i3);
        n2.h hVar = aVar.f6419d;
        return hVar.f7011e.getParagraphDirection(hVar.f7011e.getLineForOffset(a9)) == 1 ? w2.j.f10040d : w2.j.f10041e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.a(this.f6457a, e0Var.f6457a) && this.f6458b.equals(e0Var.f6458b) && x2.k.a(this.f6459c, e0Var.f6459c) && this.f6460d == e0Var.f6460d && this.f6461e == e0Var.f6461e && Intrinsics.a(this.f6462f, e0Var.f6462f);
    }

    public final int hashCode() {
        return this.f6462f.hashCode() + n0.l.b(this.f6461e, n0.l.b(this.f6460d, n0.l.c((this.f6458b.hashCode() + (this.f6457a.hashCode() * 31)) * 31, 31, this.f6459c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f6457a + ", multiParagraph=" + this.f6458b + ", size=" + ((Object) x2.k.b(this.f6459c)) + ", firstBaseline=" + this.f6460d + ", lastBaseline=" + this.f6461e + ", placeholderRects=" + this.f6462f + ')';
    }
}
