package y;

import a0.x0;
import android.R;
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
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import s1.l0;
import s1.l2;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final l1.x f9761a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9762b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f9763c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f9764d;

    /* renamed from: e, reason: collision with root package name */
    public final l2 f9765e;

    /* renamed from: f, reason: collision with root package name */
    public int f9766f;

    /* renamed from: g, reason: collision with root package name */
    public g2.w f9767g;

    /* renamed from: h, reason: collision with root package name */
    public int f9768h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9769i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f9770j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f9771k = true;

    public w(g2.w wVar, l1.x xVar, boolean z8, j0 j0Var, x0 x0Var, l2 l2Var) {
        this.f9761a = xVar;
        this.f9762b = z8;
        this.f9763c = j0Var;
        this.f9764d = x0Var;
        this.f9765e = l2Var;
        this.f9767g = wVar;
    }

    public final void a(g2.i iVar) {
        this.f9766f++;
        try {
            this.f9770j.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [q6.c, r6.l] */
    public final boolean b() {
        int i7 = this.f9766f - 1;
        this.f9766f = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f9770j;
            if (!arrayList.isEmpty()) {
                ((u) this.f9761a.f5847g).f9749c.f(e6.l.x0(arrayList));
                arrayList.clear();
            }
        }
        return this.f9766f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z8 = this.f9771k;
        if (!z8) {
            return z8;
        }
        this.f9766f++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z8 = this.f9771k;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f9770j.clear();
        this.f9766f = 0;
        this.f9771k = false;
        ArrayList arrayList = ((u) this.f9761a.f5847g).f9756j;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (r6.k.a(((WeakReference) arrayList.get(i7)).get(), this)) {
                arrayList.remove(i7);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z8 = this.f9771k;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z8 = this.f9771k;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z8 = this.f9771k;
        return z8 ? this.f9762b : z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z8 = this.f9771k;
        if (z8) {
            a(new g2.a(String.valueOf(charSequence), i7));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z8 = this.f9771k;
        if (!z8) {
            return z8;
        }
        a(new g2.g(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z8 = this.f9771k;
        if (!z8) {
            return z8;
        }
        a(new g2.h(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z8 = this.f9771k;
        if (!z8) {
            return z8;
        }
        a(new g2.k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        g2.w wVar = this.f9767g;
        return TextUtils.getCapsMode(wVar.f4065a.f373f, a2.j0.e(wVar.f4066b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z8 = (i7 & 1) != 0;
        this.f9769i = z8;
        if (z8) {
            this.f9768h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return v0.d.c(this.f9767g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (a2.j0.b(this.f9767g.f4066b)) {
            return null;
        }
        return j1.c.b0(this.f9767g).f373f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return j1.c.c0(this.f9767g, i7).f373f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return j1.c.d0(this.f9767g, i7).f373f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z8 = this.f9771k;
        if (z8) {
            z8 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new g2.v(0, this.f9767g.f4065a.f373f.length()));
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
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        int i8;
        boolean z8 = this.f9771k;
        if (z8) {
            z8 = true;
            if (i7 != 0) {
                switch (i7) {
                    case 2:
                        i8 = 2;
                        break;
                    case 3:
                        i8 = 3;
                        break;
                    case 4:
                        i8 = 4;
                        break;
                    case 5:
                        i8 = 6;
                        break;
                    case 6:
                        i8 = 7;
                        break;
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i8 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i7);
                        break;
                }
                ((u) this.f9761a.f5847g).f9750d.f(new g2.l(i8));
            }
            i8 = 1;
            ((u) this.f9761a.f5847g).f9750d.f(new g2.l(i8));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.f9715a.a(this.f9763c, this.f9764d, handwritingGesture, this.f9765e, executor, intConsumer, new l0(13, this));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z8 = this.f9771k;
        if (z8) {
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return f.f9715a.b(this.f9763c, this.f9764d, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z8) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i7) {
        boolean z8;
        boolean z9;
        boolean z10;
        r rVar;
        boolean z11 = this.f9771k;
        if (!z11) {
            return z11;
        }
        boolean z12 = false;
        boolean z13 = (i7 & 1) != 0;
        boolean z14 = (i7 & 2) != 0;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            z9 = (i7 & 16) != 0;
            z10 = (i7 & 8) != 0;
            boolean z15 = (i7 & 4) != 0;
            if (i8 >= 34 && (i7 & 32) != 0) {
                z12 = true;
            }
            if (z9 || z10 || z15 || z12) {
                z8 = z12;
                z12 = z15;
                rVar = ((u) this.f9761a.f5847g).f9759m;
                synchronized (rVar.f9730c) {
                    try {
                        rVar.f9733f = z9;
                        rVar.f9734g = z10;
                        rVar.f9735h = z12;
                        rVar.f9736i = z8;
                        if (z13) {
                            rVar.f9732e = true;
                            if (rVar.f9737j != null) {
                                rVar.a();
                            }
                        }
                        rVar.f9731d = z14;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i8 >= 34) {
                z8 = true;
                z12 = true;
            } else {
                z8 = z12;
                z12 = true;
            }
            z9 = z12;
        } else {
            z8 = false;
            z9 = true;
        }
        z10 = z9;
        rVar = ((u) this.f9761a.f5847g).f9759m;
        synchronized (rVar.f9730c) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [d6.g, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.f9771k;
        if (!z8) {
            return z8;
        }
        ((BaseInputConnection) ((u) this.f9761a.f5847g).f9757k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z8 = this.f9771k;
        if (z8) {
            a(new g2.t(i7, i8));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z8 = this.f9771k;
        if (z8) {
            a(new g2.u(String.valueOf(charSequence), i7));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z8 = this.f9771k;
        if (!z8) {
            return z8;
        }
        a(new g2.v(i7, i8));
        return true;
    }
}
