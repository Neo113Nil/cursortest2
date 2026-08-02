package com.startapp.sdk.internal;

import android.os.SystemClock;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class sc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uc f4426a;

    public sc(uc ucVar) {
        this.f4426a = ucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = (this.f4426a.f4556a.f4532q * 1000) - SystemClock.uptimeMillis();
        uc ucVar = this.f4426a;
        long j3 = uptimeMillis + ucVar.f4556a.f4687w;
        TextView textView = ucVar.f4561g;
        if (textView != null) {
            long j4 = j3 / 1000;
            if (j4 > 0 && j3 % 1000 < 100) {
                j4--;
            }
            textView.setText(String.valueOf(j4));
        }
        if (j3 >= 1000) {
            long j5 = j3 % 1000;
            this.f4426a.f4565k.postDelayed(this, j5 != 0 ? j5 : 1000L);
            return;
        }
        uc ucVar2 = this.f4426a;
        if (ucVar2.f4561g != null) {
            ucVar2.f4562h.setVisibility(8);
            this.f4426a.f4561g.setVisibility(8);
        }
        this.f4426a.f4556a.s();
    }
}
