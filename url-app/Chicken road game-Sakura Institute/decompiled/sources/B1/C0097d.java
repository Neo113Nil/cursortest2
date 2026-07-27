package B1;

import A.AbstractC0017m;
import A1.v0;
import G.AbstractC0188b;
import G.C0192d;
import M2.C0256h;
import a.AbstractC0345a;
import a1.C0394i;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import b0.C0494b;
import b2.C0518b;
import c0.C0531b;
import g.ThreadFactoryC0634b;
import g2.C0639b;
import i.AbstractC0664E;
import j.AbstractC0705a;
import j2.AbstractC0720j;
import j2.C0712b;
import j2.C0719i;
import j3.AbstractC0724c;
import j3.C0723b;
import j3.EnumC0722a;
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
import k0.C0750a;
import k0.C0751b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l.AbstractC0784j;
import l.t0;
import l0.C0809g;
import l0.C0810h;
import l1.C0820a;
import m2.InterfaceC0860b;
import o2.C0924c;
import p0.InterfaceC0980p;
import p1.C0993c;
import r0.AbstractC1065f;
import s0.C1166s;
import s0.L0;
import w.N;
import w2.C1294c;
import y2.AbstractC1343r;
import y2.C1336k;
import y2.C1338m;
import y2.EnumC1337l;
import z2.C1436t;

