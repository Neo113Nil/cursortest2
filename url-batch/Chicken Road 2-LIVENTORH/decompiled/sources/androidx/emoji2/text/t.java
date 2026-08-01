package androidx.emoji2.text;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import f1.b1;
import g.j0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.t0;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t implements p0.g {

    /* renamed from: e, reason: collision with root package name */
    public static t f353e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354a;

    /* renamed from: b, reason: collision with root package name */
    public Object f355b;

    /* renamed from: c, reason: collision with root package name */
    public Object f356c;
    public Object d;

    public /* synthetic */ t() {
        this.f354a = 7;
    }

    public static boolean h(Editable editable, KeyEvent keyEvent, boolean z3) {
        a0[] a0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (a0VarArr = (a0[]) editable.getSpans(selectionStart, selectionEnd, a0.class)) != null && a0VarArr.length > 0) {
                for (a0 a0Var : a0VarArr) {
                    int spanStart = editable.getSpanStart(a0Var);
                    int spanEnd = editable.getSpanEnd(a0Var);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static t w(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void A(View view) {
        if (((ArrayList) this.d).remove(view)) {
            f1.c0 c0Var = (f1.c0) this.f355b;
            b1 I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = c0Var.f1328a;
                int i = I.f1322p;
                if (recyclerView.L()) {
                    I.f1323q = i;
                    recyclerView.f698x0.add(I);
                } else {
                    View view2 = I.f1309a;
                    WeakHashMap weakHashMap = l0.f2757a;
                    view2.setImportantForAccessibility(i);
                }
                I.f1322p = 0;
            }
        }
    }

    public void B(v.e eVar) {
        ArrayList arrayList = (ArrayList) this.f355b;
        arrayList.clear();
        int size = eVar.f3429q0.size();
        for (int i = 0; i < size; i++) {
            v.d dVar = (v.d) eVar.f3429q0.get(i);
            int[] iArr = dVar.f3418p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3431s0.f3521b = true;
    }

    @Override // p0.g
    public Uri b() {
        return (Uri) this.d;
    }

    @Override // p0.g
    public ClipDescription c() {
        return (ClipDescription) this.f356c;
    }

    @Override // p0.g
    public Object d() {
        return null;
    }

    @Override // p0.g
    public Uri e() {
        return (Uri) this.f355b;
    }

    public void f(View view, int i, boolean z3) {
        RecyclerView recyclerView = ((f1.c0) this.f355b).f1328a;
        int childCount = i < 0 ? recyclerView.getChildCount() : q(i);
        ((f1.c) this.f356c).e(childCount, z3);
        if (z3) {
            u(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z3) {
        RecyclerView recyclerView = ((f1.c0) this.f355b).f1328a;
        int childCount = i < 0 ? recyclerView.getChildCount() : q(i);
        ((f1.c) this.f356c).e(childCount, z3);
        if (z3) {
            u(view);
        }
        b1 I = RecyclerView.I(view);
        if (I != null) {
            if (!I.j() && !I.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
            I.f1316j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void i(int i) {
        b1 I;
        int q3 = q(i);
        ((f1.c) this.f356c).f(q3);
        RecyclerView recyclerView = ((f1.c0) this.f355b).f1328a;
        View childAt = recyclerView.getChildAt(q3);
        if (childAt != null && (I = RecyclerView.I(childAt)) != null) {
            if (I.j() && !I.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
            I.a(256);
        }
        recyclerView.detachViewFromParent(q3);
    }

    public androidx.lifecycle.l0 j(String str, Class cls) {
        androidx.lifecycle.l0 b4;
        n0 n0Var = (n0) this.f356c;
        f3.d.e(str, "key");
        o0 o0Var = (o0) this.f355b;
        o0Var.getClass();
        LinkedHashMap linkedHashMap = o0Var.f625a;
        androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) linkedHashMap.get(str);
        if (cls.isInstance(l0Var)) {
            if (n0Var instanceof k0) {
            }
            f3.d.c(l0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return l0Var;
        }
        a1.c cVar = new a1.c((a1.b) this.d);
        ((LinkedHashMap) cVar.f106a).put(m0.f623b, str);
        try {
            b4 = n0Var.s(cls, cVar);
        } catch (AbstractMethodError unused) {
            b4 = n0Var.b(cls);
        }
        f3.d.e(b4, "viewModel");
        androidx.lifecycle.l0 l0Var2 = (androidx.lifecycle.l0) linkedHashMap.put(str, b4);
        if (l0Var2 != null) {
            l0Var2.b();
        }
        return b4;
    }

    public View k(int i) {
        return ((f1.c0) this.f355b).f1328a.getChildAt(q(i));
    }

    public int l() {
        return ((f1.c0) this.f355b).f1328a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList m(int i) {
        int resourceId;
        ColorStateList B;
        TypedArray typedArray = (TypedArray) this.f356c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (B = a.y.B((Context) this.f355b, resourceId)) == null) ? typedArray.getColorStateList(i) : B;
    }

    public Drawable n(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f356c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : h.a.x((Context) this.f355b, resourceId);
    }

    public Drawable o(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f356c).hasValue(i) || (resourceId = ((TypedArray) this.f356c).getResourceId(i, 0)) == 0) {
            return null;
        }
        l.u a2 = l.u.a();
        Context context = (Context) this.f355b;
        synchronized (a2) {
            d = a2.f2467a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface p(int i, int i4, t0 t0Var) {
        int resourceId = ((TypedArray) this.f356c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        Context context = (Context) this.f355b;
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = e0.m.f1158a;
        if (context.isRestricted()) {
            return null;
        }
        return e0.m.a(context, resourceId, typedValue, i4, t0Var, true, false);
    }

    public int q(int i) {
        f1.c cVar = (f1.c) this.f356c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((f1.c0) this.f355b).f1328a.getChildCount();
        int i4 = i;
        while (i4 < childCount) {
            int b4 = i - (i4 - cVar.b(i4));
            if (b4 == 0) {
                while (cVar.d(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += b4;
        }
        return -1;
    }

    public View r(int i) {
        return ((f1.c0) this.f355b).f1328a.getChildAt(i);
    }

    public int s() {
        return ((f1.c0) this.f355b).f1328a.getChildCount();
    }

    public boolean t(CharSequence charSequence, int i, int i4, z zVar) {
        if ((zVar.f372c & 3) == 0) {
            h hVar = (h) this.d;
            v0.a b4 = zVar.b();
            int a2 = b4.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b4.d).getShort(a2 + b4.f2710a);
            }
            d dVar = (d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = d.f319b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i4) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f320a;
            String sb2 = sb.toString();
            int i5 = f0.d.f1269a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i6 = zVar.f372c & 4;
            zVar.f372c = hasGlyph ? i6 | 2 : i6 | 1;
        }
        return (zVar.f372c & 3) == 2;
    }

    public String toString() {
        switch (this.f354a) {
            case 2:
                return ((f1.c) this.f356c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(View view) {
        ((ArrayList) this.d).add(view);
        f1.c0 c0Var = (f1.c0) this.f355b;
        b1 I = RecyclerView.I(view);
        if (I != null) {
            View view2 = I.f1309a;
            RecyclerView recyclerView = c0Var.f1328a;
            int i = I.f1323q;
            if (i != -1) {
                I.f1322p = i;
            } else {
                WeakHashMap weakHashMap = l0.f2757a;
                I.f1322p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                I.f1323q = 4;
                recyclerView.f698x0.add(I);
            } else {
                WeakHashMap weakHashMap2 = l0.f2757a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean v(int i, v.d dVar, y.f fVar) {
        w.b bVar = (w.b) this.f356c;
        int[] iArr = dVar.f3418p0;
        int[] iArr2 = dVar.f3422t;
        bVar.f3510a = iArr[0];
        bVar.f3511b = iArr[1];
        bVar.f3512c = dVar.q();
        bVar.d = dVar.k();
        bVar.i = false;
        bVar.f3517j = i;
        boolean z3 = bVar.f3510a == 3;
        boolean z4 = bVar.f3511b == 3;
        boolean z5 = z3 && dVar.W > 0.0f;
        boolean z6 = z4 && dVar.W > 0.0f;
        if (z5 && iArr2[0] == 4) {
            bVar.f3510a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            bVar.f3511b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f3513e);
        dVar.L(bVar.f3514f);
        dVar.E = bVar.f3516h;
        dVar.I(bVar.f3515g);
        bVar.f3517j = 0;
        return bVar.i;
    }

    public Object x(CharSequence charSequence, int i, int i4, int i5, boolean z3, r rVar) {
        int i6;
        char c4;
        s sVar = new s((w) ((a0.j) this.f356c).f102h);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i7 = 0;
        boolean z4 = true;
        int i8 = i;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z4) {
                SparseArray sparseArray = sVar.f350c.f364a;
                w wVar = sparseArray == null ? null : (w) sparseArray.get(codePointAt);
                if (sVar.f348a == 2) {
                    if (wVar != null) {
                        sVar.f350c = wVar;
                        sVar.f352f++;
                    } else {
                        if (codePointAt == 65038) {
                            sVar.a();
                        } else if (codePointAt != 65039) {
                            w wVar2 = sVar.f350c;
                            if (wVar2.f365b != null) {
                                if (sVar.f352f != 1) {
                                    sVar.d = wVar2;
                                    sVar.a();
                                } else if (sVar.b()) {
                                    sVar.d = sVar.f350c;
                                    sVar.a();
                                } else {
                                    sVar.a();
                                }
                                c4 = 3;
                            } else {
                                sVar.a();
                            }
                        }
                        c4 = 1;
                    }
                    c4 = 2;
                } else if (wVar == null) {
                    sVar.a();
                    c4 = 1;
                } else {
                    sVar.f348a = 2;
                    sVar.f350c = wVar;
                    sVar.f352f = 1;
                    c4 = 2;
                }
                sVar.f351e = codePointAt;
                if (c4 == 1) {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (c4 == 2) {
                    int charCount = Character.charCount(codePointAt) + i8;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i8 = charCount;
                } else if (c4 == 3) {
                    if (z3 || !t(charSequence, i6, i8, sVar.d.f365b)) {
                        z4 = rVar.o(charSequence, i6, i8, sVar.d.f365b);
                        i7++;
                    }
                }
            }
        }
        if (sVar.f348a == 2 && sVar.f350c.f365b != null && ((sVar.f352f > 1 || sVar.b()) && i7 < i5 && z4 && (z3 || !t(charSequence, i6, i8, sVar.f350c.f365b)))) {
            rVar.o(charSequence, i6, i8, sVar.f350c.f365b);
        }
        return rVar.e();
    }

    public void y() {
        ((TypedArray) this.f356c).recycle();
    }

    public void z(v.e eVar, int i, int i4, int i5) {
        eVar.getClass();
        int i6 = eVar.f3394b0;
        int i7 = eVar.f3396c0;
        eVar.f3394b0 = 0;
        eVar.f3396c0 = 0;
        eVar.O(i4);
        eVar.L(i5);
        if (i6 < 0) {
            eVar.f3394b0 = 0;
        } else {
            eVar.f3394b0 = i6;
        }
        if (i7 < 0) {
            eVar.f3396c0 = 0;
        } else {
            eVar.f3396c0 = i7;
        }
        v.e eVar2 = (v.e) this.d;
        eVar2.f3432t0 = i;
        eVar2.U();
    }

    public t(o0 o0Var, n0 n0Var, a1.b bVar) {
        this.f354a = 1;
        f3.d.e(o0Var, "store");
        f3.d.e(bVar, "defaultCreationExtras");
        this.f355b = o0Var;
        this.f356c = n0Var;
        this.d = bVar;
    }

    public t(f1.c0 c0Var) {
        this.f354a = 2;
        this.f355b = c0Var;
        this.f356c = new f1.c();
        this.d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(o0 o0Var, n0 n0Var) {
        this(o0Var, n0Var, a1.a.f105b);
        this.f354a = 1;
        f3.d.e(o0Var, "store");
    }

    public t(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f354a = 6;
        this.f355b = uri;
        this.f356c = clipDescription;
        this.d = uri2;
    }

    public t(Context context, TypedArray typedArray) {
        this.f354a = 4;
        this.f355b = context;
        this.f356c = typedArray;
    }

    public t(Runnable runnable) {
        this.f354a = 5;
        this.f356c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f355b = runnable;
    }

    public t(Context context, LocationManager locationManager) {
        this.f354a = 3;
        this.d = new j0();
        this.f355b = context;
        this.f356c = locationManager;
    }

    public t(v.e eVar) {
        this.f354a = 8;
        this.f355b = new ArrayList();
        this.f356c = new w.b();
        this.d = eVar;
    }

    public t(a0.j jVar, l2.f fVar, d dVar, Set set) {
        this.f354a = 0;
        this.f355b = fVar;
        this.f356c = jVar;
        this.d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            x(str, 0, str.length(), 1, true, new a0.a(3, str));
        }
    }

    @Override // p0.g
    public void a() {
    }
}
