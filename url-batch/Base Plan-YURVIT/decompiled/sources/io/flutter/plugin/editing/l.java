package io.flutter.plugin.editing;

import B0.C0008i;
import F.C0032n;
import N.C0056m;
import N.P;
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
import i.AbstractC0171s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o0.C0211b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.o;
import u0.q;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final View f2440a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f2441b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f2442c;

    /* renamed from: d, reason: collision with root package name */
    public final P f2443d;

    /* renamed from: e, reason: collision with root package name */
    public C0056m f2444e = new C0056m(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public o f2445f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f2446g;

    /* renamed from: h, reason: collision with root package name */
    public f f2447h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2448i;

    /* renamed from: j, reason: collision with root package name */
    public c f2449j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.l f2450k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f2451l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f2452m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f2453n;

    /* renamed from: o, reason: collision with root package name */
    public q f2454o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2455p;

    public l(View view, P p2, C0211b c0211b, io.flutter.plugin.platform.l lVar, io.flutter.plugin.platform.k kVar) {
        this.f2440a = view;
        this.f2447h = new f(null, view);
        this.f2441b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2442c = AbstractC0171s.e(view.getContext().getSystemService(AbstractC0171s.k()));
        } else {
            this.f2442c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f2453n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new j(this));
        }
        this.f2443d = p2;
        p2.f699g = new j(this);
        ((C0008i) p2.f698f).B("TextInputClient.requestExistingInputState", null, null);
        this.f2450k = lVar;
        lVar.f2485j = this;
        this.f2451l = kVar;
        kVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r7 == r0.f3058e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String fVar = this.f2447h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f2442c) != null && this.f2446g != null) {
                int hashCode = ((String) this.f2445f.f3047j.f409a).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f2440a, hashCode, forText);
            }
        }
        f fVar2 = this.f2447h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f2447h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f2447h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f2447h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f2447h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f2416i;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f2454o != null) {
            if (this.f2447h.toString().equals(this.f2454o.f3054a)) {
                q qVar = this.f2454o;
                if (selectionStart == qVar.f3055b) {
                    if (selectionEnd == qVar.f3056c) {
                        if (composingSpanStart == qVar.f3057d) {
                        }
                    }
                }
            }
            this.f2447h.toString();
            boolean z3 = this.f2445f.f3042e;
            P p2 = this.f2443d;
            if (z3) {
                int i2 = this.f2444e.f757c;
                p2.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    i iVar = (i) arrayList2.get(i3);
                    iVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", iVar.f2428a.toString());
                        jSONObject.put("deltaText", iVar.f2429b.toString());
                        jSONObject.put("deltaStart", iVar.f2430c);
                        jSONObject.put("deltaEnd", iVar.f2431d);
                        jSONObject.put("selectionBase", iVar.f2432e);
                        jSONObject.put("selectionExtent", iVar.f2433f);
                        jSONObject.put("composingBase", iVar.f2434g);
                        jSONObject.put("composingExtent", iVar.f2435h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                    i3 = i4;
                }
                hashMap.put("deltas", jSONArray);
                ((C0008i) p2.f698f).B("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f2447h.f2416i.clear();
            } else {
                int i5 = this.f2444e.f757c;
                String fVar7 = this.f2447h.toString();
                p2.getClass();
                ((C0008i) p2.f698f).B("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i5), P.x(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f2454o = new q(this.f2447h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f2447h.f2416i.clear();
    }

    public final void b() {
        this.f2450k.f2485j = null;
        this.f2451l.getClass();
        this.f2443d.f699g = null;
        c();
        this.f2447h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f2453n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        o oVar;
        C0032n c0032n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f2442c) == null || (oVar = this.f2445f) == null || (c0032n = oVar.f3047j) == null || this.f2446g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f2440a, ((String) c0032n.f409a).hashCode());
    }

    public final void d(o oVar) {
        C0032n c0032n;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (oVar == null || (c0032n = oVar.f3047j) == null) {
            this.f2446g = null;
            return;
        }
        o[] oVarArr = oVar.f3049l;
        SparseArray sparseArray = new SparseArray();
        this.f2446g = sparseArray;
        if (oVarArr == null) {
            sparseArray.put(((String) c0032n.f409a).hashCode(), oVar);
            return;
        }
        for (o oVar2 : oVarArr) {
            C0032n c0032n2 = oVar2.f3047j;
            if (c0032n2 != null) {
                String str = (String) c0032n2.f409a;
                this.f2446g.put(str.hashCode(), oVar2);
                AutofillManager autofillManager = this.f2442c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((q) c0032n2.f411c).f3054a);
                autofillManager.notifyValueChanged(this.f2440a, hashCode, forText);
            }
        }
    }
}
