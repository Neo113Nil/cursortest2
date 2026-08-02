package W;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public Message f3255a;

    public final void a() {
        this.f3255a = null;
        ArrayList arrayList = F.f3256b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        Message message = this.f3255a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
