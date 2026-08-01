package L;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import c0.AbstractC0091b;
import c0.C0092c;
import g1.InterfaceC0110a;
import h.AbstractC0112a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C0241u;
import u.C0301b;

/* renamed from: L.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014l {
    public static C0014l d;

    /* renamed from: a, reason: collision with root package name */
    public Object f542a;

    /* renamed from: b, reason: collision with root package name */
    public Object f543b;

    /* renamed from: c, reason: collision with root package name */
    public Object f544c;

    public C0014l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, AbstractC0091b abstractC0091b) {
        h1.d.e(o2, "store");
        h1.d.e(abstractC0091b, "extras");
        this.f542a = o2;
        this.f543b = n2;
        this.f544c = abstractC0091b;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        V.x[] xVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xVarArr = (V.x[]) editable.getSpans(selectionStart, selectionEnd, V.x.class)) != null && xVarArr.length > 0) {
            for (V.x xVar : xVarArr) {
                int spanStart = editable.getSpanStart(xVar);
                int spanEnd = editable.getSpanEnd(xVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0014l i(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0014l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public ColorStateList b(int i) {
        int resourceId;
        ColorStateList s2;
        TypedArray typedArray = (TypedArray) this.f543b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (s2 = A1.m.s((Context) this.f542a, resourceId)) == null) ? typedArray.getColorStateList(i) : s2;
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f543b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0112a.l((Context) this.f542a, resourceId);
    }

    public Drawable d(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f543b).hasValue(i) || (resourceId = ((TypedArray) this.f543b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0241u a2 = C0241u.a();
        Context context = (Context) this.f542a;
        synchronized (a2) {
            d2 = a2.f3188a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface e(int i, int i2, m.T t2) {
        int resourceId = ((TypedArray) this.f543b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f544c) == null) {
            this.f544c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f544c;
        ThreadLocal threadLocal = C.r.f99a;
        Context context = (Context) this.f542a;
        if (context.isRestricted()) {
            return null;
        }
        return C.r.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M f(h1.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M a2;
        h1.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f542a;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1559a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f2646a;
        Map map = h1.b.f2644b;
        h1.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof V0.a) {
                if ((m2 instanceof h1.c ? ((h1.c) m2).d() : m2 instanceof InterfaceC0110a ? 0 : m2 instanceof g1.l ? 1 : m2 instanceof g1.p ? 2 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = A1.m.x(h1.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f543b;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                h1.d.b(m2);
            }
            h1.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        C0092c c0092c = new C0092c((AbstractC0091b) this.f544c);
        c0092c.f1734a.put(d0.b.f2131a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(A1.m.w(bVar), c0092c);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(A1.m.w(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(A1.m.w(bVar), c0092c);
        }
        h1.d.e(a2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean g(CharSequence charSequence, int i, int i2, V.w wVar) {
        if ((wVar.f932c & 3) == 0) {
            V.d dVar = (V.d) this.f544c;
            W.a c2 = wVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f480a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = V.d.f887b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f888a;
            String sb2 = sb.toString();
            int i3 = D.e.f117a;
            boolean a3 = D.d.a(textPaint, sb2);
            int i4 = wVar.f932c & 4;
            wVar.f932c = a3 ? i4 | 2 : i4 | 1;
        }
        return (wVar.f932c & 3) == 2;
    }

    public boolean h(int i, t.d dVar, w.f fVar) {
        int[] iArr = dVar.p0;
        int i2 = iArr[0];
        C0301b c0301b = (C0301b) this.f543b;
        c0301b.f3904a = i2;
        c0301b.f3905b = iArr[1];
        c0301b.f3906c = dVar.q();
        c0301b.d = dVar.k();
        c0301b.i = false;
        c0301b.f3911j = i;
        boolean z2 = c0301b.f3904a == 3;
        boolean z3 = c0301b.f3905b == 3;
        boolean z4 = z2 && dVar.f3772W > RecyclerView.A0;
        boolean z5 = z3 && dVar.f3772W > RecyclerView.A0;
        int[] iArr2 = dVar.f3807t;
        if (z4 && iArr2[0] == 4) {
            c0301b.f3904a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0301b.f3905b = 1;
        }
        fVar.b(dVar, c0301b);
        dVar.O(c0301b.f3907e);
        dVar.L(c0301b.f3908f);
        dVar.f3755E = c0301b.f3910h;
        dVar.I(c0301b.f3909g);
        c0301b.f3911j = 0;
        return c0301b.i;
    }

    public Object j(CharSequence charSequence, int i, int i2, int i3, boolean z2, V.p pVar) {
        int i4;
        char c2;
        V.q qVar = new V.q((V.t) ((S0.g) this.f543b).f824c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f914c.f924a;
                V.t tVar = sparseArray == null ? null : (V.t) sparseArray.get(codePointAt);
                if (qVar.f912a == 2) {
                    if (tVar != null) {
                        qVar.f914c = tVar;
                        qVar.f916f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            V.t tVar2 = qVar.f914c;
                            if (tVar2.f925b != null) {
                                if (qVar.f916f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f914c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                                c2 = 3;
                            } else {
                                qVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (tVar == null) {
                    qVar.a();
                    c2 = 1;
                } else {
                    qVar.f912a = 2;
                    qVar.f914c = tVar;
                    qVar.f916f = 1;
                    c2 = 2;
                }
                qVar.f915e = codePointAt;
                if (c2 == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c2 == 3) {
                    if (z2 || !g(charSequence, i4, i6, qVar.d.f925b)) {
                        z3 = pVar.f(charSequence, i4, i6, qVar.d.f925b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f912a == 2 && qVar.f914c.f925b != null && ((qVar.f916f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !g(charSequence, i4, i6, qVar.f914c.f925b)))) {
            pVar.f(charSequence, i4, i6, qVar.f914c.f925b);
        }
        return pVar.g();
    }

    public void k() {
        ((TypedArray) this.f543b).recycle();
    }

    public void l(t.e eVar, int i, int i2, int i3) {
        int i4 = eVar.f3779b0;
        int i5 = eVar.f3781c0;
        eVar.f3779b0 = 0;
        eVar.f3781c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f3779b0 = 0;
        } else {
            eVar.f3779b0 = i4;
        }
        if (i5 < 0) {
            eVar.f3781c0 = 0;
        } else {
            eVar.f3781c0 = i5;
        }
        t.e eVar2 = (t.e) this.f544c;
        eVar2.f3827t0 = i;
        eVar2.U();
    }

    public void m(t.e eVar) {
        ArrayList arrayList = (ArrayList) this.f542a;
        arrayList.clear();
        int size = eVar.f3824q0.size();
        for (int i = 0; i < size; i++) {
            t.d dVar = (t.d) eVar.f3824q0.get(i);
            int[] iArr = dVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3826s0.f3915b = true;
    }

    public C0014l(Runnable runnable) {
        this.f543b = new CopyOnWriteArrayList();
        this.f544c = new HashMap();
        this.f542a = runnable;
    }

    public C0014l(Context context, TypedArray typedArray) {
        this.f542a = context;
        this.f543b = typedArray;
    }
}
