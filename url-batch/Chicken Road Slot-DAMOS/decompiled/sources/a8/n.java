package a8;

import java.io.Serializable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements m, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final m f360d;

    /* renamed from: e, reason: collision with root package name */
    public volatile transient boolean f361e;

    /* renamed from: i, reason: collision with root package name */
    public transient Object f362i;

    public n(m mVar) {
        mVar.getClass();
        this.f360d = mVar;
    }

    @Override // a8.m
    public final Object get() {
        if (!this.f361e) {
            synchronized (this) {
                try {
                    if (!this.f361e) {
                        Object obj = this.f360d.get();
                        this.f362i = obj;
                        this.f361e = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f362i;
    }

    public final String toString() {
        Object obj;
        if (this.f361e) {
            String valueOf = String.valueOf(this.f362i);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.f360d;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
