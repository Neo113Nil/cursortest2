package com.facebook.ads.internal.o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.ads.internal.o.f;
import com.facebook.ads.internal.p.a.m;
import com.facebook.ads.internal.p.a.n;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.i;
import com.facebook.ads.internal.q.a.l;
import com.facebook.ads.internal.q.c.d;
import java.security.MessageDigest;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;

/* loaded from: classes.dex */
public class c {
    private static final l i = new l();
    private static final ThreadPoolExecutor j = (ThreadPoolExecutor) Executors.newCachedThreadPool(i);

    /* renamed from: a, reason: collision with root package name */
    private final Context f5267a;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.l.a f5269c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f5270d;
    private a e;
    private b f;
    private com.facebook.ads.internal.p.a.a g;

    /* renamed from: b, reason: collision with root package name */
    private final e f5268b = e.a();
    private final String h = d.a();

    public interface a {
        void a(g gVar);

        void a(com.facebook.ads.internal.protocol.a aVar);
    }

    public c(Context context) {
        this.f5267a = context.getApplicationContext();
        this.f5269c = new com.facebook.ads.internal.l.a(this.f5267a);
    }

    private void a(g gVar) {
        if (this.e != null) {
            this.e.a(gVar);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.facebook.ads.internal.protocol.a aVar) {
        if (this.e != null) {
            this.e.a(aVar);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        int i2;
        com.facebook.ads.internal.protocol.a a2;
        try {
            f a3 = this.f5268b.a(str);
            com.facebook.ads.internal.h.c a4 = a3.a();
            if (a4 != null) {
                this.f5269c.a(a4.b());
                com.facebook.ads.internal.o.a.a(a4.a().d(), this.f);
            }
            switch (a3.b()) {
                case ADS:
                    g gVar = (g) a3;
                    if (a4 != null) {
                        if (a4.a().e()) {
                            com.facebook.ads.internal.o.a.a(str, this.f);
                        }
                        String str2 = this.f5270d != null ? this.f5270d.get("CLIENT_REQUEST_ID") : null;
                        String c2 = a3.c();
                        if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(str2)) {
                            StringBuilder sb = new StringBuilder();
                            for (int i3 = 0; i3 < "26n6n4pnp2p74100oqo8p5o336r8p510".length(); i3++) {
                                char charAt = "26n6n4pnp2p74100oqo8p5o336r8p510".charAt(i3);
                                if ((charAt < 'a' || charAt > 'm') && (charAt < 'A' || charAt > 'M')) {
                                    if ((charAt >= 'n' && charAt <= 'z') || (charAt >= 'N' && charAt <= 'Z')) {
                                        i2 = charAt - '\r';
                                    }
                                    sb.append(charAt);
                                } else {
                                    i2 = charAt + '\r';
                                }
                                charAt = (char) i2;
                                sb.append(charAt);
                            }
                            byte[] bytes = (str2 + c2 + sb.toString()).getBytes("iso-8859-1");
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                            messageDigest.update(bytes, 0, bytes.length);
                            if (!a3.d().equals(com.facebook.ads.internal.q.a.h.a(messageDigest.digest()))) {
                                com.facebook.ads.internal.q.d.a.a(new i(), this.f5267a);
                            }
                            byte[] bytes2 = (c2 + str2 + sb.toString()).getBytes("iso-8859-1");
                            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
                            messageDigest2.update(bytes2, 0, bytes2.length);
                            com.facebook.ads.internal.f.e.a(new com.facebook.ads.internal.f.a(c2, com.facebook.ads.internal.q.a.h.a(messageDigest2.digest())), this.f5267a);
                        }
                        if (!TextUtils.isEmpty(a3.e()) && !TextUtils.isEmpty(str2)) {
                            new com.facebook.ads.internal.k.a(this.f5267a, str2, a3.e()).a();
                        }
                    }
                    a(gVar);
                    return;
                case ERROR:
                    h hVar = (h) a3;
                    String f = hVar.f();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(hVar.g(), AdErrorType.ERROR_MESSAGE);
                    if (f != null) {
                        str = f;
                    }
                    a2 = com.facebook.ads.internal.protocol.a.a(adErrorTypeFromCode, str);
                    break;
                default:
                    a2 = com.facebook.ads.internal.protocol.a.a(AdErrorType.UNKNOWN_RESPONSE, str);
                    break;
            }
            a(a2);
        } catch (Exception e) {
            a(com.facebook.ads.internal.protocol.a.a(AdErrorType.PARSER_FAILURE, e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.internal.p.a.b b() {
        return new com.facebook.ads.internal.p.a.b() { // from class: com.facebook.ads.internal.o.c.2
            void a(m mVar) {
                com.facebook.ads.internal.o.a.b(c.this.f);
                c.this.g = null;
                try {
                    n a2 = mVar.a();
                    if (a2 != null) {
                        String e = a2.e();
                        f a3 = c.this.f5268b.a(e);
                        if (a3.b() == f.a.ERROR) {
                            h hVar = (h) a3;
                            String f = hVar.f();
                            AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(hVar.g(), AdErrorType.ERROR_MESSAGE);
                            c cVar = c.this;
                            if (f != null) {
                                e = f;
                            }
                            cVar.a(com.facebook.ads.internal.protocol.a.a(adErrorTypeFromCode, e));
                            return;
                        }
                    }
                } catch (JSONException unused) {
                }
                c.this.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.NETWORK_ERROR, mVar.getMessage()));
            }

            @Override // com.facebook.ads.internal.p.a.b
            public void a(n nVar) {
                if (nVar != null) {
                    String e = nVar.e();
                    com.facebook.ads.internal.o.a.b(c.this.f);
                    c.this.g = null;
                    c.this.a(e);
                }
            }

            @Override // com.facebook.ads.internal.p.a.b
            public void a(Exception exc) {
                if (m.class.equals(exc.getClass())) {
                    a((m) exc);
                } else {
                    c.this.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.NETWORK_ERROR, exc.getMessage()));
                }
            }
        };
    }

    public void a() {
        if (this.g != null) {
            this.g.c(1);
            this.g.b(1);
            this.g = null;
        }
    }

    public void a(final b bVar) {
        a();
        if (com.facebook.ads.internal.q.c.d.c(this.f5267a) == d.a.NONE) {
            a(new com.facebook.ads.internal.protocol.a(AdErrorType.NETWORK_ERROR, "No network connection"));
            return;
        }
        this.f = bVar;
        com.facebook.ads.internal.g.a.a(this.f5267a);
        if (!com.facebook.ads.internal.o.a.a(bVar)) {
            j.submit(new Runnable() { // from class: com.facebook.ads.internal.o.c.1
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    com.facebook.ads.internal.c.b.a(c.this.f5267a);
                    if (bVar.e().a()) {
                        try {
                            bVar.e().a(com.facebook.ads.internal.c.b.f5051b);
                        } catch (com.facebook.ads.internal.protocol.b e) {
                            c.this.a(com.facebook.ads.internal.protocol.a.a(e));
                        }
                        c.this.a(bVar.e().b());
                        return;
                    }
                    c.this.f5270d = bVar.f();
                    try {
                        c.this.f5270d.put("M_BANNER_KEY", new String(Base64.encode((c.this.f5267a.getPackageName() + " " + c.this.f5267a.getPackageManager().getInstallerPackageName(c.this.f5267a.getPackageName())).getBytes(), 2)));
                    } catch (Exception unused) {
                    }
                    try {
                        if (bVar.f5265c != com.facebook.ads.internal.protocol.f.NATIVE_250 && bVar.f5265c != com.facebook.ads.internal.protocol.f.NATIVE_UNKNOWN && bVar.f5265c != null) {
                            z = false;
                            c.this.g = com.facebook.ads.internal.q.c.d.b(c.this.f5267a, z);
                            c.this.g.a(c.this.h, c.this.g.b().a(c.this.f5270d), c.this.b());
                        }
                        z = true;
                        c.this.g = com.facebook.ads.internal.q.c.d.b(c.this.f5267a, z);
                        c.this.g.a(c.this.h, c.this.g.b().a(c.this.f5270d), c.this.b());
                    } catch (Exception e2) {
                        c.this.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.AD_REQUEST_FAILED, e2.getMessage()));
                    }
                }
            });
            return;
        }
        String c2 = com.facebook.ads.internal.o.a.c(bVar);
        if (c2 != null) {
            a(c2);
        } else {
            a(com.facebook.ads.internal.protocol.a.a(AdErrorType.LOAD_TOO_FREQUENTLY, null));
        }
    }

    public void a(a aVar) {
        this.e = aVar;
    }
}