/* renamed from: B1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097d implements InterfaceC0860b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f986d;

    /* renamed from: e, reason: collision with root package name */
    public Object f987e;

    /* renamed from: i, reason: collision with root package name */
    public Object f988i;

    /* renamed from: j, reason: collision with root package name */
    public Object f989j;

    public /* synthetic */ C0097d(int i2, boolean z4) {
        this.f986d = i2;
    }

    public static void K(HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new p2.f("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new p2.f("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void L(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new p2.f("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new p2.f("connection failed: 404 not found");
        }
        if (parseInt != 101) {
            throw new p2.f(AbstractC0017m.g(parseInt, "connection failed: unknown status code "));
        }
    }

    public Object A(CharSequence charSequence, int i2, int i4, int i5, boolean z4, k1.l lVar) {
        int i6;
        char c4;
        E0.b bVar = new E0.b((k1.p) ((Y0.b) this.f988i).f4392k);
        int codePointAt = Character.codePointAt(charSequence, i2);
        boolean z5 = true;
        int i7 = 0;
        int i8 = i2;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z5) {
                SparseArray sparseArray = ((k1.p) bVar.f2269f).f7406a;
                k1.p pVar = sparseArray == null ? null : (k1.p) sparseArray.get(codePointAt);
                if (bVar.f2265b == 2) {
                    if (pVar != null) {
                        bVar.f2269f = pVar;
                        bVar.f2267d++;
                    } else {
                        if (codePointAt == 65038) {
                            bVar.d();
                        } else if (codePointAt != 65039) {
                            k1.p pVar2 = (k1.p) bVar.f2269f;
                            if (pVar2.f7407b != null) {
                                if (bVar.f2267d != 1) {
                                    bVar.f2270g = pVar2;
                                    bVar.d();
                                } else if (bVar.e()) {
                                    bVar.f2270g = (k1.p) bVar.f2269f;
                                    bVar.d();
                                } else {
                                    bVar.d();
                                }
                                c4 = 3;
                            } else {
                                bVar.d();
                            }
                        }
                        c4 = 1;
                    }
                    c4 = 2;
                } else if (pVar == null) {
                    bVar.d();
                    c4 = 1;
                } else {
                    bVar.f2265b = 2;
                    bVar.f2269f = pVar;
                    bVar.f2267d = 1;
                    c4 = 2;
                }
                bVar.f2266c = codePointAt;
                if (c4 == 1) {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (c4 == 2) {
                    int charCount = Character.charCount(codePointAt) + i8;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i8 = charCount;
                } else if (c4 == 3) {
                    if (z4 || !v(charSequence, i6, i8, ((k1.p) bVar.f2270g).f7407b)) {
                        z5 = lVar.d(charSequence, i6, i8, ((k1.p) bVar.f2270g).f7407b);
                        i7++;
                    }
                }
            }
        }
        if (bVar.f2265b == 2 && ((k1.p) bVar.f2269f).f7407b != null && ((bVar.f2267d > 1 || bVar.e()) && i7 < i5 && z5 && (z4 || !v(charSequence, i6, i8, ((k1.p) bVar.f2269f).f7407b)))) {
            lVar.d(charSequence, i6, i8, ((k1.p) bVar.f2269f).f7407b);
        }
        return lVar.a();
    }

    public void B(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0188b.f2788a) {
            this.f989j = obj;
            return;
        }
        synchronized (this.f988i) {
            O.e eVar = (O.e) ((AtomicReference) this.f987e).get();
            int a4 = eVar.a(id);
            if (a4 >= 0) {
                eVar.f3629c[a4] = obj;
            } else {
                ((AtomicReference) this.f987e).set(eVar.b(id, obj));
                Unit unit = Unit.f7487a;
            }
        }
    }

    public void C(Z.r rVar) {
        ((C0494b) this.f989j).f5602d.f5600c = rVar;
    }

    public void D(M0.b bVar) {
        ((C0494b) this.f989j).f5602d.f5598a = bVar;
    }

    public void E(C0531b c0531b) {
        this.f988i = c0531b;
    }

    public void F(M0.k kVar) {
        ((C0494b) this.f989j).f5602d.f5599b = kVar;
    }

    public void G(long j4) {
        ((C0494b) this.f989j).f5602d.f5601d = j4;
    }

    public String H(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String str2 = (String) this.f989j;
        if (str2 == null) {
            return str;
        }
        return str2 + " - " + str;
    }

    public void I() {
        P.l lVar = (P.l) this.f987e;
        LinkedHashMap linkedHashMap = lVar.f3673c;
        String str = (String) this.f988i;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((A3.e) this.f989j);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.f3673c.put(str, list);
    }

    public void J() {
        ArrayList arrayList = (ArrayList) this.f988i;
        if (arrayList.isEmpty()) {
            C0192d.T("empty stack");
            throw null;
        }
        this.f989j = arrayList.remove(arrayList.size() - 1);
    }

    public void M(String str) {
        String H3 = H(str, new Object[0]);
        System.currentTimeMillis();
        ((G1.y) this.f987e).d(3, (String) this.f988i, H3);
    }

    @Override // m2.InterfaceC0860b
    public o2.q a(o2.l lVar, o2.q qVar, boolean z4) {
        o2.s sVar = (o2.s) this.f989j;
        if (sVar == null) {
            sVar = ((l2.g) this.f988i).h();
        }
        y.t tVar = (y.t) this.f987e;
        C0639b w4 = ((C0639b) ((g2.x) tVar.f11495i).f6771a).w((g2.e) tVar.f11494e);
        o2.s<o2.q> C3 = w4.C(g2.e.f6694j);
        o2.q qVar2 = null;
        if (C3 == null) {
            if (sVar != null) {
                C3 = w4.j(sVar);
            }
            return qVar2;
        }
        for (o2.q qVar3 : C3) {
            if ((z4 ? lVar.compare(qVar, qVar3) : lVar.compare(qVar3, qVar)) > 0) {
                if (qVar2 != null) {
                    if ((z4 ? lVar.compare(qVar2, qVar3) : lVar.compare(qVar3, qVar2)) < 0) {
                    }
                }
                qVar2 = qVar3;
            }
        }
        return qVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    public void b(long j4, List list, boolean z4) {
        long[] jArr;
        boolean z5;
        long[] jArr2;
        boolean z6;
        int i2;
        C0809g c0809g;
        C0809g c0809g2;
        C0810h c0810h = (C0810h) this.f988i;
        i.s sVar = (i.s) this.f989j;
        int i4 = 0;
        sVar.f6955e = 0;
        long[] jArr3 = sVar.f6951a;
        char c4 = 7;
        if (jArr3 != AbstractC0664E.f6891a) {
            C1436t.m(jArr3);
            long[] jArr4 = sVar.f6951a;
            int i5 = sVar.f6954d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr4[i6] = (jArr4[i6] & (~j5)) | j5;
        }
        C1436t.k(sVar.f6953c, 0, sVar.f6954d);
        sVar.f6956f = AbstractC0664E.c(sVar.f6954d) - sVar.f6955e;
        int size = list.size();
        boolean z7 = true;
        C0810h c0810h2 = c0810h;
        int i7 = 0;
        boolean z8 = true;
        while (i7 < size) {
            S.n nVar = (S.n) list.get(i7);
            if (z8) {
                I.d dVar = c0810h2.f7906a;
                int i8 = dVar.f3332i;
                if (i8 > 0) {
                    ?? r14 = dVar.f3330d;
                    int i9 = i4;
                    while (true) {
                        c0809g2 = r14[i9];
                        if (Intrinsics.a(((C0809g) c0809g2).f7898b, nVar)) {
                            break;
                        }
                        int i10 = i9 + 1;
                        if (i10 >= i8) {
                            break;
                        } else {
                            i9 = i10;
                        }
                    }
                }
                c0809g2 = 0;
                c0809g = c0809g2;
                if (c0809g != null) {
                    c0809g.f7904h = true;
                    c0809g.f7899c.a(j4);
                    Object b4 = sVar.b(j4);
                    Object obj = b4;
                    if (b4 == null) {
                        i.w wVar = new i.w();
                        sVar.d(j4, wVar);
                        obj = wVar;
                    }
                    ((i.w) obj).a(c0809g);
                    c0810h2 = c0809g;
                    i7++;
                    i4 = 0;
                } else {
                    z8 = false;
                }
            }
            c0809g = new C0809g(nVar);
            c0809g.f7899c.a(j4);
            Object b5 = sVar.b(j4);
            Object obj2 = b5;
            if (b5 == null) {
                i.w wVar2 = new i.w();
                sVar.d(j4, wVar2);
                obj2 = wVar2;
            }
            ((i.w) obj2).a(c0809g);
            c0810h2.f7906a.b(c0809g);
            c0810h2 = c0809g;
            i7++;
            i4 = 0;
        }
        if (!z4) {
            return;
        }
        long[] jArr5 = sVar.f6952b;
        Object[] objArr = sVar.f6953c;
        long[] jArr6 = sVar.f6951a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j6 = jArr6[i11];
            if ((((~j6) << c4) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j6 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        long j7 = jArr5[i15];
                        i.w wVar3 = (i.w) objArr[i15];
                        I.d dVar2 = c0810h.f7906a;
                        int i16 = dVar2.f3332i;
                        if (i16 > 0) {
                            Object[] objArr2 = dVar2.f3330d;
                            int i17 = 0;
                            while (true) {
                                ((C0809g) objArr2[i17]).i(j7, wVar3);
                                jArr2 = jArr5;
                                z6 = true;
                                int i18 = i17 + 1;
                                if (i18 >= i16) {
                                    break;
                                }
                                i17 = i18;
                                jArr5 = jArr2;
                            }
                        } else {
                            jArr2 = jArr5;
                            z6 = true;
                        }
                        i2 = 8;
                    } else {
                        jArr2 = jArr5;
                        z6 = z7;
                        i2 = i12;
                    }
                    j6 >>= i2;
                    i14++;
                    z7 = z6;
                    i12 = i2;
                    jArr5 = jArr2;
                }
                jArr = jArr5;
                z5 = z7;
                if (i13 != i12) {
                    return;
                }
            } else {
                jArr = jArr5;
                z5 = z7;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            z7 = z5;
            jArr5 = jArr;
            c4 = 7;
        }
    }

    public void c() {
        ((ArrayList) this.f988i).clear();
        this.f989j = (r0.E) this.f987e;
        ((r0.E) this.f987e).M();
    }

    public void d(String str, Throwable th, Object... objArr) {
        if (y()) {
            String H3 = H(str, objArr);
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(H3);
                sb.append("\n");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                sb.append(stringWriter.toString());
                H3 = sb.toString();
            }
            System.currentTimeMillis();
            ((G1.y) this.f987e).d(1, (String) this.f988i, H3);
        }
    }

    public boolean e(y.t tVar, boolean z4) {
        boolean z5;
        boolean z6;
        C0810h c0810h = (C0810h) this.f988i;
        if (!c0810h.a((i.m) tVar.f11494e, (InterfaceC0980p) this.f987e, tVar, z4)) {
            return false;
        }
        I.d dVar = c0810h.f7906a;
        int i2 = dVar.f3332i;
        if (i2 > 0) {
            Object[] objArr = dVar.f3330d;
            int i4 = 0;
            z5 = false;
            do {
                z5 = ((C0809g) objArr[i4]).h(tVar, z4) || z5;
                i4++;
            } while (i4 < i2);
        } else {
            z5 = false;
        }
        int i5 = dVar.f3332i;
        if (i5 > 0) {
            Object[] objArr2 = dVar.f3330d;
            int i6 = 0;
            z6 = false;
            do {
                z6 = ((C0809g) objArr2[i6]).g(tVar) || z6;
                i6++;
            } while (i6 < i5);
        } else {
            z6 = false;
        }
        c0810h.c(tVar);
        return z6 || z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(long j4, long j5, E2.c cVar) {
        C0750a c0750a;
        int i2;
        long j6;
        if (cVar instanceof C0750a) {
            c0750a = (C0750a) cVar;
            int i4 = c0750a.f7354l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0750a.f7354l = i4 - Integer.MIN_VALUE;
                C0750a c0750a2 = c0750a;
                Object obj = c0750a2.f7352j;
                D2.a aVar = D2.a.f2163d;
                i2 = c0750a2.f7354l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    k0.e eVar = (k0.e) this.f987e;
                    k0.e eVar2 = null;
                    if (eVar != null && eVar.f3990s) {
                        eVar2 = (k0.e) AbstractC1065f.k(eVar);
                    }
                    if (eVar2 == null) {
                        j6 = 0;
                        return new M0.o(j6);
                    }
                    c0750a2.f7354l = 1;
                    obj = eVar2.C0(j4, j5, c0750a2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                j6 = ((M0.o) obj).f3563a;
                return new M0.o(j6);
            }
        }
        c0750a = new C0750a(this, cVar);
        C0750a c0750a22 = c0750a;
        Object obj2 = c0750a22.f7352j;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0750a22.f7354l;
        if (i2 != 0) {
        }
        j6 = ((M0.o) obj2).f3563a;
        return new M0.o(j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(long j4, E2.c cVar) {
        C0751b c0751b;
        int i2;
        long j5;
        if (cVar instanceof C0751b) {
            c0751b = (C0751b) cVar;
            int i4 = c0751b.f7357l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0751b.f7357l = i4 - Integer.MIN_VALUE;
                Object obj = c0751b.f7355j;
                D2.a aVar = D2.a.f2163d;
                i2 = c0751b.f7357l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    k0.e eVar = (k0.e) this.f987e;
                    k0.e eVar2 = null;
                    if (eVar != null && eVar.f3990s) {
                        eVar2 = (k0.e) AbstractC1065f.k(eVar);
                    }
                    if (eVar2 == null) {
                        j5 = 0;
                        return new M0.o(j5);
                    }
                    c0751b.f7357l = 1;
                    obj = eVar2.E0(j4, c0751b);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                j5 = ((M0.o) obj).f3563a;
                return new M0.o(j5);
            }
        }
        c0751b = new C0751b(this, cVar);
        Object obj2 = c0751b.f7355j;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0751b.f7357l;
        if (i2 != 0) {
        }
        j5 = ((M0.o) obj2).f3563a;
        return new M0.o(j5);
    }

    public void h(Object obj) {
        ((ArrayList) this.f988i).add(this.f989j);
        this.f989j = obj;
    }

    public void i(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(H(str, new Object[0]));
        sb.append("\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        String sb2 = sb.toString();
        System.currentTimeMillis();
        ((G1.y) this.f987e).d(4, (String) this.f988i, sb2);
    }

    public Object j() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0188b.f2788a) {
            return this.f989j;
        }
        O.e eVar = (O.e) ((AtomicReference) this.f987e).get();
        int a4 = eVar.a(id);
        if (a4 >= 0) {
            return eVar.f3629c[a4];
        }
        return null;
    }

    public Z.r k() {
        return ((C0494b) this.f989j).f5602d.f5600c;
    }

    public Object l() {
        return this.f989j;
    }

    public M0.b m() {
        return ((C0494b) this.f989j).f5602d.f5598a;
    }

    public C0531b n() {
        return (C0531b) this.f988i;
    }

    public byte[] o() {
        URI uri = (URI) this.f987e;
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
        linkedHashMap.put("Sec-WebSocket-Key", (String) this.f988i);
        HashMap hashMap = (HashMap) this.f989j;
        for (String str : hashMap.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) hashMap.get(str));
            }
        }
        String j4 = AbstractC0017m.j("GET ", sb2, " HTTP/1.1\r\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j4);
        String str2 = new String();
        for (String str3 : linkedHashMap.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(str3);
            sb4.append(": ");
            str2 = AbstractC0017m.n(sb4, (String) linkedHashMap.get(str3), "\r\n");
        }
        sb3.append(str2);
        byte[] bytes = (sb3.toString() + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public N p() {
        N n2 = (N) this.f988i;
        if (n2 != null) {
            return n2;
        }
        Intrinsics.g("keyboardActions");
        throw null;
    }

    public M0.k q() {
        return ((C0494b) this.f989j).f5602d.f5599b;
    }

    public g2.e r() {
        C0924c c0924c = (C0924c) this.f987e;
        C0097d c0097d = (C0097d) this.f988i;
        if (c0097d == null) {
            return c0924c != null ? new g2.e(c0924c) : g2.e.f6694j;
        }
        AbstractC0720j.c(c0924c != null);
        return c0097d.r().j(c0924c);
    }

    public long s() {
        return ((C0494b) this.f989j).f5602d.f5601d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T t(C0256h modelClass, String key) {
        boolean isInstance;
        T viewModel;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        Y y4 = (Y) this.f987e;
        y4.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = y4.f5462a;
        T t4 = (T) linkedHashMap.get(key);
        modelClass.getClass();
        C0256h.f3597b.getClass();
        Class jClass = modelClass.f3601a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map map = C0256h.f3598c;
        Intrinsics.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            isInstance = M2.J.e(num.intValue(), t4);
        } else {
            if (jClass.isPrimitive()) {
                Intrinsics.checkNotNullParameter(jClass, "<this>");
                jClass = u3.l.h0(M2.F.a(jClass));
            }
            isInstance = jClass.isInstance(t4);
        }
        V factory = (V) this.f988i;
        if (isInstance) {
            if (factory instanceof X) {
                Intrinsics.c(t4);
                ((X) factory).d(t4);
            }
            Intrinsics.d(t4, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return t4;
        }
        C0993c extras = new C0993c((t0) this.f989j);
        extras.r(r1.c.f9861d, key);
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                viewModel = factory.c(modelClass, extras);
            } catch (AbstractMethodError unused) {
                viewModel = factory.a(u3.l.g0(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            viewModel = factory.b(u3.l.g0(modelClass), extras);
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        T t5 = (T) linkedHashMap.put(key, viewModel);
        if (t5 != null) {
            t5.b();
        }
        return viewModel;
    }

    public String toString() {
        switch (this.f986d) {
            case 12:
                C0924c c0924c = (C0924c) this.f987e;
                return "" + (c0924c == null ? "<anon>" : c0924c.f8920d) + "\n" + ((C0719i) this.f989j).a("\t");
            case 23:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f987e;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f988i;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f989j;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public void u(Throwable th) {
        String str = th instanceof OutOfMemoryError ? "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data" : th instanceof NoClassDefFoundError ? "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk" : th instanceof C0518b ? "" : "Uncaught exception in Firebase Database runloop (21.0.0). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
        ((C0097d) this.f988i).i(str, th);
        new Handler(((Context) ((y.t) this.f989j).f11494e).getMainLooper()).post(new G1.n(9, (Object) str, (Object) th, false));
        ((C0712b) this.f987e).shutdownNow();
    }

    public boolean v(CharSequence charSequence, int i2, int i4, k1.q qVar) {
        if ((qVar.f7411c & 3) == 0) {
            k1.d dVar = (k1.d) this.f989j;
            C0820a c4 = qVar.c();
            int b4 = c4.b(8);
            if (b4 != 0) {
                ((ByteBuffer) c4.f838j).getShort(b4 + c4.f835d);
            }
            dVar.getClass();
            ThreadLocal threadLocal = k1.d.f7373b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i4) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = dVar.f7374a;
            String sb2 = sb.toString();
            int i5 = V0.e.f4147a;
            boolean a4 = V0.d.a(textPaint, sb2);
            int i6 = qVar.f7411c & 4;
            qVar.f7411c = a4 ? i6 | 2 : i6 | 1;
        }
        return (qVar.f7411c & 3) == 2;
    }

    public boolean w() {
        C0097d c0097d;
        return ((F0.t) this.f987e).f2632d != this.f989j || ((c0097d = (C0097d) this.f988i) != null && c0097d.w());
    }

    public void x(Object obj) {
        b.m mVar = (b.m) this.f987e;
        LinkedHashMap linkedHashMap = mVar.f5551b;
        String str = (String) this.f988i;
        Object obj2 = linkedHashMap.get(str);
        AbstractC0345a abstractC0345a = (AbstractC0345a) this.f989j;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0345a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = mVar.f5553d;
        arrayList.add(str);
        try {
            mVar.b(intValue, abstractC0345a, obj);
        } catch (Exception e4) {
            arrayList.remove(str);
            throw e4;
        }
    }

    public boolean y() {
        return AbstractC0784j.d(((G1.y) this.f987e).f3164a) <= 0;
    }

    public void z() {
        C1166s c1166s = ((r0.E) this.f987e).f9602o;
        if (c1166s != null) {
            c1166s.u();
        }
    }

    public /* synthetic */ C0097d(Object obj, Object obj2, Object obj3, int i2) {
        this.f986d = i2;
        this.f987e = obj;
        this.f988i = obj2;
        this.f989j = obj3;
    }

    public C0097d(Set set, String str, String str2) {
        this.f986d = 5;
        S1.a aVar = S1.a.f4026a;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        Map emptyMap = Collections.emptyMap();
        this.f988i = str2;
        this.f989j = aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f987e = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public C0097d(Application appContext) {
        Iterator it;
        this.f986d = 0;
        v0 builderAction = new v0(4);
        C0723b json = AbstractC0724c.f7172d;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        j3.h hVar = new j3.h();
        j3.j jVar = json.f7173a;
        hVar.f7181a = jVar.f7198a;
        hVar.f7182b = jVar.f7203f;
        hVar.f7183c = jVar.f7199b;
        hVar.f7184d = jVar.f7200c;
        boolean z4 = jVar.f7202e;
        hVar.f7185e = z4;
        String str = jVar.f7204g;
        hVar.f7186f = str;
        hVar.f7187g = jVar.f7205h;
        String str2 = jVar.f7207j;
        hVar.f7188h = str2;
        EnumC0722a enumC0722a = jVar.f7213p;
        hVar.f7189i = enumC0722a;
        hVar.f7190j = jVar.f7209l;
        hVar.f7191k = jVar.f7210m;
        hVar.f7192l = jVar.f7211n;
        hVar.f7193m = jVar.f7212o;
        hVar.f7194n = jVar.f7208k;
        hVar.f7195o = jVar.f7201d;
        boolean z5 = jVar.f7206i;
        hVar.f7196p = z5;
        hVar.f7197q = json.f7174b;
        builderAction.invoke(hVar);
        if (z5) {
            if (Intrinsics.a(str2, "type")) {
                if (enumC0722a != EnumC0722a.f7170d) {
                    throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                }
            } else {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
        }
        if (!z4) {
            if (!Intrinsics.a(str, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!Intrinsics.a(str, "    ")) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                }
            }
        }
        boolean z6 = hVar.f7183c;
        boolean z7 = hVar.f7184d;
        boolean z8 = hVar.f7193m;
        EnumC0722a enumC0722a2 = hVar.f7189i;
        boolean z9 = hVar.f7181a;
        boolean z10 = hVar.f7195o;
        boolean z11 = hVar.f7185e;
        boolean z12 = hVar.f7182b;
        String str3 = hVar.f7186f;
        boolean z13 = hVar.f7187g;
        boolean z14 = hVar.f7196p;
        String str4 = hVar.f7188h;
        j3.j configuration = new j3.j(z9, z6, z7, z10, z11, z12, str3, z13, z14, str4, hVar.f7194n, hVar.f7190j, hVar.f7191k, hVar.f7192l, z8, enumC0722a2);
        A0.q module = hVar.f7197q;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        j3.q json2 = new j3.q(configuration, module);
        if (!Intrinsics.a(module, l3.a.f7993a)) {
            H1.z collector = new H1.z(str4, z14);
            module.getClass();
            Intrinsics.checkNotNullParameter(collector, "collector");
            Iterator it2 = ((Map) module.f362c).entrySet().iterator();
            if (!it2.hasNext()) {
                Iterator it3 = ((Map) module.f363d).entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    S2.b baseClass = (S2.b) entry.getKey();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        S2.b actualClass = (S2.b) entry2.getKey();
                        KSerializer actualSerializer = (KSerializer) entry2.getValue();
                        Intrinsics.d(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        Intrinsics.d(actualClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        Intrinsics.d(actualSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
                        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
                        SerialDescriptor descriptor = actualSerializer.getDescriptor();
                        u3.d i4 = descriptor.i();
                        if (!(i4 instanceof g3.c) && !Intrinsics.a(i4, g3.g.f6805h)) {
                            boolean z15 = collector.f3320a;
                            if (z15) {
                                it = it3;
                            } else {
                                it = it3;
                                if (Intrinsics.a(i4, g3.i.f6808i) || Intrinsics.a(i4, g3.i.f6809j) || (i4 instanceof g3.e) || (i4 instanceof g3.h)) {
                                    throw new IllegalArgumentException("Serializer for " + ((C0256h) actualClass).b() + " of kind " + i4 + " cannot be serialized polymorphically with class discriminator.");
                                }
                            }
                            if (!z15) {
                                int l4 = descriptor.l();
                                for (int i5 = 0; i5 < l4; i5++) {
                                    String a4 = descriptor.a(i5);
                                    if (Intrinsics.a(a4, (String) collector.f3321b)) {
                                        throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + a4 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                                    }
                                }
                            }
                            it3 = it;
                        } else {
                            throw new IllegalArgumentException("Serializer for " + ((C0256h) actualClass).b() + " can't be registered as a subclass for polymorphic serialization because its kind " + i4 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                        }
                    }
                }
                for (Map.Entry entry3 : ((Map) module.f364e).entrySet()) {
                    S2.b baseClass2 = (S2.b) entry3.getKey();
                    Function1 defaultSerializerProvider = (Function1) entry3.getValue();
                    Intrinsics.d(baseClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    Intrinsics.d(defaultSerializerProvider, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                    M2.J.d(1, defaultSerializerProvider);
                    Intrinsics.checkNotNullParameter(baseClass2, "baseClass");
                    Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
                }
                for (Map.Entry entry4 : ((Map) module.f361b).entrySet()) {
                    S2.b baseClass3 = (S2.b) entry4.getKey();
                    Function1 defaultDeserializerProvider = (Function1) entry4.getValue();
                    Intrinsics.d(baseClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    Intrinsics.d(defaultDeserializerProvider, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                    M2.J.d(1, defaultDeserializerProvider);
                    Intrinsics.checkNotNullParameter(baseClass3, "baseClass");
                    Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                }
            } else {
                Map.Entry entry5 = (Map.Entry) it2.next();
                if (entry5.getValue() == null) {
                    throw new C1338m();
                }
                throw new ClassCastException();
            }
        }
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(json2, "json");
        this.f987e = appContext;
        this.f988i = json2;
        m3.q qVar = new m3.q();
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        qVar.f8423r = n3.b.b(10L, unit);
        Intrinsics.checkNotNullParameter(unit, "unit");
        qVar.f8424s = n3.b.b(15L, unit);
        this.f989j = new m3.r(qVar);
    }

    public C0097d(Y store, V factory, t0 extras) {
        this.f986d = 19;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f987e = store;
        this.f988i = factory;
        this.f989j = extras;
    }

    public C0097d(L0 l02) {
        this.f986d = 24;
        this.f987e = l02;
    }

    public C0097d(InterfaceC0980p interfaceC0980p) {
        this.f986d = 15;
        this.f987e = interfaceC0980p;
        this.f988i = new C0810h(0);
        i.s sVar = new i.s();
        sVar.f6951a = AbstractC0664E.f6891a;
        sVar.f6952b = i.l.f6924a;
        sVar.f6953c = AbstractC0705a.f7121c;
        sVar.c(AbstractC0664E.f(10));
        this.f989j = sVar;
    }

    public C0097d(int i2) {
        this.f986d = i2;
        switch (i2) {
            case 3:
                this.f989j = new E1.i(5);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f987e = new WeakHashMap();
                this.f988i = new WeakHashMap();
                this.f989j = new WeakHashMap();
                break;
            case 13:
                this.f988i = new A3.e(15, this);
                break;
            default:
                this.f987e = new AtomicReference(O.f.f3630a);
                this.f988i = new Object();
                break;
        }
    }

    public C0097d(View view) {
        this.f986d = 2;
        this.f987e = view;
        this.f988i = C1336k.b(EnumC1337l.f11671e, new A3.e(5, this));
        C1294c c1294c = new C1294c();
        if (Build.VERSION.SDK_INT >= 30) {
            C0394i c0394i = new C0394i(view);
            c0394i.f4884i = view;
            c1294c.f11388d = c0394i;
        } else {
            c1294c.f11388d = new C1294c(view);
        }
        this.f989j = c1294c;
    }

    public C0097d(C0494b c0494b) {
        this.f986d = 9;
        this.f989j = c0494b;
        this.f987e = new C1294c(this);
    }

    public C0097d(y.t tVar, C0097d c0097d) {
        this.f986d = 10;
        this.f989j = tVar;
        this.f988i = c0097d;
        C0712b c0712b = new C0712b(this, new ThreadFactoryC0634b(this));
        this.f987e = c0712b;
        c0712b.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public C0097d(Y0.b bVar, H1.f fVar, k1.d dVar, Set set) {
        this.f986d = 14;
        this.f987e = fVar;
        this.f988i = bVar;
        this.f989j = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            A(str, 0, str.length(), 1, true, new b3.t(str, 1));
        }
    }

    public C0097d(F0.t tVar, C0097d c0097d) {
        this.f986d = 6;
        this.f987e = tVar;
        this.f988i = c0097d;
        this.f989j = tVar.f2632d;
    }

    public C0097d(r0.E e4) {
        this.f986d = 21;
        this.f987e = e4;
        this.f988i = new ArrayList();
        this.f989j = e4;
    }
}
