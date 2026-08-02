package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class caz {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/passbox/PassboxServiceClientImpl");
    public final bov b;
    public final hvl c;
    public final hvl d;
    public final String e;
    public final kuq f;

    public caz(Context context, kuq kuqVar, bov bovVar, hvl hvlVar, hvl hvlVar2) {
        jwv jwvVar = idy.a;
        idl idlVar = new idl(gyf.a, hjb.a);
        new HashSet();
        hjr it = idlVar.b.iterator();
        if (it.hasNext()) {
            Object obj = ((ikm) it.next()).a;
            throw null;
        }
        this.f = new kuq(kuqVar.a, ((jww) kuqVar.b).d(jwvVar, new idy(idlVar)));
        this.b = bovVar;
        this.c = hvlVar;
        this.d = hvlVar2;
        this.e = cch.a(context);
    }

    public static final String d(String str, String str2) {
        return String.format("internalservices/%s/owneridnamespaces/%s/ownerids/%s/externalservices/%s", "GOOGLE_AUTHENTICATOR", "GOOGLE_USER_ID", str2, str);
    }

    public final hvi a(List list, String str) {
        long epochMilli = Instant.now().toEpochMilli();
        jna jnaVar = jna.a;
        jkj k = jnaVar.k();
        hel e = hdb.c(list).d(new ccb(str, 1)).b(new bwt(4)).d(new bwv(13)).e();
        if (!k.b.M()) {
            k.t();
        }
        jna jnaVar2 = (jna) k.b;
        jkx jkxVar = jnaVar2.c;
        if (!jkxVar.c()) {
            jnaVar2.c = jkp.A(jkxVar);
        }
        jiz.f(e, jnaVar2.c);
        String d = d("-", str);
        if (!k.b.M()) {
            k.t();
        }
        jna jnaVar3 = (jna) k.b;
        d.getClass();
        jnaVar3.b = d;
        jna jnaVar4 = (jna) k.q();
        kuq a2 = this.f.a(TimeUnit.SECONDS);
        Object obj = a2.a;
        kae kaeVar = jnk.e;
        if (kaeVar == null) {
            synchronized (jnk.class) {
                kaeVar = jnk.e;
                if (kaeVar == null) {
                    kab c = kae.c();
                    c.c = kad.a;
                    c.d = kae.b("google.internal.identity.passbox.passbox.v1.PassboxExternalService", "BatchUpdateCredentials");
                    c.b();
                    jkd jkdVar = knl.a;
                    c.a = new knk(jnaVar);
                    c.b = new knk(jnb.a);
                    kae a3 = c.a();
                    jnk.e = a3;
                    kaeVar = a3;
                }
            }
        }
        hvi a4 = knp.a(((jwx) obj).b(kaeVar, (jww) a2.b), jnaVar4);
        cay cayVar = new cay(this, epochMilli, 0);
        hvl hvlVar = this.d;
        hvi at = hoq.at(a4, cayVar, hvlVar);
        return hoq.ap(at, Exception.class, new bpm(this, epochMilli, at, 6), hvlVar);
    }

    public final hvi b(bpc bpcVar, String str, boolean z) {
        long epochMilli = Instant.now().toEpochMilli();
        try {
            jnd B = kt.B(bpcVar, str);
            kuq a2 = this.f.a(TimeUnit.SECONDS);
            jng jngVar = jng.a;
            jkj k = jngVar.k();
            if (!k.b.M()) {
                k.t();
            }
            jkp jkpVar = k.b;
            ((jng) jkpVar).c = z;
            String str2 = B.c;
            if (!jkpVar.M()) {
                k.t();
            }
            jng jngVar2 = (jng) k.b;
            str2.getClass();
            jngVar2.b = str2;
            jng jngVar3 = (jng) k.q();
            Object obj = a2.a;
            kae kaeVar = jnk.d;
            if (kaeVar == null) {
                synchronized (jnk.class) {
                    kaeVar = jnk.d;
                    if (kaeVar == null) {
                        kab c = kae.c();
                        c.c = kad.a;
                        c.d = kae.b("google.internal.identity.passbox.passbox.v1.PassboxExternalService", "DeleteCredential");
                        c.b();
                        jkd jkdVar = knl.a;
                        c.a = new knk(jngVar);
                        c.b = new knk(jnh.a);
                        kae a3 = c.a();
                        jnk.d = a3;
                        kaeVar = a3;
                    }
                }
            }
            hvi a4 = knp.a(((jwx) obj).b(kaeVar, (jww) a2.b), jngVar3);
            cay cayVar = new cay(this, epochMilli, 1);
            hvl hvlVar = this.d;
            hvi at = hoq.at(a4, cayVar, hvlVar);
            return hoq.ap(at, Exception.class, new bpm(this, epochMilli, at, 3), hvlVar);
        } catch (boz | bps e) {
            throw new cat("Could not create a passbox credential when deleting an OTP before making the gRPC call", e);
        }
    }

    public final hvi c(jni jniVar, final String str, final jmh jmhVar, final long j) {
        kuq a2 = this.f.a(TimeUnit.SECONDS);
        Object obj = a2.a;
        kae kaeVar = jnk.b;
        if (kaeVar == null) {
            synchronized (jnk.class) {
                kaeVar = jnk.b;
                if (kaeVar == null) {
                    kab c = kae.c();
                    c.c = kad.a;
                    c.d = kae.b("google.internal.identity.passbox.passbox.v1.PassboxExternalService", "ListCredentials");
                    c.b();
                    jni jniVar2 = jni.a;
                    jkd jkdVar = knl.a;
                    c.a = new knk(jniVar2);
                    c.b = new knk(jnj.a);
                    kaeVar = c.a();
                    jnk.b = kaeVar;
                }
            }
        }
        hvi a3 = knp.a(((jwx) obj).b(kaeVar, (jww) a2.b), jniVar);
        bwv bwvVar = new bwv(12);
        hvl hvlVar = this.c;
        final hvi at = hoq.at(a3, bwvVar, hvlVar);
        final hvi au = hoq.au(a3, new htr() { // from class: cav
            @Override // defpackage.htr
            public final hvi a(Object obj2) {
                String str2 = ((jnj) obj2).c;
                if (str2.isEmpty()) {
                    int i = hel.d;
                    return hnu.aJ(his.a);
                }
                jkj k = jni.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                String str3 = str;
                jkp jkpVar = k.b;
                str3.getClass();
                ((jni) jkpVar).c = str3;
                if (!jkpVar.M()) {
                    k.t();
                }
                jkp jkpVar2 = k.b;
                ((jni) jkpVar2).e = true;
                if (!jkpVar2.M()) {
                    k.t();
                }
                jni jniVar3 = (jni) k.b;
                str2.getClass();
                jniVar3.f = str2;
                jkj k2 = jnl.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                jkp jkpVar3 = k2.b;
                ((jnl) jkpVar3).c = 2;
                if (!jkpVar3.M()) {
                    k2.t();
                }
                jmh jmhVar2 = jmhVar;
                jnl jnlVar = (jnl) k2.b;
                jmhVar2.getClass();
                jnlVar.d = jmhVar2;
                jnlVar.b |= 1;
                jnl jnlVar2 = (jnl) k2.q();
                if (!k.b.M()) {
                    k.t();
                }
                long j2 = j;
                caz cazVar = caz.this;
                jni jniVar4 = (jni) k.b;
                jnlVar2.getClass();
                jniVar4.d = jnlVar2;
                jniVar4.b |= 1;
                return cazVar.c((jni) k.q(), str3, jmhVar2, j2);
            }
        }, hvlVar);
        return hnu.aY(at, au).a(gvx.i(new Callable() { // from class: caw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hel helVar = (hel) hnu.aR(at);
                hel helVar2 = (hel) hnu.aR(au);
                jkj k = hqs.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                long j2 = j;
                hqs hqsVar = (hqs) k.b;
                hqsVar.c = 1;
                hqsVar.b = 1 | hqsVar.b;
                long epochMilli = Instant.now().toEpochMilli() - j2;
                if (!k.b.M()) {
                    k.t();
                }
                caz cazVar = caz.this;
                jkp jkpVar = k.b;
                hqs hqsVar2 = (hqs) jkpVar;
                hqsVar2.b |= 8;
                hqsVar2.f = epochMilli;
                if (!jkpVar.M()) {
                    k.t();
                }
                String str2 = cazVar.e;
                bov bovVar = cazVar.b;
                hqs hqsVar3 = (hqs) k.b;
                str2.getClass();
                hqsVar3.b |= 64;
                hqsVar3.g = str2;
                bovVar.a((hqs) k.q());
                heg hegVar = new heg(4);
                hegVar.j(helVar);
                hegVar.j(helVar2);
                return hegVar.g();
            }
        }), this.d);
    }
}
