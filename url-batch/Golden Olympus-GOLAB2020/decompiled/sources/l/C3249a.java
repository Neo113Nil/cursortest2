package l;

import java.util.HashMap;
import java.util.Map;
import l.C3250b;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3249a extends C3250b {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f41286f = new HashMap();

    public boolean contains(Object obj) {
        return this.f41286f.containsKey(obj);
    }

    @Override // l.C3250b
    protected C3250b.c d(Object obj) {
        return (C3250b.c) this.f41286f.get(obj);
    }

    @Override // l.C3250b
    public Object h(Object obj, Object obj2) {
        C3250b.c d4 = d(obj);
        if (d4 != null) {
            return d4.f41292c;
        }
        this.f41286f.put(obj, g(obj, obj2));
        return null;
    }

    @Override // l.C3250b
    public Object i(Object obj) {
        Object i4 = super.i(obj);
        this.f41286f.remove(obj);
        return i4;
    }

    public Map.Entry j(Object obj) {
        if (contains(obj)) {
            return ((C3250b.c) this.f41286f.get(obj)).f41294e;
        }
        return null;
    }
}
