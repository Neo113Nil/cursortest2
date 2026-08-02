package com.startapp.sdk.internal;

import android.os.SystemClock;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class sc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uc f7563a;

    public sc(uc ucVar) {
        this.f7563a = ucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = (this.f7563a.f7697a.f7672q * 1000) - SystemClock.uptimeMillis();
        uc ucVar = this.f7563a;
        long j4 = uptimeMillis + ucVar.f7697a.f7832w;
        TextView textView = ucVar.f7703g;
        if (textView != null) {
            long j5 = j4 / 1000;
            if (j5 > 0 && j4 % 1000 < 100) {
                j5--;
            }
            textView.setText(String.valueOf(j5));
        }
        if (j4 >= 1000) {
            long j6 = j4 % 1000;
            this.f7563a.f7707k.postDelayed(this, j6 != 0 ? j6 : 1000L);
            return;
        }
        uc ucVar2 = this.f7563a;
        if (ucVar2.f7703g != null) {
            ucVar2.f7704h.setVisibility(8);
            this.f7563a.f7703g.setVisibility(8);
        }
        this.f7563a.f7697a.s();
    }
}
