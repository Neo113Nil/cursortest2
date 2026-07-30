package g2;

import a2.j0;
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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final b6.c f4051a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4052b;

    /* renamed from: c, reason: collision with root package name */
    public int f4053c;

    /* renamed from: d, reason: collision with root package name */
    public w f4054d;

    /* renamed from: e, reason: collision with root package name */
    public int f4055e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4056f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4057g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4058h = true;

    public s(w wVar, b6.c cVar, boolean z8) {
        this.f4051a = cVar;
        this.f4052b = z8;
        this.f4054d = wVar;
    }

    public final void a(i iVar) {
        this.f4053c++;
        try {
            this.f4057g.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [q6.c, r6.l] */
    public final boolean b() {
        int i7 = this.f4053c - 1;
        this.f4053c = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f4057g;
            if (!arrayList.isEmpty()) {
                ((z) this.f4051a.f1394g).f4079e.f(e6.l.x0(arrayList));
                arrayList.clear();
            }
        }
        return this.f4053c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z8 = this.f4058h;
        if (!z8) {
            return z8;
        }
        this.f4053c++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z8 = this.f4058h;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f4057g.clear();
        this.f4053c = 0;
        this.f4058h = false;
        ArrayList arrayList = ((z) this.f4051a.f1394g).f4083i;
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
        boolean z8 = this.f4058h;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z8 = this.f4058h;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z8 = this.f4058h;
        return z8 ? this.f4052b : z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z8 = this.f4058h;
        if (z8) {
            a(new a(String.valueOf(charSequence), i7));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z8 = this.f4058h;
        if (!z8) {
            return z8;
        }
        a(new g(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z8 = this.f4058h;
        if (!z8) {
            return z8;
        }
        a(new h(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z8 = this.f4058h;
        if (!z8) {
            return z8;
        }
        a(new k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        w wVar = this.f4054d;
        return TextUtils.getCapsMode(wVar.f4065a.f373f, j0.e(wVar.f4066b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z8 = (i7 & 1) != 0;
        this.f4056f = z8;
        if (z8) {
            this.f4055e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return a.a.O(this.f4054d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (j0.b(this.f4054d.f4066b)) {
            return null;
        }
        return j1.c.b0(this.f4054d).f373f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return j1.c.c0(this.f4054d, i7).f373f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return j1.c.d0(this.f4054d, i7).f373f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z8 = this.f4058h;
        if (z8) {
            z8 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new v(0, this.f4054d.f4065a.f373f.length()));
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
        boolean z8 = this.f4058h;
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
                ((z) this.f4051a.f1394g).f4080f.f(new l(i8));
            }
            i8 = 1;
            ((z) this.f4051a.f1394g).f4080f.f(new l(i8));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z8 = this.f4058h;
        if (z8) {
            return true;
        }
        return z8;
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
        e eVar;
        boolean z11 = this.f4058h;
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
                eVar = ((z) this.f4051a.f1394g).f4086l;
                synchronized (eVar.f4014c) {
                    try {
                        eVar.f4017f = z9;
                        eVar.f4018g = z10;
                        eVar.f4019h = z12;
                        eVar.f4020i = z8;
                        if (z13) {
                            eVar.f4016e = true;
                            if (eVar.f4021j != null) {
                                eVar.a();
                            }
                        }
                        eVar.f4015d = z14;
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
        eVar = ((z) this.f4051a.f1394g).f4086l;
        synchronized (eVar.f4014c) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [d6.g, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.f4058h;
        if (!z8) {
            return z8;
        }
        ((BaseInputConnection) ((z) this.f4051a.f1394g).f4084j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z8 = this.f4058h;
        if (z8) {
            a(new t(i7, i8));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z8 = this.f4058h;
        if (z8) {
            a(new u(String.valueOf(charSequence), i7));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z8 = this.f4058h;
        if (!z8) {
            return z8;
        }
        a(new v(i7, i8));
        return true;
    }
}
