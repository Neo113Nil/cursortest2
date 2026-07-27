package q;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0947H;

/* renamed from: q.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1037p extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O[] f9318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f9319e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f9320i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M2.C f9321j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M2.C f9322k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1038q f9323l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037p(AbstractC0954O[] abstractC0954OArr, List list, InterfaceC0947H interfaceC0947H, M2.C c4, M2.C c5, C1038q c1038q) {
        super(1);
        this.f9318d = abstractC0954OArr;
        this.f9319e = list;
        this.f9320i = interfaceC0947H;
        this.f9321j = c4;
        this.f9322k = c5;
        this.f9323l = c1038q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        AbstractC0954O[] abstractC0954OArr = this.f9318d;
        int length = abstractC0954OArr.length;
        int i2 = 0;
        int i4 = 0;
        while (i4 < length) {
            AbstractC0954O abstractC0954O = abstractC0954OArr[i4];
            Intrinsics.d(abstractC0954O, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            AbstractC1035n.b(abstractC0953N, abstractC0954O, (InterfaceC0944E) this.f9319e.get(i2), this.f9320i.getLayoutDirection(), this.f9321j.f3578d, this.f9322k.f3578d, this.f9323l.f9325a);
            i4++;
            i2++;
        }
        return Unit.f7487a;
    }
}
