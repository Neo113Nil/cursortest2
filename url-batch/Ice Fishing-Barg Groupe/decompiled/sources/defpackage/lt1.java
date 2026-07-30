package defpackage;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lt1 implements InputConnection {
    public boolean OPXfSBeufaJ8;
    public final i2 PxuCJdSBwIXG;
    public oh2 RAsUl2FVSrh6;
    public final yz0 TSizfFm2Yiuu;
    public final eh2 Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public final vq2 e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;
    public int rtx2ld2ELZv4;
    public final ArrayList wdg6QnbFHrFF = new ArrayList();
    public boolean dgRBjINgWbAK = true;

    public lt1(oh2 oh2Var, i2 i2Var, boolean z, yz0 yz0Var, eh2 eh2Var, vq2 vq2Var) {
        this.PxuCJdSBwIXG = i2Var;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = yz0Var;
        this.Y1f8riQaR6yg = eh2Var;
        this.e9gEMXR7LXtO = vq2Var;
        this.RAsUl2FVSrh6 = oh2Var;
    }

    public final void PxuCJdSBwIXG(m40 m40Var) {
        this.a92UlCVFR9N8++;
        try {
            this.wdg6QnbFHrFF.add(m40Var);
        } finally {
            lS5Rgt96tfkO();
        }
    }

    public final void TSizfFm2Yiuu(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.dgRBjINgWbAK;
        if (!z) {
            return z;
        }
        this.a92UlCVFR9N8++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.wdg6QnbFHrFF.clear();
        this.a92UlCVFR9N8 = 0;
        this.dgRBjINgWbAK = false;
        ArrayList arrayList = ((zz0) this.PxuCJdSBwIXG.OPXfSBeufaJ8).wdg6QnbFHrFF;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (cs0.wdg6QnbFHrFF(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.dgRBjINgWbAK;
        return z ? this.lS5Rgt96tfkO : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            PxuCJdSBwIXG(new mm(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.dgRBjINgWbAK;
        if (!z) {
            return z;
        }
        PxuCJdSBwIXG(new cy(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.dgRBjINgWbAK;
        if (!z) {
            return z;
        }
        PxuCJdSBwIXG(new dy(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return lS5Rgt96tfkO();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.dgRBjINgWbAK;
        if (!z) {
            return z;
        }
        PxuCJdSBwIXG(new d80());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        oh2 oh2Var = this.RAsUl2FVSrh6;
        return TextUtils.getCapsMode(oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8, vi2.a92UlCVFR9N8(oh2Var.lS5Rgt96tfkO), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.OPXfSBeufaJ8 = z;
        if (z) {
            this.rtx2ld2ELZv4 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ni0.e9gEMXR7LXtO(this.RAsUl2FVSrh6);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (vi2.TSizfFm2Yiuu(this.RAsUl2FVSrh6.lS5Rgt96tfkO)) {
            return null;
        }
        return sj0.jyegZNwi31qc(this.RAsUl2FVSrh6).OPXfSBeufaJ8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return sj0.aF05bpZJlKEP(this.RAsUl2FVSrh6, i).OPXfSBeufaJ8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return sj0.kpCQ9veP6n3I(this.RAsUl2FVSrh6, i).OPXfSBeufaJ8;
    }

    public final boolean lS5Rgt96tfkO() {
        int i = this.a92UlCVFR9N8 - 1;
        this.a92UlCVFR9N8 = i;
        if (i == 0) {
            ArrayList arrayList = this.wdg6QnbFHrFF;
            if (!arrayList.isEmpty()) {
                ((zz0) this.PxuCJdSBwIXG.OPXfSBeufaJ8).TSizfFm2Yiuu.OPXfSBeufaJ8(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.a92UlCVFR9N8 > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    PxuCJdSBwIXG(new q42(0, this.RAsUl2FVSrh6.PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
                    break;
                case R.id.cut:
                    TSizfFm2Yiuu(277);
                    return false;
                case R.id.copy:
                    TSizfFm2Yiuu(278);
                    return false;
                case R.id.paste:
                    TSizfFm2Yiuu(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        jn0.Companion.getClass();
                        i2 = 2;
                        break;
                    case 3:
                        jn0.Companion.getClass();
                        i2 = 3;
                        break;
                    case 4:
                        jn0.Companion.getClass();
                        i2 = 4;
                        break;
                    case 5:
                        jn0.Companion.getClass();
                        i2 = 6;
                        break;
                    case 6:
                        jn0.Companion.getClass();
                        i2 = 7;
                        break;
                    case 7:
                        jn0.Companion.getClass();
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        jn0.Companion.getClass();
                        break;
                }
                ((zz0) this.PxuCJdSBwIXG.OPXfSBeufaJ8).Y1f8riQaR6yg.OPXfSBeufaJ8(new jn0(i2));
            } else {
                jn0.Companion.getClass();
            }
            i2 = 1;
            ((zz0) this.PxuCJdSBwIXG.OPXfSBeufaJ8).Y1f8riQaR6yg.OPXfSBeufaJ8(new jn0(i2));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030a  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        v8 v8Var;
        PointF startPoint;
        PointF endPoint;
        char c;
        long j;
        int i;
        int i2;
        int i3;
        String sb;
        PointF insertionPoint;
        ki2 Y1f8riQaR6yg;
        String textToInsert;
        PointF joinOrSplitPoint;
        ki2 Y1f8riQaR6yg2;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        ii2 ii2Var;
        if (Build.VERSION.SDK_INT >= 34) {
            r3s1LDPKFs1S r3s1ldpkfs1s = new r3s1LDPKFs1S(29, this);
            yz0 yz0Var = this.TSizfFm2Yiuu;
            final int i4 = 3;
            if (yz0Var != null && (v8Var = yz0Var.wdg6QnbFHrFF) != null) {
                ki2 Y1f8riQaR6yg3 = yz0Var.Y1f8riQaR6yg();
                if (v8Var.equals((Y1f8riQaR6yg3 == null || (ii2Var = Y1f8riQaR6yg3.PxuCJdSBwIXG.PxuCJdSBwIXG) == null) ? null : ii2Var.PxuCJdSBwIXG)) {
                    boolean RfyTYNmI9Srp = y3.RfyTYNmI9Srp(handwritingGesture);
                    eh2 eh2Var = this.Y1f8riQaR6yg;
                    if (RfyTYNmI9Srp) {
                        SelectGesture BRwzKIf41E4i = ui0.BRwzKIf41E4i(handwritingGesture);
                        selectionArea = BRwzKIf41E4i.getSelectionArea();
                        qt1 bEKsvqmvPh2y = vi0.bEKsvqmvPh2y(selectionArea);
                        granularity4 = BRwzKIf41E4i.getGranularity();
                        int yQRudnv4La6p = vi0.yQRudnv4La6p(granularity4);
                        xh2.Companion.getClass();
                        long BjEWd04qc7Mw = xi0.BjEWd04qc7Mw(yz0Var, bEKsvqmvPh2y, yQRudnv4La6p);
                        if (vi2.TSizfFm2Yiuu(BjEWd04qc7Mw)) {
                            i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(BRwzKIf41E4i), r3s1ldpkfs1s);
                        } else {
                            r3s1ldpkfs1s.OPXfSBeufaJ8(new q42((int) (BjEWd04qc7Mw >> 32), (int) (BjEWd04qc7Mw & 4294967295L)));
                            if (eh2Var != null) {
                                eh2Var.rtx2ld2ELZv4(true);
                            }
                            i4 = 1;
                        }
                    } else {
                        if (ui0.jyegZNwi31qc(handwritingGesture)) {
                            DeleteGesture x50lh2ztY7Y5 = ui0.x50lh2ztY7Y5(handwritingGesture);
                            granularity3 = x50lh2ztY7Y5.getGranularity();
                            int yQRudnv4La6p2 = vi0.yQRudnv4La6p(granularity3);
                            deletionArea = x50lh2ztY7Y5.getDeletionArea();
                            qt1 bEKsvqmvPh2y2 = vi0.bEKsvqmvPh2y(deletionArea);
                            xh2.Companion.getClass();
                            long BjEWd04qc7Mw2 = xi0.BjEWd04qc7Mw(yz0Var, bEKsvqmvPh2y2, yQRudnv4La6p2);
                            if (vi2.TSizfFm2Yiuu(BjEWd04qc7Mw2)) {
                                i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(x50lh2ztY7Y5), r3s1ldpkfs1s);
                            } else {
                                vh2.Companion.getClass();
                                vi0.i68hK7ahKtgp(BjEWd04qc7Mw2, v8Var, yQRudnv4La6p2 == 1, r3s1ldpkfs1s);
                                i4 = 1;
                            }
                        } else if (ui0.aF05bpZJlKEP(handwritingGesture)) {
                            SelectRangeGesture XL4ISE6Oc65B = ui0.XL4ISE6Oc65B(handwritingGesture);
                            selectionStartArea = XL4ISE6Oc65B.getSelectionStartArea();
                            qt1 bEKsvqmvPh2y3 = vi0.bEKsvqmvPh2y(selectionStartArea);
                            selectionEndArea = XL4ISE6Oc65B.getSelectionEndArea();
                            qt1 bEKsvqmvPh2y4 = vi0.bEKsvqmvPh2y(selectionEndArea);
                            granularity2 = XL4ISE6Oc65B.getGranularity();
                            int yQRudnv4La6p3 = vi0.yQRudnv4La6p(granularity2);
                            xh2.Companion.getClass();
                            long a92UlCVFR9N8 = xi0.a92UlCVFR9N8(yz0Var, bEKsvqmvPh2y3, bEKsvqmvPh2y4, yQRudnv4La6p3);
                            if (vi2.TSizfFm2Yiuu(a92UlCVFR9N8)) {
                                i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(XL4ISE6Oc65B), r3s1ldpkfs1s);
                            } else {
                                r3s1ldpkfs1s.OPXfSBeufaJ8(new q42((int) (a92UlCVFR9N8 >> 32), (int) (a92UlCVFR9N8 & 4294967295L)));
                                if (eh2Var != null) {
                                    eh2Var.rtx2ld2ELZv4(true);
                                }
                                i4 = 1;
                            }
                        } else if (ui0.kpCQ9veP6n3I(handwritingGesture)) {
                            DeleteRangeGesture cpQdD2nAriOS = ui0.cpQdD2nAriOS(handwritingGesture);
                            granularity = cpQdD2nAriOS.getGranularity();
                            int yQRudnv4La6p4 = vi0.yQRudnv4La6p(granularity);
                            deletionStartArea = cpQdD2nAriOS.getDeletionStartArea();
                            qt1 bEKsvqmvPh2y5 = vi0.bEKsvqmvPh2y(deletionStartArea);
                            deletionEndArea = cpQdD2nAriOS.getDeletionEndArea();
                            qt1 bEKsvqmvPh2y6 = vi0.bEKsvqmvPh2y(deletionEndArea);
                            xh2.Companion.getClass();
                            long a92UlCVFR9N82 = xi0.a92UlCVFR9N8(yz0Var, bEKsvqmvPh2y5, bEKsvqmvPh2y6, yQRudnv4La6p4);
                            if (vi2.TSizfFm2Yiuu(a92UlCVFR9N82)) {
                                i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(cpQdD2nAriOS), r3s1ldpkfs1s);
                            } else {
                                vh2.Companion.getClass();
                                vi0.i68hK7ahKtgp(a92UlCVFR9N82, v8Var, yQRudnv4La6p4 == 1, r3s1ldpkfs1s);
                                i4 = 1;
                            }
                        } else {
                            boolean IAToe7bXGz4N = ui0.IAToe7bXGz4N(handwritingGesture);
                            vq2 vq2Var = this.e9gEMXR7LXtO;
                            if (IAToe7bXGz4N) {
                                JoinOrSplitGesture QrzZRwfaDlRX = ui0.QrzZRwfaDlRX(handwritingGesture);
                                if (vq2Var == null) {
                                    i4 = vi0.XL4ISE6Oc65B(ui0.pnx5pC0XzaCw(QrzZRwfaDlRX), r3s1ldpkfs1s);
                                } else {
                                    joinOrSplitPoint = QrzZRwfaDlRX.getJoinOrSplitPoint();
                                    int e9gEMXR7LXtO = xi0.e9gEMXR7LXtO(yz0Var, xi0.OPXfSBeufaJ8(joinOrSplitPoint), vq2Var);
                                    if (e9gEMXR7LXtO == -1 || ((Y1f8riQaR6yg2 = yz0Var.Y1f8riQaR6yg()) != null && xi0.RAsUl2FVSrh6(Y1f8riQaR6yg2.PxuCJdSBwIXG, e9gEMXR7LXtO))) {
                                        i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(QrzZRwfaDlRX), r3s1ldpkfs1s);
                                    } else {
                                        int i5 = e9gEMXR7LXtO;
                                        while (i5 > 0) {
                                            int codePointBefore = Character.codePointBefore(v8Var, i5);
                                            if (!xi0.EpkonXwzFgDB(codePointBefore)) {
                                                break;
                                            } else {
                                                i5 -= Character.charCount(codePointBefore);
                                            }
                                        }
                                        while (e9gEMXR7LXtO < v8Var.OPXfSBeufaJ8.length()) {
                                            int codePointAt = Character.codePointAt(v8Var, e9gEMXR7LXtO);
                                            if (!xi0.EpkonXwzFgDB(codePointAt)) {
                                                break;
                                            } else {
                                                e9gEMXR7LXtO += Character.charCount(codePointAt);
                                            }
                                        }
                                        long rtx2ld2ELZv4 = jh0.rtx2ld2ELZv4(i5, e9gEMXR7LXtO);
                                        if (vi2.TSizfFm2Yiuu(rtx2ld2ELZv4)) {
                                            int i6 = (int) (rtx2ld2ELZv4 >> 32);
                                            r3s1ldpkfs1s.OPXfSBeufaJ8(new wi0(new m40[]{new q42(i6, i6), new mm(" ", 1)}));
                                        } else {
                                            vi0.i68hK7ahKtgp(rtx2ld2ELZv4, v8Var, false, r3s1ldpkfs1s);
                                        }
                                        i4 = 1;
                                    }
                                }
                            } else if (y3.pnx5pC0XzaCw(handwritingGesture)) {
                                InsertGesture x50lh2ztY7Y52 = y3.x50lh2ztY7Y5(handwritingGesture);
                                if (vq2Var == null) {
                                    i4 = vi0.XL4ISE6Oc65B(ui0.pnx5pC0XzaCw(x50lh2ztY7Y52), r3s1ldpkfs1s);
                                } else {
                                    insertionPoint = x50lh2ztY7Y52.getInsertionPoint();
                                    int e9gEMXR7LXtO2 = xi0.e9gEMXR7LXtO(yz0Var, xi0.OPXfSBeufaJ8(insertionPoint), vq2Var);
                                    if (e9gEMXR7LXtO2 == -1 || ((Y1f8riQaR6yg = yz0Var.Y1f8riQaR6yg()) != null && xi0.RAsUl2FVSrh6(Y1f8riQaR6yg.PxuCJdSBwIXG, e9gEMXR7LXtO2))) {
                                        i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(x50lh2ztY7Y52), r3s1ldpkfs1s);
                                    } else {
                                        textToInsert = x50lh2ztY7Y52.getTextToInsert();
                                        r3s1ldpkfs1s.OPXfSBeufaJ8(new wi0(new m40[]{new q42(e9gEMXR7LXtO2, e9gEMXR7LXtO2), new mm(textToInsert, 1)}));
                                        i4 = 1;
                                    }
                                }
                            } else if (ui0.S9EYkSpbGuxq(handwritingGesture)) {
                                RemoveSpaceGesture gPXPFXrUH4XX = ui0.gPXPFXrUH4XX(handwritingGesture);
                                ki2 Y1f8riQaR6yg4 = yz0Var.Y1f8riQaR6yg();
                                ji2 ji2Var = Y1f8riQaR6yg4 != null ? Y1f8riQaR6yg4.PxuCJdSBwIXG : null;
                                startPoint = gPXPFXrUH4XX.getStartPoint();
                                long OPXfSBeufaJ8 = xi0.OPXfSBeufaJ8(startPoint);
                                endPoint = gPXPFXrUH4XX.getEndPoint();
                                long OPXfSBeufaJ82 = xi0.OPXfSBeufaJ8(endPoint);
                                bw0 TSizfFm2Yiuu = yz0Var.TSizfFm2Yiuu();
                                if (ji2Var != null) {
                                    r71 r71Var = ji2Var.lS5Rgt96tfkO;
                                    if (TSizfFm2Yiuu != null) {
                                        long S2OOm9zPNm0h = TSizfFm2Yiuu.S2OOm9zPNm0h(OPXfSBeufaJ8);
                                        long S2OOm9zPNm0h2 = TSizfFm2Yiuu.S2OOm9zPNm0h(OPXfSBeufaJ82);
                                        int kpCQ9veP6n3I = xi0.kpCQ9veP6n3I(r71Var, S2OOm9zPNm0h, vq2Var);
                                        int kpCQ9veP6n3I2 = xi0.kpCQ9veP6n3I(r71Var, S2OOm9zPNm0h2, vq2Var);
                                        if (kpCQ9veP6n3I != -1) {
                                            if (kpCQ9veP6n3I2 != -1) {
                                                kpCQ9veP6n3I = Math.min(kpCQ9veP6n3I, kpCQ9veP6n3I2);
                                            }
                                            kpCQ9veP6n3I2 = kpCQ9veP6n3I;
                                        } else if (kpCQ9veP6n3I2 == -1) {
                                            vi2.Companion.getClass();
                                            j = vi2.lS5Rgt96tfkO;
                                            c = ' ';
                                            if (vi2.TSizfFm2Yiuu(j)) {
                                                i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(gPXPFXrUH4XX), r3s1ldpkfs1s);
                                            } else {
                                                String str = v8Var.subSequence(vi2.a92UlCVFR9N8(j), vi2.e9gEMXR7LXtO(j)).OPXfSBeufaJ8;
                                                Pattern compile = Pattern.compile("\\s+");
                                                compile.getClass();
                                                str.getClass();
                                                Matcher matcher = compile.matcher(str);
                                                matcher.getClass();
                                                e0 TSizfFm2Yiuu2 = kj0.TSizfFm2Yiuu(matcher, 0, str);
                                                if (TSizfFm2Yiuu2 == null) {
                                                    sb = str.toString();
                                                    i2 = -1;
                                                    i = -1;
                                                } else {
                                                    int length = str.length();
                                                    StringBuilder sb2 = new StringBuilder(length);
                                                    i = -1;
                                                    int i7 = 0;
                                                    while (true) {
                                                        sb2.append((CharSequence) str, i7, TSizfFm2Yiuu2.rtx2ld2ELZv4().rtx2ld2ELZv4);
                                                        if (i == -1) {
                                                            i = TSizfFm2Yiuu2.rtx2ld2ELZv4().rtx2ld2ELZv4;
                                                        }
                                                        i2 = TSizfFm2Yiuu2.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                                        sb2.append((CharSequence) "");
                                                        i3 = TSizfFm2Yiuu2.rtx2ld2ELZv4().OPXfSBeufaJ8 + 1;
                                                        TSizfFm2Yiuu2 = TSizfFm2Yiuu2.EcgxDIVH5in8();
                                                        if (i3 >= length || TSizfFm2Yiuu2 == null) {
                                                            break;
                                                        } else {
                                                            i7 = i3;
                                                        }
                                                    }
                                                    if (i3 < length) {
                                                        sb2.append((CharSequence) str, i3, length);
                                                    }
                                                    sb = sb2.toString();
                                                }
                                                if (i == -1 || i2 == -1) {
                                                    i4 = vi0.XL4ISE6Oc65B(ui0.r3s1LDPKFs1S(gPXPFXrUH4XX), r3s1ldpkfs1s);
                                                } else {
                                                    int i8 = (int) (j >> c);
                                                    i4 = 1;
                                                    r3s1ldpkfs1s.OPXfSBeufaJ8(new wi0(new m40[]{new q42(i8 + i, i8 + i2), new mm(sb.substring(i, sb.length() - (vi2.Y1f8riQaR6yg(j) - i2)), 1)}));
                                                }
                                            }
                                        }
                                        float lS5Rgt96tfkO = (r71Var.lS5Rgt96tfkO(kpCQ9veP6n3I2) + r71Var.a92UlCVFR9N8(kpCQ9veP6n3I2)) / 2.0f;
                                        int i9 = (int) (S2OOm9zPNm0h >> 32);
                                        int i10 = (int) (S2OOm9zPNm0h2 >> 32);
                                        c = ' ';
                                        qt1 qt1Var = new qt1(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), lS5Rgt96tfkO - 0.1f, Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), lS5Rgt96tfkO + 0.1f);
                                        vh2.Companion.getClass();
                                        xh2.Companion.getClass();
                                        j = r71Var.rtx2ld2ELZv4(qt1Var, 0, wh2.lS5Rgt96tfkO);
                                        if (vi2.TSizfFm2Yiuu(j)) {
                                        }
                                    }
                                }
                                c = ' ';
                                vi2.Companion.getClass();
                                j = vi2.lS5Rgt96tfkO;
                                if (vi2.TSizfFm2Yiuu(j)) {
                                }
                            } else {
                                i4 = 2;
                            }
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: f9
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(i4);
                    }
                });
            } else {
                intConsumer.accept(i4);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        yz0 yz0Var;
        v8 v8Var;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        ii2 ii2Var;
        if (Build.VERSION.SDK_INT < 34 || (yz0Var = this.TSizfFm2Yiuu) == null || (v8Var = yz0Var.wdg6QnbFHrFF) == null) {
            return false;
        }
        ki2 Y1f8riQaR6yg = yz0Var.Y1f8riQaR6yg();
        if (!v8Var.equals((Y1f8riQaR6yg == null || (ii2Var = Y1f8riQaR6yg.PxuCJdSBwIXG.PxuCJdSBwIXG) == null) ? null : ii2Var.PxuCJdSBwIXG)) {
            return false;
        }
        boolean RfyTYNmI9Srp = y3.RfyTYNmI9Srp(previewableHandwritingGesture);
        eh2 eh2Var = this.Y1f8riQaR6yg;
        if (RfyTYNmI9Srp) {
            SelectGesture BRwzKIf41E4i = ui0.BRwzKIf41E4i(previewableHandwritingGesture);
            if (eh2Var != null) {
                selectionArea = BRwzKIf41E4i.getSelectionArea();
                qt1 bEKsvqmvPh2y = vi0.bEKsvqmvPh2y(selectionArea);
                granularity4 = BRwzKIf41E4i.getGranularity();
                int yQRudnv4La6p = vi0.yQRudnv4La6p(granularity4);
                xh2.Companion.getClass();
                eh2Var.RfyTYNmI9Srp(xi0.BjEWd04qc7Mw(yz0Var, bEKsvqmvPh2y, yQRudnv4La6p));
            }
        } else if (ui0.jyegZNwi31qc(previewableHandwritingGesture)) {
            DeleteGesture x50lh2ztY7Y5 = ui0.x50lh2ztY7Y5(previewableHandwritingGesture);
            if (eh2Var != null) {
                deletionArea = x50lh2ztY7Y5.getDeletionArea();
                qt1 bEKsvqmvPh2y2 = vi0.bEKsvqmvPh2y(deletionArea);
                granularity3 = x50lh2ztY7Y5.getGranularity();
                int yQRudnv4La6p2 = vi0.yQRudnv4La6p(granularity3);
                xh2.Companion.getClass();
                eh2Var.BRwzKIf41E4i(xi0.BjEWd04qc7Mw(yz0Var, bEKsvqmvPh2y2, yQRudnv4La6p2));
            }
        } else if (ui0.aF05bpZJlKEP(previewableHandwritingGesture)) {
            SelectRangeGesture XL4ISE6Oc65B = ui0.XL4ISE6Oc65B(previewableHandwritingGesture);
            if (eh2Var != null) {
                selectionStartArea = XL4ISE6Oc65B.getSelectionStartArea();
                qt1 bEKsvqmvPh2y3 = vi0.bEKsvqmvPh2y(selectionStartArea);
                selectionEndArea = XL4ISE6Oc65B.getSelectionEndArea();
                qt1 bEKsvqmvPh2y4 = vi0.bEKsvqmvPh2y(selectionEndArea);
                granularity2 = XL4ISE6Oc65B.getGranularity();
                int yQRudnv4La6p3 = vi0.yQRudnv4La6p(granularity2);
                xh2.Companion.getClass();
                eh2Var.RfyTYNmI9Srp(xi0.a92UlCVFR9N8(yz0Var, bEKsvqmvPh2y3, bEKsvqmvPh2y4, yQRudnv4La6p3));
            }
        } else {
            if (!ui0.kpCQ9veP6n3I(previewableHandwritingGesture)) {
                return false;
            }
            DeleteRangeGesture cpQdD2nAriOS = ui0.cpQdD2nAriOS(previewableHandwritingGesture);
            if (eh2Var != null) {
                deletionStartArea = cpQdD2nAriOS.getDeletionStartArea();
                qt1 bEKsvqmvPh2y5 = vi0.bEKsvqmvPh2y(deletionStartArea);
                deletionEndArea = cpQdD2nAriOS.getDeletionEndArea();
                qt1 bEKsvqmvPh2y6 = vi0.bEKsvqmvPh2y(deletionEndArea);
                granularity = cpQdD2nAriOS.getGranularity();
                int yQRudnv4La6p4 = vi0.yQRudnv4La6p(granularity);
                xh2.Companion.getClass();
                eh2Var.BRwzKIf41E4i(xi0.a92UlCVFR9N8(yz0Var, bEKsvqmvPh2y5, bEKsvqmvPh2y6, yQRudnv4La6p4));
            }
        }
        int i = 1;
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new ro(i, eh2Var));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        uz0 uz0Var;
        boolean z4 = this.dgRBjINgWbAK;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                uz0Var = ((zz0) this.PxuCJdSBwIXG.OPXfSBeufaJ8).cpQdD2nAriOS;
                synchronized (uz0Var.TSizfFm2Yiuu) {
                    try {
                        uz0Var.a92UlCVFR9N8 = z2;
                        uz0Var.RAsUl2FVSrh6 = z3;
                        uz0Var.rtx2ld2ELZv4 = z5;
                        uz0Var.OPXfSBeufaJ8 = z;
                        if (z6) {
                            uz0Var.e9gEMXR7LXtO = true;
                            if (uz0Var.wdg6QnbFHrFF != null) {
                                uz0Var.PxuCJdSBwIXG();
                            }
                        }
                        uz0Var.Y1f8riQaR6yg = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        uz0Var = ((zz0) this.PxuCJdSBwIXG.OPXfSBeufaJ8).cpQdD2nAriOS;
        synchronized (uz0Var.TSizfFm2Yiuu) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.dgRBjINgWbAK;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((zz0) this.PxuCJdSBwIXG.OPXfSBeufaJ8).dgRBjINgWbAK.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            PxuCJdSBwIXG(new o42(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.dgRBjINgWbAK;
        if (z) {
            PxuCJdSBwIXG(new p42(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.dgRBjINgWbAK;
        if (!z) {
            return z;
        }
        PxuCJdSBwIXG(new q42(i, i2));
        return true;
    }
}
