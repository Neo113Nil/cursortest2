package d2;

import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m2 implements androidx.lifecycle.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ le.d f3478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.l1 f3479e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.z1 f3480i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ wd.b0 f3481r;

    public m2(le.d dVar, n0.l1 l1Var, n0.z1 z1Var, wd.b0 b0Var) {
        this.f3478d = dVar;
        this.f3479e = l1Var;
        this.f3480i = z1Var;
        this.f3481r = b0Var;
    }

    @Override // androidx.lifecycle.s
    public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        boolean z10;
        ge.f fVar = null;
        switch (k2.f3455a[oVar.ordinal()]) {
            case 1:
                le.d dVar = this.f3478d;
                ge.y yVar = ge.y.f4417d;
                ge.a0.s(dVar, null, new l2(this.f3481r, this.f3480i, uVar, this, null, 0), 1);
                return;
            case 2:
                n0.l1 l1Var = this.f3479e;
                if (l1Var != null) {
                    b7.o0 o0Var = l1Var.f6748e;
                    synchronized (o0Var.f1326b) {
                        try {
                            synchronized (o0Var.f1326b) {
                                z10 = o0Var.f1325a;
                            }
                            if (!z10) {
                                ArrayList arrayList = (ArrayList) o0Var.f1327c;
                                o0Var.f1327c = (ArrayList) o0Var.f1328d;
                                o0Var.f1328d = arrayList;
                                o0Var.f1325a = true;
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    ld.a aVar = (ld.a) arrayList.get(i3);
                                    hd.l lVar = hd.n.f4511e;
                                    aVar.resumeWith(Unit.f5554a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                n0.z1 z1Var = this.f3480i;
                synchronized (z1Var.f6877c) {
                    if (z1Var.f6892t) {
                        z1Var.f6892t = false;
                        fVar = z1Var.v();
                    }
                }
                if (fVar != null) {
                    hd.l lVar2 = hd.n.f4511e;
                    ((ge.h) fVar).resumeWith(Unit.f5554a);
                    return;
                }
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                n0.z1 z1Var2 = this.f3480i;
                synchronized (z1Var2.f6877c) {
                    z1Var2.f6892t = true;
                }
                return;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                this.f3480i.u();
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                a2.r.p();
                return;
        }
    }
}
