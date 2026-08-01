package u0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.CancellationSignal;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.recyclerview.widget.RecyclerView;
import c0.C0087b;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import d1.AbstractC0095c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0221S;
import l.C0260t;
import t.C0344b;

/* renamed from: u0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372k {
    public static C0372k d;

    /* renamed from: a, reason: collision with root package name */
    public Object f4190a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4191b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4192c;

    public C0372k(Q q2, P p2, b0.b bVar) {
        k1.e.e(q2, "store");
        k1.e.e(bVar, "extras");
        this.f4190a = q2;
        this.f4191b = p2;
        this.f4192c = bVar;
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

    public static C0372k j(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0372k(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public Object b(AbstractC0095c abstractC0095c) {
        h0.p a2 = h0.p.a("SELECT * FROM habits WHERE active = 1 ORDER BY createdAt ASC", 0);
        return h0.e.a((FortuneQuestDatabase_Impl) this.f4190a, new CancellationSignal(), new CallableC0371j(this, a2, 0), abstractC0095c);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList z2;
        TypedArray typedArray = (TypedArray) this.f4191b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = H1.d.z((Context) this.f4190a, resourceId)) == null) ? typedArray.getColorStateList(i) : z2;
    }

    public Drawable d(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f4191b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0091d.j((Context) this.f4190a, resourceId);
    }

    public Drawable e(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f4191b).hasValue(i) || (resourceId = ((TypedArray) this.f4191b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0260t a2 = C0260t.a();
        Context context = (Context) this.f4190a;
        synchronized (a2) {
            d2 = a2.f3469a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface f(int i, int i2, C0221S c0221s) {
        int resourceId = ((TypedArray) this.f4191b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f4192c) == null) {
            this.f4192c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f4192c;
        ThreadLocal threadLocal = B.q.f54a;
        Context context = (Context) this.f4190a;
        if (context.isRestricted()) {
            return null;
        }
        return B.q.b(context, resourceId, typedValue, i2, c0221s, true, false);
    }

    public O g(k1.c cVar, String str) {
        boolean isInstance;
        O b2;
        k1.e.e(str, "key");
        Q q2 = (Q) this.f4190a;
        q2.getClass();
        LinkedHashMap linkedHashMap = q2.f1871a;
        O o2 = (O) linkedHashMap.get(str);
        Class cls = cVar.f3240a;
        k1.e.e(cls, "jClass");
        Map map = k1.c.f3238b;
        k1.e.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = k1.k.b(num.intValue(), o2);
        } else {
            if (cls.isPrimitive()) {
                cls = b1.g.q(k1.i.a(cls));
            }
            isInstance = cls.isInstance(o2);
        }
        P p2 = (P) this.f4191b;
        if (isInstance) {
            if (p2 instanceof N) {
                k1.e.b(o2);
            }
            k1.e.c(o2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return o2;
        }
        b0.c cVar2 = new b0.c((b0.b) this.f4192c);
        cVar2.f2040a.put(C0087b.f2059a, str);
        try {
            try {
                p2.getClass();
                b2 = p2.a(b1.g.p(cVar), cVar2);
            } catch (AbstractMethodError unused) {
                b2 = p2.b(b1.g.p(cVar));
            }
        } catch (AbstractMethodError unused2) {
            b2 = p2.a(b1.g.p(cVar), cVar2);
        }
        k1.e.e(b2, "viewModel");
        O o3 = (O) linkedHashMap.put(str, b2);
        if (o3 != null) {
            o3.a();
        }
        return b2;
    }

    public boolean h(CharSequence charSequence, int i, int i2, U.x xVar) {
        if ((xVar.f1124c & 3) == 0) {
            U.d dVar = (U.d) this.f4192c;
            V.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f568a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = U.d.f1079b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f1080a;
            String sb2 = sb.toString();
            int i3 = C.f.f71a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = xVar.f1124c & 4;
            xVar.f1124c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f1124c & 3) == 2;
    }

    public boolean i(int i, s.d dVar, v.f fVar) {
        int[] iArr = dVar.f3921p0;
        int i2 = iArr[0];
        C0344b c0344b = (C0344b) this.f4191b;
        c0344b.f4074a = i2;
        c0344b.f4075b = iArr[1];
        c0344b.f4076c = dVar.q();
        c0344b.d = dVar.k();
        c0344b.i = false;
        c0344b.f4080j = i;
        boolean z2 = c0344b.f4074a == 3;
        boolean z3 = c0344b.f4075b == 3;
        boolean z4 = z2 && dVar.f3890W > RecyclerView.f1937A0;
        boolean z5 = z3 && dVar.f3890W > RecyclerView.f1937A0;
        int[] iArr2 = dVar.f3925t;
        if (z4 && iArr2[0] == 4) {
            c0344b.f4074a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0344b.f4075b = 1;
        }
        fVar.b(dVar, c0344b);
        dVar.O(c0344b.f4077e);
        dVar.L(c0344b.f4078f);
        dVar.f3873E = c0344b.h;
        dVar.I(c0344b.f4079g);
        c0344b.f4080j = 0;
        return c0344b.i;
    }

    public Object k(CharSequence charSequence, int i, int i2, int i3, boolean z2, U.p pVar) {
        int i4;
        char c2;
        U.r rVar = new U.r((U.u) ((T0.m) this.f4191b).f1075c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = rVar.f1107c.f1116a;
                U.u uVar = sparseArray == null ? null : (U.u) sparseArray.get(codePointAt);
                if (rVar.f1105a == 2) {
                    if (uVar != null) {
                        rVar.f1107c = uVar;
                        rVar.f1109f++;
                    } else {
                        if (codePointAt == 65038) {
                            rVar.a();
                        } else if (codePointAt != 65039) {
                            U.u uVar2 = rVar.f1107c;
                            if (uVar2.f1117b != null) {
                                if (rVar.f1109f != 1) {
                                    rVar.d = uVar2;
                                    rVar.a();
                                } else if (rVar.b()) {
                                    rVar.d = rVar.f1107c;
                                    rVar.a();
                                } else {
                                    rVar.a();
                                }
                                c2 = 3;
                            } else {
                                rVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (uVar == null) {
                    rVar.a();
                    c2 = 1;
                } else {
                    rVar.f1105a = 2;
                    rVar.f1107c = uVar;
                    rVar.f1109f = 1;
                    c2 = 2;
                }
                rVar.f1108e = codePointAt;
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
                    if (z2 || !h(charSequence, i4, i6, rVar.d.f1117b)) {
                        z3 = pVar.b(charSequence, i4, i6, rVar.d.f1117b);
                        i5++;
                    }
                }
            }
        }
        if (rVar.f1105a == 2 && rVar.f1107c.f1117b != null && ((rVar.f1109f > 1 || rVar.b()) && i5 < i3 && z3 && (z2 || !h(charSequence, i4, i6, rVar.f1107c.f1117b)))) {
            pVar.b(charSequence, i4, i6, rVar.f1107c.f1117b);
        }
        return pVar.a();
    }

    public void l() {
        ((TypedArray) this.f4191b).recycle();
    }

    public void m(s.e eVar, int i, int i2, int i3) {
        int i4 = eVar.f3897b0;
        int i5 = eVar.f3899c0;
        eVar.f3897b0 = 0;
        eVar.f3899c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f3897b0 = 0;
        } else {
            eVar.f3897b0 = i4;
        }
        if (i5 < 0) {
            eVar.f3899c0 = 0;
        } else {
            eVar.f3899c0 = i5;
        }
        s.e eVar2 = (s.e) this.f4192c;
        eVar2.f3945t0 = i;
        eVar2.U();
    }

    public void n(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f4190a;
        arrayList.clear();
        int size = eVar.f3943q0.size();
        for (int i = 0; i < size; i++) {
            s.d dVar = (s.d) eVar.f3943q0.get(i);
            int[] iArr = dVar.f3921p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.s0.f4084b = true;
    }

    public C0372k(Runnable runnable) {
        this.f4191b = new CopyOnWriteArrayList();
        this.f4192c = new HashMap();
        this.f4190a = runnable;
    }

    public C0372k(Context context, TypedArray typedArray) {
        this.f4190a = context;
        this.f4191b = typedArray;
    }
}
