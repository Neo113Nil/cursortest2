package b1;

import a0.m;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.r0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import b3.z;
import g0.m2;
import i.e0;
import i.r;
import i.v;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l.u1;
import l3.u;
import l5.x;
import m2.k;
import m2.o;
import p0.j;
import p1.p;
import r1.d0;
import r1.g1;
import r6.w;
import r6.y;
import s0.n;
import s1.h2;
import t5.l;
import t5.q;
import t5.s;
import w.h0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements r5.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1229f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1230g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1231h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1232i;

    public /* synthetic */ b(int i7, boolean z8) {
        this.f1229f = i7;
    }

    public static void G(HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new u5.e("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new u5.e("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void H(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new u5.e("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new u5.e("connection failed: 404 not found");
        }
        if (parseInt != 101) {
            throw new u5.e(m.i("connection failed: unknown status code ", parseInt));
        }
    }

    public void A(m2.b bVar) {
        ((c) this.f1232i).f1233f.f1225a = bVar;
    }

    public void B(k kVar) {
        ((c) this.f1232i).f1233f.f1226b = kVar;
    }

    public void C(long j8) {
        ((c) this.f1232i).f1233f.f1228d = j8;
    }

    public String D(String str, Object... objArr) {
        String str2 = (String) this.f1232i;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (str2 == null) {
            return str;
        }
        return str2 + " - " + str;
    }

    public void E() {
        LinkedHashMap linkedHashMap = ((j) this.f1230g).f7011c;
        String str = (String) this.f1231h;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((r0) this.f1232i);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        linkedHashMap.put(str, list);
    }

    public void F() {
        ArrayList arrayList = (ArrayList) this.f1231h;
        if (arrayList.isEmpty()) {
            g0.d.S("empty stack");
            throw null;
        }
        this.f1232i = arrayList.remove(arrayList.size() - 1);
    }

    public void I(String str) {
        String D = D(str, new Object[0]);
        l.i iVar = (l.i) this.f1230g;
        String str2 = (String) this.f1231h;
        System.currentTimeMillis();
        iVar.e(3, str2, D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    public void a(long j8, List list, boolean z8) {
        long j9;
        boolean z9;
        boolean z10;
        long j10;
        l1.h hVar;
        l1.h hVar2;
        l1.i iVar = (l1.i) this.f1231h;
        r rVar = (r) this.f1232i;
        rVar.f4785e = 0;
        long[] jArr = rVar.f4781a;
        char c4 = 7;
        if (jArr != e0.f4736a) {
            e6.k.d0(jArr);
            long[] jArr2 = rVar.f4781a;
            int i7 = rVar.f4784d;
            int i8 = i7 >> 3;
            long j11 = 255 << ((i7 & 7) << 3);
            j9 = 255;
            jArr2[i8] = (jArr2[i8] & (~j11)) | j11;
        } else {
            j9 = 255;
        }
        e6.k.c0(0, rVar.f4784d, null, rVar.f4783c);
        rVar.f4786f = e0.c(rVar.f4784d) - rVar.f4785e;
        int size = list.size();
        boolean z11 = true;
        l1.i iVar2 = iVar;
        boolean z12 = true;
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = (n) list.get(i9);
            if (z12) {
                i0.d dVar = iVar2.f5811a;
                int i10 = dVar.f4842h;
                if (i10 > 0) {
                    ?? r15 = dVar.f4840f;
                    int i11 = 0;
                    while (true) {
                        hVar2 = r15[i11];
                        if (r6.k.a(((l1.h) hVar2).f5803b, nVar)) {
                            break;
                        }
                        int i12 = i11 + 1;
                        if (i12 >= i10) {
                            break;
                        } else {
                            i11 = i12;
                        }
                    }
                }
                hVar2 = 0;
                hVar = hVar2;
                if (hVar != null) {
                    hVar.f5809h = true;
                    hVar.f5804c.a(j8);
                    Object b9 = rVar.b(j8);
                    Object obj = b9;
                    if (b9 == null) {
                        v vVar = new v();
                        rVar.d(j8, vVar);
                        obj = vVar;
                    }
                    ((v) obj).a(hVar);
                    iVar2 = hVar;
                } else {
                    z12 = false;
                }
            }
            hVar = new l1.h(nVar);
            hVar.f5804c.a(j8);
            Object b10 = rVar.b(j8);
            Object obj2 = b10;
            if (b10 == null) {
                v vVar2 = new v();
                rVar.d(j8, vVar2);
                obj2 = vVar2;
            }
            ((v) obj2).a(hVar);
            iVar2.f5811a.b(hVar);
            iVar2 = hVar;
        }
        if (!z8) {
            return;
        }
        long[] jArr3 = rVar.f4782b;
        Object[] objArr = rVar.f4783c;
        long[] jArr4 = rVar.f4781a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j12 = jArr4[i13];
            if ((((~j12) << c4) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j12 & j9) < 128) {
                        int i16 = (i13 << 3) + i15;
                        boolean z13 = z11;
                        j10 = j12;
                        long j13 = jArr3[i16];
                        v vVar3 = (v) objArr[i16];
                        i0.d dVar2 = iVar.f5811a;
                        int i17 = dVar2.f4842h;
                        if (i17 > 0) {
                            Object[] objArr2 = dVar2.f4840f;
                            int i18 = 0;
                            while (true) {
                                z10 = z13;
                                ((l1.h) objArr2[i18]).i(j13, vVar3);
                                int i19 = i18 + 1;
                                if (i19 >= i17) {
                                    break;
                                }
                                i18 = i19;
                                z13 = z10;
                            }
                        } else {
                            z10 = z13;
                        }
                    } else {
                        z10 = z11;
                        j10 = j12;
                    }
                    j12 = j10 >> 8;
                    i15++;
                    z11 = z10;
                }
                z9 = z11;
                if (i14 != 8) {
                    return;
                }
            } else {
                z9 = z11;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            z11 = z9;
            c4 = 7;
        }
    }

    public void b() {
        ((ArrayList) this.f1231h).clear();
        this.f1232i = this.f1230g;
        ((d0) this.f1230g).N();
    }

    @Override // r5.b
    public q c(l lVar, q qVar, boolean z8) {
        s sVar = (s) this.f1232i;
        if (sVar == null) {
            sVar = ((q5.g) this.f1231h).j();
        }
        androidx.room.c cVar = (androidx.room.c) this.f1230g;
        l5.b x8 = ((l5.b) ((x) cVar.f1070h).f6092a).x((l5.f) cVar.f1069g);
        s<q> z9 = x8.z(l5.f.f6023i);
        q qVar2 = null;
        if (z9 == null) {
            if (sVar != null) {
                z9 = x8.m(sVar);
            }
            return qVar2;
        }
        for (q qVar3 : z9) {
            if ((z8 ? lVar.compare(qVar, qVar3) : lVar.compare(qVar3, qVar)) > 0) {
                if (qVar2 != null) {
                    if ((z8 ? lVar.compare(qVar2, qVar3) : lVar.compare(qVar3, qVar2)) < 0) {
                    }
                }
                qVar2 = qVar3;
            }
        }
        return qVar2;
    }

    public void d(String str, Throwable th, Object... objArr) {
        if (v()) {
            String D = D(str, objArr);
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(D);
                sb.append("\n");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                sb.append(stringWriter.toString());
                D = sb.toString();
            }
            l.i iVar = (l.i) this.f1230g;
            String str2 = (String) this.f1231h;
            System.currentTimeMillis();
            iVar.e(1, str2, D);
        }
    }

    public boolean e(androidx.room.c cVar, boolean z8) {
        boolean z9;
        boolean z10;
        l1.i iVar = (l1.i) this.f1231h;
        boolean a3 = iVar.a((i.l) cVar.f1069g, (p) this.f1230g, cVar, z8);
        i0.d dVar = iVar.f5811a;
        if (a3) {
            int i7 = dVar.f4842h;
            if (i7 > 0) {
                Object[] objArr = dVar.f4840f;
                int i8 = 0;
                z9 = false;
                do {
                    z9 = ((l1.h) objArr[i8]).h(cVar, z8) || z9;
                    i8++;
                } while (i8 < i7);
            } else {
                z9 = false;
            }
            int i9 = dVar.f4842h;
            if (i9 > 0) {
                Object[] objArr2 = dVar.f4840f;
                int i10 = 0;
                z10 = false;
                do {
                    z10 = ((l1.h) objArr2[i10]).g(cVar) || z10;
                    i10++;
                } while (i10 < i9);
            } else {
                z10 = false;
            }
            iVar.c(cVar);
            if (z10 || z9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(long j8, long j9, j6.c cVar) {
        k1.a aVar;
        int i7;
        long j10;
        if (cVar instanceof k1.a) {
            aVar = (k1.a) cVar;
            int i8 = aVar.f5323h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f5323h = i8 - Integer.MIN_VALUE;
                k1.a aVar2 = aVar;
                Object obj = aVar2.f5321f;
                i7 = aVar2.f5323h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    k1.e eVar = (k1.e) this.f1230g;
                    k1.e eVar2 = null;
                    if (eVar != null && eVar.f8116r) {
                        eVar2 = (k1.e) r1.f.k(eVar);
                    }
                    if (eVar2 == null) {
                        j10 = 0;
                        return new o(j10);
                    }
                    aVar2.f5323h = 1;
                    obj = eVar2.B0(j8, j9, aVar2);
                    i6.a aVar3 = i6.a.f4956f;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                j10 = ((o) obj).f6330a;
                return new o(j10);
            }
        }
        aVar = new k1.a(this, cVar);
        k1.a aVar22 = aVar;
        Object obj2 = aVar22.f5321f;
        i7 = aVar22.f5323h;
        if (i7 != 0) {
        }
        j10 = ((o) obj2).f6330a;
        return new o(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(long j8, j6.c cVar) {
        k1.b bVar;
        int i7;
        long j9;
        if (cVar instanceof k1.b) {
            bVar = (k1.b) cVar;
            int i8 = bVar.f5326h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f5326h = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f5324f;
                i7 = bVar.f5326h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    k1.e eVar = (k1.e) this.f1230g;
                    k1.e eVar2 = null;
                    if (eVar != null && eVar.f8116r) {
                        eVar2 = (k1.e) r1.f.k(eVar);
                    }
                    if (eVar2 == null) {
                        j9 = 0;
                        return new o(j9);
                    }
                    bVar.f5326h = 1;
                    obj = eVar2.D0(j8, bVar);
                    i6.a aVar = i6.a.f4956f;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                j9 = ((o) obj).f6330a;
                return new o(j9);
            }
        }
        bVar = new k1.b(this, cVar);
        Object obj2 = bVar.f5324f;
        i7 = bVar.f5326h;
        if (i7 != 0) {
        }
        j9 = ((o) obj2).f6330a;
        return new o(j9);
    }

    public void h(Object obj) {
        ((ArrayList) this.f1231h).add(this.f1232i);
        this.f1232i = obj;
    }

    public void i(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(D(str, new Object[0]));
        sb.append("\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        String sb2 = sb.toString();
        l.i iVar = (l.i) this.f1230g;
        String str2 = (String) this.f1231h;
        System.currentTimeMillis();
        iVar.e(4, str2, sb2);
    }

    public Object j() {
        long id = Thread.currentThread().getId();
        if (id == g0.b.f3688a) {
            return this.f1232i;
        }
        o0.e eVar = (o0.e) ((AtomicReference) this.f1230g).get();
        int a3 = eVar.a(id);
        if (a3 >= 0) {
            return eVar.f6825c[a3];
        }
        return null;
    }

    public z0.r k() {
        return ((c) this.f1232i).f1233f.f1227c;
    }

    public Object l() {
        return this.f1232i;
    }

    public byte[] m() {
        HashMap hashMap = (HashMap) this.f1232i;
        URI uri = (URI) this.f1230g;
        String path = uri.getPath();
        String query = uri.getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(query == null ? "" : "?".concat(query));
        String sb2 = sb.toString();
        String host = uri.getHost();
        if (uri.getPort() != -1) {
            host = host + ":" + uri.getPort();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", (String) this.f1231h);
        for (String str : hashMap.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) hashMap.get(str));
            }
        }
        String j8 = m.j("GET ", sb2, " HTTP/1.1\r\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j8);
        String str2 = new String();
        for (String str3 : linkedHashMap.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(str3);
            sb4.append(": ");
            str2 = m.m(sb4, (String) linkedHashMap.get(str3), "\r\n");
        }
        sb3.append(str2);
        byte[] bytes = (sb3.toString() + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public h0 n() {
        h0 h0Var = (h0) this.f1231h;
        if (h0Var != null) {
            return h0Var;
        }
        r6.k.j("keyboardActions");
        throw null;
    }

    public l5.f o() {
        t5.c cVar = (t5.c) this.f1230g;
        b bVar = (b) this.f1231h;
        if (bVar == null) {
            return cVar != null ? new l5.f(cVar) : l5.f.f6023i;
        }
        o5.j.c(cVar != null);
        return bVar.o().m(cVar);
    }

    public long p() {
        return ((c) this.f1232i).f1233f.f1228d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0 q(String str, r6.d dVar) {
        boolean isInstance;
        w0 a3;
        y0 y0Var = (y0) this.f1231h;
        r6.k.f(str, "key");
        b1 b1Var = (b1) this.f1230g;
        b1Var.getClass();
        LinkedHashMap linkedHashMap = b1Var.f949a;
        w0 w0Var = (w0) linkedHashMap.get(str);
        Class cls = dVar.f7957a;
        r6.k.f(cls, "jClass");
        Map map = r6.d.f7954b;
        r6.k.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = y.e(num.intValue(), w0Var);
        } else {
            if (cls.isPrimitive()) {
                cls = r4.a.G(w.a(cls));
            }
            isInstance = cls.isInstance(w0Var);
        }
        if (isInstance) {
            if (y0Var instanceof a1) {
                r6.k.c(w0Var);
                ((a1) y0Var).d(w0Var);
            }
            r6.k.d(w0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return w0Var;
        }
        q3.b bVar = new q3.b((u1) this.f1232i);
        ((LinkedHashMap) bVar.f5679a).put(s3.d.f8527a, str);
        try {
            try {
                a3 = y0Var.b(dVar, bVar);
            } catch (AbstractMethodError unused) {
                a3 = y0Var.a(r4.a.F(dVar));
            }
        } catch (AbstractMethodError unused2) {
            a3 = y0Var.c(r4.a.F(dVar), bVar);
        }
        r6.k.f(a3, "viewModel");
        w0 w0Var2 = (w0) linkedHashMap.put(str, a3);
        if (w0Var2 != null) {
            w0Var2.b();
        }
        return a3;
    }

    public void r(Throwable th) {
        String str = th instanceof OutOfMemoryError ? "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data" : th instanceof NoClassDefFoundError ? "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk" : th instanceof g5.b ? "" : "Uncaught exception in Firebase Database runloop (21.0.0). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
        ((b) this.f1231h).i(str, th);
        new Handler(((Context) ((androidx.room.c) this.f1232i).f1069g).getMainLooper()).post(new z(str, 3, th));
        ((o5.b) this.f1230g).shutdownNow();
    }

    public boolean s(CharSequence charSequence, int i7, int i8, l3.v vVar) {
        if ((vVar.f5939c & 3) == 0) {
            l3.h hVar = (l3.h) this.f1232i;
            m3.a b9 = vVar.b();
            int a3 = b9.a(8);
            if (a3 != 0) {
                ((ByteBuffer) b9.f3416i).getShort(a3 + b9.f3413f);
            }
            l3.d dVar = (l3.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = l3.d.f5894b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.f5895a;
            String sb2 = sb.toString();
            int i9 = v2.e.f9106a;
            boolean a9 = v2.d.a(textPaint, sb2);
            int i10 = vVar.f5939c & 4;
            vVar.f5939c = a9 ? i10 | 2 : i10 | 1;
        }
        return (vVar.f5939c & 3) == 2;
    }

    public boolean t() {
        if (((m2) this.f1230g).getValue() != this.f1232i) {
            return true;
        }
        b bVar = (b) this.f1231h;
        return bVar != null && bVar.t();
    }

    public String toString() {
        switch (this.f1229f) {
            case q.c.f7263g /* 15 */:
                t5.c cVar = (t5.c) this.f1230g;
                return "" + (cVar == null ? "<anon>" : cVar.f8889f) + "\n" + ((o5.i) this.f1232i).a("\t");
            case 23:
                String str = (String) this.f1232i;
                String str2 = (String) this.f1231h;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f1230g;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                r6.k.e(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public void u(Object obj) {
        b.m mVar = (b.m) this.f1230g;
        LinkedHashMap linkedHashMap = mVar.f1184b;
        ArrayList arrayList = mVar.f1186d;
        String str = (String) this.f1231h;
        Object obj2 = linkedHashMap.get(str);
        a.a aVar = (a.a) this.f1232i;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            mVar.b(intValue, aVar, obj);
        } catch (Exception e9) {
            arrayList.remove(str);
            throw e9;
        }
    }

    public boolean v() {
        return l.h.d(((l.i) this.f1230g).f5525b) <= 0;
    }

    public void w() {
        g1 g1Var = ((d0) this.f1230g).f7727n;
        if (g1Var != null) {
            ((s1.r) g1Var).u();
        }
    }

    public Object x(CharSequence charSequence, int i7, int i8, int i9, boolean z8, l3.q qVar) {
        int i10;
        char c4;
        e2.b bVar = new e2.b((u) ((g3.k) this.f1231h).f4162i);
        int codePointAt = Character.codePointAt(charSequence, i7);
        int i11 = 0;
        boolean z9 = true;
        int i12 = i7;
        loop0: while (true) {
            i10 = i12;
            while (i12 < i8 && i11 < i9 && z9) {
                SparseArray sparseArray = ((u) bVar.f2741f).f5934a;
                u uVar = sparseArray == null ? null : (u) sparseArray.get(codePointAt);
                if (bVar.f2737b == 2) {
                    if (uVar != null) {
                        bVar.f2741f = uVar;
                        bVar.f2739d++;
                    } else {
                        if (codePointAt == 65038) {
                            bVar.c();
                        } else if (codePointAt != 65039) {
                            u uVar2 = (u) bVar.f2741f;
                            if (uVar2.f5935b != null) {
                                if (bVar.f2739d != 1) {
                                    bVar.f2742g = uVar2;
                                    bVar.c();
                                } else if (bVar.d()) {
                                    bVar.f2742g = (u) bVar.f2741f;
                                    bVar.c();
                                } else {
                                    bVar.c();
                                }
                                c4 = 3;
                            } else {
                                bVar.c();
                            }
                        }
                        c4 = 1;
                    }
                    c4 = 2;
                } else if (uVar == null) {
                    bVar.c();
                    c4 = 1;
                } else {
                    bVar.f2737b = 2;
                    bVar.f2741f = uVar;
                    bVar.f2739d = 1;
                    c4 = 2;
                }
                bVar.f2738c = codePointAt;
                if (c4 == 1) {
                    i12 = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (i12 < i8) {
                        codePointAt = Character.codePointAt(charSequence, i12);
                    }
                } else if (c4 == 2) {
                    int charCount = Character.charCount(codePointAt) + i12;
                    if (charCount < i8) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i12 = charCount;
                } else if (c4 == 3) {
                    if (z8 || !s(charSequence, i10, i12, ((u) bVar.f2742g).f5935b)) {
                        z9 = qVar.f(charSequence, i10, i12, ((u) bVar.f2742g).f5935b);
                        i11++;
                    }
                }
            }
        }
        if (bVar.f2737b == 2 && ((u) bVar.f2741f).f5935b != null && ((bVar.f2739d > 1 || bVar.d()) && i11 < i9 && z9 && (z8 || !s(charSequence, i10, i12, ((u) bVar.f2741f).f5935b)))) {
            qVar.f(charSequence, i10, i12, ((u) bVar.f2741f).f5935b);
        }
        return qVar.a();
    }

    public void y(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == g0.b.f3688a) {
            this.f1232i = obj;
            return;
        }
        synchronized (this.f1231h) {
            o0.e eVar = (o0.e) ((AtomicReference) this.f1230g).get();
            int a3 = eVar.a(id);
            if (a3 < 0) {
                ((AtomicReference) this.f1230g).set(eVar.b(id, obj));
            } else {
                eVar.f6825c[a3] = obj;
            }
        }
    }

    public void z(z0.r rVar) {
        ((c) this.f1232i).f1233f.f1227c = rVar;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i7) {
        this.f1229f = i7;
        this.f1230g = obj;
        this.f1231h = obj2;
        this.f1232i = obj3;
    }

    public b(Set set, String str, String str2) {
        this.f1229f = 13;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        Map map = Collections.EMPTY_MAP;
        this.f1231h = str2;
        this.f1232i = x4.a.f9684a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f1230g = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public b(b1 b1Var, y0 y0Var, u1 u1Var) {
        this.f1229f = 17;
        r6.k.f(b1Var, "store");
        r6.k.f(u1Var, "extras");
        this.f1230g = b1Var;
        this.f1231h = y0Var;
        this.f1232i = u1Var;
    }

    public b(h2 h2Var) {
        this.f1229f = 25;
        this.f1230g = h2Var;
    }

    public b(p pVar) {
        this.f1229f = 10;
        this.f1230g = pVar;
        this.f1231h = new l1.i(0);
        r rVar = new r();
        rVar.f4781a = e0.f4736a;
        rVar.f4782b = i.k.f4754a;
        rVar.f4783c = j.a.f4968c;
        rVar.c(e0.f(10));
        this.f1232i = rVar;
    }

    public b(int i7) {
        this.f1229f = i7;
        switch (i7) {
            case 5:
                this.f1232i = new m4.f();
                break;
            case 6:
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                this.f1230g = new AtomicReference(o0.f.f6826a);
                this.f1231h = new Object();
                break;
            case 8:
                this.f1230g = new WeakHashMap();
                this.f1231h = new WeakHashMap();
                this.f1232i = new WeakHashMap();
                break;
            case q.c.f7259c /* 9 */:
                this.f1231h = new r0(13, this);
                break;
        }
    }

    public b(Intent intent) {
        this.f1229f = 23;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f1230g = data;
        this.f1231h = action;
        this.f1232i = type;
    }

    public b(View view) {
        this.f1229f = 4;
        this.f1230g = view;
        this.f1231h = d6.a.c(d6.h.f2616g, new r0(9, this));
        this.f1232i = new b6.c(view);
    }

    public b(androidx.room.c cVar, b bVar) {
        this.f1229f = 6;
        this.f1232i = cVar;
        this.f1231h = bVar;
        o5.b bVar2 = new o5.b(this, new g.c(this));
        this.f1230g = bVar2;
        bVar2.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public b(c cVar) {
        this.f1229f = 0;
        this.f1232i = cVar;
        this.f1230g = new b6.c(5, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(q6.c cVar, q6.c cVar2, o0.a aVar) {
        this.f1229f = 19;
        this.f1230g = cVar;
        this.f1231h = (r6.l) cVar2;
        this.f1232i = aVar;
    }

    public b(g3.k kVar, m4.f fVar, l3.d dVar, Set set) {
        this.f1229f = 11;
        this.f1230g = fVar;
        this.f1231h = kVar;
        this.f1232i = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            x(str, 0, str.length(), 1, true, new h7.s(str, 1));
        }
    }

    public b(f2.s sVar, b bVar) {
        this.f1229f = 7;
        this.f1230g = sVar;
        this.f1231h = bVar;
        this.f1232i = sVar.f3290f;
    }

    public b(d0 d0Var) {
        this.f1229f = 20;
        this.f1230g = d0Var;
        this.f1231h = new ArrayList();
        this.f1232i = d0Var;
    }

    public b(Application application) {
        this.f1229f = 2;
        p7.b bVar = p7.c.f7214d;
        r6.k.f(bVar, "from");
        p7.i iVar = bVar.f7215a;
        boolean z8 = iVar.f7225c;
        String str = iVar.f7226d;
        String str2 = iVar.f7227e;
        p7.a aVar = iVar.f7229g;
        boolean z9 = iVar.f7228f;
        j4.i iVar2 = bVar.f7216b;
        if (r6.k.a(str, "    ")) {
            p7.i iVar3 = new p7.i(true, true, z8, str, str2, z9, aVar);
            r6.k.f(iVar2, "module");
            p7.o oVar = new p7.o(iVar3, iVar2);
            this.f1230g = application;
            this.f1231h = oVar;
            s7.o oVar2 = new s7.o();
            r6.k.f(TimeUnit.SECONDS, "unit");
            oVar2.f8638r = t7.b.b(10L);
            oVar2.f8639s = t7.b.b(15L);
            this.f1232i = new s7.p(oVar2);
            return;
        }
        throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
    }
}
