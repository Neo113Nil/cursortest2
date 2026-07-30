package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3288h1;
import g1.C4524d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.AbstractC5032P;
import w.C5144d;
import w.C5145e;
import x.C5185b;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39324a;

    /* renamed from: b, reason: collision with root package name */
    public Object f39325b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39326c;

    /* renamed from: d, reason: collision with root package name */
    public Object f39327d;

    public /* synthetic */ Q0(int i) {
        this.f39324a = i;
    }

    public static Q0 o(Context context, AttributeSet attributeSet, int[] iArr) {
        return new Q0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static Q0 p(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new Q0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z8) {
        RecyclerView recyclerView = (RecyclerView) ((C4524d) this.f39325b).f37858u;
        int childCount = i < 0 ? recyclerView.getChildCount() : j(i);
        ((C3288h1) this.f39326c).g(childCount, z8);
        if (z8) {
            m(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z8) {
        RecyclerView recyclerView = (RecyclerView) ((C4524d) this.f39325b).f37858u;
        int childCount = i < 0 ? recyclerView.getChildCount() : j(i);
        ((C3288h1) this.f39326c).g(childCount, z8);
        if (z8) {
            m(view);
        }
        AbstractC5032P I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.j() && !I2.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f40623j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void c(int i) {
        AbstractC5032P I2;
        int j9 = j(i);
        ((C3288h1) this.f39326c).l(j9);
        RecyclerView recyclerView = (RecyclerView) ((C4524d) this.f39325b).f37858u;
        View childAt = recyclerView.getChildAt(j9);
        if (childAt != null && (I2 = RecyclerView.I(childAt)) != null) {
            if (I2.j() && !I2.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
            I2.a(256);
        }
        recyclerView.detachViewFromParent(j9);
    }

    public View d(int i) {
        return ((RecyclerView) ((C4524d) this.f39325b).f37858u).getChildAt(j(i));
    }

    public int e() {
        return ((RecyclerView) ((C4524d) this.f39325b).f37858u).getChildCount() - ((ArrayList) this.f39327d).size();
    }

    public ColorStateList f(int i) {
        int resourceId;
        ColorStateList c4;
        TypedArray typedArray = (TypedArray) this.f39326c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c4 = E.e.c((Context) this.f39325b, resourceId)) == null) ? typedArray.getColorStateList(i) : c4;
    }

    public Drawable g(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f39326c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : com.bumptech.glide.f.h((Context) this.f39325b, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f39326c).hasValue(i) || (resourceId = ((TypedArray) this.f39326c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C4758s a9 = C4758s.a();
        Context context = (Context) this.f39325b;
        synchronized (a9) {
            d2 = a9.f39494a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface i(int i, int i4, Q q6) {
        int resourceId = ((TypedArray) this.f39326c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f39327d) == null) {
            this.f39327d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f39327d;
        ThreadLocal threadLocal = F.o.f927a;
        Context context = (Context) this.f39325b;
        if (context.isRestricted()) {
            return null;
        }
        return F.o.b(context, resourceId, typedValue, i4, q6, true, false);
    }

    public int j(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C4524d) this.f39325b).f37858u).getChildCount();
        int i4 = i;
        while (i4 < childCount) {
            C3288h1 c3288h1 = (C3288h1) this.f39326c;
            int d2 = i - (i4 - c3288h1.d(i4));
            if (d2 == 0) {
                while (c3288h1.f(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += d2;
        }
        return -1;
    }

    public View k(int i) {
        return ((RecyclerView) ((C4524d) this.f39325b).f37858u).getChildAt(i);
    }

    public int l() {
        return ((RecyclerView) ((C4524d) this.f39325b).f37858u).getChildCount();
    }

    public void m(View view) {
        ((ArrayList) this.f39327d).add(view);
        C4524d c4524d = (C4524d) this.f39325b;
        AbstractC5032P I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f40630q;
            View view2 = I2.f40615a;
            if (i != -1) {
                I2.f40629p = i;
            } else {
                WeakHashMap weakHashMap = O.X.f2240a;
                I2.f40629p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c4524d.f37858u;
            if (recyclerView.L()) {
                I2.f40630q = 4;
                recyclerView.f5364V0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = O.X.f2240a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean n(int i, C5144d c5144d, z.f fVar) {
        int[] iArr = c5144d.f41467p0;
        int i4 = iArr[0];
        C5185b c5185b = (C5185b) this.f39326c;
        c5185b.f41714a = i4;
        c5185b.f41715b = iArr[1];
        c5185b.f41716c = c5144d.q();
        c5185b.f41717d = c5144d.k();
        c5185b.i = false;
        c5185b.f41722j = i;
        boolean z8 = c5185b.f41714a == 3;
        boolean z9 = c5185b.f41715b == 3;
        boolean z10 = z8 && c5144d.f41435W > 0.0f;
        boolean z11 = z9 && c5144d.f41435W > 0.0f;
        int[] iArr2 = c5144d.f41471t;
        if (z10 && iArr2[0] == 4) {
            c5185b.f41714a = 1;
        }
        if (z11 && iArr2[1] == 4) {
            c5185b.f41715b = 1;
        }
        fVar.b(c5144d, c5185b);
        c5144d.O(c5185b.f41718e);
        c5144d.L(c5185b.f41719f);
        c5144d.f41418E = c5185b.f41721h;
        c5144d.I(c5185b.f41720g);
        c5185b.f41722j = 0;
        return c5185b.i;
    }

    public void q() {
        ((TypedArray) this.f39326c).recycle();
    }

    public void r(C5145e c5145e, int i, int i4, int i9) {
        c5145e.getClass();
        int i10 = c5145e.f41441b0;
        int i11 = c5145e.f41443c0;
        c5145e.f41441b0 = 0;
        c5145e.f41443c0 = 0;
        c5145e.O(i4);
        c5145e.L(i9);
        if (i10 < 0) {
            c5145e.f41441b0 = 0;
        } else {
            c5145e.f41441b0 = i10;
        }
        if (i11 < 0) {
            c5145e.f41443c0 = 0;
        } else {
            c5145e.f41443c0 = i11;
        }
        C5145e c5145e2 = (C5145e) this.f39327d;
        c5145e2.f41492t0 = i;
        c5145e2.U();
    }

    public void s(View view) {
        if (((ArrayList) this.f39327d).remove(view)) {
            C4524d c4524d = (C4524d) this.f39325b;
            AbstractC5032P I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f40629p;
                RecyclerView recyclerView = (RecyclerView) c4524d.f37858u;
                if (recyclerView.L()) {
                    I2.f40630q = i;
                    recyclerView.f5364V0.add(I2);
                } else {
                    WeakHashMap weakHashMap = O.X.f2240a;
                    I2.f40615a.setImportantForAccessibility(i);
                }
                I2.f40629p = 0;
            }
        }
    }

    public void t(C5145e c5145e) {
        ArrayList arrayList = (ArrayList) this.f39325b;
        arrayList.clear();
        int size = c5145e.f41489q0.size();
        for (int i = 0; i < size; i++) {
            C5144d c5144d = (C5144d) c5145e.f41489q0.get(i);
            int[] iArr = c5144d.f41467p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c5144d);
            }
        }
        c5145e.f41491s0.f41726b = true;
    }

    public String toString() {
        switch (this.f39324a) {
            case 1:
                return ((C3288h1) this.f39326c).toString() + ", hidden list:" + ((ArrayList) this.f39327d).size();
            default:
                return super.toString();
        }
    }

    public void u(String str, double d2, double d3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.f39325b;
            int size = arrayList.size();
            arrayList2 = (ArrayList) this.f39326c;
            arrayList3 = (ArrayList) this.f39327d;
            if (i >= size) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d2));
        arrayList2.add(i, Double.valueOf(d3));
    }

    public /* synthetic */ Q0(Object obj, Object obj2, Object obj3, int i) {
        this.f39324a = i;
        this.f39325b = obj;
        this.f39326c = obj2;
        this.f39327d = obj3;
    }

    public Q0() {
        this.f39324a = 2;
        this.f39325b = new ArrayList();
        this.f39326c = new ArrayList();
        this.f39327d = new ArrayList();
    }

    public Q0(C4524d c4524d) {
        this.f39324a = 1;
        this.f39325b = c4524d;
        this.f39326c = new C3288h1(8);
        this.f39327d = new ArrayList();
    }

    public Q0(Context context, TypedArray typedArray) {
        this.f39324a = 0;
        this.f39325b = context;
        this.f39326c = typedArray;
    }

    public Q0(C5145e c5145e) {
        this.f39324a = 7;
        this.f39325b = new ArrayList();
        this.f39326c = new C5185b();
        this.f39327d = c5145e;
    }

    public Q0(u1.k kVar, J1.f fVar, u1.o oVar) {
        this.f39324a = 6;
        this.f39327d = kVar;
        this.f39326c = fVar;
        this.f39325b = oVar;
    }
}
