package com.android.volley.toolbox;

import android.os.SystemClock;
import com.aiming.mdt.utils.Constants;
import com.android.volley.b;
import com.android.volley.p;
import com.android.volley.q;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.a.ad;
import org.apache.a.r;

/* compiled from: BasicNetwork.java */
/* loaded from: classes.dex */
public class a implements com.android.volley.f {

    /* renamed from: a, reason: collision with root package name */
    protected static final boolean f2325a = t.f2310b;

    /* renamed from: d, reason: collision with root package name */
    private static int f2326d = GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE;
    private static int e = 4096;

    /* renamed from: b, reason: collision with root package name */
    protected final f f2327b;

    /* renamed from: c, reason: collision with root package name */
    protected final b f2328c;

    public a(f fVar) {
        this(fVar, new b(e));
    }

    public a(f fVar, b bVar) {
        this.f2327b = fVar;
        this.f2328c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        throw new java.io.IOException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // com.android.volley.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.android.volley.i a(com.android.volley.l<?> lVar) throws s {
        ?? r17;
        r rVar;
        byte[] bArr;
        byte[] a2;
        byte[] bArr2;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Map emptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap hashMap = new HashMap();
                    a(hashMap, lVar.e());
                    rVar = this.f2327b.a(lVar, hashMap);
                    try {
                        ad a3 = rVar.a();
                        int b2 = a3.b();
                        ?? a4 = a(rVar.getAllHeaders());
                        if (b2 == 304) {
                            b.a e2 = lVar.e();
                            if (e2 == null) {
                                return new com.android.volley.i(304, null, a4, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            e2.g.putAll(a4);
                            return new com.android.volley.i(304, e2.f2259a, e2.g, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                        }
                        try {
                            if (rVar.b() != null) {
                                try {
                                    a2 = a(rVar.b());
                                } catch (IOException e3) {
                                    e = e3;
                                    bArr = null;
                                    r17 = a4;
                                    if (rVar != null) {
                                    }
                                }
                            } else {
                                a2 = new byte[0];
                            }
                            bArr2 = a2;
                            try {
                                aVar = this;
                                aVar.a(SystemClock.elapsedRealtime() - elapsedRealtime, lVar, bArr2, a3);
                            } catch (IOException e4) {
                                e = e4;
                                aVar = a4;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            emptyMap = a4;
                            r17 = emptyMap;
                            bArr = null;
                            if (rVar != null) {
                                int b3 = rVar.a().b();
                                t.c("Unexpected response code %d for %s", Integer.valueOf(b3), lVar.c());
                                if (bArr != null) {
                                    com.android.volley.i iVar = new com.android.volley.i(b3, bArr, r17, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                                    if (b3 == 401 || b3 == 403) {
                                        a("auth", lVar, new com.android.volley.a(iVar));
                                    } else {
                                        throw new q(iVar);
                                    }
                                } else {
                                    throw new com.android.volley.h((com.android.volley.i) null);
                                }
                            } else {
                                throw new com.android.volley.j(e);
                            }
                        }
                        try {
                            if (b2 < 200 || b2 > 299) {
                                break;
                            }
                            return new com.android.volley.i(b2, bArr2, a4, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                        } catch (IOException e6) {
                            e = e6;
                            r17 = aVar;
                            bArr = bArr2;
                            if (rVar != null) {
                            }
                        }
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (IOException e8) {
                    e = e8;
                    r17 = emptyMap;
                    rVar = null;
                    bArr = null;
                }
            } catch (MalformedURLException e9) {
                String valueOf = String.valueOf(lVar.c());
                throw new RuntimeException(valueOf.length() != 0 ? "Bad URL ".concat(valueOf) : new String("Bad URL "), e9);
            } catch (SocketTimeoutException unused) {
                a("socket", lVar, new com.android.volley.r());
            } catch (org.apache.a.c.f unused2) {
                a("connection", lVar, new com.android.volley.r());
            }
        }
    }

    private void a(long j, com.android.volley.l<?> lVar, byte[] bArr, ad adVar) {
        if (f2325a || j > f2326d) {
            Object[] objArr = new Object[5];
            objArr[0] = lVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(adVar.b());
            objArr[4] = Integer.valueOf(lVar.t().b());
            t.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    private static void a(String str, com.android.volley.l<?> lVar, s sVar) throws s {
        p t = lVar.t();
        int s = lVar.s();
        try {
            t.a(sVar);
            lVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(s)));
        } catch (s e2) {
            lVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(s)));
            throw e2;
        }
    }

    private void a(Map<String, String> map, b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.f2260b != null) {
            map.put(Constants.KEY_IF_NONE_MATCH, aVar.f2260b);
        }
        if (aVar.f2262d > 0) {
            map.put(Constants.KEY_IF_MODIFIED_SINCE, org.apache.a.f.d.q.a(new Date(aVar.f2262d)));
        }
    }

    private byte[] a(org.apache.a.j jVar) throws IOException, q {
        l lVar = new l(this.f2328c, (int) jVar.c());
        byte[] bArr = null;
        try {
            InputStream f = jVar.f();
            if (f == null) {
                throw new q();
            }
            byte[] a2 = this.f2328c.a(1024);
            while (true) {
                try {
                    int read = f.read(a2);
                    if (read == -1) {
                        break;
                    }
                    lVar.write(a2, 0, read);
                } catch (Throwable th) {
                    th = th;
                    bArr = a2;
                    try {
                        jVar.h();
                    } catch (IOException unused) {
                        t.a("Error occured when calling consumingContent", new Object[0]);
                    }
                    this.f2328c.a(bArr);
                    lVar.close();
                    throw th;
                }
            }
            byte[] byteArray = lVar.toByteArray();
            try {
                jVar.h();
            } catch (IOException unused2) {
                t.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f2328c.a(a2);
            lVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    protected static Map<String, String> a(org.apache.a.d[] dVarArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < dVarArr.length; i++) {
            treeMap.put(dVarArr[i].c(), dVarArr[i].d());
        }
        return treeMap;
    }
}
