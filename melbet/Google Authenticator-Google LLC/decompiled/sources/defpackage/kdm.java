package defpackage;

import android.os.IBinder;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdm extends kdo {
    private final klh d;

    public kdm(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new klh(executor);
    }

    @Override // defpackage.kdo
    public final void a(int i, kdq kdqVar) {
        this.d.execute(new mr(this, i, kdqVar.a(), 11));
        kdqVar.b();
    }
}
