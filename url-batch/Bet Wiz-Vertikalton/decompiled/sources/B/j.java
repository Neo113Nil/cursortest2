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
import c.C0077a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.neonpulse.gridlogic.MainActivity;
import f0.G;
import f0.X;
import f0.d0;
import f0.g0;
import f0.h0;
import g.AbstractActivityC0132i;
import g.LayoutInflaterFactory2C0116A;
import j.AbstractC0139a;
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
import k.MenuC0144B;
import k.MenuC0160m;
import org.xmlpull.v1.XmlPullParserException;
import p1.t;
import q.C0284d;
import q.C0286f;
import v.C0315b;
import v.C0323j;

/* loaded from: classes.dex */
public final class j implements K.r, T.p, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f24a = i;
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

    public void A(AbstractC0139a abstractC0139a) {
        u uVar = (u) this.f25b;
        ((ActionMode.Callback) uVar.f828a).onDestroyActionMode(uVar.g(abstractC0139a));
        LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = (LayoutInflaterFactory2C0116A) this.f26c;
        if (layoutInflaterFactory2C0116A.f2370w != null) {
            layoutInflaterFactory2C0116A.f2359l.getDecorView().removeCallbacks(layoutInflaterFactory2C0116A.f2371x);
        }
        if (layoutInflaterFactory2C0116A.f2369v != null) {
            Z z2 = layoutInflaterFactory2C0116A.f2372y;
            if (z2 != null) {
                z2.b();
            }
            Z a2 = S.a(layoutInflaterFactory2C0116A.f2369v);
            a2.a(0.0f);
            layoutInflaterFactory2C0116A.f2372y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0116A.f2368u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0116A.f2325B;
        WeakHashMap weakHashMap = S.f422a;
        E.c(viewGroup);
        layoutInflaterFactory2C0116A.H();
    }

    public void B(t1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f26c;
        mainActivity.runOnUiThread(new C0.p(6, mainActivity));
    }

    public boolean C(AbstractC0139a abstractC0139a, MenuC0160m menuC0160m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0116A) this.f26c).f2325B;
        WeakHashMap weakHashMap = S.f422a;
        E.c(viewGroup);
        u uVar = (u) this.f25b;
        j.e g2 = uVar.g(abstractC0139a);
        o.k kVar = (o.k) uVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0160m, null);
        if (menu == null) {
            menu = new MenuC0144B((Context) uVar.f829b, menuC0160m);
            kVar.put(menuC0160m, menu);
        }
        return ((ActionMode.Callback) uVar.f828a).onPrepareActionMode(g2, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(t1.j jVar, t tVar) {
        String str;
        p1.o oVar;
        Charset charset;
        String str2;
        int i = 0;
        int i2 = MainActivity.F;
        ((MainActivity) this.f26c).getClass();
        final String t2 = MainActivity.t(new byte[]{108, 29, 109, 57, 126, 0, 108, 124, Byte.MAX_VALUE, 23, 105});
        final String t3 = MainActivity.t(new byte[]{57, 1, 107, 51, 111, 7, 108, 112, 33, 80, 112, 57, 57});
        final String str3 = ((p1.m) tVar.f3429a.f259c).h;
        p1.u uVar = tVar.f3434g;
        if (uVar != null) {
            C1.h h = uVar.h();
            try {
                switch (uVar.f3439a) {
                    case 0:
                        oVar = (p1.o) uVar.f3441c;
                        break;
                    default:
                        String str4 = (String) uVar.f3441c;
                        if (str4 != null) {
                            Pattern pattern = p1.o.f3369c;
                            try {
                                oVar = k0.k.h(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        oVar = null;
                        break;
                }
                if (oVar != null) {
                    charset = l1.a.f3159a;
                    String[] strArr = oVar.f3371b;
                    int J2 = x1.l.J(0, strArr.length - 1, 2);
                    if (J2 >= 0) {
                        while (!l1.l.q(strArr[i], "charset")) {
                            if (i != J2) {
                                i += 2;
                            }
                        }
                        str2 = strArr[i + 1];
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
                charset = l1.a.f3159a;
                str = h.e(q1.b.q(h, charset));
                x1.l.o(h, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final MainActivity mainActivity = (MainActivity) this.f26c;
        mainActivity.runOnUiThread(new Runnable() { // from class: O0.j
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean w2 = l1.d.w(str6, t2);
                MainActivity mainActivity2 = mainActivity;
                if (w2) {
                    if (l1.d.w(str5, t3)) {
                        int i3 = MainActivity.F;
                        mainActivity2.v();
                        return;
                    } else {
                        int i4 = MainActivity.F;
                        mainActivity2.v();
                        return;
                    }
                }
                int i5 = MainActivity.F;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.f1981C.a();
                e1.d.d(sharedPreferences, "access$getPrefs(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.f25b, str6);
                edit.apply();
                mainActivity2.f1985z = str6;
                mainActivity2.w(str6);
            }
        });
    }

    public void E(H.h hVar) {
        int i = hVar.f269b;
        Handler handler = (Handler) this.f26c;
        C.g gVar = (C.g) this.f25b;
        if (i == 0) {
            handler.post(new H.a(gVar, 0, hVar.f268a));
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
        C0323j c0323j;
        char c2;
        v.o oVar = new v.o();
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
                    c0323j = null;
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
                                    c0323j = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0323j = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0323j = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0323j.d.f3961a = true;
                                    break;
                                case 3:
                                    c0323j = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0323j.d.f3974h0 = 1;
                                    break;
                                case 4:
                                    if (c0323j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0323j.f3931b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0323j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0323j.f3933e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0323j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0323j.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0323j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0323j.f3932c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0323j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0315b.a(context, xmlResourceParser, c0323j.f3934f);
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
                                ((SparseArray) this.f26c).put(identifier, oVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                oVar.f4023c.put(Integer.valueOf(c0323j.f3930a), c0323j);
                                c0323j = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f26c).put(identifier, oVar);
                return;
            }
        }
    }

    public C0016q G(X x2, int i) {
        h0 h0Var;
        C0016q c0016q;
        o.k kVar = (o.k) this.f25b;
        int e2 = kVar.e(x2);
        if (e2 >= 0 && (h0Var = (h0) kVar.j(e2)) != null) {
            int i2 = h0Var.f2219a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                h0Var.f2219a = i3;
                if (i == 4) {
                    c0016q = h0Var.f2220b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0016q = h0Var.f2221c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    h0Var.f2219a = 0;
                    h0Var.f2220b = null;
                    h0Var.f2221c = null;
                    h0.d.c(h0Var);
                }
                return c0016q;
            }
        }
        return null;
    }

    public void H(X x2) {
        h0 h0Var = (h0) ((o.k) this.f25b).getOrDefault(x2, null);
        if (h0Var == null) {
            return;
        }
        h0Var.f2219a &= -2;
    }

    public void I(X x2) {
        o.e eVar = (o.e) this.f26c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (x2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3214c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3211e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3212a = true;
                }
            } else {
                e2--;
            }
        }
        h0 h0Var = (h0) ((o.k) this.f25b).remove(x2);
        if (h0Var != null) {
            h0Var.f2219a = 0;
            h0Var.f2220b = null;
            h0Var.f2221c = null;
            h0.d.c(h0Var);
        }
    }

    public void J() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f25b;
        jVar.getClass();
        String str = (String) this.f26c;
        e1.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1154b.remove(str)) != null) {
            jVar.f1153a.remove(num);
        }
        jVar.f1156e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1157f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1158g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0077a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0077a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0077a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1155c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0 a(View view, w0 w0Var) {
        boolean z2;
        boolean z3;
        C0.r rVar = (C0.r) this.f26c;
        int i = rVar.f165a;
        I.g gVar = (I.g) this.f25b;
        u0 u0Var = w0Var.f509a;
        C.c f2 = u0Var.f(7);
        C.c f3 = u0Var.f(32);
        int i2 = f2.f60b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f305b;
        bottomSheetBehavior.f1688w = i2;
        boolean e2 = C0.n.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1680o;
        if (z4) {
            int a2 = w0Var.a();
            bottomSheetBehavior.f1687v = a2;
            paddingBottom = a2 + rVar.f167c;
        }
        int i3 = rVar.f166b;
        boolean z5 = bottomSheetBehavior.f1681p;
        int i4 = f2.f59a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1682q;
        int i5 = f2.f61c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1684s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1685t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1686u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f60b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f304a;
                if (z3) {
                    bottomSheetBehavior.f1678m = f3.d;
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
        z3 = gVar.f304a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return w0Var;
    }

    public void b(X x2, C0016q c0016q) {
        o.k kVar = (o.k) this.f25b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2221c = c0016q;
        h0Var.f2219a |= 8;
    }

    public void c(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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

    public void d(boolean z2) {
        I i = (I) this.f26c;
        AbstractActivityC0132i abstractActivityC0132i = i.f939t.f1110f;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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

    public void h(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
    public Object i() {
        return (A) this.f25b;
    }

    public void j(boolean z2) {
        I i = (I) this.f26c;
        AbstractActivityC0132i abstractActivityC0132i = i.f939t.f1110f;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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

    public void l(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
    public void m() {
        ((Animator) this.f25b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f26c) + " has been canceled.");
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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

    public void p(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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

    public void q(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
    public boolean r(CharSequence charSequence, int i, int i2, x xVar) {
        if ((xVar.f837c & 4) > 0) {
            return true;
        }
        if (((A) this.f25b) == null) {
            this.f25b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((I0.e) this.f26c).getClass();
        ((A) this.f25b).setSpan(new y(xVar), i, i2, 33);
        return true;
    }

    public void s(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f26c).f941v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f931l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25b).iterator();
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
        int[] iArr = (int[]) this.f25b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f25b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f25b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f25b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f24a) {
            case 3:
                return "Bounds{lower=" + ((C.c) this.f25b) + " upper=" + ((C.c) this.f26c) + "}";
            case 16:
                String str = "[ ";
                if (((C0286f) this.f25b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0286f) this.f25b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0286f) this.f25b);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f25b;
        int d = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f2087a) {
                case 0:
                    u2 = g2.f2088b.u(i);
                    break;
                default:
                    u2 = g2.f2088b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            g0 g0Var = (g0) this.f26c;
            g0Var.f2212b = d;
            g0Var.f2213c = c2;
            g0Var.d = b2;
            g0Var.f2214e = a2;
            if (i3 != 0) {
                g0Var.f2211a = i3;
                if (g0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                g0Var.f2211a = i4;
                if (g0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f25b).clear();
    }

    public boolean x(View view) {
        G g2 = (G) this.f25b;
        int d = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        g0 g0Var = (g0) this.f26c;
        g0Var.f2212b = d;
        g0Var.f2213c = c2;
        g0Var.d = b2;
        g0Var.f2214e = a2;
        g0Var.f2211a = 24579;
        return g0Var.a();
    }

    public void y(int i, int i2) {
        int[] iArr = (int[]) this.f25b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f25b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f25b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f26c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f26c).get(size);
            int i4 = d0Var.f2182a;
            if (i4 >= i) {
                d0Var.f2182a = i4 + i2;
            }
        }
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f25b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f25b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f25b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f26c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f26c).get(size);
            int i4 = d0Var.f2182a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f26c).remove(size);
                } else {
                    d0Var.f2182a = i4 - i2;
                }
            }
        }
    }

    public /* synthetic */ j(LayoutInflater.Factory2 factory2, Object obj, int i) {
        this.f24a = i;
        this.f26c = factory2;
        this.f25b = obj;
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f24a = i;
        this.f25b = obj;
        this.f26c = obj2;
    }

    public j(C0284d c0284d) {
        this.f24a = 16;
        this.f26c = c0284d;
    }

    public j(I i) {
        this.f24a = 9;
        this.f25b = new CopyOnWriteArrayList();
        this.f26c = i;
    }

    public j(G g2) {
        this.f24a = 13;
        this.f25b = g2;
        g0 g0Var = new g0();
        g0Var.f2211a = 0;
        this.f26c = g0Var;
    }

    public j(Animation animation) {
        this.f24a = 8;
        this.f25b = animation;
        this.f26c = null;
    }

    public j(Animator animator) {
        this.f24a = 8;
        this.f25b = null;
        this.f26c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f24a = 0;
        int size = arrayList.size();
        this.f25b = new int[size];
        this.f26c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f25b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f26c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f24a = 0;
        this.f25b = new int[]{i, i2};
        this.f26c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f24a = 0;
        this.f25b = new int[]{i, i2, i3};
        this.f26c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f24a = 6;
        this.f25b = editText;
        V.i iVar = new V.i(editText);
        this.f26c = iVar;
        editText.addTextChangedListener(iVar);
        if (V.a.f853b == null) {
            synchronized (V.a.f852a) {
                try {
                    if (V.a.f853b == null) {
                        V.a aVar = new V.a();
                        try {
                            V.a.f854c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V.a.f853b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V.a.f853b);
    }

    public j(int i) {
        this.f24a = i;
        switch (i) {
            case 14:
                this.f25b = new o.k();
                this.f26c = new o.e();
                break;
            default:
                this.f25b = new SparseIntArray();
                this.f26c = new SparseIntArray();
                break;
        }
    }
}
