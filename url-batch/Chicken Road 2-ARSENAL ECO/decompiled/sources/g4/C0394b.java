package g4;

import java.util.Map;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394b implements Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public final Object f4278f;

    /* renamed from: g, reason: collision with root package name */
    public final Map.Entry f4279g;

    public C0394b(Object obj, Map.Entry entry) {
        this.f4278f = obj;
        this.f4279g = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4278f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4279g.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return this.f4279g.setValue(obj);
    }
}
