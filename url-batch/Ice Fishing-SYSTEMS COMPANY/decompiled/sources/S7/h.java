package S7;

import v7.InterfaceC5133d;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public i f2997n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2998u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2999v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f3000w;

    /* renamed from: x, reason: collision with root package name */
    public int f3001x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.f3000w = iVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f2999v = obj;
        this.f3001x |= Integer.MIN_VALUE;
        return this.f3000w.a(null, this);
    }
}
