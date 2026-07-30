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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t72 implements InputConnection {
    public final ot2 a;
    public final boolean b;
    public int c;
    public nv2 d;
    public int e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public boolean h = true;

    public t72(nv2 nv2Var, ot2 ot2Var, boolean z) {
        this.a = ot2Var;
        this.b = z;
        this.d = nv2Var;
    }

    public final void a(pf0 pf0Var) {
        this.c++;
        try {
            this.g.add(pf0Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            ArrayList arrayList = this.g;
            if (!arrayList.isEmpty()) {
                ((uv2) this.a.n).e.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        this.c++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        ArrayList arrayList = ((uv2) this.a.n).i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.b(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.h;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new yw(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new w90(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new x90(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new am0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        nv2 nv2Var = this.d;
        return TextUtils.getCapsMode(nv2Var.a.n, jw2.e(nv2Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f = z;
        if (z) {
            this.e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return bd3.M(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (jw2.b(this.d.b)) {
            return null;
        }
        return hl2.f(this.d).n;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return hl2.h(this.d, i).n;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return hl2.i(this.d, i).n;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new nj2(0, this.d.a.n.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
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
        boolean z = this.h;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((uv2) this.a.n).f.invoke(new b11(i2));
            }
            i2 = 1;
            ((uv2) this.a.n).f.invoke(new b11(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.h;
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
        o50 o50Var;
        boolean z4 = this.h;
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
                o50Var = ((uv2) this.a.n).l;
                synchronized (o50Var.c) {
                    try {
                        o50Var.f = z2;
                        o50Var.g = z3;
                        o50Var.h = z5;
                        o50Var.i = z;
                        if (z6) {
                            o50Var.e = true;
                            if (o50Var.j != null) {
                                o50Var.a();
                            }
                        }
                        o50Var.d = z7;
                        Unit unit = Unit.a;
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
        o50Var = ((uv2) this.a.n).l;
        synchronized (o50Var.c) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((uv2) this.a.n).j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new kj2(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new lj2(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new nj2(i, i2));
        return true;
    }
}
