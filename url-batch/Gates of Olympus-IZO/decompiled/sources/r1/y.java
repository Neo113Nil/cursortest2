package r1;

import l.AbstractC0555B;
import m.AbstractC0595e;
import q1.C0784h;

/* loaded from: classes.dex */
public final class y extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final y f7287f = new y(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final y f7288g = new y(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final y f7289h = new y(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i3, int i4) {
        super(i3);
        this.f7290e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f7290e) {
            case 0:
                return ((C0784h) obj).f6899i;
            case 1:
                return AbstractC0555B.a(AbstractC0595e.i(700, 0, null, 6));
            default:
                return AbstractC0555B.b(AbstractC0595e.i(700, 0, null, 6));
        }
    }
}
