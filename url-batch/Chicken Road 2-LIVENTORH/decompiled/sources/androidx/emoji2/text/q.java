package androidx.emoji2.text;

import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.fragment.app.k0;
import androidx.fragment.app.v0;
import f1.b1;
import f1.h0;
import f1.h1;
import f1.k1;
import f1.l1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.l0;
import n0.p0;
import n0.q1;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q implements r, j0.b, n0.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f345f;

    /* renamed from: g, reason: collision with root package name */
    public Object f346g;

    /* renamed from: h, reason: collision with root package name */
    public Object f347h;

    public /* synthetic */ q(int i, Object obj) {
        this.f345f = i;
        this.f347h = obj;
    }

    public static int v(int i, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    public void A(j.a aVar) {
        a0.j jVar = (a0.j) this.f346g;
        ((ActionMode.Callback) jVar.f100f).onDestroyActionMode(jVar.h(aVar));
        g.c0 c0Var = (g.c0) this.f347h;
        if (c0Var.B != null) {
            c0Var.f1596q.getDecorView().removeCallbacks(c0Var.C);
        }
        if (c0Var.A != null) {
            p0 p0Var = c0Var.D;
            if (p0Var != null) {
                p0Var.b();
            }
            p0 a2 = l0.a(c0Var.A);
            a2.a(0.0f);
            c0Var.D = a2;
            a2.d(new g.s(2, this));
        }
        c0Var.f1605z = null;
        ViewGroup viewGroup = c0Var.F;
        WeakHashMap weakHashMap = l0.f2757a;
        n0.b0.c(viewGroup);
        c0Var.H();
    }

    public boolean B(j.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.c0) this.f347h).F;
        WeakHashMap weakHashMap = l0.f2757a;
        n0.b0.c(viewGroup);
        a0.j jVar = (a0.j) this.f346g;
        ActionMode.Callback callback = (ActionMode.Callback) jVar.f100f;
        j.e h4 = jVar.h(aVar);
        q.j jVar2 = (q.j) jVar.f101g;
        Menu menu2 = (Menu) jVar2.get(menu);
        if (menu2 == null) {
            menu2 = new k.b0((Context) jVar.i, (k.m) menu);
            jVar2.put(menu, menu2);
        }
        return callback.onPrepareActionMode(h4, menu2);
    }

    public void C(k0.g gVar) {
        k0.l lVar = (k0.l) this.f347h;
        a0.a aVar = (a0.a) this.f346g;
        int i = gVar.f2146b;
        if (i == 0) {
            lVar.execute(new androidx.fragment.app.e(aVar, gVar.f2145a, 4));
        } else {
            lVar.execute(new j(i, 3, aVar));
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
    public void D(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        y.i iVar;
        y.n nVar = new y.n();
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
                    iVar = null;
                } catch (IOException e4) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e4);
                } catch (XmlPullParserException e5) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e5);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3697c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    iVar = y.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3696b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3698e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    iVar = y.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f3701a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (iVar != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                y.b.a(context, xmlResourceParser, iVar.f3699f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    iVar = y.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f3714h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (iVar != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    iVar = y.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
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
                                nVar.f3765c.put(Integer.valueOf(iVar.f3695a), iVar);
                                iVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    nVar.f3765c.put(Integer.valueOf(iVar.f3695a), iVar);
                                    iVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    nVar.f3765c.put(Integer.valueOf(iVar.f3695a), iVar);
                                    iVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.f347h).put(identifier, nVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f347h).put(identifier, nVar);
                return;
            }
        }
    }

    public h0 E(b1 b1Var, int i) {
        l1 l1Var;
        h0 h0Var;
        q.j jVar = (q.j) this.f346g;
        int d = jVar.d(b1Var);
        if (d >= 0 && (l1Var = (l1) jVar.i(d)) != null) {
            int i4 = l1Var.f1417a;
            if ((i4 & i) != 0) {
                int i5 = i4 & (~i);
                l1Var.f1417a = i5;
                if (i == 4) {
                    h0Var = l1Var.f1418b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    h0Var = l1Var.f1419c;
                }
                if ((i5 & 12) == 0) {
                    jVar.g(d);
                    l1Var.f1417a = 0;
                    l1Var.f1418b = null;
                    l1Var.f1419c = null;
                    l1.d.c(l1Var);
                }
                return h0Var;
            }
        }
        return null;
    }

    public void F(b1 b1Var) {
        l1 l1Var = (l1) ((q.j) this.f346g).get(b1Var);
        if (l1Var == null) {
            return;
        }
        l1Var.f1417a &= -2;
    }

    public void G(b1 b1Var) {
        q.h hVar = (q.h) this.f347h;
        int e4 = hVar.e() - 1;
        while (true) {
            if (e4 < 0) {
                break;
            }
            if (b1Var == hVar.f(e4)) {
                Object[] objArr = hVar.f3031h;
                Object obj = objArr[e4];
                Object obj2 = q.i.f3032a;
                if (obj != obj2) {
                    objArr[e4] = obj2;
                    hVar.f3029f = true;
                }
            } else {
                e4--;
            }
        }
        l1 l1Var = (l1) ((q.j) this.f346g).remove(b1Var);
        if (l1Var != null) {
            l1Var.f1417a = 0;
            l1Var.f1418b = null;
            l1Var.f1419c = null;
            l1.d.c(l1Var);
        }
    }

    public void H(int i, int i4, int i5, int i6) {
        p.a aVar = (p.a) this.f347h;
        aVar.i.set(i, i4, i5, i6);
        Rect rect = aVar.f2994h;
        super/*android.view.View*/.setPadding(i + rect.left, i4 + rect.top, i5 + rect.right, i6 + rect.bottom);
    }

    public void I() {
        Object parcelable;
        Integer num;
        a.l lVar = (a.l) this.f346g;
        String str = (String) this.f347h;
        Bundle bundle = lVar.f43g;
        LinkedHashMap linkedHashMap = lVar.f42f;
        f3.d.e(str, "key");
        if (!lVar.d.contains(str) && (num = (Integer) lVar.f39b.remove(str)) != null) {
            lVar.f38a.remove(num);
        }
        lVar.f41e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = j0.a.a(str, bundle);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!c.a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((c.a) parcelable));
            bundle.remove(str);
        }
        if (lVar.f40c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(b1 b1Var, h0 h0Var) {
        q.j jVar = (q.j) this.f346g;
        l1 l1Var = (l1) jVar.get(b1Var);
        if (l1Var == null) {
            l1Var = l1.a();
            jVar.put(b1Var, l1Var);
        }
        l1Var.f1419c = h0Var;
        l1Var.f1417a |= 8;
    }

    public void b() {
        int[] iArr = (int[]) this.f346g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f347h = null;
    }

    public void c(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void d(boolean z3) {
        k0 k0Var = (k0) this.f347h;
        g.j jVar = k0Var.f458t.f568o;
        androidx.fragment.app.u uVar = k0Var.f460v;
        if (uVar != null) {
            uVar.j().f450l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    @Override // androidx.emoji2.text.r
    public Object e() {
        return (c0) this.f346g;
    }

    public void f(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z3) {
        k0 k0Var = (k0) this.f347h;
        g.j jVar = k0Var.f458t.f568o;
        androidx.fragment.app.u uVar = k0Var.f460v;
        if (uVar != null) {
            uVar.j().f450l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void l(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void m(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    @Override // androidx.emoji2.text.r
    public boolean o(CharSequence charSequence, int i, int i4, z zVar) {
        if ((zVar.f372c & 4) > 0) {
            return true;
        }
        if (((c0) this.f346g) == null) {
            this.f346g = new c0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((l2.f) this.f347h).getClass();
        ((c0) this.f346g).setSpan(new a0(zVar), i, i4, 33);
        return true;
    }

    @Override // j0.b
    public void onCancel() {
        ((Animator) this.f346g).end();
        if (k0.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((v0) this.f347h) + " has been canceled.");
        }
    }

    public void p(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.f347h).f460v;
        if (uVar != null) {
            uVar.j().f450l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f346g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void s(int i) {
        int[] iArr = (int[]) this.f346g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f346g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f346g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f346g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // n0.n
    public q1 t(View view, q1 q1Var) {
        e2.q qVar = (e2.q) this.f346g;
        e2.r rVar = (e2.r) this.f347h;
        e2.r rVar2 = new e2.r();
        rVar2.f1237a = rVar.f1237a;
        rVar2.f1238b = rVar.f1238b;
        rVar2.f1239c = rVar.f1239c;
        rVar2.d = rVar.d;
        return qVar.c(view, q1Var, rVar2);
    }

    public String toString() {
        switch (this.f345f) {
            case 13:
                return "Bounds{lower=" + ((f0.c) this.f346g) + " upper=" + ((f0.c) this.f347h) + "}";
            case 16:
                String str = "[ ";
                if (((t.f) this.f346g) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((t.f) this.f346g).f3268m[i] + " ";
                    }
                }
                return str + "] " + ((t.f) this.f346g);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i4, int i5, int i6) {
        View u3;
        k1 k1Var = (k1) this.f347h;
        f1.k0 k0Var = (f1.k0) this.f346g;
        int d = k0Var.d();
        int c4 = k0Var.c();
        int i7 = i4 > i ? 1 : -1;
        View view = null;
        while (i != i4) {
            switch (k0Var.f1406a) {
                case 0:
                    u3 = k0Var.f1407b.u(i);
                    break;
                default:
                    u3 = k0Var.f1407b.u(i);
                    break;
            }
            int b4 = k0Var.b(u3);
            int a2 = k0Var.a(u3);
            k1Var.f1409b = d;
            k1Var.f1410c = c4;
            k1Var.d = b4;
            k1Var.f1411e = a2;
            if (i5 != 0) {
                k1Var.f1408a = i5;
                if (k1Var.a()) {
                    return u3;
                }
            }
            if (i6 != 0) {
                k1Var.f1408a = i6;
                if (k1Var.a()) {
                    view = u3;
                }
            }
            i += i7;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f346g).clear();
    }

    public boolean x(View view) {
        k1 k1Var = (k1) this.f347h;
        f1.k0 k0Var = (f1.k0) this.f346g;
        int d = k0Var.d();
        int c4 = k0Var.c();
        int b4 = k0Var.b(view);
        int a2 = k0Var.a(view);
        k1Var.f1409b = d;
        k1Var.f1410c = c4;
        k1Var.d = b4;
        k1Var.f1411e = a2;
        k1Var.f1408a = 24579;
        return k1Var.a();
    }

    public void y(int i, int i4) {
        int[] iArr = (int[]) this.f346g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i5 = i + i4;
        s(i5);
        int[] iArr2 = (int[]) this.f346g;
        System.arraycopy(iArr2, i, iArr2, i5, (iArr2.length - i) - i4);
        Arrays.fill((int[]) this.f346g, i, i5, -1);
        ArrayList arrayList = (ArrayList) this.f347h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h1 h1Var = (h1) ((ArrayList) this.f347h).get(size);
            int i6 = h1Var.f1366f;
            if (i6 >= i) {
                h1Var.f1366f = i6 + i4;
            }
        }
    }

    public void z(int i, int i4) {
        int[] iArr = (int[]) this.f346g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i5 = i + i4;
        s(i5);
        int[] iArr2 = (int[]) this.f346g;
        System.arraycopy(iArr2, i5, iArr2, i, (iArr2.length - i) - i4);
        int[] iArr3 = (int[]) this.f346g;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f347h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h1 h1Var = (h1) ((ArrayList) this.f347h).get(size);
            int i6 = h1Var.f1366f;
            if (i6 >= i) {
                if (i6 < i5) {
                    ((ArrayList) this.f347h).remove(size);
                } else {
                    h1Var.f1366f = i6 - i4;
                }
            }
        }
    }

    public /* synthetic */ q(int i, boolean z3) {
        this.f345f = i;
    }

    public /* synthetic */ q(Object obj, Object obj2, int i) {
        this.f345f = i;
        this.f346g = obj;
        this.f347h = obj2;
    }

    public q(k0 k0Var) {
        this.f345f = 3;
        this.f346g = new CopyOnWriteArrayList();
        this.f347h = k0Var;
    }

    public q(f1.k0 k0Var) {
        this.f345f = 9;
        this.f346g = k0Var;
        k1 k1Var = new k1();
        k1Var.f1408a = 0;
        this.f347h = k1Var;
    }

    public q(Animation animation) {
        this.f345f = 2;
        this.f346g = animation;
        this.f347h = null;
    }

    public q(Animator animator) {
        this.f345f = 2;
        this.f346g = null;
        this.f347h = animator;
    }

    public q(ArrayList arrayList, ArrayList arrayList2) {
        this.f345f = 5;
        int size = arrayList.size();
        this.f346g = new int[size];
        this.f347h = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f346g)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f347h)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public q(int i, int i4) {
        this.f345f = 5;
        this.f346g = new int[]{i, i4};
        this.f347h = new float[]{0.0f, 1.0f};
    }

    public q(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f345f = 13;
        lowerBound = bounds.getLowerBound();
        this.f346g = f0.c.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f347h = f0.c.d(upperBound);
    }

    public q(int i, int i4, int i5) {
        this.f345f = 5;
        this.f346g = new int[]{i, i4, i5};
        this.f347h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public q(EditText editText) {
        this.f345f = 19;
        this.f346g = editText;
        w0.j jVar = new w0.j(editText);
        this.f347h = jVar;
        editText.addTextChangedListener(jVar);
        if (w0.a.f3558b == null) {
            synchronized (w0.a.f3557a) {
                try {
                    if (w0.a.f3558b == null) {
                        w0.a aVar = new w0.a();
                        try {
                            w0.a.f3559c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, w0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        w0.a.f3558b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(w0.a.f3558b);
    }

    public q(int i) {
        this.f345f = i;
        switch (i) {
            case 10:
                this.f346g = new q.j(0);
                this.f347h = new q.h();
                break;
            case 18:
                this.f346g = Choreographer.getInstance();
                this.f347h = Looper.myLooper();
                break;
            default:
                this.f346g = new SparseIntArray();
                this.f347h = new SparseIntArray();
                break;
        }
    }

    public q(g.c0 c0Var, a0.j jVar) {
        this.f345f = 11;
        this.f347h = c0Var;
        this.f346g = jVar;
    }
}
