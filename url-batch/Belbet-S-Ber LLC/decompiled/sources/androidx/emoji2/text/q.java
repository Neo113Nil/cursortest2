package androidx.emoji2.text;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.fragment.app.k0;
import com.gdmhkmf.belbet.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g1.a2;
import g1.q1;
import g1.v0;
import g1.w1;
import g1.y0;
import g1.z1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.p0;
import n0.s1;
import n0.t0;
import n0.v1;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q implements r, j0.d, n0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f465f;

    /* renamed from: g, reason: collision with root package name */
    public Object f466g;
    public Object h;

    public /* synthetic */ q(int i, Object obj) {
        this.f465f = i;
        this.h = obj;
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
        a0.k kVar = (a0.k) this.f466g;
        ((ActionMode.Callback) kVar.f97f).onDestroyActionMode(kVar.j(aVar));
        g.a0 a0Var = (g.a0) this.h;
        if (a0Var.B != null) {
            a0Var.f1460q.getDecorView().removeCallbacks(a0Var.C);
        }
        if (a0Var.A != null) {
            t0 t0Var = a0Var.D;
            if (t0Var != null) {
                t0Var.b();
            }
            t0 a5 = p0.a(a0Var.A);
            a5.a(0.0f);
            a0Var.D = a5;
            a5.d(new g.r(2, this));
        }
        a0Var.f1469z = null;
        ViewGroup viewGroup = a0Var.G;
        WeakHashMap weakHashMap = p0.f2816a;
        viewGroup.requestApplyInsets();
        a0Var.H();
    }

    public void B(x3.i iVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new a.j(6, mainActivity));
    }

    public boolean C(j.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.a0) this.h).G;
        WeakHashMap weakHashMap = p0.f2816a;
        viewGroup.requestApplyInsets();
        a0.k kVar = (a0.k) this.f466g;
        ActionMode.Callback callback = (ActionMode.Callback) kVar.f97f;
        j.e j2 = kVar.j(aVar);
        q.j jVar = (q.j) kVar.f98g;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new k.b0((Context) kVar.i, (k.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(j2, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(x3.i iVar, t3.s sVar) {
        String str;
        Charset charset;
        String str2;
        final String r4 = MainActivity.r(new byte[]{23, 74, 18, 78, 5, 87, 19, 11, 4, 64, 22});
        final String r5 = MainActivity.r(new byte[]{66, 86, 20, 68, 20, 80, 19, 7, 90, 7, 15, 78, 66});
        final String str3 = sVar.f3520f.f3506a.h;
        t3.u uVar = sVar.f3524l;
        if (uVar != null) {
            g4.h o4 = uVar.o();
            try {
                t3.m n4 = uVar.n();
                if (n4 != null) {
                    charset = p3.a.f3089a;
                    String[] strArr = n4.f3463b;
                    int i = 0;
                    int z4 = b4.d.z(0, strArr.length - 1, 2);
                    if (z4 >= 0) {
                        while (!p3.l.m0(strArr[i], "charset")) {
                            if (i != z4) {
                                i += 2;
                            }
                        }
                        str2 = strArr[i + 1];
                        if (str2 != null) {
                            try {
                                charset = Charset.forName(str2);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                charset = p3.a.f3089a;
                str = o4.l(u3.b.p(o4, charset));
                o4.close();
            } finally {
            }
        } else {
            str = "";
        }
        final String str4 = str;
        final MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new Runnable() { // from class: o1.j
            @Override // java.lang.Runnable
            public final void run() {
                String str5 = str3;
                boolean s02 = p3.d.s0(str5, r4);
                MainActivity mainActivity2 = mainActivity;
                if (s02) {
                    if (p3.d.s0(str4, r5)) {
                        int i4 = MainActivity.L;
                        mainActivity2.s();
                        return;
                    } else {
                        int i5 = MainActivity.L;
                        mainActivity2.s();
                        return;
                    }
                }
                int i6 = MainActivity.L;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.J.a();
                i3.d.d(sharedPreferences, "access$getPrefs(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.f466g, str5);
                edit.apply();
                mainActivity2.G = str5;
                mainActivity2.t(str5);
            }
        });
    }

    public void E(k0.g gVar) {
        g1.d dVar = (g1.d) this.h;
        a0.a aVar = (a0.a) this.f466g;
        int i = gVar.f2294b;
        if (i == 0) {
            dVar.execute(new androidx.fragment.app.e(aVar, gVar.f2293a, 5));
        } else {
            dVar.execute(new j(i, 2, aVar));
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
    public void F(Context context, XmlResourceParser xmlResourceParser) {
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
                                    iVar.f4020c.a(context, Xml.asAttributeSet(xmlResourceParser));
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
                                    iVar.f4019b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f4021e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    iVar = y.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f4024a = true;
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
                                y.b.a(context, xmlResourceParser, iVar.f4022f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    iVar = y.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f4036h0 = 1;
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
                                nVar.f4085c.put(Integer.valueOf(iVar.f4018a), iVar);
                                iVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    nVar.f4085c.put(Integer.valueOf(iVar.f4018a), iVar);
                                    iVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    nVar.f4085c.put(Integer.valueOf(iVar.f4018a), iVar);
                                    iVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.h).put(identifier, nVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.h).put(identifier, nVar);
                return;
            }
        }
    }

    public v0 G(q1 q1Var, int i) {
        a2 a2Var;
        v0 v0Var;
        q.j jVar = (q.j) this.f466g;
        int d = jVar.d(q1Var);
        if (d >= 0 && (a2Var = (a2) jVar.i(d)) != null) {
            int i4 = a2Var.f1609a;
            if ((i4 & i) != 0) {
                int i5 = i4 & (~i);
                a2Var.f1609a = i5;
                if (i == 4) {
                    v0Var = a2Var.f1610b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    v0Var = a2Var.f1611c;
                }
                if ((i5 & 12) == 0) {
                    jVar.g(d);
                    a2Var.f1609a = 0;
                    a2Var.f1610b = null;
                    a2Var.f1611c = null;
                    a2.d.c(a2Var);
                }
                return v0Var;
            }
        }
        return null;
    }

    public void H(q1 q1Var) {
        a2 a2Var = (a2) ((q.j) this.f466g).get(q1Var);
        if (a2Var == null) {
            return;
        }
        a2Var.f1609a &= -2;
    }

    public void I(q1 q1Var) {
        q.h hVar = (q.h) this.h;
        int e4 = hVar.e() - 1;
        while (true) {
            if (e4 < 0) {
                break;
            }
            if (q1Var == hVar.f(e4)) {
                Object[] objArr = hVar.h;
                Object obj = objArr[e4];
                Object obj2 = q.i.f3112a;
                if (obj != obj2) {
                    objArr[e4] = obj2;
                    hVar.f3110f = true;
                }
            } else {
                e4--;
            }
        }
        a2 a2Var = (a2) ((q.j) this.f466g).remove(q1Var);
        if (a2Var != null) {
            a2Var.f1609a = 0;
            a2Var.f1610b = null;
            a2Var.f1611c = null;
            a2.d.c(a2Var);
        }
    }

    public void J(int i, int i4, int i5, int i6) {
        p.a aVar = (p.a) this.h;
        aVar.i.set(i, i4, i5, i6);
        Rect rect = aVar.h;
        super/*android.view.View*/.setPadding(i + rect.left, i4 + rect.top, i5 + rect.right, i6 + rect.bottom);
    }

    public void K() {
        Object parcelable;
        Integer num;
        a.l lVar = (a.l) this.f466g;
        String str = (String) this.h;
        Bundle bundle = lVar.f43g;
        LinkedHashMap linkedHashMap = lVar.f42f;
        i3.d.e(str, "key");
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
                parcelable = j0.c.a(bundle, str);
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

    public void a(q1 q1Var, v0 v0Var) {
        q.j jVar = (q.j) this.f466g;
        a2 a2Var = (a2) jVar.get(q1Var);
        if (a2Var == null) {
            a2Var = a2.a();
            jVar.put(q1Var, a2Var);
        }
        a2Var.f1611c = v0Var;
        a2Var.f1609a |= 8;
    }

    public void b() {
        int[] iArr = (int[]) this.f466g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    public void c(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // androidx.emoji2.text.r
    public Object d() {
        return (c0) this.f466g;
    }

    public void e(boolean z4) {
        k0 k0Var = (k0) this.h;
        g.i iVar = k0Var.f570t.f674p;
        androidx.fragment.app.u uVar = k0Var.f572v;
        if (uVar != null) {
            uVar.j().f562l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void f(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z4) {
        k0 k0Var = (k0) this.h;
        g.i iVar = k0Var.f570t.f674p;
        androidx.fragment.app.u uVar = k0Var.f572v;
        if (uVar != null) {
            uVar.j().f562l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // androidx.emoji2.text.r
    public boolean k(CharSequence charSequence, int i, int i4, z zVar) {
        if ((zVar.f489c & 4) > 0) {
            return true;
        }
        if (((c0) this.f466g) == null) {
            this.f466g = new c0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((o2.f) this.h).getClass();
        ((c0) this.f466g).setSpan(new a0(zVar), i, i4, 33);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    @Override // n0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v1 l(View view, v1 v1Var) {
        boolean z4;
        boolean z5;
        boolean z6;
        l0.f fVar = (l0.f) this.f466g;
        i2.q qVar = (i2.q) this.h;
        int i = qVar.f2065a;
        int i4 = qVar.f2066b;
        int i5 = qVar.f2067c;
        s1 s1Var = v1Var.f2842a;
        f0.c h = s1Var.h(519);
        f0.c h5 = s1Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar.f2632b;
        int i6 = h.f1416b;
        int i7 = h.f1417c;
        int i8 = h.f1415a;
        bottomSheetBehavior.f962x = i6;
        boolean z7 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z8 = bottomSheetBehavior.f954p;
        if (z8) {
            int a5 = v1Var.a();
            bottomSheetBehavior.f961w = a5;
            paddingBottom = a5 + i5;
        }
        if (bottomSheetBehavior.f955q) {
            paddingLeft = (z7 ? i4 : i) + i8;
        }
        int i9 = paddingLeft;
        if (bottomSheetBehavior.f956r) {
            if (!z7) {
                i = i4;
            }
            paddingRight = i + i7;
        }
        int i10 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f958t || marginLayoutParams.leftMargin == i8) {
            z4 = false;
        } else {
            marginLayoutParams.leftMargin = i8;
            z4 = true;
        }
        if (bottomSheetBehavior.f959u && marginLayoutParams.rightMargin != i7) {
            marginLayoutParams.rightMargin = i7;
            z4 = true;
        }
        if (bottomSheetBehavior.f960v) {
            int i11 = marginLayoutParams.topMargin;
            int i12 = h.f1416b;
            if (i11 != i12) {
                marginLayoutParams.topMargin = i12;
                z5 = true;
                if (z5) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(i9, view.getPaddingTop(), i10, paddingBottom);
                z6 = fVar.f2631a;
                if (z6) {
                    bottomSheetBehavior.f952n = h5.d;
                }
                if (z8 && !z6) {
                    return v1Var;
                }
                bottomSheetBehavior.L();
                return v1Var;
            }
        }
        z5 = z4;
        if (z5) {
        }
        view.setPadding(i9, view.getPaddingTop(), i10, paddingBottom);
        z6 = fVar.f2631a;
        if (z6) {
        }
        if (z8) {
        }
        bottomSheetBehavior.L();
        return v1Var;
    }

    public void m(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // j0.d
    public void onCancel() {
        ((Animator) this.f466g).end();
        if (k0.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((androidx.fragment.app.v0) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void s(boolean z4) {
        androidx.fragment.app.u uVar = ((k0) this.h).f572v;
        if (uVar != null) {
            uVar.j().f562l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f466g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void t(int i) {
        int[] iArr = (int[]) this.f466g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f466g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f466g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f466g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f465f) {
            case 13:
                return "Bounds{lower=" + ((f0.c) this.f466g) + " upper=" + ((f0.c) this.h) + "}";
            case 17:
                String str = "[ ";
                if (((t.f) this.f466g) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((t.f) this.f466g).f3380m[i] + " ";
                    }
                }
                return str + "] " + ((t.f) this.f466g);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i4, int i5, int i6) {
        View u4;
        z1 z1Var = (z1) this.h;
        y0 y0Var = (y0) this.f466g;
        int d = y0Var.d();
        int c5 = y0Var.c();
        int i7 = i4 > i ? 1 : -1;
        View view = null;
        while (i != i4) {
            switch (y0Var.f1854a) {
                case 0:
                    u4 = y0Var.f1855b.u(i);
                    break;
                default:
                    u4 = y0Var.f1855b.u(i);
                    break;
            }
            int b2 = y0Var.b(u4);
            int a5 = y0Var.a(u4);
            z1Var.f1870b = d;
            z1Var.f1871c = c5;
            z1Var.d = b2;
            z1Var.f1872e = a5;
            if (i5 != 0) {
                z1Var.f1869a = i5;
                if (z1Var.a()) {
                    return u4;
                }
            }
            if (i6 != 0) {
                z1Var.f1869a = i6;
                if (z1Var.a()) {
                    view = u4;
                }
            }
            i += i7;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f466g).clear();
    }

    public boolean x(View view) {
        z1 z1Var = (z1) this.h;
        y0 y0Var = (y0) this.f466g;
        int d = y0Var.d();
        int c5 = y0Var.c();
        int b2 = y0Var.b(view);
        int a5 = y0Var.a(view);
        z1Var.f1870b = d;
        z1Var.f1871c = c5;
        z1Var.d = b2;
        z1Var.f1872e = a5;
        z1Var.f1869a = 24579;
        return z1Var.a();
    }

    public void y(int i, int i4) {
        int[] iArr = (int[]) this.f466g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i5 = i + i4;
        t(i5);
        int[] iArr2 = (int[]) this.f466g;
        System.arraycopy(iArr2, i, iArr2, i5, (iArr2.length - i) - i4);
        Arrays.fill((int[]) this.f466g, i, i5, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w1 w1Var = (w1) ((ArrayList) this.h).get(size);
            int i6 = w1Var.f1818f;
            if (i6 >= i) {
                w1Var.f1818f = i6 + i4;
            }
        }
    }

    public void z(int i, int i4) {
        int[] iArr = (int[]) this.f466g;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i5 = i + i4;
        t(i5);
        int[] iArr2 = (int[]) this.f466g;
        System.arraycopy(iArr2, i5, iArr2, i, (iArr2.length - i) - i4);
        int[] iArr3 = (int[]) this.f466g;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w1 w1Var = (w1) ((ArrayList) this.h).get(size);
            int i6 = w1Var.f1818f;
            if (i6 >= i) {
                if (i6 < i5) {
                    ((ArrayList) this.h).remove(size);
                } else {
                    w1Var.f1818f = i6 - i4;
                }
            }
        }
    }

    public /* synthetic */ q(int i, boolean z4) {
        this.f465f = i;
    }

    public /* synthetic */ q(LayoutInflater.Factory2 factory2, Object obj, int i) {
        this.f465f = i;
        this.h = factory2;
        this.f466g = obj;
    }

    public /* synthetic */ q(Object obj, Object obj2, int i) {
        this.f465f = i;
        this.f466g = obj;
        this.h = obj2;
    }

    public q(k0 k0Var) {
        this.f465f = 3;
        this.f466g = new CopyOnWriteArrayList();
        this.h = k0Var;
    }

    public q(y0 y0Var) {
        this.f465f = 9;
        this.f466g = y0Var;
        z1 z1Var = new z1();
        z1Var.f1869a = 0;
        this.h = z1Var;
    }

    public q(Animation animation) {
        this.f465f = 2;
        this.f466g = animation;
        this.h = null;
    }

    public q(Animator animator) {
        this.f465f = 2;
        this.f466g = null;
        this.h = animator;
    }

    public q(ArrayList arrayList, ArrayList arrayList2) {
        this.f465f = 5;
        int size = arrayList.size();
        this.f466g = new int[size];
        this.h = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f466g)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.h)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public q(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f465f = 13;
        lowerBound = bounds.getLowerBound();
        this.f466g = f0.c.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.h = f0.c.d(upperBound);
    }

    public q(int i, int i4) {
        this.f465f = 5;
        this.f466g = new int[]{i, i4};
        this.h = new float[]{0.0f, 1.0f};
    }

    public q(int i, int i4, int i5) {
        this.f465f = 5;
        this.f466g = new int[]{i, i4, i5};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public q(EditText editText) {
        this.f465f = 22;
        this.f466g = editText;
        x0.i iVar = new x0.i(editText);
        this.h = iVar;
        editText.addTextChangedListener(iVar);
        if (x0.a.f3838b == null) {
            synchronized (x0.a.f3837a) {
                try {
                    if (x0.a.f3838b == null) {
                        x0.a aVar = new x0.a();
                        try {
                            x0.a.f3839c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, x0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        x0.a.f3838b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(x0.a.f3838b);
    }

    public q(int i) {
        this.f465f = i;
        switch (i) {
            case 10:
                this.f466g = new q.j(0);
                this.h = new q.h();
                break;
            case 19:
                this.f466g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
            default:
                this.f466g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
        }
    }
}
