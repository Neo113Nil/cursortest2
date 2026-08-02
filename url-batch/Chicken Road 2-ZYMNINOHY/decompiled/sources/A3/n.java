package A3;

import f3.InterfaceC0425c;

/* loaded from: classes.dex */
public final class n extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f112a;

    /* renamed from: b, reason: collision with root package name */
    public int f113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f114c;

    /* renamed from: d, reason: collision with root package name */
    public p f115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, InterfaceC0425c interfaceC0425c) {
        super(interfaceC0425c);
        this.f114c = kVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f112a = obj;
        this.f113b |= Integer.MIN_VALUE;
        return this.f114c.collect(null, this);
    }
}
