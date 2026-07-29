package org.apache.a.f.a;

import java.io.IOException;
import org.apache.a.p;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

/* compiled from: NegotiateScheme.java */
/* loaded from: classes2.dex */
public class k extends org.apache.a.f.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9749a;

    /* renamed from: b, reason: collision with root package name */
    private final n f9750b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9751c;

    /* renamed from: d, reason: collision with root package name */
    private GSSContext f9752d;
    private a e;
    private byte[] f;
    private Oid g;

    /* compiled from: NegotiateScheme.java */
    enum a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    @Override // org.apache.a.a.a
    public String a() {
        return "Negotiate";
    }

    @Override // org.apache.a.a.a
    public String b() {
        return null;
    }

    @Override // org.apache.a.a.a
    public boolean c() {
        return true;
    }

    public k(n nVar, boolean z) {
        this.f9749a = LogFactory.getLog(getClass());
        this.f9752d = null;
        this.g = null;
        this.e = a.UNINITIATED;
        this.f9750b = nVar;
        this.f9751c = z;
    }

    public k() {
        this(null, false);
    }

    @Override // org.apache.a.a.a
    public boolean d() {
        return this.e == a.TOKEN_GENERATED || this.e == a.FAILED;
    }

    @Override // org.apache.a.a.a
    @Deprecated
    public org.apache.a.d a(org.apache.a.a.h hVar, p pVar) throws org.apache.a.a.f {
        return a(hVar, pVar, (org.apache.a.j.e) null);
    }

    protected GSSManager f() {
        return GSSManager.getInstance();
    }

    @Override // org.apache.a.f.a.a, org.apache.a.a.g
    public org.apache.a.d a(org.apache.a.a.h hVar, p pVar, org.apache.a.j.e eVar) throws org.apache.a.a.f {
        String a2;
        boolean z;
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (this.e != a.CHALLENGE_RECEIVED) {
            throw new IllegalStateException("Negotiation authentication process has not been initiated");
        }
        try {
            try {
                org.apache.a.m mVar = (org.apache.a.m) eVar.a(e() ? "http.proxy_host" : "http.target_host");
                if (mVar == null) {
                    throw new org.apache.a.a.f("Authentication host is not set in the execution context");
                }
                if (!this.f9751c && mVar.b() > 0) {
                    a2 = mVar.e();
                } else {
                    a2 = mVar.a();
                }
                if (this.f9749a.isDebugEnabled()) {
                    this.f9749a.debug("init " + a2);
                }
                this.g = new Oid("1.3.6.1.5.5.2");
                try {
                    GSSManager f = f();
                    this.f9752d = f.createContext(f.createName("HTTP@" + a2, GSSName.NT_HOSTBASED_SERVICE).canonicalize(this.g), this.g, (GSSCredential) null, 0);
                    this.f9752d.requestMutualAuth(true);
                    this.f9752d.requestCredDeleg(true);
                    z = false;
                } catch (GSSException e) {
                    if (e.getMajor() == 2) {
                        this.f9749a.debug("GSSException BAD_MECH, retry with Kerberos MECH");
                        z = true;
                    } else {
                        throw e;
                    }
                }
                if (z) {
                    this.f9749a.debug("Using Kerberos MECH 1.2.840.113554.1.2.2");
                    this.g = new Oid("1.2.840.113554.1.2.2");
                    GSSManager f2 = f();
                    this.f9752d = f2.createContext(f2.createName("HTTP@" + a2, GSSName.NT_HOSTBASED_SERVICE).canonicalize(this.g), this.g, (GSSCredential) null, 0);
                    this.f9752d.requestMutualAuth(true);
                    this.f9752d.requestCredDeleg(true);
                }
                if (this.f == null) {
                    this.f = new byte[0];
                }
                this.f = this.f9752d.initSecContext(this.f, 0, this.f.length);
                if (this.f == null) {
                    this.e = a.FAILED;
                    throw new org.apache.a.a.f("GSS security context initialization failed");
                }
                if (this.f9750b != null && this.g.toString().equals("1.2.840.113554.1.2.2")) {
                    this.f = this.f9750b.a(this.f);
                }
                this.e = a.TOKEN_GENERATED;
                String str = new String(Base64.encodeBase64(this.f, false));
                if (this.f9749a.isDebugEnabled()) {
                    this.f9749a.debug("Sending response '" + str + "' back to the auth server");
                }
                return new org.apache.a.h.b("Authorization", "Negotiate " + str);
            } catch (IOException e2) {
                this.e = a.FAILED;
                throw new org.apache.a.a.f(e2.getMessage());
            }
        } catch (GSSException e3) {
            this.e = a.FAILED;
            if (e3.getMajor() == 9 || e3.getMajor() == 8) {
                throw new org.apache.a.a.i(e3.getMessage(), e3);
            }
            if (e3.getMajor() == 13) {
                throw new org.apache.a.a.i(e3.getMessage(), e3);
            }
            if (e3.getMajor() == 10 || e3.getMajor() == 19 || e3.getMajor() == 20) {
                throw new org.apache.a.a.f(e3.getMessage(), e3);
            }
            throw new org.apache.a.a.f(e3.getMessage());
        }
    }

    @Override // org.apache.a.f.a.a
    protected void a(org.apache.a.k.b bVar, int i, int i2) throws org.apache.a.a.j {
        String b2 = bVar.b(i, i2);
        if (this.f9749a.isDebugEnabled()) {
            this.f9749a.debug("Received challenge '" + b2 + "' from the auth server");
        }
        if (this.e == a.UNINITIATED) {
            this.f = new Base64().decode(b2.getBytes());
            this.e = a.CHALLENGE_RECEIVED;
        } else {
            this.f9749a.debug("Authentication already attempted");
            this.e = a.FAILED;
        }
    }
}
