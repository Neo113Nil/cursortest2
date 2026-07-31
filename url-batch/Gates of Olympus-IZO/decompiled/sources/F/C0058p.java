package F;

import f2.InterfaceC0390e;
import h1.C0438i;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058p extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0058p f1321f = new C0058p(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0058p f1322g = new C0058p(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0058p f1323h = new C0058p(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0058p f1324i = new C0058p(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0058p f1325j = new C0058p(1, 4);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0058p(int i3, int i4) {
        super(i3);
        this.f1326e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        L1.z zVar = L1.z.f2729a;
        switch (this.f1326e) {
            case 0:
                z0.s.c((z0.i) obj, 0);
                break;
            case 1:
                z0.s.c((z0.i) obj, 1);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
                z0.t tVar = z0.q.f9021l;
                InterfaceC0390e interfaceC0390e = z0.s.f9036a[5];
                tVar.a((z0.i) obj, Boolean.TRUE);
                break;
        }
        return zVar;
    }
}
