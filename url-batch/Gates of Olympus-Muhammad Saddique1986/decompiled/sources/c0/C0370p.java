package c0;

import e2.InterfaceC0424c;

/* renamed from: c0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370p extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0371q f5520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0370p(C0371q c0371q, int i3) {
        super(1);
        this.f5519e = i3;
        this.f5520f = c0371q;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f5519e) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f5520f.f5532n.b(O2.d.w(doubleValue, r10.f5523e, r10.f5524f)));
            default:
                return Double.valueOf(O2.d.w(this.f5520f.f5529k.b(((Number) obj).doubleValue()), r10.f5523e, r10.f5524f));
        }
    }
}
