package s;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class s implements Map.Entry, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8370d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8371e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8372i;

    public /* synthetic */ s(int i3, Object obj, Object obj2) {
        this.f8370d = i3;
        this.f8371e = obj;
        this.f8372i = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f8370d) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && Intrinsics.a(entry.getKey(), this.f8371e) && Intrinsics.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f8370d) {
        }
        return this.f8371e;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f8370d) {
        }
        return this.f8372i;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f8370d) {
            case 1:
                Object obj = this.f8371e;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f8370d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f8370d) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f8371e);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
