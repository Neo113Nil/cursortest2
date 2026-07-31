package t;

import java.util.List;

/* loaded from: classes.dex */
public final class n extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final n f7622f = new n(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final n f7623g = new n(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final n f7624h = new n(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i3, int i4) {
        super(i3);
        this.f7625e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f7625e) {
            case 0:
                return L1.z.f2729a;
            case 1:
                List list = (List) obj;
                return new y(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return M1.u.f2803d;
        }
    }
}
