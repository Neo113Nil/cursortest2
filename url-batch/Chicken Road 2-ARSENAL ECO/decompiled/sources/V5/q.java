package V5;

import java.util.LinkedHashMap;
import k5.C0472b;
import q5.AbstractC0605a;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class q extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public C0472b f2747f;

    /* renamed from: g, reason: collision with root package name */
    public A.j f2748g;

    /* renamed from: h, reason: collision with root package name */
    public LinkedHashMap f2749h;

    /* renamed from: i, reason: collision with root package name */
    public String f2750i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2751j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A.j f2752k;

    /* renamed from: l, reason: collision with root package name */
    public int f2753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(A.j jVar, AbstractC0605a abstractC0605a) {
        super(abstractC0605a);
        this.f2752k = jVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f2751j = obj;
        this.f2753l |= Integer.MIN_VALUE;
        return A.j.a(this.f2752k, null, this);
    }
}
