package q;

import p0.InterfaceC0944E;

/* renamed from: q.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007K extends M2.p implements L2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final C1007K f9180e = new C1007K(3, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1007K f9181i = new C1007K(3, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1007K f9182j = new C1007K(3, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1007K(int i2, int i4) {
        super(i2);
        this.f9183d = i4;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f9183d) {
            case 0:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC0944E) obj).X(((Number) obj3).intValue()));
            case 1:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC0944E) obj).Z(((Number) obj3).intValue()));
            default:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC0944E) obj).S(((Number) obj3).intValue()));
        }
    }
}
