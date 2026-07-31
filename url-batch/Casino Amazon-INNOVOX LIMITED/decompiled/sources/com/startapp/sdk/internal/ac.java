package com.startapp.sdk.internal;

import android.os.SystemClock;
import android.widget.TextView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ac implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cc f170a;

    public ac(cc ccVar) {
        this.f170a = ccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = (this.f170a.f200a.q * 1000) - SystemClock.uptimeMillis();
        cc ccVar = this.f170a;
        long j = uptimeMillis + ccVar.f200a.w;
        TextView textView = ccVar.g;
        if (textView != null) {
            long j2 = j / 1000;
            if (j2 > 0 && j % 1000 < 100) {
                j2--;
            }
            textView.setText(String.valueOf(j2));
        }
        cc ccVar2 = this.f170a;
        if (j >= 1000) {
            long j3 = j % 1000;
            ccVar2.k.postDelayed(this, j3 != 0 ? j3 : 1000L);
        } else {
            if (ccVar2.g != null) {
                ccVar2.h.setVisibility(8);
                this.f170a.g.setVisibility(8);
            }
            this.f170a.f200a.s();
        }
    }
}
