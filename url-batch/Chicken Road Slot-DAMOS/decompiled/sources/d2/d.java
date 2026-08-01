package d2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public static d f3373d;

    /* renamed from: e, reason: collision with root package name */
    public static final w2.j f3374e = w2.j.f10041e;

    /* renamed from: f, reason: collision with root package name */
    public static final w2.j f3375f = w2.j.f10040d;

    /* renamed from: c, reason: collision with root package name */
    public m2.e0 f3376c;

    @Override // d2.b
    public final int[] a(int i3) {
        int i10;
        if (c().length() > 0 && i3 < c().length()) {
            m2.e0 e0Var = this.f3376c;
            w2.j jVar = f3374e;
            if (i3 < 0) {
                if (e0Var == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                i10 = e0Var.a(0);
            } else {
                if (e0Var == null) {
                    Intrinsics.f("layoutResult");
                    throw null;
                }
                int a9 = e0Var.a(i3);
                i10 = j(a9, jVar) == i3 ? a9 : a9 + 1;
            }
            m2.e0 e0Var2 = this.f3376c;
            if (e0Var2 == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            if (i10 < e0Var2.f6458b.f1008b) {
                return b(j(i10, jVar), j(i10, f3375f) + 1);
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
        int length = c().length();
        m2.e0 e0Var = this.f3376c;
        w2.j jVar = f3375f;
        if (i3 > length) {
            if (e0Var == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            i10 = e0Var.a(c().length());
        } else {
            if (e0Var == null) {
                Intrinsics.f("layoutResult");
                throw null;
            }
            int a9 = e0Var.a(i3);
            i10 = j(a9, jVar) + 1 == i3 ? a9 : a9 - 1;
        }
        if (i10 < 0) {
            return null;
        }
        return b(j(i10, f3374e), j(i10, jVar) + 1);
    }

    public final int j(int i3, w2.j jVar) {
        m2.e0 e0Var = this.f3376c;
        if (e0Var == null) {
            Intrinsics.f("layoutResult");
            throw null;
        }
        int c10 = e0Var.c(i3);
        m2.e0 e0Var2 = this.f3376c;
        if (e0Var2 == null) {
            Intrinsics.f("layoutResult");
            throw null;
        }
        w2.j e2 = e0Var2.e(c10);
        m2.e0 e0Var3 = this.f3376c;
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
