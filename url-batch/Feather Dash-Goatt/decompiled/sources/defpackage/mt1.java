package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mt1 implements qr0, mr0, lr0, OnCompleteListener {
    public final CountDownLatch d;

    public /* synthetic */ mt1() {
        this.d = new CountDownLatch(1);
    }

    @Override // defpackage.lr0
    public void a() {
        this.d.countDown();
    }

    @Override // defpackage.mr0
    public void d(Exception exc) {
        this.d.countDown();
    }

    @Override // defpackage.qr0
    public void h(Object obj) {
        this.d.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        this.d.countDown();
    }
}
