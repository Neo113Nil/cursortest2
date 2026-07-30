package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s6 extends ThreadLocal {
    public final /* synthetic */ int PxuCJdSBwIXG;

    public /* synthetic */ s6(int i) {
        this.PxuCJdSBwIXG = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    v6 v6Var = new v6(choreographer, ni0.r3s1LDPKFs1S(myLooper));
                    return f2.xfACYKDMU6Dj(v6Var, v6Var.RfyTYNmI9Srp);
                }
                u9.rtx2ld2ELZv4("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(mv2.PxuCJdSBwIXG);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
