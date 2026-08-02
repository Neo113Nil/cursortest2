package androidx.work;

import android.content.Context;
import defpackage.aki;
import defpackage.arz;
import defpackage.asp;
import defpackage.hvi;
import defpackage.kqj;
import defpackage.kqn;
import defpackage.ksp;
import defpackage.kvj;
import defpackage.kww;
import defpackage.yn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class CoroutineWorker extends asp {
    private final WorkerParameters d;
    private final kvj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.d = workerParameters;
        this.e = arz.a;
    }

    @Override // defpackage.asp
    public final hvi a() {
        return yn.g(this.e.plus(new kww()), new aki(this, (kqj) null, 3));
    }

    @Override // defpackage.asp
    public final hvi b() {
        kqn kqnVar = this.e;
        if (ksp.b(kqnVar, arz.a)) {
            kqnVar = this.d.e;
        }
        kqnVar.getClass();
        return yn.g(kqnVar.plus(new kww()), new aki(this, (kqj) null, 4, (byte[]) null));
    }

    public abstract Object c(kqj kqjVar);
}
