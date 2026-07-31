package a0;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import m0.t2;
import w1.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g1 implements s3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83a;

    /* renamed from: b, reason: collision with root package name */
    public Object f84b;

    /* renamed from: c, reason: collision with root package name */
    public Object f85c;

    /* renamed from: d, reason: collision with root package name */
    public Object f86d;

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, int i) {
        this.f83a = i;
        this.f84b = obj;
        this.f85c = obj2;
        this.f86d = obj3;
    }

    public static g1 E(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new g1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static boolean i(Editable editable, KeyEvent keyEvent, boolean z3) {
        d4.b0[] b0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (b0VarArr = (d4.b0[]) editable.getSpans(selectionStart, selectionEnd, d4.b0.class)) != null && b0VarArr.length > 0) {
                for (d4.b0 b0Var : b0VarArr) {
                    int spanStart = editable.getSpanStart(b0Var);
                    int spanEnd = editable.getSpanEnd(b0Var);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean A() {
        return !(((t1) ((q3.k) this.f84b).f6119e).isEmpty() && ((t1) ((q3.k) this.f86d).f6119e).isEmpty() && ((t1) ((q3.k) this.f85c).f6119e).isEmpty());
    }

    public boolean B() {
        if (((t2) this.f84b).getValue() != this.f85c) {
            return true;
        }
        g1 g1Var = (g1) this.f86d;
        return g1Var != null && g1Var.B();
    }

    public boolean C(int i, b3.f fVar, y2.d dVar) {
        z2.b bVar = (z2.b) this.f85c;
        int[] iArr = dVar.f8777p0;
        int[] iArr2 = dVar.f8781t;
        bVar.f9118a = iArr[0];
        bVar.f9119b = iArr[1];
        bVar.f9120c = dVar.q();
        bVar.f9121d = dVar.k();
        bVar.i = false;
        bVar.f9126j = i;
        boolean z3 = bVar.f9118a == 3;
        boolean z7 = bVar.f9119b == 3;
        boolean z8 = z3 && dVar.W > 0.0f;
        boolean z9 = z7 && dVar.W > 0.0f;
        if (z8 && iArr2[0] == 4) {
            bVar.f9118a = 1;
        }
        if (z9 && iArr2[1] == 4) {
            bVar.f9119b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f9122e);
        dVar.L(bVar.f9123f);
        dVar.E = bVar.f9125h;
        dVar.I(bVar.f9124g);
        bVar.f9126j = 0;
        return bVar.i;
    }

    public g1 D() {
        CharSequence charSequence = (CharSequence) this.f85c;
        Matcher matcher = (Matcher) this.f84b;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        q6.i.d(matcher2, "matcher(...)");
        if (matcher2.find(end)) {
            return new g1(matcher2, charSequence);
        }
        return null;
    }

    public Object F(CharSequence charSequence, int i, int i8, int i9, boolean z3, d4.s sVar) {
        int i10;
        char c8;
        d4.u uVar = new d4.u((d4.x) ((c5.x) this.f85c).f1739f);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i11 = 0;
        boolean z7 = true;
        int i12 = i;
        loop0: while (true) {
            i10 = i12;
            while (i12 < i8 && i11 < i9 && z7) {
                SparseArray sparseArray = uVar.f2287c.f2303a;
                d4.x xVar = sparseArray == null ? null : (d4.x) sparseArray.get(codePointAt);
                if (uVar.f2285a == 2) {
                    if (xVar != null) {
                        uVar.f2287c = xVar;
                        uVar.f2290f++;
                    } else {
                        if (codePointAt == 65038) {
                            uVar.a();
                        } else if (codePointAt != 65039) {
                            d4.x xVar2 = uVar.f2287c;
                            if (xVar2.f2304b != null) {
                                if (uVar.f2290f != 1) {
                                    uVar.f2288d = xVar2;
                                    uVar.a();
                                } else if (uVar.b()) {
                                    uVar.f2288d = uVar.f2287c;
                                    uVar.a();
                                } else {
                                    uVar.a();
                                }
                                c8 = 3;
                            } else {
                                uVar.a();
                            }
                        }
                        c8 = 1;
                    }
                    c8 = 2;
                } else if (xVar == null) {
                    uVar.a();
                    c8 = 1;
                } else {
                    uVar.f2285a = 2;
                    uVar.f2287c = xVar;
                    uVar.f2290f = 1;
                    c8 = 2;
                }
                uVar.f2289e = codePointAt;
                if (c8 == 1) {
                    i12 = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (i12 < i8) {
                        codePointAt = Character.codePointAt(charSequence, i12);
                    }
                } else if (c8 == 2) {
                    int charCount = Character.charCount(codePointAt) + i12;
                    if (charCount < i8) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i12 = charCount;
                } else if (c8 == 3) {
                    if (z3 || !x(charSequence, i10, i12, uVar.f2288d.f2304b)) {
                        z7 = sVar.f(charSequence, i10, i12, uVar.f2288d.f2304b);
                        i11++;
                    }
                }
            }
        }
        if (uVar.f2285a == 2 && uVar.f2287c.f2304b != null && ((uVar.f2290f > 1 || uVar.b()) && i11 < i9 && z7 && (z3 || !x(charSequence, i10, i12, uVar.f2287c.f2304b)))) {
            sVar.f(charSequence, i10, i12, uVar.f2287c.f2304b);
        }
        return sVar.a();
    }

    public void G() {
        ((TypedArray) this.f85c).recycle();
    }

    public void H(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w4.a aVar = (w4.a) arrayList.get(i);
            aVar.getClass();
            ((p3.b) this.f84b).c(aVar);
        }
        arrayList.clear();
    }

    public void I(Object obj) {
        long b8 = u0.h.b();
        if (b8 == u0.k.f7167a) {
            this.f86d = obj;
            return;
        }
        synchronized (this.f85c) {
            u0.j jVar = (u0.j) ((AtomicReference) this.f84b).get();
            int a8 = jVar.a(b8);
            if (a8 < 0) {
                ((AtomicReference) this.f84b).set(jVar.b(b8, obj));
            } else {
                jVar.f7166c[a8] = obj;
            }
        }
    }

    public void J(f1.q qVar) {
        ((h1.b) this.f86d).f3074d.f3072c = qVar;
    }

    public void K(r2.c cVar) {
        ((h1.b) this.f86d).f3074d.f3070a = cVar;
    }

    public void L(r2.l lVar) {
        ((h1.b) this.f86d).f3074d.f3071b = lVar;
    }

    public void M(long j7) {
        ((h1.b) this.f86d).f3074d.f3073d = j7;
    }

    public void N(y2.e eVar, int i, int i8, int i9) {
        eVar.getClass();
        int i10 = eVar.f8750b0;
        int i11 = eVar.f8752c0;
        eVar.f8750b0 = 0;
        eVar.f8752c0 = 0;
        eVar.O(i8);
        eVar.L(i9);
        if (i10 < 0) {
            eVar.f8750b0 = 0;
        } else {
            eVar.f8750b0 = i10;
        }
        if (i11 < 0) {
            eVar.f8752c0 = 0;
        } else {
            eVar.f8752c0 = i11;
        }
        y2.e eVar2 = (y2.e) this.f86d;
        eVar2.f8791t0 = i;
        eVar2.U();
    }

    public void O(View view) {
        if (((ArrayList) this.f86d).remove(view)) {
            RecyclerView.s(view);
        }
    }

    public void P() {
        o.j0 j0Var = (o.j0) this.f84b;
        String str = (String) this.f85c;
        List list = (List) j0Var.k(str);
        if (list != null) {
            list.remove((p6.a) this.f86d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        j0Var.m(str, list);
    }

    public void Q(y2.e eVar) {
        ArrayList arrayList = (ArrayList) this.f84b;
        arrayList.clear();
        int size = eVar.f8788q0.size();
        for (int i = 0; i < size; i++) {
            y2.d dVar = (y2.d) eVar.f8788q0.get(i);
            int[] iArr = dVar.f8777p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f8790s0.f9130b = true;
    }

    @Override // s3.g
    public ClipDescription a() {
        return (ClipDescription) this.f85c;
    }

    @Override // s3.g
    public Object b() {
        return null;
    }

    @Override // s3.g
    public Uri c() {
        return (Uri) this.f84b;
    }

    @Override // s3.g
    public Uri e() {
        return (Uri) this.f86d;
    }

    public void f(w1.f0 f0Var, w1.s sVar) {
        q3.k kVar = (q3.k) this.f84b;
        q3.k kVar2 = (q3.k) this.f85c;
        q3.k kVar3 = (q3.k) this.f86d;
        int ordinal = sVar.ordinal();
        if (ordinal == 0) {
            kVar.d(f0Var);
            kVar3.d(f0Var);
            return;
        }
        if (ordinal == 1) {
            kVar2.d(f0Var);
            kVar3.d(f0Var);
            return;
        }
        if (ordinal == 2) {
            if (f0Var.f7644j != null) {
                kVar3.d(f0Var);
                return;
            } else {
                kVar.d(f0Var);
                return;
            }
        }
        if (ordinal != 3) {
            throw new a5.c();
        }
        if (f0Var.f7644j != null) {
            kVar3.d(f0Var);
        } else {
            kVar2.d(f0Var);
        }
    }

    public void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z3) {
        RecyclerView recyclerView = ((w4.w) this.f84b).f8055a;
        int childCount = i < 0 ? recyclerView.getChildCount() : s(i);
        ((u.i1) this.f85c).f(childCount, z3);
        if (z3) {
            z(view);
        }
        RecyclerView.s(view);
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public boolean h(w1.f0 f0Var) {
        return !(f0Var.f7644j == null) && (((t1) ((q3.k) this.f84b).f6119e).contains(f0Var) || ((t1) ((q3.k) this.f85c).f6119e).contains(f0Var));
    }

    public void j(int i) {
        int s5 = s(i);
        ((u.i1) this.f85c).h(s5);
        RecyclerView recyclerView = ((w4.w) this.f84b).f8055a;
        View childAt = recyclerView.getChildAt(s5);
        if (childAt != null) {
            RecyclerView.s(childAt);
        }
        recyclerView.detachViewFromParent(s5);
    }

    public int k(int i, int i8) {
        ArrayList arrayList = (ArrayList) this.f86d;
        int size = arrayList.size();
        while (i8 < size) {
            ((w4.a) arrayList.get(i8)).getClass();
            i8++;
        }
        return i;
    }

    public Object l() {
        long b8 = u0.h.b();
        if (b8 == u0.k.f7167a) {
            return this.f86d;
        }
        u0.j jVar = (u0.j) ((AtomicReference) this.f84b).get();
        int a8 = jVar.a(b8);
        if (a8 >= 0) {
            return jVar.f7166c[a8];
        }
        return null;
    }

    public f1.q m() {
        return ((h1.b) this.f86d).f3074d.f3072c;
    }

    public View n(int i) {
        return ((w4.w) this.f84b).f8055a.getChildAt(s(i));
    }

    public int o() {
        return ((w4.w) this.f84b).f8055a.getChildCount() - ((ArrayList) this.f86d).size();
    }

    public ColorStateList p(int i) {
        int resourceId;
        ColorStateList q4;
        TypedArray typedArray = (TypedArray) this.f85c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q4 = s6.a.q((Context) this.f84b, resourceId)) == null) ? typedArray.getColorStateList(i) : q4;
    }

    public Drawable q(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f85c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : h0.a.D((Context) this.f84b, resourceId);
    }

    public Typeface r(int i, int i8, l.b0 b0Var) {
        int resourceId = ((TypedArray) this.f85c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f86d) == null) {
            this.f86d = new TypedValue();
        }
        Context context = (Context) this.f84b;
        TypedValue typedValue = (TypedValue) this.f86d;
        ThreadLocal threadLocal = h3.k.f3150a;
        if (context.isRestricted()) {
            return null;
        }
        return h3.k.a(context, resourceId, typedValue, i8, b0Var, true, false);
    }

    public int s(int i) {
        u.i1 i1Var = (u.i1) this.f85c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((w4.w) this.f84b).f8055a.getChildCount();
        int i8 = i;
        while (i8 < childCount) {
            int c8 = i - (i8 - i1Var.c(i8));
            if (c8 == 0) {
                while (i1Var.e(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += c8;
        }
        return -1;
    }

    public v6.d t() {
        Matcher matcher = (Matcher) this.f84b;
        return r2.o.u0(matcher.start(), matcher.end());
    }

    public String toString() {
        switch (this.f83a) {
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                String str = (String) this.f86d;
                String str2 = (String) this.f85c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f84b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                q6.i.d(sb2, "toString(...)");
                return sb2;
            case x.v0.f8308f /* 15 */:
                return ((u.i1) this.f85c).toString() + ", hidden list:" + ((ArrayList) this.f86d).size();
            default:
                return super.toString();
        }
    }

    public long u() {
        return ((h1.b) this.f86d).f3074d.f3073d;
    }

    public View v(int i) {
        return ((w4.w) this.f84b).f8055a.getChildAt(i);
    }

    public int w() {
        return ((w4.w) this.f84b).f8055a.getChildCount();
    }

    public boolean x(CharSequence charSequence, int i, int i8, d4.a0 a0Var) {
        if ((a0Var.f2249c & 3) == 0) {
            d4.h hVar = (d4.h) this.f86d;
            e4.a b8 = a0Var.b();
            int a8 = b8.a(8);
            if (a8 != 0) {
                ((ByteBuffer) b8.f2491g).getShort(a8 + b8.f2488d);
            }
            d4.e eVar = (d4.e) hVar;
            eVar.getClass();
            ThreadLocal threadLocal = d4.e.f2257b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i8) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = eVar.f2258a;
            String sb2 = sb.toString();
            int i9 = i3.d.f3425a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i10 = a0Var.f2249c & 4;
            a0Var.f2249c = hasGlyph ? i10 | 2 : i10 | 1;
        }
        return (a0Var.f2249c & 3) == 2;
    }

    public boolean y() {
        return ((ArrayList) this.f85c).size() > 0;
    }

    public void z(View view) {
        ((ArrayList) this.f86d).add(view);
        RecyclerView.s(view);
    }

    public g1(w4.w wVar) {
        this.f83a = 15;
        this.f84b = wVar;
        this.f85c = new u.i1();
        this.f86d = new ArrayList();
    }

    public g1(h1.b bVar) {
        this.f83a = 2;
        this.f86d = bVar;
        this.f84b = new b1.b(10, this);
    }

    public g1(Context context, TypedArray typedArray) {
        this.f83a = 4;
        this.f84b = context;
        this.f85c = typedArray;
    }

    public g1(y2.e eVar) {
        this.f83a = 17;
        this.f84b = new ArrayList();
        this.f85c = new z2.b();
        this.f86d = eVar;
    }

    public g1(p.b bVar) {
        this.f83a = 14;
        this.f84b = new p3.b(30);
        this.f85c = new ArrayList();
        this.f86d = new ArrayList();
        new p.b(10, this);
    }

    public g1(c5.x xVar, w5.f fVar, d4.e eVar, Set set) {
        this.f83a = 1;
        this.f84b = fVar;
        this.f85c = xVar;
        this.f86d = eVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            F(str, 0, str.length(), 1, true, new d4.t(str, 0));
        }
    }

    public g1(j2.r rVar, g1 g1Var) {
        this.f83a = 6;
        this.f84b = rVar;
        this.f86d = g1Var;
        this.f85c = rVar.f4008d;
    }

    public g1(int i) {
        this.f83a = i;
        switch (i) {
            case 5:
                this.f86d = new w5.f(28);
                break;
            case 6:
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
            case x.v0.f8304b /* 9 */:
            case 11:
            default:
                long[] jArr = o.r0.f5528a;
                this.f84b = new o.j0();
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f84b = new WeakHashMap();
                this.f85c = new WeakHashMap();
                this.f86d = new WeakHashMap();
                break;
            case x.v0.f8306d /* 10 */:
                this.f84b = new AtomicReference(u0.h.f7153b);
                this.f85c = new Object();
                break;
            case 12:
                this.f84b = new q3.k(13);
                this.f85c = new q3.k(13);
                this.f86d = new q3.k(13);
                break;
            case 13:
                break;
        }
    }

    @Override // s3.g
    public void d() {
    }

    public g1(Matcher matcher, CharSequence charSequence) {
        this.f83a = 16;
        q6.i.e(charSequence, "input");
        this.f84b = matcher;
        this.f85c = charSequence;
        this.f86d = new r0.i(1, this);
    }
}
