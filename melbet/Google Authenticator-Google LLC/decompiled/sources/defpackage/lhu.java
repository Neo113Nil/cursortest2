package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhu {
    private final Object a;

    public lhu(float f) {
        this.a = Float.valueOf(f);
    }

    private final void c(int i) {
        int i2;
        Object obj = this.a;
        if (obj instanceof Boolean) {
            i2 = 1;
        } else if (obj instanceof Long) {
            i2 = 2;
        } else if (obj instanceof Float) {
            i2 = 3;
        } else if (obj instanceof String) {
            i2 = 4;
        } else {
            if (!(obj instanceof jjq)) {
                throw new IllegalStateException("Unexpected flag value type: ".concat(String.valueOf(obj.getClass().getName())));
            }
            i2 = 5;
        }
        if (i == i2) {
            return;
        }
        throw new IllegalStateException("Attempted to access flag value as " + jax.d(i) + ", but actual type is " + jax.d(i2));
    }

    public final String a() {
        c(4);
        return (String) this.a;
    }

    public final boolean b() {
        c(1);
        return ((Boolean) this.a).booleanValue();
    }

    public final String toString() {
        return this.a.toString();
    }

    public lhu(Object obj) {
        this.a = obj;
    }

    public lhu(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public lhu(long j) {
        this.a = Long.valueOf(j);
    }
}
