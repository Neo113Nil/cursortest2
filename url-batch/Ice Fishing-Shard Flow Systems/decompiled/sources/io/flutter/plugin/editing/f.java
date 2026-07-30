package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import r4.q;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public int f5629d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5630e = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5631i = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f5632l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f5633m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public String f5634n;

    /* renamed from: o, reason: collision with root package name */
    public String f5635o;

    /* renamed from: p, reason: collision with root package name */
    public int f5636p;

    /* renamed from: q, reason: collision with root package name */
    public int f5637q;

    /* renamed from: r, reason: collision with root package name */
    public int f5638r;

    /* renamed from: s, reason: collision with root package name */
    public int f5639s;

    /* renamed from: t, reason: collision with root package name */
    public final d f5640t;

    public f(q qVar, View view) {
        this.f5640t = new d(view, this);
        if (qVar != null) {
            f(qVar);
        }
    }

    public final void a(e eVar) {
        if (this.f5630e > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f5629d <= 0) {
            this.f5631i.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f5632l.add(eVar);
        }
    }

    public final void b() {
        this.f5629d++;
        if (this.f5630e > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f5629d != 1 || this.f5631i.isEmpty()) {
            return;
        }
        this.f5635o = toString();
        this.f5636p = Selection.getSelectionStart(this);
        this.f5637q = Selection.getSelectionEnd(this);
        this.f5638r = BaseInputConnection.getComposingSpanStart(this);
        this.f5639s = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f5629d;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f5631i;
        ArrayList arrayList2 = this.f5632l;
        if (i2 == 1) {
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                this.f5630e++;
                ((e) obj).a(true);
                this.f5630e--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f5635o), (this.f5636p == Selection.getSelectionStart(this) && this.f5637q == Selection.getSelectionEnd(this)) ? false : true, (this.f5638r == BaseInputConnection.getComposingSpanStart(this) && this.f5639s == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f5629d--;
    }

    public final void d(boolean z7, boolean z8, boolean z9) {
        if (z7 || z8 || z9) {
            ArrayList arrayList = this.f5631i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.f5630e++;
                ((e) obj).a(z7);
                this.f5630e--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f5630e > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f5631i.remove(eVar);
        if (this.f5629d > 0) {
            this.f5632l.remove(eVar);
        }
    }

    public final void f(q qVar) {
        b();
        replace(0, length(), (CharSequence) qVar.f7522a);
        int i2 = qVar.f7523b;
        if (i2 >= 0) {
            Selection.setSelection(this, i2, qVar.f7524c);
        } else {
            Selection.removeSelection(this);
        }
        int i5 = qVar.f7525d;
        int i7 = qVar.f7526e;
        if (i5 < 0 || i5 >= i7) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f5640t.setComposingRegion(i5, i7);
        }
        this.f5633m.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i5, int i7) {
        super.setSpan(obj, i2, i5, i7);
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f5649e = selectionStart;
        hVar.f5650f = selectionEnd;
        hVar.f5651g = composingSpanStart;
        hVar.f5652h = composingSpanEnd;
        hVar.f5645a = fVar;
        hVar.f5646b = "";
        hVar.f5647c = -1;
        hVar.f5648d = -1;
        this.f5633m.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f5634n;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f5634n = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i5, CharSequence charSequence, int i7, int i8) {
        if (this.f5630e > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i9 = i5 - i2;
        boolean z7 = i9 != i8 - i7;
        for (int i10 = 0; i10 < i9 && !z7; i10++) {
            z7 |= charAt(i2 + i10) != charSequence.charAt(i7 + i10);
        }
        if (z7) {
            this.f5634n = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i5, charSequence, i7, i8);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f5649e = selectionStart2;
        hVar.f5650f = selectionEnd2;
        hVar.f5651g = composingSpanStart2;
        hVar.f5652h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        hVar.f5645a = fVar;
        hVar.f5646b = charSequence2;
        hVar.f5647c = i2;
        hVar.f5648d = i5;
        this.f5633m.add(hVar);
        if (this.f5629d > 0) {
            return replace;
        }
        d(z7, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
