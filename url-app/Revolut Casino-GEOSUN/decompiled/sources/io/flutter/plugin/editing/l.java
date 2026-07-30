package io.flutter.plugin.editing;

import D.C0013n;
import L.C0026b;
import L.C0038n;
import L.Q;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import c0.AbstractC0099a;
import c0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import m0.C0193c;
import m0.C0205o;
import m0.C0207q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final r f2436a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f2437b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f2438c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f2439d;

    /* renamed from: e, reason: collision with root package name */
    public C0038n f2440e = new C0038n(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public C0205o f2441f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f2442g;

    /* renamed from: h, reason: collision with root package name */
    public f f2443h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2444i;

    /* renamed from: j, reason: collision with root package name */
    public c f2445j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f2446k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f2447l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f2448m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f2449n;

    /* renamed from: o, reason: collision with root package name */
    public C0207q f2450o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2451p;

    public l(r rVar, Q q2, C0193c c0193c, io.flutter.plugin.platform.k kVar, io.flutter.plugin.platform.j jVar) {
        this.f2436a = rVar;
        this.f2443h = new f(null, rVar);
        this.f2437b = (InputMethodManager) rVar.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2438c = AbstractC0099a.e(rVar.getContext().getSystemService(AbstractC0099a.j()));
        } else {
            this.f2438c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(rVar);
            this.f2449n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new j(this));
        }
        this.f2439d = q2;
        q2.f516g = new j(this);
        ((C0026b) q2.f515f).D("TextInputClient.requestExistingInputState", null, null);
        this.f2446k = kVar;
        kVar.f2482j = this;
        this.f2447l = jVar;
        jVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f2778e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String fVar = this.f2443h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f2438c) != null && this.f2442g != null) {
                int hashCode = ((String) this.f2441f.f2767j.f244a).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f2436a, hashCode, forText);
            }
        }
        f fVar2 = this.f2443h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f2443h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f2443h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f2443h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f2443h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f2412e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f2450o != null) {
            if (this.f2443h.toString().equals(this.f2450o.f2774a)) {
                C0207q c0207q = this.f2450o;
                if (selectionStart == c0207q.f2775b) {
                    if (selectionEnd == c0207q.f2776c) {
                        if (composingSpanStart == c0207q.f2777d) {
                        }
                    }
                }
            }
            this.f2443h.toString();
            boolean z3 = this.f2441f.f2762e;
            Q q2 = this.f2439d;
            if (z3) {
                int i2 = this.f2440e.f579c;
                q2.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", iVar.f2424a.toString());
                        jSONObject.put("deltaText", iVar.f2425b.toString());
                        jSONObject.put("deltaStart", iVar.f2426c);
                        jSONObject.put("deltaEnd", iVar.f2427d);
                        jSONObject.put("selectionBase", iVar.f2428e);
                        jSONObject.put("selectionExtent", iVar.f2429f);
                        jSONObject.put("composingBase", iVar.f2430g);
                        jSONObject.put("composingExtent", iVar.f2431h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((C0026b) q2.f515f).D("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f2443h.f2412e.clear();
            } else {
                int i3 = this.f2440e.f579c;
                String fVar7 = this.f2443h.toString();
                q2.getClass();
                ((C0026b) q2.f515f).D("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), Q.o(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f2450o = new C0207q(this.f2443h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f2443h.f2412e.clear();
    }

    public final void b() {
        this.f2446k.f2482j = null;
        this.f2447l.getClass();
        this.f2439d.f516g = null;
        c();
        this.f2443h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f2449n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        C0205o c0205o;
        C0013n c0013n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f2438c) == null || (c0205o = this.f2441f) == null || (c0013n = c0205o.f2767j) == null || this.f2442g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f2436a, ((String) c0013n.f244a).hashCode());
    }

    public final void d(C0205o c0205o) {
        C0013n c0013n;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (c0205o == null || (c0013n = c0205o.f2767j) == null) {
            this.f2442g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f2442g = sparseArray;
        C0205o[] c0205oArr = c0205o.f2769l;
        if (c0205oArr == null) {
            sparseArray.put(((String) c0013n.f244a).hashCode(), c0205o);
            return;
        }
        for (C0205o c0205o2 : c0205oArr) {
            C0013n c0013n2 = c0205o2.f2767j;
            if (c0013n2 != null) {
                SparseArray sparseArray2 = this.f2442g;
                String str = (String) c0013n2.f244a;
                sparseArray2.put(str.hashCode(), c0205o2);
                AutofillManager autofillManager = this.f2438c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((C0207q) c0013n2.f246c).f2774a);
                autofillManager.notifyValueChanged(this.f2436a, hashCode, forText);
            }
        }
    }
}
