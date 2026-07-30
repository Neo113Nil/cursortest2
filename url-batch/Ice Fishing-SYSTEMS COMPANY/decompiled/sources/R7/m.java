package R7;

import O7.Y;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class m extends AbstractC5219c {

    /* renamed from: A, reason: collision with root package name */
    public int f2869A;

    /* renamed from: n, reason: collision with root package name */
    public n f2870n;

    /* renamed from: u, reason: collision with root package name */
    public c f2871u;

    /* renamed from: v, reason: collision with root package name */
    public p f2872v;

    /* renamed from: w, reason: collision with root package name */
    public Y f2873w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2874x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2875y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n f2876z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.f2876z = nVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f2875y = obj;
        this.f2869A |= Integer.MIN_VALUE;
        this.f2876z.j(null, this);
        return EnumC5179a.f41704n;
    }
}
