package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import c0.r;
import java.util.ArrayList;
import java.util.Iterator;
import m0.C0207q;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f2408a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2409b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2410c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2411d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2412e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f2413f;

    /* renamed from: g, reason: collision with root package name */
    public String f2414g;

    /* renamed from: h, reason: collision with root package name */
    public int f2415h;

    /* renamed from: i, reason: collision with root package name */
    public int f2416i;

    /* renamed from: j, reason: collision with root package name */
    public int f2417j;

    /* renamed from: k, reason: collision with root package name */
    public int f2418k;

    /* renamed from: l, reason: collision with root package name */
    public final d f2419l;

    public f(C0207q c0207q, r rVar) {
        this.f2419l = new d(rVar, this);
        if (c0207q != null) {
            f(c0207q);
        }
    }

    public final void a(e eVar) {
        if (this.f2409b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f2408a <= 0) {
            this.f2410c.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f2411d.add(eVar);
        }
    }

    public final void b() {
        this.f2408a++;
        if (this.f2409b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f2408a != 1 || this.f2410c.isEmpty()) {
            return;
        }
        this.f2414g = toString();
        this.f2415h = Selection.getSelectionStart(this);
        this.f2416i = Selection.getSelectionEnd(this);
        this.f2417j = BaseInputConnection.getComposingSpanStart(this);
        this.f2418k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f2408a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f2410c;
        ArrayList arrayList2 = this.f2411d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f2409b++;
                eVar.a(true);
                this.f2409b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f2414g), (this.f2415h == Selection.getSelectionStart(this) && this.f2416i == Selection.getSelectionEnd(this)) ? false : true, (this.f2417j == BaseInputConnection.getComposingSpanStart(this) && this.f2418k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f2408a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f2410c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f2409b++;
                eVar.a(z2);
                this.f2409b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f2409b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f2410c.remove(eVar);
        if (this.f2408a > 0) {
            this.f2411d.remove(eVar);
        }
    }

    public final void f(C0207q c0207q) {
        int i2;
        b();
        replace(0, length(), (CharSequence) c0207q.f2774a);
        int i3 = c0207q.f2775b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, c0207q.f2776c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = c0207q.f2777d;
        if (i4 < 0 || i4 >= (i2 = c0207q.f2778e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f2419l.setComposingRegion(i4, i2);
        }
        this.f2412e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f2412e;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2428e = selectionStart;
        iVar.f2429f = selectionEnd;
        iVar.f2430g = composingSpanStart;
        iVar.f2431h = composingSpanEnd;
        iVar.f2424a = fVar;
        iVar.f2425b = "";
        iVar.f2426c = -1;
        iVar.f2427d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f2413f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f2413f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f2409b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f2413f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f2412e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2428e = selectionStart2;
        iVar.f2429f = selectionEnd2;
        iVar.f2430g = composingSpanStart2;
        iVar.f2431h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        iVar.f2424a = fVar;
        iVar.f2425b = charSequence2;
        iVar.f2426c = i2;
        iVar.f2427d = i3;
        arrayList.add(iVar);
        if (this.f2408a > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
