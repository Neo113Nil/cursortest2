package y0;

import L1.z;

/* loaded from: classes.dex */
public final class d extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final d f8798f = new d(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final d f8799g = new d(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final d f8800h = new d(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i4) {
        super(i3);
        this.f8801e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f8801e) {
            case 0:
                ((Number) obj).longValue();
                return z.f2729a;
            case 1:
                return Integer.valueOf(((m) obj).f8823b);
            default:
                M0.h hVar = ((m) obj).f8824c;
                return Integer.valueOf(hVar.f2773d - hVar.f2771b);
        }
    }
}
