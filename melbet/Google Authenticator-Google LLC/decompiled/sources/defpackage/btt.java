package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import com.google.android.apps.authenticator2.main.CountdownIndicatorView;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btt {
    public final Paint a = new Paint(1);
    public final Context b;
    public final bwo c;
    public RectF d;
    private final CountdownIndicatorView e;

    public btt(Context context, CountdownIndicatorView countdownIndicatorView, bwo bwoVar, hvm hvmVar) {
        this.b = context;
        this.e = countdownIndicatorView;
        this.c = bwoVar;
        this.d = new RectF(1.0f, 1.0f, countdownIndicatorView.getWidth() - 1, countdownIndicatorView.getHeight() - 1);
        avl avlVar = new avl((Object) this, (Object) bwoVar, 7, (char[]) null);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
        hvw hvwVar = new hvw();
        AtomicReference atomicReference = new AtomicReference(null);
        a.j(atomicReference, hvmVar.a(new gye(hvwVar, avlVar, atomicReference, hvmVar, elapsedRealtime, 1000L), 0L, timeUnit));
        hvwVar.c(new gfm(atomicReference, 18), huf.a);
    }

    public final void a() {
        this.e.invalidate();
    }
}
