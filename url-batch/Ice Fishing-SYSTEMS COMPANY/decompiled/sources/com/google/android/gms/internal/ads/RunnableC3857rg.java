package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.widget.ImageView;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3857rg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34049n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3965tg f34050u;

    public /* synthetic */ RunnableC3857rg(int i, C3965tg c3965tg, boolean z8) {
        this.f34049n = i;
        this.f34050u = c3965tg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34049n) {
            case 0:
                this.f34050u.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.f34050u.c("surfaceDestroyed", new String[0]);
                break;
            case 2:
                this.f34050u.c("firstFrameRendered", new String[0]);
                break;
            default:
                C3965tg c3965tg = this.f34050u;
                if (c3965tg.f34426A) {
                    ImageView imageView = c3965tg.J;
                    if (imageView.getParent() != null) {
                        c3965tg.f34437u.removeView(imageView);
                    }
                }
                AbstractC3804qg abstractC3804qg = c3965tg.f34442z;
                if (abstractC3804qg != null && c3965tg.f34434I != null) {
                    p2.j jVar = p2.j.f39798C;
                    jVar.f39810k.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (abstractC3804qg.getBitmap(c3965tg.f34434I) != null) {
                        c3965tg.f34435K = true;
                    }
                    jVar.f39810k.getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (t2.C.m()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
                        sb.append("Spinner frame grab took ");
                        sb.append(elapsedRealtime2);
                        sb.append("ms");
                        t2.C.k(sb.toString());
                    }
                    if (elapsedRealtime2 > c3965tg.f34441y) {
                        u2.i.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        c3965tg.f34429D = false;
                        c3965tg.f34434I = null;
                        C3636na c3636na = c3965tg.f34439w;
                        if (c3636na != null) {
                            c3636na.c("spinner_jank", Long.toString(elapsedRealtime2));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public RunnableC3857rg(C3965tg c3965tg, int i) {
        this.f34049n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c3965tg);
                this.f34050u = c3965tg;
                break;
            default:
                Objects.requireNonNull(c3965tg);
                this.f34050u = c3965tg;
                break;
        }
    }
}
