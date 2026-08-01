package D;

import M.C0015p;
import M.D;
import M.InterfaceC0016q;
import M.Q;
import M.Y;
import M.t0;
import M.v0;
import V.v;
import V.w;
import V.y;
import Z.AbstractComponentCallbacksC0047q;
import Z.I;
import Z.U;
import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
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
import c.C0077a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.AbstractActivityC0110i;
import g.LayoutInflaterFactory2C0101A;
import h0.G;
import h0.X;
import h0.a0;
import h0.e0;
import h0.h0;
import h0.i0;
import j.AbstractC0144a;
import j.C0148e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC0159B;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0255a;
import s.C0268f;
import x.C0301b;
import x.C0309j;

/* loaded from: classes.dex */
public final class j implements InterfaceC0016q, V.o, I.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132a;

    /* renamed from: b, reason: collision with root package name */
    public Object f133b;

    /* renamed from: c, reason: collision with root package name */
    public Object f134c;

    public /* synthetic */ j(int i, Object obj) {
        this.f132a = i;
        this.f134c = obj;
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
        int[] iArr = (int[]) this.f133b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f133b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f133b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f134c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = (e0) ((ArrayList) this.f134c).get(size);
            int i4 = e0Var.f2478a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f134c).remove(size);
                } else {
                    e0Var.f2478a = i4 - i2;
                }
            }
        }
    }

    public void B(AbstractC0144a abstractC0144a) {
        T0.g gVar = (T0.g) this.f133b;
        ((ActionMode.Callback) gVar.f824a).onDestroyActionMode(gVar.g(abstractC0144a));
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) this.f134c;
        if (layoutInflaterFactory2C0101A.f2233w != null) {
            layoutInflaterFactory2C0101A.f2222l.getDecorView().removeCallbacks(layoutInflaterFactory2C0101A.f2234x);
        }
        if (layoutInflaterFactory2C0101A.f2232v != null) {
            Y y2 = layoutInflaterFactory2C0101A.f2235y;
            if (y2 != null) {
                y2.b();
            }
            Y a2 = Q.a(layoutInflaterFactory2C0101A.f2232v);
            a2.a(0.0f);
            layoutInflaterFactory2C0101A.f2235y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0101A.f2231u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0101A.f2188B;
        WeakHashMap weakHashMap = Q.f513a;
        D.c(viewGroup);
        layoutInflaterFactory2C0101A.H();
    }

    public boolean C(AbstractC0144a abstractC0144a, k.m mVar) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0101A) this.f134c).f2188B;
        WeakHashMap weakHashMap = Q.f513a;
        D.c(viewGroup);
        T0.g gVar = (T0.g) this.f133b;
        C0148e g2 = gVar.g(abstractC0144a);
        q.k kVar = (q.k) gVar.d;
        Menu menu = (Menu) kVar.getOrDefault(mVar, null);
        if (menu == null) {
            menu = new MenuC0159B((Context) gVar.f825b, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) gVar.f824a).onPrepareActionMode(g2, menu);
    }

    public void D(J.g gVar) {
        int i = gVar.f369b;
        Handler handler = (Handler) this.f134c;
        E.g gVar2 = (E.g) this.f133b;
        if (i == 0) {
            handler.post(new B.b(gVar2, 3, gVar.f368a));
        } else {
            handler.post(new J.a(gVar2, i, 0));
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
        C0309j c0309j;
        char c2;
        x.o oVar = new x.o();
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
                    c0309j = null;
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
                                    c0309j = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0309j = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0309j = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0309j.d.f4077a = true;
                                    break;
                                case 3:
                                    c0309j = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0309j.d.f4090h0 = 1;
                                    break;
                                case 4:
                                    if (c0309j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0309j.f4048b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0309j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0309j.f4050e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0309j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0309j.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0309j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0309j.f4049c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0309j == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0301b.a(context, xmlResourceParser, c0309j.f4051f);
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
                                ((SparseArray) this.f134c).put(identifier, oVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                oVar.f4140c.put(Integer.valueOf(c0309j.f4047a), c0309j);
                                c0309j = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f134c).put(identifier, oVar);
                return;
            }
        }
    }

    public C0015p F(X x2, int i) {
        i0 i0Var;
        C0015p c0015p;
        q.k kVar = (q.k) this.f133b;
        int e2 = kVar.e(x2);
        if (e2 >= 0 && (i0Var = (i0) kVar.j(e2)) != null) {
            int i2 = i0Var.f2521a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                i0Var.f2521a = i3;
                if (i == 4) {
                    c0015p = i0Var.f2522b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0015p = i0Var.f2523c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    i0Var.f2521a = 0;
                    i0Var.f2522b = null;
                    i0Var.f2523c = null;
                    i0.d.c(i0Var);
                }
                return c0015p;
            }
        }
        return null;
    }

    public void G(X x2) {
        i0 i0Var = (i0) ((q.k) this.f133b).getOrDefault(x2, null);
        if (i0Var == null) {
            return;
        }
        i0Var.f2521a &= -2;
    }

    public void H(X x2) {
        q.e eVar = (q.e) this.f134c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (x2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3352c;
                Object obj = objArr[e2];
                Object obj2 = q.e.f3349e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3350a = true;
                }
            } else {
                e2--;
            }
        }
        i0 i0Var = (i0) ((q.k) this.f133b).remove(x2);
        if (i0Var != null) {
            i0Var.f2521a = 0;
            i0Var.f2522b = null;
            i0Var.f2523c = null;
            i0.d.c(i0Var);
        }
    }

    public void I(int i, int i2, int i3, int i4) {
        AbstractC0255a abstractC0255a = (AbstractC0255a) this.f134c;
        abstractC0255a.d.set(i, i2, i3, i4);
        Rect rect = abstractC0255a.f3324c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void J() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f133b;
        jVar.getClass();
        String str = (String) this.f134c;
        g1.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1252b.remove(str)) != null) {
            jVar.f1251a.remove(num);
        }
        jVar.f1254e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1255f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1256g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = I.a.a(bundle, str, C0077a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0077a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0077a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1253c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public ArrayList K() {
        k1.c v2 = a0.v(0, 7);
        ArrayList arrayList = new ArrayList();
        Iterator it = v2.iterator();
        while (true) {
            k1.b bVar = (k1.b) it;
            if (!bVar.f2843c) {
                return arrayList;
            }
            Object next = bVar.next();
            if (((U0.g[][]) this.f133b)[0][((Number) next).intValue()] == U0.g.f873a) {
                arrayList.add(next);
            }
        }
    }

    public void a(X x2, C0015p c0015p) {
        q.k kVar = (q.k) this.f133b;
        i0 i0Var = (i0) kVar.getOrDefault(x2, null);
        if (i0Var == null) {
            i0Var = i0.a();
            kVar.put(x2, i0Var);
        }
        i0Var.f2523c = c0015p;
        i0Var.f2521a |= 8;
    }

    public void b(boolean z2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.b(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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

    public void c(boolean z2) {
        I i = (I) this.f134c;
        AbstractActivityC0110i abstractActivityC0110i = i.f1048t.f1219b;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = i.f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
    @Override // M.InterfaceC0016q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v0 d(View view, v0 v0Var) {
        boolean z2;
        boolean z3;
        F0.p pVar = (F0.p) this.f134c;
        int i = pVar.f320a;
        K.g gVar = (K.g) this.f133b;
        t0 t0Var = v0Var.f596a;
        E.c f2 = t0Var.f(7);
        E.c f3 = t0Var.f(32);
        int i2 = f2.f163b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f398b;
        bottomSheetBehavior.f1792w = i2;
        boolean e2 = F0.m.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1784o;
        if (z4) {
            int a2 = v0Var.a();
            bottomSheetBehavior.f1791v = a2;
            paddingBottom = a2 + pVar.f322c;
        }
        int i3 = pVar.f321b;
        boolean z5 = bottomSheetBehavior.f1785p;
        int i4 = f2.f162a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1786q;
        int i5 = f2.f164c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1788s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1789t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1790u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f163b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f397a;
                if (z3) {
                    bottomSheetBehavior.f1782m = f3.d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return v0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = gVar.f397a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return v0Var;
    }

    public void e(boolean z2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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

    @Override // V.o
    public boolean g(CharSequence charSequence, int i, int i2, v vVar) {
        if ((vVar.f917c & 4) > 0) {
            return true;
        }
        if (((y) this.f133b) == null) {
            this.f133b = new y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((L0.e) this.f134c).getClass();
        ((y) this.f133b).setSpan(new w(vVar), i, i2, 33);
        return true;
    }

    @Override // V.o
    public Object h() {
        return (y) this.f133b;
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        I i = (I) this.f134c;
        AbstractActivityC0110i abstractActivityC0110i = i.f1048t.f1219b;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = i.f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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

    @Override // I.b
    public void l() {
        ((Animator) this.f133b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f134c) + " has been canceled.");
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((I) this.f134c).f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            abstractComponentCallbacksC0047q.j().f1040l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f133b).iterator();
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

    public U0.f t(int i, U0.g gVar) {
        List list;
        if (i >= 0) {
            int i2 = 7;
            if (i < 7) {
                U0.g[][] gVarArr = (U0.g[][]) this.f133b;
                U0.g gVar2 = gVarArr[0][i];
                U0.g gVar3 = U0.g.f873a;
                if (gVar2 == gVar3) {
                    int i3 = 5;
                    while (true) {
                        if (-1 >= i3) {
                            i3 = -1;
                            break;
                        }
                        if (gVarArr[i3][i] == gVar3) {
                            break;
                        }
                        i3--;
                    }
                    if (i3 == -1) {
                        return null;
                    }
                    gVarArr[i3][i] = gVar;
                    Iterator it = X0.k.y0(new W0.c(0, 1), new W0.c(1, 0), new W0.c(1, 1), new W0.c(1, -1)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            list = X0.s.f992a;
                            break;
                        }
                        W0.c cVar = (W0.c) it.next();
                        int intValue = ((Number) cVar.f950a).intValue();
                        int intValue2 = ((Number) cVar.f951b).intValue();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new W0.c(Integer.valueOf(i3), Integer.valueOf(i)));
                        int i4 = i3 - intValue;
                        for (int i5 = i - intValue2; i4 >= 0 && i4 < 6 && i5 >= 0 && i5 < i2 && gVarArr[i4][i5] == gVar; i5 -= intValue2) {
                            arrayList.add(new W0.c(Integer.valueOf(i4), Integer.valueOf(i5)));
                            i4 -= intValue;
                        }
                        int i6 = i3 + intValue;
                        int i7 = i + intValue2;
                        while (i6 >= 0 && i6 < 6 && i7 >= 0 && i7 < i2 && gVarArr[i6][i7] == gVar) {
                            arrayList.add(new W0.c(Integer.valueOf(i6), Integer.valueOf(i7)));
                            i6 += intValue;
                            i7 += intValue2;
                            i2 = 7;
                        }
                        if (arrayList.size() >= 4) {
                            list = X0.j.F0(arrayList, 4);
                            break;
                        }
                        i2 = 7;
                    }
                    List list2 = list;
                    U0.g gVar4 = (!list2.isEmpty() ? list2 : null) != null ? gVar : null;
                    boolean z2 = gVar4 == null && K().isEmpty();
                    if (gVar4 == null && !z2) {
                        U0.g gVar5 = U0.g.f874b;
                        if (gVar == gVar5) {
                            gVar5 = U0.g.f875c;
                        }
                        this.f134c = gVar5;
                    }
                    return new U0.f(i3, i, gVar, gVar4, z2, list2);
                }
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f132a) {
            case 3:
                return "Bounds{lower=" + ((E.c) this.f133b) + " upper=" + ((E.c) this.f134c) + "}";
            case 17:
                String str = "[ ";
                if (((C0268f) this.f133b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0268f) this.f133b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0268f) this.f133b);
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int[] iArr = (int[]) this.f133b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f133b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f133b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f133b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View v(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f133b;
        int d = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f2374a) {
                case 0:
                    u2 = g2.f2375b.u(i);
                    break;
                default:
                    u2 = g2.f2375b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            h0 h0Var = (h0) this.f134c;
            h0Var.f2507b = d;
            h0Var.f2508c = c2;
            h0Var.d = b2;
            h0Var.f2509e = a2;
            if (i3 != 0) {
                h0Var.f2506a = i3;
                if (h0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                h0Var.f2506a = i4;
                if (h0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void x() {
        ((SparseIntArray) this.f133b).clear();
    }

    public boolean y(View view) {
        G g2 = (G) this.f133b;
        int d = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        h0 h0Var = (h0) this.f134c;
        h0Var.f2507b = d;
        h0Var.f2508c = c2;
        h0Var.d = b2;
        h0Var.f2509e = a2;
        h0Var.f2506a = 24579;
        return h0Var.a();
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f133b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.f133b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f133b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f134c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = (e0) ((ArrayList) this.f134c).get(size);
            int i4 = e0Var.f2478a;
            if (i4 >= i) {
                e0Var.f2478a = i4 + i2;
            }
        }
    }

    public /* synthetic */ j(int i, boolean z2) {
        this.f132a = i;
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f132a = i;
        this.f133b = obj;
        this.f134c = obj2;
    }

    public j(int i) {
        this.f132a = i;
        switch (i) {
            case 12:
                this.f133b = new SparseIntArray();
                this.f134c = new SparseIntArray();
                break;
            case 15:
                this.f133b = new q.k();
                this.f134c = new q.e();
                break;
            default:
                U0.g[][] gVarArr = new U0.g[6][];
                for (int i2 = 0; i2 < 6; i2++) {
                    U0.g[] gVarArr2 = new U0.g[7];
                    for (int i3 = 0; i3 < 7; i3++) {
                        gVarArr2[i3] = U0.g.f873a;
                    }
                    gVarArr[i2] = gVarArr2;
                }
                this.f133b = gVarArr;
                this.f134c = U0.g.f874b;
                break;
        }
    }

    public j(I i) {
        this.f132a = 9;
        this.f133b = new CopyOnWriteArrayList();
        this.f134c = i;
    }

    public j(G g2) {
        this.f132a = 14;
        this.f133b = g2;
        h0 h0Var = new h0();
        h0Var.f2506a = 0;
        this.f134c = h0Var;
    }

    public j(Animation animation) {
        this.f132a = 8;
        this.f133b = animation;
        this.f134c = null;
    }

    public j(Animator animator) {
        this.f132a = 8;
        this.f133b = null;
        this.f134c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f132a = 0;
        int size = arrayList.size();
        this.f133b = new int[size];
        this.f134c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f133b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f134c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f132a = 0;
        this.f133b = new int[]{i, i2};
        this.f134c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f132a = 0;
        this.f133b = new int[]{i, i2, i3};
        this.f134c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f132a = 6;
        this.f133b = editText;
        X.i iVar = new X.i(editText);
        this.f134c = iVar;
        editText.addTextChangedListener(iVar);
        if (X.a.f959b == null) {
            synchronized (X.a.f958a) {
                try {
                    if (X.a.f959b == null) {
                        X.a aVar = new X.a();
                        try {
                            X.a.f960c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, X.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        X.a.f959b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(X.a.f959b);
    }

    public j(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A, T0.g gVar) {
        this.f132a = 11;
        this.f134c = layoutInflaterFactory2C0101A;
        this.f133b = gVar;
    }
}
