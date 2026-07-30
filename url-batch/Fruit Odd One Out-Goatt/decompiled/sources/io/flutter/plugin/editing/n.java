package io.flutter.plugin.editing;

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
import e0.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import m0.o;
import m0.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class n implements f {

    /* renamed from: a, reason: collision with root package name */
    public final View f473a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f474b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f475c;

    /* renamed from: d, reason: collision with root package name */
    public final c0.a f476d;

    /* renamed from: e, reason: collision with root package name */
    public m f477e = new m(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public o f478f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f479g;

    /* renamed from: h, reason: collision with root package name */
    public g f480h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f481i;

    /* renamed from: j, reason: collision with root package name */
    public d f482j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f483k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f484l;
    public Rect m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f485n;

    /* renamed from: o, reason: collision with root package name */
    public q f486o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f487p;

    public n(View view, c0.a aVar, androidx.lifecycle.n nVar, io.flutter.plugin.platform.j jVar, io.flutter.plugin.platform.i iVar) {
        this.f473a = view;
        this.f480h = new g(null, view);
        this.f474b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f475c = e0.a.d(view.getContext().getSystemService(e0.a.j()));
        } else {
            this.f475c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f485n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new k(this));
        }
        this.f476d = aVar;
        aVar.f67d = new k(this);
        ((h0) aVar.f66c).d("TextInputClient.requestExistingInputState", null, null);
        this.f483k = jVar;
        jVar.f518g = this;
        this.f484l = iVar;
        iVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r7 == r0.f839e) goto L38;
     */
    @Override // io.flutter.plugin.editing.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String gVar = this.f480h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f475c) != null && this.f479g != null) {
                int hashCode = ((String) this.f478f.f829j.f70a).hashCode();
                forText = AutofillValue.forText(gVar);
                autofillManager.notifyValueChanged(this.f473a, hashCode, forText);
            }
        }
        g gVar2 = this.f480h;
        gVar2.getClass();
        int selectionStart = Selection.getSelectionStart(gVar2);
        g gVar3 = this.f480h;
        gVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(gVar3);
        g gVar4 = this.f480h;
        gVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar4);
        g gVar5 = this.f480h;
        gVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar5);
        g gVar6 = this.f480h;
        gVar6.getClass();
        ArrayList arrayList = gVar6.f448f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f486o != null) {
            if (this.f480h.toString().equals(this.f486o.f835a)) {
                q qVar = this.f486o;
                if (selectionStart == qVar.f836b) {
                    if (selectionEnd == qVar.f837c) {
                        if (composingSpanStart == qVar.f838d) {
                        }
                    }
                }
            }
            this.f480h.toString();
            boolean z3 = this.f478f.f824e;
            m mVar = this.f477e;
            c0.a aVar = this.f476d;
            if (z3) {
                int i2 = mVar.f472b;
                aVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    j jVar = (j) arrayList2.get(i3);
                    jVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", jVar.f459a.toString());
                        jSONObject.put("deltaText", jVar.f460b.toString());
                        jSONObject.put("deltaStart", jVar.f461c);
                        jSONObject.put("deltaEnd", jVar.f462d);
                        jSONObject.put("selectionBase", jVar.f463e);
                        jSONObject.put("selectionExtent", jVar.f464f);
                        jSONObject.put("composingBase", jVar.f465g);
                        jSONObject.put("composingExtent", jVar.f466h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                    i3 = i4;
                }
                hashMap.put("deltas", jSONArray);
                ((h0) aVar.f66c).d("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f480h.f448f.clear();
            } else {
                int i5 = mVar.f472b;
                String gVar7 = this.f480h.toString();
                aVar.getClass();
                ((h0) aVar.f66c).d("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i5), c0.a.x(gVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f486o = new q(this.f480h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f480h.f448f.clear();
    }

    public final void b() {
        this.f483k.f518g = null;
        this.f484l.getClass();
        this.f476d.f67d = null;
        c();
        this.f480h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f485n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        o oVar;
        c0.e eVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f475c) == null || (oVar = this.f478f) == null || (eVar = oVar.f829j) == null || this.f479g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f473a, ((String) eVar.f70a).hashCode());
    }

    public final void d(o oVar) {
        c0.e eVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (oVar == null || (eVar = oVar.f829j) == null) {
            this.f479g = null;
            return;
        }
        o[] oVarArr = oVar.f831l;
        SparseArray sparseArray = new SparseArray();
        this.f479g = sparseArray;
        if (oVarArr == null) {
            sparseArray.put(((String) eVar.f70a).hashCode(), oVar);
            return;
        }
        for (o oVar2 : oVarArr) {
            c0.e eVar2 = oVar2.f829j;
            if (eVar2 != null) {
                String str = (String) eVar2.f70a;
                this.f479g.put(str.hashCode(), oVar2);
                AutofillManager autofillManager = this.f475c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((q) eVar2.f72c).f835a);
                autofillManager.notifyValueChanged(this.f473a, hashCode, forText);
            }
        }
    }
}
