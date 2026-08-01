package m;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import m.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f6185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f6186d;

    public u(y yVar, int i3, int i10, WeakReference weakReference) {
        this.f6186d = yVar;
        this.f6183a = i3;
        this.f6184b = i10;
        this.f6185c = weakReference;
    }

    public final void a(final int i3) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: g3.j
            @Override // java.lang.Runnable
            public final void run() {
                u.this.b(i3);
            }
        });
    }

    public final void c(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f6183a) != -1) {
            typeface = x.a(typeface, i3, (this.f6184b & 2) != 0);
        }
        y yVar = this.f6186d;
        if (yVar.f6216m) {
            yVar.f6215l = typeface;
            TextView textView = (TextView) this.f6185c.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i10 = yVar.j;
                if (isAttachedToWindow) {
                    textView.post(new b6.c(i10, 1, textView, typeface));
                } else {
                    textView.setTypeface(typeface, i10);
                }
            }
        }
    }

    public final void b(int i3) {
    }
}
