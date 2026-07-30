package io.flutter.plugin.editing;

import P0.l;
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
import com.google.firebase.messaging.AbstractC0315e;
import com.google.firebase.messaging.z;
import g0.C0432l;
import i.C0511M;
import io.flutter.plugin.platform.t;
import io.flutter.plugin.platform.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r4.o;
import r4.q;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final View f5653a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f5654b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f5655c;

    /* renamed from: d, reason: collision with root package name */
    public final l f5656d;

    /* renamed from: e, reason: collision with root package name */
    public C0432l f5657e = new C0432l(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public o f5658f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f5659g;

    /* renamed from: h, reason: collision with root package name */
    public f f5660h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5661i;
    public InputConnection j;

    /* renamed from: k, reason: collision with root package name */
    public final u f5662k;

    /* renamed from: l, reason: collision with root package name */
    public final t f5663l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f5664m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f5665n;

    /* renamed from: o, reason: collision with root package name */
    public q f5666o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5667p;

    public i(View view, l lVar, l4.b bVar, u uVar, t tVar) {
        this.f5653a = view;
        this.f5660h = new f(null, view);
        this.f5654b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f5655c = AbstractC0315e.h(view.getContext().getSystemService(AbstractC0315e.m()));
        } else {
            this.f5655c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f5665n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new C0511M(2, this));
        }
        this.f5656d = lVar;
        lVar.f2210i = new B.f(28, this);
        ((s4.q) lVar.f2209e).a("TextInputClient.requestExistingInputState", null, null);
        this.f5662k = uVar;
        uVar.f5759o = this;
        this.f5663l = tVar;
        tVar.f5735n = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r6 == r0.f7526e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z7) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z7) {
            String fVar = this.f5660h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f5655c) != null && this.f5659g != null) {
                int hashCode = ((String) this.f5658f.j.f4535d).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f5653a, hashCode, forText);
            }
        }
        f fVar2 = this.f5660h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f5660h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f5660h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f5660h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f5660h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f5633m;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f5666o != null) {
            if (this.f5660h.toString().equals(this.f5666o.f7522a)) {
                q qVar = this.f5666o;
                if (selectionStart == qVar.f7523b) {
                    if (selectionEnd == qVar.f7524c) {
                        if (composingSpanStart == qVar.f7525d) {
                        }
                    }
                }
            }
            this.f5660h.toString();
            boolean z8 = this.f5658f.f7511e;
            l lVar = this.f5656d;
            if (z8) {
                int i2 = this.f5657e.f4947c;
                lVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    int i7 = i5 + 1;
                    h hVar = (h) arrayList2.get(i5);
                    hVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", hVar.f5645a.toString());
                        jSONObject.put("deltaText", hVar.f5646b.toString());
                        jSONObject.put("deltaStart", hVar.f5647c);
                        jSONObject.put("deltaEnd", hVar.f5648d);
                        jSONObject.put("selectionBase", hVar.f5649e);
                        jSONObject.put("selectionExtent", hVar.f5650f);
                        jSONObject.put("composingBase", hVar.f5651g);
                        jSONObject.put("composingExtent", hVar.f5652h);
                    } catch (JSONException e7) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e7);
                    }
                    jSONArray.put(jSONObject);
                    i5 = i7;
                }
                hashMap.put("deltas", jSONArray);
                ((s4.q) lVar.f2209e).a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f5660h.f5633m.clear();
            } else {
                int i8 = this.f5657e.f4947c;
                String fVar7 = this.f5660h.toString();
                lVar.getClass();
                ((s4.q) lVar.f2209e).a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i8), l.a(selectionStart, selectionEnd, composingSpanStart, composingSpanEnd, fVar7)), null);
            }
            this.f5666o = new q(selectionStart, selectionEnd, composingSpanStart, composingSpanEnd, this.f5660h.toString());
            return;
        }
        this.f5660h.f5633m.clear();
    }

    public final void b(int i2) {
        C0432l c0432l = this.f5657e;
        int i5 = c0432l.f4946b;
        if ((i5 == 3 || i5 == 4) && c0432l.f4947c == i2) {
            this.f5657e = new C0432l(1, 0);
            d();
            View view = this.f5653a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f5654b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f5661i = false;
        }
    }

    public final void c() {
        this.f5662k.f5759o = null;
        this.f5663l.f5735n = null;
        this.f5656d.f2210i = null;
        d();
        this.f5660h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f5665n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        o oVar;
        z zVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f5655c) == null || (oVar = this.f5658f) == null || (zVar = oVar.j) == null || this.f5659g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f5653a, ((String) zVar.f4535d).hashCode());
    }

    public final void e(o oVar) {
        z zVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (oVar == null || (zVar = oVar.j) == null) {
            this.f5659g = null;
            return;
        }
        o[] oVarArr = oVar.f7517l;
        SparseArray sparseArray = new SparseArray();
        this.f5659g = sparseArray;
        if (oVarArr == null) {
            sparseArray.put(((String) zVar.f4535d).hashCode(), oVar);
            return;
        }
        for (o oVar2 : oVarArr) {
            z zVar2 = oVar2.j;
            if (zVar2 != null) {
                String str = (String) zVar2.f4535d;
                this.f5659g.put(str.hashCode(), oVar2);
                AutofillManager autofillManager = this.f5655c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((q) zVar2.f4537i).f7522a);
                autofillManager.notifyValueChanged(this.f5653a, hashCode, forText);
            }
        }
    }
}
