package n;

import java.util.HashMap;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115a extends C1120f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f9970e = new HashMap();

    @Override // n.C1120f
    public final C1117c b(Object obj) {
        return (C1117c) this.f9970e.get(obj);
    }

    @Override // n.C1120f
    public final Object c(Object obj) {
        Object c3 = super.c(obj);
        this.f9970e.remove(obj);
        return c3;
    }
}
