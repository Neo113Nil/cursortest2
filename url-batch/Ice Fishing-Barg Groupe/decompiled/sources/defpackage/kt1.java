package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kt1 implements InputConnection {
    public final b42 PxuCJdSBwIXG;
    public int TSizfFm2Yiuu;
    public oh2 Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public int e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;
    public final ArrayList RAsUl2FVSrh6 = new ArrayList();
    public boolean rtx2ld2ELZv4 = true;

    public kt1(oh2 oh2Var, b42 b42Var, boolean z) {
        this.PxuCJdSBwIXG = b42Var;
        this.lS5Rgt96tfkO = z;
        this.Y1f8riQaR6yg = oh2Var;
    }

    public final void PxuCJdSBwIXG(m40 m40Var) {
        this.TSizfFm2Yiuu++;
        try {
            this.RAsUl2FVSrh6.add(m40Var);
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
        boolean z = this.rtx2ld2ELZv4;
        if (!z) {
            return z;
        }
        this.TSizfFm2Yiuu++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.RAsUl2FVSrh6.clear();
        this.TSizfFm2Yiuu = 0;
        this.rtx2ld2ELZv4 = false;
        ArrayList arrayList = ((ci2) this.PxuCJdSBwIXG.OPXfSBeufaJ8).OPXfSBeufaJ8;
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
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.rtx2ld2ELZv4;
        return z ? this.lS5Rgt96tfkO : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            PxuCJdSBwIXG(new mm(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.rtx2ld2ELZv4;
        if (!z) {
            return z;
        }
        PxuCJdSBwIXG(new cy(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.rtx2ld2ELZv4;
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
        boolean z = this.rtx2ld2ELZv4;
        if (!z) {
            return z;
        }
        PxuCJdSBwIXG(new d80());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        oh2 oh2Var = this.Y1f8riQaR6yg;
        return TextUtils.getCapsMode(oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8, vi2.a92UlCVFR9N8(oh2Var.lS5Rgt96tfkO), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.a92UlCVFR9N8 = z;
        if (z) {
            this.e9gEMXR7LXtO = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ki0.nxJAScVArhE9(this.Y1f8riQaR6yg);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (vi2.TSizfFm2Yiuu(this.Y1f8riQaR6yg.lS5Rgt96tfkO)) {
            return null;
        }
        return sj0.jyegZNwi31qc(this.Y1f8riQaR6yg).OPXfSBeufaJ8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return sj0.aF05bpZJlKEP(this.Y1f8riQaR6yg, i).OPXfSBeufaJ8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return sj0.kpCQ9veP6n3I(this.Y1f8riQaR6yg, i).OPXfSBeufaJ8;
    }

    public final boolean lS5Rgt96tfkO() {
        int i = this.TSizfFm2Yiuu - 1;
        this.TSizfFm2Yiuu = i;
        if (i == 0) {
            ArrayList arrayList = this.RAsUl2FVSrh6;
            if (!arrayList.isEmpty()) {
                ((ci2) this.PxuCJdSBwIXG.OPXfSBeufaJ8).e9gEMXR7LXtO.OPXfSBeufaJ8(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.TSizfFm2Yiuu > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    PxuCJdSBwIXG(new q42(0, this.Y1f8riQaR6yg.PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
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
        boolean z = this.rtx2ld2ELZv4;
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
                ((ci2) this.PxuCJdSBwIXG.OPXfSBeufaJ8).a92UlCVFR9N8.OPXfSBeufaJ8(new jn0(i2));
            } else {
                jn0.Companion.getClass();
            }
            i2 = 1;
            ((ci2) this.PxuCJdSBwIXG.OPXfSBeufaJ8).a92UlCVFR9N8.OPXfSBeufaJ8(new jn0(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            return true;
        }
        return z;
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
        fv fvVar;
        boolean z4 = this.rtx2ld2ELZv4;
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
                fvVar = ((ci2) this.PxuCJdSBwIXG.OPXfSBeufaJ8).x50lh2ztY7Y5;
                synchronized (fvVar.TSizfFm2Yiuu) {
                    try {
                        fvVar.a92UlCVFR9N8 = z2;
                        fvVar.RAsUl2FVSrh6 = z3;
                        fvVar.rtx2ld2ELZv4 = z5;
                        fvVar.OPXfSBeufaJ8 = z;
                        if (z6) {
                            fvVar.e9gEMXR7LXtO = true;
                            if (fvVar.wdg6QnbFHrFF != null) {
                                fvVar.PxuCJdSBwIXG();
                            }
                        }
                        fvVar.Y1f8riQaR6yg = z7;
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
        fvVar = ((ci2) this.PxuCJdSBwIXG.OPXfSBeufaJ8).x50lh2ztY7Y5;
        synchronized (fvVar.TSizfFm2Yiuu) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.rtx2ld2ELZv4;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((ci2) this.PxuCJdSBwIXG.OPXfSBeufaJ8).wdg6QnbFHrFF.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            PxuCJdSBwIXG(new o42(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.rtx2ld2ELZv4;
        if (z) {
            PxuCJdSBwIXG(new p42(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.rtx2ld2ELZv4;
        if (!z) {
            return z;
        }
        PxuCJdSBwIXG(new q42(i, i2));
        return true;
    }
}
