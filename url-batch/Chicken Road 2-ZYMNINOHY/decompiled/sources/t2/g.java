package t2;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15414a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f15415b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15416c;

    /* renamed from: d, reason: collision with root package name */
    public final f f15417d;

    public g(Executor executor, f fVar, int i4) {
        this.f15414a = i4;
        switch (i4) {
            case 1:
                this.f15416c = new Object();
                this.f15415b = executor;
                this.f15417d = fVar;
                break;
            default:
                this.f15416c = new Object();
                this.f15415b = executor;
                this.f15417d = fVar;
                break;
        }
    }

    @Override // t2.h
    public final void a(Task task) {
        switch (this.f15414a) {
            case 0:
                if (((j) task).f15421d) {
                    synchronized (this.f15416c) {
                    }
                    this.f15415b.execute(new B.b(19, this));
                    return;
                }
                return;
            default:
                if (task.c() || ((j) task).f15421d) {
                    return;
                }
                synchronized (this.f15416c) {
                }
                this.f15415b.execute(new B.a(this, task, 20, false));
                return;
        }
    }
}
