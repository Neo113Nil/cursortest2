package kotlin.collections;

/* loaded from: classes4.dex */
public final class c0 {
    private final int index;
    private final Object value;

    public c0(int i8, Object obj) {
        this.index = i8;
        this.value = obj;
    }

    public static /* synthetic */ c0 copy$default(c0 c0Var, int i8, Object obj, int i9, Object obj2) {
        if ((i9 & 1) != 0) {
            i8 = c0Var.index;
        }
        if ((i9 & 2) != 0) {
            obj = c0Var.value;
        }
        return c0Var.copy(i8, obj);
    }

    public final int component1() {
        return this.index;
    }

    public final Object component2() {
        return this.value;
    }

    public final c0 copy(int i8, Object obj) {
        return new c0(i8, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.index == c0Var.index && kotlin.jvm.internal.s.areEqual(this.value, c0Var.value);
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i8 = this.index * 31;
        Object obj = this.value;
        return i8 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
    }
}
