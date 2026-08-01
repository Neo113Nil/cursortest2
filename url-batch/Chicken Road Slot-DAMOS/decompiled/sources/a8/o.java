package a8;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: d, reason: collision with root package name */
    public volatile m f363d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f364e;

    /* renamed from: i, reason: collision with root package name */
    public Object f365i;

    @Override // a8.m
    public final Object get() {
        if (!this.f364e) {
            synchronized (this) {
                try {
                    if (!this.f364e) {
                        m mVar = this.f363d;
                        Objects.requireNonNull(mVar);
                        Object obj = mVar.get();
                        this.f365i = obj;
                        this.f364e = true;
                        this.f363d = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f365i;
    }

    public final String toString() {
        Object obj = this.f363d;
        if (obj == null) {
            String valueOf = String.valueOf(this.f365i);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
