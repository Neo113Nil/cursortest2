package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ai1 implements Map.Entry, k71 {
    public final /* synthetic */ int m;
    public final Object n;
    public final Object o;

    public /* synthetic */ ai1(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.m) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && Intrinsics.b(entry.getKey(), this.n) && Intrinsics.b(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.m) {
        }
        return this.n;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.m) {
        }
        return this.o;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.m) {
            case 0:
                Object obj = this.n;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.n);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
