package A3;

import y3.AbstractC1571e;

/* loaded from: classes.dex */
public final class c extends y3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1571e[] f52c;

    public c(n[] nVarArr) {
        super(y3.h.e(F3.e.f690a, nVarArr));
        this.f52c = nVarArr;
    }

    @Override // y3.AbstractC1571e
    public final void c(y3.m mVar) {
        switch (this.f51b) {
            case 0:
                mVar.o(F3.b.f684a, this.f52c);
                break;
            default:
                mVar.o(F3.e.f690a, this.f52c);
                break;
        }
    }

    public c(AbstractC1571e[] abstractC1571eArr) {
        super(y3.h.e(F3.b.f684a, abstractC1571eArr));
        this.f52c = abstractC1571eArr;
    }
}
