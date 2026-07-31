package d3;

import a6.d;
import k5.C0477g;
import q5.AbstractC0607c;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318a extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public d f3942f;

    /* renamed from: g, reason: collision with root package name */
    public C0477g[] f3943g;

    /* renamed from: h, reason: collision with root package name */
    public C0477g[] f3944h;

    /* renamed from: i, reason: collision with root package name */
    public String f3945i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3946j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f3947k;

    /* renamed from: l, reason: collision with root package name */
    public int f3948l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0318a(d dVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f3947k = dVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f3946j = obj;
        this.f3948l |= Integer.MIN_VALUE;
        return this.f3947k.e(this);
    }
}
