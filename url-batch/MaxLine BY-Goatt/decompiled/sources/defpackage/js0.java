package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import defpackage.aa2;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class js0 implements hs, e43, ek0 {
    public Object m;
    public Object n;
    public Object o;
    public Object p;

    public js0(Typeface typeface, ll1 ll1Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.p = typeface;
        this.m = ll1Var;
        this.o = new ml1(1024);
        int a = ll1Var.a(6);
        if (a != 0) {
            int i5 = a + ll1Var.m;
            i = ((ByteBuffer) ll1Var.p).getInt(((ByteBuffer) ll1Var.p).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.n = new char[i * 2];
        int a2 = ll1Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + ll1Var.m;
            i2 = ((ByteBuffer) ll1Var.p).getInt(((ByteBuffer) ll1Var.p).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            e13 e13Var = new e13(this, i7);
            kl1 b = e13Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.p).getInt(a3 + b.m) : 0, (char[]) this.n, i7 * 2);
            kl1 b2 = e13Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.m;
                i3 = ((ByteBuffer) b2.p).getInt(((ByteBuffer) b2.p).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                lh.e("invalid metadata codepoint length");
                throw null;
            }
            ml1 ml1Var = (ml1) this.o;
            kl1 b3 = e13Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.m;
                i4 = ((ByteBuffer) b3.p).getInt(((ByteBuffer) b3.p).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            ml1Var.a(e13Var, 0, i4 - 1);
        }
    }

    public void A(is0 is0Var) {
        fr0 fr0Var = is0Var.c;
        if (fr0Var.mRetainInstance) {
            ((es0) this.p).h(fr0Var);
        }
        if (((is0) ((HashMap) this.n).put(fr0Var.mWho, null)) != null && as0.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fr0Var);
        }
    }

    public void B(String str, zm3 zm3Var) {
        str.getClass();
        if (str.length() <= 0) {
            lh.e("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            lh.c(q40.m("method ", str, " must have a request body."));
        } else {
            this.n = str;
        }
    }

    public boolean C(i3 i3Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.n).onActionItemClicked(r(i3Var), new qk1((Context) this.o, (yq2) menuItem));
    }

    public boolean D(i3 i3Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.n;
        tq2 r = r(i3Var);
        fl2 fl2Var = (fl2) this.p;
        Menu menu2 = (Menu) fl2Var.get(menu);
        if (menu2 == null) {
            menu2 = new dl1((Context) this.o, (fk1) menu);
            fl2Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(r, menu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = n33.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.n).iterator();
                it.getClass();
                while (it.hasNext()) {
                    q62 q62Var = (q62) it.next();
                    if (((ArrayDeque) this.o).size() >= 64) {
                        break;
                    }
                    if (q62Var.n.get() < 5) {
                        it.remove();
                        q62Var.n.incrementAndGet();
                        arrayList.add(q62Var);
                        ((ArrayDeque) this.o).add(q62Var);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.o).size();
                    ((ArrayDeque) this.p).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    q62 q62Var2 = (q62) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.m) == null) {
                                this.m = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new m33(n33.f + " Dispatcher", false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.m;
                            threadPoolExecutor.getClass();
                        } finally {
                        }
                    }
                    q62Var2.getClass();
                    t62 t62Var = q62Var2.o;
                    byte[] bArr2 = n33.a;
                    try {
                        try {
                            threadPoolExecutor.execute(q62Var2);
                        } catch (Throwable th) {
                            t62Var.m.m.q(q62Var2);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        t62Var.h(interruptedIOException);
                        q30 q30Var = q62Var2.m;
                        if (!t62Var.y) {
                            fs fsVar = (fs) q30Var.o;
                            aa2.a aVar = aa2.m;
                            fsVar.resumeWith(new ba2(interruptedIOException));
                        }
                        t62Var.m.m.q(q62Var2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Unit unit = Unit.a;
        size = arrayList.size();
        while (i < size) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        if (r8.f(r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:25:0x0065, B:27:0x0071, B:30:0x007c), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:25:0x0065, B:27:0x0071, B:30:0x007c), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v10, types: [oo1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object F(r30 r30Var) {
        lc2 lc2Var;
        int i;
        qo1 qo1Var;
        Throwable th;
        oo1 oo1Var;
        js0 js0Var;
        try {
            if (r30Var instanceof lc2) {
                lc2Var = (lc2) r30Var;
                int i2 = lc2Var.q;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lc2Var.q = i2 - Integer.MIN_VALUE;
                    Object obj = lc2Var.o;
                    b50 b50Var = b50.m;
                    i = lc2Var.q;
                    if (i != 0) {
                        ca2.b(obj);
                        if (!(((dx) this.n).O() instanceof v11)) {
                            return Unit.a;
                        }
                        qo1Var = (qo1) this.m;
                        lc2Var.m = this;
                        lc2Var.n = qo1Var;
                        lc2Var.q = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oo1Var = lc2Var.n;
                            js0Var = lc2Var.m;
                            try {
                                ca2.b(obj);
                                dx dxVar = (dx) js0Var.n;
                                Unit unit = Unit.a;
                                dxVar.U(unit);
                                oo1Var.b(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                oo1Var.b(null);
                                throw th;
                            }
                        }
                        ?? r7 = lc2Var.n;
                        js0 js0Var2 = lc2Var.m;
                        ca2.b(obj);
                        qo1Var = r7;
                        this = js0Var2;
                    }
                    if (((dx) this.n).O() instanceof v11) {
                        Unit unit2 = Unit.a;
                        qo1Var.b(null);
                        return unit2;
                    }
                    lc2Var.m = this;
                    lc2Var.n = qo1Var;
                    lc2Var.q = 2;
                    if (this.h(lc2Var) != b50Var) {
                        js0Var = this;
                        oo1Var = qo1Var;
                        dx dxVar2 = (dx) js0Var.n;
                        Unit unit3 = Unit.a;
                        dxVar2.U(unit3);
                        oo1Var.b(null);
                        return unit3;
                    }
                    return b50Var;
                }
            }
            if (((dx) this.n).O() instanceof v11) {
            }
        } catch (Throwable th3) {
            qo1 qo1Var2 = qo1Var;
            th = th3;
            oo1Var = qo1Var2;
            oo1Var.b(null);
            throw th;
        }
        lc2Var = new lc2(this, r30Var);
        Object obj2 = lc2Var.o;
        b50 b50Var2 = b50.m;
        i = lc2Var.q;
        if (i != 0) {
        }
    }

    public Bundle G() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        qi3 qi3Var = (qi3) this.p;
        if (((Bundle) this.o) == null) {
            String str = (String) this.m;
            SharedPreferences A = qi3Var.A();
            pj3 pj3Var = (pj3) qi3Var.m;
            String string3 = A.getString(str, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            vh3 vh3Var = pj3Var.r;
                            pj3.m(vh3Var);
                            vh3Var.r.b("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            vr3.a();
                                            if (pj3Var.p.G(null, ug3.Q0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        vr3.a();
                                        if (pj3Var.p.G(null, ug3.Q0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.c(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.o = bundle;
                } catch (JSONException unused2) {
                    vh3 vh3Var3 = pj3Var.r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.o) == null) {
                this.o = (Bundle) this.n;
            }
        }
        Bundle bundle2 = (Bundle) this.o;
        ll3.v(bundle2);
        return new Bundle(bundle2);
    }

    public kc3 H(js0 js0Var, nk3... nk3VarArr) {
        kc3 kc3Var = kc3.e;
        for (nk3 nk3Var : nk3VarArr) {
            kc3Var = nk2.s(nk3Var);
            ak2.w((js0) this.o);
            if ((kc3Var instanceof lc3) || (kc3Var instanceof ic3)) {
                kc3Var = ((tt1) this.m).x(js0Var, kc3Var);
            }
        }
        return kc3Var;
    }

    public kc3 I(kc3 kc3Var) {
        return ((tt1) this.p).x(this, kc3Var);
    }

    public kc3 J(qb3 qb3Var) {
        kc3 kc3Var = kc3.e;
        Iterator m = qb3Var.m();
        while (m.hasNext()) {
            kc3Var = ((tt1) this.p).x(this, qb3Var.o(((Integer) m.next()).intValue()));
            if (kc3Var instanceof vb3) {
                break;
            }
        }
        return kc3Var;
    }

    public void K(Bundle bundle) {
        qi3 qi3Var = (qi3) this.p;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences A = qi3Var.A();
        pj3 pj3Var = (pj3) qi3Var.m;
        SharedPreferences.Editor edit = A.edit();
        int size = bundle2.size();
        String str = (String) this.m;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        vr3.a();
                        if (!pj3Var.p.G(null, ug3.Q0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                vh3 vh3Var = pj3Var.r;
                                pj3.m(vh3Var);
                                vh3Var.r.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            vh3 vh3Var2 = pj3Var.r;
                            pj3.m(vh3Var2);
                            vh3Var2.r.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        vh3 vh3Var3 = pj3Var.r;
                        pj3.m(vh3Var3);
                        vh3Var3.r.c(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.o = bundle2;
    }

    public js0 L() {
        return new js0(this, (tt1) this.p);
    }

    public boolean M(String str) {
        if (((HashMap) this.n).containsKey(str)) {
            return true;
        }
        js0 js0Var = (js0) this.m;
        if (js0Var != null) {
            return js0Var.M(str);
        }
        return false;
    }

    public void N(String str, kc3 kc3Var) {
        js0 js0Var;
        HashMap hashMap = (HashMap) this.n;
        if (!hashMap.containsKey(str) && (js0Var = (js0) this.m) != null && js0Var.M(str)) {
            js0Var.N(str, kc3Var);
        } else {
            if (((HashMap) this.o).containsKey(str)) {
                return;
            }
            if (kc3Var == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, kc3Var);
            }
        }
    }

    public void O(String str, kc3 kc3Var) {
        if (((HashMap) this.o).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.n;
        if (kc3Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, kc3Var);
        }
    }

    public kc3 P(String str) {
        HashMap hashMap = (HashMap) this.n;
        if (hashMap.containsKey(str)) {
            return (kc3) hashMap.get(str);
        }
        js0 js0Var = (js0) this.m;
        if (js0Var != null) {
            return js0Var.P(str);
        }
        throw new IllegalArgumentException(str + " is not defined");
    }

    public void b(fr0 fr0Var) {
        if (((ArrayList) this.m).contains(fr0Var)) {
            b71.v(fr0Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.m)) {
            ((ArrayList) this.m).add(fr0Var);
        }
        fr0Var.mAdded = true;
    }

    public fy c() {
        Map unmodifiableMap;
        kz0 kz0Var = (kz0) this.m;
        if (kz0Var == null) {
            lh.g("url == null");
            return null;
        }
        String str = (String) this.n;
        mx0 c = ((lx0) this.o).c();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.p;
        byte[] bArr = n33.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = mi1.c();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        return new fy(kz0Var, str, c, (zm3) null, unmodifiableMap);
    }

    public void d(gr grVar) {
        grVar.getClass();
        String grVar2 = grVar.toString();
        if (grVar2.length() == 0) {
            ((lx0) this.o).n("Cache-Control");
        } else {
            y("Cache-Control", grVar2);
        }
    }

    @Override // defpackage.c43
    public long e(sd sdVar, sd sdVar2, sd sdVar3) {
        t31 it = d.f(0, sdVar.b()).iterator();
        long j = 0;
        while (it.o) {
            int nextInt = it.nextInt();
            j = Math.max(j, ((td) this.m).get(nextInt).d(sdVar.a(nextInt), sdVar2.a(nextInt), sdVar3.a(nextInt)));
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(long j, long j2, r30 r30Var) {
        ir1 ir1Var;
        int i;
        long j3;
        if (r30Var instanceof ir1) {
            ir1Var = (ir1) r30Var;
            int i2 = ir1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ir1Var.o = i2 - Integer.MIN_VALUE;
                ir1 ir1Var2 = ir1Var;
                Object obj = ir1Var2.m;
                b50 b50Var = b50.m;
                i = ir1Var2.o;
                mr1 mr1Var = null;
                if (i != 0) {
                    ca2.b(obj);
                    mr1 mr1Var2 = (mr1) this.m;
                    j3 = 0;
                    if (((mr1Var2 == null || !mr1Var2.z) ? null : (mr1) nk2.j(mr1Var2)) == null) {
                        mr1 mr1Var3 = (mr1) this.n;
                        if (mr1Var3 != null) {
                            ir1Var2.o = 1;
                            obj = mr1Var3.N(j, j2, ir1Var2);
                        }
                    } else {
                        mr1 mr1Var4 = (mr1) this.m;
                        if (mr1Var4 != null && mr1Var4.z) {
                            mr1Var = (mr1) nk2.j(mr1Var4);
                        }
                        mr1 mr1Var5 = mr1Var;
                        if (mr1Var5 != null) {
                            ir1Var2.o = 2;
                            obj = mr1Var5.N(j, j2, ir1Var2);
                        }
                    }
                } else if (i == 1) {
                    ca2.b(obj);
                    j3 = ((f43) obj).a;
                } else {
                    if (i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                    j3 = ((f43) obj).a;
                }
                return new f43(j3);
            }
        }
        ir1Var = new ir1(this, r30Var);
        ir1 ir1Var22 = ir1Var;
        Object obj2 = ir1Var22.m;
        b50 b50Var2 = b50.m;
        i = ir1Var22.o;
        mr1 mr1Var6 = null;
        if (i != 0) {
        }
        return new f43(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(long j, r30 r30Var) {
        jr1 jr1Var;
        int i;
        long j2;
        if (r30Var instanceof jr1) {
            jr1Var = (jr1) r30Var;
            int i2 = jr1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jr1Var.o = i2 - Integer.MIN_VALUE;
                Object obj = jr1Var.m;
                b50 b50Var = b50.m;
                i = jr1Var.o;
                mr1 mr1Var = null;
                if (i != 0) {
                    ca2.b(obj);
                    mr1 mr1Var2 = (mr1) this.m;
                    if (mr1Var2 != null && mr1Var2.z) {
                        mr1Var = (mr1) nk2.j(mr1Var2);
                    }
                    if (mr1Var == null) {
                        j2 = 0;
                        return new f43(j2);
                    }
                    jr1Var.o = 1;
                    obj = mr1Var.Y(j, jr1Var);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                j2 = ((f43) obj).a;
                return new f43(j2);
            }
        }
        jr1Var = new jr1(this, r30Var);
        Object obj2 = jr1Var.m;
        b50 b50Var2 = b50.m;
        i = jr1Var.o;
        mr1 mr1Var3 = null;
        if (i != 0) {
        }
        j2 = ((f43) obj2).a;
        return new f43(j2);
    }

    @Override // defpackage.w52
    public Object get() {
        return new js0((Executor) ((w52) this.m).get(), (tc2) ((w52) this.n).get(), (mh) ((mh) this.o).get(), (tc2) ((w52) this.p).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(r30 r30Var) {
        o60 o60Var;
        int i;
        h60 h60Var;
        i70 i70Var = (i70) this.p;
        if (r30Var instanceof o60) {
            o60Var = (o60) r30Var;
            int i2 = o60Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o60Var.p = i2 - Integer.MIN_VALUE;
                Object obj = o60Var.n;
                b50 b50Var = b50.m;
                i = o60Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    List list = (List) this.o;
                    if (list == null || list.isEmpty()) {
                        o60Var.m = this;
                        o60Var.p = 1;
                        obj = i70.g(i70Var, false, o60Var);
                    } else {
                        ll2 h = i70Var.h();
                        r60 r60Var = new r60(i70Var, this, null);
                        o60Var.m = this;
                        o60Var.p = 2;
                        obj = h.b(r60Var, o60Var);
                    }
                    return b50Var;
                }
                if (i == 1) {
                    this = o60Var.m;
                    ca2.b(obj);
                    h60Var = (h60) obj;
                } else {
                    if (i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = o60Var.m;
                    ca2.b(obj);
                    h60Var = (h60) obj;
                }
                ((i70) this.p).t.c(h60Var);
                return Unit.a;
            }
        }
        o60Var = new o60(this, r30Var);
        Object obj2 = o60Var.n;
        b50 b50Var2 = b50.m;
        i = o60Var.p;
        if (i != 0) {
        }
        ((i70) this.p).t.c(h60Var);
        return Unit.a;
    }

    public fr0 i(String str) {
        is0 is0Var = (is0) ((HashMap) this.n).get(str);
        if (is0Var != null) {
            return is0Var.c;
        }
        return null;
    }

    public fr0 j(String str) {
        fr0 findFragmentByWho;
        for (is0 is0Var : ((HashMap) this.n).values()) {
            if (is0Var != null && (findFragmentByWho = is0Var.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    @Override // defpackage.c43
    public sd l(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        if (((sd) this.o) == null) {
            this.o = sdVar3.c();
        }
        sd sdVar4 = (sd) this.o;
        if (sdVar4 == null) {
            Intrinsics.f("velocityVector");
            throw null;
        }
        int b = sdVar4.b();
        int i = 0;
        while (true) {
            sd sdVar5 = (sd) this.o;
            if (i >= b) {
                if (sdVar5 != null) {
                    return sdVar5;
                }
                Intrinsics.f("velocityVector");
                throw null;
            }
            if (sdVar5 == null) {
                Intrinsics.f("velocityVector");
                throw null;
            }
            sdVar5.e(i, ((td) this.m).get(i).c(j, sdVar.a(i), sdVar2.a(i), sdVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.c43
    public sd n(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        if (((sd) this.n) == null) {
            this.n = sdVar.c();
        }
        sd sdVar4 = (sd) this.n;
        if (sdVar4 == null) {
            Intrinsics.f("valueVector");
            throw null;
        }
        int b = sdVar4.b();
        int i = 0;
        while (true) {
            sd sdVar5 = (sd) this.n;
            if (i >= b) {
                if (sdVar5 != null) {
                    return sdVar5;
                }
                Intrinsics.f("valueVector");
                throw null;
            }
            if (sdVar5 == null) {
                Intrinsics.f("valueVector");
                throw null;
            }
            sdVar5.e(i, ((td) this.m).get(i).b(j, sdVar.a(i), sdVar2.a(i), sdVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.c43
    public sd o(sd sdVar, sd sdVar2, sd sdVar3) {
        if (((sd) this.p) == null) {
            this.p = sdVar3.c();
        }
        sd sdVar4 = (sd) this.p;
        if (sdVar4 == null) {
            Intrinsics.f("endVelocityVector");
            throw null;
        }
        int b = sdVar4.b();
        int i = 0;
        while (true) {
            sd sdVar5 = (sd) this.p;
            if (i >= b) {
                if (sdVar5 != null) {
                    return sdVar5;
                }
                Intrinsics.f("endVelocityVector");
                throw null;
            }
            if (sdVar5 == null) {
                Intrinsics.f("endVelocityVector");
                throw null;
            }
            sdVar5.e(i, ((td) this.m).get(i).e(sdVar.a(i), sdVar2.a(i), sdVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.hs
    public void onCancel() {
        View view = (View) this.m;
        view.clearAnimation();
        ((ViewGroup) this.n).endViewTransition(view);
        ((a90) this.o).d();
        if (as0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((bo2) this.p) + " has been cancelled.");
        }
    }

    public void p(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.a;
        }
        E();
    }

    public void q(q62 q62Var) {
        q62Var.n.decrementAndGet();
        p((ArrayDeque) this.o, q62Var);
    }

    public tq2 r(i3 i3Var) {
        ArrayList arrayList = (ArrayList) this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tq2 tq2Var = (tq2) arrayList.get(i);
            if (tq2Var != null && tq2Var.b == i3Var) {
                return tq2Var;
            }
        }
        tq2 tq2Var2 = new tq2((Context) this.o, i3Var);
        arrayList.add(tq2Var2);
        return tq2Var2;
    }

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (is0 is0Var : ((HashMap) this.n).values()) {
            if (is0Var != null) {
                arrayList.add(is0Var);
            }
        }
        return arrayList;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (is0 is0Var : ((HashMap) this.n).values()) {
            if (is0Var != null) {
                arrayList.add(is0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.m).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.m)) {
            arrayList = new ArrayList((ArrayList) this.m);
        }
        return arrayList;
    }

    public sd v(sd sdVar, sd sdVar2) {
        js0 js0Var = this;
        if (((sd) js0Var.p) == null) {
            js0Var.p = sdVar.c();
        }
        sd sdVar3 = (sd) js0Var.p;
        if (sdVar3 == null) {
            Intrinsics.f("targetVector");
            throw null;
        }
        int b = sdVar3.b();
        int i = 0;
        while (true) {
            sd sdVar4 = (sd) js0Var.p;
            if (i >= b) {
                if (sdVar4 != null) {
                    return sdVar4;
                }
                Intrinsics.f("targetVector");
                throw null;
            }
            if (sdVar4 == null) {
                Intrinsics.f("targetVector");
                throw null;
            }
            at0 at0Var = (at0) js0Var.m;
            float a = sdVar.a(i);
            float a2 = sdVar2.a(i);
            qm0 qm0Var = (qm0) at0Var.m;
            double b2 = qm0Var.b(a2);
            double d = rm0.a;
            float f = qm0Var.a * qm0Var.b;
            sdVar4.e(i, (Math.signum(a2) * ((float) (Math.exp((d / (d - 1.0d)) * b2) * f))) + a);
            i++;
            js0Var = this;
            b = b;
        }
    }

    public sd w(long j, sd sdVar, sd sdVar2) {
        if (((sd) this.o) == null) {
            this.o = sdVar.c();
        }
        sd sdVar3 = (sd) this.o;
        if (sdVar3 == null) {
            Intrinsics.f("velocityVector");
            throw null;
        }
        int b = sdVar3.b();
        int i = 0;
        while (true) {
            sd sdVar4 = (sd) this.o;
            if (i >= b) {
                if (sdVar4 != null) {
                    return sdVar4;
                }
                Intrinsics.f("velocityVector");
                throw null;
            }
            if (sdVar4 == null) {
                Intrinsics.f("velocityVector");
                throw null;
            }
            at0 at0Var = (at0) this.m;
            sdVar.getClass();
            long j2 = j / 1000000;
            pm0 a = ((qm0) at0Var.m).a(sdVar2.a(i));
            long j3 = a.c;
            sdVar4.e(i, (((Math.signum(a.a) * t9.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f);
            i++;
        }
    }

    public n53 x(gu guVar, String str) {
        n53 n53Var;
        n53 a;
        synchronized (((dq2) this.p)) {
            try {
                t53 t53Var = (t53) this.m;
                t53Var.getClass();
                n53Var = (n53) t53Var.a.get(str);
                if (guVar.d(n53Var)) {
                    Object obj = (q53) this.n;
                    if (obj instanceof s53) {
                        n53Var.getClass();
                        ((s53) obj).d(n53Var);
                    }
                    n53Var.getClass();
                } else {
                    wm1 wm1Var = new wm1((i50) this.o);
                    wm1Var.a.put(ar0.p, str);
                    q53 q53Var = (q53) this.n;
                    try {
                        try {
                            a = q53Var.c(guVar, wm1Var);
                        } catch (AbstractMethodError unused) {
                            a = q53Var.b(yj1.y(guVar), wm1Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        a = q53Var.a(yj1.y(guVar));
                    }
                    n53Var = a;
                    t53 t53Var2 = (t53) this.m;
                    t53Var2.getClass();
                    n53Var.getClass();
                    n53 n53Var2 = (n53) t53Var2.a.put(str, n53Var);
                    if (n53Var2 != null) {
                        n53Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n53Var;
    }

    public void y(String str, String str2) {
        str2.getClass();
        lx0 lx0Var = (lx0) this.o;
        lx0Var.getClass();
        z71.h(str);
        z71.i(str2, str);
        lx0Var.n(str);
        lx0Var.a(str, str2);
    }

    public void z(is0 is0Var) {
        fr0 fr0Var = is0Var.c;
        String str = fr0Var.mWho;
        HashMap hashMap = (HashMap) this.n;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fr0Var.mWho, is0Var);
        if (fr0Var.mRetainInstanceChangedWhileDetached) {
            boolean z = fr0Var.mRetainInstance;
            es0 es0Var = (es0) this.p;
            if (z) {
                es0Var.e(fr0Var);
            } else {
                es0Var.h(fr0Var);
            }
            fr0Var.mRetainInstanceChangedWhileDetached = false;
        }
        if (as0.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fr0Var);
        }
    }

    public /* synthetic */ js0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    public js0(js0 js0Var, tt1 tt1Var) {
        this.n = new HashMap();
        this.o = new HashMap();
        this.m = js0Var;
        this.p = tt1Var;
    }

    public js0(qi3 qi3Var, String str) {
        this.p = qi3Var;
        ll3.s(str);
        this.m = str;
        this.n = new Bundle();
    }

    public js0(int i) {
        int i2 = 22;
        switch (i) {
            case 4:
                this.n = new ArrayDeque();
                this.o = new ArrayDeque();
                this.p = new ArrayDeque();
                break;
            case 6:
                this.o = new u(i2, this);
                break;
            case 8:
                this.p = new LinkedHashMap();
                this.n = "GET";
                this.o = new lx0(0);
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                tt1 tt1Var = new tt1(22);
                this.m = tt1Var;
                js0 js0Var = new js0((js0) null, tt1Var);
                this.o = js0Var;
                this.n = js0Var.L();
                ot2 ot2Var = new ot2(19);
                this.p = ot2Var;
                js0Var.N("require", new xs3(ot2Var));
                ((HashMap) ot2Var.n).put("internal.platform", nf3.m);
                js0Var.N("runtime.counter", new xb3(Double.valueOf(0.0d)));
                break;
            default:
                this.m = new ArrayList();
                this.n = new HashMap();
                this.o = new HashMap();
                break;
        }
    }

    public js0(t53 t53Var, q53 q53Var, i50 i50Var) {
        t53Var.getClass();
        i50Var.getClass();
        this.m = t53Var;
        this.n = q53Var;
        this.o = i50Var;
        this.p = new dq2(1);
    }

    public /* synthetic */ js0(Object obj) {
        this.m = obj;
    }

    public js0(tm0 tm0Var) {
        this(new ot2(7, tm0Var));
    }
}
