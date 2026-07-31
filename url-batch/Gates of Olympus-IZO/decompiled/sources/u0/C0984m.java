package u0;

import h1.C0438i;

/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984m extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0984m f8363f = new C0984m(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0984m f8364g = new C0984m(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0984m f8365h = new C0984m(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0984m f8366i = new C0984m(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0984m f8367j = new C0984m(1, 4);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0984m(int i3, int i4) {
        super(i3);
        this.f8368e = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r3.f8982d.containsKey(z0.q.f9031w) != false) goto L14;
     */
    @Override // Y1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        boolean z3;
        switch (this.f8368e) {
            case 0:
                return L1.z.f2729a;
            case 1:
                return Boolean.TRUE;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.FALSE;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                z0.i n3 = ((t0.D) obj).n();
                if (n3 != null) {
                    z3 = true;
                    if (n3.f8983e) {
                        break;
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            default:
                return Boolean.valueOf(L.j(obj));
        }
    }
}
