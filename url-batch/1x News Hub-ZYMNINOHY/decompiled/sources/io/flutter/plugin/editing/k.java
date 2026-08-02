package io.flutter.plugin.editing;

import E.C0009j;
import O1.n;
import O1.p;
import P1.o;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import b0.s;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public final View f9213a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f9214b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f9215c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.e f9216d;

    /* renamed from: e, reason: collision with root package name */
    public C0009j f9217e = new C0009j(1, 0);
    public n f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f9218g;

    /* renamed from: h, reason: collision with root package name */
    public g f9219h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9220i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f9221j;

    /* renamed from: k, reason: collision with root package name */
    public final r f9222k;

    /* renamed from: l, reason: collision with root package name */
    public final q f9223l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f9224m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f9225n;
    public p o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9226p;

    public k(View view, V0.e eVar, C0.e eVar2, r rVar, q qVar) {
        this.f9213a = view;
        this.f9219h = new g(null, view);
        this.f9214b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            this.f9215c = j.b(view.getContext().getSystemService(j.i()));
        } else {
            this.f9215c = null;
        }
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f9225n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new b0.r(this));
        }
        this.f9216d = eVar;
        eVar.f1600c = new s(this);
        ((o) eVar.f1599b).a("TextInputClient.requestExistingInputState", null, null);
        this.f9222k = rVar;
        rVar.f9300g = this;
        this.f9223l = qVar;
        qVar.f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r10 == r0.f1209e) goto L44;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.flutter.plugin.editing.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z) {
            String gVar = this.f9219h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f9215c) != null && this.f9218g != null) {
                int hashCode = ((String) this.f.f1198j.f162a).hashCode();
                forText = AutofillValue.forText(gVar);
                autofillManager.notifyValueChanged(this.f9213a, hashCode, forText);
            }
        }
        g gVar2 = this.f9219h;
        gVar2.getClass();
        int selectionStart = Selection.getSelectionStart(gVar2);
        g gVar3 = this.f9219h;
        gVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(gVar3);
        g gVar4 = this.f9219h;
        gVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar4);
        g gVar5 = this.f9219h;
        gVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar5);
        g gVar6 = this.f9219h;
        gVar6.getClass();
        ArrayList arrayList = gVar6.f9195e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.o != null) {
            if (this.f9219h.toString().equals(this.o.f1205a)) {
                p pVar = this.o;
                if (selectionStart == pVar.f1206b) {
                    if (selectionEnd == pVar.f1207c) {
                        if (composingSpanStart == pVar.f1208d) {
                        }
                    }
                }
            }
            this.f9219h.toString();
            boolean z2 = this.f.f1194e;
            V0.e eVar = this.f9216d;
            if (z2) {
                int i3 = this.f9217e.f292c;
                eVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", iVar.f9206a.toString());
                        jSONObject.put("deltaText", iVar.f9207b.toString());
                        jSONObject.put("deltaStart", iVar.f9208c);
                        jSONObject.put("deltaEnd", iVar.f9209d);
                        jSONObject.put("selectionBase", iVar.f9210e);
                        jSONObject.put("selectionExtent", iVar.f);
                        jSONObject.put("composingBase", iVar.f9211g);
                        jSONObject.put("composingExtent", iVar.f9212h);
                    } catch (JSONException e3) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e3);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((o) eVar.f1599b).a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i3), hashMap), null);
                this.f9219h.f9195e.clear();
            } else {
                int i4 = this.f9217e.f292c;
                String gVar7 = this.f9219h.toString();
                eVar.getClass();
                ((o) eVar.f1599b).a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i4), V0.e.v(gVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.o = new p(this.f9219h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f9219h.f9195e.clear();
    }

    public final void b(int i3) {
        C0009j c0009j = this.f9217e;
        int i4 = c0009j.f291b;
        if ((i4 == 3 || i4 == 4) && c0009j.f292c == i3) {
            this.f9217e = new C0009j(1, 0);
            d();
            View view = this.f9213a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f9214b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f9220i = false;
        }
    }

    public final void c() {
        this.f9222k.f9300g = null;
        this.f9223l.f = null;
        this.f9216d.f1600c = null;
        d();
        this.f9219h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f9225n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        n nVar;
        B0.p pVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f9215c) == null || (nVar = this.f) == null || (pVar = nVar.f1198j) == null || this.f9218g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f9213a, ((String) pVar.f162a).hashCode());
    }

    public final void e(n nVar) {
        B0.p pVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar == null || (pVar = nVar.f1198j) == null) {
            this.f9218g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f9218g = sparseArray;
        n[] nVarArr = nVar.f1200l;
        if (nVarArr == null) {
            sparseArray.put(((String) pVar.f162a).hashCode(), nVar);
            return;
        }
        for (n nVar2 : nVarArr) {
            B0.p pVar2 = nVar2.f1198j;
            if (pVar2 != null) {
                SparseArray sparseArray2 = this.f9218g;
                String str = (String) pVar2.f162a;
                sparseArray2.put(str.hashCode(), nVar2);
                AutofillManager autofillManager = this.f9215c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((p) pVar2.f164c).f1205a);
                autofillManager.notifyValueChanged(this.f9213a, hashCode, forText);
            }
        }
    }
}
