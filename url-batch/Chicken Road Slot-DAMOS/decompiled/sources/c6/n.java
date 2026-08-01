package c6;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.lifecycle.o0;
import androidx.lifecycle.r0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.work.impl.WorkDatabase_Impl;
import c4.u;
import c4.x;
import c7.c0;
import com.google.android.gms.internal.measurement.i4;
import ge.a0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.e0;
import s7.f1;
import s7.q1;
import s7.v0;
import te.a1;
import x3.p0;
import x3.s0;
import x3.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements m6.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1833d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1834e;

    /* renamed from: i, reason: collision with root package name */
    public Object f1835i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f1836r;

    public n(Typeface typeface, d4.b bVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        this.f1836r = typeface;
        this.f1833d = bVar;
        this.f1835i = new u(1024);
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i13 = a9 + bVar.f3616d;
            i3 = ((ByteBuffer) bVar.f3619r).getInt(((ByteBuffer) bVar.f3619r).getInt(i13) + i13);
        } else {
            i3 = 0;
        }
        this.f1834e = new char[i3 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i14 = a10 + bVar.f3616d;
            i10 = ((ByteBuffer) bVar.f3619r).getInt(((ByteBuffer) bVar.f3619r).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            x xVar = new x(this, i15);
            d4.a b10 = xVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.f3619r).getInt(a11 + b10.f3616d) : 0, (char[]) this.f1834e, i15 * 2);
            d4.a b11 = xVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i16 = a12 + b11.f3616d;
                i11 = ((ByteBuffer) b11.f3619r).getInt(((ByteBuffer) b11.f3619r).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (!(i11 > 0)) {
                a1.e("invalid metadata codepoint length");
                throw null;
            }
            u uVar = (u) this.f1835i;
            d4.a b12 = xVar.b();
            int a13 = b12.a(16);
            if (a13 != 0) {
                int i17 = a13 + b12.f3616d;
                i12 = ((ByteBuffer) b12.f3619r).getInt(((ByteBuffer) b12.f3619r).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            uVar.a(xVar, 0, i12 - 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(nd.c cVar) {
        x3.h hVar;
        int i3;
        x3.c cVar2;
        z zVar = (z) this.f1836r;
        if (cVar instanceof x3.h) {
            hVar = (x3.h) cVar;
            int i10 = hVar.f10371i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f10371i = i10 - Integer.MIN_VALUE;
                Object obj = hVar.f10369d;
                md.a aVar = md.a.f6622d;
                i3 = hVar.f10371i;
                if (i3 != 0) {
                    cf.c.M(obj);
                    List list = (List) this.f1835i;
                    if (list == null || list.isEmpty()) {
                        hVar.f10371i = 1;
                        obj = z.g(zVar, false, hVar);
                    } else {
                        s0 i11 = zVar.i();
                        x3.k kVar = new x3.k(zVar, this, null);
                        hVar.f10371i = 2;
                        obj = i11.b(kVar, hVar);
                    }
                    return aVar;
                }
                if (i3 == 1) {
                    cf.c.M(obj);
                    cVar2 = (x3.c) obj;
                } else {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                    cVar2 = (x3.c) obj;
                }
                zVar.f10502v.b(cVar2);
                return Unit.f5554a;
            }
        }
        hVar = new x3.h(this, cVar);
        Object obj2 = hVar.f10369d;
        md.a aVar2 = md.a.f6622d;
        i3 = hVar.f10371i;
        if (i3 != 0) {
        }
        zVar.f10502v.b(cVar2);
        return Unit.f5554a;
    }

    public u0 b(wd.h hVar, String str) {
        u0 u0Var;
        u0 a9;
        synchronized (((m4.c) this.f1836r)) {
            try {
                z0 z0Var = (z0) this.f1833d;
                z0Var.getClass();
                u0Var = (u0) z0Var.f750a.get(str);
                if (hVar.d(u0Var)) {
                    w0 w0Var = (w0) this.f1834e;
                    if (w0Var instanceof r0) {
                        r0 r0Var = (r0) w0Var;
                        u0Var.getClass();
                        w wVar = r0Var.f722d;
                        if (wVar != null) {
                            l lVar = r0Var.f723e;
                            lVar.getClass();
                            o0.a(u0Var, lVar, wVar);
                        }
                    }
                    u0Var.getClass();
                } else {
                    k4.e eVar = new k4.e((k4.b) this.f1835i);
                    eVar.f5386a.put(y0.f747b, str);
                    w0 w0Var2 = (w0) this.f1834e;
                    w0Var2.getClass();
                    try {
                        try {
                            a9 = w0Var2.b(hVar, eVar);
                        } catch (AbstractMethodError unused) {
                            Class a10 = hVar.a();
                            a10.getClass();
                            a9 = w0Var2.c(a10, eVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class a11 = hVar.a();
                        a11.getClass();
                        a9 = w0Var2.a(a11);
                    }
                    u0Var = a9;
                    z0 z0Var2 = (z0) this.f1833d;
                    z0Var2.getClass();
                    u0Var.getClass();
                    u0 u0Var2 = (u0) z0Var2.f750a.put(str, u0Var);
                    if (u0Var2 != null) {
                        u0Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0059, code lost:
    
        if (r8.a(r1) == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:25:0x005c, B:27:0x0062, B:30:0x006c), top: B:24:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:25:0x005c, B:27:0x0062, B:30:0x006c), top: B:24:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r3v3, types: [oe.a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [c6.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(nd.c cVar) {
        p0 p0Var;
        int i3;
        oe.c cVar2;
        oe.a aVar;
        Throwable th;
        ge.n nVar = (ge.n) this.f1834e;
        try {
            if (cVar instanceof p0) {
                p0Var = (p0) cVar;
                int i10 = p0Var.f10427r;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    p0Var.f10427r = i10 - Integer.MIN_VALUE;
                    Object obj = p0Var.f10425e;
                    md.a aVar2 = md.a.f6622d;
                    i3 = p0Var.f10427r;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        if (nVar.Q()) {
                            return Unit.f5554a;
                        }
                        cVar2 = (oe.c) this.f1833d;
                        p0Var.f10424d = cVar2;
                        p0Var.f10427r = 1;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar = p0Var.f10424d;
                            try {
                                cf.c.M(obj);
                                Unit unit = Unit.f5554a;
                                nVar.S(unit);
                                aVar.d(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar.d(null);
                                throw th;
                            }
                        }
                        ?? r32 = p0Var.f10424d;
                        cf.c.M(obj);
                        cVar2 = r32;
                    }
                    if (!nVar.Q()) {
                        Unit unit2 = Unit.f5554a;
                        cVar2.d(null);
                        return unit2;
                    }
                    p0Var.f10424d = cVar2;
                    p0Var.f10427r = 2;
                    if (a(p0Var) != aVar2) {
                        aVar = cVar2;
                        Unit unit3 = Unit.f5554a;
                        nVar.S(unit3);
                        aVar.d(null);
                        return unit3;
                    }
                    return aVar2;
                }
            }
            if (!nVar.Q()) {
            }
        } catch (Throwable th3) {
            aVar = cVar2;
            th = th3;
            aVar.d(null);
            throw th;
        }
        p0Var = new p0(this, cVar);
        Object obj2 = p0Var.f10425e;
        md.a aVar22 = md.a.f6622d;
        i3 = p0Var.f10427r;
        if (i3 != 0) {
        }
    }

    public Bundle d() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        f1 f1Var = (f1) this.f1836r;
        if (((Bundle) this.f1835i) == null) {
            String str = (String) this.f1833d;
            SharedPreferences w6 = f1Var.w();
            q1 q1Var = (q1) f1Var.f1478d;
            String string3 = w6.getString(str, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i3);
                            string = jSONObject.getString(yb.a.PUSH_MINIFIED_BUTTON_TEXT);
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            v0 v0Var = q1Var.f8937t;
                            q1.l(v0Var);
                            v0Var.f9050t.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            i4.a();
                                            if (q1Var.f8935r.D(null, e0.P0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i10 = 0; i10 < length; i10++) {
                                                    jArr[i10] = jSONArray2.optLong(i10);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        i4.a();
                                        if (q1Var.f8935r.D(null, e0.P0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i11 = 0; i11 < length2; i11++) {
                                                iArr[i11] = jSONArray3.optInt(i11);
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
                        v0 v0Var2 = q1Var.f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.f1835i = bundle;
                } catch (JSONException unused2) {
                    v0 v0Var3 = q1Var.f8937t;
                    q1.l(v0Var3);
                    v0Var3.f9050t.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f1835i) == null) {
                this.f1835i = (Bundle) this.f1834e;
            }
        }
        Bundle bundle2 = (Bundle) this.f1835i;
        c0.g(bundle2);
        return new Bundle(bundle2);
    }

    public void e(Bundle bundle) {
        f1 f1Var = (f1) this.f1836r;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences w6 = f1Var.w();
        q1 q1Var = (q1) f1Var.f1478d;
        SharedPreferences.Editor edit = w6.edit();
        int size = bundle2.size();
        String str = (String) this.f1833d;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(yb.a.PUSH_MINIFIED_BUTTON_TEXT, str2);
                        i4.a();
                        if (!q1Var.f8935r.D(null, e0.P0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                v0 v0Var = q1Var.f8937t;
                                q1.l(v0Var);
                                v0Var.f9050t.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
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
                            v0 v0Var2 = q1Var.f8937t;
                            q1.l(v0Var2);
                            v0Var2.f9050t.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        v0 v0Var3 = q1Var.f8937t;
                        q1.l(v0Var3);
                        v0Var3.f9050t.b(e2, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f1835i = bundle2;
    }

    @Override // gd.a
    public Object get() {
        return new i((Executor) ((gd.a) this.f1833d).get(), (r6.g) ((gd.a) this.f1834e).get(), (p.e) ((p.e) this.f1835i).get(), (r6.g) ((gd.a) this.f1836r).get());
    }

    public n(gd.a aVar, gd.a aVar2, p.e eVar, gd.a aVar3) {
        this.f1833d = aVar;
        this.f1834e = aVar2;
        this.f1835i = eVar;
        this.f1836r = aVar3;
    }

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f1833d = workDatabase_Impl;
        this.f1834e = new b(workDatabase_Impl, 4);
        this.f1835i = new h(workDatabase_Impl, 2);
        this.f1836r = new h(workDatabase_Impl, 3);
    }

    public n(z0 z0Var, w0 w0Var, k4.b bVar) {
        z0Var.getClass();
        w0Var.getClass();
        bVar.getClass();
        this.f1833d = z0Var;
        this.f1834e = w0Var;
        this.f1835i = bVar;
        this.f1836r = new m4.c();
    }

    public n(f1 f1Var, String str) {
        this.f1836r = f1Var;
        c0.d(str);
        this.f1833d = str;
        this.f1834e = new Bundle();
    }

    public n(z zVar, List list) {
        list.getClass();
        this.f1836r = zVar;
        this.f1833d = new oe.c();
        this.f1834e = a0.a();
        this.f1835i = CollectionsKt.Q(list);
    }
}
