package c2;

import c6.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends q6.j implements p6.c {

    /* renamed from: f, reason: collision with root package name */
    public static final c f1586f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f1587g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f1588h;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1589e;

    static {
        int i = 1;
        f1586f = new c(i, 0);
        f1587g = new c(i, 1);
        f1588h = new c(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i8) {
        super(i);
        this.f1589e = i8;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f1589e) {
            case 0:
                ((Number) obj).longValue();
                return m.f1757a;
            case 1:
                return Integer.valueOf(((l) obj).f1607b);
            default:
                r2.j jVar = ((l) obj).f1608c;
                return Integer.valueOf(jVar.f6527d - jVar.f6525b);
        }
    }
}
