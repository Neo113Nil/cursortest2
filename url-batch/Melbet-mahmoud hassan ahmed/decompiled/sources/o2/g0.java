package o2;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import o2.n;

/* loaded from: classes.dex */
final class g0 implements n {

    /* renamed from: b, reason: collision with root package name */
    private static final List<b> f19719b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f19720a;

    private static final class b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f19721a;

        /* renamed from: b, reason: collision with root package name */
        private g0 f19722b;

        private b() {
        }

        private void b() {
            this.f19721a = null;
            this.f19722b = null;
            g0.n(this);
        }

        @Override // o2.n.a
        public void a() {
            ((Message) o2.a.e(this.f19721a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) o2.a.e(this.f19721a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, g0 g0Var) {
            this.f19721a = message;
            this.f19722b = g0Var;
            return this;
        }
    }

    public g0(Handler handler) {
        this.f19720a = handler;
    }

    private static b m() {
        b bVar;
        List<b> list = f19719b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(b bVar) {
        List<b> list = f19719b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // o2.n
    public boolean a(int i7) {
        return this.f19720a.hasMessages(i7);
    }

    @Override // o2.n
    public n.a b(int i7, int i8, int i9) {
        return m().d(this.f19720a.obtainMessage(i7, i8, i9), this);
    }

    @Override // o2.n
    public boolean c(int i7) {
        return this.f19720a.sendEmptyMessage(i7);
    }

    @Override // o2.n
    public n.a d(int i7, int i8, int i9, Object obj) {
        return m().d(this.f19720a.obtainMessage(i7, i8, i9, obj), this);
    }

    @Override // o2.n
    public boolean e(n.a aVar) {
        return ((b) aVar).c(this.f19720a);
    }

    @Override // o2.n
    public boolean f(int i7, long j7) {
        return this.f19720a.sendEmptyMessageAtTime(i7, j7);
    }

    @Override // o2.n
    public void g(int i7) {
        this.f19720a.removeMessages(i7);
    }

    @Override // o2.n
    public n.a h(int i7, Object obj) {
        return m().d(this.f19720a.obtainMessage(i7, obj), this);
    }

    @Override // o2.n
    public void i(Object obj) {
        this.f19720a.removeCallbacksAndMessages(obj);
    }

    @Override // o2.n
    public boolean j(Runnable runnable) {
        return this.f19720a.post(runnable);
    }

    @Override // o2.n
    public n.a k(int i7) {
        return m().d(this.f19720a.obtainMessage(i7), this);
    }
}
