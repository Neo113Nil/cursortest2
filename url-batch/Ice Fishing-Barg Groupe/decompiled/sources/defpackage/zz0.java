package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zz0 {
    public ln0 OPXfSBeufaJ8;
    public final View PxuCJdSBwIXG;
    public vq2 RAsUl2FVSrh6;
    public le0 TSizfFm2Yiuu = new xy0(4);
    public le0 Y1f8riQaR6yg = new xy0(5);
    public eh2 a92UlCVFR9N8;
    public final uz0 cpQdD2nAriOS;
    public final nx0 dgRBjINgWbAK;
    public yz0 e9gEMXR7LXtO;
    public final op0 lS5Rgt96tfkO;
    public oh2 rtx2ld2ELZv4;
    public final ArrayList wdg6QnbFHrFF;
    public Rect x50lh2ztY7Y5;

    public zz0(View view, c4 c4Var, op0 op0Var) {
        this.PxuCJdSBwIXG = view;
        this.lS5Rgt96tfkO = op0Var;
        vi2.Companion.getClass();
        this.rtx2ld2ELZv4 = new oh2(4, vi2.lS5Rgt96tfkO, "");
        ln0.Companion.getClass();
        this.OPXfSBeufaJ8 = ln0.a92UlCVFR9N8;
        this.wdg6QnbFHrFF = new ArrayList();
        this.dgRBjINgWbAK = vi0.ryVscX7ZL4Ux(pz0.OPXfSBeufaJ8, new o5(19, this));
        this.cpQdD2nAriOS = new uz0(c4Var, op0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lt1 PxuCJdSBwIXG(EditorInfo editorInfo) {
        int i;
        lt1 lt1Var;
        int i2;
        oh2 oh2Var = this.rtx2ld2ELZv4;
        String str = oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8;
        long j = oh2Var.lS5Rgt96tfkO;
        ln0 ln0Var = this.OPXfSBeufaJ8;
        int i3 = ln0Var.Y1f8riQaR6yg;
        int i4 = ln0Var.TSizfFm2Yiuu;
        jn0.Companion.getClass();
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                u9.rtx2ld2ELZv4("invalid ImeAction");
                return null;
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        p21 p21Var = ln0Var.e9gEMXR7LXtO;
        p21.Companion.getClass();
        if (cs0.wdg6QnbFHrFF(p21Var, p21.wdg6QnbFHrFF)) {
            editorInfo.hintLocales = null;
            lt1Var = null;
        } else {
            lt1Var = null;
            ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(p21Var, 10));
            Iterator it = p21Var.rtx2ld2ELZv4.iterator();
            while (it.hasNext()) {
                arrayList.add(((n21) it.next()).PxuCJdSBwIXG);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        hv0.Companion.getClass();
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    i2 = 2;
                } else if (i4 == 4) {
                    i2 = 3;
                } else if (i4 == 5) {
                    i2 = 17;
                } else if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else if (i4 == 8) {
                    i2 = 18;
                } else {
                    if (i4 != 9) {
                        u9.rtx2ld2ELZv4("Invalid Keyboard Type");
                        return lt1Var;
                    }
                    i2 = 8194;
                }
                editorInfo.inputType = i2;
                if ((i2 & 1) == 1) {
                    editorInfo.inputType = i2 | 131072;
                    int i5 = ln0Var.Y1f8riQaR6yg;
                    jn0.Companion.getClass();
                    if (i5 == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                if ((editorInfo.inputType & 1) == 1) {
                    int i6 = ln0Var.PxuCJdSBwIXG;
                    dv0.Companion.getClass();
                    if (i6 == 1) {
                        editorInfo.inputType |= 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType |= 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType |= 16384;
                    }
                    if (ln0Var.lS5Rgt96tfkO) {
                        editorInfo.inputType |= 32768;
                    }
                }
                ui2 ui2Var = vi2.Companion;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                hq0.POWyO8hTM6YC(editorInfo, str);
                editorInfo.imeOptions |= 33554432;
                if (za2.PxuCJdSBwIXG || i4 == 7 || i4 == 8) {
                    hq0.i68hK7ahKtgp(editorInfo, false);
                } else {
                    hq0.i68hK7ahKtgp(editorInfo, true);
                    editorInfo.setSupportedHandwritingGestures(fx1.D0aTLcX6Uhyo(y3.cpQdD2nAriOS(), y3.e6tOsSdd2EFb(), y3.ZbWwgt3aGe7A(), y3.IAToe7bXGz4N(), y3.jyegZNwi31qc(), y3.aF05bpZJlKEP(), y3.kpCQ9veP6n3I()));
                    editorInfo.setSupportedHandwritingGesturePreviews(na.HGgCfDnf0ga9(new Class[]{y3.cpQdD2nAriOS(), y3.e6tOsSdd2EFb(), y3.ZbWwgt3aGe7A(), y3.IAToe7bXGz4N()}));
                }
                vz0 vz0Var = wz0.PxuCJdSBwIXG;
                if (x40.Y1f8riQaR6yg()) {
                    x40.PxuCJdSBwIXG().RAsUl2FVSrh6(editorInfo);
                }
                lt1 lt1Var2 = new lt1(this.rtx2ld2ELZv4, new i2(16, this), this.OPXfSBeufaJ8.lS5Rgt96tfkO, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6);
                this.wdg6QnbFHrFF.add(new WeakReference(lt1Var2));
                return lt1Var2;
            }
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if ((i2 & 1) == 1) {
        }
        if ((editorInfo.inputType & 1) == 1) {
        }
        ui2 ui2Var2 = vi2.Companion;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        hq0.POWyO8hTM6YC(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (za2.PxuCJdSBwIXG) {
        }
        hq0.i68hK7ahKtgp(editorInfo, false);
        vz0 vz0Var2 = wz0.PxuCJdSBwIXG;
        if (x40.Y1f8riQaR6yg()) {
        }
        lt1 lt1Var22 = new lt1(this.rtx2ld2ELZv4, new i2(16, this), this.OPXfSBeufaJ8.lS5Rgt96tfkO, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6);
        this.wdg6QnbFHrFF.add(new WeakReference(lt1Var22));
        return lt1Var22;
    }
}
