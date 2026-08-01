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
import X.AbstractComponentCallbacksC0047q;
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
import com.glasspulse.glasspulse.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.G;
import f0.X;
import f0.d0;
import f0.g0;
import f0.h0;
import g.AbstractActivityC0128i;
import g.LayoutInflaterFactory2C0112A;
import j.AbstractC0137a;
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
import k.MenuC0141B;
import k.MenuC0157m;
import k0.z;
import m1.t;
import org.xmlpull.v1.XmlPullParserException;
import q.C0272d;
import q.C0274f;
import v.C0307b;
import v.C0314i;

/* loaded from: classes.dex */
public final class j implements K.r, T.p, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52a;

    /* renamed from: b, reason: collision with root package name */
    public Object f53b;

    /* renamed from: c, reason: collision with root package name */
    public Object f54c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f52a = i;
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

    public void A(AbstractC0137a abstractC0137a) {
        u uVar = (u) this.f53b;
        ((ActionMode.Callback) uVar.f816a).onDestroyActionMode(uVar.g(abstractC0137a));
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = (LayoutInflaterFactory2C0112A) this.f54c;
        if (layoutInflaterFactory2C0112A.f2350w != null) {
            layoutInflaterFactory2C0112A.f2339l.getDecorView().removeCallbacks(layoutInflaterFactory2C0112A.f2351x);
        }
        if (layoutInflaterFactory2C0112A.f2349v != null) {
            Z z2 = layoutInflaterFactory2C0112A.f2352y;
            if (z2 != null) {
                z2.b();
            }
            Z a2 = S.a(layoutInflaterFactory2C0112A.f2349v);
            a2.a(0.0f);
            layoutInflaterFactory2C0112A.f2352y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0112A.f2348u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0112A.f2305B;
        WeakHashMap weakHashMap = S.f351a;
        E.c(viewGroup);
        layoutInflaterFactory2C0112A.H();
    }

    public void B(q1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f54c;
        mainActivity.runOnUiThread(new G0.o(10, mainActivity));
    }

    public boolean C(AbstractC0137a abstractC0137a, MenuC0157m menuC0157m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0112A) this.f54c).f2305B;
        WeakHashMap weakHashMap = S.f351a;
        E.c(viewGroup);
        u uVar = (u) this.f53b;
        j.e g2 = uVar.g(abstractC0137a);
        o.k kVar = (o.k) uVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0157m, null);
        if (menu == null) {
            menu = new MenuC0141B((Context) uVar.f817b, menuC0157m);
            kVar.put(menuC0157m, menu);
        }
        return ((ActionMode.Callback) uVar.f816a).onPrepareActionMode(g2, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(q1.j jVar, t tVar) {
        String str;
        m1.o oVar;
        Charset charset;
        String str2;
        int i = MainActivity.f1604E;
        ((MainActivity) this.f54c).getClass();
        final String t2 = MainActivity.t(new byte[]{-123, 119, 70, -58, -105, 106, 71, -125, -106, 125, 66});
        final String t3 = MainActivity.t(new byte[]{-48, 107, 64, -52, -122, 109, 71, -113, -56, 58, 91, -58, -48});
        final String str3 = ((m1.m) tVar.f3282a.f275c).h;
        m1.u uVar = tVar.f3287g;
        if (uVar != null) {
            z1.h h = uVar.h();
            try {
                switch (uVar.f3292a) {
                    case 0:
                        oVar = (m1.o) uVar.f3294c;
                        break;
                    default:
                        String str4 = (String) uVar.f3294c;
                        if (str4 != null) {
                            Pattern pattern = m1.o.f3222c;
                            try {
                                oVar = z.i(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        oVar = null;
                        break;
                }
                if (oVar != null) {
                    charset = i1.a.f2499a;
                    String[] strArr = oVar.f3224b;
                    int i2 = 0;
                    int H2 = u1.l.H(0, strArr.length - 1, 2);
                    if (H2 >= 0) {
                        while (!i1.l.s0(strArr[i2], "charset")) {
                            if (i2 != H2) {
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
                charset = i1.a.f2499a;
                str = h.f(n1.b.q(h, charset));
                u1.d.m(h, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final MainActivity mainActivity = (MainActivity) this.f54c;
        mainActivity.runOnUiThread(new Runnable() { // from class: o0.h
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean y02 = i1.d.y0(str6, t2);
                MainActivity mainActivity2 = mainActivity;
                if (y02) {
                    if (i1.d.y0(str5, t3)) {
                        int i3 = MainActivity.f1604E;
                        mainActivity2.v();
                        return;
                    } else {
                        int i4 = MainActivity.f1604E;
                        mainActivity2.v();
                        return;
                    }
                }
                SharedPreferences sharedPreferences = mainActivity2.f1607C;
                if (sharedPreferences == null) {
                    b1.d.h("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.f53b, str6);
                edit.apply();
                mainActivity2.f1610z = str6;
                mainActivity2.w(str6);
            }
        });
    }

    public void E(H.h hVar) {
        int i = hVar.f285b;
        Handler handler = (Handler) this.f54c;
        C.h hVar2 = (C.h) this.f53b;
        if (i == 0) {
            handler.post(new H.a(hVar2, 0, hVar.f284a));
        } else {
            handler.post(new H.b(hVar2, i, 0));
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
        C0314i c0314i;
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
                    c0314i = null;
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
                                    c0314i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0314i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0314i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0314i.d.f4094a = true;
                                    break;
                                case 3:
                                    c0314i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0314i.d.f4107h0 = 1;
                                    break;
                                case 4:
                                    if (c0314i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0314i.f4064b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0314i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0314i.f4066e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0314i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0314i.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0314i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0314i.f4065c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0314i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0307b.a(context, xmlResourceParser, c0314i.f4067f);
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
                                ((SparseArray) this.f54c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4155c.put(Integer.valueOf(c0314i.f4063a), c0314i);
                                c0314i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f54c).put(identifier, nVar);
                return;
            }
        }
    }

    public C0016q G(X x2, int i) {
        h0 h0Var;
        C0016q c0016q;
        o.k kVar = (o.k) this.f53b;
        int e2 = kVar.e(x2);
        if (e2 >= 0 && (h0Var = (h0) kVar.j(e2)) != null) {
            int i2 = h0Var.f2194a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                h0Var.f2194a = i3;
                if (i == 4) {
                    c0016q = h0Var.f2195b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0016q = h0Var.f2196c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    h0Var.f2194a = 0;
                    h0Var.f2195b = null;
                    h0Var.f2196c = null;
                    h0.d.c(h0Var);
                }
                return c0016q;
            }
        }
        return null;
    }

    public void H(X x2) {
        h0 h0Var = (h0) ((o.k) this.f53b).getOrDefault(x2, null);
        if (h0Var == null) {
            return;
        }
        h0Var.f2194a &= -2;
    }

    public void I(X x2) {
        o.e eVar = (o.e) this.f54c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (x2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3341c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3338e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3339a = true;
                }
            } else {
                e2--;
            }
        }
        h0 h0Var = (h0) ((o.k) this.f53b).remove(x2);
        if (h0Var != null) {
            h0Var.f2194a = 0;
            h0Var.f2195b = null;
            h0Var.f2196c = null;
            h0.d.c(h0Var);
        }
    }

    public void J() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f53b;
        jVar.getClass();
        String str = (String) this.f54c;
        b1.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1124b.remove(str)) != null) {
            jVar.f1123a.remove(num);
        }
        jVar.f1126e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1127f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1128g;
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
        if (jVar.f1125c.get(str) != null) {
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
        G0.q qVar = (G0.q) this.f54c;
        int i = qVar.f263a;
        I.h hVar = (I.h) this.f53b;
        u0 u0Var = w0Var.f438a;
        C.d f2 = u0Var.f(7);
        C.d f3 = u0Var.f(32);
        int i2 = f2.f143b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f312b;
        bottomSheetBehavior.f1717w = i2;
        boolean e2 = G0.m.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1709o;
        if (z4) {
            int a2 = w0Var.a();
            bottomSheetBehavior.f1716v = a2;
            paddingBottom = a2 + qVar.f265c;
        }
        int i3 = qVar.f264b;
        boolean z5 = bottomSheetBehavior.f1710p;
        int i4 = f2.f142a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1711q;
        int i5 = f2.f144c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1713s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1714t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1715u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f143b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = hVar.f311a;
                if (z3) {
                    bottomSheetBehavior.f1707m = f3.d;
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
        z3 = hVar.f311a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return w0Var;
    }

    public void b(X x2, C0016q c0016q) {
        o.k kVar = (o.k) this.f53b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2196c = c0016q;
        h0Var.f2194a |= 8;
    }

    public void c(boolean z2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        I i = (I) this.f54c;
        AbstractActivityC0128i abstractActivityC0128i = i.f913t.f1084f;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = i.f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        return (A) this.f53b;
    }

    public void j(boolean z2) {
        I i = (I) this.f54c;
        AbstractActivityC0128i abstractActivityC0128i = i.f913t.f1084f;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = i.f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        ((Animator) this.f53b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f54c) + " has been canceled.");
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        if ((xVar.f825c & 4) > 0) {
            return true;
        }
        if (((A) this.f53b) == null) {
            this.f53b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((M0.e) this.f54c).getClass();
        ((A) this.f53b).setSpan(new y(xVar), i, i2, 33);
        return true;
    }

    public void s(boolean z2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f54c).f915v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f905l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f53b).iterator();
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
        int[] iArr = (int[]) this.f53b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f53b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f53b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f53b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f52a) {
            case 3:
                return "Bounds{lower=" + ((C.d) this.f53b) + " upper=" + ((C.d) this.f54c) + "}";
            case 17:
                String str = "[ ";
                if (((C0274f) this.f53b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0274f) this.f53b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0274f) this.f53b);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f53b;
        int d = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f2062a) {
                case 0:
                    u2 = g2.f2063b.u(i);
                    break;
                default:
                    u2 = g2.f2063b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            g0 g0Var = (g0) this.f54c;
            g0Var.f2187b = d;
            g0Var.f2188c = c2;
            g0Var.d = b2;
            g0Var.f2189e = a2;
            if (i3 != 0) {
                g0Var.f2186a = i3;
                if (g0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                g0Var.f2186a = i4;
                if (g0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f53b).clear();
    }

    public boolean x(View view) {
        G g2 = (G) this.f53b;
        int d = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        g0 g0Var = (g0) this.f54c;
        g0Var.f2187b = d;
        g0Var.f2188c = c2;
        g0Var.d = b2;
        g0Var.f2189e = a2;
        g0Var.f2186a = 24579;
        return g0Var.a();
    }

    public void y(int i, int i2) {
        int[] iArr = (int[]) this.f53b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f53b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f53b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f54c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f54c).get(size);
            int i4 = d0Var.f2157a;
            if (i4 >= i) {
                d0Var.f2157a = i4 + i2;
            }
        }
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f53b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f53b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f53b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f54c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f54c).get(size);
            int i4 = d0Var.f2157a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f54c).remove(size);
                } else {
                    d0Var.f2157a = i4 - i2;
                }
            }
        }
    }

    public /* synthetic */ j(LayoutInflater.Factory2 factory2, Object obj, int i) {
        this.f52a = i;
        this.f54c = factory2;
        this.f53b = obj;
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f52a = i;
        this.f53b = obj;
        this.f54c = obj2;
    }

    public j(C0272d c0272d) {
        this.f52a = 17;
        this.f54c = c0272d;
    }

    public j(I i) {
        this.f52a = 8;
        this.f53b = new CopyOnWriteArrayList();
        this.f54c = i;
    }

    public j(G g2) {
        this.f52a = 12;
        this.f53b = g2;
        g0 g0Var = new g0();
        g0Var.f2186a = 0;
        this.f54c = g0Var;
    }

    public j(Animation animation) {
        this.f52a = 7;
        this.f53b = animation;
        this.f54c = null;
    }

    public j(Animator animator) {
        this.f52a = 7;
        this.f53b = null;
        this.f54c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f52a = 0;
        int size = arrayList.size();
        this.f53b = new int[size];
        this.f54c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f53b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f54c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f52a = 0;
        this.f53b = new int[]{i, i2};
        this.f54c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f52a = 0;
        this.f53b = new int[]{i, i2, i3};
        this.f54c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f52a = 5;
        this.f53b = editText;
        V.i iVar = new V.i(editText);
        this.f54c = iVar;
        editText.addTextChangedListener(iVar);
        if (V.a.f851b == null) {
            synchronized (V.a.f850a) {
                try {
                    if (V.a.f851b == null) {
                        V.a aVar = new V.a();
                        try {
                            V.a.f852c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V.a.f851b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V.a.f851b);
    }

    public j(int i) {
        this.f52a = i;
        switch (i) {
            case 13:
                this.f53b = new o.k();
                this.f54c = new o.e();
                break;
            default:
                this.f53b = new SparseIntArray();
                this.f54c = new SparseIntArray();
                break;
        }
    }
}
