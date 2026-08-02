package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.google.android.apps.authenticator2.loginrequirement.LoginRequirementActivity;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bso implements gzf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bso(String str, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v74, types: [gzf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, jll] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        cjx cjxVar;
        String valueOf;
        String str;
        int i = 0;
        switch (this.c) {
            case 0:
                boolean z = ((btj) obj).c;
                Object obj2 = this.a;
                if (!z) {
                    return new fue(false, true, new Intent(((bss) obj2).b, (Class<?>) LoginRequirementActivity.class));
                }
                ((bss) obj2).c = (frv) this.b;
                return fue.a();
            case 1:
                ((cji) obj).h(this.b, djg.a(((bow) this.a).a, new hqr())).b();
                return null;
            case 2:
                cjf cjfVar = (cjf) obj;
                hvi a = ((cjg) this.a).a(new cjw(Instant.ofEpochMilli(((jol) cjfVar.n.b).c)));
                boolean p = ddw.p(a);
                Object obj3 = this.b;
                if (!p) {
                    return dja.a(a).a(huf.a, new cke(obj3, cjfVar, i));
                }
                try {
                    cjxVar = (cjx) a.n(a);
                } catch (ExecutionException unused) {
                    cjxVar = cjx.b;
                }
                return ((ddw) obj3).o(cjfVar, cjxVar);
            case 3:
                leg legVar = (leg) ((hel) this.b).get(0);
                while (true) {
                    Object obj4 = this.a;
                    if (!((SharedPreferences) ((eny) obj4).d.b()).edit().putString("lastExitProcessName", legVar.c).putLong("lastExitTimestamp", legVar.g).commit()) {
                        i++;
                        if (i >= 3) {
                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 220, "ApplicationExitMetricServiceImpl.java")).s("Failed to persist most recent App Exit");
                        }
                    }
                }
                return null;
            case 4:
                jkl jklVar = (jkl) ((esd) obj).C();
                if (!jklVar.b.M()) {
                    jklVar.t();
                }
                Object obj5 = this.b;
                Object obj6 = this.a;
                esd esdVar = (esd) jklVar.b;
                obj5.getClass();
                esdVar.c = (lgv) obj5;
                esdVar.b |= 1;
                esd esdVar2 = (esd) jklVar.q();
                gka gkaVar = (gka) obj6;
                String[] strArr = {gkaVar.b.getClass().getName()};
                Intent intent = new Intent();
                Context context = (Context) gkaVar.c;
                intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
                intent.setPackage(context.getPackageName());
                intent.putExtra("Transmitters", strArr);
                intent.putExtra("MetricSnapshot", esdVar2.f());
                context.sendBroadcast(intent);
                return null;
            case 5:
                String str2 = (String) obj;
                String str3 = ((cjf) this.a).g;
                return ldt.j(str3, str2, (byte[]) ((ldt) ((bry) this.b).a).e.get(new gzq(str2, str3)));
            case 6:
                euk eukVar = (euk) obj;
                int i2 = evo.a;
                Object obj7 = this.a;
                euj eujVar = euj.a;
                obj7.getClass();
                euj eujVar2 = (euj) eukVar.b.get(obj7);
                if (eujVar2 != null) {
                    eujVar = eujVar2;
                }
                Object obj8 = this.b;
                jkj C = eujVar.C();
                if (!DesugarCollections.unmodifiableList(((euj) C.b).c).contains(obj8)) {
                    C.z((String) obj8);
                }
                jkj C2 = eukVar.C();
                if (!C.b.M()) {
                    C.t();
                }
                euj eujVar3 = (euj) C.b;
                eujVar3.b = 1 | eujVar3.b;
                eujVar3.d = (String) obj8;
                C2.A((String) obj7, (euj) C.q());
                return (euk) C2.q();
            case 7:
                Uri uri = (Uri) obj;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                intentFilter.addDataScheme(uri.getScheme());
                intentFilter.addDataPath(uri.getPath(), 0);
                int i3 = hpe.a;
                intentFilter.addDataPath(uri.buildUpon().path(hpl.a.b(uri.getPath(), StandardCharsets.UTF_8).toString()).build().getPath(), 0);
                intentFilter.addDataAuthority("*", null);
                ?? r0 = this.b;
                fcd fcdVar = new fcd(r0);
                Object obj9 = this.a;
                if (Build.VERSION.SDK_INT >= 33) {
                    fcf fcfVar = (fcf) obj9;
                    fcfVar.b.registerReceiver(fcdVar, intentFilter, fcfVar.d, fcfVar.e, 2);
                } else {
                    fcf fcfVar2 = (fcf) obj9;
                    fcfVar2.b.registerReceiver(fcdVar, intentFilter, fcfVar2.d, fcfVar2.e);
                }
                synchronized (((fcf) obj9).i) {
                    ((fcf) obj9).h.n(uri, r0);
                }
                return null;
            case 8:
                fuf fufVar = (fuf) obj;
                frv frvVar = fufVar.a;
                ful fulVar = fufVar.b;
                fue fueVar = (fue) this.b;
                hoq.I(fueVar.a, "Trying to propagate AccountInfo for invalid account.");
                return new fry(frvVar, fulVar, fueVar, null, (frx) this.a);
            case 9:
                Object obj10 = this.a;
                Object obj11 = this.b;
                gty aC = hoq.aC(90, "AccountUiService useAccount");
                try {
                    fry fryVar = new fry((frv) obj10, ful.a, null, null, (frx) obj11);
                    aC.close();
                    return fryVar;
                } finally {
                }
            case 10:
                hel helVar = (hel) obj;
                int size = helVar.size();
                while (i < size) {
                    Object obj12 = this.a;
                    Object obj13 = this.b;
                    ful fulVar2 = (ful) helVar.get(i);
                    hoq.N(((String) obj13).equals(fulVar2.k), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", obj12, obj13, fulVar2.k);
                    i++;
                }
                return helVar;
            case 11:
                Iterator it = DesugarCollections.unmodifiableMap(((fxd) obj).d).values().iterator();
                while (true) {
                    Object obj14 = this.a;
                    if (!it.hasNext()) {
                        throw new fvb("No account is found for ".concat((String) obj14));
                    }
                    fxf fxfVar = (fxf) it.next();
                    ful fulVar3 = fxfVar.d;
                    if (fulVar3 == null) {
                        fulVar3 = ful.a;
                    }
                    if (fulVar3.k.equals(obj14)) {
                        ful fulVar4 = fxfVar.d;
                        if (fulVar4 == null) {
                            fulVar4 = ful.a;
                        }
                        if (fulVar4.c.equals(this.b)) {
                            return frv.a(fxfVar.c);
                        }
                    }
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                fwt fwtVar = (fwt) this.a.a((fxd) obj);
                ((AtomicReference) this.b).set(fwtVar.a);
                return fwtVar.b;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                her herVar = (her) obj;
                hoq.I(hfm.n(this.b).equals(herVar.keySet()), "EligibilityMapper returned different accounts from the original list");
                return gdm.a(herVar, Instant.ofEpochMilli(((Long) ((gzp) this.a).b()).longValue()));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (((Boolean) obj).booleanValue()) {
                    Object obj15 = this.a;
                    Object obj16 = this.b;
                    String b = gcv.b((WorkerParameters) obj15);
                    gka gkaVar2 = (gka) obj16;
                    iwq iwqVar = (iwq) ((gzs) gkaVar2.b).a.b();
                    ikj ikjVar = (ikj) gkaVar2.c;
                    iwqVar.e((String) ikjVar.b, (String) ikjVar.a, b, "attempt");
                }
                return null;
            case 15:
                hrz hrzVar = (hrz) this.b;
                hrzVar.e();
                ((gfo) this.a).c(hrzVar);
                return null;
            case 16:
                Throwable th = (Throwable) obj;
                boolean z2 = th instanceof CancellationException;
                Object obj17 = this.b;
                Object obj18 = this.a;
                if (z2) {
                    throw ((CancellationException) th);
                }
                try {
                    ((hrz) obj17).e();
                    ((gfo) obj18).c((hrz) obj17);
                    return null;
                } catch (NullPointerException e) {
                    ((hkf) ((hkf) ((hkf) gfo.a.f()).h(e)).i("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater", "appendLoadCompletion", (char) 334, "LocalSubscriptionMixinUpdater.java")).s("LocalSubscriptionMixinUpdater silently ignored NullPointerException");
                    throw e;
                }
            case 17:
                ggc ggcVar = (ggc) obj;
                Object obj19 = this.b;
                if (ggcVar == gge.a) {
                    return new AbstractMap.SimpleEntry(obj19, ggcVar);
                }
                Object obj20 = this.a;
                gga ggaVar = ggcVar.b;
                hel helVar2 = ((ggg) obj20).a;
                int i4 = ((his) helVar2).c;
                while (i < i4) {
                    gga ggaVar2 = (gga) helVar2.get(i);
                    i++;
                    if (ggaVar2 == ggaVar) {
                        int ordinal = ggaVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    valueOf = String.valueOf(obj19);
                                    str = ".html";
                                } else if (ordinal == 3) {
                                    valueOf = String.valueOf(obj19);
                                    str = ".bin";
                                } else {
                                    if (ordinal != 4) {
                                        throw new RuntimeException(null, null);
                                    }
                                    valueOf = String.valueOf(obj19);
                                    str = ".binarypb";
                                }
                                obj19 = valueOf.concat(str);
                            } else {
                                obj19 = String.valueOf(obj19).concat(".txt");
                            }
                        }
                        return new AbstractMap.SimpleEntry(obj19, ggcVar);
                    }
                }
                throw new IllegalArgumentException("Got unexpected DataType");
            case 18:
                fuf fufVar2 = (fuf) obj;
                ful fulVar5 = fufVar2.b;
                if (fulVar5.k.equals("pseudonymous")) {
                    return new idf(null, "pseudonymous");
                }
                if (fulVar5.k.equals("incognito")) {
                    return new idf(null, "incognito");
                }
                if (fulVar5.k.equals("google")) {
                    Object obj21 = this.b;
                    Object obj22 = this.a;
                    hoq.M(((String) ((gzs) obj21).a).equals(fulVar5.k), "OAuth authentication failed because account type did not match the @GcoreAccountType that was bound, @GcoreAccountType: %s, account: %s", fufVar2, obj21);
                    String b2 = ((fwm) obj22).b(fulVar5);
                    if (b2 != null) {
                        return new idf(b2, "google");
                    }
                    throw new IllegalStateException("Attempting to get context for unrecognized account type: ".concat(String.valueOf(fulVar5.k)));
                }
                String str4 = fulVar5.d;
                String str5 = fulVar5.k;
                int length = str5.length();
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        int codePointAt = str5.codePointAt(i5);
                        if (Character.isWhitespace(codePointAt)) {
                            i5 += Character.charCount(codePointAt);
                        }
                    } else {
                        i = 1;
                    }
                }
                hoq.y(i ^ 1, "Custom AuthContext type must not be empty");
                hoq.C(!str5.equals("google"), "Custom AuthContext type must not be '%s'", "google");
                hoq.C(!str5.equals("pseudonymous"), "Custom AuthContext type must not be '%s'", "pseudonymous");
                hoq.C(!str5.equals("incognito"), "Custom AuthContext type must not be '%s'", "incognito");
                return new idf(str4, str5);
            default:
                return ((jwx) obj).b((kae) this.b, (jww) this.a);
        }
    }

    public /* synthetic */ bso(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ bso(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bso(String str, int i, byte[] bArr) {
        this.c = i;
        this.a = "google";
        this.b = str;
    }
}
