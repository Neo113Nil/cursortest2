package n2;

import k2.C0536h;
import o2.AbstractC0753b;
import o2.AbstractC0755d;

/* renamed from: n2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683H extends AbstractC0755d {

    /* renamed from: a, reason: collision with root package name */
    public long f6296a;

    /* renamed from: b, reason: collision with root package name */
    public C0536h f6297b;

    @Override // o2.AbstractC0755d
    public final boolean a(AbstractC0753b abstractC0753b) {
        C0681F c0681f = (C0681F) abstractC0753b;
        if (this.f6296a >= 0) {
            return false;
        }
        long j3 = c0681f.f6289l;
        if (j3 < c0681f.f6290m) {
            c0681f.f6290m = j3;
        }
        this.f6296a = j3;
        return true;
    }

    @Override // o2.AbstractC0755d
    public final P1.d[] b(AbstractC0753b abstractC0753b) {
        long j3 = this.f6296a;
        this.f6296a = -1L;
        this.f6297b = null;
        return ((C0681F) abstractC0753b).u(j3);
    }
}
