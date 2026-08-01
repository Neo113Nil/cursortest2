package d2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: e, reason: collision with root package name */
    public static e f3400e;

    /* renamed from: f, reason: collision with root package name */
    public static final w2.j f3401f = w2.j.f10041e;
    public static final w2.j g = w2.j.f10040d;

    /* renamed from: c, reason: collision with root package name */
    public m2.e0 f3402c;

    /* renamed from: d, reason: collision with root package name */
    public j2.m f3403d;

    @Override // d2.b
    public final int[] a(int i3) {
        int i10;
        if (c().length() > 0 && i3 < c().length()) {
            try {
                j2.m mVar = this.f3403d;
                if (mVar == null) {
                    Intrinsics.f("node");
                    throw null;
                }
                j1.c g2 = mVar.g();
                int round = Math.round(g2.f4919d - g2.f4917b);
                if (i3 <= 0) {
                    i3 = 0;
                }
                m2.e0 e0Var = this.f3402c;
                if (e0Var == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                int a9 = e0Var.a(i3);
                m2.e0 e0Var2 = this.f3402c;
                if (e0Var2 == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                float d10 = e0Var2.d(a9) + round;
                m2.e0 e0Var3 = this.f3402c;
                if (e0Var3 == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                float d11 = e0Var3.d(e0Var3.f6458b.f1008b - 1);
                m2.e0 e0Var4 = this.f3402c;
                if (d10 < d11) {
                    if (e0Var4 == null) {
                        Intrinsics.f("layoutResult");
                        throw null;
                    }
                    i10 = e0Var4.b(d10);
                } else {
                    if (e0Var4 == null) {
                        Intrinsics.f("layoutResult");
                        throw null;
                    }
                    i10 = e0Var4.f6458b.f1008b;
                }
                return b(i3, j(i10 - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // d2.b
    public final int[] i(int i3) {
        int i10;
        if (c().length() <= 0 || i3 <= 0) {
            return null;
        }
        try {
            j2.m mVar = this.f3403d;
            if (mVar == null) {
                Intrinsics.f("node");
                throw null;
            }
            j1.c g2 = mVar.g();
            int round = Math.round(g2.f4919d - g2.f4917b);
            int length = c().length();
            if (length <= i3) {
                i3 = length;
            }
            m2.e0 e0Var = this.f3402c;
            if (e0Var == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            int a9 = e0Var.a(i3);
            m2.e0 e0Var2 = this.f3402c;
            if (e0Var2 == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            float d10 = e0Var2.d(a9) - round;
            if (d10 > 0.0f) {
                m2.e0 e0Var3 = this.f3402c;
                if (e0Var3 == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                i10 = e0Var3.b(d10);
            } else {
                i10 = 0;
            }
            if (i3 == c().length() && i10 < a9) {
                i10++;
            }
            return b(j(i10, f3401f), i3);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int j(int i3, w2.j jVar) {
        m2.e0 e0Var = this.f3402c;
        if (e0Var == null) {
            Intrinsics.f("layoutResult");
            throw null;
        }
        int c10 = e0Var.c(i3);
        m2.e0 e0Var2 = this.f3402c;
        if (e0Var2 == null) {
            Intrinsics.f("layoutResult");
            throw null;
        }
        w2.j e2 = e0Var2.e(c10);
        m2.e0 e0Var3 = this.f3402c;
        if (jVar != e2) {
            if (e0Var3 != null) {
                return e0Var3.c(i3);
            }
            Intrinsics.f("layoutResult");
            throw null;
        }
        if (e0Var3 == null) {
            Intrinsics.f("layoutResult");
            throw null;
        }
        b1.m mVar = e0Var3.f6458b;
        mVar.h(i3);
        ArrayList arrayList = (ArrayList) mVar.f1011e;
        m2.a aVar = ((m2.m) arrayList.get(m2.z.d(i3, arrayList))).f6492a;
        return (aVar.f6419d.e(i3 - r6.f6495d) + r6.f6493b) - 1;
    }
}
