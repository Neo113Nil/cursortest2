package L2;

import android.os.Looper;
import android.view.Choreographer;
import h2.AbstractC0508a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import u0.W;

/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3410a;

    public /* synthetic */ c(int i3) {
        this.f3410a = i3;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f3410a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(H2.b.f2636e);
                return simpleDateFormat;
            case 1:
                return new Random();
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                W w2 = new W(choreographer, O2.d.G(myLooper));
                return AbstractC0508a.L(w2, w2.f9289o);
        }
    }
}
