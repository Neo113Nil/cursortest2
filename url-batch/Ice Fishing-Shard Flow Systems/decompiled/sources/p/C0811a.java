package p;

import java.util.HashMap;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811a extends C0816f {

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f7136m = new HashMap();

    @Override // p.C0816f
    public final C0813c a(Object obj) {
        return (C0813c) this.f7136m.get(obj);
    }

    @Override // p.C0816f
    public final Object b(Object obj) {
        Object b7 = super.b(obj);
        this.f7136m.remove(obj);
        return b7;
    }
}
