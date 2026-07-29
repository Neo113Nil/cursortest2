package org.apache.a.f.a;

import org.apache.a.p;

/* compiled from: NTLMScheme.java */
/* loaded from: classes2.dex */
public class i extends org.apache.a.f.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final f f9742a;

    /* renamed from: b, reason: collision with root package name */
    private a f9743b;

    /* renamed from: c, reason: collision with root package name */
    private String f9744c;

    /* compiled from: NTLMScheme.java */
    enum a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    @Override // org.apache.a.a.a
    public String a() {
        return "ntlm";
    }

    @Override // org.apache.a.a.a
    public String b() {
        return null;
    }

    @Override // org.apache.a.a.a
    public boolean c() {
        return true;
    }

    public i(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("NTLM engine may not be null");
        }
        this.f9742a = fVar;
        this.f9743b = a.UNINITIATED;
        this.f9744c = null;
    }

    @Override // org.apache.a.f.a.a
    protected void a(org.apache.a.k.b bVar, int i, int i2) throws org.apache.a.a.j {
        String b2 = bVar.b(i, i2);
        if (b2.length() == 0) {
            if (this.f9743b == a.UNINITIATED) {
                this.f9743b = a.CHALLENGE_RECEIVED;
            } else {
                this.f9743b = a.FAILED;
            }
            this.f9744c = null;
            return;
        }
        this.f9743b = a.MSG_TYPE2_RECEVIED;
        this.f9744c = b2;
    }

    @Override // org.apache.a.a.a
    public org.apache.a.d a(org.apache.a.a.h hVar, p pVar) throws org.apache.a.a.f {
        String a2;
        try {
            org.apache.a.a.k kVar = (org.apache.a.a.k) hVar;
            if (this.f9743b == a.CHALLENGE_RECEIVED || this.f9743b == a.FAILED) {
                a2 = this.f9742a.a(kVar.d(), kVar.e());
                this.f9743b = a.MSG_TYPE1_GENERATED;
            } else if (this.f9743b == a.MSG_TYPE2_RECEVIED) {
                a2 = this.f9742a.a(kVar.c(), kVar.b(), kVar.d(), kVar.e(), this.f9744c);
                this.f9743b = a.MSG_TYPE3_GENERATED;
            } else {
                throw new org.apache.a.a.f("Unexpected state: " + this.f9743b);
            }
            org.apache.a.k.b bVar = new org.apache.a.k.b(32);
            if (e()) {
                bVar.a("Proxy-Authorization");
            } else {
                bVar.a("Authorization");
            }
            bVar.a(": NTLM ");
            bVar.a(a2);
            return new org.apache.a.h.p(bVar);
        } catch (ClassCastException unused) {
            throw new org.apache.a.a.i("Credentials cannot be used for NTLM authentication: " + hVar.getClass().getName());
        }
    }

    @Override // org.apache.a.a.a
    public boolean d() {
        return this.f9743b == a.MSG_TYPE3_GENERATED || this.f9743b == a.FAILED;
    }
}
