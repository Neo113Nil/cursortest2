package u2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class n implements m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f15520a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m f15521b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f15522c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f15523d;

    public n(m mVar) {
        this.f15521b = mVar;
    }

    @Override // u2.m
    public final Object get() {
        if (!this.f15522c) {
            synchronized (this.f15520a) {
                try {
                    if (!this.f15522c) {
                        Object obj = this.f15521b.get();
                        this.f15523d = obj;
                        this.f15522c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f15523d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f15522c) {
            obj = "<supplier that returned " + this.f15523d + ">";
        } else {
            obj = this.f15521b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
