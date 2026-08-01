package io.flutter.plugin.editing;

import E.AbstractC0000a;
import E.v;
import M.n;
import M.p;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final v f678a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f679b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f680c;

    /* renamed from: d, reason: collision with root package name */
    public final A.a f681d;

    /* renamed from: e, reason: collision with root package name */
    public l f682e = new l(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public n f683f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f684g;

    /* renamed from: h, reason: collision with root package name */
    public g f685h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f686i;

    /* renamed from: j, reason: collision with root package name */
    public d f687j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f688k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f689l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f690m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f691n;

    /* renamed from: o, reason: collision with root package name */
    public p f692o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f693p;

    public m(v vVar, A.a aVar, B.k kVar, io.flutter.plugin.platform.j jVar, io.flutter.plugin.platform.i iVar) {
        this.f678a = vVar;
        this.f685h = new g(null, vVar);
        this.f679b = (InputMethodManager) vVar.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f680c = AbstractC0000a.d(vVar.getContext().getSystemService(AbstractC0000a.i()));
        } else {
            this.f680c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(vVar);
            this.f691n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new j(this));
        }
        this.f681d = aVar;
        aVar.f4d = new j(this);
        ((A.e) aVar.f3c).h("TextInputClient.requestExistingInputState", null, null);
        this.f688k = jVar;
        jVar.f723g = this;
        this.f689l = iVar;
        iVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f400e) goto L38;
     */
    @Override // io.flutter.plugin.editing.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z) {
            String gVar = this.f685h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f680c) != null && this.f684g != null) {
                int hashCode = ((String) this.f683f.f389j.f7b).hashCode();
                forText = AutofillValue.forText(gVar);
                autofillManager.notifyValueChanged(this.f678a, hashCode, forText);
            }
        }
        g gVar2 = this.f685h;
        gVar2.getClass();
        int selectionStart = Selection.getSelectionStart(gVar2);
        g gVar3 = this.f685h;
        gVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(gVar3);
        g gVar4 = this.f685h;
        gVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar4);
        g gVar5 = this.f685h;
        gVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar5);
        g gVar6 = this.f685h;
        gVar6.getClass();
        ArrayList arrayList = gVar6.f652e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f692o != null) {
            if (this.f685h.toString().equals(this.f692o.f396a)) {
                p pVar = this.f692o;
                if (selectionStart == pVar.f397b) {
                    if (selectionEnd == pVar.f398c) {
                        if (composingSpanStart == pVar.f399d) {
                        }
                    }
                }
            }
            this.f685h.toString();
            boolean z2 = this.f683f.f384e;
            A.a aVar = this.f681d;
            if (z2) {
                int i2 = this.f682e.f677b;
                aVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", iVar.f664a.toString());
                        jSONObject.put("deltaText", iVar.f665b.toString());
                        jSONObject.put("deltaStart", iVar.f666c);
                        jSONObject.put("deltaEnd", iVar.f667d);
                        jSONObject.put("selectionBase", iVar.f668e);
                        jSONObject.put("selectionExtent", iVar.f669f);
                        jSONObject.put("composingBase", iVar.f670g);
                        jSONObject.put("composingExtent", iVar.f671h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((A.e) aVar.f3c).h("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f685h.f652e.clear();
            } else {
                int i3 = this.f682e.f677b;
                String gVar7 = this.f685h.toString();
                aVar.getClass();
                ((A.e) aVar.f3c).h("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), A.a.n(gVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f692o = new p(this.f685h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f685h.f652e.clear();
    }

    public final void b() {
        this.f688k.f723g = null;
        this.f689l.getClass();
        this.f681d.f4d = null;
        c();
        this.f685h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f691n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        n nVar;
        A.e eVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f680c) == null || (nVar = this.f683f) == null || (eVar = nVar.f389j) == null || this.f684g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f678a, ((String) eVar.f7b).hashCode());
    }

    public final void d(n nVar) {
        A.e eVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar == null || (eVar = nVar.f389j) == null) {
            this.f684g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f684g = sparseArray;
        n[] nVarArr = nVar.f391l;
        if (nVarArr == null) {
            sparseArray.put(((String) eVar.f7b).hashCode(), nVar);
            return;
        }
        for (n nVar2 : nVarArr) {
            A.e eVar2 = nVar2.f389j;
            if (eVar2 != null) {
                SparseArray sparseArray2 = this.f684g;
                String str = (String) eVar2.f7b;
                sparseArray2.put(str.hashCode(), nVar2);
                AutofillManager autofillManager = this.f680c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((p) eVar2.f9d).f396a);
                autofillManager.notifyValueChanged(this.f678a, hashCode, forText);
            }
        }
    }
}
