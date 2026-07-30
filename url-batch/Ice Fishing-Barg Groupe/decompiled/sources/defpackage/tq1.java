package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class tq1 implements Runnable {
    public final /* synthetic */ Context OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ tq1(Context context, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.rtx2ld2ELZv4;
        int i2 = 1;
        Context context = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new tq1(context, i2));
                break;
            default:
                zv.ngxnMNrpiKat(context, new s9(1), zv.cpQdD2nAriOS, false);
                break;
        }
    }
}
