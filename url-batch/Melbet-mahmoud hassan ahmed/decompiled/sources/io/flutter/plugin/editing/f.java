package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.q;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.o;
import java.util.ArrayList;
import java.util.HashMap;
import l5.p;

/* loaded from: classes.dex */
public class f implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private final View f17307a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f17308b;

    /* renamed from: c, reason: collision with root package name */
    private final AutofillManager f17309c;

    /* renamed from: d, reason: collision with root package name */
    private final p f17310d;

    /* renamed from: e, reason: collision with root package name */
    private c f17311e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    private p.b f17312f;

    /* renamed from: g, reason: collision with root package name */
    private SparseArray<p.b> f17313g;

    /* renamed from: h, reason: collision with root package name */
    private io.flutter.plugin.editing.c f17314h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17315i;

    /* renamed from: j, reason: collision with root package name */
    private InputConnection f17316j;

    /* renamed from: k, reason: collision with root package name */
    private o f17317k;

    /* renamed from: l, reason: collision with root package name */
    private Rect f17318l;

    /* renamed from: m, reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f17319m;

    /* renamed from: n, reason: collision with root package name */
    private p.e f17320n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17321o;

    class a implements p.f {
        a() {
        }

        @Override // l5.p.f
        public void a() {
            f.this.m();
        }

        @Override // l5.p.f
        public void b() {
            f fVar = f.this;
            fVar.F(fVar.f17307a);
        }

        @Override // l5.p.f
        public void c(int i7, p.b bVar) {
            f.this.D(i7, bVar);
        }

        @Override // l5.p.f
        public void d(p.e eVar) {
            f fVar = f.this;
            fVar.E(fVar.f17307a, eVar);
        }

        @Override // l5.p.f
        public void e(String str, Bundle bundle) {
            f.this.B(str, bundle);
        }

        @Override // l5.p.f
        public void f(int i7, boolean z6) {
            f.this.C(i7, z6);
        }

        @Override // l5.p.f
        public void g(double d7, double d8, double[] dArr) {
            f.this.A(d7, d8, dArr);
        }

        @Override // l5.p.f
        public void h() {
            f.this.x();
        }

        @Override // l5.p.f
        public void i(boolean z6) {
            if (Build.VERSION.SDK_INT < 26 || f.this.f17309c == null) {
                return;
            }
            if (z6) {
                f.this.f17309c.commit();
            } else {
                f.this.f17309c.cancel();
            }
        }

        @Override // l5.p.f
        public void j() {
            if (f.this.f17311e.f17327a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                f.this.y();
            } else {
                f fVar = f.this;
                fVar.s(fVar.f17307a);
            }
        }
    }

    class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f17323a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f17324b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double[] f17325c;

        b(boolean z6, double[] dArr, double[] dArr2) {
            this.f17323a = z6;
            this.f17324b = dArr;
            this.f17325c = dArr2;
        }

        @Override // io.flutter.plugin.editing.f.d
        public void a(double d7, double d8) {
            double d9 = 1.0d;
            if (!this.f17323a) {
                double[] dArr = this.f17324b;
                d9 = 1.0d / (((dArr[3] * d7) + (dArr[7] * d8)) + dArr[15]);
            }
            double[] dArr2 = this.f17324b;
            double d10 = ((dArr2[0] * d7) + (dArr2[4] * d8) + dArr2[12]) * d9;
            double d11 = ((dArr2[1] * d7) + (dArr2[5] * d8) + dArr2[13]) * d9;
            double[] dArr3 = this.f17325c;
            if (d10 < dArr3[0]) {
                dArr3[0] = d10;
            } else if (d10 > dArr3[1]) {
                dArr3[1] = d10;
            }
            if (d11 < dArr3[2]) {
                dArr3[2] = d11;
            } else if (d11 > dArr3[3]) {
                dArr3[3] = d11;
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        a f17327a;

        /* renamed from: b, reason: collision with root package name */
        int f17328b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i7) {
            this.f17327a = aVar;
            this.f17328b = i7;
        }
    }

    private interface d {
        void a(double d7, double d8);
    }

    @SuppressLint({"NewApi"})
    public f(View view, p pVar, o oVar) {
        this.f17307a = view;
        this.f17314h = new io.flutter.plugin.editing.c(null, view);
        this.f17308b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i7 = Build.VERSION.SDK_INT;
        this.f17309c = i7 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (i7 >= 30) {
            int navigationBars = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : 0;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? navigationBars | WindowInsets.Type.statusBars() : navigationBars, WindowInsets.Type.ime());
            this.f17319m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f17310d = pVar;
        pVar.m(new a());
        pVar.j();
        this.f17317k = oVar;
        oVar.A(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(double d7, double d8, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z6 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d9 = dArr[12] / dArr[15];
        dArr2[1] = d9;
        dArr2[0] = d9;
        double d10 = dArr[13] / dArr[15];
        dArr2[3] = d10;
        dArr2[2] = d10;
        b bVar = new b(z6, dArr, dArr2);
        bVar.a(d7, 0.0d);
        bVar.a(d7, d8);
        bVar.a(0.0d, d8);
        Float valueOf = Float.valueOf(this.f17307a.getContext().getResources().getDisplayMetrics().density);
        double d11 = dArr2[0];
        double floatValue = valueOf.floatValue();
        Double.isNaN(floatValue);
        double d12 = dArr2[2];
        double floatValue2 = valueOf.floatValue();
        Double.isNaN(floatValue2);
        int i7 = (int) (d12 * floatValue2);
        double d13 = dArr2[1];
        double floatValue3 = valueOf.floatValue();
        Double.isNaN(floatValue3);
        int ceil = (int) Math.ceil(d13 * floatValue3);
        double d14 = dArr2[3];
        double floatValue4 = valueOf.floatValue();
        Double.isNaN(floatValue4);
        this.f17318l = new Rect((int) (d11 * floatValue), i7, ceil, (int) Math.ceil(d14 * floatValue4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i7, boolean z6) {
        if (!z6) {
            this.f17311e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i7);
            this.f17316j = null;
        } else {
            this.f17307a.requestFocus();
            this.f17311e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i7);
            this.f17308b.restartInput(this.f17307a);
            this.f17315i = false;
        }
    }

    private void H(p.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f18775j == null) {
            this.f17313g = null;
            return;
        }
        p.b[] bVarArr = bVar.f18776k;
        SparseArray<p.b> sparseArray = new SparseArray<>();
        this.f17313g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f18775j.f18777a.hashCode(), bVar);
            return;
        }
        for (p.b bVar2 : bVarArr) {
            p.b.a aVar = bVar2.f18775j;
            if (aVar != null) {
                this.f17313g.put(aVar.f18777a.hashCode(), bVar2);
                this.f17309c.notifyValueChanged(this.f17307a, aVar.f18777a.hashCode(), AutofillValue.forText(aVar.f18779c.f18790a));
            }
        }
    }

    private boolean k() {
        p.c cVar;
        p.b bVar = this.f17312f;
        return bVar == null || (cVar = bVar.f18772g) == null || cVar.f18781a != p.g.NONE;
    }

    private static boolean n(p.e eVar, p.e eVar2) {
        int i7 = eVar.f18794e - eVar.f18793d;
        if (i7 != eVar2.f18794e - eVar2.f18793d) {
            return true;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (eVar.f18790a.charAt(eVar.f18793d + i8) != eVar2.f18790a.charAt(eVar2.f18793d + i8)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f17308b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(p.c cVar, boolean z6, boolean z7, boolean z8, boolean z9, p.d dVar) {
        p.g gVar = cVar.f18781a;
        if (gVar == p.g.DATETIME) {
            return 4;
        }
        if (gVar == p.g.NUMBER) {
            int i7 = cVar.f18782b ? 4098 : 2;
            return cVar.f18783c ? i7 | 8192 : i7;
        }
        if (gVar == p.g.PHONE) {
            return 3;
        }
        if (gVar == p.g.NONE) {
            return 0;
        }
        int i8 = 1;
        if (gVar == p.g.MULTILINE) {
            i8 = 131073;
        } else if (gVar == p.g.EMAIL_ADDRESS) {
            i8 = 33;
        } else if (gVar == p.g.URL) {
            i8 = 17;
        } else if (gVar == p.g.VISIBLE_PASSWORD) {
            i8 = 145;
        } else if (gVar == p.g.NAME) {
            i8 = 97;
        } else if (gVar == p.g.POSTAL_ADDRESS) {
            i8 = 113;
        }
        if (z6) {
            i8 = i8 | 524288 | 128;
        } else {
            if (z7) {
                i8 |= 32768;
            }
            if (!z8) {
                i8 |= 524288;
            }
        }
        return dVar == p.d.CHARACTERS ? i8 | 4096 : dVar == p.d.WORDS ? i8 | 8192 : dVar == p.d.SENTENCES ? i8 | 16384 : i8;
    }

    private boolean v() {
        return this.f17313g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f17309c == null || !v()) {
            return;
        }
        this.f17309c.notifyValueChanged(this.f17307a, this.f17312f.f18775j.f18777a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f17309c == null || !v()) {
            return;
        }
        String str = this.f17312f.f18775j.f18777a;
        int[] iArr = new int[2];
        this.f17307a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f17318l);
        rect.offset(iArr[0], iArr[1]);
        this.f17309c.notifyViewEntered(this.f17307a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        p.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f17309c == null || (bVar = this.f17312f) == null || bVar.f18775j == null || !v()) {
            return;
        }
        this.f17309c.notifyViewExited(this.f17307a, this.f17312f.f18775j.f18777a.hashCode());
    }

    public void B(String str, Bundle bundle) {
        this.f17308b.sendAppPrivateCommand(this.f17307a, str, bundle);
    }

    void D(int i7, p.b bVar) {
        y();
        this.f17312f = bVar;
        this.f17311e = k() ? new c(c.a.FRAMEWORK_CLIENT, i7) : new c(c.a.NO_TARGET, i7);
        this.f17314h.l(this);
        p.b.a aVar = bVar.f18775j;
        this.f17314h = new io.flutter.plugin.editing.c(aVar != null ? aVar.f18779c : null, this.f17307a);
        H(bVar);
        this.f17315i = true;
        G();
        this.f17318l = null;
        this.f17314h.a(this);
    }

    void E(View view, p.e eVar) {
        p.e eVar2;
        if (!this.f17315i && (eVar2 = this.f17320n) != null && eVar2.b()) {
            boolean n7 = n(this.f17320n, eVar);
            this.f17315i = n7;
            if (n7) {
                z4.b.d("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f17320n = eVar;
        this.f17314h.n(eVar);
        if (this.f17315i) {
            this.f17308b.restartInput(view);
            this.f17315i = false;
        }
    }

    void F(View view) {
        if (!k()) {
            s(view);
        } else {
            view.requestFocus();
            this.f17308b.showSoftInput(view, 0);
        }
    }

    public void G() {
        if (this.f17311e.f17327a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f17321o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.f18794e) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    @Override // io.flutter.plugin.editing.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z6, boolean z7, boolean z8) {
        boolean z9;
        if (z6) {
            w(this.f17314h.toString());
        }
        int i7 = this.f17314h.i();
        int h7 = this.f17314h.h();
        int g7 = this.f17314h.g();
        int f7 = this.f17314h.f();
        ArrayList<e> e7 = this.f17314h.e();
        if (this.f17320n != null) {
            if (this.f17314h.toString().equals(this.f17320n.f18790a)) {
                p.e eVar = this.f17320n;
                if (i7 == eVar.f18791b) {
                    if (h7 == eVar.f18792c) {
                        if (g7 == eVar.f18793d) {
                        }
                    }
                }
            }
            z9 = false;
            if (!z9) {
                this.f17314h.c();
                return;
            }
            z4.b.e("TextInputPlugin", "send EditingState to flutter: " + this.f17314h.toString());
            if (this.f17312f.f18770e) {
                this.f17310d.p(this.f17311e.f17328b, e7);
                this.f17314h.c();
            } else {
                this.f17310d.o(this.f17311e.f17328b, this.f17314h.toString(), i7, h7, g7, f7);
            }
            this.f17320n = new p.e(this.f17314h.toString(), i7, h7, g7, f7);
            return;
        }
        z9 = true;
        if (!z9) {
        }
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        p.b bVar;
        p.b.a aVar;
        p.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f17312f) == null || this.f17313g == null || (aVar = bVar.f18775j) == null) {
            return;
        }
        HashMap<String, p.e> hashMap = new HashMap<>();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            p.b bVar2 = this.f17313g.get(sparseArray.keyAt(i7));
            if (bVar2 != null && (aVar2 = bVar2.f18775j) != null) {
                String charSequence = sparseArray.valueAt(i7).getTextValue().toString();
                p.e eVar = new p.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f18777a.equals(aVar.f18777a)) {
                    this.f17314h.n(eVar);
                } else {
                    hashMap.put(aVar2.f18777a, eVar);
                }
            }
        }
        this.f17310d.q(this.f17311e.f17328b, hashMap);
    }

    public void l(int i7) {
        c cVar = this.f17311e;
        c.a aVar = cVar.f17327a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f17328b == i7) {
            this.f17311e = new c(c.a.NO_TARGET, 0);
            y();
            this.f17308b.hideSoftInputFromWindow(this.f17307a.getApplicationWindowToken(), 0);
            this.f17308b.restartInput(this.f17307a);
            this.f17315i = false;
        }
    }

    void m() {
        if (this.f17311e.f17327a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f17314h.l(this);
        y();
        this.f17312f = null;
        H(null);
        this.f17311e = new c(c.a.NO_TARGET, 0);
        G();
        this.f17318l = null;
    }

    public InputConnection o(View view, q qVar, EditorInfo editorInfo) {
        c cVar = this.f17311e;
        c.a aVar = cVar.f17327a;
        if (aVar == c.a.NO_TARGET) {
            this.f17316j = null;
            return null;
        }
        if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f17321o) {
                return this.f17316j;
            }
            InputConnection onCreateInputConnection = this.f17317k.c(cVar.f17328b).onCreateInputConnection(editorInfo);
            this.f17316j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        p.b bVar = this.f17312f;
        int t6 = t(bVar.f18772g, bVar.f18766a, bVar.f18767b, bVar.f18768c, bVar.f18769d, bVar.f18771f);
        editorInfo.inputType = t6;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f17312f.f18769d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f17312f.f18773h;
        int intValue = num == null ? (t6 & 131072) != 0 ? 1 : 6 : num.intValue();
        String str = this.f17312f.f18774i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        io.flutter.plugin.editing.b bVar2 = new io.flutter.plugin.editing.b(view, this.f17311e.f17328b, this.f17310d, qVar, this.f17314h, editorInfo);
        editorInfo.initialSelStart = this.f17314h.i();
        editorInfo.initialSelEnd = this.f17314h.h();
        this.f17316j = bVar2;
        return bVar2;
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.f17317k.J();
        this.f17310d.m(null);
        y();
        this.f17314h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f17319m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f17308b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f17316j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.b ? ((io.flutter.plugin.editing.b) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f17311e.f17327a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f17321o = true;
        }
    }

    public void z(ViewStructure viewStructure, int i7) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f17312f.f18775j.f18777a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i8 = 0; i8 < this.f17313g.size(); i8++) {
            int keyAt = this.f17313g.keyAt(i8);
            p.b.a aVar = this.f17313g.valueAt(i8).f18775j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i8);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f18778b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f18780d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f17318l) == null) {
                    viewStructure2 = newChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = aVar.f18779c.f18790a;
                } else {
                    viewStructure2 = newChild;
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f17318l.height());
                    charSequence = this.f17314h;
                }
                viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
            }
        }
    }
}
