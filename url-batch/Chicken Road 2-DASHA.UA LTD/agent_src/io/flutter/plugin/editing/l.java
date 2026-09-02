package io.flutter.plugin.editing;

import D.AbstractC0000a;
import D.u;
import D.y;
import M.o;
import M.q;
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
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final y f623a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f624b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f625c;

    /* renamed from: d, reason: collision with root package name */
    public final B.a f626d;

    /* renamed from: e, reason: collision with root package name */
    public k f627e = new k(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public o f628f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f629g;

    /* renamed from: h, reason: collision with root package name */
    public f f630h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f631i;

    /* renamed from: j, reason: collision with root package name */
    public c f632j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f633k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f634l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f635m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f636n;

    /* renamed from: o, reason: collision with root package name */
    public q f637o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f638p;

    public l(y yVar, B.a aVar, u uVar, io.flutter.plugin.platform.k kVar, io.flutter.plugin.platform.j jVar) {
        this.f623a = yVar;
        this.f630h = new f(null, yVar);
        this.f624b = (InputMethodManager) yVar.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f625c = AbstractC0000a.d(yVar.getContext().getSystemService(AbstractC0000a.i()));
        } else {
            this.f625c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(yVar);
            this.f636n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new i(this));
        }
        this.f626d = aVar;
        aVar.f4d = new i(this);
        ((C.b) aVar.f3c).f("TextInputClient.requestExistingInputState", null, null);
        this.f633k = kVar;
        kVar.f670g = this;
        this.f634l = jVar;
        jVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f342e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String fVar = this.f630h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f625c) != null && this.f629g != null) {
                int hashCode = ((String) this.f628f.f331j.f7a).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f623a, hashCode, forText);
            }
        }
        f fVar2 = this.f630h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f630h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f630h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f630h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f630h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f597e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f637o != null) {
            if (this.f630h.toString().equals(this.f637o.f338a)) {
                q qVar = this.f637o;
                if (selectionStart == qVar.f339b) {
                    if (selectionEnd == qVar.f340c) {
                        if (composingSpanStart == qVar.f341d) {
                        }
                    }
                }
            }
            this.f630h.toString();
            boolean z3 = this.f628f.f326e;
            B.a aVar = this.f626d;
            if (z3) {
                int i2 = this.f627e.f622b;
                aVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    hVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", hVar.f609a.toString());
                        jSONObject.put("deltaText", hVar.f610b.toString());
                        jSONObject.put("deltaStart", hVar.f611c);
                        jSONObject.put("deltaEnd", hVar.f612d);
                        jSONObject.put("selectionBase", hVar.f613e);
                        jSONObject.put("selectionExtent", hVar.f614f);
                        jSONObject.put("composingBase", hVar.f615g);
                        jSONObject.put("composingExtent", hVar.f616h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((C.b) aVar.f3c).f("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f630h.f597e.clear();
            } else {
                int i3 = this.f627e.f622b;
                String fVar7 = this.f630h.toString();
                aVar.getClass();
                ((C.b) aVar.f3c).f("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), B.a.m(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f637o = new q(this.f630h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f630h.f597e.clear();
    }

    public final void b() {
        this.f633k.f670g = null;
        this.f634l.getClass();
        this.f626d.f4d = null;
        c();
        this.f630h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f636n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        o oVar;
        B.e eVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f625c) == null || (oVar = this.f628f) == null || (eVar = oVar.f331j) == null || this.f629g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f623a, ((String) eVar.f7a).hashCode());
    }

    public final void d(o oVar) {
        B.e eVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (oVar == null || (eVar = oVar.f331j) == null) {
            this.f629g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f629g = sparseArray;
        o[] oVarArr = oVar.f333l;
        if (oVarArr == null) {
            sparseArray.put(((String) eVar.f7a).hashCode(), oVar);
            return;
        }
        for (o oVar2 : oVarArr) {
            B.e eVar2 = oVar2.f331j;
            if (eVar2 != null) {
                SparseArray sparseArray2 = this.f629g;
                String str = (String) eVar2.f7a;
                sparseArray2.put(str.hashCode(), oVar2);
                AutofillManager autofillManager = this.f625c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((q) eVar2.f9c).f338a);
                autofillManager.notifyValueChanged(this.f623a, hashCode, forText);
            }
        }
    }
}
