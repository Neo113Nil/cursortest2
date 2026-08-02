package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cax implements htr {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cax(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.htr
    public final hvi a(Object obj) {
        int i = this.c;
        if (i == 0) {
            Object obj2 = this.b;
            jnd jndVar = (jnd) obj;
            try {
                jne jneVar = jndVar.d;
                if (jneVar == null) {
                    jneVar = jne.a;
                }
                jjq jjqVar = jneVar.b;
                jnf jnfVar = jndVar.e;
                if (jnfVar == null) {
                    jnfVar = jnf.a;
                }
                jmh jmhVar = jnfVar.b;
                if (jmhVar == null) {
                    jmhVar = jmh.a;
                }
                bpc c = bpc.c(jjqVar, null, jmx.a(jmhVar));
                bov bovVar = ((caz) obj2).b;
                jkj k = hqs.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                hqs hqsVar = (hqs) k.b;
                hqsVar.c = 5;
                hqsVar.b = 1 | hqsVar.b;
                long epochMilli = Instant.now().toEpochMilli() - this.a;
                if (!k.b.M()) {
                    k.t();
                }
                jkp jkpVar = k.b;
                hqs hqsVar2 = (hqs) jkpVar;
                hqsVar2.b |= 8;
                hqsVar2.f = epochMilli;
                String str = ((caz) obj2).e;
                if (!jkpVar.M()) {
                    k.t();
                }
                hqs hqsVar3 = (hqs) k.b;
                str.getClass();
                hqsVar3.b |= 64;
                hqsVar3.g = str;
                bovVar.a((hqs) k.q());
                return hnu.aJ(c);
            } catch (boz | bps | jld e) {
                throw new cat("Could not create an otp from a passbox credential when updating an OTP after making the gRPC call", e);
            }
        }
        if (i != 1) {
            return ((fuy) this.b).b(this.a, (fuz) obj);
        }
        Object obj3 = this.b;
        jnd jndVar2 = (jnd) obj;
        try {
            jne jneVar2 = jndVar2.d;
            if (jneVar2 == null) {
                jneVar2 = jne.a;
            }
            jjq jjqVar2 = jneVar2.b;
            jnf jnfVar2 = jndVar2.e;
            if (jnfVar2 == null) {
                jnfVar2 = jnf.a;
            }
            jmh jmhVar2 = jnfVar2.b;
            if (jmhVar2 == null) {
                jmhVar2 = jmh.a;
            }
            bpc c2 = bpc.c(jjqVar2, null, jmx.a(jmhVar2));
            bov bovVar2 = ((caz) obj3).b;
            jkj k2 = hqs.a.k();
            if (!k2.b.M()) {
                k2.t();
            }
            hqs hqsVar4 = (hqs) k2.b;
            hqsVar4.c = 3;
            hqsVar4.b = 1 | hqsVar4.b;
            long epochMilli2 = Instant.now().toEpochMilli() - this.a;
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar2 = k2.b;
            hqs hqsVar5 = (hqs) jkpVar2;
            hqsVar5.b |= 8;
            hqsVar5.f = epochMilli2;
            String str2 = ((caz) obj3).e;
            if (!jkpVar2.M()) {
                k2.t();
            }
            hqs hqsVar6 = (hqs) k2.b;
            str2.getClass();
            hqsVar6.b |= 64;
            hqsVar6.g = str2;
            bovVar2.a((hqs) k2.q());
            return hnu.aJ(c2);
        } catch (boz | bps | jld e2) {
            throw new cat("Could not create an otp from a passbox credential when adding an OTP after making the gRPC call", e2);
        }
    }
}
