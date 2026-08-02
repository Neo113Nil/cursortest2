package W;

import a.AbstractC0124a;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f3256b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3257a;

    public F(Handler handler) {
        this.f3257a = handler;
    }

    public static E b() {
        E e4;
        ArrayList arrayList = f3256b;
        synchronized (arrayList) {
            try {
                e4 = arrayList.isEmpty() ? new E() : (E) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return e4;
    }

    public final E a(int i4, Object obj) {
        E b4 = b();
        b4.f3255a = this.f3257a.obtainMessage(i4, obj);
        return b4;
    }

    public final boolean c(Runnable runnable) {
        return this.f3257a.post(runnable);
    }

    public final void d(int i4) {
        AbstractC0124a.h(i4 != 0);
        this.f3257a.removeMessages(i4);
    }

    public final boolean e(int i4) {
        return this.f3257a.sendEmptyMessage(i4);
    }
}
