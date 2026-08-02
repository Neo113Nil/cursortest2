package defpackage;

import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.HashSet;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwv implements gzf {
    private final /* synthetic */ int a;

    public /* synthetic */ bwv(int i) {
        this.a = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        int i = 4;
        Long l = null;
        boolean z = true;
        char c = 1;
        switch (this.a) {
            case 0:
                return (fuf) hdb.c((List) obj).b(new bwt(c == true ? 1 : 0)).g();
            case 1:
                return hdb.c((hel) obj).d(new bqh(11)).e();
            case 2:
                ((hkf) ((hkf) ((hkf) bwz.c.g()).h((Exception) obj)).i("com/google/android/apps/authenticator2/main/dataservice/OtpSyncOnStartDataServiceImpl", "performOtpSyncingAndUpdateSyncingIcon", 99, "OtpSyncOnStartDataServiceImpl.java")).s("Could not set syncing icon");
                return null;
            case 3:
                return bxe.SUCCESSFUL;
            case 4:
                return bxe.SUCCESSFUL;
            case 5:
                bxe b = bxe.b(((bxd) obj).c);
                return b == null ? bxe.IN_PROGRESS : b;
            case 6:
                bpc bpcVar = (bpc) obj;
                return new byj(bpcVar.f(), bpcVar.g, true);
            case 7:
                return ((bpc) obj).g;
            case 8:
                jnd jndVar = (jnd) obj;
                if (jndVar == null) {
                    return gyf.a;
                }
                try {
                    jnf jnfVar = jndVar.e;
                    if (jnfVar == null) {
                        jnfVar = jnf.a;
                    }
                    jmh jmhVar = jnfVar.c;
                    if (jmhVar == null) {
                        jmhVar = jmh.a;
                    }
                    long a = jmx.a(jmhVar);
                    jne jneVar = jndVar.d;
                    if (jneVar == null) {
                        jneVar = jne.a;
                    }
                    jjq jjqVar = jneVar.b;
                    if (a != 0) {
                        l = Long.valueOf(a);
                    }
                    jnf jnfVar2 = jndVar.e;
                    if (jnfVar2 == null) {
                        jnfVar2 = jnf.a;
                    }
                    jmh jmhVar2 = jnfVar2.b;
                    if (jmhVar2 == null) {
                        jmhVar2 = jmh.a;
                    }
                    return gzp.h(bpc.c(jjqVar, l, jmx.a(jmhVar2)));
                } catch (boz | bps | jld e) {
                    ((hkf) ((hkf) ((hkf) caz.a.g()).h(e)).i("com/google/android/apps/authenticator2/passbox/PassboxServiceClientImpl", "listCredentialsRecursive", (char) 584, "PassboxServiceClientImpl.java")).s("One otp could not be created when iterating through passbox's list credential response.");
                    return gyf.a;
                }
            case 9:
                return (bpc) ((gzp) obj).b();
            case 10:
                HashSet hashSet = new HashSet();
                hel t = hel.t(hin.d(Comparator$EL.reversed(Comparator$CC.comparingLong(new cau()))), hdb.c((hel) obj).f());
                heg hegVar = new heg(4);
                int i2 = ((his) t).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    bpc bpcVar2 = (bpc) t.get(i3);
                    String str = bpcVar2.g;
                    if (!hashSet.contains(str)) {
                        hegVar.h(bpcVar2);
                        hashSet.add(str);
                    }
                }
                return hegVar.g();
            case 11:
                jnd jndVar2 = (jnd) obj;
                jnf jnfVar3 = jndVar2.e;
                if (jnfVar3 == null) {
                    jnfVar3 = jnf.a;
                }
                jmh jmhVar3 = jnfVar3.c;
                if (jmhVar3 == null) {
                    jmhVar3 = jmh.a;
                }
                long a2 = jmx.a(jmhVar3);
                try {
                    jne jneVar2 = jndVar2.d;
                    if (jneVar2 == null) {
                        jneVar2 = jne.a;
                    }
                    jjq jjqVar2 = jneVar2.b;
                    if (a2 != 0) {
                        l = Long.valueOf(a2);
                    }
                    jnf jnfVar4 = jndVar2.e;
                    if (jnfVar4 == null) {
                        jnfVar4 = jnf.a;
                    }
                    jmh jmhVar4 = jnfVar4.b;
                    if (jmhVar4 == null) {
                        jmhVar4 = jmh.a;
                    }
                    return gzp.h(bpc.c(jjqVar2, l, jmx.a(jmhVar4)));
                } catch (boz | bps | jld e2) {
                    ((hkf) ((hkf) ((hkf) caz.a.g()).h(e2)).i("com/google/android/apps/authenticator2/passbox/PassboxServiceClientImpl", "batchUpdateOtps", (char) 461, "PassboxServiceClientImpl.java")).s("Could not create an otp from a passbox credential during a batch update after making the gRPC call");
                    return gyf.a;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return hdb.c(((jnj) obj).b).d(new bwv(8)).b(new bwt(i)).d(new bwv(9)).e();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return (jnm) ((gzp) obj).b();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jkj C = ((cbf) obj).C();
                if (!C.b.M()) {
                    C.t();
                }
                cbf cbfVar = (cbf) C.b;
                cbfVar.b |= 1;
                cbfVar.c = true;
                return (cbf) C.q();
            case 15:
                return Boolean.valueOf(((cbf) obj).c);
            case 16:
                return Boolean.valueOf(((dfg) obj).c);
            case 17:
                dff b2 = dff.b(((dfg) obj).d);
                return b2 == null ? dff.UNKNOWN_DELAY : b2;
            case 18:
                return null;
            case 19:
                return null;
            default:
                double d = 1.0d;
                for (cjx cjxVar : (List) obj) {
                    z &= cjxVar.b();
                    d *= cjxVar.e;
                }
                return cjx.a(z, d);
        }
    }
}
