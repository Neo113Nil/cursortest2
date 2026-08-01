package B;

import K.B0;
import K.C0009e0;
import K.C0024u;
import K.InterfaceC0025v;
import K.J;
import K.z0;
import T.B;
import T.y;
import T.z;
import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.fragment.app.AbstractComponentCallbacksC0060q;
import androidx.fragment.app.K;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.luckyarcade.spinthrow.GameConfig;
import e0.G;
import e0.X;
import e0.d0;
import e0.g0;
import e0.h0;
import g.LayoutInflaterFactory2C0142C;
import g.t;
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC0202m;
import org.xmlpull.v1.XmlPullParserException;
import q.C0318d;
import q.C0320f;
import v.C0348b;
import v.C0355i;

/* loaded from: classes.dex */
public final class j implements InterfaceC0025v, T.p, G.c, InterfaceC0169a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b, reason: collision with root package name */
    public Object f36b;

    /* renamed from: c, reason: collision with root package name */
    public Object f37c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f35a = i;
    }

    public static int z(int i, int i2) {
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

    public void A() {
        ((SparseIntArray) this.f36b).clear();
    }

    public boolean B(View view) {
        G g2 = (G) this.f36b;
        int d2 = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        g0 g0Var = (g0) this.f37c;
        g0Var.f2252b = d2;
        g0Var.f2253c = c2;
        g0Var.f2254d = b2;
        g0Var.f2255e = a2;
        g0Var.f2251a = 24579;
        return g0Var.a();
    }

    public void C(int i, int i2) {
        int[] iArr = (int[]) this.f36b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        x(i3);
        int[] iArr2 = (int[]) this.f36b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f36b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f37c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f37c).get(size);
            int i4 = d0Var.f2216a;
            if (i4 >= i) {
                d0Var.f2216a = i4 + i2;
            }
        }
    }

    public void D(int i, int i2) {
        int[] iArr = (int[]) this.f36b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        x(i3);
        int[] iArr2 = (int[]) this.f36b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f36b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f37c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f37c).get(size);
            int i4 = d0Var.f2216a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f37c).remove(size);
                } else {
                    d0Var.f2216a = i4 - i2;
                }
            }
        }
    }

    public void E(H.h hVar) {
        int i = hVar.f235b;
        Handler handler = (Handler) this.f37c;
        B0.d dVar = (B0.d) this.f36b;
        if (i == 0) {
            handler.post(new H.a(dVar, 0, hVar.f234a));
        } else {
            handler.post(new H.b(dVar, i, 0));
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
        C0355i c0355i;
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
                    c0355i = null;
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
                                    c0355i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0355i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0355i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0355i.f4344d.f4373a = true;
                                    break;
                                case GameConfig.COMBO_EVERY /* 3 */:
                                    c0355i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0355i.f4344d.f4387h0 = 1;
                                    break;
                                case 4:
                                    if (c0355i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0355i.f4342b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0355i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0355i.f4345e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0355i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0355i.f4344d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0355i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0355i.f4343c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0355i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0348b.a(context, xmlResourceParser, c0355i.f4346f);
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
                                ((SparseArray) this.f37c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4439c.put(Integer.valueOf(c0355i.f4341a), c0355i);
                                c0355i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f37c).put(identifier, nVar);
                return;
            }
        }
    }

    public C0024u G(X x2, int i) {
        h0 h0Var;
        C0024u c0024u;
        o.k kVar = (o.k) this.f36b;
        int e2 = kVar.e(x2);
        if (e2 >= 0 && (h0Var = (h0) kVar.j(e2)) != null) {
            int i2 = h0Var.f2262a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                h0Var.f2262a = i3;
                if (i == 4) {
                    c0024u = h0Var.f2263b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0024u = h0Var.f2264c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    h0Var.f2262a = 0;
                    h0Var.f2263b = null;
                    h0Var.f2264c = null;
                    h0.f2261d.c(h0Var);
                }
                return c0024u;
            }
        }
        return null;
    }

    public void H(X x2) {
        h0 h0Var = (h0) ((o.k) this.f36b).getOrDefault(x2, null);
        if (h0Var == null) {
            return;
        }
        h0Var.f2262a &= -2;
    }

    public void I(X x2) {
        o.e eVar = (o.e) this.f37c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (x2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3686c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3683e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3684a = true;
                }
            } else {
                e2--;
            }
        }
        h0 h0Var = (h0) ((o.k) this.f36b).remove(x2);
        if (h0Var != null) {
            h0Var.f2262a = 0;
            h0Var.f2263b = null;
            h0Var.f2264c = null;
            h0.f2261d.c(h0Var);
        }
    }

    @Override // j.InterfaceC0169a
    public boolean a(AbstractC0170b abstractC0170b, MenuItem menuItem) {
        return ((InterfaceC0169a) this.f36b).a(abstractC0170b, menuItem);
    }

    @Override // j.InterfaceC0169a
    public boolean b(AbstractC0170b abstractC0170b, MenuC0202m menuC0202m) {
        return ((InterfaceC0169a) this.f36b).b(abstractC0170b, menuC0202m);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.InterfaceC0025v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B0 c(View view, B0 b02) {
        boolean z2;
        boolean z3;
        B0.s sVar = (B0.s) this.f37c;
        int i = sVar.f152a;
        I.g gVar = (I.g) this.f36b;
        z0 z0Var = b02.f396a;
        C.d f2 = z0Var.f(7);
        C.d f3 = z0Var.f(32);
        int i2 = f2.f158b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f364b;
        bottomSheetBehavior.f1781w = i2;
        boolean e2 = B0.o.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1773o;
        if (z4) {
            int a2 = b02.a();
            bottomSheetBehavior.f1780v = a2;
            paddingBottom = a2 + sVar.f154c;
        }
        int i3 = sVar.f153b;
        boolean z5 = bottomSheetBehavior.f1774p;
        int i4 = f2.f157a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1775q;
        int i5 = f2.f159c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1777s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1778t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1779u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f158b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f363a;
                if (z3) {
                    bottomSheetBehavior.f1771m = f3.f160d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return b02;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = gVar.f363a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return b02;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g.l, java.lang.Object] */
    @Override // j.InterfaceC0169a
    public void d(AbstractC0170b abstractC0170b) {
        ((InterfaceC0169a) this.f36b).d(abstractC0170b);
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) this.f37c;
        if (layoutInflaterFactory2C0142C.f2483w != null) {
            layoutInflaterFactory2C0142C.f2472l.getDecorView().removeCallbacks(layoutInflaterFactory2C0142C.f2484x);
        }
        if (layoutInflaterFactory2C0142C.f2482v != null) {
            C0009e0 c0009e0 = layoutInflaterFactory2C0142C.f2485y;
            if (c0009e0 != null) {
                c0009e0.b();
            }
            C0009e0 a2 = K.X.a(layoutInflaterFactory2C0142C.f2482v);
            a2.a(0.0f);
            layoutInflaterFactory2C0142C.f2485y = a2;
            a2.d(new t(2, this));
        }
        layoutInflaterFactory2C0142C.f2474n.onSupportActionModeFinished(layoutInflaterFactory2C0142C.f2481u);
        layoutInflaterFactory2C0142C.f2481u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0142C.f2438A;
        WeakHashMap weakHashMap = K.X.f419a;
        J.c(viewGroup);
        layoutInflaterFactory2C0142C.J();
    }

    @Override // j.InterfaceC0169a
    public boolean e(AbstractC0170b abstractC0170b, MenuC0202m menuC0202m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0142C) this.f37c).f2438A;
        WeakHashMap weakHashMap = K.X.f419a;
        J.c(viewGroup);
        return ((InterfaceC0169a) this.f36b).e(abstractC0170b, menuC0202m);
    }

    public void f(X x2, C0024u c0024u) {
        o.k kVar = (o.k) this.f36b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2264c = c0024u;
        h0Var.f2262a |= 8;
    }

    public void g(boolean z2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        return (B) this.f36b;
    }

    public void i(boolean z2) {
        K k2 = (K) this.f37c;
        AbstractActivityC0064v abstractActivityC0064v = k2.f1241t.h;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = k2.f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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

    @Override // G.c
    public void l() {
        ((Animator) this.f36b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((androidx.fragment.app.X) this.f37c) + " has been canceled.");
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        K k2 = (K) this.f37c;
        AbstractActivityC0064v abstractActivityC0064v = k2.f1241t.h;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = k2.f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
    public boolean q(CharSequence charSequence, int i, int i2, y yVar) {
        if ((yVar.f835c & 4) > 0) {
            return true;
        }
        if (((B) this.f36b) == null) {
            this.f36b = new B(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((H0.e) this.f37c).getClass();
        ((B) this.f36b).setSpan(new z(yVar), i, i2, 33);
        return true;
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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
        switch (this.f35a) {
            case GameConfig.COMBO_EVERY /* 3 */:
                return "Bounds{lower=" + ((C.d) this.f36b) + " upper=" + ((C.d) this.f37c) + "}";
            case 15:
                String str = "[ ";
                if (((C0320f) this.f36b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0320f) this.f36b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0320f) this.f36b);
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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

    public void v(boolean z2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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

    public void w(boolean z2) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((K) this.f37c).f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            abstractComponentCallbacksC0060q.f().f1233l.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36b).iterator();
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

    public void x(int i) {
        int[] iArr = (int[]) this.f36b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f36b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f36b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f36b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View y(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f36b;
        int d2 = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f2108a) {
                case 0:
                    u2 = g2.f2109b.u(i);
                    break;
                default:
                    u2 = g2.f2109b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            g0 g0Var = (g0) this.f37c;
            g0Var.f2252b = d2;
            g0Var.f2253c = c2;
            g0Var.f2254d = b2;
            g0Var.f2255e = a2;
            if (i3 != 0) {
                g0Var.f2251a = i3;
                if (g0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                g0Var.f2251a = i4;
                if (g0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f35a = i;
        this.f36b = obj;
        this.f37c = obj2;
    }

    public j(C0318d c0318d) {
        this.f35a = 15;
        this.f37c = c0318d;
    }

    public j(K k2) {
        this.f35a = 8;
        this.f36b = new CopyOnWriteArrayList();
        this.f37c = k2;
    }

    public j(G g2) {
        this.f35a = 11;
        this.f36b = g2;
        g0 g0Var = new g0();
        g0Var.f2251a = 0;
        this.f37c = g0Var;
    }

    public j(Animation animation) {
        this.f35a = 7;
        this.f36b = animation;
        this.f37c = null;
    }

    public j(Animator animator) {
        this.f35a = 7;
        this.f36b = null;
        this.f37c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f35a = 0;
        int size = arrayList.size();
        this.f36b = new int[size];
        this.f37c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f36b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f37c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f35a = 0;
        this.f36b = new int[]{i, i2};
        this.f37c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f35a = 0;
        this.f36b = new int[]{i, i2, i3};
        this.f37c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f35a = 5;
        this.f36b = editText;
        V.i iVar = new V.i(editText);
        this.f37c = iVar;
        editText.addTextChangedListener(iVar);
        if (V.a.f843b == null) {
            synchronized (V.a.f842a) {
                try {
                    if (V.a.f843b == null) {
                        V.a aVar = new V.a();
                        try {
                            V.a.f844c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V.a.f843b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V.a.f843b);
    }

    public j(int i) {
        this.f35a = i;
        switch (i) {
            case 12:
                this.f36b = new o.k();
                this.f37c = new o.e();
                break;
            default:
                this.f36b = new SparseIntArray();
                this.f37c = new SparseIntArray();
                break;
        }
    }

    public j(LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C, InterfaceC0169a interfaceC0169a) {
        this.f35a = 13;
        this.f37c = layoutInflaterFactory2C0142C;
        this.f36b = interfaceC0169a;
    }
}
