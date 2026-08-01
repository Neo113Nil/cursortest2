package B;

import K.C0016q;
import K.E;
import K.S;
import K.Z;
import K.u0;
import K.w0;
import T.A;
import T.u;
import T.x;
import T.y;
import X.AbstractComponentCallbacksC0048q;
import X.I;
import X.U;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import c.C0080a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.playgen.securelock.MainActivity;
import f0.G;
import f0.X;
import f0.d0;
import f0.g0;
import f0.h0;
import g.AbstractActivityC0133i;
import g.LayoutInflaterFactory2C0117A;
import j.AbstractC0140a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import k.MenuC0145B;
import k.MenuC0161m;
import m1.t;
import org.xmlpull.v1.XmlPullParserException;
import q.C0287d;
import q.C0289f;
import v.C0320b;
import v.C0327i;

/* loaded from: classes.dex */
public final class j implements K.r, T.p, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f26a = i;
    }

    public static int v(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A(AbstractC0140a abstractC0140a) {
        u uVar = (u) this.f27b;
        ((ActionMode.Callback) uVar.f801a).onDestroyActionMode(uVar.g(abstractC0140a));
        LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = (LayoutInflaterFactory2C0117A) this.f28c;
        if (layoutInflaterFactory2C0117A.f2309w != null) {
            layoutInflaterFactory2C0117A.f2298l.getDecorView().removeCallbacks(layoutInflaterFactory2C0117A.f2310x);
        }
        if (layoutInflaterFactory2C0117A.f2308v != null) {
            Z z2 = layoutInflaterFactory2C0117A.f2311y;
            if (z2 != null) {
                z2.b();
            }
            Z a2 = S.a(layoutInflaterFactory2C0117A.f2308v);
            a2.a(0.0f);
            layoutInflaterFactory2C0117A.f2311y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0117A.f2307u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0117A.f2264B;
        WeakHashMap weakHashMap = S.f369a;
        E.c(viewGroup);
        layoutInflaterFactory2C0117A.H();
    }

    public void B(q1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f28c;
        mainActivity.runOnUiThread(new C0.p(5, mainActivity));
    }

    public boolean C(AbstractC0140a abstractC0140a, MenuC0161m menuC0161m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0117A) this.f28c).f2264B;
        WeakHashMap weakHashMap = S.f369a;
        E.c(viewGroup);
        u uVar = (u) this.f27b;
        j.e g2 = uVar.g(abstractC0140a);
        o.k kVar = (o.k) uVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0161m, null);
        if (menu == null) {
            menu = new MenuC0145B((Context) uVar.f802b, menuC0161m);
            kVar.put(menuC0161m, menu);
        }
        return ((ActionMode.Callback) uVar.f801a).onPrepareActionMode(g2, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(q1.j jVar, m1.s sVar) {
        String str;
        m1.n nVar;
        Charset charset;
        String str2;
        int i = MainActivity.f1934D;
        ((MainActivity) this.f28c).getClass();
        final String t2 = MainActivity.t(new byte[]{124, -30, 40, 121, 110, -1, 41, 60, 111, -24, 44});
        final String t3 = MainActivity.t(new byte[]{41, -2, 46, 115, Byte.MAX_VALUE, -8, 41, 48, 49, -81, 53, 121, 41});
        final String str3 = ((m1.l) sVar.f3249a.f206c).h;
        t tVar = sVar.f3254g;
        if (tVar != null) {
            z1.h h = tVar.h();
            try {
                switch (tVar.f3259a) {
                    case 0:
                        nVar = (m1.n) tVar.f3261c;
                        break;
                    default:
                        String str4 = (String) tVar.f3261c;
                        if (str4 != null) {
                            Pattern pattern = m1.n.f3189c;
                            try {
                                nVar = k0.k.h(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        nVar = null;
                        break;
                }
                if (nVar != null) {
                    charset = i1.a.f2460a;
                    String[] strArr = nVar.f3191b;
                    int i2 = 0;
                    int A2 = u1.l.A(0, strArr.length - 1, 2);
                    if (A2 >= 0) {
                        while (!i1.l.k0(strArr[i2], "charset")) {
                            if (i2 != A2) {
                                i2 += 2;
                            }
                        }
                        str2 = strArr[i2 + 1];
                        if (str2 != null) {
                            try {
                                charset = Charset.forName(str2);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                charset = i1.a.f2460a;
                str = h.f(n1.b.q(h, charset));
                u1.d.p(h, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final MainActivity mainActivity = (MainActivity) this.f28c;
        mainActivity.runOnUiThread(new Runnable() { // from class: O0.e
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean q02 = i1.d.q0(str6, t2);
                MainActivity mainActivity2 = mainActivity;
                if (q02) {
                    if (i1.d.q0(str5, t3)) {
                        int i3 = MainActivity.f1934D;
                        mainActivity2.v();
                        return;
                    } else {
                        int i4 = MainActivity.f1934D;
                        mainActivity2.v();
                        return;
                    }
                }
                SharedPreferences sharedPreferences = mainActivity2.f1937C;
                if (sharedPreferences == null) {
                    b1.d.h("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.f27b, str6);
                edit.apply();
                mainActivity2.f1939z = str6;
                mainActivity2.w(str6);
            }
        });
    }

    public void E(H.h hVar) {
        int i = hVar.f216b;
        Handler handler = (Handler) this.f28c;
        C.g gVar = (C.g) this.f27b;
        if (i == 0) {
            handler.post(new H.a(gVar, 0, hVar.f215a));
        } else {
            handler.post(new H.b(gVar, i, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C0327i c0327i;
        char c2;
        v.n nVar = new v.n();
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
                    c0327i = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (XmlPullParserException e3) {
                    e3.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0327i.d.f4033a = true;
                                    break;
                                case 3:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0327i.d.f4046h0 = 1;
                                    break;
                                case 4:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.f4003b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.f4005e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.f4004c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0320b.a(context, xmlResourceParser, c0327i.f4006f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f28c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4095c.put(Integer.valueOf(c0327i.f4002a), c0327i);
                                c0327i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f28c).put(identifier, nVar);
                return;
            }
        }
    }

    public C0016q G(X x2, int i) {
        h0 h0Var;
        C0016q c0016q;
        o.k kVar = (o.k) this.f27b;
        int e2 = kVar.e(x2);
        if (e2 >= 0 && (h0Var = (h0) kVar.j(e2)) != null) {
            int i2 = h0Var.f2152a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                h0Var.f2152a = i3;
                if (i == 4) {
                    c0016q = h0Var.f2153b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0016q = h0Var.f2154c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    h0Var.f2152a = 0;
                    h0Var.f2153b = null;
                    h0Var.f2154c = null;
                    h0.d.c(h0Var);
                }
                return c0016q;
            }
        }
        return null;
    }

    public void H(X x2) {
        h0 h0Var = (h0) ((o.k) this.f27b).getOrDefault(x2, null);
        if (h0Var == null) {
            return;
        }
        h0Var.f2152a &= -2;
    }

    public void I(X x2) {
        o.e eVar = (o.e) this.f28c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (x2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3308c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3305e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3306a = true;
                }
            } else {
                e2--;
            }
        }
        h0 h0Var = (h0) ((o.k) this.f27b).remove(x2);
        if (h0Var != null) {
            h0Var.f2152a = 0;
            h0Var.f2153b = null;
            h0Var.f2154c = null;
            h0.d.c(h0Var);
        }
    }

    public void J() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f27b;
        jVar.getClass();
        String str = (String) this.f28c;
        b1.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1110b.remove(str)) != null) {
            jVar.f1109a.remove(num);
        }
        jVar.f1112e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1113f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1114g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0080a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0080a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0080a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1111c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(X x2, C0016q c0016q) {
        o.k kVar = (o.k) this.f27b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2154c = c0016q;
        h0Var.f2152a |= 8;
    }

    public void b(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.b(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0 c(View view, w0 w0Var) {
        boolean z2;
        boolean z3;
        C0.r rVar = (C0.r) this.f28c;
        int i = rVar.f164a;
        I.g gVar = (I.g) this.f27b;
        u0 u0Var = w0Var.f456a;
        C.c f2 = u0Var.f(7);
        C.c f3 = u0Var.f(32);
        int i2 = f2.f59b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f252b;
        bottomSheetBehavior.f1651w = i2;
        boolean e2 = C0.n.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1643o;
        if (z4) {
            int a2 = w0Var.a();
            bottomSheetBehavior.f1650v = a2;
            paddingBottom = a2 + rVar.f166c;
        }
        int i3 = rVar.f165b;
        boolean z5 = bottomSheetBehavior.f1644p;
        int i4 = f2.f58a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1645q;
        int i5 = f2.f60c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1647s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1648t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1649u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f59b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f251a;
                if (z3) {
                    bottomSheetBehavior.f1641m = f3.d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return w0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = gVar.f251a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return w0Var;
    }

    public void d(boolean z2) {
        I i = (I) this.f28c;
        AbstractActivityC0133i abstractActivityC0133i = i.f899t.f1070f;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void e(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void f(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // T.p
    public Object h() {
        return (A) this.f27b;
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z2) {
        I i = (I) this.f28c;
        AbstractActivityC0133i abstractActivityC0133i = i.f899t.f1070f;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // G.b
    public void l() {
        ((Animator) this.f27b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f28c) + " has been canceled.");
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // T.p
    public boolean p(CharSequence charSequence, int i, int i2, x xVar) {
        if ((xVar.f810c & 4) > 0) {
            return true;
        }
        if (((A) this.f27b) == null) {
            this.f27b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((I0.e) this.f28c).getClass();
        ((A) this.f27b).setSpan(new y(xVar), i, i2, 33);
        return true;
    }

    public void q(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void s(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f28c).f901v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f891l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void t(int i) {
        int[] iArr = (int[]) this.f27b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f27b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f27b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f27b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f26a) {
            case 3:
                return "Bounds{lower=" + ((C.c) this.f27b) + " upper=" + ((C.c) this.f28c) + "}";
            case 17:
                String str = "[ ";
                if (((C0289f) this.f27b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0289f) this.f27b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0289f) this.f27b);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f27b;
        int d = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f2020a) {
                case 0:
                    u2 = g2.f2021b.u(i);
                    break;
                default:
                    u2 = g2.f2021b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            g0 g0Var = (g0) this.f28c;
            g0Var.f2145b = d;
            g0Var.f2146c = c2;
            g0Var.d = b2;
            g0Var.f2147e = a2;
            if (i3 != 0) {
                g0Var.f2144a = i3;
                if (g0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                g0Var.f2144a = i4;
                if (g0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f27b).clear();
    }

    public boolean x(View view) {
        G g2 = (G) this.f27b;
        int d = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        g0 g0Var = (g0) this.f28c;
        g0Var.f2145b = d;
        g0Var.f2146c = c2;
        g0Var.d = b2;
        g0Var.f2147e = a2;
        g0Var.f2144a = 24579;
        return g0Var.a();
    }

    public void y(int i, int i2) {
        int[] iArr = (int[]) this.f27b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f27b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f27b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f28c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f28c).get(size);
            int i4 = d0Var.f2115a;
            if (i4 >= i) {
                d0Var.f2115a = i4 + i2;
            }
        }
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f27b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f27b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f27b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f28c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f28c).get(size);
            int i4 = d0Var.f2115a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f28c).remove(size);
                } else {
                    d0Var.f2115a = i4 - i2;
                }
            }
        }
    }

    public /* synthetic */ j(LayoutInflater.Factory2 factory2, Object obj, int i) {
        this.f26a = i;
        this.f28c = factory2;
        this.f27b = obj;
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f26a = i;
        this.f27b = obj;
        this.f28c = obj2;
    }

    public j(C0287d c0287d) {
        this.f26a = 17;
        this.f28c = c0287d;
    }

    public j(I i) {
        this.f26a = 9;
        this.f27b = new CopyOnWriteArrayList();
        this.f28c = i;
    }

    public j(G g2) {
        this.f26a = 13;
        this.f27b = g2;
        g0 g0Var = new g0();
        g0Var.f2144a = 0;
        this.f28c = g0Var;
    }

    public j(Animation animation) {
        this.f26a = 8;
        this.f27b = animation;
        this.f28c = null;
    }

    public j(Animator animator) {
        this.f26a = 8;
        this.f27b = null;
        this.f28c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f26a = 0;
        int size = arrayList.size();
        this.f27b = new int[size];
        this.f28c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f27b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f28c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f26a = 0;
        this.f27b = new int[]{i, i2};
        this.f28c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f26a = 0;
        this.f27b = new int[]{i, i2, i3};
        this.f28c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f26a = 6;
        this.f27b = editText;
        V.i iVar = new V.i(editText);
        this.f28c = iVar;
        editText.addTextChangedListener(iVar);
        if (V.a.f836b == null) {
            synchronized (V.a.f835a) {
                try {
                    if (V.a.f836b == null) {
                        V.a aVar = new V.a();
                        try {
                            V.a.f837c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V.a.f836b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V.a.f836b);
    }

    public j(int i) {
        this.f26a = i;
        switch (i) {
            case 14:
                this.f27b = new o.k();
                this.f28c = new o.e();
                break;
            default:
                this.f27b = new SparseIntArray();
                this.f28c = new SparseIntArray();
                break;
        }
    }
}
