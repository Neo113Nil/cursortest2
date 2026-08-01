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
import com.derinko.gbini.n1casino.R;
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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a6 {
    public static volatile a6 e;
    public static final Object f = new Object();
    public static a6 g;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public a6(Context context, int i) {
        this.a = i;
        switch (i) {
            case 3:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(zo.K(context, R.attr.materialCalendarStyle, os.class.getCanonicalName()).data, vx.r);
                this.b = k0.C(context, obtainStyledAttributes.getResourceId(4, 0));
                k0.C(context, obtainStyledAttributes.getResourceId(2, 0));
                k0.C(context, obtainStyledAttributes.getResourceId(3, 0));
                k0.C(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList y = e70.y(context, obtainStyledAttributes, 7);
                this.c = k0.C(context, obtainStyledAttributes.getResourceId(9, 0));
                k0.C(context, obtainStyledAttributes.getResourceId(8, 0));
                this.d = k0.C(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(y.getDefaultColor());
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
        m70[] m70VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (m70VarArr = (m70[]) editable.getSpans(selectionStart, selectionEnd, m70.class)) != null && m70VarArr.length > 0) {
                for (m70 m70Var : m70VarArr) {
                    int spanStart = editable.getSpanStart(m70Var);
                    int spanEnd = editable.getSpanEnd(m70Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static a6 n(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new a6(context, 0);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static a6 u(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new a6(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public void a(View view, int i, boolean z) {
        RecyclerView recyclerView = ((oy) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : o(i);
        ((ca) this.c).e(childCount, z);
        if (z) {
            s(view);
        }
        recyclerView.addView(view, childCount);
        nz J = RecyclerView.J(view);
        py pyVar = recyclerView.q;
        if (pyVar != null && J != null) {
            pyVar.f(J);
        }
        ArrayList arrayList = recyclerView.G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ep) recyclerView.G.get(size)).getClass();
            }
        }
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((oy) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : o(i);
        ((ca) this.c).e(childCount, z);
        if (z) {
            s(view);
        }
        nz J = RecyclerView.J(view);
        if (J != null) {
            if (!J.k() && !J.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + J + recyclerView.z());
            }
            J.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        nz J;
        int o = o(i);
        ((ca) this.c).g(o);
        RecyclerView recyclerView = ((oy) this.b).a;
        View childAt = recyclerView.getChildAt(o);
        if (childAt != null && (J = RecyclerView.J(childAt)) != null) {
            if (J.k() && !J.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + J + recyclerView.z());
            }
            J.a(256);
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
                        if (qo.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new lk(e2);
            }
        }
    }

    public Object f(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (o8.N()) {
            try {
                o8.d(cls.getSimpleName());
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
                qo qoVar = (qo) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = qoVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            f(cls2, hashSet);
                        }
                    }
                }
                obj = qoVar.b((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new lk(th);
            }
        }
        return obj;
    }

    public f90 g(String str, Class cls) {
        f90 c;
        h90 h90Var = (h90) this.c;
        i90 i90Var = (i90) this.b;
        i90Var.getClass();
        LinkedHashMap linkedHashMap = i90Var.a;
        f90 f90Var = (f90) linkedHashMap.get(str);
        if (cls.isInstance(f90Var)) {
            f90Var.getClass();
            return f90Var;
        }
        pu puVar = new pu((vd) this.d);
        ((LinkedHashMap) puVar.a).put(dh.o, str);
        try {
            c = h90Var.l(cls, puVar);
        } catch (AbstractMethodError unused) {
            c = h90Var.c(cls);
        }
        c.getClass();
        f90 f90Var2 = (f90) linkedHashMap.put(str, c);
        if (f90Var2 != null) {
            f90Var2.b();
        }
        return c;
    }

    public View h(int i) {
        return ((oy) this.b).a.getChildAt(o(i));
    }

    public int i() {
        return ((oy) this.b).a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList j(int i) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = zo.q((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i) : q;
    }

    public Drawable k(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : zo.s((Context) this.d, resourceId);
    }

    public Drawable l(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        h4 a = h4.a();
        Context context = (Context) this.d;
        synchronized (a) {
            d = a.a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface m(int i, int i2, i5 i5Var) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        Context context = (Context) this.d;
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = f00.a;
        if (context.isRestricted()) {
            return null;
        }
        return f00.a(context, resourceId, typedValue, i2, i5Var, true, false);
    }

    public int o(int i) {
        ca caVar = (ca) this.c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((oy) this.b).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - caVar.b(i2));
            if (b == 0) {
                while (caVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public View p(int i) {
        return ((oy) this.b).a.getChildAt(i);
    }

    public int q() {
        return ((oy) this.b).a.getChildCount();
    }

    public boolean r(CharSequence charSequence, int i, int i2, l70 l70Var) {
        if ((l70Var.c & 3) == 0) {
            ke keVar = (ke) this.d;
            gu b = l70Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            keVar.getClass();
            ThreadLocal threadLocal = ke.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = keVar.a.hasGlyph(sb.toString());
            int i3 = l70Var.c & 4;
            l70Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (l70Var.c & 3) == 2;
    }

    public void s(View view) {
        ((ArrayList) this.d).add(view);
        oy oyVar = (oy) this.b;
        nz J = RecyclerView.J(view);
        if (J != null) {
            View view2 = J.a;
            RecyclerView recyclerView = oyVar.a;
            int i = J.q;
            if (i != -1) {
                J.p = i;
            } else {
                WeakHashMap weakHashMap = x80.a;
                J.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.M()) {
                J.q = 4;
                recyclerView.y0.add(J);
            } else {
                WeakHashMap weakHashMap2 = x80.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean t(int i, qc qcVar, ad adVar) {
        v7 v7Var = (v7) this.c;
        int[] iArr = adVar.p0;
        int[] iArr2 = adVar.t;
        v7Var.a = iArr[0];
        v7Var.b = iArr[1];
        v7Var.c = adVar.q();
        v7Var.d = adVar.k();
        v7Var.i = false;
        v7Var.j = i;
        boolean z = v7Var.a == 3;
        boolean z2 = v7Var.b == 3;
        boolean z3 = z && adVar.W > 0.0f;
        boolean z4 = z2 && adVar.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            v7Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            v7Var.b = 1;
        }
        qcVar.b(adVar, v7Var);
        adVar.O(v7Var.e);
        adVar.L(v7Var.f);
        adVar.E = v7Var.h;
        adVar.I(v7Var.g);
        v7Var.j = 0;
        return v7Var.i;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((ca) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public Object v(CharSequence charSequence, int i, int i2, int i3, boolean z, uh uhVar) {
        int i4;
        char c;
        vh vhVar = new vh((iu) ((we) this.c).h);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = vhVar.c.a;
                iu iuVar = sparseArray == null ? null : (iu) sparseArray.get(codePointAt);
                if (vhVar.a == 2) {
                    if (iuVar != null) {
                        vhVar.c = iuVar;
                        vhVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            vhVar.a();
                        } else if (codePointAt != 65039) {
                            iu iuVar2 = vhVar.c;
                            if (iuVar2.b != null) {
                                if (vhVar.f != 1) {
                                    vhVar.d = iuVar2;
                                    vhVar.a();
                                } else if (vhVar.b()) {
                                    vhVar.d = vhVar.c;
                                    vhVar.a();
                                } else {
                                    vhVar.a();
                                }
                                c = 3;
                            } else {
                                vhVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (iuVar == null) {
                    vhVar.a();
                    c = 1;
                } else {
                    vhVar.a = 2;
                    vhVar.c = iuVar;
                    vhVar.f = 1;
                    c = 2;
                }
                vhVar.e = codePointAt;
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
                    if (z || !r(charSequence, i4, i6, vhVar.d.b)) {
                        z2 = uhVar.s(charSequence, i4, i6, vhVar.d.b);
                        i5++;
                    }
                }
            }
        }
        if (vhVar.a == 2 && vhVar.c.b != null && ((vhVar.f > 1 || vhVar.b()) && i5 < i3 && z2 && (z || !r(charSequence, i4, i6, vhVar.c.b)))) {
            uhVar.s(charSequence, i4, i6, vhVar.c.b);
        }
        return uhVar.b();
    }

    public void w() {
        ((TypedArray) this.b).recycle();
    }

    public void x(bd bdVar, int i, int i2, int i3) {
        bdVar.getClass();
        int i4 = bdVar.b0;
        int i5 = bdVar.c0;
        bdVar.b0 = 0;
        bdVar.c0 = 0;
        bdVar.O(i2);
        bdVar.L(i3);
        if (i4 < 0) {
            bdVar.b0 = 0;
        } else {
            bdVar.b0 = i4;
        }
        if (i5 < 0) {
            bdVar.c0 = 0;
        } else {
            bdVar.c0 = i5;
        }
        bd bdVar2 = (bd) this.d;
        bdVar2.t0 = i;
        bdVar2.U();
    }

    public void y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            oy oyVar = (oy) this.b;
            nz J = RecyclerView.J(view);
            if (J != null) {
                RecyclerView recyclerView = oyVar.a;
                int i = J.p;
                if (recyclerView.M()) {
                    J.q = i;
                    recyclerView.y0.add(J);
                } else {
                    View view2 = J.a;
                    WeakHashMap weakHashMap = x80.a;
                    view2.setImportantForAccessibility(i);
                }
                J.p = 0;
            }
        }
    }

    public void z(bd bdVar) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = bdVar.q0.size();
        for (int i = 0; i < size; i++) {
            ad adVar = (ad) bdVar.q0.get(i);
            int[] iArr = adVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(adVar);
            }
        }
        bdVar.s0.b = true;
    }

    public a6(i90 i90Var, h90 h90Var, vd vdVar) {
        this.a = 10;
        i90Var.getClass();
        vdVar.getClass();
        this.b = i90Var;
        this.c = h90Var;
        this.d = vdVar;
    }

    public a6(oy oyVar) {
        this.a = 4;
        this.b = oyVar;
        this.c = new ca();
        this.d = new ArrayList();
    }

    public a6(tr trVar, View view) {
        Object urVar;
        this.a = 6;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            urVar = new wr();
        } else {
            urVar = i >= 33 ? new ur() : null;
        }
        this.b = urVar;
        this.c = trVar;
        this.d = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a6(i90 i90Var, h90 h90Var) {
        this(i90Var, h90Var, ud.b);
        this.a = 10;
        i90Var.getClass();
    }

    public a6(Context context, TypedArray typedArray) {
        this.a = 8;
        this.d = context;
        this.b = typedArray;
    }

    public a6(Runnable runnable) {
        this.a = 7;
        this.d = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.c = runnable;
    }

    public a6(Context context, LocationManager locationManager) {
        this.a = 9;
        this.c = new d70();
        this.d = context;
        this.b = locationManager;
    }

    public /* synthetic */ a6() {
        this.a = 2;
    }

    public a6(bd bdVar) {
        this.a = 1;
        this.b = new ArrayList();
        this.c = new v7();
        this.d = bdVar;
    }

    public a6(we weVar, dh dhVar, ke keVar, Set set) {
        this.a = 5;
        this.b = dhVar;
        this.c = weVar;
        this.d = keVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            v(str, 0, str.length(), 1, true, new k0(20, str));
        }
    }
}
