package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbh implements jrw {
    private final /* synthetic */ int a;

    public cbh(int i) {
        this.a = i;
    }

    public static final cfr a() {
        cgx cgxVar = new cgx();
        HashMap hashMap = new HashMap();
        ccn ccnVar = ccn.a;
        cfo a = cfp.a();
        a.b(30000L);
        a.d();
        hashMap.put(ccnVar, a.a());
        ccn ccnVar2 = ccn.c;
        cfo a2 = cfp.a();
        a2.b(1000L);
        a2.d();
        hashMap.put(ccnVar2, a2.a());
        ccn ccnVar3 = ccn.b;
        cfo a3 = cfp.a();
        a3.b(86400000L);
        a3.d();
        a3.c(DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(cfq.b))));
        hashMap.put(ccnVar3, a3.a());
        if (hashMap.keySet().size() < ccn.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new cfr(cgxVar, hashMap);
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                return "AUTHENTICATOR_ANDROID_PRIMES";
            case 1:
                jnn jnnVar = jnn.l;
                if (jnnVar == null) {
                    throw new NullPointerException("Null rpcServiceConfig");
                }
                goq goqVar = new goq(jnnVar);
                hoq.K(true, "Host string is invalid: %s", null);
                return goqVar;
            case 2:
                return new kt(null);
            case 3:
                return new pl(Executors.newSingleThreadExecutor(), 4);
            case 4:
                throw null;
            case 5:
                return new csp();
            case 6:
                return new csp();
            case 7:
                return new dih();
            case 8:
                return new dih();
            case 9:
                Integer num = 10;
                num.getClass();
                return new dhy(10);
            case 10:
                Integer num2 = 11;
                num2.getClass();
                return new dhy(11);
            case 11:
                Integer num3 = 0;
                num3.getClass();
                return new dhy(0);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                dhe dheVar = dhe.a;
                dheVar.getClass();
                return dheVar;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return false;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new HashSet();
            case 15:
                hln hlnVar = dlz.a;
                return new dih();
            case 16:
                return ecm.a;
            case 17:
                return new eiw();
            case 18:
                return new fwm((byte[]) null, (byte[]) null);
            case 19:
                return new eom();
            default:
                return true;
        }
    }
}
