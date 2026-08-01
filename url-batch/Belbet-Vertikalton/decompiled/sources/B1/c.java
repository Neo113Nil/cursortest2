package B1;

import C1.d;
import D1.j;
import E1.h;
import H1.l;
import J.g;
import M.C;
import M.C0019o;
import M.InterfaceC0020p;
import M.P;
import M.W;
import M.r0;
import M.t0;
import V.B;
import V.p;
import V.v;
import V.y;
import X.i;
import Z.AbstractComponentCallbacksC0053q;
import Z.I;
import Z.U;
import a.AbstractC0058a;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.winpower.neonfit.MainActivity;
import d.C0110a;
import h.AbstractActivityC0132i;
import h.q;
import h.z;
import h0.C0139E;
import h0.V;
import h0.b0;
import h0.e0;
import h0.f0;
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
import k0.InterfaceC0201c;
import k0.InterfaceC0202d;
import l.AbstractC0204a;
import l.e;
import m.MenuC0213B;
import m.MenuC0229m;
import org.xmlpull.v1.XmlPullParserException;
import q.k;
import q1.m;
import s.C0379d;
import s.C0381f;
import x.C0411b;
import x.C0418i;
import x.n;
import z1.o;

/* loaded from: classes.dex */
public final class c implements InterfaceC0020p, p, I.b, InterfaceC0202d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67a;

    /* renamed from: b, reason: collision with root package name */
    public Object f68b;

    /* renamed from: c, reason: collision with root package name */
    public Object f69c;

    public /* synthetic */ c(int i, boolean z2) {
        this.f67a = i;
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
        int[] iArr = (int[]) this.f68b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        v(i3);
        int[] iArr2 = (int[]) this.f68b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f68b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f69c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((ArrayList) this.f69c).get(size);
            int i4 = b0Var.f2989a;
            if (i4 >= i) {
                b0Var.f2989a = i4 + i2;
            }
        }
    }

    public void B(int i, int i2) {
        int[] iArr = (int[]) this.f68b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        v(i3);
        int[] iArr2 = (int[]) this.f68b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f68b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f69c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((ArrayList) this.f69c).get(size);
            int i4 = b0Var.f2989a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f69c).remove(size);
                } else {
                    b0Var.f2989a = i4 - i2;
                }
            }
        }
    }

    public void C(AbstractC0204a abstractC0204a) {
        v vVar = (v) this.f68b;
        ((ActionMode.Callback) vVar.f1305a).onDestroyActionMode(vVar.g(abstractC0204a));
        z zVar = (z) this.f69c;
        if (zVar.f2889w != null) {
            zVar.f2878l.getDecorView().removeCallbacks(zVar.f2890x);
        }
        if (zVar.f2888v != null) {
            W w2 = zVar.f2891y;
            if (w2 != null) {
                w2.b();
            }
            W a2 = P.a(zVar.f2888v);
            a2.a(0.0f);
            zVar.f2891y = a2;
            a2.d(new q(2, this));
        }
        zVar.f2887u = null;
        ViewGroup viewGroup = zVar.f2845B;
        WeakHashMap weakHashMap = P.f711a;
        C.c(viewGroup);
        zVar.H();
    }

    public void D(j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f69c;
        mainActivity.runOnUiThread(new A0.b(7, mainActivity));
    }

    public boolean E(AbstractC0204a abstractC0204a, MenuC0229m menuC0229m) {
        ViewGroup viewGroup = ((z) this.f69c).f2845B;
        WeakHashMap weakHashMap = P.f711a;
        C.c(viewGroup);
        v vVar = (v) this.f68b;
        e g2 = vVar.g(abstractC0204a);
        k kVar = (k) vVar.f1308d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0229m, null);
        if (menu == null) {
            menu = new MenuC0213B((Context) vVar.f1306b, menuC0229m);
            kVar.put(menuC0229m, menu);
        }
        return ((ActionMode.Callback) vVar.f1305a).onPrepareActionMode(g2, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(j jVar, z1.v vVar) {
        String str;
        z1.q qVar;
        Charset charset;
        String str2;
        int i = 0;
        int i2 = MainActivity.f2602D;
        ((MainActivity) this.f69c).getClass();
        final String t2 = MainActivity.t(new byte[]{0, 16, -37, -100, 18, 13, -38, -39, 19, 26, -33});
        final String t3 = MainActivity.t(new byte[]{85, 12, -35, -106, 3, 10, -38, -43, 77, 93, -58, -100, 85});
        final String str3 = ((o) vVar.f4944a.f626c).f4881h;
        h hVar = vVar.f4949g;
        if (hVar != null) {
            M1.h d2 = hVar.d();
            try {
                switch (hVar.f312a) {
                    case 0:
                        String str4 = (String) hVar.f314c;
                        if (str4 != null) {
                            Pattern pattern = z1.q.f4882c;
                            try {
                                qVar = z1.j.c(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        qVar = null;
                        break;
                    default:
                        qVar = (z1.q) hVar.f314c;
                        break;
                }
                if (qVar != null) {
                    charset = q1.a.f3995a;
                    String[] strArr = qVar.f4885b;
                    int D2 = AbstractC0058a.D(0, strArr.length - 1, 2);
                    if (D2 >= 0) {
                        while (!m.o0(strArr[i], "charset")) {
                            if (i != D2) {
                                i += 2;
                            }
                        }
                        str2 = strArr[i + 1];
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
                charset = q1.a.f3995a;
                str = d2.y(A1.c.q(d2, charset));
                l.j(d2, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final MainActivity mainActivity = (MainActivity) this.f69c;
        mainActivity.runOnUiThread(new Runnable() { // from class: T0.n
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean u02 = q1.e.u0(str6, t2);
                MainActivity mainActivity2 = mainActivity;
                if (u02) {
                    if (q1.e.u0(str5, t3)) {
                        int i3 = MainActivity.f2602D;
                        mainActivity2.v();
                        return;
                    } else {
                        int i4 = MainActivity.f2602D;
                        mainActivity2.v();
                        return;
                    }
                }
                SharedPreferences sharedPreferences = mainActivity2.f2605C;
                if (sharedPreferences == null) {
                    j1.h.h("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.f68b, str6);
                edit.apply();
                mainActivity2.f2607z = str6;
                mainActivity2.w(str6);
            }
        });
    }

    public void G(g gVar) {
        int i = gVar.f636b;
        Handler handler = (Handler) this.f69c;
        d dVar = (d) this.f68b;
        if (i != 0) {
            handler.post(new J.a(dVar, i, 0));
        } else {
            handler.post(new B.a(dVar, 3, gVar.f635a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C0418i c0418i;
        char c2;
        n nVar = new n();
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
                    c0418i = null;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
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
                                    c0418i = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0418i = n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0418i = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0418i.f4609d.f4637a = true;
                                    break;
                                case 3:
                                    c0418i = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0418i.f4609d.f4651h0 = 1;
                                    break;
                                case 4:
                                    if (c0418i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0418i.f4607b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0418i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0418i.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0418i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0418i.f4609d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0418i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0418i.f4608c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0418i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0411b.a(context, xmlResourceParser, c0418i.f4610f);
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
                                ((SparseArray) this.f69c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4700c.put(Integer.valueOf(c0418i.f4606a), c0418i);
                                c0418i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f69c).put(identifier, nVar);
                return;
            }
        }
    }

    public C0019o I(V v2, int i) {
        f0 f0Var;
        C0019o c0019o;
        k kVar = (k) this.f68b;
        int e = kVar.e(v2);
        if (e >= 0 && (f0Var = (f0) kVar.j(e)) != null) {
            int i2 = f0Var.f3028a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                f0Var.f3028a = i3;
                if (i == 4) {
                    c0019o = f0Var.f3029b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0019o = f0Var.f3030c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e);
                    f0Var.f3028a = 0;
                    f0Var.f3029b = null;
                    f0Var.f3030c = null;
                    f0.f3027d.c(f0Var);
                }
                return c0019o;
            }
        }
        return null;
    }

    public void J(V v2) {
        f0 f0Var = (f0) ((k) this.f68b).getOrDefault(v2, null);
        if (f0Var == null) {
            return;
        }
        f0Var.f3028a &= -2;
    }

    public void K(V v2) {
        q.e eVar = (q.e) this.f69c;
        int e = eVar.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (v2 == eVar.f(e)) {
                Object[] objArr = eVar.f3903c;
                Object obj = objArr[e];
                Object obj2 = q.e.e;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    eVar.f3901a = true;
                }
            } else {
                e--;
            }
        }
        f0 f0Var = (f0) ((k) this.f68b).remove(v2);
        if (f0Var != null) {
            f0Var.f3028a = 0;
            f0Var.f3029b = null;
            f0Var.f3030c = null;
            f0.f3027d.c(f0Var);
        }
    }

    public void L() {
        Object parcelable;
        Integer num;
        b.j jVar = (b.j) this.f68b;
        jVar.getClass();
        String str = (String) this.f69c;
        j1.h.e(str, "key");
        if (!jVar.f2171d.contains(str) && (num = (Integer) jVar.f2169b.remove(str)) != null) {
            jVar.f2168a.remove(num);
        }
        jVar.e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f2172f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f2173g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = I.a.a(bundle, str, C0110a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0110a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0110a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f2170c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // V.p
    public boolean a(CharSequence charSequence, int i, int i2, y yVar) {
        if ((yVar.f1316c & 4) > 0) {
            return true;
        }
        if (((B) this.f68b) == null) {
            this.f68b = new B(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((N0.e) this.f69c).getClass();
        ((B) this.f68b).setSpan(new V.z(yVar), i, i2, 33);
        return true;
    }

    @Override // V.p
    public Object b() {
        return (B) this.f68b;
    }

    public void c(V v2, C0019o c0019o) {
        k kVar = (k) this.f68b;
        f0 f0Var = (f0) kVar.getOrDefault(v2, null);
        if (f0Var == null) {
            f0Var = f0.a();
            kVar.put(v2, f0Var);
        }
        f0Var.f3030c = c0019o;
        f0Var.f3028a |= 8;
    }

    @Override // k0.InterfaceC0202d
    public String d() {
        return (String) this.f68b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // M.InterfaceC0020p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t0 e(View view, t0 t0Var) {
        boolean z2;
        boolean z3;
        H0.p pVar = (H0.p) this.f69c;
        int i = pVar.f541a;
        K.h hVar = (K.h) this.f68b;
        r0 r0Var = t0Var.f794a;
        E.c f2 = r0Var.f(7);
        E.c f3 = r0Var.f(32);
        int i2 = f2.f280b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f667b;
        bottomSheetBehavior.f2306w = i2;
        boolean e = H0.m.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f2298o;
        if (z4) {
            int a2 = t0Var.a();
            bottomSheetBehavior.f2305v = a2;
            paddingBottom = a2 + pVar.f543c;
        }
        int i3 = pVar.f542b;
        boolean z5 = bottomSheetBehavior.f2299p;
        int i4 = f2.f279a;
        if (z5) {
            paddingLeft = (e ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f2300q;
        int i5 = f2.f281c;
        if (z6) {
            if (!e) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f2302s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f2303t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f2304u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f280b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = hVar.f666a;
                if (z3) {
                    bottomSheetBehavior.f2296m = f3.f282d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.O();
                }
                return t0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = hVar.f666a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.O();
        return t0Var;
    }

    public void f(boolean z2) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        I i = (I) this.f69c;
        AbstractActivityC0132i abstractActivityC0132i = i.f1461t.f1638c;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = i.f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
    public void k() {
        ((Animator) this.f68b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f69c) + " has been canceled.");
        }
    }

    public void l(boolean z2) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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

    public void m(boolean z2) {
        I i = (I) this.f69c;
        AbstractActivityC0132i abstractActivityC0132i = i.f1461t.f1638c;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = i.f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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

    @Override // k0.InterfaceC0202d
    public void q(InterfaceC0201c interfaceC0201c) {
        Object[] objArr = (Object[]) this.f69c;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                interfaceC0201c.k(i);
            } else if (obj instanceof byte[]) {
                interfaceC0201c.j(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                interfaceC0201c.m(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                interfaceC0201c.m(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                interfaceC0201c.t(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                interfaceC0201c.t(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                interfaceC0201c.t(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                interfaceC0201c.t(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                interfaceC0201c.l((String) obj, i);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                interfaceC0201c.t(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        switch (this.f67a) {
            case 4:
                return "Bounds{lower=" + ((E.c) this.f68b) + " upper=" + ((E.c) this.f69c) + "}";
            case 19:
                String str = "[ ";
                if (((C0381f) this.f68b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0381f) this.f68b).f4137h[i] + " ";
                    }
                }
                return str + "] " + ((C0381f) this.f68b);
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((I) this.f69c).f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            abstractComponentCallbacksC0053q.j().f1453l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f68b).iterator();
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
        int[] iArr = (int[]) this.f68b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f68b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f68b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f68b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View w(int i, int i2, int i3, int i4) {
        View u2;
        C0139E c0139e = (C0139E) this.f68b;
        int d2 = c0139e.d();
        int c2 = c0139e.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0139e.f2898a) {
                case 0:
                    u2 = c0139e.f2899b.u(i);
                    break;
                default:
                    u2 = c0139e.f2899b.u(i);
                    break;
            }
            int b2 = c0139e.b(u2);
            int a2 = c0139e.a(u2);
            e0 e0Var = (e0) this.f69c;
            e0Var.f3019b = d2;
            e0Var.f3020c = c2;
            e0Var.f3021d = b2;
            e0Var.e = a2;
            if (i3 != 0) {
                e0Var.f3018a = i3;
                if (e0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                e0Var.f3018a = i4;
                if (e0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void y() {
        ((SparseIntArray) this.f68b).clear();
    }

    public boolean z(View view) {
        C0139E c0139e = (C0139E) this.f68b;
        int d2 = c0139e.d();
        int c2 = c0139e.c();
        int b2 = c0139e.b(view);
        int a2 = c0139e.a(view);
        e0 e0Var = (e0) this.f69c;
        e0Var.f3019b = d2;
        e0Var.f3020c = c2;
        e0Var.f3021d = b2;
        e0Var.e = a2;
        e0Var.f3018a = 24579;
        return e0Var.a();
    }

    public /* synthetic */ c(LayoutInflater.Factory2 factory2, Object obj, int i) {
        this.f67a = i;
        this.f69c = factory2;
        this.f68b = obj;
    }

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f67a = i;
        this.f68b = obj;
        this.f69c = obj2;
    }

    public c(String str, Object[] objArr) {
        this.f67a = 18;
        j1.h.e(str, "query");
        this.f68b = str;
        this.f69c = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        this(str, (Object[]) null);
        this.f67a = 18;
        j1.h.e(str, "query");
    }

    public c(C0379d c0379d) {
        this.f67a = 19;
        this.f69c = c0379d;
    }

    public c(I i) {
        this.f67a = 10;
        this.f68b = new CopyOnWriteArrayList();
        this.f69c = i;
    }

    public c(String[] strArr, t1.b bVar) {
        this.f67a = 11;
        this.f69c = bVar;
        this.f67a = 11;
        j1.h.e(strArr, "tables");
        this.f68b = strArr;
    }

    public c(C0139E c0139e) {
        this.f67a = 16;
        this.f68b = c0139e;
        e0 e0Var = new e0();
        e0Var.f3018a = 0;
        this.f69c = e0Var;
    }

    public c(Animation animation) {
        this.f67a = 9;
        this.f68b = animation;
        this.f69c = null;
    }

    public c(Animator animator) {
        this.f67a = 9;
        this.f68b = null;
        this.f69c = animator;
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f67a = 1;
        int size = arrayList.size();
        this.f68b = new int[size];
        this.f69c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f68b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f69c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public c(int i, int i2) {
        this.f67a = 1;
        this.f68b = new int[]{i, i2};
        this.f69c = new float[]{0.0f, 1.0f};
    }

    public c(int i, int i2, int i3) {
        this.f67a = 1;
        this.f68b = new int[]{i, i2, i3};
        this.f69c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public c(EditText editText) {
        this.f67a = 7;
        this.f68b = editText;
        i iVar = new i(editText);
        this.f69c = iVar;
        editText.addTextChangedListener(iVar);
        if (X.a.f1347b == null) {
            synchronized (X.a.f1346a) {
                try {
                    if (X.a.f1347b == null) {
                        X.a aVar = new X.a();
                        try {
                            X.a.f1348c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, X.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        X.a.f1347b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(X.a.f1347b);
    }

    public c(int i) {
        this.f67a = i;
        switch (i) {
            case 17:
                this.f68b = new k();
                this.f69c = new q.e();
                break;
            default:
                this.f68b = new SparseIntArray();
                this.f69c = new SparseIntArray();
                break;
        }
    }
}
