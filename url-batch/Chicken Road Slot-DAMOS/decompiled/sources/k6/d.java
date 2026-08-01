package k6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements p8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5448a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final p8.c f5449b = new p8.c("logSource", v4.a.s(v4.a.r(s8.e.class, new s8.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final p8.c f5450c = new p8.c("logEventDropped", v4.a.s(v4.a.r(s8.e.class, new s8.a(2))));

    @Override // p8.a
    public final void a(Object obj, Object obj2) {
        n6.e eVar = (n6.e) obj;
        p8.e eVar2 = (p8.e) obj2;
        eVar2.a(f5449b, eVar.f7165a);
        eVar2.a(f5450c, eVar.f7166b);
    }
}
