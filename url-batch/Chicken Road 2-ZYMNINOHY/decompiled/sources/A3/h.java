package A3;

import f3.InterfaceC0425c;

/* loaded from: classes.dex */
public final class h extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f87a;

    /* renamed from: b, reason: collision with root package name */
    public int f88b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f89c;

    /* renamed from: d, reason: collision with root package name */
    public Object f90d;

    /* renamed from: e, reason: collision with root package name */
    public e f91e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC0425c interfaceC0425c) {
        super(interfaceC0425c);
        this.f89c = iVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f87a = obj;
        this.f88b |= Integer.MIN_VALUE;
        return this.f89c.collect(null, this);
    }
}
