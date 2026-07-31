package Z;

import L1.z;

/* loaded from: classes.dex */
public final class f extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f3423f = new f(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final f f3424g = new f(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i3, int i4) {
        super(i3);
        this.f3425e = i4;
    }

    @Override // Y1.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f3425e) {
            case 0:
                return Boolean.FALSE;
            default:
                return z.f2729a;
        }
    }
}
