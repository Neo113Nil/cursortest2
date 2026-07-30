package m6;

import java.util.Map;

/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4784b implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f39573n;

    /* renamed from: u, reason: collision with root package name */
    public final Map.Entry f39574u;

    public C4784b(Object obj, Map.Entry entry) {
        this.f39573n = obj;
        this.f39574u = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f39573n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f39574u.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return this.f39574u.setValue(obj);
    }
}
