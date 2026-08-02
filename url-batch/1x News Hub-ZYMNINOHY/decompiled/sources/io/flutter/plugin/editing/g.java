package io.flutter.plugin.editing;

import O1.p;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f9191a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9192b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9193c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9194d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9195e = new ArrayList();
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f9196g;

    /* renamed from: h, reason: collision with root package name */
    public int f9197h;

    /* renamed from: i, reason: collision with root package name */
    public int f9198i;

    /* renamed from: j, reason: collision with root package name */
    public int f9199j;

    /* renamed from: k, reason: collision with root package name */
    public int f9200k;

    /* renamed from: l, reason: collision with root package name */
    public final e f9201l;

    public g(p pVar, View view) {
        this.f9201l = new e(view, this);
        if (pVar != null) {
            f(pVar);
        }
    }

    public final void a(f fVar) {
        if (this.f9192b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f9191a <= 0) {
            this.f9193c.add(fVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f9194d.add(fVar);
        }
    }

    public final void b() {
        this.f9191a++;
        if (this.f9192b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f9191a != 1 || this.f9193c.isEmpty()) {
            return;
        }
        this.f9196g = toString();
        this.f9197h = Selection.getSelectionStart(this);
        this.f9198i = Selection.getSelectionEnd(this);
        this.f9199j = BaseInputConnection.getComposingSpanStart(this);
        this.f9200k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i3 = this.f9191a;
        if (i3 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f9193c;
        ArrayList arrayList2 = this.f9194d;
        if (i3 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f9192b++;
                fVar.a(true);
                this.f9192b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f9196g), (this.f9197h == Selection.getSelectionStart(this) && this.f9198i == Selection.getSelectionEnd(this)) ? false : true, (this.f9199j == BaseInputConnection.getComposingSpanStart(this) && this.f9200k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f9191a--;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator it = this.f9193c.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f9192b++;
                fVar.a(z);
                this.f9192b--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f9192b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.f9193c.remove(fVar);
        if (this.f9191a > 0) {
            this.f9194d.remove(fVar);
        }
    }

    public final void f(p pVar) {
        int i3;
        b();
        replace(0, length(), (CharSequence) pVar.f1205a);
        int i4 = pVar.f1206b;
        if (i4 >= 0) {
            Selection.setSelection(this, i4, pVar.f1207c);
        } else {
            Selection.removeSelection(this);
        }
        int i5 = pVar.f1208d;
        if (i5 < 0 || i5 >= (i3 = pVar.f1209e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f9201l.setComposingRegion(i5, i3);
        }
        this.f9195e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        ArrayList arrayList = this.f9195e;
        String gVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f9210e = selectionStart;
        iVar.f = selectionEnd;
        iVar.f9211g = composingSpanStart;
        iVar.f9212h = composingSpanEnd;
        iVar.f9206a = gVar;
        iVar.f9207b = "";
        iVar.f9208c = -1;
        iVar.f9209d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        if (this.f9192b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String gVar = toString();
        int i7 = i4 - i3;
        boolean z = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z; i8++) {
            z |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        if (z) {
            this.f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i3, i4, charSequence, i5, i6);
        ArrayList arrayList = this.f9195e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f9210e = selectionStart2;
        iVar.f = selectionEnd2;
        iVar.f9211g = composingSpanStart2;
        iVar.f9212h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        iVar.f9206a = gVar;
        iVar.f9207b = charSequence2;
        iVar.f9208c = i3;
        iVar.f9209d = i4;
        arrayList.add(iVar);
        if (this.f9191a > 0) {
            return replace;
        }
        d(z, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
