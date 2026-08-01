package a2;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.graphics.Insets;
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
import androidx.emoji2.text.a0;
import androidx.emoji2.text.c0;
import androidx.emoji2.text.w;
import androidx.fragment.app.k0;
import androidx.fragment.app.v0;
import b1.c1;
import b1.i0;
import b1.l1;
import b1.m1;
import com.gglhk.bofio.fortunetiger.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f.b0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.i1;
import k0.j0;
import k0.l0;
import k0.z;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s implements k0.m, androidx.emoji2.text.q, g0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f67f;
    public Object g;
    public Object h;

    public /* synthetic */ s(int i4, Object obj) {
        this.f67f = i4;
        this.h = obj;
    }

    public static int v(int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i5 ? i7 + 1 : i7;
    }

    public void A(i.a aVar) {
        w wVar = (w) this.g;
        ((ActionMode.Callback) wVar.f368f).onDestroyActionMode(wVar.g(aVar));
        b0 b0Var = (b0) this.h;
        if (b0Var.B != null) {
            b0Var.f1557q.getDecorView().removeCallbacks(b0Var.C);
        }
        if (b0Var.A != null) {
            l0 l0Var = b0Var.D;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a4 = j0.a(b0Var.A);
            a4.a(0.0f);
            b0Var.D = a4;
            a4.d(new f.s(2, this));
        }
        b0Var.f1566z = null;
        ViewGroup viewGroup = b0Var.G;
        WeakHashMap weakHashMap = j0.f2752a;
        z.c(viewGroup);
        b0Var.H();
    }

    public void B(g3.i iVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new r(6, mainActivity));
    }

    public boolean C(i.a aVar, Menu menu) {
        ViewGroup viewGroup = ((b0) this.h).G;
        WeakHashMap weakHashMap = j0.f2752a;
        z.c(viewGroup);
        w wVar = (w) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) wVar.f368f;
        i.e g = wVar.g(aVar);
        n.j jVar = (n.j) wVar.f369i;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new j.b0((Context) wVar.g, (j.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(g, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(g3.i iVar, c3.u uVar) {
        String str;
        Charset charset;
        String str2;
        final String t3 = MainActivity.t(new byte[]{119, -50, 114, -54, 101, -45, 115, -113, 100, -60, 118});
        final String t4 = MainActivity.t(new byte[]{34, -46, 116, -64, 116, -44, 115, -125, 58, -125, 111, -54, 34});
        final String str3 = uVar.f1141f.f1127a.h;
        c3.w wVar = uVar.f1145l;
        if (wVar != null) {
            p3.h o4 = wVar.o();
            try {
                c3.o n3 = wVar.n();
                if (n3 != null) {
                    charset = b3.a.f967a;
                    String[] strArr = n3.f1084b;
                    int i4 = 0;
                    int j4 = l0.g.j(0, strArr.length - 1, 2);
                    if (j4 >= 0) {
                        while (!b3.m.X(strArr[i4], "charset")) {
                            if (i4 != j4) {
                                i4 += 2;
                            }
                        }
                        str2 = strArr[i4 + 1];
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
                charset = b3.a.f967a;
                str = o4.l(d3.c.p(o4, charset));
                o4.close();
            } finally {
            }
        } else {
            str = "";
        }
        final String str4 = str;
        final MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new Runnable() { // from class: j1.f
            @Override // java.lang.Runnable
            public final void run() {
                String str5 = str3;
                boolean d02 = b3.e.d0(str5, t3);
                MainActivity mainActivity2 = mainActivity;
                if (d02) {
                    if (b3.e.d0(str4, t4)) {
                        int i5 = MainActivity.I;
                        mainActivity2.u();
                        return;
                    } else {
                        int i6 = MainActivity.I;
                        mainActivity2.u();
                        return;
                    }
                }
                SharedPreferences sharedPreferences = mainActivity2.H;
                if (sharedPreferences == null) {
                    u2.c.h("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.g, str5);
                edit.apply();
                mainActivity2.E = str5;
                mainActivity2.v(str5);
            }
        });
    }

    public void E(h0.g gVar) {
        h0.l lVar = (h0.l) this.h;
        e eVar = (e) this.g;
        int i4 = gVar.f1990b;
        if (i4 == 0) {
            lVar.execute(new androidx.fragment.app.e(eVar, gVar.f1989a, 1));
        } else {
            lVar.execute(new androidx.emoji2.text.j(i4, 2, eVar));
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
        v.i iVar;
        v.n nVar = new v.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlResourceParser.getAttributeName(i4);
            String attributeValue = xmlResourceParser.getAttributeValue(i4);
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
                                    iVar.f3502d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3501b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3503e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f3502d.f3506a = true;
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
                                v.b.a(context, xmlResourceParser, iVar.f3504f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.f3502d.f3516h0 = 1;
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
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
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
                                nVar.c.put(Integer.valueOf(iVar.f3500a), iVar);
                                iVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    nVar.c.put(Integer.valueOf(iVar.f3500a), iVar);
                                    iVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    nVar.c.put(Integer.valueOf(iVar.f3500a), iVar);
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

    public i0 G(c1 c1Var, int i4) {
        m1 m1Var;
        i0 i0Var;
        n.j jVar = (n.j) this.g;
        int d4 = jVar.d(c1Var);
        if (d4 >= 0 && (m1Var = (m1) jVar.i(d4)) != null) {
            int i5 = m1Var.f849a;
            if ((i5 & i4) != 0) {
                int i6 = i5 & (~i4);
                m1Var.f849a = i6;
                if (i4 == 4) {
                    i0Var = m1Var.f850b;
                } else {
                    if (i4 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    i0Var = m1Var.c;
                }
                if ((i6 & 12) == 0) {
                    jVar.g(d4);
                    m1Var.f849a = 0;
                    m1Var.f850b = null;
                    m1Var.c = null;
                    m1.f848d.c(m1Var);
                }
                return i0Var;
            }
        }
        return null;
    }

    public void H(c1 c1Var) {
        m1 m1Var = (m1) ((n.j) this.g).get(c1Var);
        if (m1Var == null) {
            return;
        }
        m1Var.f849a &= -2;
    }

    public void I(c1 c1Var) {
        n.h hVar = (n.h) this.h;
        int e4 = hVar.e() - 1;
        while (true) {
            if (e4 < 0) {
                break;
            }
            if (c1Var == hVar.f(e4)) {
                Object[] objArr = hVar.h;
                Object obj = objArr[e4];
                Object obj2 = n.i.f2933a;
                if (obj != obj2) {
                    objArr[e4] = obj2;
                    hVar.f2931f = true;
                }
            } else {
                e4--;
            }
        }
        m1 m1Var = (m1) ((n.j) this.g).remove(c1Var);
        if (m1Var != null) {
            m1Var.f849a = 0;
            m1Var.f850b = null;
            m1Var.c = null;
            m1.f848d.c(m1Var);
        }
    }

    public void J() {
        Object parcelable;
        Integer num;
        androidx.activity.l lVar = (androidx.activity.l) this.g;
        String str = (String) this.h;
        Bundle bundle = lVar.g;
        LinkedHashMap linkedHashMap = lVar.f122f;
        u2.c.e(str, "key");
        if (!lVar.f120d.contains(str) && (num = (Integer) lVar.f119b.remove(str)) != null) {
            lVar.f118a.remove(num);
        }
        lVar.f121e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = androidx.activity.i.b(bundle, str);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!b.a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((b.a) parcelable));
            bundle.remove(str);
        }
        if (lVar.c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(c1 c1Var, i0 i0Var) {
        n.j jVar = (n.j) this.g;
        m1 m1Var = (m1) jVar.get(c1Var);
        if (m1Var == null) {
            m1Var = m1.a();
            jVar.put(c1Var, m1Var);
        }
        m1Var.c = i0Var;
        m1Var.f849a |= 8;
    }

    @Override // androidx.emoji2.text.q
    public Object b() {
        return (c0) this.g;
    }

    public void c() {
        int[] iArr = (int[]) this.g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    @Override // k0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0.m1 d(View view, k0.m1 m1Var) {
        boolean z3;
        boolean z4;
        boolean z5;
        i0.f fVar = (i0.f) this.g;
        u uVar = (u) this.h;
        int i4 = uVar.f68a;
        int i5 = uVar.f69b;
        int i6 = uVar.c;
        i1 i1Var = m1Var.f2760a;
        c0.c f4 = i1Var.f(519);
        c0.c f5 = i1Var.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar.f2093b;
        int i7 = f4.f979b;
        int i8 = f4.c;
        int i9 = f4.f978a;
        bottomSheetBehavior.f1224x = i7;
        boolean z6 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z7 = bottomSheetBehavior.f1216p;
        if (z7) {
            int a4 = m1Var.a();
            bottomSheetBehavior.f1223w = a4;
            paddingBottom = a4 + i6;
        }
        if (bottomSheetBehavior.f1217q) {
            paddingLeft = (z6 ? i5 : i4) + i9;
        }
        int i10 = paddingLeft;
        if (bottomSheetBehavior.f1218r) {
            if (!z6) {
                i4 = i5;
            }
            paddingRight = i4 + i8;
        }
        int i11 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f1220t || marginLayoutParams.leftMargin == i9) {
            z3 = false;
        } else {
            marginLayoutParams.leftMargin = i9;
            z3 = true;
        }
        if (bottomSheetBehavior.f1221u && marginLayoutParams.rightMargin != i8) {
            marginLayoutParams.rightMargin = i8;
            z3 = true;
        }
        if (bottomSheetBehavior.f1222v) {
            int i12 = marginLayoutParams.topMargin;
            int i13 = f4.f979b;
            if (i12 != i13) {
                marginLayoutParams.topMargin = i13;
                z4 = true;
                if (z4) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(i10, view.getPaddingTop(), i11, paddingBottom);
                z5 = fVar.f2092a;
                if (z5) {
                    bottomSheetBehavior.f1214n = f5.f980d;
                }
                if (z7 && !z5) {
                    return m1Var;
                }
                bottomSheetBehavior.L();
                return m1Var;
            }
        }
        z4 = z3;
        if (z4) {
        }
        view.setPadding(i10, view.getPaddingTop(), i11, paddingBottom);
        z5 = fVar.f2092a;
        if (z5) {
        }
        if (z7) {
        }
        bottomSheetBehavior.L();
        return m1Var;
    }

    public void e(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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

    public void f(boolean z3) {
        k0 k0Var = (k0) this.h;
        f.i iVar = k0Var.f451t.f548l;
        androidx.fragment.app.u uVar = k0Var.f453v;
        if (uVar != null) {
            uVar.j().f443l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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

    @Override // androidx.emoji2.text.q
    public boolean h(CharSequence charSequence, int i4, int i5, androidx.emoji2.text.z zVar) {
        if ((zVar.c & 4) > 0) {
            return true;
        }
        if (((c0) this.g) == null) {
            this.g = new c0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((g2.f) this.h).getClass();
        ((c0) this.g).setSpan(new a0(zVar), i4, i5, 33);
        return true;
    }

    public void i(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        k0 k0Var = (k0) this.h;
        f.i iVar = k0Var.f451t.f548l;
        androidx.fragment.app.u uVar = k0Var.f453v;
        if (uVar != null) {
            uVar.j().f443l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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

    public void o(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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

    @Override // g0.a
    public void onCancel() {
        ((Animator) this.g).end();
        if (k0.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((v0) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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

    public void s(boolean z3) {
        androidx.fragment.app.u uVar = ((k0) this.h).f453v;
        if (uVar != null) {
            uVar.j().f443l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
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

    public void t(int i4) {
        int[] iArr = (int[]) this.g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i4, 10) + 1];
            this.g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int length = iArr.length;
            while (length <= i4) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f67f) {
            case 15:
                return "Bounds{lower=" + ((c0.c) this.g) + " upper=" + ((c0.c) this.h) + "}";
            case 16:
                String str = "[ ";
                if (((q.f) this.g) != null) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        str = str + ((q.f) this.g).f3087m[i4] + " ";
                    }
                }
                return str + "] " + ((q.f) this.g);
            default:
                return super.toString();
        }
    }

    public View u(int i4, int i5, int i6, int i7) {
        View u3;
        l1 l1Var = (l1) this.h;
        b1.l0 l0Var = (b1.l0) this.g;
        int d4 = l0Var.d();
        int c = l0Var.c();
        int i8 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            switch (l0Var.f837a) {
                case 0:
                    u3 = l0Var.f838b.u(i4);
                    break;
                default:
                    u3 = l0Var.f838b.u(i4);
                    break;
            }
            int b2 = l0Var.b(u3);
            int a4 = l0Var.a(u3);
            l1Var.f840b = d4;
            l1Var.c = c;
            l1Var.f841d = b2;
            l1Var.f842e = a4;
            if (i6 != 0) {
                l1Var.f839a = i6;
                if (l1Var.a()) {
                    return u3;
                }
            }
            if (i7 != 0) {
                l1Var.f839a = i7;
                if (l1Var.a()) {
                    view = u3;
                }
            }
            i4 += i8;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.g).clear();
    }

    public boolean x(View view) {
        l1 l1Var = (l1) this.h;
        b1.l0 l0Var = (b1.l0) this.g;
        int d4 = l0Var.d();
        int c = l0Var.c();
        int b2 = l0Var.b(view);
        int a4 = l0Var.a(view);
        l1Var.f840b = d4;
        l1Var.c = c;
        l1Var.f841d = b2;
        l1Var.f842e = a4;
        l1Var.f839a = 24579;
        return l1Var.a();
    }

    public void y(int i4, int i5) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        t(i6);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
        Arrays.fill((int[]) this.g, i4, i6, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b1.i1 i1Var = (b1.i1) ((ArrayList) this.h).get(size);
            int i7 = i1Var.f803f;
            if (i7 >= i4) {
                i1Var.f803f = i7 + i5;
            }
        }
    }

    public void z(int i4, int i5) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        t(i6);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
        int[] iArr3 = (int[]) this.g;
        Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b1.i1 i1Var = (b1.i1) ((ArrayList) this.h).get(size);
            int i7 = i1Var.f803f;
            if (i7 >= i4) {
                if (i7 < i6) {
                    ((ArrayList) this.h).remove(size);
                } else {
                    i1Var.f803f = i7 - i5;
                }
            }
        }
    }

    public /* synthetic */ s(int i4, boolean z3) {
        this.f67f = i4;
    }

    public /* synthetic */ s(LayoutInflater.Factory2 factory2, Object obj, int i4) {
        this.f67f = i4;
        this.h = factory2;
        this.g = obj;
    }

    public /* synthetic */ s(Object obj, Object obj2, int i4) {
        this.f67f = i4;
        this.g = obj;
        this.h = obj2;
    }

    public s(k0 k0Var) {
        this.f67f = 4;
        this.g = new CopyOnWriteArrayList();
        this.h = k0Var;
    }

    public s(b1.l0 l0Var) {
        this.f67f = 9;
        this.g = l0Var;
        l1 l1Var = new l1();
        l1Var.f839a = 0;
        this.h = l1Var;
    }

    public s(Animation animation) {
        this.f67f = 3;
        this.g = animation;
        this.h = null;
    }

    public s(Animator animator) {
        this.f67f = 3;
        this.g = null;
        this.h = animator;
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        this.f67f = 6;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            ((int[]) this.g)[i4] = ((Integer) arrayList.get(i4)).intValue();
            ((float[]) this.h)[i4] = ((Float) arrayList2.get(i4)).floatValue();
        }
    }

    public s(int i4, int i5) {
        this.f67f = 6;
        this.g = new int[]{i4, i5};
        this.h = new float[]{0.0f, 1.0f};
    }

    public s(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f67f = 15;
        lowerBound = bounds.getLowerBound();
        this.g = c0.c.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.h = c0.c.d(upperBound);
    }

    public s(int i4, int i5, int i6) {
        this.f67f = 6;
        this.g = new int[]{i4, i5, i6};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public s(EditText editText) {
        this.f67f = 19;
        this.g = editText;
        t0.i iVar = new t0.i(editText);
        this.h = iVar;
        editText.addTextChangedListener(iVar);
        if (t0.a.f3362b == null) {
            synchronized (t0.a.f3361a) {
                try {
                    if (t0.a.f3362b == null) {
                        t0.a aVar = new t0.a();
                        try {
                            t0.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t0.a.f3362b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t0.a.f3362b);
    }

    public s(int i4) {
        this.f67f = i4;
        switch (i4) {
            case 10:
                this.g = new n.j(0);
                this.h = new n.h();
                break;
            case 18:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
            default:
                this.g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
        }
    }
}
