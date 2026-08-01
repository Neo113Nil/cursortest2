package androidx.emoji2.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
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
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import b1.c1;
import b1.d0;
import com.gglhk.bofio.fortunetiger.R;
import f.i0;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.q0;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f355e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f356a;

    /* renamed from: b, reason: collision with root package name */
    public Object f357b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f358d;

    public /* synthetic */ s() {
        this.f356a = 8;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z3) {
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

    public static s r(int i4, int i5, Context context, AttributeSet attributeSet, int[] iArr) {
        return new s(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public void a(View view, int i4, boolean z3) {
        RecyclerView recyclerView = ((d0) this.f357b).f764a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : l(i4);
        ((b1.c) this.c).e(childCount, z3);
        if (z3) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z3) {
        RecyclerView recyclerView = ((d0) this.f357b).f764a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : l(i4);
        ((b1.c) this.c).e(childCount, z3);
        if (z3) {
            p(view);
        }
        c1 I = RecyclerView.I(view);
        if (I != null) {
            if (!I.j() && !I.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
            I.f753j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i4) {
        c1 I;
        int l4 = l(i4);
        ((b1.c) this.c).g(l4);
        RecyclerView recyclerView = ((d0) this.f357b).f764a;
        View childAt = recyclerView.getChildAt(l4);
        if (childAt != null && (I = RecyclerView.I(childAt)) != null) {
            if (I.j() && !I.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
            I.a(256);
        }
        recyclerView.detachViewFromParent(l4);
    }

    public l0 e(String str, Class cls) {
        l0 b2;
        n0 n0Var = (n0) this.c;
        u2.c.e(str, "key");
        o0 o0Var = (o0) this.f357b;
        o0Var.getClass();
        LinkedHashMap linkedHashMap = o0Var.f597a;
        l0 l0Var = (l0) linkedHashMap.get(str);
        if (cls.isInstance(l0Var)) {
            if (n0Var instanceof k0) {
            }
            u2.c.c(l0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return l0Var;
        }
        x0.b bVar = new x0.b((k0.o0) this.f358d);
        ((LinkedHashMap) bVar.f2763a).put(m0.f595b, str);
        try {
            b2 = n0Var.f(cls, bVar);
        } catch (AbstractMethodError unused) {
            b2 = n0Var.b(cls);
        }
        u2.c.e(b2, "viewModel");
        l0 l0Var2 = (l0) linkedHashMap.put(str, b2);
        if (l0Var2 != null) {
            l0Var2.b();
        }
        return b2;
    }

    public View f(int i4) {
        return ((d0) this.f357b).f764a.getChildAt(l(i4));
    }

    public int g() {
        return ((d0) this.f357b).f764a.getChildCount() - ((ArrayList) this.f358d).size();
    }

    public ColorStateList h(int i4) {
        int resourceId;
        ColorStateList D;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (D = k3.d.D((Context) this.f357b, resourceId)) == null) ? typedArray.getColorStateList(i4) : D;
    }

    public Drawable i(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) ? typedArray.getDrawable(i4) : k3.m.w((Context) this.f357b, resourceId);
    }

    public Drawable j(int i4) {
        int resourceId;
        Drawable d4;
        if (!((TypedArray) this.c).hasValue(i4) || (resourceId = ((TypedArray) this.c).getResourceId(i4, 0)) == 0) {
            return null;
        }
        k.s a4 = k.s.a();
        Context context = (Context) this.f357b;
        synchronized (a4) {
            d4 = a4.f2641a.d(context, resourceId, true);
        }
        return d4;
    }

    public Typeface k(int i4, int i5, q0 q0Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f358d) == null) {
            this.f358d = new TypedValue();
        }
        Context context = (Context) this.f357b;
        TypedValue typedValue = (TypedValue) this.f358d;
        ThreadLocal threadLocal = b0.m.f716a;
        if (context.isRestricted()) {
            return null;
        }
        return b0.m.a(context, resourceId, typedValue, i5, q0Var, true, false);
    }

    public int l(int i4) {
        b1.c cVar = (b1.c) this.c;
        if (i4 < 0) {
            return -1;
        }
        int childCount = ((d0) this.f357b).f764a.getChildCount();
        int i5 = i4;
        while (i5 < childCount) {
            int b2 = i4 - (i5 - cVar.b(i5));
            if (b2 == 0) {
                while (cVar.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += b2;
        }
        return -1;
    }

    public View m(int i4) {
        return ((d0) this.f357b).f764a.getChildAt(i4);
    }

    public int n() {
        return ((d0) this.f357b).f764a.getChildCount();
    }

    public boolean o(CharSequence charSequence, int i4, int i5, z zVar) {
        if ((zVar.c & 3) == 0) {
            h hVar = (h) this.f358d;
            s0.a b2 = zVar.b();
            int a4 = b2.a(8);
            if (a4 != 0) {
                ((ByteBuffer) b2.f2795d).getShort(a4 + b2.f2793a);
            }
            d dVar = (d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = d.f331b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i4 < i5) {
                sb.append(charSequence.charAt(i4));
                i4++;
            }
            TextPaint textPaint = dVar.f332a;
            String sb2 = sb.toString();
            int i6 = c0.d.f981a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i7 = zVar.c & 4;
            zVar.c = hasGlyph ? i7 | 2 : i7 | 1;
        }
        return (zVar.c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.f358d).add(view);
        d0 d0Var = (d0) this.f357b;
        c1 I = RecyclerView.I(view);
        if (I != null) {
            View view2 = I.f747a;
            RecyclerView recyclerView = d0Var.f764a;
            int i4 = I.f760q;
            if (i4 != -1) {
                I.f759p = i4;
            } else {
                WeakHashMap weakHashMap = j0.f2752a;
                I.f759p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                I.f760q = 4;
                recyclerView.f666x0.add(I);
            } else {
                WeakHashMap weakHashMap2 = j0.f2752a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i4, s.d dVar, v.f fVar) {
        t.b bVar = (t.b) this.c;
        int[] iArr = dVar.f3259p0;
        int[] iArr2 = dVar.f3263t;
        bVar.f3319a = iArr[0];
        bVar.f3320b = iArr[1];
        bVar.c = dVar.q();
        bVar.f3321d = dVar.k();
        bVar.f3324i = false;
        bVar.f3325j = i4;
        boolean z3 = bVar.f3319a == 3;
        boolean z4 = bVar.f3320b == 3;
        boolean z5 = z3 && dVar.W > 0.0f;
        boolean z6 = z4 && dVar.W > 0.0f;
        if (z5 && iArr2[0] == 4) {
            bVar.f3319a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            bVar.f3320b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f3322e);
        dVar.L(bVar.f3323f);
        dVar.E = bVar.h;
        dVar.I(bVar.g);
        bVar.f3325j = 0;
        return bVar.f3324i;
    }

    public Object s(CharSequence charSequence, int i4, int i5, int i6, boolean z3, q qVar) {
        int i7;
        char c;
        r rVar = new r((v) ((w) this.c).h);
        int codePointAt = Character.codePointAt(charSequence, i4);
        int i8 = 0;
        boolean z4 = true;
        int i9 = i4;
        loop0: while (true) {
            i7 = i9;
            while (i9 < i5 && i8 < i6 && z4) {
                SparseArray sparseArray = rVar.c.f366a;
                v vVar = sparseArray == null ? null : (v) sparseArray.get(codePointAt);
                if (rVar.f350a == 2) {
                    if (vVar != null) {
                        rVar.c = vVar;
                        rVar.f354f++;
                    } else {
                        if (codePointAt == 65038) {
                            rVar.a();
                        } else if (codePointAt != 65039) {
                            v vVar2 = rVar.c;
                            if (vVar2.f367b != null) {
                                if (rVar.f354f != 1) {
                                    rVar.f352d = vVar2;
                                    rVar.a();
                                } else if (rVar.b()) {
                                    rVar.f352d = rVar.c;
                                    rVar.a();
                                } else {
                                    rVar.a();
                                }
                                c = 3;
                            } else {
                                rVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (vVar == null) {
                    rVar.a();
                    c = 1;
                } else {
                    rVar.f350a = 2;
                    rVar.c = vVar;
                    rVar.f354f = 1;
                    c = 2;
                }
                rVar.f353e = codePointAt;
                if (c == 1) {
                    i9 = Character.charCount(Character.codePointAt(charSequence, i7)) + i7;
                    if (i9 < i5) {
                        codePointAt = Character.codePointAt(charSequence, i9);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i9;
                    if (charCount < i5) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i9 = charCount;
                } else if (c == 3) {
                    if (z3 || !o(charSequence, i7, i9, rVar.f352d.f367b)) {
                        z4 = qVar.h(charSequence, i7, i9, rVar.f352d.f367b);
                        i8++;
                    }
                }
            }
        }
        if (rVar.f350a == 2 && rVar.c.f367b != null && ((rVar.f354f > 1 || rVar.b()) && i8 < i6 && z4 && (z3 || !o(charSequence, i7, i9, rVar.c.f367b)))) {
            qVar.h(charSequence, i7, i9, rVar.c.f367b);
        }
        return qVar.b();
    }

    public void t() {
        ((TypedArray) this.c).recycle();
    }

    public String toString() {
        switch (this.f356a) {
            case 2:
                return ((b1.c) this.c).toString() + ", hidden list:" + ((ArrayList) this.f358d).size();
            default:
                return super.toString();
        }
    }

    public void u(s.e eVar, int i4, int i5, int i6) {
        eVar.getClass();
        int i7 = eVar.f3235b0;
        int i8 = eVar.f3236c0;
        eVar.f3235b0 = 0;
        eVar.f3236c0 = 0;
        eVar.O(i5);
        eVar.L(i6);
        if (i7 < 0) {
            eVar.f3235b0 = 0;
        } else {
            eVar.f3235b0 = i7;
        }
        if (i8 < 0) {
            eVar.f3236c0 = 0;
        } else {
            eVar.f3236c0 = i8;
        }
        s.e eVar2 = (s.e) this.f358d;
        eVar2.f3273t0 = i4;
        eVar2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.f358d).remove(view)) {
            d0 d0Var = (d0) this.f357b;
            c1 I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = d0Var.f764a;
                int i4 = I.f759p;
                if (recyclerView.L()) {
                    I.f760q = i4;
                    recyclerView.f666x0.add(I);
                } else {
                    View view2 = I.f747a;
                    WeakHashMap weakHashMap = j0.f2752a;
                    view2.setImportantForAccessibility(i4);
                }
                I.f759p = 0;
            }
        }
    }

    public void w(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f357b;
        arrayList.clear();
        int size = eVar.f3270q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            s.d dVar = (s.d) eVar.f3270q0.get(i4);
            int[] iArr = dVar.f3259p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3272s0.f3329b = true;
    }

    public s(Method method, Method method2, Method method3) {
        this.f356a = 7;
        this.f357b = method;
        this.c = method2;
        this.f358d = method3;
    }

    public s(o0 o0Var, n0 n0Var, k0.o0 o0Var2) {
        this.f356a = 1;
        u2.c.e(o0Var, "store");
        u2.c.e(o0Var2, "defaultCreationExtras");
        this.f357b = o0Var;
        this.c = n0Var;
        this.f358d = o0Var2;
    }

    public s(d0 d0Var) {
        this.f356a = 2;
        this.f357b = d0Var;
        this.c = new b1.c();
        this.f358d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(o0 o0Var, n0 n0Var) {
        this(o0Var, n0Var, x0.a.f3605b);
        this.f356a = 1;
        u2.c.e(o0Var, "store");
    }

    public s(Context context, TypedArray typedArray) {
        this.f356a = 5;
        this.f357b = context;
        this.c = typedArray;
    }

    public s(Runnable runnable) {
        this.f356a = 6;
        this.c = new CopyOnWriteArrayList();
        this.f358d = new HashMap();
        this.f357b = runnable;
    }

    public s(Context context, LocationManager locationManager) {
        this.f356a = 4;
        this.f358d = new i0();
        this.f357b = context;
        this.c = locationManager;
    }

    public s(Context context) {
        this.f356a = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k3.d.Z(context, R.attr.materialCalendarStyle, com.google.android.material.datepicker.l.class.getCanonicalName()).data, l1.a.f2869o);
        this.f357b = a2.e.v(context, obtainStyledAttributes.getResourceId(4, 0));
        a2.e.v(context, obtainStyledAttributes.getResourceId(2, 0));
        a2.e.v(context, obtainStyledAttributes.getResourceId(3, 0));
        a2.e.v(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList u3 = k3.m.u(context, obtainStyledAttributes, 7);
        this.c = a2.e.v(context, obtainStyledAttributes.getResourceId(9, 0));
        a2.e.v(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f358d = a2.e.v(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(u3.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public s(s.e eVar) {
        this.f356a = 9;
        this.f357b = new ArrayList();
        this.c = new t.b();
        this.f358d = eVar;
    }

    public s(w wVar, g2.f fVar, d dVar, Set set) {
        this.f356a = 0;
        this.f357b = fVar;
        this.c = wVar;
        this.f358d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new a2.e(2, str));
        }
    }
}
