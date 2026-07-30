package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y4 extends kv0 implements ae0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(int i, Object obj) {
        super(0);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cb  */
    @Override // defpackage.ae0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG() {
        zp zpVar;
        bw0 parentLayoutCoordinates;
        int i = this.OPXfSBeufaJ8;
        Context context = null;
        boolean z = false;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                cs0.x50lh2ztY7Y5(((a5) obj).wdg6QnbFHrFF, null);
                return no2Var;
            case 1:
                return no2Var;
            case 2:
                gl2 gl2Var = (gl2) obj;
                Object a92UlCVFR9N8 = gl2Var.PxuCJdSBwIXG.a92UlCVFR9N8();
                u50 u50Var = u50.wdg6QnbFHrFF;
                if (a92UlCVFR9N8 == u50Var && gl2Var.Y1f8riQaR6yg.getValue() == u50Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                View view = ((dp) obj).PxuCJdSBwIXG;
                ir0.Companion.getClass();
                if (!ir0.PxuCJdSBwIXG(0L, 0L)) {
                    oy oyVar = py.Companion;
                    my lS5Rgt96tfkO = f2.lS5Rgt96tfkO(view.getContext());
                    oyVar.getClass();
                    return new py(0L, lS5Rgt96tfkO.IAToe7bXGz4N(kj0.gGoUzNp9JO5I(0L)));
                }
                Context context2 = view.getContext();
                Context context3 = context2;
                while (context3 instanceof ContextWrapper) {
                    if ((context3 instanceof Activity) || (context3 instanceof InputMethodService) || (context3 instanceof Application)) {
                        context = context3;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) context3;
                        if (contextWrapper.getBaseContext() != null) {
                            context3 = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        my lS5Rgt96tfkO2 = f2.lS5Rgt96tfkO(context2);
                        oy oyVar2 = py.Companion;
                        long e9gEMXR7LXtO = hq0.e9gEMXR7LXtO(configuration.screenWidthDp, configuration.screenHeightDp);
                        oyVar2.getClass();
                        long bEKsvqmvPh2y = lS5Rgt96tfkO2.bEKsvqmvPh2y(e9gEMXR7LXtO);
                        return new py((((int) Float.intBitsToFloat((int) (bEKsvqmvPh2y >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (bEKsvqmvPh2y & 4294967295L))) & 4294967295L), e9gEMXR7LXtO);
                    }
                    eu2.Companion.getClass();
                    fu2 fu2Var = du2.lS5Rgt96tfkO;
                    fu2Var.getClass();
                    ContextWrapper contextWrapper2 = (ContextWrapper) context;
                    hu2.Companion.getClass();
                    int i2 = Build.VERSION.SDK_INT;
                    cu2 lS5Rgt96tfkO3 = (i2 >= 34 ? ky.OPXfSBeufaJ8 : i2 >= 30 ? ue.OPXfSBeufaJ8 : ih0.IAToe7bXGz4N).lS5Rgt96tfkO(contextWrapper2, fu2Var.PxuCJdSBwIXG);
                    oy oyVar3 = py.Companion;
                    long height = (lS5Rgt96tfkO3.PxuCJdSBwIXG().height() & 4294967295L) | (lS5Rgt96tfkO3.PxuCJdSBwIXG().width() << 32);
                    my lS5Rgt96tfkO4 = f2.lS5Rgt96tfkO(context);
                    oyVar3.getClass();
                    return new py(height, lS5Rgt96tfkO4.IAToe7bXGz4N(kj0.gGoUzNp9JO5I(height)));
                }
                if (context != null) {
                }
                break;
            case 4:
                ((ab0) obj).fkblLSN2bAgv();
                return no2Var;
            case 5:
                Object systemService = ((View) ((m9) obj).OPXfSBeufaJ8).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 6:
                zw0 zw0Var = ((vw0) obj).ryVscX7ZL4Ux;
                zw0Var.gPXPFXrUH4XX.ozEBbv0hFTAB = true;
                a41 a41Var = zw0Var.BRwzKIf41E4i;
                if (a41Var != null) {
                    a41Var.e6tOsSdd2EFb = true;
                }
                return no2Var;
            case 7:
                bx0 bx0Var = (bx0) obj;
                if (!((Boolean) bx0Var.RAsUl2FVSrh6.getValue()).booleanValue() && (zpVar = bx0Var.TSizfFm2Yiuu) != null) {
                    zpVar.x50lh2ztY7Y5();
                }
                return no2Var;
            case 8:
                j41 j41Var = (j41) ((u01) obj).PxuCJdSBwIXG.OPXfSBeufaJ8;
                if (!j41Var.OPXfSBeufaJ8) {
                    if (j41Var.wdg6QnbFHrFF) {
                        hp1.PxuCJdSBwIXG("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    j41Var.PxuCJdSBwIXG();
                    j41Var.wdg6QnbFHrFF = true;
                }
                return no2Var;
            case 9:
                return (ru) ((e0) obj).x50lh2ztY7Y5;
            case 10:
                return ((dd1) obj).W7ceZOzvrRuI();
            case 11:
                ap1 ap1Var = (ap1) obj;
                parentLayoutCoordinates = ap1Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != 0 && parentLayoutCoordinates.aF05bpZJlKEP()) {
                    context = parentLayoutCoordinates;
                }
                if (context != null && ap1Var.m2getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                st1 st1Var = (st1) obj;
                st1Var.rtx2ld2ELZv4 = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    st1Var.PxuCJdSBwIXG();
                    return no2Var;
                } finally {
                    Trace.endSection();
                }
            case 13:
                jx0 PxuCJdSBwIXG = ((gb2) obj).PxuCJdSBwIXG();
                vw0 vw0Var = PxuCJdSBwIXG.rtx2ld2ELZv4;
                if (PxuCJdSBwIXG.S9EYkSpbGuxq != ((f91) ((n81) vw0Var.QrzZRwfaDlRX()).OPXfSBeufaJ8).wdg6QnbFHrFF) {
                    v81 v81Var = PxuCJdSBwIXG.cpQdD2nAriOS;
                    Object[] objArr = v81Var.TSizfFm2Yiuu;
                    long[] jArr = v81Var.PxuCJdSBwIXG;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((bx0) objArr[(i3 << 3) + i5]).Y1f8riQaR6yg = true;
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    if (vw0Var.QrzZRwfaDlRX != null) {
                        if (!vw0Var.ryVscX7ZL4Ux.e9gEMXR7LXtO) {
                            vw0.xbgXKYA2cIfu(vw0Var, false, 7);
                        }
                    } else if (!vw0Var.BRwzKIf41E4i()) {
                        vw0.IXK6ba3ucyzm(vw0Var, false, 7);
                    }
                }
                return no2Var;
            case 14:
                return new BaseInputConnection(((ci2) obj).PxuCJdSBwIXG, false);
            default:
                ((qp2) obj).rtx2ld2ELZv4.setValue(no2Var);
                return no2Var;
        }
    }
}
