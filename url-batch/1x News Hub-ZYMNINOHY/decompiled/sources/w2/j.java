package w2;

import d2.InterfaceC0300c;
import f0.C0322a;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class j extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10660d;

    /* renamed from: e, reason: collision with root package name */
    public int f10661e;
    public final /* synthetic */ C0322a f;

    /* renamed from: g, reason: collision with root package name */
    public C0322a f10662g;

    /* renamed from: h, reason: collision with root package name */
    public e f10663h;

    /* renamed from: i, reason: collision with root package name */
    public x2.m f10664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0322a c0322a, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f = c0322a;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f10660d = obj;
        this.f10661e |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
