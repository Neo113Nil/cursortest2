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
import b0.AbstractC0079b;
import b0.C0080c;
import c1.InterfaceC0085a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0195S;
import l.C0234t;
import t.C0298b;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014l {
    public static C0014l d;

    /* renamed from: a, reason: collision with root package name */
    public Object f474a;

    /* renamed from: b, reason: collision with root package name */
    public Object f475b;

    /* renamed from: c, reason: collision with root package name */
    public Object f476c;

    public C0014l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, AbstractC0079b abstractC0079b) {
        d1.d.e(o2, "store");
        d1.d.e(abstractC0079b, "extras");
        this.f474a = o2;
        this.f475b = n2;
        this.f476c = abstractC0079b;
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
        ColorStateList A2;
        TypedArray typedArray = (TypedArray) this.f475b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A2 = w1.d.A((Context) this.f474a, resourceId)) == null) ? typedArray.getColorStateList(i) : A2;
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f475b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : w1.l.z((Context) this.f474a, resourceId);
    }

    public Drawable d(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f475b).hasValue(i) || (resourceId = ((TypedArray) this.f475b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0234t a2 = C0234t.a();
        Context context = (Context) this.f474a;
        synchronized (a2) {
            d2 = a2.f2993a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface e(int i, int i2, C0195S c0195s) {
        int resourceId = ((TypedArray) this.f475b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f476c) == null) {
            this.f476c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f476c;
        ThreadLocal threadLocal = B.r.f44a;
        Context context = (Context) this.f474a;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, c0195s, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M f(d1.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M b2;
        d1.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f474a;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1467a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f2015a;
        Map map = d1.b.f2013b;
        d1.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof R0.a) {
                if ((m2 instanceof d1.c ? ((d1.c) m2).d() : m2 instanceof InterfaceC0085a ? 0 : m2 instanceof c1.l ? 1 : m2 instanceof c1.p ? 2 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = w1.d.G(d1.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f475b;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                d1.d.b(m2);
            }
            d1.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        C0080c c0080c = new C0080c((AbstractC0079b) this.f476c);
        c0080c.f1632a.put(c0.b.f1641a, str);
        try {
            try {
                n2.getClass();
                b2 = n2.a(w1.d.F(bVar), c0080c);
            } catch (AbstractMethodError unused) {
                b2 = n2.b(w1.d.F(bVar));
            }
        } catch (AbstractMethodError unused2) {
            b2 = n2.a(w1.d.F(bVar), c0080c);
        }
        d1.d.e(b2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, b2);
        if (m3 != null) {
            m3.a();
        }
        return b2;
    }

    public boolean g(CharSequence charSequence, int i, int i2, U.x xVar) {
        if ((xVar.f883c & 3) == 0) {
            U.d dVar = (U.d) this.f476c;
            V.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f413a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = U.d.f837b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f838a;
            String sb2 = sb.toString();
            int i3 = C.e.f110a;
            boolean a3 = C.d.a(textPaint, sb2);
            int i4 = xVar.f883c & 4;
            xVar.f883c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f883c & 3) == 2;
    }

    public boolean h(int i, s.d dVar, v.f fVar) {
        int[] iArr = dVar.f3600p0;
        int i2 = iArr[0];
        C0298b c0298b = (C0298b) this.f475b;
        c0298b.f3759a = i2;
        c0298b.f3760b = iArr[1];
        c0298b.f3761c = dVar.q();
        c0298b.d = dVar.k();
        c0298b.i = false;
        c0298b.f3765j = i;
        boolean z2 = c0298b.f3759a == 3;
        boolean z3 = c0298b.f3760b == 3;
        boolean z4 = z2 && dVar.f3570W > RecyclerView.f1530C0;
        boolean z5 = z3 && dVar.f3570W > RecyclerView.f1530C0;
        int[] iArr2 = dVar.f3604t;
        if (z4 && iArr2[0] == 4) {
            c0298b.f3759a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0298b.f3760b = 1;
        }
        fVar.b(dVar, c0298b);
        dVar.O(c0298b.f3762e);
        dVar.L(c0298b.f3763f);
        dVar.f3553E = c0298b.h;
        dVar.I(c0298b.f3764g);
        c0298b.f3765j = 0;
        return c0298b.i;
    }

    public Object j(CharSequence charSequence, int i, int i2, int i3, boolean z2, U.p pVar) {
        int i4;
        char c2;
        U.q qVar = new U.q((U.t) ((U.u) this.f475b).f876c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f863c.f872a;
                U.t tVar = sparseArray == null ? null : (U.t) sparseArray.get(codePointAt);
                if (qVar.f861a == 2) {
                    if (tVar != null) {
                        qVar.f863c = tVar;
                        qVar.f865f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            U.t tVar2 = qVar.f863c;
                            if (tVar2.f873b != null) {
                                if (qVar.f865f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f863c;
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
                    qVar.f861a = 2;
                    qVar.f863c = tVar;
                    qVar.f865f = 1;
                    c2 = 2;
                }
                qVar.f864e = codePointAt;
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
                    if (z2 || !g(charSequence, i4, i6, qVar.d.f873b)) {
                        z3 = pVar.q(charSequence, i4, i6, qVar.d.f873b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f861a == 2 && qVar.f863c.f873b != null && ((qVar.f865f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !g(charSequence, i4, i6, qVar.f863c.f873b)))) {
            pVar.q(charSequence, i4, i6, qVar.f863c.f873b);
        }
        return pVar.h();
    }

    public void k() {
        ((TypedArray) this.f475b).recycle();
    }

    public void l(s.e eVar, int i, int i2, int i3) {
        int i4 = eVar.f3577b0;
        int i5 = eVar.f3579c0;
        eVar.f3577b0 = 0;
        eVar.f3579c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f3577b0 = 0;
        } else {
            eVar.f3577b0 = i4;
        }
        if (i5 < 0) {
            eVar.f3579c0 = 0;
        } else {
            eVar.f3579c0 = i5;
        }
        s.e eVar2 = (s.e) this.f476c;
        eVar2.f3625t0 = i;
        eVar2.U();
    }

    public void m(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f474a;
        arrayList.clear();
        int size = eVar.f3622q0.size();
        for (int i = 0; i < size; i++) {
            s.d dVar = (s.d) eVar.f3622q0.get(i);
            int[] iArr = dVar.f3600p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3624s0.f3769b = true;
    }

    public C0014l(Runnable runnable) {
        this.f475b = new CopyOnWriteArrayList();
        this.f476c = new HashMap();
        this.f474a = runnable;
    }

    public C0014l(Context context, TypedArray typedArray) {
        this.f474a = context;
        this.f475b = typedArray;
    }
}
