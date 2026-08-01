package B;

import K.E;
import K.InterfaceC0017s;
import K.S;
import K.Z;
import K.u0;
import K.w0;
import T.A;
import T.C;
import T.w;
import X.AbstractComponentCallbacksC0048q;
import X.I;
import X.U;
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
import c.C0083a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.F;
import f0.W;
import f0.c0;
import f0.f0;
import f0.g0;
import g.AbstractActivityC0136i;
import g.z;
import i0.InterfaceC0144c;
import i0.InterfaceC0145d;
import j.AbstractC0147a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC0151B;
import k.MenuC0167m;
import org.xmlpull.v1.XmlPullParserException;
import q.C0316d;
import q.C0318f;
import v.C0363b;
import v.C0370i;

/* loaded from: classes.dex */
public final class j implements InterfaceC0017s, T.q, G.b, InterfaceC0145d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55a;

    /* renamed from: b, reason: collision with root package name */
    public Object f56b;

    /* renamed from: c, reason: collision with root package name */
    public Object f57c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f55a = i;
    }

    public static int x(int i, int i2) {
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
        int[] iArr = (int[]) this.f56b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        v(i3);
        int[] iArr2 = (int[]) this.f56b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f56b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f57c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) ((ArrayList) this.f57c).get(size);
            int i4 = c0Var.f2227a;
            if (i4 >= i) {
                c0Var.f2227a = i4 + i2;
            }
        }
    }

    public void B(int i, int i2) {
        int[] iArr = (int[]) this.f56b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        v(i3);
        int[] iArr2 = (int[]) this.f56b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f56b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f57c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) ((ArrayList) this.f57c).get(size);
            int i4 = c0Var.f2227a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f57c).remove(size);
                } else {
                    c0Var.f2227a = i4 - i2;
                }
            }
        }
    }

    public void C(AbstractC0147a abstractC0147a) {
        w wVar = (w) this.f56b;
        ((ActionMode.Callback) wVar.f845a).onDestroyActionMode(wVar.e(abstractC0147a));
        z zVar = (z) this.f57c;
        if (zVar.f2536w != null) {
            zVar.f2525l.getDecorView().removeCallbacks(zVar.f2537x);
        }
        if (zVar.f2535v != null) {
            Z z2 = zVar.f2538y;
            if (z2 != null) {
                z2.b();
            }
            Z a2 = S.a(zVar.f2535v);
            a2.a(0.0f);
            zVar.f2538y = a2;
            a2.d(new g.q(2, this));
        }
        zVar.f2534u = null;
        ViewGroup viewGroup = zVar.f2491A;
        WeakHashMap weakHashMap = S.f365a;
        E.c(viewGroup);
        zVar.H();
    }

    public boolean D(AbstractC0147a abstractC0147a, MenuC0167m menuC0167m) {
        ViewGroup viewGroup = ((z) this.f57c).f2491A;
        WeakHashMap weakHashMap = S.f365a;
        E.c(viewGroup);
        w wVar = (w) this.f56b;
        j.e e2 = wVar.e(abstractC0147a);
        o.k kVar = (o.k) wVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0167m, null);
        if (menu == null) {
            menu = new MenuC0151B((Context) wVar.f846b, menuC0167m);
            kVar.put(menuC0167m, menu);
        }
        return ((ActionMode.Callback) wVar.f845a).onPrepareActionMode(e2, menu);
    }

    public void E(H.h hVar) {
        int i = hVar.f231b;
        Handler handler = (Handler) this.f57c;
        A0.h hVar2 = (A0.h) this.f56b;
        if (i != 0) {
            handler.post(new H.b(hVar2, i, 0));
        } else {
            handler.post(new H.a(hVar2, 0, hVar.f230a));
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
        C0370i c0370i;
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
                    c0370i = null;
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
                                    c0370i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0370i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0370i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0370i.d.f3910a = true;
                                    break;
                                case 3:
                                    c0370i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0370i.d.f3923h0 = 1;
                                    break;
                                case 4:
                                    if (c0370i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0370i.f3880b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0370i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0370i.f3882e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0370i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0370i.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0370i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0370i.f3881c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0370i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0363b.a(context, xmlResourceParser, c0370i.f3883f);
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
                                ((SparseArray) this.f57c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f3972c.put(Integer.valueOf(c0370i.f3879a), c0370i);
                                c0370i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f57c).put(identifier, nVar);
                return;
            }
        }
    }

    public K.r G(W w2, int i) {
        g0 g0Var;
        K.r rVar;
        o.k kVar = (o.k) this.f56b;
        int e2 = kVar.e(w2);
        if (e2 >= 0 && (g0Var = (g0) kVar.j(e2)) != null) {
            int i2 = g0Var.f2264a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                g0Var.f2264a = i3;
                if (i == 4) {
                    rVar = g0Var.f2265b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    rVar = g0Var.f2266c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    g0Var.f2264a = 0;
                    g0Var.f2265b = null;
                    g0Var.f2266c = null;
                    g0.d.c(g0Var);
                }
                return rVar;
            }
        }
        return null;
    }

    public void H(W w2) {
        g0 g0Var = (g0) ((o.k) this.f56b).getOrDefault(w2, null);
        if (g0Var == null) {
            return;
        }
        g0Var.f2264a &= -2;
    }

    public void I(W w2) {
        o.e eVar = (o.e) this.f57c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (w2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3217c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3214e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3215a = true;
                }
            } else {
                e2--;
            }
        }
        g0 g0Var = (g0) ((o.k) this.f56b).remove(w2);
        if (g0Var != null) {
            g0Var.f2264a = 0;
            g0Var.f2265b = null;
            g0Var.f2266c = null;
            g0.d.c(g0Var);
        }
    }

    public void J() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f56b;
        jVar.getClass();
        String str = (String) this.f57c;
        g1.f.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1191b.remove(str)) != null) {
            jVar.f1190a.remove(num);
        }
        jVar.f1193e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1194f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1195g;
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
        if (jVar.f1192c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // T.q
    public Object a() {
        return (C) this.f56b;
    }

    @Override // T.q
    public boolean b(CharSequence charSequence, int i, int i2, T.z zVar) {
        if ((zVar.f854c & 4) > 0) {
            return true;
        }
        if (((C) this.f56b) == null) {
            this.f56b = new C(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((O0.e) this.f57c).getClass();
        ((C) this.f56b).setSpan(new A(zVar), i, i2, 33);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.InterfaceC0017s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0 c(View view, w0 w0Var) {
        boolean z2;
        boolean z3;
        I0.n nVar = (I0.n) this.f57c;
        int i = nVar.f347a;
        I.h hVar = (I.h) this.f56b;
        u0 u0Var = w0Var.f451a;
        C.d f2 = u0Var.f(7);
        C.d f3 = u0Var.f(32);
        int i2 = f2.f95b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f263b;
        bottomSheetBehavior.f1795w = i2;
        boolean e2 = I0.k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1787o;
        if (z4) {
            int a2 = w0Var.a();
            bottomSheetBehavior.f1794v = a2;
            paddingBottom = a2 + nVar.f349c;
        }
        int i3 = nVar.f348b;
        boolean z5 = bottomSheetBehavior.f1788p;
        int i4 = f2.f94a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1789q;
        int i5 = f2.f96c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1791s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1792t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1793u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f95b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = hVar.f262a;
                if (z3) {
                    bottomSheetBehavior.f1785m = f3.d;
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
        z3 = hVar.f262a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return w0Var;
    }

    public void d(W w2, K.r rVar) {
        o.k kVar = (o.k) this.f56b;
        g0 g0Var = (g0) kVar.getOrDefault(w2, null);
        if (g0Var == null) {
            g0Var = g0.a();
            kVar.put(w2, g0Var);
        }
        g0Var.f2266c = rVar;
        g0Var.f2264a |= 8;
    }

    public void e(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        I i = (I) this.f57c;
        AbstractActivityC0136i abstractActivityC0136i = i.f965t.f1136b;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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

    @Override // i0.InterfaceC0145d
    public void j(InterfaceC0144c interfaceC0144c) {
        Object[] objArr = (Object[]) this.f57c;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                interfaceC0144c.f(i);
            } else if (obj instanceof byte[]) {
                interfaceC0144c.e(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                interfaceC0144c.h(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                interfaceC0144c.h(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                interfaceC0144c.r(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                interfaceC0144c.r(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                interfaceC0144c.r(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                interfaceC0144c.r(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                interfaceC0144c.g((String) obj, i);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                interfaceC0144c.r(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    @Override // i0.InterfaceC0145d
    public String k() {
        return (String) this.f56b;
    }

    @Override // G.b
    public void l() {
        ((Animator) this.f56b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f57c) + " has been canceled.");
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        I i = (I) this.f57c;
        AbstractActivityC0136i abstractActivityC0136i = i.f965t.f1136b;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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
        switch (this.f55a) {
            case 3:
                return "Bounds{lower=" + ((C.d) this.f56b) + " upper=" + ((C.d) this.f57c) + "}";
            case 16:
                String str = "[ ";
                if (((C0318f) this.f56b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0318f) this.f56b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0318f) this.f56b);
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f57c).f967v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f957l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
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

    public void v(int i) {
        int[] iArr = (int[]) this.f56b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f56b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f56b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f56b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View w(int i, int i2, int i3, int i4) {
        View u2;
        F f2 = (F) this.f56b;
        int d = f2.d();
        int c2 = f2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (f2.f2137a) {
                case 0:
                    u2 = f2.f2138b.u(i);
                    break;
                default:
                    u2 = f2.f2138b.u(i);
                    break;
            }
            int b2 = f2.b(u2);
            int a2 = f2.a(u2);
            f0 f0Var = (f0) this.f57c;
            f0Var.f2256b = d;
            f0Var.f2257c = c2;
            f0Var.d = b2;
            f0Var.f2258e = a2;
            if (i3 != 0) {
                f0Var.f2255a = i3;
                if (f0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                f0Var.f2255a = i4;
                if (f0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void y() {
        ((SparseIntArray) this.f56b).clear();
    }

    public boolean z(View view) {
        F f2 = (F) this.f56b;
        int d = f2.d();
        int c2 = f2.c();
        int b2 = f2.b(view);
        int a2 = f2.a(view);
        f0 f0Var = (f0) this.f57c;
        f0Var.f2256b = d;
        f0Var.f2257c = c2;
        f0Var.d = b2;
        f0Var.f2258e = a2;
        f0Var.f2255a = 24579;
        return f0Var.a();
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f55a = i;
        this.f56b = obj;
        this.f57c = obj2;
    }

    public j(String str, Object[] objArr) {
        this.f55a = 15;
        g1.f.e(str, "query");
        this.f56b = str;
        this.f57c = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        this(str, (Object[]) null);
        this.f55a = 15;
        g1.f.e(str, "query");
    }

    public j(C0316d c0316d) {
        this.f55a = 16;
        this.f57c = c0316d;
    }

    public j(I i) {
        this.f55a = 8;
        this.f56b = new CopyOnWriteArrayList();
        this.f57c = i;
    }

    public j(F f2) {
        this.f55a = 12;
        this.f56b = f2;
        f0 f0Var = new f0();
        f0Var.f2255a = 0;
        this.f57c = f0Var;
    }

    public j(Animation animation) {
        this.f55a = 7;
        this.f56b = animation;
        this.f57c = null;
    }

    public j(Animator animator) {
        this.f55a = 7;
        this.f56b = null;
        this.f57c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f55a = 0;
        int size = arrayList.size();
        this.f56b = new int[size];
        this.f57c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f56b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f57c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f55a = 0;
        this.f56b = new int[]{i, i2};
        this.f57c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f55a = 0;
        this.f56b = new int[]{i, i2, i3};
        this.f57c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f55a = 5;
        this.f56b = editText;
        V.i iVar = new V.i(editText);
        this.f57c = iVar;
        editText.addTextChangedListener(iVar);
        if (V.a.f866b == null) {
            synchronized (V.a.f865a) {
                try {
                    if (V.a.f866b == null) {
                        V.a aVar = new V.a();
                        try {
                            V.a.f867c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V.a.f866b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V.a.f866b);
    }

    public j(int i) {
        this.f55a = i;
        switch (i) {
            case 13:
                this.f56b = new o.k();
                this.f57c = new o.e();
                break;
            default:
                this.f56b = new SparseIntArray();
                this.f57c = new SparseIntArray();
                break;
        }
    }

    public j(z zVar, w wVar) {
        this.f55a = 14;
        this.f57c = zVar;
        this.f56b = wVar;
    }
}
