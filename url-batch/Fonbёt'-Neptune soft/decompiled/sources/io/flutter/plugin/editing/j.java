package io.flutter.plugin.editing;

import A.C0010k;
import I.C0079n;
import P.O;
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
import io.flutter.plugin.platform.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.m;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final View f2596a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f2597b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f2598c;

    /* renamed from: d, reason: collision with root package name */
    public final O f2599d;

    /* renamed from: e, reason: collision with root package name */
    public C0010k f2600e = new C0010k(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public m f2601f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f2602g;

    /* renamed from: h, reason: collision with root package name */
    public e f2603h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2604i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f2605j;

    /* renamed from: k, reason: collision with root package name */
    public final o f2606k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f2607l;

    /* renamed from: m, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f2608m;

    /* renamed from: n, reason: collision with root package name */
    public v0.o f2609n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2610o;

    public j(View view, O o2, n0.d dVar, o oVar) {
        Object systemService;
        this.f2596a = view;
        this.f2603h = new e(null, view);
        this.f2597b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            systemService = view.getContext().getSystemService((Class<Object>) B.f.m());
            this.f2598c = B.f.g(systemService);
        } else {
            this.f2598c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f2608m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f2599d = o2;
        o2.f876g = new B.m(24, this);
        ((C0079n) o2.f875f).f("TextInputClient.requestExistingInputState", null, null);
        this.f2606k = oVar;
        oVar.f2660f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f3547e) goto L38;
     */
    @Override // io.flutter.plugin.editing.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String eVar = this.f2603h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f2598c) != null && this.f2602g != null) {
                int hashCode = ((String) this.f2601f.f3537j.f689e).hashCode();
                forText = AutofillValue.forText(eVar);
                autofillManager.notifyValueChanged(this.f2596a, hashCode, forText);
            }
        }
        e eVar2 = this.f2603h;
        eVar2.getClass();
        int selectionStart = Selection.getSelectionStart(eVar2);
        e eVar3 = this.f2603h;
        eVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(eVar3);
        e eVar4 = this.f2603h;
        eVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(eVar4);
        e eVar5 = this.f2603h;
        eVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(eVar5);
        e eVar6 = this.f2603h;
        eVar6.getClass();
        ArrayList arrayList = eVar6.f2573e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f2609n != null) {
            if (this.f2603h.toString().equals(this.f2609n.f3543a)) {
                v0.o oVar = this.f2609n;
                if (selectionStart == oVar.f3544b) {
                    if (selectionEnd == oVar.f3545c) {
                        if (composingSpanStart == oVar.f3546d) {
                        }
                    }
                }
            }
            this.f2603h.toString();
            boolean z3 = this.f2601f.f3532e;
            O o2 = this.f2599d;
            if (z3) {
                int i2 = this.f2600e.f49c;
                o2.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    hVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", hVar.f2585a.toString());
                        jSONObject.put("deltaText", hVar.f2586b.toString());
                        jSONObject.put("deltaStart", hVar.f2587c);
                        jSONObject.put("deltaEnd", hVar.f2588d);
                        jSONObject.put("selectionBase", hVar.f2589e);
                        jSONObject.put("selectionExtent", hVar.f2590f);
                        jSONObject.put("composingBase", hVar.f2591g);
                        jSONObject.put("composingExtent", hVar.f2592h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((C0079n) o2.f875f).f("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f2603h.f2573e.clear();
            } else {
                int i3 = this.f2600e.f49c;
                String eVar7 = this.f2603h.toString();
                o2.getClass();
                ((C0079n) o2.f875f).f("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), O.l(eVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f2609n = new v0.o(this.f2603h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f2603h.f2573e.clear();
    }

    public final void b(int i2) {
        C0010k c0010k = this.f2600e;
        int i3 = c0010k.f48b;
        if ((i3 == 3 || i3 == 4) && c0010k.f49c == i2) {
            this.f2600e = new C0010k(1, 0);
            d();
            View view = this.f2596a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f2597b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f2604i = false;
        }
    }

    public final void c() {
        this.f2606k.f2660f = null;
        this.f2599d.f876g = null;
        d();
        this.f2603h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f2608m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        m mVar;
        C0079n c0079n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f2598c) == null || (mVar = this.f2601f) == null || (c0079n = mVar.f3537j) == null || this.f2602g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f2596a, ((String) c0079n.f689e).hashCode());
    }

    public final void e(m mVar) {
        C0079n c0079n;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (mVar == null || (c0079n = mVar.f3537j) == null) {
            this.f2602g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f2602g = sparseArray;
        m[] mVarArr = mVar.f3539l;
        if (mVarArr == null) {
            sparseArray.put(((String) c0079n.f689e).hashCode(), mVar);
            return;
        }
        for (m mVar2 : mVarArr) {
            C0079n c0079n2 = mVar2.f3537j;
            if (c0079n2 != null) {
                SparseArray sparseArray2 = this.f2602g;
                String str = (String) c0079n2.f689e;
                sparseArray2.put(str.hashCode(), mVar2);
                AutofillManager autofillManager = this.f2598c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((v0.o) c0079n2.f691g).f3543a);
                autofillManager.notifyValueChanged(this.f2596a, hashCode, forText);
            }
        }
    }
}
