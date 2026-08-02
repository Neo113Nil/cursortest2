package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuc implements aec {
    public final gbh a;
    public ftp b;
    private final List c;
    private final glu d;

    public fuc(glu gluVar) {
        gluVar.getClass();
        this.d = gluVar;
        this.a = new gbh("KeepStateCallbacksHandler");
        this.c = new ArrayList();
        gluVar.L().a(this);
        gluVar.aE().b("tiktok_keep_state_callback_handler", new bn(this, 6));
    }

    @Override // defpackage.aec
    public final void a(aer aerVar) {
        glu gluVar = this.d;
        ftp ftpVar = null;
        Bundle a = gluVar.aE().d() ? gluVar.aE().a("tiktok_keep_state_callback_handler") : null;
        if (a != null) {
            this.a.e(a);
            if (a.containsKey("KSCH$AC$callbacks_id")) {
                if (!a.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                ftpVar = new ftp(a.getInt("KSCH$AC$callbacks_id"), a.getInt("KSCH$AC$callbacks_state"));
            } else if (a.containsKey("KSCH$AC$callbacks_state")) {
                throw new IllegalStateException("Check failed.");
            }
            this.b = ftpVar;
        }
        List list = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.d((fub) it.next());
        }
        list.clear();
    }

    public final void g() {
        fao.c();
        ftp ftpVar = this.b;
        if (ftpVar == null) {
            return;
        }
        if (ftpVar.b == 1) {
            ((fub) this.a.b(ftpVar.a)).a();
        }
        this.b = null;
    }

    public final void h() {
        fao.c();
        ftp ftpVar = this.b;
        ftpVar.getClass();
        int i = ftpVar.a;
        int i2 = ftpVar.b;
        fub fubVar = (fub) this.a.b(i);
        if (i2 == 1) {
            fubVar.a();
        }
        fubVar.c();
        this.b = null;
    }

    @Override // defpackage.aec
    public final /* synthetic */ void b(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void e(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
