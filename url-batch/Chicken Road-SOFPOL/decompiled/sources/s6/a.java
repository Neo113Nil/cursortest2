package s6;

import a0.v0;
import a0.z0;
import a7.o;
import a7.x;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import c.d;
import c.f;
import c.g;
import c5.y;
import c6.h;
import com.snovikpovik.vuevnxsj.R;
import d4.w;
import d6.j;
import d6.u;
import f7.q;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import l1.e;
import m0.b;
import m0.n;
import m0.s;
import m0.t1;
import q6.i;
import q6.v;
import s4.c;
import w1.b1;
import w1.d1;
import w1.f0;
import w1.k;
import x1.k0;
import y0.l;
import y0.m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6729a = true;

    /* renamed from: b, reason: collision with root package name */
    public static e f6730b;

    /* renamed from: c, reason: collision with root package name */
    public static e f6731c;

    /* renamed from: d, reason: collision with root package name */
    public static e f6732d;

    /* renamed from: e, reason: collision with root package name */
    public static e f6733e;

    /* renamed from: f, reason: collision with root package name */
    public static e f6734f;

    public static final List A(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : x(list.get(0)) : u.f2326d;
    }

    public static int B(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    public static long C(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d8);
    }

    public static final m D(m mVar, float f6) {
        return (f6 == 1.0f && f6 == 1.0f) ? mVar : androidx.compose.ui.graphics.a.c(mVar, f6, f6, 0.0f, null, 524284);
    }

    public static final Object H(q qVar, q qVar2, p6.e eVar) {
        Object oVar;
        Object T;
        try {
            v.c(2, eVar);
            oVar = eVar.g(qVar2, qVar);
        } catch (Throwable th) {
            oVar = new o(th, false);
        }
        h6.a aVar = h6.a.f3204d;
        if (oVar == aVar || (T = qVar.T(oVar)) == x.f314e) {
            return aVar;
        }
        if (T instanceof o) {
            throw ((o) T).f286a;
        }
        return x.s(T);
    }

    public static void I(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.b(viewGroup, z3);
        } else if (f6729a) {
            try {
                y.b(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f6729a = false;
            }
        }
    }

    public static void J() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void K(Object obj) {
        if (obj instanceof h) {
            throw ((h) obj).f1749d;
        }
    }

    public static final String L(float f6) {
        if (Float.isNaN(f6)) {
            return "NaN";
        }
        if (Float.isInfinite(f6)) {
            return f6 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f8 = f6 * pow;
        int i = (int) f8;
        if (f8 - i >= 0.5f) {
            i++;
        }
        float f9 = i / pow;
        return max > 0 ? String.valueOf(f9) : String.valueOf((int) f9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v5, types: [b.v] */
    /* JADX WARN: Type inference failed for: r18v0, types: [m0.s] */
    public static final void a(final boolean z3, final p6.e eVar, s sVar, final int i) {
        int i8;
        b.v vVar;
        ?? r11;
        b.v vVar2;
        sVar.W(-642000585);
        if ((i & 6) == 0) {
            i8 = (sVar.g(z3) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(eVar) ? 32 : 16;
        }
        if (sVar.N(i8 & 1, (i8 & 19) != 18)) {
            c cVar = (c) sVar.j(t4.a.f6897a);
            if (cVar == null) {
                sVar.V(950836184);
                View view = (View) sVar.j(k0.f8491e);
                i.e(view, "<this>");
                while (true) {
                    if (view == null) {
                        cVar = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    c cVar2 = tag instanceof c ? (c) tag : null;
                    if (cVar2 != null) {
                        cVar = cVar2;
                        break;
                    } else {
                        Object L = r2.o.L(view);
                        view = L instanceof View ? (View) L : null;
                    }
                }
                sVar.p(false);
            } else {
                sVar.V(950834231);
                sVar.p(false);
            }
            b.v vVar3 = (b.v) sVar.j(f.f1548a);
            if (vVar3 == null) {
                sVar.V(1208426157);
                View view2 = (View) sVar.j(k0.f8491e);
                i.e(view2, "<this>");
                while (true) {
                    if (view2 == null) {
                        vVar2 = null;
                        break;
                    }
                    Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    b.v vVar4 = tag2 instanceof b.v ? (b.v) tag2 : null;
                    if (vVar4 != null) {
                        vVar2 = vVar4;
                        break;
                    } else {
                        Object L2 = r2.o.L(view2);
                        view2 = L2 instanceof View ? (View) L2 : null;
                    }
                }
                sVar.p(false);
                vVar = vVar2;
            } else {
                sVar.V(1208423708);
                sVar.p(false);
                vVar = vVar3;
            }
            if (vVar == null) {
                sVar.V(1208428160);
                Context context = (Context) sVar.j(k0.f8488b);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        context = null;
                        break;
                    } else if (context instanceof b.v) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                sVar.p(false);
                r11 = (b.v) context;
            } else {
                sVar.V(1208423789);
                sVar.p(false);
                r11 = vVar;
            }
            c cVar3 = cVar == null ? r11 : cVar;
            if (cVar3 == null) {
                throw new IllegalArgumentException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            Object K = sVar.K();
            Object obj = n.f5019a;
            if (K == obj) {
                K = new d.a(cVar != null ? cVar.c() : null, r11 != 0 ? r11.a() : null);
                sVar.f0(K);
            }
            d.a aVar = (d.a) K;
            Object K2 = sVar.K();
            if (K2 == obj) {
                K2 = b.l(sVar);
                sVar.f0(K2);
            }
            a7.u uVar = (a7.u) K2;
            long j7 = sVar.T;
            boolean f6 = sVar.f(aVar) | sVar.e(j7);
            Object K3 = sVar.K();
            if (f6 || K3 == obj) {
                K3 = new d(uVar, new g(j7, cVar3));
                sVar.f0(K3);
            }
            d dVar = (d) K3;
            sVar.V(-348495408);
            boolean h8 = sVar.h(dVar) | sVar.h(eVar);
            Object K4 = sVar.K();
            if (h8 || K4 == obj) {
                K4 = new z0(4, dVar, eVar);
                sVar.f0(K4);
            }
            b.g((p6.a) K4, sVar);
            int i9 = i8;
            Boolean valueOf = Boolean.valueOf(z3);
            int i10 = i9 & 14;
            boolean h9 = sVar.h(dVar) | (i10 == 4);
            Object K5 = sVar.K();
            if (h9 || K5 == obj) {
                K5 = new c.h(dVar, z3);
                sVar.f0(K5);
            }
            m.a.b(valueOf, dVar, null, (p6.c) K5, sVar, i10);
            boolean h10 = sVar.h(aVar) | sVar.h(dVar);
            Object K6 = sVar.K();
            if (h10 || K6 == obj) {
                K6 = new v0(4, aVar, dVar);
                sVar.f0(K6);
            }
            b.c(aVar, dVar, (p6.c) K6, sVar);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: c.i
                @Override // p6.e
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int w7 = m0.b.w(i | 1);
                    s6.a.a(z3, eVar, (s) obj2, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final e1.d b(float f6, float f8, float f9, float f10, long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new e1.d(f6, f8, f9, f10, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final int c(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i8 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i8 << 1) | i;
    }

    public static final boolean d(long j7) {
        return !r2.i.a(j7, 9223372034707292159L);
    }

    public static void e(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, "exception");
        if (th != th2) {
            Integer num = l6.a.f4868a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = k6.a.f4198a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static ArrayList f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public static final Object g(k kVar, b0.a aVar, i6.i iVar) {
        Object obj;
        d1 t3;
        Object G;
        b1 b1Var;
        l lVar = (l) kVar;
        boolean z3 = lVar.f8706d.f8718q;
        if (z3) {
            if (!z3) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            l lVar2 = lVar.f8706d.f8710h;
            f0 u7 = w1.f.u(kVar);
            loop0: while (true) {
                obj = null;
                if (u7 == null) {
                    break;
                }
                if ((u7.F.f7600f.f8709g & 524288) != 0) {
                    while (lVar2 != null) {
                        if ((lVar2.f8708f & 524288) != 0) {
                            l lVar3 = lVar2;
                            o0.e eVar = null;
                            while (lVar3 != null) {
                                if (lVar3 instanceof a2.a) {
                                    obj = lVar3;
                                    break loop0;
                                }
                                if ((lVar3.f8708f & 524288) != 0 && (lVar3 instanceof w1.l)) {
                                    int i = 0;
                                    for (l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                        if ((lVar4.f8708f & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lVar3 = lVar4;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new l[16]);
                                                }
                                                if (lVar3 != null) {
                                                    eVar.b(lVar3);
                                                    lVar3 = null;
                                                }
                                                eVar.b(lVar4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVar3 = w1.f.f(eVar);
                            }
                        }
                        lVar2 = lVar2.f8710h;
                    }
                }
                u7 = u7.s();
                lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
            }
            a2.a aVar2 = (a2.a) obj;
            if (aVar2 != null && (G = aVar2.G((t3 = w1.f.t(kVar)), new a2.b(0, aVar, t3), iVar)) == h6.a.f3204d) {
                return G;
            }
        }
        return c6.m.f1757a;
    }

    public static e6.c h(e6.c cVar) {
        cVar.g();
        cVar.f2516f = true;
        return cVar.f2515e > 0 ? cVar : e6.c.f2513g;
    }

    public static final int i(float f6) {
        return Math.round((float) Math.ceil(f6));
    }

    public static void j(int i, int i8, int i9) {
        if (i >= 0 && i8 <= i9) {
            if (i > i8) {
                throw new IllegalArgumentException(a0.q.i("fromIndex: ", i, " > toIndex: ", i8));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i8 + ", size: " + i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w k(Context context) {
        ProviderInfo providerInfo;
        n3.c cVar;
        ApplicationInfo applicationInfo;
        w5.f dVar = Build.VERSION.SDK_INT >= 28 ? new d4.d(8) : new w5.f(8);
        PackageManager packageManager = context.getPackageManager();
        h0.a.o(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] i = dVar.i(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : i) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new n3.c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e8) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e8);
            }
            if (cVar != null) {
                return null;
            }
            return new w(new d4.v(context, cVar));
        }
        cVar = null;
        if (cVar != null) {
        }
    }

    public static final h l(Throwable th) {
        i.e(th, "exception");
        return new h(th);
    }

    public static String o(androidx.datastore.preferences.protobuf.g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i = 0; i < gVar.size(); i++) {
            byte a8 = gVar.a(i);
            if (a8 == 34) {
                sb.append("\\\"");
            } else if (a8 == 39) {
                sb.append("\\'");
            } else if (a8 != 92) {
                switch (a8) {
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case x.v0.f8304b /* 9 */:
                        sb.append("\\t");
                        break;
                    case x.v0.f8306d /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a8 < 32 || a8 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a8 >>> 6) & 3) + 48));
                            sb.append((char) (((a8 >>> 3) & 7) + 48));
                            sb.append((char) ((a8 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a8);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final e p() {
        e eVar = f6730b;
        if (eVar != null) {
            return eVar;
        }
        l1.d dVar = new l1.d("Filled.ArrowForward");
        int i = l1.y.f4827a;
        f1.k0 k0Var = new f1.k0(f1.s.f2698b);
        h4.k kVar = new h4.k(1);
        kVar.h(12.0f, 4.0f);
        kVar.g(-1.41f, 1.41f);
        kVar.f(16.17f, 11.0f);
        l1.j jVar = new l1.j(4.0f);
        ArrayList arrayList = kVar.f3194a;
        arrayList.add(jVar);
        kVar.j(2.0f);
        kVar.e(12.17f);
        kVar.g(-5.58f, 5.59f);
        kVar.f(12.0f, 20.0f);
        kVar.g(8.0f, -8.0f);
        kVar.a();
        l1.d.a(dVar, arrayList, k0Var);
        e b8 = dVar.b();
        f6730b = b8;
        return b8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f3144c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList q(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h3.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h3.i iVar = new h3.i(resources, theme);
        synchronized (h3.k.f3152c) {
            try {
                SparseArray sparseArray = (SparseArray) h3.k.f3151b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (h3.h) sparseArray.get(i)) != null) {
                    if (hVar.f3143b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.f3144c != 0) {
                            }
                            colorStateList2 = hVar.f3142a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = h3.k.f3150a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i8 = typedValue.type;
        if (i8 < 28 || i8 > 31) {
            try {
                colorStateList = h3.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e8) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (h3.k.f3152c) {
            try {
                WeakHashMap weakHashMap = h3.k.f3151b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i, new h3.h(colorStateList, iVar.f3145a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Set r() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int t(List list) {
        i.e(list, "<this>");
        return list.size() - 1;
    }

    public static final long u(b1.b bVar) {
        DragEvent dragEvent = (DragEvent) bVar.f1050e;
        float x7 = dragEvent.getX();
        float y7 = dragEvent.getY();
        return (Float.floatToRawIntBits(x7) << 32) | (Float.floatToRawIntBits(y7) & 4294967295L);
    }

    public static final boolean w(e1.d dVar) {
        long j7 = dVar.f2465e;
        return (j7 >>> 32) == (4294967295L & j7) && j7 == dVar.f2466f && j7 == dVar.f2467g && j7 == dVar.f2468h;
    }

    public static List x(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List y(Object... objArr) {
        if (objArr.length <= 0) {
            return u.f2326d;
        }
        List asList = Arrays.asList(objArr);
        i.d(asList, "asList(...)");
        return asList;
    }

    public static ArrayList z(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public abstract void E(boolean z3);

    public abstract void F(boolean z3);

    public abstract void G(w5.y yVar, float f6);

    public abstract String m(byte[] bArr, int i, int i8);

    public abstract int n(String str, byte[] bArr, int i, int i8);

    public abstract InputFilter[] s(InputFilter[] inputFilterArr);

    public abstract float v(w5.y yVar);
}
