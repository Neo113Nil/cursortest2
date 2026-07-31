package v0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n2.l;
import n2.p;
import v0.g0;

/* loaded from: classes.dex */
public final class l0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final l.a f22677a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22678b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22679c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f22680d;

    public l0(String str, boolean z6, l.a aVar) {
        o2.a.a((z6 && TextUtils.isEmpty(str)) ? false : true);
        this.f22677a = aVar;
        this.f22678b = str;
        this.f22679c = z6;
        this.f22680d = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:11|12|13|(2:15|16)(2:17|18)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = d(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r8 = r8 + 1;
        r9 = r9.a().j(r1).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        o2.m0.n(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] c(l.a aVar, String str, byte[] bArr, Map<String, String> map) {
        n2.o0 o0Var = new n2.o0(aVar.a());
        n2.p a7 = new p.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i7 = 0;
        n2.p pVar = a7;
        while (true) {
            try {
                n2.n nVar = new n2.n(o0Var, pVar);
                return o2.m0.U0(nVar);
            } catch (Exception e7) {
                throw new o0(a7, (Uri) o2.a.e(o0Var.r()), o0Var.g(), o0Var.q(), e7);
            }
        }
    }

    private static String d(n2.c0 c0Var, int i7) {
        Map<String, List<String>> map;
        List<String> list;
        int i8 = c0Var.f19398i;
        if (!((i8 == 307 || i8 == 308) && i7 < 5) || (map = c0Var.f19400k) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // v0.n0
    public byte[] a(UUID uuid, g0.d dVar) {
        return c(this.f22677a, dVar.b() + "&signedRequest=" + o2.m0.D(dVar.a()), null, Collections.emptyMap());
    }

    @Override // v0.n0
    public byte[] b(UUID uuid, g0.a aVar) {
        String b7 = aVar.b();
        if (this.f22679c || TextUtils.isEmpty(b7)) {
            b7 = this.f22678b;
        }
        if (TextUtils.isEmpty(b7)) {
            throw new o0(new p.b().i(Uri.EMPTY).a(), Uri.EMPTY, m4.r.j(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = r0.j.f20687e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : r0.j.f20685c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f22680d) {
            hashMap.putAll(this.f22680d);
        }
        return c(this.f22677a, b7, aVar.a(), hashMap);
    }

    public void e(String str, String str2) {
        o2.a.e(str);
        o2.a.e(str2);
        synchronized (this.f22680d) {
            this.f22680d.put(str, str2);
        }
    }
}
