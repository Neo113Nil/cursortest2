package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m0.i2;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 implements u1.y0, d4.s, n0.k0, q3.p, v0.i, x1.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12f;

    public /* synthetic */ a0(int i, Object obj) {
        this.f10d = i;
        this.f12f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void l(w1.f0 f0Var) {
        if (f0Var.N > 0) {
            if (f0Var.G.f7689d == w1.b0.f7594h && !f0Var.o() && !f0Var.p() && !f0Var.O && f0Var.H()) {
                y0.l lVar = f0Var.F.f7600f;
                if ((lVar.f8709g & 256) != 0) {
                    while (lVar != null) {
                        if ((lVar.f8708f & 256) != 0) {
                            w1.l lVar2 = lVar;
                            ?? r52 = 0;
                            while (lVar2 != 0) {
                                if (lVar2 instanceof w1.n) {
                                    w1.n nVar = (w1.n) lVar2;
                                    nVar.k(w1.f.s(nVar, 256));
                                } else if ((lVar2.f8708f & 256) != 0 && (lVar2 instanceof w1.l)) {
                                    y0.l lVar3 = lVar2.f7707s;
                                    int i = 0;
                                    lVar2 = lVar2;
                                    r52 = r52;
                                    while (lVar3 != null) {
                                        if ((lVar3.f8708f & 256) != 0) {
                                            i++;
                                            r52 = r52;
                                            if (i == 1) {
                                                lVar2 = lVar3;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar2 != 0) {
                                                    r52.b(lVar2);
                                                    lVar2 = 0;
                                                }
                                                r52.b(lVar3);
                                            }
                                        }
                                        lVar3 = lVar3.i;
                                        lVar2 = lVar2;
                                        r52 = r52;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVar2 = w1.f.f(r52);
                            }
                        }
                        if ((lVar.f8709g & 256) == 0) {
                            break;
                        } else {
                            lVar = lVar.i;
                        }
                    }
                }
            }
            f0Var.M = false;
            o0.e x7 = f0Var.x();
            Object[] objArr = x7.f5578d;
            int i8 = x7.f5580f;
            for (int i9 = 0; i9 < i8; i9++) {
                l((w1.f0) objArr[i9]);
            }
        }
    }

    @Override // d4.s
    public Object a() {
        return (d4.d0) this.f11e;
    }

    @Override // x1.u0
    public void b(View view, float[] fArr) {
        f1.p.o(fArr);
        v(view, fArr);
    }

    @Override // v0.i
    public Object c(v0.b bVar, Object obj) {
        return ((p6.e) this.f11e).g(bVar, obj);
    }

    @Override // v0.i
    public Object d(Object obj) {
        return ((p6.c) this.f12f).i(obj);
    }

    @Override // n0.k0
    public List e(Integer num) {
        List e8 = ((n0.k0) this.f11e).e(null);
        i2 i2Var = (i2) this.f12f;
        int i = i2Var.f4972v;
        return i < 0 ? e8 : d6.m.b0(r2.r.j(i2Var, num, i, Integer.valueOf(i2Var.D(i2Var.f4953b, i))), e8);
    }

    @Override // d4.s
    public boolean f(CharSequence charSequence, int i, int i8, d4.a0 a0Var) {
        if ((a0Var.f2249c & 4) > 0) {
            return true;
        }
        if (((d4.d0) this.f11e) == null) {
            this.f11e = new d4.d0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((w5.f) this.f12f).getClass();
        ((d4.d0) this.f11e).setSpan(new d4.b0(a0Var), i, i8, 33);
        return true;
    }

    @Override // u1.y0
    public void g(o.w0 w0Var) {
        o.d0 d0Var = (o.d0) this.f12f;
        d0Var.a();
        o.f0 f0Var = (o.f0) w0Var.f5562e;
        Object[] objArr = f0Var.f5448b;
        long[] jArr = f0Var.f5449c;
        int i = f0Var.f5451e;
        while (i != Integer.MAX_VALUE) {
            int i8 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object b8 = ((x) this.f11e).b(obj);
            int d8 = d0Var.d(b8);
            int i9 = d8 >= 0 ? d0Var.f5436c[d8] : 0;
            if (i9 == 7) {
                w0Var.remove(obj);
            } else {
                d0Var.h(i9 + 1, b8);
            }
            i = i8;
        }
    }

    @Override // u1.y0
    public boolean h(Object obj, Object obj2) {
        x xVar = (x) this.f11e;
        return q6.i.a(xVar.b(obj), xVar.b(obj2));
    }

    public boolean i(long j7) {
        Object obj;
        List list = (List) ((a0) this.f12f).f11e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (m.a.s(((q1.m) obj).f6011a, j7)) {
                break;
            }
            i++;
        }
        q1.m mVar = (q1.m) obj;
        if (mVar != null) {
            return mVar.f6018h;
        }
        return false;
    }

    public void j() {
        int[] iArr = (int[]) this.f11e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f12f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    @Override // q3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q3.l1 k(View view, q3.l1 l1Var) {
        boolean z3;
        boolean z7;
        boolean z8;
        k5.c cVar = (k5.c) this.f11e;
        r5.m mVar = (r5.m) this.f12f;
        int i = mVar.f6680a;
        int i8 = mVar.f6681b;
        int i9 = mVar.f6682c;
        q3.i1 i1Var = l1Var.f6127a;
        i3.c f6 = i1Var.f(519);
        i3.c f8 = i1Var.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.f4186b;
        int i10 = f6.f3422b;
        int i11 = f6.f3423c;
        int i12 = f6.f3421a;
        bottomSheetBehavior.f1867w = i10;
        boolean z9 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z10 = bottomSheetBehavior.f1859o;
        if (z10) {
            int i13 = i1Var.k().f3424d;
            bottomSheetBehavior.f1866v = i13;
            paddingBottom = i9 + i13;
        }
        int i14 = paddingBottom;
        if (bottomSheetBehavior.f1860p) {
            paddingLeft = (z9 ? i8 : i) + i12;
        }
        int i15 = paddingLeft;
        if (bottomSheetBehavior.f1861q) {
            if (!z9) {
                i = i8;
            }
            paddingRight = i + i11;
        }
        int i16 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f1863s || marginLayoutParams.leftMargin == i12) {
            z3 = false;
        } else {
            marginLayoutParams.leftMargin = i12;
            z3 = true;
        }
        if (bottomSheetBehavior.f1864t && marginLayoutParams.rightMargin != i11) {
            marginLayoutParams.rightMargin = i11;
            z3 = true;
        }
        if (bottomSheetBehavior.f1865u) {
            int i17 = marginLayoutParams.topMargin;
            int i18 = f6.f3422b;
            if (i17 != i18) {
                marginLayoutParams.topMargin = i18;
                z7 = true;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(i15, view.getPaddingTop(), i16, i14);
                z8 = cVar.f4185a;
                if (z8) {
                    bottomSheetBehavior.f1857m = f8.f3424d;
                }
                if (z10 && !z8) {
                    return l1Var;
                }
                bottomSheetBehavior.I();
                return l1Var;
            }
        }
        z7 = z3;
        if (z7) {
        }
        view.setPadding(i15, view.getPaddingTop(), i16, i14);
        z8 = cVar.f4185a;
        if (z8) {
        }
        if (z10) {
        }
        bottomSheetBehavior.I();
        return l1Var;
    }

    public void m(int i) {
        int[] iArr = (int[]) this.f11e;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f11e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f11e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f11e;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View n(int i, int i8, int i9, int i10) {
        int x7;
        int i11;
        int y7;
        View p7;
        int left;
        int i12;
        int right;
        int i13;
        w4.v0 v0Var = (w4.v0) this.f12f;
        w4.c0 c0Var = (w4.c0) this.f11e;
        switch (c0Var.f7891a) {
            case 0:
                x7 = c0Var.f7892b.x();
                break;
            default:
                x7 = c0Var.f7892b.z();
                break;
        }
        switch (c0Var.f7891a) {
            case 0:
                w4.d0 d0Var = c0Var.f7892b;
                i11 = d0Var.i;
                y7 = d0Var.y();
                break;
            default:
                w4.d0 d0Var2 = c0Var.f7892b;
                i11 = d0Var2.f7907j;
                y7 = d0Var2.w();
                break;
        }
        int i14 = i11 - y7;
        int i15 = i8 > i ? 1 : -1;
        View view = null;
        while (i != i8) {
            switch (c0Var.f7891a) {
                case 0:
                    p7 = c0Var.f7892b.p(i);
                    break;
                default:
                    p7 = c0Var.f7892b.p(i);
                    break;
            }
            switch (c0Var.f7891a) {
                case 0:
                    w4.e0 e0Var = (w4.e0) p7.getLayoutParams();
                    left = p7.getLeft() - ((w4.e0) p7.getLayoutParams()).f7908a.left;
                    i12 = ((ViewGroup.MarginLayoutParams) e0Var).leftMargin;
                    break;
                default:
                    w4.e0 e0Var2 = (w4.e0) p7.getLayoutParams();
                    left = p7.getTop() - ((w4.e0) p7.getLayoutParams()).f7908a.top;
                    i12 = ((ViewGroup.MarginLayoutParams) e0Var2).topMargin;
                    break;
            }
            int i16 = left - i12;
            switch (c0Var.f7891a) {
                case 0:
                    w4.e0 e0Var3 = (w4.e0) p7.getLayoutParams();
                    right = p7.getRight() + ((w4.e0) p7.getLayoutParams()).f7908a.right;
                    i13 = ((ViewGroup.MarginLayoutParams) e0Var3).rightMargin;
                    break;
                default:
                    w4.e0 e0Var4 = (w4.e0) p7.getLayoutParams();
                    right = p7.getBottom() + ((w4.e0) p7.getLayoutParams()).f7908a.bottom;
                    i13 = ((ViewGroup.MarginLayoutParams) e0Var4).bottomMargin;
                    break;
            }
            int i17 = right + i13;
            v0Var.f8051b = x7;
            v0Var.f8052c = i14;
            v0Var.f8053d = i16;
            v0Var.f8054e = i17;
            if (i9 != 0) {
                v0Var.f8050a = i9;
                if (v0Var.a()) {
                    return p7;
                }
            }
            if (i10 != 0) {
                v0Var.f8050a = i10;
                if (v0Var.a()) {
                    view = p7;
                }
            }
            i += i15;
        }
        return view;
    }

    public KeyListener o(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((a0) ((b1.b) this.f12f).f1050e).getClass();
        if (keyListener instanceof f4.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new f4.e(keyListener);
    }

    public void p(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.f11e).getContext().obtainStyledAttributes(attributeSet, h.a.f3055g, i, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            u(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public f4.b q(InputConnection inputConnection, EditorInfo editorInfo) {
        b1.b bVar = (b1.b) this.f12f;
        if (inputConnection == null) {
            bVar.getClass();
            inputConnection = null;
        } else {
            a0 a0Var = (a0) bVar.f1050e;
            a0Var.getClass();
            if (!(inputConnection instanceof f4.b)) {
                inputConnection = new f4.b((EditText) a0Var.f11e, inputConnection, editorInfo);
            }
        }
        return (f4.b) inputConnection;
    }

    public void r(n3.f fVar) {
        n3.k kVar = (n3.k) this.f12f;
        b1.b bVar = (b1.b) this.f11e;
        int i = fVar.f5354b;
        if (i != 0) {
            kVar.execute(new d4.j(bVar, i));
        } else {
            kVar.execute(new b7.d(4, bVar, fVar.f5353a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        b3.j jVar;
        b3.o oVar = new b3.o();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    jVar = null;
                } catch (IOException e8) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e8);
                } catch (XmlPullParserException e9) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e9);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f1151d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f1150c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    jVar = b3.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f1149b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f1152e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    jVar = b3.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVar.f1151d.f1155a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (jVar != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                b3.b.a(context, xmlResourceParser, jVar.f1153f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    jVar = b3.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVar.f1151d.f1170h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (jVar != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    jVar = b3.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (!lowerCase.equals("guideline")) {
                                    break;
                                }
                                oVar.f1226c.put(Integer.valueOf(jVar.f1148a), jVar);
                                jVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    oVar.f1226c.put(Integer.valueOf(jVar.f1148a), jVar);
                                    jVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    oVar.f1226c.put(Integer.valueOf(jVar.f1148a), jVar);
                                    jVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.f12f).put(identifier, oVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f12f).put(identifier, oVar);
                return;
            }
        }
    }

    public void t(w4.p0 p0Var) {
        w4.w0 w0Var = (w4.w0) ((o.t0) this.f11e).get(p0Var);
        if (w0Var == null) {
            return;
        }
        w0Var.f8057a &= -2;
    }

    public String toString() {
        switch (this.f10d) {
            case 17:
                return "Bounds{lower=" + ((i3.c) this.f11e) + " upper=" + ((i3.c) this.f12f) + "}";
            case 18:
                return "AnimationResult(endReason=" + ((r.h) this.f12f) + ", endState=" + ((r.k) this.f11e) + ')';
            case 24:
                String str = "[ ";
                if (((w2.f) this.f11e) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((w2.f) this.f11e).f7871k[i] + " ";
                    }
                }
                return str + "] " + ((w2.f) this.f11e);
            default:
                return super.toString();
        }
    }

    public void u(boolean z3) {
        f4.i iVar = (f4.i) ((a0) ((b1.b) this.f12f).f1050e).f12f;
        if (iVar.f2734f != z3) {
            if (iVar.f2733e != null) {
                d4.l a8 = d4.l.a();
                f4.h hVar = iVar.f2733e;
                a8.getClass();
                h0.a.o(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a8.f2268a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a8.f2269b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f2734f = z3;
            if (z3) {
                f4.i.a(iVar.f2732d, d4.l.a().b());
            }
        }
    }

    public void v(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f11e;
        Object parent = view.getParent();
        if (parent instanceof View) {
            v((View) parent, fArr);
            f1.p.o(fArr2);
            f1.p.z(fArr2, -view.getScrollX(), -view.getScrollY());
            x1.g0.q(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            f1.p.o(fArr2);
            f1.p.z(fArr2, left, top);
            x1.g0.q(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f12f;
            view.getLocationInWindow(iArr);
            f1.p.o(fArr2);
            f1.p.z(fArr2, -view.getScrollX(), -view.getScrollY());
            x1.g0.q(fArr, fArr2);
            float f6 = iArr[0];
            float f8 = iArr[1];
            f1.p.o(fArr2);
            f1.p.z(fArr2, f6, f8);
            x1.g0.q(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        f1.p.p(fArr2, matrix);
        x1.g0.q(fArr, fArr2);
    }

    public void w(m0.y0 y0Var) {
        Object g3 = ((o.j0) this.f12f).g(y0Var);
        if (g3 != null) {
            if (!(g3 instanceof o.e0)) {
                throw new ClassCastException();
            }
            o.e0 e0Var = (o.e0) g3;
            Object[] objArr = e0Var.f5442a;
            if (e0Var.f5443b <= 0) {
                return;
            }
            q6.i.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public /* synthetic */ a0(int i, Object obj, Object obj2) {
        this.f10d = i;
        this.f11e = obj;
        this.f12f = obj2;
    }

    public /* synthetic */ a0(int i, boolean z3) {
        this.f10d = i;
    }

    public a0(w4.c0 c0Var) {
        this.f10d = 26;
        this.f11e = c0Var;
        w4.v0 v0Var = new w4.v0();
        v0Var.f8050a = 0;
        this.f12f = v0Var;
    }

    public a0(x xVar) {
        this.f10d = 0;
        this.f11e = xVar;
        o.d0 d0Var = o.o0.f5516a;
        this.f12f = new o.d0();
    }

    public a0(int i) {
        this.f10d = i;
        switch (i) {
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                this.f11e = new LinkedHashMap();
                this.f12f = new LinkedHashMap();
                break;
            case x.v0.f8304b /* 9 */:
                this.f11e = new w5.f(28);
                this.f12f = new o.s(16);
                break;
            case 12:
                this.f11e = new o.j0();
                this.f12f = new o.j0();
                break;
            case 20:
                this.f11e = new r1.c(0);
                this.f12f = new r1.c(0);
                break;
            case 23:
                this.f11e = new o0.e(new w1.f0[16]);
                break;
            case 27:
                this.f11e = new o.t0(0);
                this.f12f = new o.q((Object) null);
                break;
            case 29:
                this.f11e = new o0.e(new Reference[16]);
                this.f12f = new ReferenceQueue();
                break;
            default:
                this.f11e = Choreographer.getInstance();
                this.f12f = Looper.myLooper();
                break;
        }
    }

    public a0(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f10d = 17;
        lowerBound = bounds.getLowerBound();
        this.f11e = i3.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f12f = i3.c.c(upperBound);
    }

    public a0(EditText editText, int i) {
        this.f10d = i;
        switch (i) {
            case x.v0.f8306d /* 10 */:
                this.f11e = editText;
                this.f12f = new b1.b(editText);
                return;
            default:
                this.f11e = editText;
                f4.i iVar = new f4.i(editText);
                this.f12f = iVar;
                editText.addTextChangedListener(iVar);
                if (f4.a.f2718b == null) {
                    synchronized (f4.a.f2717a) {
                        try {
                            if (f4.a.f2718b == null) {
                                f4.a aVar = new f4.a();
                                try {
                                    f4.a.f2719c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, f4.a.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                f4.a.f2718b = aVar;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(f4.a.f2718b);
                return;
        }
    }

    public a0(float[] fArr) {
        this.f10d = 28;
        this.f11e = fArr;
        this.f12f = new int[2];
    }
}
