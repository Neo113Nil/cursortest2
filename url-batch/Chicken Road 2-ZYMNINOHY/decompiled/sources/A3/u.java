package A3;

import f3.InterfaceC0425c;
import g3.EnumC0441a;
import x3.T;

/* loaded from: classes.dex */
public final class u extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public v f131a;

    /* renamed from: b, reason: collision with root package name */
    public e f132b;

    /* renamed from: c, reason: collision with root package name */
    public x f133c;

    /* renamed from: d, reason: collision with root package name */
    public T f134d;

    /* renamed from: e, reason: collision with root package name */
    public Object f135e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f137g;

    /* renamed from: h, reason: collision with root package name */
    public int f138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, InterfaceC0425c interfaceC0425c) {
        super(interfaceC0425c);
        this.f137g = vVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f136f = obj;
        this.f138h |= Integer.MIN_VALUE;
        this.f137g.collect(null, this);
        return EnumC0441a.f9038a;
    }
}
