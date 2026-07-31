package I0;

import B.Y;
import C0.J;
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

/* loaded from: classes.dex */
public final class v implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Y f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3084b;

    /* renamed from: c, reason: collision with root package name */
    public int f3085c;

    /* renamed from: d, reason: collision with root package name */
    public z f3086d;

    /* renamed from: e, reason: collision with root package name */
    public int f3087e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3088f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3089g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f3090h = true;

    public v(z zVar, Y y3, boolean z3) {
        this.f3083a = y3;
        this.f3084b = z3;
        this.f3086d = zVar;
    }

    public final void a(i iVar) {
        this.f3085c++;
        try {
            this.f3089g.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [e2.c, f2.k] */
    public final boolean b() {
        int i3 = this.f3085c - 1;
        this.f3085c = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.f3089g;
            if (!arrayList.isEmpty()) {
                ((C) this.f3083a.f334d).f3016e.n(S1.l.b1(arrayList));
                arrayList.clear();
            }
        }
        return this.f3085c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z3 = this.f3090h;
        if (!z3) {
            return z3;
        }
        this.f3085c++;
        return true;
    }

    public final void c(int i3) {
        sendKeyEvent(new KeyEvent(0, i3));
        sendKeyEvent(new KeyEvent(1, i3));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i3) {
        boolean z3 = this.f3090h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3089g.clear();
        this.f3085c = 0;
        this.f3090h = false;
        C c2 = (C) this.f3083a.f334d;
        int size = c2.f3020i.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = c2.f3020i;
            if (f2.j.a(((WeakReference) arrayList.get(i3)).get(), this)) {
                arrayList.remove(i3);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z3 = this.f3090h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        boolean z3 = this.f3090h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z3 = this.f3090h;
        return z3 ? this.f3084b : z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i3) {
        boolean z3 = this.f3090h;
        if (z3) {
            a(new C0188a(String.valueOf(charSequence), i3));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        boolean z3 = this.f3090h;
        if (!z3) {
            return z3;
        }
        a(new C0194g(i3, i4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        boolean z3 = this.f3090h;
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
        boolean z3 = this.f3090h;
        if (!z3) {
            return z3;
        }
        a(new k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i3) {
        z zVar = this.f3086d;
        return TextUtils.getCapsMode(zVar.f3097a.f596a, J.e(zVar.f3098b), i3);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        boolean z3 = (i3 & 1) != 0;
        this.f3088f = z3;
        if (z3) {
            this.f3087e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return l0.c.P(this.f3086d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i3) {
        if (J.b(this.f3086d.f3098b)) {
            return null;
        }
        return O2.d.S(this.f3086d).f596a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i3, int i4) {
        return O2.d.U(this.f3086d, i3).f596a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i3, int i4) {
        return O2.d.V(this.f3086d, i3).f596a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        boolean z3 = this.f3090h;
        if (z3) {
            z3 = false;
            switch (i3) {
                case R.id.selectAll:
                    a(new y(0, this.f3086d.f3097a.f596a.length()));
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
        boolean z3 = this.f3090h;
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
                ((C) this.f3083a.f334d).f3017f.n(new l(i4));
            }
            i4 = 1;
            ((C) this.f3083a.f334d).f3017f.n(new l(i4));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z3 = this.f3090h;
        if (z3) {
            return true;
        }
        return z3;
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
        boolean z6 = this.f3090h;
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
        C0192e c0192e = ((C) this.f3083a.f334d).f3023l;
        synchronized (c0192e.f3045c) {
            try {
                c0192e.f3048f = z3;
                c0192e.f3049g = z4;
                c0192e.f3050h = z7;
                c0192e.f3051i = z5;
                if (z8) {
                    c0192e.f3047e = true;
                    if (c0192e.f3052j != null) {
                        c0192e.a();
                    }
                }
                c0192e.f3046d = z9;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [R1.f, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f3090h;
        if (!z3) {
            return z3;
        }
        ((BaseInputConnection) ((C) this.f3083a.f334d).f3021j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i3, int i4) {
        boolean z3 = this.f3090h;
        if (z3) {
            a(new w(i3, i4));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        boolean z3 = this.f3090h;
        if (z3) {
            a(new x(String.valueOf(charSequence), i3));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i4) {
        boolean z3 = this.f3090h;
        if (!z3) {
            return z3;
        }
        a(new y(i3, i4));
        return true;
    }
}
