package i;

import java.util.HashMap;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509a extends C0514f {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f6222h = new HashMap();

    @Override // i.C0514f
    public final C0511c b(Object obj) {
        return (C0511c) this.f6222h.get(obj);
    }

    @Override // i.C0514f
    public final Object c(Object obj) {
        Object c2 = super.c(obj);
        this.f6222h.remove(obj);
        return c2;
    }
}
