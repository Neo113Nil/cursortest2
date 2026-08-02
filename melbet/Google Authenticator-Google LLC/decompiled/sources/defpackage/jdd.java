package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdd {
    public final String a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public jdd(jdc jdcVar) {
        this.b = jdcVar.a;
        this.c = jdcVar.b;
        this.d = jdcVar.c;
        this.e = jdcVar.d;
        this.f = jdcVar.e;
        this.a = jdcVar.f;
        this.g = jdcVar.g;
        this.h = jdcVar.h;
        this.i = jdcVar.i;
        this.j = jdcVar.j;
        this.k = jdcVar.k;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public final dok a(Account account) {
        dok dokVar;
        synchronized (this.c) {
            ?? r8 = this.d;
            if (!r8.containsKey(account)) {
                Object obj = this.f;
                Pattern pattern = fav.a;
                fau fauVar = new fau((Context) obj);
                fauVar.a = "com.google.android.gms";
                Set set = fav.d;
                int i = 2;
                exf.o(set.contains("managed"), "The only supported locations are %s: %s", set, "managed");
                fauVar.b = "managed";
                fauVar.b("mdisync");
                fas.a(account);
                fauVar.c = account;
                fauVar.c("profilesync/public/profile_info.pb");
                Uri a = fauVar.a();
                Object obj2 = this.b;
                fcj a2 = fck.a();
                a2.b = new fcl((fcf) this.j);
                a2.c(dop.a);
                a2.d(a);
                bry bryVar = new bry(((fym) obj2).a(a2.a()), (char[]) null);
                fwm fwmVar = new fwm(this.e, this.k, (char[]) null);
                AtomicReference atomicReference = new AtomicReference(new dol());
                AtomicReference atomicReference2 = new AtomicReference(new dom());
                fwm fwmVar2 = new fwm((Context) obj, new cxl((Context) obj, new cxh(account, hsk.a)), account, new cud(atomicReference, 3), new cud(atomicReference2, 4));
                if (jtl.a.bB().b((Context) obj)) {
                    doe.a(((Context) obj).getApplicationContext());
                    hvi d = dih.d(((ddw) this.g).c());
                    cvr cvrVar = new cvr(20);
                    huf hufVar = huf.a;
                    gzp.h(hti.f(hti.f(d, cvrVar, hufVar), new cvr(11), hufVar));
                } else {
                    doe.a(((Context) obj).getApplicationContext());
                    account.toString();
                    gzp.h(new dod());
                }
                cud cudVar = new cud(this.h, i);
                new Random();
                doe.a(((Context) obj).getApplicationContext());
                hoq.v(cudVar);
                dok dokVar2 = new dok(fwmVar2, fwmVar, bryVar, new ehn(this, a));
                dokVar2.d(new don(this, a), huf.a);
                atomicReference.set(dokVar2);
                atomicReference2.set(dokVar2);
                r8.put(account, dokVar2);
            }
            dokVar = (dok) r8.get(account);
        }
        return dokVar;
    }

    public jdd(Context context, Executor executor, iyi iyiVar, fym fymVar, fwm fwmVar, dih dihVar, fcf fcfVar, ddw ddwVar) {
        this.c = new Object();
        this.d = new HashMap();
        this.f = context;
        this.e = executor;
        this.k = iyiVar;
        this.b = fymVar;
        this.h = fwmVar;
        this.i = dihVar;
        this.a = "OneGoogle";
        this.j = fcfVar;
        this.g = ddwVar;
    }
}
