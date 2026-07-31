package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import u0.q;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: e, reason: collision with root package name */
    public int f2412e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f2413f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2414g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2415h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2416i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public String f2417j;

    /* renamed from: k, reason: collision with root package name */
    public String f2418k;

    /* renamed from: l, reason: collision with root package name */
    public int f2419l;

    /* renamed from: m, reason: collision with root package name */
    public int f2420m;

    /* renamed from: n, reason: collision with root package name */
    public int f2421n;

    /* renamed from: o, reason: collision with root package name */
    public int f2422o;

    /* renamed from: p, reason: collision with root package name */
    public final d f2423p;

    public f(q qVar, View view) {
        this.f2423p = new d(view, this);
        if (qVar != null) {
            f(qVar);
        }
    }

    public final void a(e eVar) {
        if (this.f2413f > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f2412e <= 0) {
            this.f2414g.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f2415h.add(eVar);
        }
    }

    public final void b() {
        this.f2412e++;
        if (this.f2413f > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f2412e != 1 || this.f2414g.isEmpty()) {
            return;
        }
        this.f2418k = toString();
        this.f2419l = Selection.getSelectionStart(this);
        this.f2420m = Selection.getSelectionEnd(this);
        this.f2421n = BaseInputConnection.getComposingSpanStart(this);
        this.f2422o = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f2412e;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f2414g;
        ArrayList arrayList2 = this.f2415h;
        if (i2 == 1) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                this.f2413f++;
                ((e) obj).a(true);
                this.f2413f--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f2418k), (this.f2419l == Selection.getSelectionStart(this) && this.f2420m == Selection.getSelectionEnd(this)) ? false : true, (this.f2421n == BaseInputConnection.getComposingSpanStart(this) && this.f2422o == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f2412e--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            ArrayList arrayList = this.f2414g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.f2413f++;
                ((e) obj).a(z2);
                this.f2413f--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f2413f > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f2414g.remove(eVar);
        if (this.f2412e > 0) {
            this.f2415h.remove(eVar);
        }
    }

    public final void f(q qVar) {
        b();
        replace(0, length(), (CharSequence) qVar.f3054a);
        int i2 = qVar.f3055b;
        if (i2 >= 0) {
            Selection.setSelection(this, i2, qVar.f3056c);
        } else {
            Selection.removeSelection(this);
        }
        int i3 = qVar.f3057d;
        int i4 = qVar.f3058e;
        if (i3 < 0 || i3 >= i4) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f2423p.setComposingRegion(i3, i4);
        }
        this.f2416i.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2432e = selectionStart;
        iVar.f2433f = selectionEnd;
        iVar.f2434g = composingSpanStart;
        iVar.f2435h = composingSpanEnd;
        iVar.f2428a = fVar;
        iVar.f2429b = "";
        iVar.f2430c = -1;
        iVar.f2431d = -1;
        this.f2416i.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f2417j;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f2417j = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f2413f > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f2417j = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2432e = selectionStart2;
        iVar.f2433f = selectionEnd2;
        iVar.f2434g = composingSpanStart2;
        iVar.f2435h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        iVar.f2428a = fVar;
        iVar.f2429b = charSequence2;
        iVar.f2430c = i2;
        iVar.f2431d = i3;
        this.f2416i.add(iVar);
        if (this.f2412e > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
