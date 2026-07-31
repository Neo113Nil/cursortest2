package x1;

import android.os.Build;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        o.e0 e0Var = t.L0;
        synchronized (e0Var) {
            try {
                int i = 0;
                if (Build.VERSION.SDK_INT < 30) {
                    Object[] objArr = e0Var.f5442a;
                    int i8 = e0Var.f5443b;
                    while (i < i8) {
                        t tVar = (t) objArr[i];
                        boolean showLayoutBounds = tVar.getShowLayoutBounds();
                        Class cls = t.I0;
                        tVar.setShowLayoutBounds(g0.l());
                        if (showLayoutBounds != tVar.getShowLayoutBounds()) {
                            t.m(tVar.getRoot());
                        }
                        i++;
                    }
                } else {
                    Object[] objArr2 = e0Var.f5442a;
                    int i9 = e0Var.f5443b;
                    while (i < i9) {
                        t.m(((t) objArr2[i]).getRoot());
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
