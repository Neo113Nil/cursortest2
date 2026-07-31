package r;

import e2.InterfaceC0424c;
import java.util.List;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0887I;

/* renamed from: r.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870q extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O[] f8075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f8076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887I f8077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f2.s f8078h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f2.s f8079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f8080j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0870q(AbstractC0893O[] abstractC0893OArr, List list, InterfaceC0887I interfaceC0887I, f2.s sVar, f2.s sVar2, r rVar) {
        super(1);
        this.f8075e = abstractC0893OArr;
        this.f8076f = list;
        this.f8077g = interfaceC0887I;
        this.f8078h = sVar;
        this.f8079i = sVar2;
        this.f8080j = rVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        AbstractC0893O[] abstractC0893OArr = this.f8075e;
        int length = abstractC0893OArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            AbstractC0893O abstractC0893O = abstractC0893OArr[i4];
            f2.j.d(abstractC0893O, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            AbstractC0868o.b(abstractC0892N, abstractC0893O, (InterfaceC0884F) this.f8076f.get(i3), this.f8077g.getLayoutDirection(), this.f8078h.f5830d, this.f8079i.f5830d, this.f8080j.f8081a);
            i4++;
            i3++;
        }
        return R1.y.f4171a;
    }
}
