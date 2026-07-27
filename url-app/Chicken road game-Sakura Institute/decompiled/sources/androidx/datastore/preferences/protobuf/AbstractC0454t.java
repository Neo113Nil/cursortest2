package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0454t implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0456v f5405d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0456v f5406e;

    public AbstractC0454t(AbstractC0456v abstractC0456v) {
        this.f5405d = abstractC0456v;
        if (abstractC0456v.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5406e = abstractC0456v.k();
    }

    public final AbstractC0456v a() {
        AbstractC0456v b4 = b();
        b4.getClass();
        if (AbstractC0456v.h(b4, true)) {
            return b4;
        }
        throw new i0();
    }

    public final AbstractC0456v b() {
        if (!this.f5406e.i()) {
            return this.f5406e;
        }
        AbstractC0456v abstractC0456v = this.f5406e;
        abstractC0456v.getClass();
        W w4 = W.f5303c;
        w4.getClass();
        w4.a(abstractC0456v.getClass()).h(abstractC0456v);
        abstractC0456v.j();
        return this.f5406e;
    }

    public final void c() {
        if (this.f5406e.i()) {
            return;
        }
        AbstractC0456v k4 = this.f5405d.k();
        AbstractC0456v abstractC0456v = this.f5406e;
        W w4 = W.f5303c;
        w4.getClass();
        w4.a(k4.getClass()).b(k4, abstractC0456v);
        this.f5406e = k4;
    }

    public final Object clone() {
        AbstractC0454t abstractC0454t = (AbstractC0454t) this.f5405d.e(5);
        abstractC0454t.f5406e = b();
        return abstractC0454t;
    }
}
