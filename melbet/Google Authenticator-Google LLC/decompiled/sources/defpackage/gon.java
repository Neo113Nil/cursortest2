package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import j$.lang.Iterable$EL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gon extends BroadcastReceiver implements gol {
    public static final hkh a = hkh.l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    public long b;
    public hvm c;
    private final Class d;
    private koe e;

    protected gon(Class cls) {
        this.d = cls;
    }

    public goo a(Object obj) {
        throw null;
    }

    @Override // defpackage.gol
    public final /* synthetic */ long b() {
        return -1L;
    }

    @Override // defpackage.gol
    public final /* synthetic */ long c() {
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
    
        r0 = r13.getPackageManager();
        r8 = defpackage.exi.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0188, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
    
        if (defpackage.exi.b != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018d, code lost:
    
        r9 = new android.content.Intent();
        r9.setPackage(r13.getPackageName());
        defpackage.exi.b = r0.queryBroadcastReceivers(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019f, code lost:
    
        r0 = defpackage.exi.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a1, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a2, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01aa, code lost:
    
        if (r0.hasNext() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ba, code lost:
    
        if (r4.equals(((android.content.pm.ResolveInfo) r0.next()).activityInfo.name) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c2, code lost:
    
        throw new defpackage.exh(r14);
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        ResolveInfo resolveInfo;
        String str;
        AutoCloseable gsgVar;
        hvi aI;
        String str2;
        if (context.getApplicationContext().getClass() == Application.class && (str2 = context.getApplicationInfo().className) != null && !Application.class.getName().equals(str2)) {
            Log.e("BroadcastError", "While attempting to launch " + getClass().getName() + " the Application class " + str2 + " was not created. This is known to happen with backup/restore operations. To avoid breaking an in-progress restore, this broadcast will be dropped and not processed.");
            return;
        }
        gom gomVar = (gom) hnu.bp(context, gom.class);
        gomVar.t();
        this.b = dih.s().toMillis();
        this.c = gomVar.l();
        this.e = gomVar.p();
        guc gucVar = gub.a;
        try {
            intent.hasExtra("foo");
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent(context, getClass()), 786432);
            guq guqVar = null;
            ResolveInfo resolveInfo2 = queryBroadcastReceivers.isEmpty() ? null : queryBroadcastReceivers.get(0);
            try {
                String name = getClass().getName();
                if (resolveInfo2 == null) {
                    resolveInfo = null;
                } else {
                    if (!name.equals(resolveInfo2.activityInfo.name)) {
                        throw new IllegalArgumentException("ResolveInfo did not match receiver name: " + String.valueOf(getClass()) + " != " + resolveInfo2.activityInfo.name);
                    }
                    resolveInfo = resolveInfo2;
                }
                if (resolveInfo != null && resolveInfo.activityInfo.exported) {
                    PackageManager packageManager = context.getPackageManager();
                    Intent cloneFilter = intent.setComponent(null).cloneFilter();
                    cloneFilter.setSelector(null);
                    cloneFilter.setPackage(context.getPackageName());
                    Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(cloneFilter, Build.VERSION.SDK_INT >= 29 ? 269221952 : 786496).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it.next();
                        if (name.equals(next.activityInfo.name)) {
                            IntentFilter intentFilter = next.filter;
                            intentFilter.getClass();
                            if (!intentFilter.matchAction(intent.getAction())) {
                                throw new exh(intent);
                            }
                            if (intentFilter.matchCategories(intent.getCategories()) != null) {
                                throw new exh(intent);
                            }
                            String type = intent.getType();
                            int matchData = intentFilter.matchData(type, intent.getScheme(), intent.getData());
                            if (matchData == -2) {
                                throw new exh(intent);
                            }
                            if (matchData == -1) {
                                if (type != null) {
                                    throw new exh(intent);
                                }
                                int matchData2 = intentFilter.matchData(intent.resolveType(context), intent.getScheme(), intent.getData());
                                if (matchData2 == -1 || matchData2 == -2) {
                                    throw new exh(intent);
                                }
                            }
                        }
                    }
                }
                try {
                    cka x = gomVar.x();
                    context.getClass();
                    intent.getClass();
                    if (resolveInfo2 != null) {
                        str = getClass().getName();
                        str.getClass();
                    } else {
                        str = "anonymous";
                    }
                    String str3 = "Broadcast to " + str + (intent.getAction() != null ? " ".concat(String.valueOf(intent.getAction())) : "");
                    long j = gvx.a;
                    guq m = gvx.m(intent, false);
                    int i = 4;
                    if (m != null) {
                        gsgVar = new gsf(cka.l(str3), (Object) gta.f(m), 4);
                    } else {
                        if (fao.g() && !gta.u()) {
                            guqVar = gta.e();
                        }
                        if (guqVar != null) {
                            gta.f(guqVar);
                            gsgVar = new gsf(cka.l(str3), (Object) guqVar, 5);
                        } else {
                            gsgVar = new gsg((Object) ((gva) x.a).a(221, str3), i);
                        }
                    }
                    try {
                        isOrderedBroadcast();
                        gty aC = hoq.aC(203, "getEntryPoint");
                        try {
                            try {
                                aI = hnu.aJ(hnu.bp(context, this.d));
                            } catch (IllegalStateException e) {
                                aI = hnu.aI(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
                            }
                            aC.b(aI);
                            aC.close();
                            getResultCode();
                            gty aB = hoq.aB(204, "handleBroadcast", gucVar, true);
                            try {
                                Iterable$EL.forEach((Set) ((jrx) this.e).a, new ges(2));
                                hvi g = hti.g(aI, gvx.c(new gja(this, intent, 3)), huf.a);
                                aB.b(g);
                                aB.close();
                                if (!g.isDone()) {
                                    BroadcastReceiver.PendingResult goAsync = goAsync();
                                    goAsync.getClass();
                                    g.c(gvx.h(new gfm(goAsync, 10)), huf.a);
                                }
                                g.c(gvx.h(new gfm(g, 8)), huf.a);
                                gsgVar.close();
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    hag.b(th);
                    throw new RuntimeException(th);
                }
            } catch (exh e2) {
                ((hkf) ((hkf) ((hkf) a.f()).h(e2)).i("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "onReceive", 137, "IntentFilterAcledReceiver.java")).u("Got unexpected intent: %s", intent);
            }
        } catch (Throwable th2) {
            ((hkf) ((hkf) ((hkf) a.f()).h(th2)).i("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "onReceive", 'y', "IntentFilterAcledReceiver.java")).s("Got invalid intent");
        }
    }
}
