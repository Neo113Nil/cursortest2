package m;

import java.util.HashMap;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513a extends C0518f {

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f5311j = new HashMap();

    @Override // m.C0518f
    public final C0515c a(Object obj) {
        return (C0515c) this.f5311j.get(obj);
    }

    @Override // m.C0518f
    public final Object b(Object obj) {
        Object b7 = super.b(obj);
        this.f5311j.remove(obj);
        return b7;
    }
}
