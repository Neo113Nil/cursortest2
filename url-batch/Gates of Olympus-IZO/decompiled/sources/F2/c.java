package F2;

import I2.l;
import M1.B;
import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import u0.S;

/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1490a;

    public /* synthetic */ c(int i3) {
        this.f1490a = i3;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1490a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(B2.c.f419e);
                return simpleDateFormat;
            case 1:
                return new Random();
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                S s3 = new S(choreographer, B.v(myLooper));
                return l.M(s3, s3.f8244o);
        }
    }
}
