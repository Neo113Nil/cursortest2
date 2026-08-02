package c;

import b2.C0195i;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2604e;
    public final /* synthetic */ t f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(t tVar, int i3) {
        super(0);
        this.f2604e = i3;
        this.f = tVar;
    }

    @Override // l2.a
    public final Object invoke() {
        switch (this.f2604e) {
            case 0:
                this.f.b();
                break;
            case 1:
                this.f.a();
                break;
            default:
                this.f.b();
                break;
        }
        return C0195i.f2555a;
    }
}
