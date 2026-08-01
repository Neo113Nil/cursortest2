package b1;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: o, reason: collision with root package name */
    public final d f969o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f970p;

    public e(long j, o oVar, Function1 function1, Function1 function12, d dVar) {
        super(j, oVar, function1, function12);
        this.f969o = dVar;
        dVar.k();
    }

    @Override // b1.d, b1.i
    public final void c() {
        if (this.f985c) {
            return;
        }
        super.c();
        if (this.f970p) {
            return;
        }
        this.f970p = true;
        this.f969o.l();
    }

    @Override // b1.d
    public final x w() {
        e eVar;
        d dVar = this.f969o;
        if (dVar.f963m || dVar.f985c) {
            return new k(this);
        }
        s.i0 i0Var = this.f959h;
        long j = this.f984b;
        HashMap b10 = i0Var != null ? r.b(dVar.g(), this, this.f969o.d()) : null;
        Object obj = r.f1030c;
        synchronized (obj) {
            try {
                r.c(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (i0Var == null || i0Var.f8322d == 0) {
                    eVar = this;
                    a();
                } else {
                    eVar = this;
                    x z10 = eVar.z(this.f969o.g(), i0Var, b10, this.f969o.d());
                    if (!z10.equals(l.f1002b)) {
                        return z10;
                    }
                    s.i0 x10 = eVar.f969o.x();
                    if (x10 != null) {
                        x10.j(i0Var);
                    } else {
                        eVar.f969o.B(i0Var);
                        eVar.f959h = null;
                    }
                }
                if (Intrinsics.c(eVar.f969o.g(), j) < 0) {
                    eVar.f969o.v();
                }
                d dVar2 = eVar.f969o;
                dVar2.r(dVar2.d().c(j).b(eVar.j));
                eVar.f969o.A(j);
                d dVar3 = eVar.f969o;
                int i3 = eVar.f986d;
                eVar.f986d = -1;
                if (i3 >= 0) {
                    int[] iArr = dVar3.f961k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i3;
                    dVar3.f961k = copyOf;
                } else {
                    dVar3.getClass();
                }
                d dVar4 = eVar.f969o;
                o oVar = eVar.j;
                dVar4.getClass();
                synchronized (obj) {
                    dVar4.j = dVar4.j.f(oVar);
                    d dVar5 = eVar.f969o;
                    int[] iArr2 = eVar.f961k;
                    dVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = dVar5.f961k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        dVar5.f961k = iArr2;
                    }
                }
                eVar.f963m = true;
                if (!eVar.f970p) {
                    eVar.f970p = true;
                    eVar.f969o.l();
                }
                return l.f1002b;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
