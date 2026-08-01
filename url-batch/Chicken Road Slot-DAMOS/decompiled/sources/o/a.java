package o;

import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f7295s = new HashMap();

    @Override // o.f
    public final c b(Object obj) {
        return (c) this.f7295s.get(obj);
    }

    @Override // o.f
    public final Object c(Object obj) {
        Object c10 = super.c(obj);
        this.f7295s.remove(obj);
        return c10;
    }
}
