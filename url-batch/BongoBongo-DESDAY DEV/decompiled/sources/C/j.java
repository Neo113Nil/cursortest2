package C;

import L.C0005c0;
import L.C0019q;
import L.F;
import L.T;
import L.x0;
import L.z0;
import V.w;
import V.x;
import V.z;
import Z.AbstractComponentCallbacksC0050q;
import Z.I;
import Z.U;
import android.animation.Animator;
import android.content.Context;
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
import c.C0087a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.A;
import g.AbstractActivityC0106i;
import h0.H;
import h0.a0;
import h0.h0;
import h0.k0;
import h0.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractC0147a;
import l.MenuC0153B;
import l.MenuC0169m;
import org.xmlpull.v1.XmlPullParserException;
import r.C0289d;
import r.C0291f;
import w.C0309b;

/* loaded from: classes.dex */
public final class j implements L.r, V.p, H.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85a;

    /* renamed from: b, reason: collision with root package name */
    public Object f86b;

    /* renamed from: c, reason: collision with root package name */
    public Object f87c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f85a = i;
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
        int[] iArr = (int[]) this.f86b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f86b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f86b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f87c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h0 h0Var = (h0) ((ArrayList) this.f87c).get(size);
            int i4 = h0Var.f2514a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f87c).remove(size);
                } else {
                    h0Var.f2514a = i4 - i2;
                }
            }
        }
    }

    public void B(AbstractC0147a abstractC0147a) {
        S0.g gVar = (S0.g) this.f86b;
        ((ActionMode.Callback) gVar.f822a).onDestroyActionMode(gVar.g(abstractC0147a));
        A a2 = (A) this.f87c;
        if (a2.f2246w != null) {
            a2.f2235l.getDecorView().removeCallbacks(a2.f2247x);
        }
        if (a2.f2245v != null) {
            C0005c0 c0005c0 = a2.f2248y;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            C0005c0 a3 = T.a(a2.f2245v);
            a3.a(RecyclerView.A0);
            a2.f2248y = a3;
            a3.d(new g.r(2, this));
        }
        a2.f2244u = null;
        ViewGroup viewGroup = a2.f2201B;
        WeakHashMap weakHashMap = T.f490a;
        F.c(viewGroup);
        a2.H();
    }

    public boolean C(AbstractC0147a abstractC0147a, MenuC0169m menuC0169m) {
        ViewGroup viewGroup = ((A) this.f87c).f2201B;
        WeakHashMap weakHashMap = T.f490a;
        F.c(viewGroup);
        S0.g gVar = (S0.g) this.f86b;
        k.e g2 = gVar.g(abstractC0147a);
        p.k kVar = (p.k) gVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0169m, null);
        if (menu == null) {
            menu = new MenuC0153B((Context) gVar.f823b, menuC0169m);
            kVar.put(menuC0169m, menu);
        }
        return ((ActionMode.Callback) gVar.f822a).onPrepareActionMode(g2, menu);
    }

    public void D(I.g gVar) {
        int i = gVar.f331b;
        Handler handler = (Handler) this.f87c;
        D.g gVar2 = (D.g) this.f86b;
        if (i == 0) {
            handler.post(new A.b(gVar2, 3, gVar.f330a));
        } else {
            handler.post(new I.a(gVar2, i, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        w.j jVar;
        char c2;
        w.o oVar = new w.o();
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
                                    jVar = w.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    jVar = w.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    jVar = w.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVar.d.f4106a = true;
                                    break;
                                case 3:
                                    jVar = w.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jVar.d.f4120h0 = 1;
                                    break;
                                case 4:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f4077b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jVar.f4079e.a(context, Xml.asAttributeSet(xmlResourceParser));
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
                                    jVar.f4078c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (jVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0309b.a(context, xmlResourceParser, jVar.f4080f);
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
                                ((SparseArray) this.f87c).put(identifier, oVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                oVar.f4171c.put(Integer.valueOf(jVar.f4076a), jVar);
                                jVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f87c).put(identifier, oVar);
                return;
            }
        }
    }

    public C0019q F(a0 a0Var, int i) {
        l0 l0Var;
        C0019q c0019q;
        p.k kVar = (p.k) this.f86b;
        int e2 = kVar.e(a0Var);
        if (e2 >= 0 && (l0Var = (l0) kVar.j(e2)) != null) {
            int i2 = l0Var.f2553a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                l0Var.f2553a = i3;
                if (i == 4) {
                    c0019q = l0Var.f2554b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0019q = l0Var.f2555c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    l0Var.f2553a = 0;
                    l0Var.f2554b = null;
                    l0Var.f2555c = null;
                    l0.d.c(l0Var);
                }
                return c0019q;
            }
        }
        return null;
    }

    public void G(a0 a0Var) {
        l0 l0Var = (l0) ((p.k) this.f86b).getOrDefault(a0Var, null);
        if (l0Var == null) {
            return;
        }
        l0Var.f2553a &= -2;
    }

    public void H(a0 a0Var) {
        p.e eVar = (p.e) this.f87c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (a0Var == eVar.f(e2)) {
                Object[] objArr = eVar.f3453c;
                Object obj = objArr[e2];
                Object obj2 = p.e.f3450e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3451a = true;
                }
            } else {
                e2--;
            }
        }
        l0 l0Var = (l0) ((p.k) this.f86b).remove(a0Var);
        if (l0Var != null) {
            l0Var.f2553a = 0;
            l0Var.f2554b = null;
            l0Var.f2555c = null;
            l0.d.c(l0Var);
        }
    }

    public void I() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f86b;
        jVar.getClass();
        String str = (String) this.f87c;
        h1.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1242b.remove(str)) != null) {
            jVar.f1241a.remove(num);
        }
        jVar.f1244e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1245f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1246g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = H.a.a(bundle, str, C0087a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0087a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0087a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1243c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(a0 a0Var, C0019q c0019q) {
        p.k kVar = (p.k) this.f86b;
        l0 l0Var = (l0) kVar.getOrDefault(a0Var, null);
        if (l0Var == null) {
            l0Var = l0.a();
            kVar.put(a0Var, l0Var);
        }
        l0Var.f2555c = c0019q;
        l0Var.f2553a |= 8;
    }

    public void b() {
        int[] iArr = (int[]) this.f86b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f87c = null;
    }

    public void c(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
    @Override // L.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0 d(View view, z0 z0Var) {
        boolean z2;
        boolean z3;
        E0.q qVar = (E0.q) this.f87c;
        int i = qVar.f226a;
        J.g gVar = (J.g) this.f86b;
        x0 x0Var = z0Var.f589a;
        D.c f2 = x0Var.f(7);
        D.c f3 = x0Var.f(32);
        int i2 = f2.f115b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f360b;
        bottomSheetBehavior.f1809w = i2;
        boolean e2 = E0.n.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1801o;
        if (z4) {
            int a2 = z0Var.a();
            bottomSheetBehavior.f1808v = a2;
            paddingBottom = a2 + qVar.f228c;
        }
        int i3 = qVar.f227b;
        boolean z5 = bottomSheetBehavior.f1802p;
        int i4 = f2.f114a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1803q;
        int i5 = f2.f116c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1805s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1806t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1807u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f115b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f359a;
                if (z3) {
                    bottomSheetBehavior.f1799m = f3.d;
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
        z3 = gVar.f359a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return z0Var;
    }

    public void e(boolean z2) {
        I i = (I) this.f87c;
        AbstractActivityC0106i abstractActivityC0106i = i.f1030t.f1210f;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = i.f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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

    @Override // V.p
    public boolean f(CharSequence charSequence, int i, int i2, w wVar) {
        if ((wVar.f932c & 4) > 0) {
            return true;
        }
        if (((z) this.f86b) == null) {
            this.f86b = new z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((K0.e) this.f87c).getClass();
        ((z) this.f86b).setSpan(new x(wVar), i, i2, 33);
        return true;
    }

    @Override // V.p
    public Object g() {
        return (z) this.f86b;
    }

    public void h(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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

    public void i(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        I i = (I) this.f87c;
        AbstractActivityC0106i abstractActivityC0106i = i.f1030t.f1210f;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = i.f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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

    @Override // H.b
    public void m() {
        ((Animator) this.f86b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f87c) + " has been canceled.");
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f87c).f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1022l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f86b).iterator();
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
        switch (this.f85a) {
            case 3:
                return "Bounds{lower=" + ((D.c) this.f86b) + " upper=" + ((D.c) this.f87c) + "}";
            case 15:
                String str = "[ ";
                if (((C0291f) this.f86b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0291f) this.f86b).f3562h[i] + " ";
                    }
                }
                return str + "] " + ((C0291f) this.f86b);
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int[] iArr = (int[]) this.f86b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f86b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f86b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f86b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View v(int i, int i2, int i3, int i4) {
        View u2;
        H h2 = (H) this.f86b;
        int d = h2.d();
        int c2 = h2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (h2.f2391a) {
                case 0:
                    u2 = h2.f2392b.u(i);
                    break;
                default:
                    u2 = h2.f2392b.u(i);
                    break;
            }
            int b2 = h2.b(u2);
            int a2 = h2.a(u2);
            k0 k0Var = (k0) this.f87c;
            k0Var.f2548b = d;
            k0Var.f2549c = c2;
            k0Var.d = b2;
            k0Var.f2550e = a2;
            if (i3 != 0) {
                k0Var.f2547a = i3;
                if (k0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                k0Var.f2547a = i4;
                if (k0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void x() {
        ((SparseIntArray) this.f86b).clear();
    }

    public boolean y(View view) {
        H h2 = (H) this.f86b;
        int d = h2.d();
        int c2 = h2.c();
        int b2 = h2.b(view);
        int a2 = h2.a(view);
        k0 k0Var = (k0) this.f87c;
        k0Var.f2548b = d;
        k0Var.f2549c = c2;
        k0Var.d = b2;
        k0Var.f2550e = a2;
        k0Var.f2547a = 24579;
        return k0Var.a();
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f86b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f86b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f86b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f87c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h0 h0Var = (h0) ((ArrayList) this.f87c).get(size);
            int i4 = h0Var.f2514a;
            if (i4 >= i) {
                h0Var.f2514a = i4 + i2;
            }
        }
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f85a = i;
        this.f86b = obj;
        this.f87c = obj2;
    }

    public j(C0289d c0289d) {
        this.f85a = 15;
        this.f87c = c0289d;
    }

    public j(I i) {
        this.f85a = 8;
        this.f86b = new CopyOnWriteArrayList();
        this.f87c = i;
    }

    public j(H h2) {
        this.f85a = 13;
        this.f86b = h2;
        k0 k0Var = new k0();
        k0Var.f2547a = 0;
        this.f87c = k0Var;
    }

    public j(Animation animation) {
        this.f85a = 7;
        this.f86b = animation;
        this.f87c = null;
    }

    public j(Animator animator) {
        this.f85a = 7;
        this.f86b = null;
        this.f87c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f85a = 0;
        int size = arrayList.size();
        this.f86b = new int[size];
        this.f87c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f86b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f87c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f85a = 0;
        this.f86b = new int[]{i, i2};
        this.f87c = new float[]{RecyclerView.A0, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f85a = 0;
        this.f86b = new int[]{i, i2, i3};
        this.f87c = new float[]{RecyclerView.A0, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f85a = 5;
        this.f86b = editText;
        X.i iVar = new X.i(editText);
        this.f87c = iVar;
        editText.addTextChangedListener(iVar);
        if (X.a.f963b == null) {
            synchronized (X.a.f962a) {
                try {
                    if (X.a.f963b == null) {
                        X.a aVar = new X.a();
                        try {
                            X.a.f964c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, X.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        X.a.f963b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(X.a.f963b);
    }

    public j(int i) {
        this.f85a = i;
        switch (i) {
            case 14:
                this.f86b = new p.k();
                this.f87c = new p.e();
                break;
            default:
                this.f86b = new SparseIntArray();
                this.f87c = new SparseIntArray();
                break;
        }
    }

    public j(A a2, S0.g gVar) {
        this.f85a = 10;
        this.f87c = a2;
        this.f86b = gVar;
    }
}
