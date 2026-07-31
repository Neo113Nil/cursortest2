package Z;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class i extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final i f4678f = new i(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final i f4679g = new i(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final i f4680h = new i(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final i f4681i = new i(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final i f4682j = new i(1, 4);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i3, int i4) {
        super(i3);
        this.f4683e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4683e) {
            case 0:
                ((k) obj).b(false);
                break;
            case 1:
                int i3 = ((b) obj).f4666a;
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = ((b) obj).f4666a;
                break;
        }
        return Boolean.valueOf(d.B((t) obj));
    }
}
