package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class BRwzKIf41E4i implements Runnable {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ BRwzKIf41E4i(hq0 hq0Var, Typeface typeface) {
        this.rtx2ld2ELZv4 = 8;
        this.OPXfSBeufaJ8 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        View findFocus;
        Boolean bool = null;
        int i2 = 0;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ((RfyTYNmI9Srp) this.OPXfSBeufaJ8).TSizfFm2Yiuu();
                return;
            case 1:
                x1 x1Var = (x1) this.OPXfSBeufaJ8;
                Trace.beginSection("measureAndLayout");
                try {
                    r1 r1Var = x1Var.dgRBjINgWbAK;
                    di1 di1Var = ei1.Companion;
                    r1Var.S2OOm9zPNm0h(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        x1Var.a92UlCVFR9N8();
                        Trace.endSection();
                        x1Var.gGoUzNp9JO5I = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                o2 o2Var = (o2) this.OPXfSBeufaJ8;
                boolean e9gEMXR7LXtO = o2Var.e9gEMXR7LXtO();
                r1 r1Var2 = o2Var.rtx2ld2ELZv4;
                if (e9gEMXR7LXtO) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        di1 di1Var2 = ei1.Companion;
                        r1Var2.S2OOm9zPNm0h(true);
                        c81 c81Var = o2Var.XL4ISE6Oc65B;
                        int[] iArr = c81Var.lS5Rgt96tfkO;
                        long[] jArr = c81Var.PxuCJdSBwIXG;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = i2;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!o2Var.Y1f8riQaR6yg().PxuCJdSBwIXG(i6)) {
                                                i = length;
                                                o2Var.dgRBjINgWbAK.add(new ur(i6, o2Var.BRwzKIf41E4i, vr.OPXfSBeufaJ8, null));
                                                o2Var.QrzZRwfaDlRX.Y1f8riQaR6yg(no2.PxuCJdSBwIXG);
                                                j >>= 8;
                                                i5++;
                                                length = i;
                                            }
                                        }
                                        i = length;
                                        j >>= 8;
                                        i5++;
                                        length = i;
                                    }
                                    int i7 = length;
                                    if (i4 == 8) {
                                        length = i7;
                                    }
                                }
                                if (i3 != length) {
                                    i3++;
                                    i2 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        o2Var.rtx2ld2ELZv4(r1Var2.getSemanticsOwner().PxuCJdSBwIXG(), o2Var.RfyTYNmI9Srp);
                        Trace.endSection();
                        o2Var.TSizfFm2Yiuu(o2Var.Y1f8riQaR6yg());
                        o2Var.r3s1LDPKFs1S();
                        o2Var.EcgxDIVH5in8 = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 3:
                ActionMode actionMode = ((k6) this.OPXfSBeufaJ8).rtx2ld2ELZv4;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                en enVar = (en) this.OPXfSBeufaJ8;
                Runnable runnable = enVar.OPXfSBeufaJ8;
                if (runnable != null) {
                    runnable.run();
                    enVar.OPXfSBeufaJ8 = null;
                    return;
                }
                return;
            case 5:
                zz.Y1f8riQaR6yg((zz) this.OPXfSBeufaJ8);
                return;
            case 6:
                cc0 cc0Var = (cc0) this.OPXfSBeufaJ8;
                synchronized (cc0Var.Y1f8riQaR6yg) {
                    try {
                        if (cc0Var.rtx2ld2ELZv4 == null) {
                            return;
                        }
                        try {
                            zc0 TSizfFm2Yiuu = cc0Var.TSizfFm2Yiuu();
                            int i8 = TSizfFm2Yiuu.a92UlCVFR9N8;
                            if (i8 == 2) {
                                synchronized (cc0Var.Y1f8riQaR6yg) {
                                }
                            }
                            if (i8 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                            }
                            try {
                                int i9 = kk2.PxuCJdSBwIXG;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                fb0 fb0Var = cc0Var.TSizfFm2Yiuu;
                                Context context = cc0Var.PxuCJdSBwIXG;
                                fb0Var.getClass();
                                zc0[] zc0VarArr = {TSizfFm2Yiuu};
                                vi0 vi0Var = pm2.PxuCJdSBwIXG;
                                sj0.wdg6QnbFHrFF("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface x50lh2ztY7Y5 = pm2.PxuCJdSBwIXG.x50lh2ztY7Y5(context, zc0VarArr);
                                    Trace.endSection();
                                    MappedByteBuffer Pf0ThKz3j5YS = xi0.Pf0ThKz3j5YS(cc0Var.PxuCJdSBwIXG, TSizfFm2Yiuu.PxuCJdSBwIXG);
                                    if (Pf0ThKz3j5YS == null || x50lh2ztY7Y5 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        e0 e0Var = new e0(x50lh2ztY7Y5, ng0.kpCQ9veP6n3I(Pf0ThKz3j5YS));
                                        Trace.endSection();
                                        synchronized (cc0Var.Y1f8riQaR6yg) {
                                            try {
                                                bs0 bs0Var = cc0Var.rtx2ld2ELZv4;
                                                if (bs0Var != null) {
                                                    bs0Var.e6tOsSdd2EFb(e0Var);
                                                }
                                            } finally {
                                            }
                                        }
                                        cc0Var.lS5Rgt96tfkO();
                                        return;
                                    } finally {
                                        int i10 = kk2.PxuCJdSBwIXG;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th2) {
                            synchronized (cc0Var.Y1f8riQaR6yg) {
                                try {
                                    bs0 bs0Var2 = cc0Var.rtx2ld2ELZv4;
                                    if (bs0Var2 != null) {
                                        bs0Var2.IAToe7bXGz4N(th2);
                                    }
                                    cc0Var.lS5Rgt96tfkO();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 7:
                jq1 jq1Var = (jq1) this.OPXfSBeufaJ8;
                s01 s01Var = jq1Var.cpQdD2nAriOS;
                if (jq1Var.OPXfSBeufaJ8 == 0) {
                    jq1Var.wdg6QnbFHrFF = true;
                    s01Var.Y1f8riQaR6yg(e01.ON_PAUSE);
                }
                if (jq1Var.rtx2ld2ELZv4 == 0 && jq1Var.wdg6QnbFHrFF) {
                    s01Var.Y1f8riQaR6yg(e01.ON_STOP);
                    jq1Var.dgRBjINgWbAK = true;
                    return;
                }
                return;
            case 8:
                throw null;
            case 9:
                rw1.setRippleState$lambda$1((rw1) this.OPXfSBeufaJ8);
                return;
            case 10:
                View view = (View) this.OPXfSBeufaJ8;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 11:
                rc2 rc2Var = ((uc2) this.OPXfSBeufaJ8).PxuCJdSBwIXG;
                ViewParent parent = rc2Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(rc2Var);
                    return;
                }
                return;
            default:
                ci2 ci2Var = (ci2) this.OPXfSBeufaJ8;
                m9 m9Var = ci2Var.lS5Rgt96tfkO;
                ci2Var.r3s1LDPKFs1S = null;
                f91 f91Var = ci2Var.cpQdD2nAriOS;
                View view2 = ci2Var.PxuCJdSBwIXG;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    f91Var.RAsUl2FVSrh6();
                    return;
                }
                Object[] objArr = f91Var.rtx2ld2ELZv4;
                int i11 = f91Var.wdg6QnbFHrFF;
                Boolean bool2 = null;
                for (int i12 = 0; i12 < i11; i12++) {
                    bi2 bi2Var = (bi2) objArr[i12];
                    int ordinal = bi2Var.ordinal();
                    if (ordinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (ordinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (ordinal != 2 && ordinal != 3) {
                        u9.gPXPFXrUH4XX();
                        return;
                    } else {
                        if (!cs0.wdg6QnbFHrFF(bool, Boolean.FALSE)) {
                            bool2 = Boolean.valueOf(bi2Var == bi2.wdg6QnbFHrFF);
                        }
                    }
                    bool2 = bool;
                }
                f91Var.RAsUl2FVSrh6();
                if (cs0.wdg6QnbFHrFF(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((nx0) m9Var.wdg6QnbFHrFF).getValue()).restartInput((View) m9Var.OPXfSBeufaJ8);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((b42) ((b42) m9Var.dgRBjINgWbAK).OPXfSBeufaJ8).cpQdD2nAriOS();
                    } else {
                        ((b42) ((b42) m9Var.dgRBjINgWbAK).OPXfSBeufaJ8).OPXfSBeufaJ8();
                    }
                }
                if (cs0.wdg6QnbFHrFF(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((nx0) m9Var.wdg6QnbFHrFF).getValue()).restartInput((View) m9Var.OPXfSBeufaJ8);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ BRwzKIf41E4i(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }
}
