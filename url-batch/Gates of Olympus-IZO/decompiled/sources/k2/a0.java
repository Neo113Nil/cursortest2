package k2;

import u0.C0997t;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 extends Z1.g implements Y1.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5339l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, i4, cls, obj, str, str2);
        this.f5339l = i5;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f5339l) {
            case 0:
                ((b0) this.f3461e).l((Throwable) obj);
                break;
            default:
                Y1.a aVar = (Y1.a) obj;
                K.d dVar = ((C0997t) this.f3461e).f8460r0;
                if (!dVar.i(aVar)) {
                    dVar.b(aVar);
                }
                break;
        }
        return L1.z.f2729a;
    }
}
