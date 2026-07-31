package F5;

import l5.AbstractC0497a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0497a f804g;

    public /* synthetic */ g(AbstractC0497a abstractC0497a, int i7) {
        this.f803f = i7;
        this.f804g = abstractC0497a;
    }

    @Override // x5.InterfaceC0743l
    public final Object invoke(Object obj) {
        switch (this.f803f) {
            case 0:
                return ((h) this.f804g).b(((Integer) obj).intValue());
            default:
                return obj == this.f804g ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
