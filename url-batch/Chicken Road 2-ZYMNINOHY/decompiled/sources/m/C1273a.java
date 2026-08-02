package m;

import java.util.HashMap;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273a extends C1278f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f14277e = new HashMap();

    @Override // m.C1278f
    public final C1275c b(Object obj) {
        return (C1275c) this.f14277e.get(obj);
    }

    @Override // m.C1278f
    public final Object c(Object obj) {
        Object c4 = super.c(obj);
        this.f14277e.remove(obj);
        return c4;
    }
}
