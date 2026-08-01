package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.trembin.nirefon.betfury.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class s6 {
    public static volatile s6 e;
    public static final Object f = new Object();
    public static s6 g;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public s6(Context context, int i) {
        this.a = i;
        switch (i) {
            case 3:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n9.L(context, R.attr.materialCalendarStyle, s00.class.getCanonicalName()).data, c70.t);
                this.b = o0.y(context, obtainStyledAttributes.getResourceId(4, 0));
                o0.y(context, obtainStyledAttributes.getResourceId(2, 0));
                o0.y(context, obtainStyledAttributes.getResourceId(3, 0));
                o0.y(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList r = mv.r(context, obtainStyledAttributes, 7);
                this.c = o0.y(context, obtainStyledAttributes.getResourceId(9, 0));
                o0.y(context, obtainStyledAttributes.getResourceId(8, 0));
                this.d = o0.y(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(r.getDefaultColor());
                obtainStyledAttributes.recycle();
                break;
            default:
                this.d = context.getApplicationContext();
                this.c = new HashSet();
                this.b = new HashMap();
                break;
        }
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z) {
        ok0[] ok0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (ok0VarArr = (ok0[]) editable.getSpans(selectionStart, selectionEnd, ok0.class)) != null && ok0VarArr.length > 0) {
                for (ok0 ok0Var : ok0VarArr) {
                    int spanStart = editable.getSpanStart(ok0Var);
                    int spanEnd = editable.getSpanEnd(ok0Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static s6 m(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new s6(context, 0);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static s6 t(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new s6(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public void a(View view, int i, boolean z) {
        RecyclerView recyclerView = ((w70) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : n(i);
        ((mb) this.c).e(childCount, z);
        if (z) {
            r(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.J(view);
        ArrayList arrayList = recyclerView.G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((aw) recyclerView.G.get(size)).getClass();
            }
        }
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((w70) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : n(i);
        ((mb) this.c).e(childCount, z);
        if (z) {
            r(view);
        }
        x80 J = RecyclerView.J(view);
        if (J != null) {
            if (!J.k() && !J.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + J + recyclerView.z());
            }
            J.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        x80 J;
        int n = n(i);
        ((mb) this.c).g(n);
        RecyclerView recyclerView = ((w70) this.b).a;
        View childAt = recyclerView.getChildAt(n);
        if (childAt != null && (J = RecyclerView.J(childAt)) != null) {
            if (J.k() && !J.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + J + recyclerView.z());
            }
            J.a(256);
        }
        recyclerView.detachViewFromParent(n);
    }

    public void e(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (bv.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new md(e2);
            }
        }
    }

    public Object f(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (zb0.j()) {
            try {
                zb0.b(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                bv bvVar = (bv) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = bvVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            f(cls2, hashSet);
                        }
                    }
                }
                obj = bvVar.b((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new md(th);
            }
        }
        return obj;
    }

    public View g(int i) {
        return ((w70) this.b).a.getChildAt(n(i));
    }

    public int h() {
        return ((w70) this.b).a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList i(int i) {
        int resourceId;
        ColorStateList A;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A = bi.A((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i) : A;
    }

    public Drawable j(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : d50.v((Context) this.d, resourceId);
    }

    public Drawable k(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        a5 a = a5.a();
        Context context = (Context) this.d;
        synchronized (a) {
            d = a.a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface l(int i, int i2, a6 a6Var) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        Context context = (Context) this.d;
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = s90.a;
        if (context.isRestricted()) {
            return null;
        }
        return s90.a(context, resourceId, typedValue, i2, a6Var, true, false);
    }

    public int n(int i) {
        mb mbVar = (mb) this.c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((w70) this.b).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - mbVar.b(i2));
            if (b == 0) {
                while (mbVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public View o(int i) {
        return ((w70) this.b).a.getChildAt(i);
    }

    public int p() {
        return ((w70) this.b).a.getChildCount();
    }

    public boolean q(CharSequence charSequence, int i, int i2, nk0 nk0Var) {
        if ((nk0Var.c & 3) == 0) {
            hi hiVar = (hi) this.d;
            l20 b = nk0Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.i).getShort(a + b.f);
            }
            hiVar.getClass();
            ThreadLocal threadLocal = hi.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = hiVar.a.hasGlyph(sb.toString());
            int i3 = nk0Var.c & 4;
            nk0Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (nk0Var.c & 3) == 2;
    }

    public void r(View view) {
        ((ArrayList) this.d).add(view);
        w70 w70Var = (w70) this.b;
        x80 J = RecyclerView.J(view);
        if (J != null) {
            View view2 = J.a;
            RecyclerView recyclerView = w70Var.a;
            int i = J.q;
            if (i != -1) {
                J.p = i;
            } else {
                WeakHashMap weakHashMap = hm0.a;
                J.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.M()) {
                J.q = 4;
                recyclerView.y0.add(J);
            } else {
                WeakHashMap weakHashMap2 = hm0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean s(int i, ef efVar, rf rfVar) {
        t8 t8Var = (t8) this.c;
        qf[] qfVarArr = rfVar.T;
        int[] iArr = rfVar.t;
        t8Var.a = qfVarArr[0];
        t8Var.b = qfVarArr[1];
        t8Var.c = rfVar.q();
        t8Var.d = rfVar.k();
        t8Var.i = false;
        t8Var.j = i;
        qf qfVar = t8Var.a;
        qf qfVar2 = qf.MATCH_CONSTRAINT;
        boolean z = qfVar == qfVar2;
        boolean z2 = t8Var.b == qfVar2;
        boolean z3 = z && rfVar.X > 0.0f;
        boolean z4 = z2 && rfVar.X > 0.0f;
        if (z3 && iArr[0] == 4) {
            t8Var.a = qf.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            t8Var.b = qf.FIXED;
        }
        efVar.b(rfVar, t8Var);
        rfVar.O(t8Var.e);
        rfVar.L(t8Var.f);
        rfVar.E = t8Var.h;
        rfVar.I(t8Var.g);
        t8Var.j = 0;
        return t8Var.i;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((mb) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public Object u(CharSequence charSequence, int i, int i2, int i3, boolean z, km kmVar) {
        int i4;
        char c;
        mm mmVar = new mm((n20) ((wi) this.c).h);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = mmVar.c.a;
                n20 n20Var = sparseArray == null ? null : (n20) sparseArray.get(codePointAt);
                if (mmVar.a == 2) {
                    if (n20Var != null) {
                        mmVar.c = n20Var;
                        mmVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            mmVar.a();
                        } else if (codePointAt != 65039) {
                            n20 n20Var2 = mmVar.c;
                            if (n20Var2.b != null) {
                                if (mmVar.f != 1) {
                                    mmVar.d = n20Var2;
                                    mmVar.a();
                                } else if (mmVar.b()) {
                                    mmVar.d = mmVar.c;
                                    mmVar.a();
                                } else {
                                    mmVar.a();
                                }
                                c = 3;
                            } else {
                                mmVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (n20Var == null) {
                    mmVar.a();
                    c = 1;
                } else {
                    mmVar.a = 2;
                    mmVar.c = n20Var;
                    mmVar.f = 1;
                    c = 2;
                }
                mmVar.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !q(charSequence, i4, i6, mmVar.d.b)) {
                        z2 = kmVar.b(charSequence, i4, i6, mmVar.d.b);
                        i5++;
                    }
                }
            }
        }
        if (mmVar.a == 2 && mmVar.c.b != null && ((mmVar.f > 1 || mmVar.b()) && i5 < i3 && z2 && (z || !q(charSequence, i4, i6, mmVar.c.b)))) {
            kmVar.b(charSequence, i4, i6, mmVar.c.b);
        }
        return kmVar.a();
    }

    public void v() {
        ((TypedArray) this.b).recycle();
    }

    public void w(sf sfVar, int i, int i2, int i3) {
        sfVar.getClass();
        int i4 = sfVar.c0;
        int i5 = sfVar.d0;
        sfVar.c0 = 0;
        sfVar.d0 = 0;
        sfVar.O(i2);
        sfVar.L(i3);
        if (i4 < 0) {
            sfVar.c0 = 0;
        } else {
            sfVar.c0 = i4;
        }
        if (i5 < 0) {
            sfVar.d0 = 0;
        } else {
            sfVar.d0 = i5;
        }
        sf sfVar2 = (sf) this.d;
        sfVar2.t0 = i;
        sfVar2.U();
    }

    public void x(View view) {
        if (((ArrayList) this.d).remove(view)) {
            w70 w70Var = (w70) this.b;
            x80 J = RecyclerView.J(view);
            if (J != null) {
                RecyclerView recyclerView = w70Var.a;
                int i = J.p;
                if (recyclerView.M()) {
                    J.q = i;
                    recyclerView.y0.add(J);
                } else {
                    View view2 = J.a;
                    WeakHashMap weakHashMap = hm0.a;
                    view2.setImportantForAccessibility(i);
                }
                J.p = 0;
            }
        }
    }

    public void y(sf sfVar) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = sfVar.q0.size();
        for (int i = 0; i < size; i++) {
            rf rfVar = (rf) sfVar.q0.get(i);
            qf[] qfVarArr = rfVar.T;
            qf qfVar = qfVarArr[0];
            qf qfVar2 = qf.MATCH_CONSTRAINT;
            if (qfVar == qfVar2 || qfVarArr[1] == qfVar2) {
                arrayList.add(rfVar);
            }
        }
        sfVar.s0.b = true;
    }

    public s6(w70 w70Var) {
        this.a = 4;
        this.b = w70Var;
        this.c = new mb();
        this.d = new ArrayList();
    }

    public s6(zz zzVar, View view) {
        Object a00Var;
        this.a = 6;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            a00Var = new c00();
        } else {
            a00Var = i >= 33 ? new a00() : null;
        }
        this.b = a00Var;
        this.c = zzVar;
        this.d = view;
    }

    public s6(Context context, TypedArray typedArray) {
        this.a = 8;
        this.d = context;
        this.b = typedArray;
    }

    public s6(Runnable runnable) {
        this.a = 7;
        this.d = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.c = runnable;
    }

    public s6(Context context, LocationManager locationManager) {
        this.a = 9;
        this.c = new fk0();
        this.d = context;
        this.b = locationManager;
    }

    public /* synthetic */ s6() {
        this.a = 2;
    }

    public s6(sf sfVar) {
        this.a = 1;
        this.b = new ArrayList();
        this.c = new t8();
        this.d = sfVar;
    }

    public s6(wi wiVar, sl slVar, hi hiVar, Set set) {
        this.a = 5;
        this.b = slVar;
        this.c = wiVar;
        this.d = hiVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            u(str, 0, str.length(), 1, true, new lm(str, 0));
        }
    }
}
