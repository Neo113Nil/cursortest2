package io.flutter.plugin.editing;

import D.C0102o;
import N3.n;
import N3.p;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import e3.AbstractC0345b;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.C0675e;
import u0.C0684n;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final View f4533a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f4534b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f4535c;

    /* renamed from: d, reason: collision with root package name */
    public final C0675e f4536d;

    /* renamed from: e, reason: collision with root package name */
    public C0102o f4537e = new C0102o(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public n f4538f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f4539g;

    /* renamed from: h, reason: collision with root package name */
    public f f4540h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4541i;

    /* renamed from: j, reason: collision with root package name */
    public c f4542j;

    /* renamed from: k, reason: collision with root package name */
    public final l f4543k;

    /* renamed from: l, reason: collision with root package name */
    public final k f4544l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f4545m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f4546n;

    /* renamed from: o, reason: collision with root package name */
    public p f4547o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4548p;

    public i(View view, C0675e c0675e, J1.c cVar, l lVar, k kVar) {
        this.f4533a = view;
        this.f4540h = new f(null, view);
        this.f4534b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            this.f4535c = AbstractC0345b.c(view.getContext().getSystemService(AbstractC0345b.i()));
        } else {
            this.f4535c = null;
        }
        if (i7 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f4546n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new V5.g(7, this));
        }
        this.f4536d = c0675e;
        c0675e.f5976c = new a6.d(this);
        ((B0.c) c0675e.f5975b).q("TextInputClient.requestExistingInputState", null, null);
        this.f4543k = lVar;
        lVar.f4580k = this;
        this.f4544l = kVar;
        kVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r7 == r0.f1752e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z5) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z5) {
            String fVar = this.f4540h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f4535c) != null && this.f4539g != null) {
                int hashCode = ((String) this.f4538f.f1741j.f5994g).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f4533a, hashCode, forText);
            }
        }
        f fVar2 = this.f4540h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f4540h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f4540h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f4540h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f4540h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f4513j;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f4547o != null) {
            if (this.f4540h.toString().equals(this.f4547o.f1748a)) {
                p pVar = this.f4547o;
                if (selectionStart == pVar.f1749b) {
                    if (selectionEnd == pVar.f1750c) {
                        if (composingSpanStart == pVar.f1751d) {
                        }
                    }
                }
            }
            this.f4540h.toString();
            boolean z6 = this.f4538f.f1736e;
            C0675e c0675e = this.f4536d;
            if (z6) {
                int i7 = this.f4537e.f300b;
                c0675e.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    int i9 = i8 + 1;
                    h hVar = (h) arrayList2.get(i8);
                    hVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", hVar.f4525a.toString());
                        jSONObject.put("deltaText", hVar.f4526b.toString());
                        jSONObject.put("deltaStart", hVar.f4527c);
                        jSONObject.put("deltaEnd", hVar.f4528d);
                        jSONObject.put("selectionBase", hVar.f4529e);
                        jSONObject.put("selectionExtent", hVar.f4530f);
                        jSONObject.put("composingBase", hVar.f4531g);
                        jSONObject.put("composingExtent", hVar.f4532h);
                    } catch (JSONException e4) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e4);
                    }
                    jSONArray.put(jSONObject);
                    i8 = i9;
                }
                hashMap.put("deltas", jSONArray);
                ((B0.c) c0675e.f5975b).q("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i7), hashMap), null);
                this.f4540h.f4513j.clear();
            } else {
                int i10 = this.f4537e.f300b;
                String fVar7 = this.f4540h.toString();
                c0675e.getClass();
                ((B0.c) c0675e.f5975b).q("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i10), C0675e.d(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f4547o = new p(this.f4540h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f4540h.f4513j.clear();
    }

    public final void b() {
        this.f4543k.f4580k = null;
        this.f4544l.getClass();
        this.f4536d.f5976c = null;
        c();
        this.f4540h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f4546n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        n nVar;
        C0684n c0684n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f4535c) == null || (nVar = this.f4538f) == null || (c0684n = nVar.f1741j) == null || this.f4539g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f4533a, ((String) c0684n.f5994g).hashCode());
    }

    public final void d(n nVar) {
        C0684n c0684n;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar == null || (c0684n = nVar.f1741j) == null) {
            this.f4539g = null;
            return;
        }
        n[] nVarArr = nVar.f1743l;
        SparseArray sparseArray = new SparseArray();
        this.f4539g = sparseArray;
        if (nVarArr == null) {
            sparseArray.put(((String) c0684n.f5994g).hashCode(), nVar);
            return;
        }
        for (n nVar2 : nVarArr) {
            C0684n c0684n2 = nVar2.f1741j;
            if (c0684n2 != null) {
                String str = (String) c0684n2.f5994g;
                this.f4539g.put(str.hashCode(), nVar2);
                AutofillManager autofillManager = this.f4535c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((p) c0684n2.f5996i).f1748a);
                autofillManager.notifyValueChanged(this.f4533a, hashCode, forText);
            }
        }
    }
}
