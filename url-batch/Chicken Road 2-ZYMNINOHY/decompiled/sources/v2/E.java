package v2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class E extends AbstractC1466m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15563a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15564b;

    public E(Object obj, Object obj2) {
        this.f15563a = obj;
        this.f15564b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15563a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15564b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
