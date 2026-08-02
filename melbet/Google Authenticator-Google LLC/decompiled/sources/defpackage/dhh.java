package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhh implements Serializable, dhr {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.dhr
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dhr.class;
    }

    @Override // defpackage.dhr
    public final int b() {
        return 1000;
    }

    @Override // defpackage.dhr
    public final int c() {
        return 1;
    }

    @Override // defpackage.dhr
    public final int d() {
        return 1;
    }

    @Override // defpackage.dhr
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhr) {
            dhr dhrVar = (dhr) obj;
            dhrVar.d();
            dhrVar.e();
            dhrVar.a();
            dhrVar.b();
            dhrVar.c();
            dhrVar.f();
            if (a.equals(dhrVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dhr
    public final long f() {
        return 1L;
    }

    @Override // defpackage.dhr
    public final TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
