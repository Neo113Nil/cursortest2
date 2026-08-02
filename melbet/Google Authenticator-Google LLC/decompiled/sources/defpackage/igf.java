package defpackage;

import android.app.Service;
import com.google.frameworks.client.data.android.server.tiktok.MainProcessEndpointService;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class igf extends aeu implements jrr {
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
            MainProcessEndpointService mainProcessEndpointService = (MainProcessEndpointService) this;
            bnj bnjVar = (bnj) C();
            Service service = bnjVar.a;
            bnl bnlVar = bnjVar.e;
            mainProcessEndpointService.a = new ifz(service, (ScheduledExecutorService) bnlVar.A.b(), (jyf) bnlVar.nJ.b(), gzp.h((List) bnlVar.nO.b()));
            mainProcessEndpointService.b = (kcf) bnlVar.nP.b();
            hjb hjbVar = hjb.a;
        }
        super.onCreate();
    }
}
