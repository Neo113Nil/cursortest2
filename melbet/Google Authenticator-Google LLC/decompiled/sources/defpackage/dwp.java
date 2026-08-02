package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwp implements jrw {
    private final jsb a;
    private final jsb b;

    public dwp(jsb jsbVar, jsb jsbVar2) {
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final efx b() {
        Context b = ((jrk) this.a).b();
        ExecutorService executorService = (ExecutorService) this.b.b();
        executorService.getClass();
        return new efy(b, executorService);
    }
}
