package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cc0 implements w40 {
    public final Context PxuCJdSBwIXG;
    public ThreadPoolExecutor RAsUl2FVSrh6;
    public final fb0 TSizfFm2Yiuu;
    public final Object Y1f8riQaR6yg = new Object();
    public ThreadPoolExecutor a92UlCVFR9N8;
    public Handler e9gEMXR7LXtO;
    public final bc0 lS5Rgt96tfkO;
    public bs0 rtx2ld2ELZv4;

    public cc0(Context context, bc0 bc0Var) {
        ki0.RfyTYNmI9Srp(context, "Context cannot be null");
        this.PxuCJdSBwIXG = context.getApplicationContext();
        this.lS5Rgt96tfkO = bc0Var;
        this.TSizfFm2Yiuu = dc0.Y1f8riQaR6yg;
    }

    @Override // defpackage.w40
    public final void PxuCJdSBwIXG(bs0 bs0Var) {
        synchronized (this.Y1f8riQaR6yg) {
            this.rtx2ld2ELZv4 = bs0Var;
        }
        synchronized (this.Y1f8riQaR6yg) {
            try {
                if (this.rtx2ld2ELZv4 == null) {
                    return;
                }
                if (this.a92UlCVFR9N8 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new hq("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.RAsUl2FVSrh6 = threadPoolExecutor;
                    this.a92UlCVFR9N8 = threadPoolExecutor;
                }
                this.a92UlCVFR9N8.execute(new BRwzKIf41E4i(6, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zc0 TSizfFm2Yiuu() {
        try {
            fb0 fb0Var = this.TSizfFm2Yiuu;
            Context context = this.PxuCJdSBwIXG;
            bc0 bc0Var = this.lS5Rgt96tfkO;
            fb0Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{bc0Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            um PxuCJdSBwIXG = ac0.PxuCJdSBwIXG(context, Collections.unmodifiableList(arrayList));
            int i = PxuCJdSBwIXG.lS5Rgt96tfkO;
            if (i != 0) {
                throw new RuntimeException(o0.OPXfSBeufaJ8(i, "fetchFonts failed (", ")"));
            }
            zc0[] zc0VarArr = (zc0[]) ((List) PxuCJdSBwIXG.TSizfFm2Yiuu).get(0);
            if (zc0VarArr == null || zc0VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return zc0VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void lS5Rgt96tfkO() {
        synchronized (this.Y1f8riQaR6yg) {
            try {
                this.rtx2ld2ELZv4 = null;
                Handler handler = this.e9gEMXR7LXtO;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e9gEMXR7LXtO = null;
                ThreadPoolExecutor threadPoolExecutor = this.RAsUl2FVSrh6;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.a92UlCVFR9N8 = null;
                this.RAsUl2FVSrh6 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
