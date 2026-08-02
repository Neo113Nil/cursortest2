package defpackage;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eoj implements ekz {
    final /* synthetic */ eok a;

    public eoj(eok eokVar) {
        this.a = eokVar;
    }

    @Override // defpackage.ekz
    public final void b(Activity activity) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.a.a;
            if (atomicReference.compareAndSet(activity, null)) {
                return;
            }
        } while (atomicReference.get() == activity);
    }

    @Override // defpackage.ekz
    public final void c(Activity activity) {
        this.a.a.set(activity);
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void f(int i) {
    }
}
