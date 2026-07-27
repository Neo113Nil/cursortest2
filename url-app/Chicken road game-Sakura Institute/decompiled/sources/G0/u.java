package G0;

import A0.K;
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
import w2.C1294c;
import z2.C1403G;

/* loaded from: classes.dex */
public final class u implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final C1294c f3079a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3080b;

    /* renamed from: c, reason: collision with root package name */
    public int f3081c;

    /* renamed from: d, reason: collision with root package name */
    public y f3082d;

    /* renamed from: e, reason: collision with root package name */
    public int f3083e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3084f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3085g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f3086h = true;

    public u(y yVar, C1294c c1294c, boolean z4) {
        this.f3079a = c1294c;
        this.f3080b = z4;
        this.f3082d = yVar;
    }

    public final void a(i iVar) {
        this.f3081c++;
        try {
            this.f3085g.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final boolean b() {
        int i2 = this.f3081c - 1;
        this.f3081c = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f3085g;
            if (!arrayList.isEmpty()) {
                ((B) this.f3079a.f11388d).f3012e.invoke(C1403G.I(arrayList));
                arrayList.clear();
            }
        }
        return this.f3081c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z4 = this.f3086h;
        if (!z4) {
            return z4;
        }
        this.f3081c++;
        return true;
    }

    public final void c(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        boolean z4 = this.f3086h;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3085g.clear();
        this.f3081c = 0;
        this.f3086h = false;
        B b4 = (B) this.f3079a.f11388d;
        int size = b4.f3016i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = b4.f3016i;
            if (Intrinsics.a(((WeakReference) arrayList.get(i2)).get(), this)) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z4 = this.f3086h;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z4 = this.f3086h;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z4 = this.f3086h;
        return z4 ? this.f3080b : z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z4 = this.f3086h;
        if (z4) {
            a(new C0237a(String.valueOf(charSequence), i2));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i4) {
        boolean z4 = this.f3086h;
        if (!z4) {
            return z4;
        }
        a(new C0243g(i2, i4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i4) {
        boolean z4 = this.f3086h;
        if (!z4) {
            return z4;
        }
        a(new h(i2, i4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z4 = this.f3086h;
        if (!z4) {
            return z4;
        }
        a(new k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        y yVar = this.f3082d;
        return TextUtils.getCapsMode(yVar.f3093a.f328a, K.e(yVar.f3094b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z4 = (i2 & 1) != 0;
        this.f3084f = z4;
        if (z4) {
            this.f3083e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return j0.c.S(this.f3082d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        if (K.b(this.f3082d.f3094b)) {
            return null;
        }
        return u3.d.G(this.f3082d).f328a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i4) {
        return u3.d.H(this.f3082d, i2).f328a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i4) {
        return u3.d.I(this.f3082d, i2).f328a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        boolean z4 = this.f3086h;
        if (z4) {
            z4 = false;
            switch (i2) {
                case R.id.selectAll:
                    a(new x(0, this.f3082d.f3093a.f328a.length()));
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
        boolean z4 = this.f3086h;
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
                ((B) this.f3079a.f11388d).f3013f.invoke(new l(i4));
            }
            i4 = 1;
            ((B) this.f3079a.f11388d).f3013f.invoke(new l(i4));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z4 = this.f3086h;
        if (z4) {
            return true;
        }
        return z4;
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
        boolean z7 = this.f3086h;
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
        C0241e c0241e = ((B) this.f3079a.f11388d).f3019l;
        synchronized (c0241e.f3041c) {
            try {
                c0241e.f3044f = z4;
                c0241e.f3045g = z5;
                c0241e.f3046h = z8;
                c0241e.f3047i = z6;
                if (z9) {
                    c0241e.f3043e = true;
                    if (c0241e.f3048j != null) {
                        c0241e.a();
                    }
                }
                c0241e.f3042d = z10;
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
        boolean z4 = this.f3086h;
        if (!z4) {
            return z4;
        }
        ((BaseInputConnection) ((B) this.f3079a.f11388d).f3017j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i4) {
        boolean z4 = this.f3086h;
        if (z4) {
            a(new v(i2, i4));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z4 = this.f3086h;
        if (z4) {
            a(new w(String.valueOf(charSequence), i2));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i4) {
        boolean z4 = this.f3086h;
        if (!z4) {
            return z4;
        }
        a(new x(i2, i4));
        return true;
    }
}
