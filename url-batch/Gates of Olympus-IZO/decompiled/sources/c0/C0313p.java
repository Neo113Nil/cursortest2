package c0;

import e2.AbstractC0381e;

/* renamed from: c0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313p extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0314q f4394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0313p(C0314q c0314q, int i3) {
        super(1);
        this.f4393e = i3;
        this.f4394f = c0314q;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f4393e) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f4394f.f4406n.b(AbstractC0381e.p(doubleValue, r10.f4397e, r10.f4398f)));
            default:
                return Double.valueOf(AbstractC0381e.p(this.f4394f.f4403k.b(((Number) obj).doubleValue()), r10.f4397e, r10.f4398f));
        }
    }
}
