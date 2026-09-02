package io.flutter.plugin.editing;

import D.y;
import M.q;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f593a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f594b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f595c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f596d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f597e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f598f;

    /* renamed from: g, reason: collision with root package name */
    public String f599g;

    /* renamed from: h, reason: collision with root package name */
    public int f600h;

    /* renamed from: i, reason: collision with root package name */
    public int f601i;

    /* renamed from: j, reason: collision with root package name */
    public int f602j;

    /* renamed from: k, reason: collision with root package name */
    public int f603k;

    /* renamed from: l, reason: collision with root package name */
    public final d f604l;

    public f(q qVar, y yVar) {
        this.f604l = new d(yVar, this);
        if (qVar != null) {
            f(qVar);
        }
    }

    public final void a(e eVar) {
        if (this.f594b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f593a <= 0) {
            this.f595c.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f596d.add(eVar);
        }
    }

    public final void b() {
        this.f593a++;
        if (this.f594b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f593a != 1 || this.f595c.isEmpty()) {
            return;
        }
        this.f599g = toString();
        this.f600h = Selection.getSelectionStart(this);
        this.f601i = Selection.getSelectionEnd(this);
        this.f602j = BaseInputConnection.getComposingSpanStart(this);
        this.f603k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f593a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f595c;
        ArrayList arrayList2 = this.f596d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f594b++;
                eVar.a(true);
                this.f594b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f599g), (this.f600h == Selection.getSelectionStart(this) && this.f601i == Selection.getSelectionEnd(this)) ? false : true, (this.f602j == BaseInputConnection.getComposingSpanStart(this) && this.f603k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f593a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f595c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f594b++;
                eVar.a(z2);
                this.f594b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f594b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f595c.remove(eVar);
        if (this.f593a > 0) {
            this.f596d.remove(eVar);
        }
    }

    public final void f(q qVar) {
        int i2;
        b();
        replace(0, length(), (CharSequence) qVar.f338a);
        int i3 = qVar.f339b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, qVar.f340c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = qVar.f341d;
        if (i4 < 0 || i4 >= (i2 = qVar.f342e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f604l.setComposingRegion(i4, i2);
        }
        this.f597e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f597e;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f613e = selectionStart;
        hVar.f614f = selectionEnd;
        hVar.f615g = composingSpanStart;
        hVar.f616h = composingSpanEnd;
        hVar.f609a = fVar;
        hVar.f610b = "";
        hVar.f611c = -1;
        hVar.f612d = -1;
        arrayList.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f598f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f598f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f594b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f598f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f597e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f613e = selectionStart2;
        hVar.f614f = selectionEnd2;
        hVar.f615g = composingSpanStart2;
        hVar.f616h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        hVar.f609a = fVar;
        hVar.f610b = charSequence2;
        hVar.f611c = i2;
        hVar.f612d = i3;
        arrayList.add(hVar);
        if (this.f593a > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
