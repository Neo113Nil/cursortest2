package i1;

import f1.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends q6.j implements p6.c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3291f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f3292g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3293e;

    static {
        int i = 1;
        f3291f = new a(i, 0);
        f3292g = new a(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i8) {
        super(i);
        this.f3293e = i8;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f3293e) {
            case 0:
                break;
            default:
                h1.d.r((h1.d) obj, s.f2703g, 0L, 0L, 126);
                break;
        }
        return c6.m.f1757a;
    }
}
