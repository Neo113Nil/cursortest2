package w7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements d, c, b, OnCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final CountDownLatch f10120d;

    public /* synthetic */ i() {
        this.f10120d = new CountDownLatch(1);
    }

    @Override // w7.b
    public void a() {
        this.f10120d.countDown();
    }

    @Override // w7.d
    public void b(Object obj) {
        this.f10120d.countDown();
    }

    @Override // w7.c
    public void d(Exception exc) {
        this.f10120d.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        this.f10120d.countDown();
    }
}
