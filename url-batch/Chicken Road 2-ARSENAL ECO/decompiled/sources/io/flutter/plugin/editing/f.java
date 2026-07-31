package io.flutter.plugin.editing;

import N3.p;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: f, reason: collision with root package name */
    public int f4509f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f4510g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4511h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4512i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4513j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public String f4514k;

    /* renamed from: l, reason: collision with root package name */
    public String f4515l;

    /* renamed from: m, reason: collision with root package name */
    public int f4516m;

    /* renamed from: n, reason: collision with root package name */
    public int f4517n;

    /* renamed from: o, reason: collision with root package name */
    public int f4518o;

    /* renamed from: p, reason: collision with root package name */
    public int f4519p;

    /* renamed from: q, reason: collision with root package name */
    public final d f4520q;

    public f(p pVar, View view) {
        this.f4520q = new d(view, this);
        if (pVar != null) {
            f(pVar);
        }
    }

    public final void a(e eVar) {
        if (this.f4510g > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f4509f <= 0) {
            this.f4511h.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f4512i.add(eVar);
        }
    }

    public final void b() {
        this.f4509f++;
        if (this.f4510g > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f4509f != 1 || this.f4511h.isEmpty()) {
            return;
        }
        this.f4515l = toString();
        this.f4516m = Selection.getSelectionStart(this);
        this.f4517n = Selection.getSelectionEnd(this);
        this.f4518o = BaseInputConnection.getComposingSpanStart(this);
        this.f4519p = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i7 = this.f4509f;
        if (i7 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f4511h;
        ArrayList arrayList2 = this.f4512i;
        if (i7 == 1) {
            int size = arrayList2.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList2.get(i8);
                i8++;
                this.f4510g++;
                ((e) obj).a(true);
                this.f4510g--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f4515l), (this.f4516m == Selection.getSelectionStart(this) && this.f4517n == Selection.getSelectionEnd(this)) ? false : true, (this.f4518o == BaseInputConnection.getComposingSpanStart(this) && this.f4519p == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f4509f--;
    }

    public final void d(boolean z5, boolean z6, boolean z7) {
        if (z5 || z6 || z7) {
            ArrayList arrayList = this.f4511h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                this.f4510g++;
                ((e) obj).a(z5);
                this.f4510g--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f4510g > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f4511h.remove(eVar);
        if (this.f4509f > 0) {
            this.f4512i.remove(eVar);
        }
    }

    public final void f(p pVar) {
        b();
        replace(0, length(), (CharSequence) pVar.f1748a);
        int i7 = pVar.f1749b;
        if (i7 >= 0) {
            Selection.setSelection(this, i7, pVar.f1750c);
        } else {
            Selection.removeSelection(this);
        }
        int i8 = pVar.f1751d;
        int i9 = pVar.f1752e;
        if (i8 < 0 || i8 >= i9) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f4520q.setComposingRegion(i8, i9);
        }
        this.f4513j.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        super.setSpan(obj, i7, i8, i9);
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f4529e = selectionStart;
        hVar.f4530f = selectionEnd;
        hVar.f4531g = composingSpanStart;
        hVar.f4532h = composingSpanEnd;
        hVar.f4525a = fVar;
        hVar.f4526b = "";
        hVar.f4527c = -1;
        hVar.f4528d = -1;
        this.f4513j.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f4514k;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f4514k = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        if (this.f4510g > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i11 = i8 - i7;
        boolean z5 = i11 != i10 - i9;
        for (int i12 = 0; i12 < i11 && !z5; i12++) {
            z5 |= charAt(i7 + i12) != charSequence.charAt(i9 + i12);
        }
        if (z5) {
            this.f4514k = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i7, i8, charSequence, i9, i10);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f4529e = selectionStart2;
        hVar.f4530f = selectionEnd2;
        hVar.f4531g = composingSpanStart2;
        hVar.f4532h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        hVar.f4525a = fVar;
        hVar.f4526b = charSequence2;
        hVar.f4527c = i7;
        hVar.f4528d = i8;
        this.f4513j.add(hVar);
        if (this.f4509f > 0) {
            return replace;
        }
        d(z5, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
