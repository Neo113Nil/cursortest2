package androidx.work;

import android.content.Context;
import defpackage.aji;
import defpackage.asp;
import defpackage.hvi;
import defpackage.nb;
import defpackage.yo;
import defpackage.zx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class Worker extends asp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.asp
    public final hvi a() {
        return zx.e(g(), new aji(6));
    }

    @Override // defpackage.asp
    public final hvi b() {
        return zx.e(g(), new nb(this, 12));
    }

    public abstract yo c();
}
