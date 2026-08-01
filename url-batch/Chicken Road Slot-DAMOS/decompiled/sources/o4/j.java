package o4;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends n4.t {
    public final i g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.d f7478h;

    public j(i iVar, wd.h hVar, Map map, x0.d dVar) {
        super(iVar, hVar, map);
        this.g = iVar;
        this.f7478h = dVar;
    }

    @Override // n4.t
    public final n4.s a() {
        return (h) super.a();
    }

    @Override // n4.t
    public final n4.s b() {
        return new h(this.g, this.f7478h);
    }
}
