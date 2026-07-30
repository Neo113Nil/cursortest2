package X0;

import j1.ChoreographerFrameCallbackC4593f;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f3711c;

    public /* synthetic */ q(v vVar, float f6, int i) {
        this.f3709a = i;
        this.f3710b = vVar;
        this.f3711c = f6;
    }

    @Override // X0.u
    public final void run() {
        switch (this.f3709a) {
            case 0:
                v vVar = this.f3710b;
                i iVar = vVar.f3746n;
                float f6 = this.f3711c;
                if (iVar != null) {
                    float f9 = j1.h.f(iVar.f3679l, iVar.f3680m, f6);
                    ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = vVar.f3754u;
                    choreographerFrameCallbackC4593f.p(choreographerFrameCallbackC4593f.f38492C, f9);
                    break;
                } else {
                    vVar.f3762y.add(new q(vVar, f6, 0));
                    break;
                }
            case 1:
                v vVar2 = this.f3710b;
                i iVar2 = vVar2.f3746n;
                float f10 = this.f3711c;
                if (iVar2 != null) {
                    vVar2.s((int) j1.h.f(iVar2.f3679l, iVar2.f3680m, f10));
                    break;
                } else {
                    vVar2.f3762y.add(new q(vVar2, f10, 1));
                    break;
                }
            default:
                this.f3710b.u(this.f3711c);
                break;
        }
    }
}
