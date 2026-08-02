package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dta extends kra implements krx {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dta(ary aryVar, avw avwVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.b = aryVar;
        this.c = avwVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((dta) c((kzd) obj, (kqj) obj2)).b(kow.a);
        }
        return ((dta) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019f, code lost:
    
        if (r14 != r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x025a, code lost:
    
        if (r14 == r0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0269, code lost:
    
        return r0;
     */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        kvm kvmVar;
        Object l;
        Object avbVar;
        int i = 2;
        int i2 = 1;
        if (this.e != 0) {
            kqp kqpVar = kqp.a;
            int i3 = this.a;
            ixc.Y(obj);
            if (i3 == 0) {
                kzd kzdVar = (kzd) this.d;
                ary aryVar = (ary) this.b;
                NetworkRequest a = aryVar.a();
                if (a == null) {
                    int i4 = aryVar.j;
                    if (i4 == 1) {
                        a = null;
                    } else {
                        NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                        if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                            int i5 = i4 - 1;
                            if (i5 == 2) {
                                removeCapability = removeCapability.addCapability(11);
                            } else if (i5 == 3) {
                                removeCapability = removeCapability.addCapability(18);
                            } else if (i5 == 4) {
                                removeCapability = removeCapability.addTransportType(0);
                            }
                            a = removeCapability.build();
                        } else {
                            a = removeCapability.addCapability(25).build();
                        }
                    }
                }
                if (a == null) {
                    kzdVar.b.u(null);
                    return kow.a;
                }
                avw avwVar = (avw) this.c;
                aes aesVar = new aes(ixg.i(kzdVar, null, 0, new alg(avwVar, kzdVar, (kqj) null, 2), 3), kzdVar, i);
                if (Build.VERSION.SDK_INT >= 30) {
                    avy avyVar = avy.a;
                    ConnectivityManager connectivityManager = avwVar.a;
                    synchronized (avy.b) {
                        if (avy.c.isEmpty()) {
                            asq.a();
                            String str = awa.a;
                            try {
                                connectivityManager.registerDefaultNetworkCallback(avy.a);
                            } catch (SecurityException e) {
                                asq.a().d(awa.a, "NetworkRequestConstraintController couldn't register callback", e);
                                aesVar.a(new avu(7));
                                avbVar = new aji(7);
                            }
                        } else if (avy.e && avy.f != null) {
                            asq.a();
                            String str2 = awa.a;
                            aesVar.a(avy.a.a(a, avy.d) ? avt.a : new avu(7));
                        }
                    }
                    avbVar = new awb(aesVar, connectivityManager, i2);
                } else {
                    Object obj2 = this.c;
                    avv avvVar = new avv(aesVar);
                    ksu ksuVar = new ksu();
                    ConnectivityManager connectivityManager2 = ((avw) obj2).a;
                    try {
                        asq.a();
                        String str3 = awa.a;
                        connectivityManager2.registerNetworkCallback(a, avvVar);
                        ksuVar.a = true;
                    } catch (SecurityException e2) {
                        asq.a().d(awa.a, "NetworkRequestConstraintController couldn't register callback", e2);
                        aesVar.a(new avu(7));
                    } catch (RuntimeException e3) {
                        String name = e3.getClass().getName();
                        name.getClass();
                        if (!name.endsWith("TooManyRequestsException")) {
                            throw e3;
                        }
                        asq.a();
                        String str4 = awa.a;
                        aesVar.a(new avu(7));
                    }
                    avbVar = new avb(ksuVar, connectivityManager2, avvVar, i);
                }
                aux auxVar = new aux(avbVar, i);
                this.a = 1;
                if (ixj.g(kzdVar, auxVar, this) == kqpVar) {
                    return kqpVar;
                }
            }
            return kow.a;
        }
        kqp kqpVar2 = kqp.a;
        int i6 = this.a;
        if (i6 == 0) {
            ixc.Y(obj);
            kvmVar = (kvm) this.d;
            Object obj3 = this.b;
            this.d = kvmVar;
            this.a = 1;
            dtd dtdVar = (dtd) obj3;
            obj = dtdVar.d(kpk.a, new dsv(dtdVar, null), this);
        } else {
            if (i6 != 1) {
                ixc.Y(obj);
                return new jfr(ixd.s((Iterable) obj));
            }
            kvmVar = (kvm) this.d;
            ixc.Y(obj);
        }
        List list = (List) obj;
        dtd dtdVar2 = (dtd) this.b;
        boolean f = jtp.a.bB().f((Context) dtdVar2.m.a);
        eht ehtVar = (eht) this.c;
        List k = ixc.k(ixc.m(ehtVar.b, ehtVar.a));
        ArrayList arrayList = new ArrayList(ixc.w(k));
        Iterator it = k.iterator();
        while (it.hasNext()) {
            arrayList.add(ixg.g(kvmVar, new dsz((ehs) it.next(), dtdVar2, list, f, null)));
        }
        this.d = null;
        this.a = 2;
        if (arrayList.isEmpty()) {
            l = kpk.a;
        } else {
            kuq kuqVar = new kuq((kvs[]) arrayList.toArray(new kvs[0]));
            kuw kuwVar = new kuw(ixe.d(this), 1);
            kuwVar.y();
            kvs[] kvsVarArr = (kvs[]) kuqVar.a;
            int length = kvsVarArr.length;
            kuo[] kuoVarArr = new kuo[length];
            for (int i7 = 0; i7 < length; i7++) {
                kvs kvsVar = kvsVarArr[i7];
                kvsVar.x();
                kuo kuoVar = new kuo(kuqVar, kuwVar);
                kuoVar.a = ixi.g(kvsVar, true, kuoVar);
                kuoVarArr[i7] = kuoVar;
            }
            kup kupVar = new kup(kuoVarArr);
            for (int i8 = 0; i8 < length; i8++) {
                kuoVarArr[i8].b.c(kupVar);
            }
            if (kuwVar.h()) {
                kupVar.a();
            } else {
                kuwVar.z(kupVar);
            }
            l = kuwVar.l();
        }
        obj = l;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.e;
        Object obj2 = this.b;
        if (i != 0) {
            dta dtaVar = new dta((ary) obj2, (avw) this.c, kqjVar, 1);
            dtaVar.d = obj;
            return dtaVar;
        }
        dta dtaVar2 = new dta((dtd) obj2, (eht) this.c, kqjVar, 0);
        dtaVar2.d = obj;
        return dtaVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dta(dtd dtdVar, eht ehtVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.b = dtdVar;
        this.c = ehtVar;
    }
}
