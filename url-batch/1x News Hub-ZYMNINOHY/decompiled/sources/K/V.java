package K;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class V extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public W f723d;

    /* renamed from: e, reason: collision with root package name */
    public Object f724e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Y f725g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W f727i;

    /* renamed from: j, reason: collision with root package name */
    public int f728j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f727i = w3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f726h = obj;
        this.f728j |= Integer.MIN_VALUE;
        return this.f727i.b(null, this);
    }
}
