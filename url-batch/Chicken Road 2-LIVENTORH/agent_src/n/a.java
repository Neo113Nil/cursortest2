package n;

import java.util.HashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2696j = new HashMap();

    @Override // n.f
    public final c a(Object obj) {
        return (c) this.f2696j.get(obj);
    }

    @Override // n.f
    public final Object b(Object obj) {
        Object b4 = super.b(obj);
        this.f2696j.remove(obj);
        return b4;
    }
}
