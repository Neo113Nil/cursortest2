package x0;

import d1.l;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class f extends b implements d1.f {

    /* renamed from: e, reason: collision with root package name */
    public final int f1235e;

    public f(v0.d dVar) {
        super(dVar);
        this.f1235e = 2;
    }

    @Override // d1.f
    public final int c() {
        return this.f1235e;
    }

    @Override // x0.b
    public final String toString() {
        if (this.f1230b != null) {
            return super.toString();
        }
        l.f95a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
