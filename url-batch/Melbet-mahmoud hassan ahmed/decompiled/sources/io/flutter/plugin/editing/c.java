package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import l5.p;

/* loaded from: classes.dex */
class c extends SpannableStringBuilder {

    /* renamed from: f, reason: collision with root package name */
    private int f17281f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f17282g = 0;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<b> f17283h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<b> f17284i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<e> f17285j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private String f17286k;

    /* renamed from: l, reason: collision with root package name */
    private String f17287l;

    /* renamed from: m, reason: collision with root package name */
    private int f17288m;

    /* renamed from: n, reason: collision with root package name */
    private int f17289n;

    /* renamed from: o, reason: collision with root package name */
    private int f17290o;

    /* renamed from: p, reason: collision with root package name */
    private int f17291p;

    /* renamed from: q, reason: collision with root package name */
    private BaseInputConnection f17292q;

    class a extends BaseInputConnection {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Editable f17293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z6, Editable editable) {
            super(view, z6);
            this.f17293a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f17293a;
        }
    }

    interface b {
        void a(boolean z6, boolean z7, boolean z8);
    }

    public c(p.e eVar, View view) {
        this.f17292q = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z6, boolean z7, boolean z8) {
        this.f17282g++;
        bVar.a(z6, z7, z8);
        this.f17282g--;
    }

    private void k(boolean z6, boolean z7, boolean z8) {
        if (z6 || z7 || z8) {
            Iterator<b> it = this.f17283h.iterator();
            while (it.hasNext()) {
                j(it.next(), z6, z7, z8);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f17282g > 0) {
            z4.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f17281f > 0) {
            z4.b.f("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f17284i;
        } else {
            arrayList = this.f17283h;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f17281f++;
        if (this.f17282g > 0) {
            z4.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f17281f != 1 || this.f17283h.isEmpty()) {
            return;
        }
        this.f17287l = toString();
        this.f17288m = i();
        this.f17289n = h();
        this.f17290o = g();
        this.f17291p = f();
    }

    public void c() {
        this.f17285j.clear();
    }

    public void d() {
        int i7 = this.f17281f;
        if (i7 == 0) {
            z4.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i7 == 1) {
            Iterator<b> it = this.f17284i.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f17283h.isEmpty()) {
                z4.b.e("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f17283h.size()) + " listener(s)");
                k(!toString().equals(this.f17287l), (this.f17288m == i() && this.f17289n == h()) ? false : true, (this.f17290o == g() && this.f17291p == f()) ? false : true);
            }
        }
        this.f17283h.addAll(this.f17284i);
        this.f17284i.clear();
        this.f17281f--;
    }

    public ArrayList<e> e() {
        ArrayList<e> arrayList = new ArrayList<>(this.f17285j);
        this.f17285j.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f17282g > 0) {
            z4.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f17283h.remove(bVar);
        if (this.f17281f > 0) {
            this.f17284i.remove(bVar);
        }
    }

    public void m(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f17292q.setComposingRegion(i7, i8);
        }
    }

    public void n(p.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f18790a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f18791b, eVar.f18792c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f18793d, eVar.f18794e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        boolean z6;
        boolean z7;
        if (this.f17282g > 0) {
            z4.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i11 = i8 - i7;
        boolean z8 = i11 != i10 - i9;
        for (int i12 = 0; i12 < i11 && !z8; i12++) {
            z8 |= charAt(i7 + i12) != charSequence.charAt(i9 + i12);
        }
        if (z8) {
            this.f17286k = null;
        }
        int i13 = i();
        int h7 = h();
        int g7 = g();
        int f7 = f();
        SpannableStringBuilder replace = super.replace(i7, i8, charSequence, i9, i10);
        boolean z9 = z8;
        this.f17285j.add(new e(cVar, i7, i8, charSequence, i(), h(), g(), f()));
        if (this.f17281f > 0) {
            return replace;
        }
        boolean z10 = (i() == i13 && h() == h7) ? false : true;
        if (g() == g7 && f() == f7) {
            z6 = z9;
            z7 = false;
        } else {
            z6 = z9;
            z7 = true;
        }
        k(z6, z10, z7);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        super.setSpan(obj, i7, i8, i9);
        this.f17285j.add(new e(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f17286k;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f17286k = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
