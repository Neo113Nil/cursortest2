package androidx.emoji2.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.q0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t {
    public static t d;

    /* renamed from: a, reason: collision with root package name */
    public Object f472a;

    /* renamed from: b, reason: collision with root package name */
    public Object f473b;

    /* renamed from: c, reason: collision with root package name */
    public Object f474c;

    public t(o0 o0Var, n0 n0Var, b1.b bVar) {
        i3.d.e(o0Var, "store");
        i3.d.e(bVar, "defaultCreationExtras");
        this.f472a = o0Var;
        this.f473b = n0Var;
        this.f474c = bVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z4) {
        a0[] a0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (a0VarArr = (a0[]) editable.getSpans(selectionStart, selectionEnd, a0.class)) != null && a0VarArr.length > 0) {
                for (a0 a0Var : a0VarArr) {
                    int spanStart = editable.getSpanStart(a0Var);
                    int spanEnd = editable.getSpanEnd(a0Var);
                    if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static t i(int i, int i4, Context context, AttributeSet attributeSet, int[] iArr) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i, i4));
    }

    public l0 b(String str, Class cls) {
        l0 b2;
        n0 n0Var = (n0) this.f473b;
        i3.d.e(str, "key");
        o0 o0Var = (o0) this.f472a;
        o0Var.getClass();
        LinkedHashMap linkedHashMap = o0Var.f729a;
        l0 l0Var = (l0) linkedHashMap.get(str);
        if (cls.isInstance(l0Var)) {
            if (n0Var instanceof k0) {
            }
            i3.d.c(l0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return l0Var;
        }
        b1.c cVar = new b1.c((b1.b) this.f474c);
        ((LinkedHashMap) cVar.f825a).put(m0.f727b, str);
        try {
            b2 = n0Var.m(cls, cVar);
        } catch (AbstractMethodError unused) {
            b2 = n0Var.b(cls);
        }
        i3.d.e(b2, "viewModel");
        l0 l0Var2 = (l0) linkedHashMap.put(str, b2);
        if (l0Var2 != null) {
            l0Var2.b();
        }
        return b2;
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList a5;
        TypedArray typedArray = (TypedArray) this.f473b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a5 = c0.c.a((Context) this.f472a, resourceId)) == null) ? typedArray.getColorStateList(i) : a5;
    }

    public Drawable d(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f473b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : b4.d.y((Context) this.f472a, resourceId);
    }

    public Drawable e(int i) {
        int resourceId;
        Drawable d5;
        if (!((TypedArray) this.f473b).hasValue(i) || (resourceId = ((TypedArray) this.f473b).getResourceId(i, 0)) == 0) {
            return null;
        }
        l.r a5 = l.r.a();
        Context context = (Context) this.f472a;
        synchronized (a5) {
            d5 = a5.f2550a.d(context, resourceId, true);
        }
        return d5;
    }

    public Typeface f(int i, int i4, q0 q0Var) {
        int resourceId = ((TypedArray) this.f473b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f474c) == null) {
            this.f474c = new TypedValue();
        }
        Context context = (Context) this.f472a;
        TypedValue typedValue = (TypedValue) this.f474c;
        ThreadLocal threadLocal = e0.m.f1339a;
        if (context.isRestricted()) {
            return null;
        }
        return e0.m.a(context, resourceId, typedValue, i4, q0Var, true, false);
    }

    public boolean g(CharSequence charSequence, int i, int i4, z zVar) {
        if ((zVar.f489c & 3) == 0) {
            h hVar = (h) this.f474c;
            w0.a b2 = zVar.b();
            int a5 = b2.a(8);
            if (a5 != 0) {
                ((ByteBuffer) b2.d).getShort(a5 + b2.f2771a);
            }
            d dVar = (d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = d.f442b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i4) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = dVar.f443a.hasGlyph(sb.toString());
            int i5 = zVar.f489c & 4;
            zVar.f489c = hasGlyph ? i5 | 2 : i5 | 1;
        }
        return (zVar.f489c & 3) == 2;
    }

    public boolean h(int i, v.d dVar, y.f fVar) {
        w.b bVar = (w.b) this.f473b;
        int[] iArr = dVar.f3637p0;
        int[] iArr2 = dVar.f3641t;
        bVar.f3735a = iArr[0];
        bVar.f3736b = iArr[1];
        bVar.f3737c = dVar.q();
        bVar.d = dVar.k();
        bVar.i = false;
        bVar.f3741j = i;
        boolean z4 = bVar.f3735a == 3;
        boolean z5 = bVar.f3736b == 3;
        boolean z6 = z4 && dVar.W > 0.0f;
        boolean z7 = z5 && dVar.W > 0.0f;
        if (z6 && iArr2[0] == 4) {
            bVar.f3735a = 1;
        }
        if (z7 && iArr2[1] == 4) {
            bVar.f3736b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f3738e);
        dVar.L(bVar.f3739f);
        dVar.E = bVar.h;
        dVar.I(bVar.f3740g);
        bVar.f3741j = 0;
        return bVar.i;
    }

    public Object j(CharSequence charSequence, int i, int i4, int i5, boolean z4, r rVar) {
        int i6;
        char c5;
        s sVar = new s((w) ((a0.k) this.f473b).h);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i7 = 0;
        boolean z5 = true;
        int i8 = i;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z5) {
                SparseArray sparseArray = sVar.f469c.f481a;
                w wVar = sparseArray == null ? null : (w) sparseArray.get(codePointAt);
                if (sVar.f467a == 2) {
                    if (wVar != null) {
                        sVar.f469c = wVar;
                        sVar.f471f++;
                    } else {
                        if (codePointAt == 65038) {
                            sVar.a();
                        } else if (codePointAt != 65039) {
                            w wVar2 = sVar.f469c;
                            if (wVar2.f482b != null) {
                                if (sVar.f471f != 1) {
                                    sVar.d = wVar2;
                                    sVar.a();
                                } else if (sVar.b()) {
                                    sVar.d = sVar.f469c;
                                    sVar.a();
                                } else {
                                    sVar.a();
                                }
                                c5 = 3;
                            } else {
                                sVar.a();
                            }
                        }
                        c5 = 1;
                    }
                    c5 = 2;
                } else if (wVar == null) {
                    sVar.a();
                    c5 = 1;
                } else {
                    sVar.f467a = 2;
                    sVar.f469c = wVar;
                    sVar.f471f = 1;
                    c5 = 2;
                }
                sVar.f470e = codePointAt;
                if (c5 == 1) {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (c5 == 2) {
                    int charCount = Character.charCount(codePointAt) + i8;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i8 = charCount;
                } else if (c5 == 3) {
                    if (z4 || !g(charSequence, i6, i8, sVar.d.f482b)) {
                        z5 = rVar.k(charSequence, i6, i8, sVar.d.f482b);
                        i7++;
                    }
                }
            }
        }
        if (sVar.f467a == 2 && sVar.f469c.f482b != null && ((sVar.f471f > 1 || sVar.b()) && i7 < i5 && z5 && (z4 || !g(charSequence, i6, i8, sVar.f469c.f482b)))) {
            rVar.k(charSequence, i6, i8, sVar.f469c.f482b);
        }
        return rVar.d();
    }

    public void k() {
        ((TypedArray) this.f473b).recycle();
    }

    public void l(v.e eVar, int i, int i4, int i5) {
        eVar.getClass();
        int i6 = eVar.f3614b0;
        int i7 = eVar.f3616c0;
        eVar.f3614b0 = 0;
        eVar.f3616c0 = 0;
        eVar.O(i4);
        eVar.L(i5);
        if (i6 < 0) {
            eVar.f3614b0 = 0;
        } else {
            eVar.f3614b0 = i6;
        }
        if (i7 < 0) {
            eVar.f3616c0 = 0;
        } else {
            eVar.f3616c0 = i7;
        }
        v.e eVar2 = (v.e) this.f474c;
        eVar2.f3651t0 = i;
        eVar2.U();
    }

    public void m(v.e eVar) {
        ArrayList arrayList = (ArrayList) this.f472a;
        arrayList.clear();
        int size = eVar.f3648q0.size();
        for (int i = 0; i < size; i++) {
            v.d dVar = (v.d) eVar.f3648q0.get(i);
            int[] iArr = dVar.f3637p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3650s0.f3745b = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(o0 o0Var, n0 n0Var) {
        this(o0Var, n0Var, b1.a.f824b);
        i3.d.e(o0Var, "store");
    }

    public t(Context context, TypedArray typedArray) {
        this.f472a = context;
        this.f473b = typedArray;
    }

    public t(Runnable runnable) {
        this.f473b = new CopyOnWriteArrayList();
        this.f474c = new HashMap();
        this.f472a = runnable;
    }
}
