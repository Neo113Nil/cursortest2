package com.realsil.sdk.core.d;

import android.os.Handler;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15649a;

    public c(f fVar) {
        this.f15649a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f fVar = this.f15649a;
        if (timeInMillis < fVar.f15664l) {
            fVar.f15664l = 0L;
        }
        long j8 = timeInMillis - fVar.f15664l;
        int i8 = fVar.f15662j;
        if (i8 == 1) {
            if (j8 > 30000) {
                Locale locale = Locale.US;
                ZLogger.d("no scan response received after start scan for 30000 ms");
                this.f15649a.b();
                return;
            }
            return;
        }
        if (i8 == 2) {
            if (j8 > 30000) {
                Locale locale2 = Locale.US;
                ZLogger.d("exceed 30000 ms , no scan response received since last time");
                this.f15649a.b();
                return;
            } else {
                Handler handler = fVar.f15660h;
                if (handler == null) {
                    ZLogger.v(fVar.f15654b, "mHandler == null");
                    return;
                } else {
                    handler.removeCallbacksAndMessages(fVar.f15668p);
                    fVar.f15660h.postDelayed(fVar.f15668p, fVar.f15657e.getScanPeriod());
                    return;
                }
            }
        }
        ZLogger.v(fVar.f15654b, "ignore state:" + this.f15649a.f15662j);
        f fVar2 = this.f15649a;
        Handler handler2 = fVar2.f15660h;
        if (handler2 == null) {
            ZLogger.v(fVar2.f15654b, "mHandler == null");
        } else {
            handler2.removeCallbacksAndMessages(fVar2.f15668p);
            fVar2.f15660h.postDelayed(fVar2.f15668p, fVar2.f15657e.getScanPeriod());
        }
    }
}
