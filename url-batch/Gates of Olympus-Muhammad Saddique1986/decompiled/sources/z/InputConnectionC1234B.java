package z;

import B.a0;
import C0.J;
import I0.C0188a;
import I0.C0194g;
import I0.C0195h;
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
import m.y0;
import r0.C0929z;
import u0.O0;
import x.Q;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InputConnectionC1234B implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f10417a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10418b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f10419c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f10420d;

    /* renamed from: e, reason: collision with root package name */
    public final O0 f10421e;

    /* renamed from: f, reason: collision with root package name */
    public int f10422f;

    /* renamed from: g, reason: collision with root package name */
    public I0.z f10423g;

    /* renamed from: h, reason: collision with root package name */
    public int f10424h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10425i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10426j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f10427k = true;

    public InputConnectionC1234B(I0.z zVar, y0 y0Var, boolean z3, Q q3, a0 a0Var, O0 o02) {
        this.f10417a = y0Var;
        this.f10418b = z3;
        this.f10419c = q3;
        this.f10420d = a0Var;
        this.f10421e = o02;
        this.f10423g = zVar;
    }

    public final void a(I0.i iVar) {
        this.f10422f++;
        try {
            this.f10426j.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [e2.c, f2.k] */
    public final boolean b() {
        int i3 = this.f10422f - 1;
        this.f10422f = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.f10426j;
            if (!arrayList.isEmpty()) {
                ((z) this.f10417a.f6913d).f10496c.n(S1.l.b1(arrayList));
                arrayList.clear();
            }
        }
        return this.f10422f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z3 = this.f10427k;
        if (!z3) {
            return z3;
        }
        this.f10422f++;
        return true;
    }

    public final void c(int i3) {
        sendKeyEvent(new KeyEvent(0, i3));
        sendKeyEvent(new KeyEvent(1, i3));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i3) {
        boolean z3 = this.f10427k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f10426j.clear();
        this.f10422f = 0;
        this.f10427k = false;
        z zVar = (z) this.f10417a.f6913d;
        int size = zVar.f10503j.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = zVar.f10503j;
            if (f2.j.a(((WeakReference) arrayList.get(i3)).get(), this)) {
                arrayList.remove(i3);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z3 = this.f10427k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        boolean z3 = this.f10427k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z3 = this.f10427k;
        return z3 ? this.f10418b : z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i3) {
        boolean z3 = this.f10427k;
        if (z3) {
            a(new C0188a(String.valueOf(charSequence), i3));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        boolean z3 = this.f10427k;
        if (!z3) {
            return z3;
        }
        a(new C0194g(i3, i4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        boolean z3 = this.f10427k;
        if (!z3) {
            return z3;
        }
        a(new C0195h(i3, i4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z3 = this.f10427k;
        if (!z3) {
            return z3;
        }
        a(new I0.k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i3) {
        I0.z zVar = this.f10423g;
        return TextUtils.getCapsMode(zVar.f3097a.f596a, J.e(zVar.f3098b), i3);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        boolean z3 = (i3 & 1) != 0;
        this.f10425i = z3;
        if (z3) {
            this.f10424h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return n.r.e(this.f10423g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i3) {
        if (J.b(this.f10423g.f3098b)) {
            return null;
        }
        return O2.d.S(this.f10423g).f596a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i3, int i4) {
        return O2.d.U(this.f10423g, i3).f596a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i3, int i4) {
        return O2.d.V(this.f10423g, i3).f596a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        boolean z3 = this.f10427k;
        if (z3) {
            z3 = false;
            switch (i3) {
                case R.id.selectAll:
                    a(new I0.y(0, this.f10423g.f3097a.f596a.length()));
                    break;
                case R.id.cut:
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
                    c(279);
                    break;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [e2.c, f2.k] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i3) {
        int i4;
        boolean z3 = this.f10427k;
        if (z3) {
            z3 = true;
            if (i3 != 0) {
                switch (i3) {
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        i4 = 2;
                        break;
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        i4 = 3;
                        break;
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        i4 = 4;
                        break;
                    case 5:
                        i4 = 6;
                        break;
                    case 6:
                        i4 = 7;
                        break;
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i4 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i3);
                        break;
                }
                ((z) this.f10417a.f6913d).f10497d.n(new I0.l(i4));
            }
            i4 = 1;
            ((z) this.f10417a.f6913d).f10497d.n(new I0.l(i4));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C1243g c1243g = C1243g.f10451a;
            C0929z c0929z = new C0929z(16, this);
            c1243g.a(this.f10419c, this.f10420d, handwritingGesture, this.f10421e, executor, intConsumer, c0929z);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z3 = this.f10427k;
        if (z3) {
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1243g.f10451a.b(this.f10419c, this.f10420d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i3) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = this.f10427k;
        if (!z6) {
            return z6;
        }
        boolean z7 = false;
        boolean z8 = (i3 & 1) != 0;
        boolean z9 = (i3 & 2) != 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            z3 = (i3 & 16) != 0;
            z4 = (i3 & 8) != 0;
            boolean z10 = (i3 & 4) != 0;
            if (i4 >= 34 && (i3 & 32) != 0) {
                z7 = true;
            }
            if (z3 || z4 || z10 || z7) {
                z5 = z7;
                z7 = z10;
            } else if (i4 >= 34) {
                z5 = true;
                z7 = true;
                z3 = true;
                z4 = true;
            } else {
                z3 = true;
                z4 = true;
                z5 = z7;
                z7 = true;
            }
        } else {
            z3 = true;
            z4 = true;
            z5 = false;
        }
        w wVar = ((z) this.f10417a.f6913d).f10506m;
        synchronized (wVar.f10477c) {
            try {
                wVar.f10480f = z3;
                wVar.f10481g = z4;
                wVar.f10482h = z7;
                wVar.f10483i = z5;
                if (z8) {
                    wVar.f10479e = true;
                    if (wVar.f10484j != null) {
                        wVar.a();
                    }
                }
                wVar.f10478d = z9;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [R1.f, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f10427k;
        if (!z3) {
            return z3;
        }
        ((BaseInputConnection) ((z) this.f10417a.f6913d).f10504k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i3, int i4) {
        boolean z3 = this.f10427k;
        if (z3) {
            a(new I0.w(i3, i4));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        boolean z3 = this.f10427k;
        if (z3) {
            a(new I0.x(String.valueOf(charSequence), i3));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i4) {
        boolean z3 = this.f10427k;
        if (!z3) {
            return z3;
        }
        a(new I0.y(i3, i4));
        return true;
    }
}
