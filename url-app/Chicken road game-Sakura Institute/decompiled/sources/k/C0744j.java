package k;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744j extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0746l f7294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f7295e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7296i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744j(C0746l c0746l, AbstractC0954O abstractC0954O, long j4) {
        super(1);
        this.f7294d = c0746l;
        this.f7295e = abstractC0954O;
        this.f7296i = j4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        S.c cVar = this.f7294d.f7301b;
        AbstractC0954O abstractC0954O = this.f7295e;
        AbstractC0953N.e((AbstractC0953N) obj, abstractC0954O, cVar.a(u3.d.c(abstractC0954O.f9005d, abstractC0954O.f9006e), this.f7296i, M0.k.f3555d));
        return Unit.f7487a;
    }
}
