package y;

import A.a0;
import A0.K;
import G0.C0237a;
import G0.C0243g;
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
import f1.C0607a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C1160o0;
import s0.P0;
import w.P;
import z2.C1403G;

/* renamed from: y.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InputConnectionC1308B implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final C0607a f11445a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11446b;

    /* renamed from: c, reason: collision with root package name */
    public final P f11447c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f11448d;

    /* renamed from: e, reason: collision with root package name */
    public final P0 f11449e;

    /* renamed from: f, reason: collision with root package name */
    public int f11450f;

    /* renamed from: g, reason: collision with root package name */
    public G0.y f11451g;

    /* renamed from: h, reason: collision with root package name */
    public int f11452h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11453i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f11454j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f11455k = true;

    public InputConnectionC1308B(G0.y yVar, C0607a c0607a, boolean z4, P p4, a0 a0Var, P0 p02) {
        this.f11445a = c0607a;
        this.f11446b = z4;
        this.f11447c = p4;
        this.f11448d = a0Var;
        this.f11449e = p02;
        this.f11451g = yVar;
    }

    public final void a(G0.i iVar) {
        this.f11450f++;
        try {
            this.f11454j.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final boolean b() {
        int i2 = this.f11450f - 1;
        this.f11450f = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f11454j;
            if (!arrayList.isEmpty()) {
                ((z) this.f11445a.f6561e).f11524c.invoke(C1403G.I(arrayList));
                arrayList.clear();
            }
        }
        return this.f11450f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z4 = this.f11455k;
        if (!z4) {
            return z4;
        }
        this.f11450f++;
        return true;
    }

    public final void c(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        boolean z4 = this.f11455k;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f11454j.clear();
        this.f11450f = 0;
        this.f11455k = false;
        z zVar = (z) this.f11445a.f6561e;
        int size = zVar.f11531j.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = zVar.f11531j;
            if (Intrinsics.a(((WeakReference) arrayList.get(i2)).get(), this)) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z4 = this.f11455k;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z4 = this.f11455k;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z4 = this.f11455k;
        return z4 ? this.f11446b : z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z4 = this.f11455k;
        if (z4) {
            a(new C0237a(String.valueOf(charSequence), i2));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i4) {
        boolean z4 = this.f11455k;
        if (!z4) {
            return z4;
        }
        a(new C0243g(i2, i4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i4) {
        boolean z4 = this.f11455k;
        if (!z4) {
            return z4;
        }
        a(new G0.h(i2, i4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z4 = this.f11455k;
        if (!z4) {
            return z4;
        }
        a(new G0.k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        G0.y yVar = this.f11451g;
        return TextUtils.getCapsMode(yVar.f3093a.f328a, K.e(yVar.f3094b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z4 = (i2 & 1) != 0;
        this.f11453i = z4;
        if (z4) {
            this.f11452h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return m3.s.d(this.f11451g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        if (K.b(this.f11451g.f3094b)) {
            return null;
        }
        return u3.d.G(this.f11451g).f328a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i4) {
        return u3.d.H(this.f11451g, i2).f328a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i4) {
        return u3.d.I(this.f11451g, i2).f328a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        boolean z4 = this.f11455k;
        if (z4) {
            z4 = false;
            switch (i2) {
                case R.id.selectAll:
                    a(new G0.x(0, this.f11451g.f3093a.f328a.length()));
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
        return z4;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i4;
        boolean z4 = this.f11455k;
        if (z4) {
            z4 = true;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        i4 = 2;
                        break;
                    case 3:
                        i4 = 3;
                        break;
                    case 4:
                        i4 = 4;
                        break;
                    case 5:
                        i4 = 6;
                        break;
                    case 6:
                        i4 = 7;
                        break;
                    case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i4 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i2);
                        break;
                }
                ((z) this.f11445a.f6561e).f11525d.invoke(new G0.l(i4));
            }
            i4 = 1;
            ((z) this.f11445a.f6561e).f11525d.invoke(new G0.l(i4));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            h hVar = h.f11481a;
            C1160o0 c1160o0 = new C1160o0(11, this);
            hVar.a(this.f11447c, this.f11448d, handwritingGesture, this.f11449e, executor, intConsumer, c1160o0);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z4 = this.f11455k;
        if (z4) {
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return h.f11481a.b(this.f11447c, this.f11448d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z4) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = this.f11455k;
        if (!z7) {
            return z7;
        }
        boolean z8 = false;
        boolean z9 = (i2 & 1) != 0;
        boolean z10 = (i2 & 2) != 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            z4 = (i2 & 16) != 0;
            z5 = (i2 & 8) != 0;
            boolean z11 = (i2 & 4) != 0;
            if (i4 >= 34 && (i2 & 32) != 0) {
                z8 = true;
            }
            if (z4 || z5 || z11 || z8) {
                z6 = z8;
                z8 = z11;
            } else if (i4 >= 34) {
                z6 = true;
                z8 = true;
                z4 = true;
                z5 = true;
            } else {
                z4 = true;
                z5 = true;
                z6 = z8;
                z8 = true;
            }
        } else {
            z4 = true;
            z5 = true;
            z6 = false;
        }
        w wVar = ((z) this.f11445a.f6561e).f11534m;
        synchronized (wVar.f11505c) {
            try {
                wVar.f11508f = z4;
                wVar.f11509g = z5;
                wVar.f11510h = z8;
                wVar.f11511i = z6;
                if (z9) {
                    wVar.f11507e = true;
                    if (wVar.f11512j != null) {
                        wVar.a();
                    }
                }
                wVar.f11506d = z10;
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, y2.j] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f11455k;
        if (!z4) {
            return z4;
        }
        ((BaseInputConnection) ((z) this.f11445a.f6561e).f11532k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i4) {
        boolean z4 = this.f11455k;
        if (z4) {
            a(new G0.v(i2, i4));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z4 = this.f11455k;
        if (z4) {
            a(new G0.w(String.valueOf(charSequence), i2));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i4) {
        boolean z4 = this.f11455k;
        if (!z4) {
            return z4;
        }
        a(new G0.x(i2, i4));
        return true;
    }
}
