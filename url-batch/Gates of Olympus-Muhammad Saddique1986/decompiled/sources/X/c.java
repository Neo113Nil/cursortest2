package X;

import B.Y;
import e2.InterfaceC0424c;
import f2.k;
import f2.q;
import n0.C0715m;
import t0.q0;

/* loaded from: classes.dex */
public final class c extends k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4619e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f4620f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Y y3, e eVar, q qVar) {
        super(1);
        this.f4620f = qVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4619e) {
            case 0:
                if (!((e) obj).f4501p) {
                    break;
                } else {
                    q qVar = this.f4620f;
                    qVar.f5828d = qVar.f5828d;
                    break;
                }
            default:
                if (!((C0715m) obj).f7302r) {
                    break;
                } else {
                    this.f4620f.f5828d = false;
                    break;
                }
        }
        return q0.f8779d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar) {
        super(1);
        this.f4620f = qVar;
    }
}
