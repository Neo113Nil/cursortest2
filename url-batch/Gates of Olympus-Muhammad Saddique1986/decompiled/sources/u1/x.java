package u1;

import e2.InterfaceC0424c;
import l.AbstractC0574B;
import m.AbstractC0620e;
import t1.C1028h;

/* loaded from: classes.dex */
public final class x extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final x f9657f = new x(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final x f9658g = new x(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final x f9659h = new x(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i3, int i4) {
        super(i3);
        this.f9660e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f9660e) {
            case 0:
                return ((C1028h) obj).f8878i;
            case 1:
                return AbstractC0574B.a(AbstractC0620e.j(700, 0, null, 6), 2);
            default:
                return AbstractC0574B.b(AbstractC0620e.j(700, 0, null, 6), 2);
        }
    }
}
