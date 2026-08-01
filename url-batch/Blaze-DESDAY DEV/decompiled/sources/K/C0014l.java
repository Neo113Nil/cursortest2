package K;

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
import b0.AbstractC0080b;
import b0.C0081c;
import f1.InterfaceC0090a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0239u;
import t.C0299b;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014l {
    public static C0014l d;

    /* renamed from: a, reason: collision with root package name */
    public Object f491a;

    /* renamed from: b, reason: collision with root package name */
    public Object f492b;

    /* renamed from: c, reason: collision with root package name */
    public Object f493c;

    public C0014l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, AbstractC0080b abstractC0080b) {
        g1.d.e(o2, "store");
        g1.d.e(abstractC0080b, "extras");
        this.f491a = o2;
        this.f492b = n2;
        this.f493c = abstractC0080b;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        U.y[] yVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yVarArr = (U.y[]) editable.getSpans(selectionStart, selectionEnd, U.y.class)) != null && yVarArr.length > 0) {
            for (U.y yVar : yVarArr) {
                int spanStart = editable.getSpanStart(yVar);
                int spanEnd = editable.getSpanEnd(yVar);
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
        ColorStateList C2;
        TypedArray typedArray = (TypedArray) this.f492b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (C2 = z1.d.C((Context) this.f491a, resourceId)) == null) ? typedArray.getColorStateList(i) : C2;
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f492b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : z1.l.w((Context) this.f491a, resourceId);
    }

    public Drawable d(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f492b).hasValue(i) || (resourceId = ((TypedArray) this.f492b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0239u a2 = C0239u.a();
        Context context = (Context) this.f491a;
        synchronized (a2) {
            d2 = a2.f3023a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface e(int i, int i2, l.T t2) {
        int resourceId = ((TypedArray) this.f492b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f493c) == null) {
            this.f493c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f493c;
        ThreadLocal threadLocal = B.r.f58a;
        Context context = (Context) this.f491a;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M f(g1.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M b2;
        g1.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f491a;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1498a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f2547a;
        Map map = g1.b.f2545b;
        g1.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof U0.a) {
                if ((m2 instanceof g1.c ? ((g1.c) m2).d() : m2 instanceof InterfaceC0090a ? 0 : m2 instanceof f1.l ? 1 : m2 instanceof f1.p ? 2 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = z1.l.z(g1.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f492b;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                g1.d.b(m2);
            }
            g1.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        C0081c c0081c = new C0081c((AbstractC0080b) this.f493c);
        c0081c.f1661a.put(c0.b.f1671a, str);
        try {
            try {
                n2.getClass();
                b2 = n2.a(z1.l.y(bVar), c0081c);
            } catch (AbstractMethodError unused) {
                b2 = n2.b(z1.l.y(bVar));
            }
        } catch (AbstractMethodError unused2) {
            b2 = n2.a(z1.l.y(bVar), c0081c);
        }
        g1.d.e(b2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, b2);
        if (m3 != null) {
            m3.a();
        }
        return b2;
    }

    public boolean g(CharSequence charSequence, int i, int i2, U.x xVar) {
        if ((xVar.f892c & 3) == 0) {
            U.d dVar = (U.d) this.f493c;
            V.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f430a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = U.d.f846b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f847a;
            String sb2 = sb.toString();
            int i3 = C.e.f75a;
            boolean a3 = C.d.a(textPaint, sb2);
            int i4 = xVar.f892c & 4;
            xVar.f892c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f892c & 3) == 2;
    }

    public boolean h(int i, s.d dVar, v.f fVar) {
        int[] iArr = dVar.f3627p0;
        int i2 = iArr[0];
        C0299b c0299b = (C0299b) this.f492b;
        c0299b.f3727a = i2;
        c0299b.f3728b = iArr[1];
        c0299b.f3729c = dVar.q();
        c0299b.d = dVar.k();
        c0299b.i = false;
        c0299b.f3733j = i;
        boolean z2 = c0299b.f3727a == 3;
        boolean z3 = c0299b.f3728b == 3;
        boolean z4 = z2 && dVar.f3596W > RecyclerView.f1559A0;
        boolean z5 = z3 && dVar.f3596W > RecyclerView.f1559A0;
        int[] iArr2 = dVar.f3631t;
        if (z4 && iArr2[0] == 4) {
            c0299b.f3727a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0299b.f3728b = 1;
        }
        fVar.b(dVar, c0299b);
        dVar.O(c0299b.f3730e);
        dVar.L(c0299b.f3731f);
        dVar.f3579E = c0299b.h;
        dVar.I(c0299b.f3732g);
        c0299b.f3733j = 0;
        return c0299b.i;
    }

    public Object j(CharSequence charSequence, int i, int i2, int i3, boolean z2, U.p pVar) {
        int i4;
        char c2;
        U.q qVar = new U.q((U.t) ((U.u) this.f492b).f885c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f872c.f881a;
                U.t tVar = sparseArray == null ? null : (U.t) sparseArray.get(codePointAt);
                if (qVar.f870a == 2) {
                    if (tVar != null) {
                        qVar.f872c = tVar;
                        qVar.f874f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            U.t tVar2 = qVar.f872c;
                            if (tVar2.f882b != null) {
                                if (qVar.f874f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f872c;
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
                    qVar.f870a = 2;
                    qVar.f872c = tVar;
                    qVar.f874f = 1;
                    c2 = 2;
                }
                qVar.f873e = codePointAt;
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
                    if (z2 || !g(charSequence, i4, i6, qVar.d.f882b)) {
                        z3 = pVar.s(charSequence, i4, i6, qVar.d.f882b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f870a == 2 && qVar.f872c.f882b != null && ((qVar.f874f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !g(charSequence, i4, i6, qVar.f872c.f882b)))) {
            pVar.s(charSequence, i4, i6, qVar.f872c.f882b);
        }
        return pVar.h();
    }

    public void k() {
        ((TypedArray) this.f492b).recycle();
    }

    public void l(s.e eVar, int i, int i2, int i3) {
        int i4 = eVar.f3603b0;
        int i5 = eVar.f3605c0;
        eVar.f3603b0 = 0;
        eVar.f3605c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f3603b0 = 0;
        } else {
            eVar.f3603b0 = i4;
        }
        if (i5 < 0) {
            eVar.f3605c0 = 0;
        } else {
            eVar.f3605c0 = i5;
        }
        s.e eVar2 = (s.e) this.f493c;
        eVar2.f3652t0 = i;
        eVar2.U();
    }

    public void m(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f491a;
        arrayList.clear();
        int size = eVar.f3649q0.size();
        for (int i = 0; i < size; i++) {
            s.d dVar = (s.d) eVar.f3649q0.get(i);
            int[] iArr = dVar.f3627p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3651s0.f3737b = true;
    }

    public C0014l(Runnable runnable) {
        this.f492b = new CopyOnWriteArrayList();
        this.f493c = new HashMap();
        this.f491a = runnable;
    }

    public C0014l(Context context, TypedArray typedArray) {
        this.f491a = context;
        this.f492b = typedArray;
    }
}
