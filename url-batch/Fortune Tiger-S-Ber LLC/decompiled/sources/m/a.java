package m;

import java.util.HashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2897j = new HashMap();

    @Override // m.f
    public final c a(Object obj) {
        return (c) this.f2897j.get(obj);
    }

    @Override // m.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f2897j.remove(obj);
        return b2;
    }
}
