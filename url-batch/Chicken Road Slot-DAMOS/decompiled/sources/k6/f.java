package k6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements p8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f5452a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final p8.c f5453b = new p8.c("currentCacheSizeBytes", v4.a.s(v4.a.r(s8.e.class, new s8.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final p8.c f5454c = new p8.c("maxCacheSizeBytes", v4.a.s(v4.a.r(s8.e.class, new s8.a(2))));

    @Override // p8.a
    public final void a(Object obj, Object obj2) {
        n6.f fVar = (n6.f) obj;
        p8.e eVar = (p8.e) obj2;
        eVar.c(f5453b, fVar.f7167a);
        eVar.c(f5454c, fVar.f7168b);
    }
}
