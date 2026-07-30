package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import m0.q;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    public int f444b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f445c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f446d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f447e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f448f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public String f449g;

    /* renamed from: h, reason: collision with root package name */
    public String f450h;

    /* renamed from: i, reason: collision with root package name */
    public int f451i;

    /* renamed from: j, reason: collision with root package name */
    public int f452j;

    /* renamed from: k, reason: collision with root package name */
    public int f453k;

    /* renamed from: l, reason: collision with root package name */
    public int f454l;
    public final e m;

    public g(q qVar, View view) {
        this.m = new e(view, this);
        if (qVar != null) {
            f(qVar);
        }
    }

    public final void a(f fVar) {
        if (this.f445c > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f444b <= 0) {
            this.f446d.add(fVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f447e.add(fVar);
        }
    }

    public final void b() {
        this.f444b++;
        if (this.f445c > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f444b != 1 || this.f446d.isEmpty()) {
            return;
        }
        this.f450h = toString();
        this.f451i = Selection.getSelectionStart(this);
        this.f452j = Selection.getSelectionEnd(this);
        this.f453k = BaseInputConnection.getComposingSpanStart(this);
        this.f454l = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f444b;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f446d;
        ArrayList arrayList2 = this.f447e;
        if (i2 == 1) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                this.f445c++;
                ((f) obj).a(true);
                this.f445c--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f450h), (this.f451i == Selection.getSelectionStart(this) && this.f452j == Selection.getSelectionEnd(this)) ? false : true, (this.f453k == BaseInputConnection.getComposingSpanStart(this) && this.f454l == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f444b--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            ArrayList arrayList = this.f446d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.f445c++;
                ((f) obj).a(z2);
                this.f445c--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f445c > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.f446d.remove(fVar);
        if (this.f444b > 0) {
            this.f447e.remove(fVar);
        }
    }

    public final void f(q qVar) {
        b();
        replace(0, length(), (CharSequence) qVar.f835a);
        int i2 = qVar.f836b;
        if (i2 >= 0) {
            Selection.setSelection(this, i2, qVar.f837c);
        } else {
            Selection.removeSelection(this);
        }
        int i3 = qVar.f838d;
        int i4 = qVar.f839e;
        if (i3 < 0 || i3 >= i4) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.m.setComposingRegion(i3, i4);
        }
        this.f448f.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f445c > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String gVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f449g = null;
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
        j jVar = new j();
        jVar.f463e = selectionStart2;
        jVar.f464f = selectionEnd2;
        jVar.f465g = composingSpanStart2;
        jVar.f466h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        jVar.f459a = gVar;
        jVar.f460b = charSequence2;
        jVar.f461c = i2;
        jVar.f462d = i3;
        this.f448f.add(jVar);
        if (this.f444b > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        String gVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        j jVar = new j();
        jVar.f463e = selectionStart;
        jVar.f464f = selectionEnd;
        jVar.f465g = composingSpanStart;
        jVar.f466h = composingSpanEnd;
        jVar.f459a = gVar;
        jVar.f460b = "";
        jVar.f461c = -1;
        jVar.f462d = -1;
        this.f448f.add(jVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f449g;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f449g = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
