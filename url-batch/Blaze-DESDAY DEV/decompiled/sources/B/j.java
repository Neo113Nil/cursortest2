package B;

import K.C0005c0;
import K.C0019q;
import K.F;
import K.T;
import K.x0;
import K.z0;
import U.A;
import U.u;
import U.x;
import U.y;
import Y.AbstractComponentCallbacksC0051q;
import Y.I;
import Y.U;
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
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import c.C0083a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.winworm.neongrid.MainActivity;
import g.AbstractActivityC0108i;
import g.LayoutInflaterFactory2C0092A;
import g0.H;
import g0.a0;
import g0.g0;
import g0.j0;
import g0.k0;
import j.AbstractC0144a;
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
import k.MenuC0150B;
import k.MenuC0166m;
import k0.AbstractC0180a;
import org.xmlpull.v1.XmlPullParserException;
import q.C0289d;
import q.C0291f;
import r1.t;
import v.C0307b;

/* loaded from: classes.dex */
public final class j implements K.r, U.p, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    /* renamed from: b, reason: collision with root package name */
    public Object f45b;

    /* renamed from: c, reason: collision with root package name */
    public Object f46c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f44a = i;
    }

    public static int w(int i, int i2) {
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

    public void A(int i, int i2) {
        int[] iArr = (int[]) this.f45b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f45b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f45b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f46c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) ((ArrayList) this.f46c).get(size);
            int i4 = g0Var.f2416a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f46c).remove(size);
                } else {
                    g0Var.f2416a = i4 - i2;
                }
            }
        }
    }

    public void B(AbstractC0144a abstractC0144a) {
        u uVar = (u) this.f45b;
        ((ActionMode.Callback) uVar.f883a).onDestroyActionMode(uVar.g(abstractC0144a));
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) this.f46c;
        if (layoutInflaterFactory2C0092A.f2171w != null) {
            layoutInflaterFactory2C0092A.f2160l.getDecorView().removeCallbacks(layoutInflaterFactory2C0092A.f2172x);
        }
        if (layoutInflaterFactory2C0092A.f2170v != null) {
            C0005c0 c0005c0 = layoutInflaterFactory2C0092A.f2173y;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            C0005c0 a2 = T.a(layoutInflaterFactory2C0092A.f2170v);
            a2.a(RecyclerView.f1559A0);
            layoutInflaterFactory2C0092A.f2173y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0092A.f2169u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0092A.f2126B;
        WeakHashMap weakHashMap = T.f440a;
        F.c(viewGroup);
        layoutInflaterFactory2C0092A.H();
    }

    public void C(v1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f45b;
        mainActivity.runOnUiThread(new D0.p(5, mainActivity));
    }

    public boolean D(AbstractC0144a abstractC0144a, MenuC0166m menuC0166m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0092A) this.f46c).f2126B;
        WeakHashMap weakHashMap = T.f440a;
        F.c(viewGroup);
        u uVar = (u) this.f45b;
        j.e g2 = uVar.g(abstractC0144a);
        o.k kVar = (o.k) uVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0166m, null);
        if (menu == null) {
            menu = new MenuC0150B((Context) uVar.f884b, menuC0166m);
            kVar.put(menuC0166m, menu);
        }
        return ((ActionMode.Callback) uVar.f883a).onPrepareActionMode(g2, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(v1.j jVar, t tVar) {
        String str;
        r1.o oVar;
        Charset charset;
        String str2;
        int i = MainActivity.F;
        ((MainActivity) this.f45b).getClass();
        final String t2 = MainActivity.t(new byte[]{100, 41, -53, 40, 118, 52, -54, 109, 119, 35, -49});
        final String t3 = MainActivity.t(new byte[]{49, 53, -51, 34, 103, 51, -54, 97, 41, 100, -42, 40, 49});
        final String str3 = ((r1.m) tVar.f3529a.f278c).h;
        r1.u uVar = tVar.f3534g;
        if (uVar != null) {
            E1.h h = uVar.h();
            try {
                switch (uVar.f3539a) {
                    case 0:
                        oVar = (r1.o) uVar.f3541c;
                        break;
                    default:
                        String str4 = (String) uVar.f3541c;
                        if (str4 != null) {
                            Pattern pattern = r1.o.f3469c;
                            try {
                                oVar = AbstractC0180a.g(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        oVar = null;
                        break;
                }
                if (oVar != null) {
                    charset = n1.a.f3243a;
                    String[] strArr = oVar.f3471b;
                    int i2 = 0;
                    int N2 = z1.d.N(0, strArr.length - 1, 2);
                    if (N2 >= 0) {
                        while (!n1.l.u(strArr[i2], "charset")) {
                            if (i2 != N2) {
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
                charset = n1.a.f3243a;
                str = h.e(s1.b.q(h, charset));
                z1.d.s(h, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final String str6 = (String) this.f46c;
        final MainActivity mainActivity = (MainActivity) this.f45b;
        mainActivity.runOnUiThread(new Runnable() { // from class: P0.c
            @Override // java.lang.Runnable
            public final void run() {
                String str7 = str3;
                boolean A2 = n1.d.A(str7, t2);
                MainActivity mainActivity2 = mainActivity;
                if (A2) {
                    if (n1.d.A(str5, t3)) {
                        int i3 = MainActivity.F;
                        mainActivity2.v();
                        return;
                    } else {
                        int i4 = MainActivity.F;
                        mainActivity2.v();
                        return;
                    }
                }
                SharedPreferences sharedPreferences = mainActivity2.f2023C;
                if (sharedPreferences == null) {
                    g1.d.h("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str6, str7);
                edit.apply();
                mainActivity2.f2027z = str7;
                mainActivity2.w(str7);
            }
        });
    }

    public void F(H.h hVar) {
        int i = hVar.f288b;
        Handler handler = (Handler) this.f46c;
        C.g gVar = (C.g) this.f45b;
        if (i == 0) {
            handler.post(new H.a(gVar, 0, hVar.f287a));
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
    public void G(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        v.j jVar;
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
                    jVar = null;
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
                                    jVar = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    jVar = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    jVar = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVar.d.f3922a = true;
                                    break;
                                case 3:
                                    jVar = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVar.d.f3935h0 = 1;
                                    break;
                                case 4:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f3892b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f3894e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f3893c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0307b.a(context, xmlResourceParser, jVar.f3895f);
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
                                ((SparseArray) this.f46c).put(identifier, oVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                oVar.f3984c.put(Integer.valueOf(jVar.f3891a), jVar);
                                jVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f46c).put(identifier, oVar);
                return;
            }
        }
    }

    public C0019q H(a0 a0Var, int i) {
        k0 k0Var;
        C0019q c0019q;
        o.k kVar = (o.k) this.f45b;
        int e2 = kVar.e(a0Var);
        if (e2 >= 0 && (k0Var = (k0) kVar.j(e2)) != null) {
            int i2 = k0Var.f2456a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                k0Var.f2456a = i3;
                if (i == 4) {
                    c0019q = k0Var.f2457b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0019q = k0Var.f2458c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    k0Var.f2456a = 0;
                    k0Var.f2457b = null;
                    k0Var.f2458c = null;
                    k0.d.c(k0Var);
                }
                return c0019q;
            }
        }
        return null;
    }

    public void I(a0 a0Var) {
        k0 k0Var = (k0) ((o.k) this.f45b).getOrDefault(a0Var, null);
        if (k0Var == null) {
            return;
        }
        k0Var.f2456a &= -2;
    }

    public void J(a0 a0Var) {
        o.e eVar = (o.e) this.f46c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (a0Var == eVar.f(e2)) {
                Object[] objArr = eVar.f3272c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3269e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3270a = true;
                }
            } else {
                e2--;
            }
        }
        k0 k0Var = (k0) ((o.k) this.f45b).remove(a0Var);
        if (k0Var != null) {
            k0Var.f2456a = 0;
            k0Var.f2457b = null;
            k0Var.f2458c = null;
            k0.d.c(k0Var);
        }
    }

    public void K() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f45b;
        jVar.getClass();
        String str = (String) this.f46c;
        g1.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1197b.remove(str)) != null) {
            jVar.f1196a.remove(num);
        }
        jVar.f1199e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1200f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1201g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0083a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0083a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0083a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1198c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0 a(View view, z0 z0Var) {
        boolean z2;
        boolean z3;
        D0.r rVar = (D0.r) this.f46c;
        int i = rVar.f183a;
        I.g gVar = (I.g) this.f45b;
        x0 x0Var = z0Var.f536a;
        C.c f2 = x0Var.f(7);
        C.c f3 = x0Var.f(32);
        int i2 = f2.f73b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f317b;
        bottomSheetBehavior.f1744w = i2;
        boolean e2 = D0.n.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1736o;
        if (z4) {
            int a2 = z0Var.a();
            bottomSheetBehavior.f1743v = a2;
            paddingBottom = a2 + rVar.f185c;
        }
        int i3 = rVar.f184b;
        boolean z5 = bottomSheetBehavior.f1737p;
        int i4 = f2.f72a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1738q;
        int i5 = f2.f74c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1740s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1741t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1742u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f73b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f316a;
                if (z3) {
                    bottomSheetBehavior.f1734m = f3.d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return z0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = gVar.f316a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return z0Var;
    }

    public void b(a0 a0Var, C0019q c0019q) {
        o.k kVar = (o.k) this.f45b;
        k0 k0Var = (k0) kVar.getOrDefault(a0Var, null);
        if (k0Var == null) {
            k0Var = k0.a();
            kVar.put(a0Var, k0Var);
        }
        k0Var.f2458c = c0019q;
        k0Var.f2456a |= 8;
    }

    public void c() {
        int[] iArr = (int[]) this.f45b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f46c = null;
    }

    public void d(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        I i = (I) this.f46c;
        AbstractActivityC0108i abstractActivityC0108i = i.f986t.f1157b;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = i.f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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

    @Override // U.p
    public Object h() {
        return (A) this.f45b;
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        I i = (I) this.f46c;
        AbstractActivityC0108i abstractActivityC0108i = i.f986t.f1157b;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = i.f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        ((Animator) this.f45b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f46c) + " has been canceled.");
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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

    @Override // U.p
    public boolean s(CharSequence charSequence, int i, int i2, x xVar) {
        if ((xVar.f892c & 4) > 0) {
            return true;
        }
        if (((A) this.f45b) == null) {
            this.f45b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((J0.e) this.f46c).getClass();
        ((A) this.f45b).setSpan(new y(xVar), i, i2, 33);
        return true;
    }

    public void t(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f46c).f988v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f978l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f45b).iterator();
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

    public String toString() {
        switch (this.f44a) {
            case 3:
                return "Bounds{lower=" + ((C.c) this.f45b) + " upper=" + ((C.c) this.f46c) + "}";
            case 16:
                String str = "[ ";
                if (((C0291f) this.f45b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0291f) this.f45b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0291f) this.f45b);
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int[] iArr = (int[]) this.f45b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f45b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f45b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f45b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View v(int i, int i2, int i3, int i4) {
        View u2;
        H h = (H) this.f45b;
        int d = h.d();
        int c2 = h.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (h.f2305a) {
                case 0:
                    u2 = h.f2306b.u(i);
                    break;
                default:
                    u2 = h.f2306b.u(i);
                    break;
            }
            int b2 = h.b(u2);
            int a2 = h.a(u2);
            j0 j0Var = (j0) this.f46c;
            j0Var.f2452b = d;
            j0Var.f2453c = c2;
            j0Var.d = b2;
            j0Var.f2454e = a2;
            if (i3 != 0) {
                j0Var.f2451a = i3;
                if (j0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                j0Var.f2451a = i4;
                if (j0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void x() {
        ((SparseIntArray) this.f45b).clear();
    }

    public boolean y(View view) {
        H h = (H) this.f45b;
        int d = h.d();
        int c2 = h.c();
        int b2 = h.b(view);
        int a2 = h.a(view);
        j0 j0Var = (j0) this.f46c;
        j0Var.f2452b = d;
        j0Var.f2453c = c2;
        j0Var.d = b2;
        j0Var.f2454e = a2;
        j0Var.f2451a = 24579;
        return j0Var.a();
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f45b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f45b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f45b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f46c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) ((ArrayList) this.f46c).get(size);
            int i4 = g0Var.f2416a;
            if (i4 >= i) {
                g0Var.f2416a = i4 + i2;
            }
        }
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f44a = i;
        this.f45b = obj;
        this.f46c = obj2;
    }

    public j(C0289d c0289d) {
        this.f44a = 16;
        this.f46c = c0289d;
    }

    public j(I i) {
        this.f44a = 9;
        this.f45b = new CopyOnWriteArrayList();
        this.f46c = i;
    }

    public j(H h) {
        this.f44a = 14;
        this.f45b = h;
        j0 j0Var = new j0();
        j0Var.f2451a = 0;
        this.f46c = j0Var;
    }

    public j(Animation animation) {
        this.f44a = 8;
        this.f45b = animation;
        this.f46c = null;
    }

    public j(Animator animator) {
        this.f44a = 8;
        this.f45b = null;
        this.f46c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f44a = 0;
        int size = arrayList.size();
        this.f45b = new int[size];
        this.f46c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f45b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f46c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f44a = 0;
        this.f45b = new int[]{i, i2};
        this.f46c = new float[]{RecyclerView.f1559A0, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f44a = 0;
        this.f45b = new int[]{i, i2, i3};
        this.f46c = new float[]{RecyclerView.f1559A0, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f44a = 6;
        this.f45b = editText;
        W.i iVar = new W.i(editText);
        this.f46c = iVar;
        editText.addTextChangedListener(iVar);
        if (W.a.f921b == null) {
            synchronized (W.a.f920a) {
                try {
                    if (W.a.f921b == null) {
                        W.a aVar = new W.a();
                        try {
                            W.a.f922c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, W.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        W.a.f921b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(W.a.f921b);
    }

    public j(int i) {
        this.f44a = i;
        switch (i) {
            case 15:
                this.f45b = new o.k();
                this.f46c = new o.e();
                break;
            default:
                this.f45b = new SparseIntArray();
                this.f46c = new SparseIntArray();
                break;
        }
    }

    public j(LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A, u uVar) {
        this.f44a = 11;
        this.f46c = layoutInflaterFactory2C0092A;
        this.f45b = uVar;
    }
}
