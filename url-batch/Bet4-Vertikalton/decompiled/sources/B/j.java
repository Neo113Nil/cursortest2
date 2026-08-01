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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import c.C0081a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.playbag.tripgear.MainActivity;
import g.AbstractActivityC0106i;
import g.LayoutInflaterFactory2C0090A;
import g0.J;
import g0.c0;
import g0.i0;
import g0.l0;
import g0.m0;
import j.AbstractC0142a;
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
import k.MenuC0148B;
import k.MenuC0164m;
import o1.t;
import org.xmlpull.v1.XmlPullParserException;
import q.C0286d;
import q.C0288f;
import v.C0306b;

/* loaded from: classes.dex */
public final class j implements K.r, U.p, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f30a = i;
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
        int[] iArr = (int[]) this.f31b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f31b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f31b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f32c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i0 i0Var = (i0) ((ArrayList) this.f32c).get(size);
            int i4 = i0Var.f2391a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f32c).remove(size);
                } else {
                    i0Var.f2391a = i4 - i2;
                }
            }
        }
    }

    public void B(AbstractC0142a abstractC0142a) {
        u uVar = (u) this.f31b;
        ((ActionMode.Callback) uVar.f874a).onDestroyActionMode(uVar.g(abstractC0142a));
        LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = (LayoutInflaterFactory2C0090A) this.f32c;
        if (layoutInflaterFactory2C0090A.f2131w != null) {
            layoutInflaterFactory2C0090A.f2120l.getDecorView().removeCallbacks(layoutInflaterFactory2C0090A.f2132x);
        }
        if (layoutInflaterFactory2C0090A.f2130v != null) {
            C0005c0 c0005c0 = layoutInflaterFactory2C0090A.f2133y;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            C0005c0 a2 = T.a(layoutInflaterFactory2C0090A.f2130v);
            a2.a(RecyclerView.f1530C0);
            layoutInflaterFactory2C0090A.f2133y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0090A.f2129u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0090A.f2086B;
        WeakHashMap weakHashMap = T.f423a;
        F.c(viewGroup);
        layoutInflaterFactory2C0090A.H();
    }

    public void C(s1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f32c;
        mainActivity.runOnUiThread(new D0.p(5, mainActivity));
    }

    public boolean D(AbstractC0142a abstractC0142a, MenuC0164m menuC0164m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0090A) this.f32c).f2086B;
        WeakHashMap weakHashMap = T.f423a;
        F.c(viewGroup);
        u uVar = (u) this.f31b;
        j.e g2 = uVar.g(abstractC0142a);
        o.k kVar = (o.k) uVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0164m, null);
        if (menu == null) {
            menu = new MenuC0148B((Context) uVar.f875b, menuC0164m);
            kVar.put(menuC0164m, menu);
        }
        return ((ActionMode.Callback) uVar.f874a).onPrepareActionMode(g2, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(s1.j jVar, o1.s sVar) {
        String str;
        o1.n nVar;
        Charset charset;
        String str2;
        int i = MainActivity.F;
        ((MainActivity) this.f32c).getClass();
        final String t2 = MainActivity.t(new byte[]{39, 73, 110, -124, 53, 84, 111, -63, 52, 67, 106});
        final String t3 = MainActivity.t(new byte[]{114, 85, 104, -114, 36, 83, 111, -51, 106, 4, 115, -124, 114});
        final String str3 = ((o1.l) sVar.f3383a.f261c).h;
        t tVar = sVar.f3388g;
        if (tVar != null) {
            B1.h h = tVar.h();
            try {
                switch (tVar.f3393a) {
                    case 0:
                        nVar = (o1.n) tVar.f3395c;
                        break;
                    default:
                        String str4 = (String) tVar.f3395c;
                        if (str4 != null) {
                            Pattern pattern = o1.n.f3323c;
                            try {
                                nVar = h1.d.i(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        nVar = null;
                        break;
                }
                if (nVar != null) {
                    charset = k1.a.f2754a;
                    String[] strArr = nVar.f3325b;
                    int i2 = 0;
                    int B2 = w1.l.B(0, strArr.length - 1, 2);
                    if (B2 >= 0) {
                        while (!k1.l.u(strArr[i2], "charset")) {
                            if (i2 != B2) {
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
                charset = k1.a.f2754a;
                str = h.f(p1.b.q(h, charset));
                w1.l.m(h, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final MainActivity mainActivity = (MainActivity) this.f32c;
        mainActivity.runOnUiThread(new Runnable() { // from class: P0.l
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean A2 = k1.d.A(str6, t2);
                MainActivity mainActivity2 = mainActivity;
                if (A2) {
                    if (k1.d.A(str5, t3)) {
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
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.f1998C.a();
                d1.d.d(sharedPreferences, "access$getPrefs(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.f31b, str6);
                edit.apply();
                mainActivity2.f2002z = str6;
                mainActivity2.w(str6);
            }
        });
    }

    public void F(H.h hVar) {
        int i = hVar.f271b;
        Handler handler = (Handler) this.f32c;
        C.g gVar = (C.g) this.f31b;
        if (i == 0) {
            handler.post(new H.a(gVar, 0, hVar.f270a));
        } else {
            handler.post(new H.b(i, 0, gVar));
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
                                    jVar.d.f3959a = true;
                                    break;
                                case 3:
                                    jVar = v.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVar.d.f3972h0 = 1;
                                    break;
                                case 4:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f3929b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f3931e.a(context, Xml.asAttributeSet(xmlResourceParser));
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
                                    jVar.f3930c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0306b.a(context, xmlResourceParser, jVar.f3932f);
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
                                ((SparseArray) this.f32c).put(identifier, oVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                oVar.f4020c.put(Integer.valueOf(jVar.f3928a), jVar);
                                jVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f32c).put(identifier, oVar);
                return;
            }
        }
    }

    public C0019q H(c0 c0Var, int i) {
        m0 m0Var;
        C0019q c0019q;
        o.k kVar = (o.k) this.f31b;
        int e2 = kVar.e(c0Var);
        if (e2 >= 0 && (m0Var = (m0) kVar.j(e2)) != null) {
            int i2 = m0Var.f2428a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                m0Var.f2428a = i3;
                if (i == 4) {
                    c0019q = m0Var.f2429b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0019q = m0Var.f2430c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    m0Var.f2428a = 0;
                    m0Var.f2429b = null;
                    m0Var.f2430c = null;
                    m0.d.c(m0Var);
                }
                return c0019q;
            }
        }
        return null;
    }

    public void I(c0 c0Var) {
        m0 m0Var = (m0) ((o.k) this.f31b).getOrDefault(c0Var, null);
        if (m0Var == null) {
            return;
        }
        m0Var.f2428a &= -2;
    }

    public void J(c0 c0Var) {
        o.e eVar = (o.e) this.f32c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (c0Var == eVar.f(e2)) {
                Object[] objArr = eVar.f3226c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3223e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3224a = true;
                }
            } else {
                e2--;
            }
        }
        m0 m0Var = (m0) ((o.k) this.f31b).remove(c0Var);
        if (m0Var != null) {
            m0Var.f2428a = 0;
            m0Var.f2429b = null;
            m0Var.f2430c = null;
            m0.d.c(m0Var);
        }
    }

    public void K() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f31b;
        jVar.getClass();
        String str = (String) this.f32c;
        d1.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1167b.remove(str)) != null) {
            jVar.f1166a.remove(num);
        }
        jVar.f1169e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1170f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1171g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0081a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0081a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0081a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1168c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(c0 c0Var, C0019q c0019q) {
        o.k kVar = (o.k) this.f31b;
        m0 m0Var = (m0) kVar.getOrDefault(c0Var, null);
        if (m0Var == null) {
            m0Var = m0.a();
            kVar.put(c0Var, m0Var);
        }
        m0Var.f2430c = c0019q;
        m0Var.f2428a |= 8;
    }

    public void b() {
        int[] iArr = (int[]) this.f31b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f32c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0 c(View view, z0 z0Var) {
        boolean z2;
        boolean z3;
        D0.r rVar = (D0.r) this.f32c;
        int i = rVar.f221a;
        I.g gVar = (I.g) this.f31b;
        x0 x0Var = z0Var.f519a;
        C.c f2 = x0Var.f(7);
        C.c f3 = x0Var.f(32);
        int i2 = f2.f108b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f300b;
        bottomSheetBehavior.f1713w = i2;
        boolean e2 = D0.n.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1705o;
        if (z4) {
            int a2 = z0Var.a();
            bottomSheetBehavior.f1712v = a2;
            paddingBottom = a2 + rVar.f223c;
        }
        int i3 = rVar.f222b;
        boolean z5 = bottomSheetBehavior.f1706p;
        int i4 = f2.f107a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1707q;
        int i5 = f2.f109c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1709s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1710t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1711u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f108b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f299a;
                if (z3) {
                    bottomSheetBehavior.f1703m = f3.d;
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
        z3 = gVar.f299a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return z0Var;
    }

    public void d(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        I i = (I) this.f32c;
        AbstractActivityC0106i abstractActivityC0106i = i.f959t.f1130f;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = i.f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        return (A) this.f31b;
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        I i = (I) this.f32c;
        AbstractActivityC0106i abstractActivityC0106i = i.f959t.f1130f;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = i.f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        ((Animator) this.f31b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f32c) + " has been canceled.");
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
    public boolean q(CharSequence charSequence, int i, int i2, x xVar) {
        if ((xVar.f883c & 4) > 0) {
            return true;
        }
        if (((A) this.f31b) == null) {
            this.f31b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((J0.e) this.f32c).getClass();
        ((A) this.f31b).setSpan(new y(xVar), i, i2, 33);
        return true;
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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

    public void t(boolean z2) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((I) this.f32c).f961v;
        if (abstractComponentCallbacksC0051q != null) {
            abstractComponentCallbacksC0051q.j().f951l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31b).iterator();
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
        switch (this.f30a) {
            case 3:
                return "Bounds{lower=" + ((C.c) this.f31b) + " upper=" + ((C.c) this.f32c) + "}";
            case 16:
                String str = "[ ";
                if (((C0288f) this.f31b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0288f) this.f31b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0288f) this.f31b);
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int[] iArr = (int[]) this.f31b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f31b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f31b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f31b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View v(int i, int i2, int i3, int i4) {
        View u2;
        J j2 = (J) this.f31b;
        int d = j2.d();
        int c2 = j2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (j2.f2270a) {
                case 0:
                    u2 = j2.f2271b.u(i);
                    break;
                default:
                    u2 = j2.f2271b.u(i);
                    break;
            }
            int b2 = j2.b(u2);
            int a2 = j2.a(u2);
            l0 l0Var = (l0) this.f32c;
            l0Var.f2423b = d;
            l0Var.f2424c = c2;
            l0Var.d = b2;
            l0Var.f2425e = a2;
            if (i3 != 0) {
                l0Var.f2422a = i3;
                if (l0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                l0Var.f2422a = i4;
                if (l0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void x() {
        ((SparseIntArray) this.f31b).clear();
    }

    public boolean y(View view) {
        J j2 = (J) this.f31b;
        int d = j2.d();
        int c2 = j2.c();
        int b2 = j2.b(view);
        int a2 = j2.a(view);
        l0 l0Var = (l0) this.f32c;
        l0Var.f2423b = d;
        l0Var.f2424c = c2;
        l0Var.d = b2;
        l0Var.f2425e = a2;
        l0Var.f2422a = 24579;
        return l0Var.a();
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f31b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f31b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f31b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f32c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i0 i0Var = (i0) ((ArrayList) this.f32c).get(size);
            int i4 = i0Var.f2391a;
            if (i4 >= i) {
                i0Var.f2391a = i4 + i2;
            }
        }
    }

    public /* synthetic */ j(LayoutInflater.Factory2 factory2, Object obj, int i) {
        this.f30a = i;
        this.f32c = factory2;
        this.f31b = obj;
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f30a = i;
        this.f31b = obj;
        this.f32c = obj2;
    }

    public j(C0286d c0286d) {
        this.f30a = 16;
        this.f32c = c0286d;
    }

    public j(I i) {
        this.f30a = 9;
        this.f31b = new CopyOnWriteArrayList();
        this.f32c = i;
    }

    public j(J j2) {
        this.f30a = 14;
        this.f31b = j2;
        l0 l0Var = new l0();
        l0Var.f2422a = 0;
        this.f32c = l0Var;
    }

    public j(Animation animation) {
        this.f30a = 8;
        this.f31b = animation;
        this.f32c = null;
    }

    public j(Animator animator) {
        this.f30a = 8;
        this.f31b = null;
        this.f32c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f30a = 0;
        int size = arrayList.size();
        this.f31b = new int[size];
        this.f32c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f31b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f32c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f30a = 0;
        this.f31b = new int[]{i, i2};
        this.f32c = new float[]{RecyclerView.f1530C0, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f30a = 0;
        this.f31b = new int[]{i, i2, i3};
        this.f32c = new float[]{RecyclerView.f1530C0, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f30a = 6;
        this.f31b = editText;
        W.i iVar = new W.i(editText);
        this.f32c = iVar;
        editText.addTextChangedListener(iVar);
        if (W.a.f892b == null) {
            synchronized (W.a.f891a) {
                try {
                    if (W.a.f892b == null) {
                        W.a aVar = new W.a();
                        try {
                            W.a.f893c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, W.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        W.a.f892b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(W.a.f892b);
    }

    public j(int i) {
        this.f30a = i;
        switch (i) {
            case 15:
                this.f31b = new o.k();
                this.f32c = new o.e();
                break;
            default:
                this.f31b = new SparseIntArray();
                this.f32c = new SparseIntArray();
                break;
        }
    }
}
