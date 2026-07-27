package W2;

import kotlin.Unit;

/* renamed from: W2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0285g implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4260e;

    public /* synthetic */ C0285g(int i2, Object obj) {
        this.f4259d = i2;
        this.f4260e = obj;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.f4259d) {
            case 0:
                ((A1.T) this.f4260e).invoke(th);
                break;
            default:
                ((e3.g) this.f4260e).b();
                break;
        }
        return Unit.f7487a;
    }
}
