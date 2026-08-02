package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brn {
    public final Object a;

    public brn(cfz cfzVar) {
        String str = awa.a;
        List c = ixc.c(new awe((awp) cfzVar.a), new awf((awk) cfzVar.d), new awh((awp) cfzVar.b));
        Object systemService = ((Context) cfzVar.c).getSystemService("connectivity");
        systemService.getClass();
        c.add(new avw((ConnectivityManager) systemService));
        this.a = c;
    }

    public static final void C(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((aqz) it.next()).a();
        }
    }

    public static void K(View view, yy yyVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new zd(yyVar));
            return;
        }
        Interpolator interpolator = zc.a;
        View.OnApplyWindowInsetsListener zbVar = new zb(view, yyVar);
        view.setTag(R.id.tag_window_insets_animation_callback, zbVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(zbVar);
        }
    }

    public static brn aa(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new brn(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2), (byte[]) null);
    }

    public static brn ab(int i, int i2, int i3) {
        return new brn(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3), (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void A(String str, Object obj) {
        this.a.put(str, obj);
    }

    public final void B(String str, long j) {
        A(str, Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final List D() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ym) it.next()).l());
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void E(alk alkVar) {
        alkVar.getClass();
        int i = alkVar.a;
        ?? r3 = this.a;
        Integer valueOf = Integer.valueOf(i);
        Object obj = r3.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            r3.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        Integer valueOf2 = Integer.valueOf(alkVar.b);
        if (treeMap.containsKey(valueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(valueOf2) + " with " + alkVar);
        }
        treeMap.put(valueOf2, alkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(kzr kzrVar, kqj kqjVar) {
        ajo ajoVar;
        int i;
        if (kqjVar instanceof ajo) {
            ajoVar = (ajo) kqjVar;
            int i2 = ajoVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ajoVar.b = i2 - Integer.MIN_VALUE;
                Object obj = ajoVar.a;
                kqp kqpVar = kqp.a;
                i = ajoVar.b;
                if (i != 0) {
                    ixc.Y(obj);
                    Object obj2 = this.a;
                    ajoVar.b = 1;
                    if (((lao) obj2).a(kzrVar, ajoVar) == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                throw new koh();
            }
        }
        ajoVar = new ajo(this, kqjVar);
        Object obj3 = ajoVar.a;
        kqp kqpVar2 = kqp.a;
        i = ajoVar.b;
        if (i != 0) {
        }
        throw new koh();
    }

    public final Object G() {
        return ((WeakReference) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void H() {
        ?? r2 = this.a;
        int size = r2.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((abl) ((ArrayList) r2).get(size)).a();
            }
        }
    }

    public final float I() {
        return ((zf) this.a).h();
    }

    public final int J() {
        return ((zf) this.a).i();
    }

    public final void L(float f) {
        ((zf) this.a).k(f);
    }

    public final void M() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void N(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void O(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void P(yv yvVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (yvVar != null) {
                view.animate().setListener(new yu(yvVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void Q(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xw] */
    public final void R(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xw] */
    public final void S(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }

    public final Object T(Object obj, Object obj2) {
        return ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final boolean U() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public final boolean V() {
        return oy.i((Context) this.a);
    }

    public final boolean W() {
        return oy.f((Context) this.a);
    }

    public final by X() {
        return ((bl) this.a).e;
    }

    public final void Y() {
        ((bl) this.a).e.noteStateNotSaved();
    }

    public final void Z() {
        ((bl) this.a).e.af(true);
    }

    public final void a(pe peVar) {
        ((pg) this.a).b(peVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ac(kee keeVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(keeVar != null ? new mu(keeVar, 2, 0 == true ? 1 : 0) : null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bbo, java.lang.Object] */
    public final synchronized bbo b(Class cls) {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            afr afrVar = (afr) r0.get(i);
            if (((Class) afrVar.a).isAssignableFrom(cls)) {
                return afrVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(Class cls, bbo bboVar) {
        this.a.add(new afr(cls, bboVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List d() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void e(baz bazVar) {
        this.a.add(bazVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bax, java.lang.Object] */
    public final synchronized bax f(Class cls) {
        for (afr afrVar : this.a) {
            if (((Class) afrVar.a).isAssignableFrom(cls)) {
                return afrVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void g(Class cls, bax baxVar) {
        this.a.add(new afr(cls, baxVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bjs, java.lang.Object] */
    public final synchronized bjs h(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return bjt.a;
        }
        for (bvw bvwVar : this.a) {
            if (bvwVar.c(cls, cls2)) {
                return bvwVar.a;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + String.valueOf(cls) + " to " + String.valueOf(cls2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List i(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (bvw bvwVar : this.a) {
            if (bvwVar.c(cls, cls2)) {
                Object obj = bvwVar.b;
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void j(Class cls, Class cls2, bjs bjsVar) {
        this.a.add(new bvw(cls, cls2, bjsVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized bau k(ByteBuffer byteBuffer) {
        bau bauVar;
        bauVar = (bau) this.a.poll();
        if (bauVar == null) {
            bauVar = new bau();
        }
        bauVar.b = null;
        Arrays.fill(bauVar.a, (byte) 0);
        bauVar.c = new bat();
        bauVar.d = 0;
        bauVar.b = byteBuffer.asReadOnlyBuffer();
        bauVar.b.position(0);
        bauVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return bauVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void l(bau bauVar) {
        bauVar.b = null;
        bauVar.c = null;
        this.a.offer(bauVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void m() {
        this.a.clear();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void n(hip hipVar) {
        hoq.C(!hipVar.b(), "range must not be empty, but was %s", hipVar);
        this.a.add(hipVar);
    }

    public final gxv o(gxq gxqVar) {
        qy qyVar = (qy) this.a;
        if (!qyVar.isEmpty()) {
            Class<?> cls = gxqVar.getClass();
            for (int i = 0; i < qyVar.d; i++) {
                Class cls2 = (Class) qyVar.c(i);
                gxu gxuVar = (gxu) qyVar.f(i);
                if (cls2.isAssignableFrom(cls)) {
                    return gxuVar.a(gxqVar);
                }
            }
        }
        return gxv.b;
    }

    public final void p(Class cls, gxu gxuVar) {
        int i = 0;
        while (true) {
            qy qyVar = (qy) this.a;
            if (i >= qyVar.d) {
                qyVar.put(cls, gxuVar);
                return;
            }
            Class<?> cls2 = (Class) qyVar.c(i);
            hoq.C(!cls.equals(cls2), "Class %s is already registered as a listener. Are you adding the same listener twice?", cls.getSimpleName());
            hoq.F(!cls.isAssignableFrom(cls2), "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName());
            hoq.F(!cls2.isAssignableFrom(cls), "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName());
            i++;
        }
    }

    public final void q() {
        ((qy) this.a).clear();
    }

    public final void r(View view, gxq gxqVar) {
        int i = 0;
        view.setOnClickListener(new gxx(this, new gxw(i), new cx(gxqVar, 17, null), i));
    }

    public final hvi s(Callable callable, Executor executor) {
        return ((jxu) this.a).a(gvx.i(callable), executor);
    }

    public final hvi t(htq htqVar, Executor executor) {
        return ((jxu) this.a).b(gvx.b(htqVar), executor);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void u(bbh bbhVar, bdn bdnVar) {
        ?? r1 = this.a;
        if (bdnVar.equals(r1.get(bbhVar))) {
            r1.remove(bbhVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean v(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    public final kzq w(axt axtVar) {
        axtVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((awg) obj).b(axtVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ixc.w(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((awg) it.next()).a(axtVar.k));
        }
        return kzt.a(new azc((kzq[]) ixc.p(arrayList2).toArray(new kzq[0]), 1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final asa x() {
        asa asaVar = new asa((Map) this.a);
        yn.i(asaVar);
        return asaVar;
    }

    public final void y(asa asaVar) {
        asaVar.getClass();
        z(asaVar.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void z(Map map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            ?? r2 = this.a;
            if (value == null) {
                value = null;
            } else {
                int i = ksx.a;
                ksj ksjVar = new ksj(value.getClass());
                if (!ksp.b(ksjVar, new ksj(Boolean.TYPE)) && !ksp.b(ksjVar, new ksj(Byte.TYPE)) && !ksp.b(ksjVar, new ksj(Integer.TYPE)) && !ksp.b(ksjVar, new ksj(Long.TYPE)) && !ksp.b(ksjVar, new ksj(Float.TYPE)) && !ksp.b(ksjVar, new ksj(Double.TYPE)) && !ksp.b(ksjVar, new ksj(String.class)) && !ksp.b(ksjVar, new ksj(Boolean[].class)) && !ksp.b(ksjVar, new ksj(Byte[].class)) && !ksp.b(ksjVar, new ksj(Integer[].class)) && !ksp.b(ksjVar, new ksj(Long[].class)) && !ksp.b(ksjVar, new ksj(Float[].class)) && !ksp.b(ksjVar, new ksj(Double[].class)) && !ksp.b(ksjVar, new ksj(String[].class))) {
                    int i2 = 0;
                    if (ksp.b(ksjVar, new ksj(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = asb.a;
                        objArr = new Boolean[length];
                        while (i2 < length) {
                            objArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                    } else if (ksp.b(ksjVar, new ksj(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int length2 = bArr.length;
                        String str3 = asb.a;
                        objArr = new Byte[length2];
                        while (i2 < length2) {
                            objArr[i2] = Byte.valueOf(bArr[i2]);
                            i2++;
                        }
                    } else if (ksp.b(ksjVar, new ksj(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length3 = iArr.length;
                        String str4 = asb.a;
                        objArr = new Integer[length3];
                        while (i2 < length3) {
                            objArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                    } else if (ksp.b(ksjVar, new ksj(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length4 = jArr.length;
                        String str5 = asb.a;
                        objArr = new Long[length4];
                        while (i2 < length4) {
                            objArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                    } else if (ksp.b(ksjVar, new ksj(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length5 = fArr.length;
                        String str6 = asb.a;
                        objArr = new Float[length5];
                        while (i2 < length5) {
                            objArr[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                    } else {
                        if (!ksp.b(ksjVar, new ksj(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + ksjVar);
                        }
                        double[] dArr = (double[]) value;
                        int length6 = dArr.length;
                        String str7 = asb.a;
                        objArr = new Double[length6];
                        while (i2 < length6) {
                            objArr[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                    }
                    value = objArr;
                }
            }
            r2.put(str, value);
        }
    }

    public brn(TextView textView) {
        this.a = new add(textView);
    }

    public brn(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public brn(Object obj, char[] cArr) {
        this.a = obj;
    }

    public brn(Context context, byte[] bArr) {
        this.a = context.getApplicationContext();
    }

    public brn(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new AtomicReference(null);
    }

    public brn(short[] sArr) {
        this.a = new bgc();
    }

    public brn(Object obj) {
        this.a = new WeakReference(obj);
    }

    public brn(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public brn(char[] cArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public brn(int i) {
        this.a = lak.a(new int[i]);
    }

    public brn(View view, byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new xu(view);
        } else {
            this.a = new xv();
        }
    }

    public brn(byte[] bArr, char[] cArr) {
        char[] cArr2 = bmi.a;
        this.a = new ArrayDeque(0);
    }

    public brn(View view) {
        this.a = new WeakReference(view);
    }

    public brn(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new LinkedHashMap();
    }

    public brn(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ze(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new zc(i, interpolator, j);
        }
    }

    public brn(amn amnVar) {
        amnVar.getClass();
        this.a = amnVar;
    }

    public brn(char[] cArr) {
        this.a = new ArrayList();
    }

    public brn(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public brn(byte[] bArr, byte[] bArr2, short[] sArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public brn(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0L);
        this.a = new ze(windowInsetsAnimation);
    }

    public brn(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public brn(char[] cArr, char[] cArr2) {
        this.a = new LinkedHashMap();
    }

    public brn(axl axlVar) {
        axlVar.getClass();
        this.a = axlVar;
    }

    public brn(byte[] bArr) {
        this.a = new ArrayList();
    }

    public brn(short[] sArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public brn(bd bdVar, ox oxVar) {
        this.a = new pg(bdVar, oxVar);
    }

    public brn(Context context) {
        this.a = new ehn(context);
    }

    public brn() {
        this.a = new LinkedHashSet();
    }

    public brn(byte[] bArr, short[] sArr) {
        this.a = new qy(0);
    }

    public brn(Matcher matcher) {
        matcher.getClass();
        this.a = matcher;
    }

    public brn(int[] iArr) {
        this.a = new ArrayList();
    }

    public brn(byte[] bArr, int[] iArr) {
        this.a = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public brn(brn brnVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap((Map) brnVar.a));
    }

    public brn(boolean[] zArr) {
        this.a = new HashMap();
        new HashMap();
    }

    public brn(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new ArrayDeque();
    }
}
