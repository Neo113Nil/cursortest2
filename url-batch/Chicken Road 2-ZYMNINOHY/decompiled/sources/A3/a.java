package A3;

import f3.InterfaceC0425c;

/* loaded from: classes.dex */
public final class a extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public B3.m f68a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f69b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f70c;

    /* renamed from: d, reason: collision with root package name */
    public int f71d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t tVar, InterfaceC0425c interfaceC0425c) {
        super(interfaceC0425c);
        this.f70c = tVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f69b = obj;
        this.f71d |= Integer.MIN_VALUE;
        return this.f70c.collect(null, this);
    }
}
