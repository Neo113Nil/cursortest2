package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import v0.o;

/* loaded from: classes.dex */
public final class e extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f2569a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2570b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2571c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2572d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2573e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f2574f;

    /* renamed from: g, reason: collision with root package name */
    public String f2575g;

    /* renamed from: h, reason: collision with root package name */
    public int f2576h;

    /* renamed from: i, reason: collision with root package name */
    public int f2577i;

    /* renamed from: j, reason: collision with root package name */
    public int f2578j;

    /* renamed from: k, reason: collision with root package name */
    public int f2579k;

    /* renamed from: l, reason: collision with root package name */
    public final c f2580l;

    public e(o oVar, View view) {
        this.f2580l = new c(view, this);
        if (oVar != null) {
            f(oVar);
        }
    }

    public final void a(d dVar) {
        if (this.f2570b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + dVar.toString() + " in a listener callback");
        }
        if (this.f2569a <= 0) {
            this.f2571c.add(dVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f2572d.add(dVar);
        }
    }

    public final void b() {
        this.f2569a++;
        if (this.f2570b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f2569a != 1 || this.f2571c.isEmpty()) {
            return;
        }
        this.f2575g = toString();
        this.f2576h = Selection.getSelectionStart(this);
        this.f2577i = Selection.getSelectionEnd(this);
        this.f2578j = BaseInputConnection.getComposingSpanStart(this);
        this.f2579k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f2569a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f2571c;
        ArrayList arrayList2 = this.f2572d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                this.f2570b++;
                dVar.a(true);
                this.f2570b--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f2575g), (this.f2576h == Selection.getSelectionStart(this) && this.f2577i == Selection.getSelectionEnd(this)) ? false : true, (this.f2578j == BaseInputConnection.getComposingSpanStart(this) && this.f2579k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f2569a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f2571c.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                this.f2570b++;
                dVar.a(z2);
                this.f2570b--;
            }
        }
    }

    public final void e(d dVar) {
        if (this.f2570b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + dVar.toString() + " in a listener callback");
        }
        this.f2571c.remove(dVar);
        if (this.f2569a > 0) {
            this.f2572d.remove(dVar);
        }
    }

    public final void f(o oVar) {
        int i2;
        b();
        replace(0, length(), (CharSequence) oVar.f3543a);
        int i3 = oVar.f3544b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, oVar.f3545c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = oVar.f3546d;
        if (i4 < 0 || i4 >= (i2 = oVar.f3547e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f2580l.setComposingRegion(i4, i2);
        }
        this.f2573e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f2573e;
        String eVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f2589e = selectionStart;
        hVar.f2590f = selectionEnd;
        hVar.f2591g = composingSpanStart;
        hVar.f2592h = composingSpanEnd;
        hVar.f2585a = eVar;
        hVar.f2586b = "";
        hVar.f2587c = -1;
        hVar.f2588d = -1;
        arrayList.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f2574f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f2574f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f2570b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String eVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f2574f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f2573e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f2589e = selectionStart2;
        hVar.f2590f = selectionEnd2;
        hVar.f2591g = composingSpanStart2;
        hVar.f2592h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        hVar.f2585a = eVar;
        hVar.f2586b = charSequence2;
        hVar.f2587c = i2;
        hVar.f2588d = i3;
        arrayList.add(hVar);
        if (this.f2569a > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
