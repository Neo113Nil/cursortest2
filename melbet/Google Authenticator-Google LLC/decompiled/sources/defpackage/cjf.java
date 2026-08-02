package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjf {
    public final cje a;
    protected boolean b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public Set f;
    public String g;
    public String h;
    public final cjp i;
    public final hvi j;
    public boolean k;
    public final jll l;
    public djg m;
    public final jkl n;

    public cjf(cji cjiVar, jll jllVar) {
        jom jomVar;
        jkl jklVar = (jkl) jol.a.k();
        this.n = jklVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.k = false;
        this.a = cjiVar;
        this.h = cjiVar.g;
        this.g = cjiVar.e;
        cjm cjmVar = cjiVar.f.getApplicationContext() instanceof cjm ? (cjm) cjiVar.f.getApplicationContext() : (cjm) cjo.a.get();
        cjp a = cjmVar != null ? cjmVar.a() : null;
        if (a == null) {
            this.i = null;
        } else {
            jom jomVar2 = a.b;
            jom jomVar3 = jom.CPS_APP_PROCESS_GLOBAL_PROVIDER;
            if (jomVar2 == jomVar3 || jomVar2 == (jomVar = jom.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER)) {
                this.i = a;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + jomVar2.toString() + " is not one of the process-level expected values: " + String.valueOf(jomVar3) + " or " + String.valueOf(jomVar));
                this.i = null;
            }
        }
        this.j = cjmVar != null ? cjmVar.b() : null;
        long currentTimeMillis = System.currentTimeMillis();
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        jol jolVar = (jol) jklVar.b;
        jolVar.b |= 1;
        jolVar.c = currentTimeMillis;
        long j = ((jol) jklVar.b).c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long offset = TimeZone.getDefault().getOffset(j) / 1000;
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        jol jolVar2 = (jol) jklVar.b;
        jolVar2.b |= 131072;
        jolVar2.g = offset;
        if (djl.h(cjiVar.f)) {
            if (!jklVar.b.M()) {
                jklVar.t();
            }
            jol jolVar3 = (jol) jklVar.b;
            jolVar3.b |= 8388608;
            jolVar3.h = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime != 0) {
            if (!jklVar.b.M()) {
                jklVar.t();
            }
            jol jolVar4 = (jol) jklVar.b;
            jolVar4.b |= 2;
            jolVar4.d = elapsedRealtime;
        }
        this.l = jllVar;
    }

    public final void a(cjp cjpVar) {
        jkl jklVar = this.n;
        jon jonVar = ((jol) jklVar.b).m;
        if (jonVar == null) {
            jonVar = jon.a;
        }
        jkl jklVar2 = (jkl) jonVar.C();
        jom jomVar = cjpVar.b;
        if (!jklVar2.b.M()) {
            jklVar2.t();
        }
        jon jonVar2 = (jon) jklVar2.b;
        jonVar2.d = jomVar.l;
        jonVar2.b |= 2;
        joa joaVar = jonVar2.c;
        if (joaVar == null) {
            joaVar = joa.a;
        }
        jkj C = joaVar.C();
        jnz jnzVar = ((joa) C.b).c;
        if (jnzVar == null) {
            jnzVar = jnz.a;
        }
        int i = cjpVar.a;
        jkj C2 = jnzVar.C();
        if (!C2.b.M()) {
            C2.t();
        }
        jnz jnzVar2 = (jnz) C2.b;
        jnzVar2.b |= 1;
        jnzVar2.c = i;
        if (!C.b.M()) {
            C.t();
        }
        joa joaVar2 = (joa) C.b;
        jnz jnzVar3 = (jnz) C2.q();
        jnzVar3.getClass();
        joaVar2.c = jnzVar3;
        joaVar2.b |= 1;
        if (!jklVar2.b.M()) {
            jklVar2.t();
        }
        jon jonVar3 = (jon) jklVar2.b;
        joa joaVar3 = (joa) C.q();
        joaVar3.getClass();
        jonVar3.c = joaVar3;
        jonVar3.b |= 1;
        jon jonVar4 = (jon) jklVar2.q();
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        jol jolVar = (jol) jklVar.b;
        jonVar4.getClass();
        jolVar.m = jonVar4;
        jolVar.b |= 268435456;
    }

    public final ddi b() {
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.b = true;
        cji cjiVar = (cji) this.a;
        cjg cjgVar = cjiVar.p;
        ddw ddwVar = cjiVar.m;
        return cjgVar != null ? ddw.r(this, new bso(ddwVar, cjgVar, 2, null)) : ddw.r(this, new ccb(ddwVar, 3));
    }

    public final void c(String str) {
        if (this.a.c()) {
            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(str);
    }

    @Deprecated
    public final void d(djg djgVar) {
        if (jsy.a.bB().b(((cji) this.a).f)) {
            return;
        }
        this.m = djgVar;
    }

    public final void e(String str) {
        if (!this.a.i.a(cjz.ACCOUNT_NAME)) {
            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
        }
        this.g = str;
    }

    public final int f() {
        return this.a.k;
    }

    public final void g(int i) {
        jkl jklVar = this.n;
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        jol jolVar = (jol) jklVar.b;
        jol jolVar2 = jol.a;
        jolVar.b |= 32;
        jolVar.e = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.g);
        sb.append(", logSourceName: ");
        sb.append(this.h);
        sb.append(", qosTier: ");
        int f = f();
        int i = f - 1;
        if (f == 0) {
            throw null;
        }
        sb.append(i);
        sb.append(", veMessage: null, testCodes: null, mendelPackages: ");
        ArrayList arrayList = this.c;
        sb.append(arrayList != null ? cje.a(arrayList) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList2 = this.d;
        sb.append(arrayList2 != null ? cje.a(arrayList2) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList3 = this.e;
        sb.append(arrayList3 != null ? cje.a(arrayList3) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
