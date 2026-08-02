package A3;

import f3.InterfaceC0425c;

/* loaded from: classes.dex */
public final class j extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f94a;

    /* renamed from: b, reason: collision with root package name */
    public int f95b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f96c;

    /* renamed from: d, reason: collision with root package name */
    public k f97d;

    /* renamed from: e, reason: collision with root package name */
    public e f98e;

    /* renamed from: f, reason: collision with root package name */
    public B3.m f99f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, InterfaceC0425c interfaceC0425c) {
        super(interfaceC0425c);
        this.f96c = kVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f94a = obj;
        this.f95b |= Integer.MIN_VALUE;
        return this.f96c.collect(null, this);
    }
}
