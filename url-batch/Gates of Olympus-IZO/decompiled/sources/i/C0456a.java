package i;

import java.util.HashMap;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456a extends C0461f {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5082h = new HashMap();

    @Override // i.C0461f
    public final C0458c b(Object obj) {
        return (C0458c) this.f5082h.get(obj);
    }

    @Override // i.C0461f
    public final Object c(Object obj) {
        Object c3 = super.c(obj);
        this.f5082h.remove(obj);
        return c3;
    }
}
