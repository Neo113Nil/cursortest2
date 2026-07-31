package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f98a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.e f100c;

    public j(int i, int i8, x4.e eVar) {
        this.f98a = i;
        this.f99b = i8;
        this.f100c = eVar;
        if (i < 0) {
            w.a.a("startIndex should be >= 0");
        }
        if (i8 > 0) {
            return;
        }
        w.a.a("size should be > 0");
    }
}
