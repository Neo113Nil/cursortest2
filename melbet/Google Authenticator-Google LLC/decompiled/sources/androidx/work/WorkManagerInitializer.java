package androidx.work;

import android.content.Context;
import defpackage.anl;
import defpackage.aru;
import defpackage.arv;
import defpackage.asq;
import defpackage.atd;
import defpackage.auy;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkManagerInitializer implements anl {
    static {
        asq.b("WrkMgrInitializer");
    }

    @Override // defpackage.anl
    public final /* bridge */ /* synthetic */ Object a(Context context) {
        asq.a();
        arv arvVar = new arv(new aru());
        context.getClass();
        auy.j(context, arvVar);
        return atd.d(context);
    }

    @Override // defpackage.anl
    public final List b() {
        return Collections.EMPTY_LIST;
    }
}
