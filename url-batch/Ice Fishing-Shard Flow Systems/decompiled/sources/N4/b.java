package N4;

import java.util.Map;

/* loaded from: classes.dex */
public final class b implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1833d;

    /* renamed from: e, reason: collision with root package name */
    public final Map.Entry f1834e;

    public b(Object obj, Map.Entry entry) {
        this.f1833d = obj;
        this.f1834e = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1833d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1834e.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return this.f1834e.setValue(obj);
    }
}
