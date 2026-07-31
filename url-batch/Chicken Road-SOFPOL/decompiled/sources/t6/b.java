package t6;

import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import x1.g1;
import x1.m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6922a;

    public /* synthetic */ b(int i) {
        this.f6922a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f6922a) {
            case 0:
                return new Random();
            case 1:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                m0 m0Var = new m0(choreographer, m.a.n(myLooper));
                return a.a.v(m0Var, m0Var.f8508o);
            default:
                return new g1();
        }
    }
}
