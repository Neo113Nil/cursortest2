package androidx.databinding;

import androidx.lifecycle.InterfaceC1354u;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class p extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    private final l f12113a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f12114b;

    /* renamed from: c, reason: collision with root package name */
    private Object f12115c;

    public p(o oVar, int i4, l lVar, ReferenceQueue referenceQueue) {
        super(oVar, referenceQueue);
        this.f12114b = i4;
        this.f12113a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected o a() {
        o oVar = (o) get();
        if (oVar == null) {
            e();
        }
        return oVar;
    }

    public Object b() {
        return this.f12115c;
    }

    public void c(InterfaceC1354u interfaceC1354u) {
        this.f12113a.a(interfaceC1354u);
    }

    public void d(Object obj) {
        e();
        this.f12115c = obj;
        if (obj != null) {
            this.f12113a.c(obj);
        }
    }

    public boolean e() {
        boolean z4;
        Object obj = this.f12115c;
        if (obj != null) {
            this.f12113a.b(obj);
            z4 = true;
        } else {
            z4 = false;
        }
        this.f12115c = null;
        return z4;
    }
}
