package f3;

import q5.AbstractC0607c;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372e extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public C0373f f4215f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0373f f4217h;

    /* renamed from: i, reason: collision with root package name */
    public int f4218i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0372e(C0373f c0373f, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f4217h = c0373f;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f4216g = obj;
        this.f4218i |= Integer.MIN_VALUE;
        return this.f4217h.a(this);
    }
}
