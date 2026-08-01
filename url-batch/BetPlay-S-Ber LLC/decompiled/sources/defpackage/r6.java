package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
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
import com.awerser.monnit.betplay.R;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class r6 {
    public static volatile r6 e;
    public static final Object f = new Object();
    public static r6 g;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public r6(Context context, int i) {
        this.a = i;
        switch (i) {
            case 3:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(l70.R(context, R.attr.materialCalendarStyle, ct.class.getCanonicalName()).data, ly.s);
                this.b = j1.v(context, obtainStyledAttributes.getResourceId(4, 0));
                j1.v(context, obtainStyledAttributes.getResourceId(2, 0));
                j1.v(context, obtainStyledAttributes.getResourceId(3, 0));
                j1.v(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList x = op.x(context, obtainStyledAttributes, 7);
                this.c = j1.v(context, obtainStyledAttributes.getResourceId(9, 0));
                j1.v(context, obtainStyledAttributes.getResourceId(8, 0));
                this.d = j1.v(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(x.getDefaultColor());
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
        t70[] t70VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (t70VarArr = (t70[]) editable.getSpans(selectionStart, selectionEnd, t70.class)) != null && t70VarArr.length > 0) {
                for (t70 t70Var : t70VarArr) {
                    int spanStart = editable.getSpanStart(t70Var);
                    int spanEnd = editable.getSpanEnd(t70Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static r6 n(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new r6(context, 0);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static r6 u(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new r6(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public void a(View view, int i, boolean z) {
        RecyclerView recyclerView = ((ez) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : o(i);
        ((aa) this.c).e(childCount, z);
        if (z) {
            s(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((ez) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : o(i);
        ((aa) this.c).e(childCount, z);
        if (z) {
            s(view);
        }
        c00 I = RecyclerView.I(view);
        if (I != null) {
            if (!I.j() && !I.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
            I.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        c00 I;
        int o = o(i);
        ((aa) this.c).g(o);
        RecyclerView recyclerView = ((ez) this.b).a;
        View childAt = recyclerView.getChildAt(o);
        if (childAt != null && (I = RecyclerView.I(childAt)) != null) {
            if (I.j() && !I.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
            I.a(256);
        }
        recyclerView.detachViewFromParent(o);
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
                        if (fp.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new gk(e2);
            }
        }
    }

    public Object f(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (vw.Q()) {
            try {
                vw.h(cls.getSimpleName());
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
                fp fpVar = (fp) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = fpVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            f(cls2, hashSet);
                        }
                    }
                }
                obj = fpVar.b((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new gk(th);
            }
        }
        return obj;
    }

    public m90 g(String str, Class cls) {
        m90 c;
        p90 p90Var = (p90) this.c;
        q90 q90Var = (q90) this.b;
        q90Var.getClass();
        LinkedHashMap linkedHashMap = q90Var.a;
        m90 m90Var = (m90) linkedHashMap.get(str);
        if (!cls.isInstance(m90Var)) {
            ev evVar = new ev((zd) this.d);
            evVar.a.put(vg.o, str);
            try {
                c = p90Var.i(cls, evVar);
            } catch (AbstractMethodError unused) {
                c = p90Var.c(cls);
            }
            c.getClass();
            m90 m90Var2 = (m90) linkedHashMap.put(str, c);
            if (m90Var2 != null) {
                m90Var2.b();
            }
            return c;
        }
        y10 y10Var = p90Var instanceof y10 ? (y10) p90Var : null;
        if (y10Var != null) {
            m90Var.getClass();
            iq iqVar = y10Var.i;
            if (iqVar != null) {
                v10 v10Var = y10Var.j;
                v10Var.getClass();
                j8.e(m90Var, v10Var, iqVar);
            }
        }
        m90Var.getClass();
        return m90Var;
    }

    public View h(int i) {
        return ((ez) this.b).a.getChildAt(o(i));
    }

    public int i() {
        return ((ez) this.b).a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList j(int i) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = j8.q((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i) : q;
    }

    public Drawable k(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : l70.p((Context) this.d, resourceId);
    }

    public Drawable l(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        y4 a = y4.a();
        Context context = (Context) this.d;
        synchronized (a) {
            d = a.a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface m(int i, int i2, z5 z5Var) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        Context context = (Context) this.d;
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = v00.a;
        if (context.isRestricted()) {
            return null;
        }
        return v00.a(context, resourceId, typedValue, i2, z5Var, true, false);
    }

    public int o(int i) {
        aa aaVar = (aa) this.c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((ez) this.b).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - aaVar.b(i2));
            if (b == 0) {
                while (aaVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public View p(int i) {
        return ((ez) this.b).a.getChildAt(i);
    }

    public int q() {
        return ((ez) this.b).a.getChildCount();
    }

    public boolean r(CharSequence charSequence, int i, int i2, s70 s70Var) {
        if ((s70Var.c & 3) == 0) {
            le leVar = (le) this.d;
            vu b = s70Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            leVar.getClass();
            ThreadLocal threadLocal = le.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = leVar.a.hasGlyph(sb.toString());
            int i3 = s70Var.c & 4;
            s70Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (s70Var.c & 3) == 2;
    }

    public void s(View view) {
        ((ArrayList) this.d).add(view);
        ez ezVar = (ez) this.b;
        c00 I = RecyclerView.I(view);
        if (I != null) {
            View view2 = I.a;
            RecyclerView recyclerView = ezVar.a;
            int i = I.q;
            if (i != -1) {
                I.p = i;
            } else {
                WeakHashMap weakHashMap = e90.a;
                I.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                I.q = 4;
                recyclerView.x0.add(I);
            } else {
                WeakHashMap weakHashMap2 = e90.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean t(int i, uc ucVar, ed edVar) {
        b8 b8Var = (b8) this.c;
        int[] iArr = edVar.p0;
        int[] iArr2 = edVar.t;
        b8Var.a = iArr[0];
        b8Var.b = iArr[1];
        b8Var.c = edVar.q();
        b8Var.d = edVar.k();
        b8Var.i = false;
        b8Var.j = i;
        boolean z = b8Var.a == 3;
        boolean z2 = b8Var.b == 3;
        boolean z3 = z && edVar.W > 0.0f;
        boolean z4 = z2 && edVar.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            b8Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            b8Var.b = 1;
        }
        ucVar.b(edVar, b8Var);
        edVar.O(b8Var.e);
        edVar.L(b8Var.f);
        edVar.E = b8Var.h;
        edVar.I(b8Var.g);
        b8Var.j = 0;
        return b8Var.i;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((aa) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public Object v(CharSequence charSequence, int i, int i2, int i3, boolean z, mh mhVar) {
        int i4;
        char c;
        nh nhVar = new nh((xu) ((h8) this.c).h);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = nhVar.c.a;
                xu xuVar = sparseArray == null ? null : (xu) sparseArray.get(codePointAt);
                if (nhVar.a == 2) {
                    if (xuVar != null) {
                        nhVar.c = xuVar;
                        nhVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            nhVar.a();
                        } else if (codePointAt != 65039) {
                            xu xuVar2 = nhVar.c;
                            if (xuVar2.b != null) {
                                if (nhVar.f != 1) {
                                    nhVar.d = xuVar2;
                                    nhVar.a();
                                } else if (nhVar.b()) {
                                    nhVar.d = nhVar.c;
                                    nhVar.a();
                                } else {
                                    nhVar.a();
                                }
                                c = 3;
                            } else {
                                nhVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (xuVar == null) {
                    nhVar.a();
                    c = 1;
                } else {
                    nhVar.a = 2;
                    nhVar.c = xuVar;
                    nhVar.f = 1;
                    c = 2;
                }
                nhVar.e = codePointAt;
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
                    if (z || !r(charSequence, i4, i6, nhVar.d.b)) {
                        z2 = mhVar.n(charSequence, i4, i6, nhVar.d.b);
                        i5++;
                    }
                }
            }
        }
        if (nhVar.a == 2 && nhVar.c.b != null && ((nhVar.f > 1 || nhVar.b()) && i5 < i3 && z2 && (z || !r(charSequence, i4, i6, nhVar.c.b)))) {
            mhVar.n(charSequence, i4, i6, nhVar.c.b);
        }
        return mhVar.b();
    }

    public void w() {
        ((TypedArray) this.b).recycle();
    }

    public void x(fd fdVar, int i, int i2, int i3) {
        fdVar.getClass();
        int i4 = fdVar.b0;
        int i5 = fdVar.c0;
        fdVar.b0 = 0;
        fdVar.c0 = 0;
        fdVar.O(i2);
        fdVar.L(i3);
        if (i4 < 0) {
            fdVar.b0 = 0;
        } else {
            fdVar.b0 = i4;
        }
        if (i5 < 0) {
            fdVar.c0 = 0;
        } else {
            fdVar.c0 = i5;
        }
        fd fdVar2 = (fd) this.d;
        fdVar2.t0 = i;
        fdVar2.U();
    }

    public void y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ez ezVar = (ez) this.b;
            c00 I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = ezVar.a;
                int i = I.p;
                if (recyclerView.L()) {
                    I.q = i;
                    recyclerView.x0.add(I);
                } else {
                    View view2 = I.a;
                    WeakHashMap weakHashMap = e90.a;
                    view2.setImportantForAccessibility(i);
                }
                I.p = 0;
            }
        }
    }

    public void z(fd fdVar) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = fdVar.q0.size();
        for (int i = 0; i < size; i++) {
            ed edVar = (ed) fdVar.q0.get(i);
            int[] iArr = edVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(edVar);
            }
        }
        fdVar.s0.b = true;
    }

    public r6(Method method, Method method2, Method method3) {
        this.a = 5;
        this.b = method;
        this.c = method2;
        this.d = method3;
    }

    public r6(q90 q90Var, p90 p90Var, zd zdVar) {
        this.a = 10;
        q90Var.getClass();
        zdVar.getClass();
        this.b = q90Var;
        this.c = p90Var;
        this.d = zdVar;
    }

    public r6(ez ezVar) {
        this.a = 4;
        this.b = ezVar;
        this.c = new aa();
        this.d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r6(q90 q90Var, p90 p90Var) {
        this(q90Var, p90Var, yd.b);
        this.a = 10;
        q90Var.getClass();
    }

    public r6(Context context, TypedArray typedArray) {
        this.a = 8;
        this.d = context;
        this.b = typedArray;
    }

    public r6(Runnable runnable) {
        this.a = 7;
        this.d = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.c = runnable;
    }

    public r6(Context context, LocationManager locationManager) {
        this.a = 9;
        this.c = new k70();
        this.d = context;
        this.b = locationManager;
    }

    public /* synthetic */ r6() {
        this.a = 2;
    }

    public r6(fd fdVar) {
        this.a = 1;
        this.b = new ArrayList();
        this.c = new b8();
        this.d = fdVar;
    }

    public r6(h8 h8Var, vg vgVar, le leVar, Set set) {
        this.a = 6;
        this.b = vgVar;
        this.c = h8Var;
        this.d = leVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            v(str, 0, str.length(), 1, true, new j1(15, str));
        }
    }
}
