package io.flutter.plugin.editing;

import E.v;
import M.p;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f648a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f649b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f650c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f651d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f652e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f653f;

    /* renamed from: g, reason: collision with root package name */
    public String f654g;

    /* renamed from: h, reason: collision with root package name */
    public int f655h;

    /* renamed from: i, reason: collision with root package name */
    public int f656i;

    /* renamed from: j, reason: collision with root package name */
    public int f657j;

    /* renamed from: k, reason: collision with root package name */
    public int f658k;

    /* renamed from: l, reason: collision with root package name */
    public final e f659l;

    public g(p pVar, v vVar) {
        this.f659l = new e(vVar, this);
        if (pVar != null) {
            f(pVar);
        }
    }

    public final void a(f fVar) {
        if (this.f649b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f648a <= 0) {
            this.f650c.add(fVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f651d.add(fVar);
        }
    }

    public final void b() {
        this.f648a++;
        if (this.f649b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f648a != 1 || this.f650c.isEmpty()) {
            return;
        }
        this.f654g = toString();
        this.f655h = Selection.getSelectionStart(this);
        this.f656i = Selection.getSelectionEnd(this);
        this.f657j = BaseInputConnection.getComposingSpanStart(this);
        this.f658k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f648a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f650c;
        ArrayList arrayList2 = this.f651d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f649b++;
                fVar.a(true);
                this.f649b--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f654g), (this.f655h == Selection.getSelectionStart(this) && this.f656i == Selection.getSelectionEnd(this)) ? false : true, (this.f657j == BaseInputConnection.getComposingSpanStart(this) && this.f658k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f648a--;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator it = this.f650c.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f649b++;
                fVar.a(z);
                this.f649b--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f649b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.f650c.remove(fVar);
        if (this.f648a > 0) {
            this.f651d.remove(fVar);
        }
    }

    public final void f(p pVar) {
        int i2;
        b();
        replace(0, length(), (CharSequence) pVar.f396a);
        int i3 = pVar.f397b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, pVar.f398c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = pVar.f399d;
        if (i4 < 0 || i4 >= (i2 = pVar.f400e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f659l.setComposingRegion(i4, i2);
        }
        this.f652e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f652e;
        String gVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f668e = selectionStart;
        iVar.f669f = selectionEnd;
        iVar.f670g = composingSpanStart;
        iVar.f671h = composingSpanEnd;
        iVar.f664a = gVar;
        iVar.f665b = "";
        iVar.f666c = -1;
        iVar.f667d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f653f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f653f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f649b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String gVar = toString();
        int i6 = i3 - i2;
        boolean z = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z; i7++) {
            z |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z) {
            this.f653f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f652e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f668e = selectionStart2;
        iVar.f669f = selectionEnd2;
        iVar.f670g = composingSpanStart2;
        iVar.f671h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        iVar.f664a = gVar;
        iVar.f665b = charSequence2;
        iVar.f666c = i2;
        iVar.f667d = i3;
        arrayList.add(iVar);
        if (this.f648a > 0) {
            return replace;
        }
        d(z, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
