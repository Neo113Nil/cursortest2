package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrf implements jrq {
    private final Service a;
    private Object b;

    public jrf(Service service) {
        this.a = service;
    }

    @Override // defpackage.jrq
    public final Object C() {
        if (this.b == null) {
            Service service = this.a;
            Application application = service.getApplication();
            iwi.a(application instanceof jrq, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            boe v = ((jre) imq.a(application, jre.class)).v();
            v.a = service;
            iwm.a(v.a, Service.class);
            this.b = new bnj((bnl) v.b, (Service) v.a);
        }
        return this.b;
    }
}
