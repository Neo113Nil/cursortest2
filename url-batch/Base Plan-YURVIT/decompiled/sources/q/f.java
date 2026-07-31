package q;

import android.graphics.Typeface;
import i.C0172t;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0172t f2956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Typeface f2957f;

    public /* synthetic */ f(C0172t c0172t, Typeface typeface) {
        this.f2956e = c0172t;
        this.f2957f = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2956e.b(this.f2957f);
    }
}
