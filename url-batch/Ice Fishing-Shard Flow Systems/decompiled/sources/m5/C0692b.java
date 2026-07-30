package m5;

import k5.AbstractC0605e;
import r5.AbstractC0849b;
import r5.AbstractC0852e;

/* renamed from: m5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692b extends k5.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6552b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0605e[] f6553c;

    public C0692b(m[] mVarArr) {
        super(k5.h.e(AbstractC0852e.f7540a, mVarArr));
        this.f6553c = mVarArr;
    }

    @Override // k5.AbstractC0605e
    public final void c(k5.l lVar) {
        switch (this.f6552b) {
            case 0:
                lVar.j(AbstractC0849b.f7534a, this.f6553c);
                break;
            default:
                lVar.j(AbstractC0852e.f7540a, this.f6553c);
                break;
        }
    }

    public C0692b(AbstractC0605e[] abstractC0605eArr) {
        super(k5.h.e(AbstractC0849b.f7534a, abstractC0605eArr));
        this.f6553c = abstractC0605eArr;
    }
}
