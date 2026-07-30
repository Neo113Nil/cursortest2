package n6;

import kotlin.Unit;
import v6.C0980b;

/* renamed from: n6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0774g implements e6.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7057e;

    public /* synthetic */ C0774g(int i2, Object obj) {
        this.f7056d = i2;
        this.f7057e = obj;
    }

    @Override // e6.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7056d) {
            case 0:
                ((c2.j) this.f7057e).invoke((Throwable) obj);
                break;
            case 1:
                v6.c cVar = (v6.c) this.f7057e;
                v6.c.f8238g.set(cVar, null);
                cVar.e(null);
                break;
            default:
                ((v6.g) this.f7057e).b();
                break;
        }
        return Unit.f6114a;
    }

    public /* synthetic */ C0774g(v6.c cVar, C0980b c0980b) {
        this.f7056d = 1;
        this.f7057e = cVar;
    }
}
