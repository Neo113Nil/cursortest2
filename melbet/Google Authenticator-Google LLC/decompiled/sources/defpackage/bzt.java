package defpackage;

import android.app.Service;
import com.google.android.apps.authenticator2.osmigrationtargetservice.TargetEndpointService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bzt extends aeu implements jrr {
    private volatile jrf a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.jrq
    public final Object C() {
        return b().C();
    }

    @Override // defpackage.jrr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jrf b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new jrf(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.aeu, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            Service service = ((bnj) C()).a;
            ((TargetEndpointService) this).a = new cka(jrv.a(jsd.a));
        }
        super.onCreate();
    }
}
