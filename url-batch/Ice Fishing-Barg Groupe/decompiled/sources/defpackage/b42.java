package defpackage;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class b42 implements e70, gy1, vp2 {
    public Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public b42(long[] jArr) {
        g81 g81Var;
        this.rtx2ld2ELZv4 = 2;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            g81Var = new g81(copyOf.length);
            int i = g81Var.lS5Rgt96tfkO;
            if (i < 0) {
                throw new IndexOutOfBoundsException("");
            }
            if (copyOf.length != 0) {
                int length = copyOf.length + i;
                long[] jArr2 = g81Var.PxuCJdSBwIXG;
                if (jArr2.length < length) {
                    g81Var.PxuCJdSBwIXG = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = g81Var.PxuCJdSBwIXG;
                int i2 = g81Var.lS5Rgt96tfkO;
                if (i != i2) {
                    na.JTxCbbCwomzt(jArr3, jArr3, copyOf.length + i, i, i2);
                }
                na.JTxCbbCwomzt(copyOf, jArr3, i, 0, copyOf.length);
                g81Var.lS5Rgt96tfkO += copyOf.length;
            }
        } else {
            g81Var = new g81();
        }
        this.OPXfSBeufaJ8 = g81Var;
    }

    public void OPXfSBeufaJ8() {
        View view = (View) this.OPXfSBeufaJ8;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.vp2, defpackage.sp2
    public boolean PxuCJdSBwIXG() {
        ((e0) this.OPXfSBeufaJ8).getClass();
        return false;
    }

    @Override // defpackage.sp2
    public o8 QrzZRwfaDlRX(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return ((e0) this.OPXfSBeufaJ8).QrzZRwfaDlRX(j, o8Var, o8Var2, o8Var3);
    }

    public long RAsUl2FVSrh6(long j) {
        jx jxVar = (jx) this.OPXfSBeufaJ8;
        jxVar.getClass();
        if (yp2.lS5Rgt96tfkO(j) <= 0.0f || yp2.TSizfFm2Yiuu(j) <= 0.0f) {
            ep0.lS5Rgt96tfkO("maximumVelocity should be a positive value. You specified=" + ((Object) yp2.RAsUl2FVSrh6(j)));
        }
        return kj0.PxuCJdSBwIXG(jxVar.PxuCJdSBwIXG.lS5Rgt96tfkO(yp2.lS5Rgt96tfkO(j)), jxVar.lS5Rgt96tfkO.lS5Rgt96tfkO(yp2.TSizfFm2Yiuu(j)));
    }

    @Override // defpackage.gy1
    public fy1 TSizfFm2Yiuu(String str) {
        str.getClass();
        tb2 tb2Var = (tb2) this.OPXfSBeufaJ8;
        String databaseName = tb2Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                u9.e9gEMXR7LXtO(o0.x50lh2ztY7Y5("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !ia2.hnJvRxDXo0hm(databaseName).equals(ia2.hnJvRxDXo0hm(str))) {
            u9.cpQdD2nAriOS("This driver is configured to open a database named '", tb2Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new ob2(tb2Var.EpkonXwzFgDB());
    }

    @Override // defpackage.e70
    public ls1 Y1f8riQaR6yg() {
        vx1 lS5Rgt96tfkO;
        IOException iOException = null;
        while (!((rs1) this.OPXfSBeufaJ8).x50lh2ztY7Y5.ZbWwgt3aGe7A) {
            try {
                lS5Rgt96tfkO = ((rs1) this.OPXfSBeufaJ8).lS5Rgt96tfkO();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    f2.RAsUl2FVSrh6(iOException, e);
                }
                if (!((rs1) this.OPXfSBeufaJ8).PxuCJdSBwIXG(null)) {
                    throw iOException;
                }
            }
            if (!lS5Rgt96tfkO.e9gEMXR7LXtO()) {
                ux1 RAsUl2FVSrh6 = lS5Rgt96tfkO.RAsUl2FVSrh6();
                if (RAsUl2FVSrh6.lS5Rgt96tfkO == null && RAsUl2FVSrh6.TSizfFm2Yiuu == null) {
                    RAsUl2FVSrh6 = lS5Rgt96tfkO.TSizfFm2Yiuu();
                }
                vx1 vx1Var = RAsUl2FVSrh6.lS5Rgt96tfkO;
                Throwable th = RAsUl2FVSrh6.TSizfFm2Yiuu;
                if (th != null) {
                    throw th;
                }
                if (vx1Var != null) {
                    ((rs1) this.OPXfSBeufaJ8).BRwzKIf41E4i.addFirst(vx1Var);
                }
            }
            return lS5Rgt96tfkO.Y1f8riQaR6yg();
        }
        u9.S9EYkSpbGuxq("Canceled");
        return null;
    }

    @Override // defpackage.gy1
    public boolean a92UlCVFR9N8() {
        return true;
    }

    public void cpQdD2nAriOS() {
        View view;
        View view2 = (View) this.OPXfSBeufaJ8;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new BRwzKIf41E4i(10, view));
    }

    @Override // defpackage.e70
    public rs1 e9gEMXR7LXtO() {
        return (rs1) this.OPXfSBeufaJ8;
    }

    @Override // defpackage.sp2
    public o8 gPXPFXrUH4XX(o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return ((e0) this.OPXfSBeufaJ8).gPXPFXrUH4XX(o8Var, o8Var2, o8Var3);
    }

    @Override // defpackage.sp2
    public long lS5Rgt96tfkO(o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return ((e0) this.OPXfSBeufaJ8).lS5Rgt96tfkO(o8Var, o8Var2, o8Var3);
    }

    public m80 rtx2ld2ELZv4(int i) {
        switch (this.rtx2ld2ELZv4) {
            case 12:
                return ((s80[]) this.OPXfSBeufaJ8)[i];
            case 13:
                return (s80) this.OPXfSBeufaJ8;
            default:
                return (m80) this.OPXfSBeufaJ8;
        }
    }

    public Object wdg6QnbFHrFF(ui uiVar, ae0 ae0Var) {
        x52 x52Var;
        v32 v32Var;
        int i;
        if (((to) this.OPXfSBeufaJ8) == null) {
            gp1.lS5Rgt96tfkO("Called runAndWatch on a manager that has been disposed of");
        }
        to toVar = (to) this.OPXfSBeufaJ8;
        if ((toVar instanceof x52) && (v32Var = (x52Var = (x52) toVar).a92UlCVFR9N8) != null && !v32Var.equals(uiVar)) {
            w71 w71Var = new w71();
            v32 v32Var2 = x52Var.a92UlCVFR9N8;
            if (v32Var2 == null) {
                gp1.lS5Rgt96tfkO("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            w81 w81Var = x52Var.Y1f8riQaR6yg;
            ArrayList arrayList = w71Var.TSizfFm2Yiuu;
            if (w81Var == null) {
                Object obj = x52Var.lS5Rgt96tfkO;
                obj.getClass();
                arrayList.add(new t71(obj, v32Var2));
            } else {
                Object[] objArr = w81Var.lS5Rgt96tfkO;
                long[] jArr = w81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new t71(objArr[(i2 << 3) + i5], v32Var2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            w71Var.Y1f8riQaR6yg();
            x52Var.e9gEMXR7LXtO();
            this.OPXfSBeufaJ8 = w71Var;
        }
        to toVar2 = (to) this.OPXfSBeufaJ8;
        toVar2.getClass();
        i72 i72Var = j72.Companion;
        le0 rtx2ld2ELZv4 = toVar2.rtx2ld2ELZv4(uiVar);
        i72Var.getClass();
        j72 S9EYkSpbGuxq = s72.OPXfSBeufaJ8().S9EYkSpbGuxq(rtx2ld2ELZv4);
        toVar2.TSizfFm2Yiuu(uiVar);
        try {
            j72 wdg6QnbFHrFF = S9EYkSpbGuxq.wdg6QnbFHrFF();
            try {
                Object PxuCJdSBwIXG = ae0Var.PxuCJdSBwIXG();
                S9EYkSpbGuxq.TSizfFm2Yiuu();
                toVar2.Y1f8riQaR6yg();
                return PxuCJdSBwIXG;
            } finally {
                j72.BRwzKIf41E4i(wdg6QnbFHrFF);
            }
        } catch (Throwable th) {
            S9EYkSpbGuxq.TSizfFm2Yiuu();
            throw th;
        }
    }

    @Override // defpackage.sp2
    public o8 x50lh2ztY7Y5(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return ((e0) this.OPXfSBeufaJ8).x50lh2ztY7Y5(j, o8Var, o8Var2, o8Var3);
    }

    public /* synthetic */ b42(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    public b42(hy hyVar) {
        this.rtx2ld2ELZv4 = 5;
        this.OPXfSBeufaJ8 = new i80(u82.PxuCJdSBwIXG, hyVar);
    }

    public b42(tb2 tb2Var) {
        this.rtx2ld2ELZv4 = 6;
        tb2Var.getClass();
        this.OPXfSBeufaJ8 = tb2Var;
    }

    public b42(View view) {
        this.rtx2ld2ELZv4 = 4;
        if (Build.VERSION.SDK_INT >= 30) {
            l82 l82Var = new l82(3, view);
            l82Var.wdg6QnbFHrFF = view;
            this.OPXfSBeufaJ8 = l82Var;
            return;
        }
        this.OPXfSBeufaJ8 = new b42(3, view);
    }

    public b42() {
        this.rtx2ld2ELZv4 = 16;
        this.OPXfSBeufaJ8 = new jx();
    }

    public /* synthetic */ b42(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    public b42(lv2 lv2Var) {
        this.rtx2ld2ELZv4 = 9;
        this.OPXfSBeufaJ8 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), lv2Var);
    }

    public b42(float f, float f2, o8 o8Var) {
        b42 b42Var;
        this.rtx2ld2ELZv4 = 15;
        int i = tp2.PxuCJdSBwIXG;
        if (o8Var != null) {
            b42Var = new b42(o8Var, f, f2);
        } else {
            b42Var = new b42(f, f2);
        }
        this.OPXfSBeufaJ8 = new e0(9, b42Var);
    }

    public b42(o8 o8Var, float f, float f2) {
        this.rtx2ld2ELZv4 = 12;
        int lS5Rgt96tfkO = o8Var.lS5Rgt96tfkO();
        s80[] s80VarArr = new s80[lS5Rgt96tfkO];
        for (int i = 0; i < lS5Rgt96tfkO; i++) {
            s80VarArr[i] = new s80(f, f2, o8Var.PxuCJdSBwIXG(i));
        }
        this.OPXfSBeufaJ8 = s80VarArr;
    }

    public b42(float f, float f2) {
        this.rtx2ld2ELZv4 = 13;
        this.OPXfSBeufaJ8 = new s80(f, f2, 0.01f);
    }
}
