package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.apps.authenticator2.Authenticator_Application;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auy extends atd {
    public static final Object a;
    private static auy m;
    private static auy n;
    public Context b;
    public arv c;
    public WorkDatabase d;
    public List e;
    public atx f;
    public boolean g = false;
    public BroadcastReceiver.PendingResult h;
    public volatile azh i;
    public final cfz j;
    public ldt k;
    public brn l;
    private final kvm o;

    static {
        asq.b("WorkManagerImpl");
        m = null;
        n = null;
        a = new Object();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kvm] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public auy(Context context, final arv arvVar, ldt ldtVar, WorkDatabase workDatabase, final List list, atx atxVar, cfz cfzVar) {
        boolean isDeviceProtectedStorage;
        Context applicationContext = context.getApplicationContext();
        isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
        if (isDeviceProtectedStorage) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        asq asqVar = new asq(arvVar.j);
        synchronized (asq.a) {
            if (asq.b == null) {
                asq.b = asqVar;
            }
        }
        this.b = applicationContext;
        this.k = ldtVar;
        this.d = workDatabase;
        this.f = atxVar;
        this.j = cfzVar;
        this.c = arvVar;
        this.e = list;
        ?? r10 = ldtVar.a;
        this.o = r10;
        final WorkDatabase workDatabase2 = this.d;
        this.l = new brn(workDatabase2, (byte[]) null);
        atx atxVar2 = this.f;
        final ?? r7 = ldtVar.e;
        int i = aub.a;
        atxVar2.c(new atm() { // from class: aua
            @Override // defpackage.atm
            public final void a(axl axlVar, boolean z) {
                int i2 = aub.a;
                r7.execute(new fv(workDatabase2, axlVar, list, arvVar, 4));
            }
        });
        this.k.r(new ayj(applicationContext, this));
        Context context2 = this.b;
        String str = aui.a;
        r10.getClass();
        context2.getClass();
        if (ayn.a(context2, arvVar)) {
            kzq l = workDatabase.C().l();
            new aug(null);
            ixg.i(r10, null, 0, new aki(new kni(kzt.a(ixj.e(new azc(l, 4))), new auh(context2, null), 4), (kqj) null, 19), 3);
        }
    }

    public static auy i(Context context) {
        auy auyVar;
        Object obj = a;
        synchronized (obj) {
            synchronized (obj) {
                auyVar = m;
                if (auyVar == null) {
                    auyVar = n;
                }
            }
            return auyVar;
        }
        if (auyVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Authenticator_Application)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            Authenticator_Application authenticator_Application = (Authenticator_Application) applicationContext;
            AutoCloseable gswVar = !hoq.aI() ? new gsw(7) : ((gva) ((gbt) imq.a(authenticator_Application, gbt.class)).z().a).f("getWorkManagerConfiguration", 266);
            try {
                arv a2 = ((gbt) imq.a(authenticator_Application, gbt.class)).a();
                gswVar.close();
                j(applicationContext, a2);
                auyVar = i(applicationContext);
            } finally {
            }
        }
        return auyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r1 = r28.getApplicationContext();
        r0 = defpackage.auy.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r0 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r1.getClass();
        r29.getClass();
        r3 = new defpackage.ldt(r29.c);
        r0 = r1.getApplicationContext();
        r0.getClass();
        r4 = r3.e;
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r1.getResources().getBoolean(com.google.android.apps.authenticator2.R.bool.workmanager_test_configuration) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r9 = new defpackage.aju(r0, androidx.work.impl.WorkDatabase.class, null);
        r9.i = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04e2, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01f8, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04ea, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04f2, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01b0, code lost:
    
        r19 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        r9.f = r4;
        r4 = new defpackage.atk();
        r15 = r9.d;
        r15.add(r4);
        r9.a(defpackage.atr.c);
        r9.a(new defpackage.aty(r0, 2, 3));
        r9.a(defpackage.ats.c);
        r9.a(defpackage.att.c);
        r9.a(new defpackage.aty(r0, 5, 6));
        r9.a(defpackage.atu.c);
        r9.a(defpackage.atv.c);
        r9.a(defpackage.atw.c);
        r9.a(new defpackage.auz(r0));
        r9.a(new defpackage.aty(r0, 10, 11));
        r9.a(defpackage.atn.c);
        r9.a(defpackage.ato.c);
        r9.a(defpackage.atp.c);
        r9.a(defpackage.atq.c);
        r9.a(new defpackage.aty(r0, 21, 22));
        r9.m = false;
        r9.n = true;
        r9.o = true;
        r0 = r9.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a3, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0139, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x013d, code lost:
    
        if (r9.g != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x013f, code lost:
    
        r9.g = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0142, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0144, code lost:
    
        r9.f = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x005a, code lost:
    
        if (defpackage.ksp.n("androidx.work.workdb") != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012a, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0062, code lost:
    
        if (defpackage.ksp.b("androidx.work.workdb", ":memory:") != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0064, code lost:
    
        r10 = new defpackage.aju(r0, androidx.work.impl.WorkDatabase.class, "androidx.work.workdb");
        r10.h = new defpackage.auk(r0);
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04fa, code lost:
    
        throw new java.lang.IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0502, code lost:
    
        throw new java.lang.IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x012e, code lost:
    
        if (r9.g != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0130, code lost:
    
        r9.g = defpackage.op.a;
        r9.f = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0148, code lost:
    
        r0 = r9.k;
        r4 = r9.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0150, code lost:
    
        if (r0.isEmpty() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0152, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015a, code lost:
    
        if (r0.hasNext() == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015c, code lost:
    
        r5 = ((java.lang.Number) r0.next()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016e, code lost:
    
        if (r4.contains(java.lang.Integer.valueOf(r5)) != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x017c, code lost:
    
        throw new java.lang.IllegalArgumentException(defpackage.a.Y(r5, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017d, code lost:
    
        r0 = r9.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017f, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
    
        r0 = new defpackage.amx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0186, code lost:
    
        r13 = r0;
        r11 = r9.b;
        r12 = r9.c;
        r14 = r9.p;
        r0 = r9.i;
        r5 = r11.getSystemService("activity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019e, code lost:
    
        if ((r5 instanceof android.app.ActivityManager) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        r5 = (android.app.ActivityManager) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ab, code lost:
    
        if (r5.isLowRamDevice() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ad, code lost:
    
        r19 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b2, code lost:
    
        r5 = r9.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b4, code lost:
    
        if (r5 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b6, code lost:
    
        r6 = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b8, code lost:
    
        if (r6 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ba, code lost:
    
        r0 = 0;
        r10 = new defpackage.ajd(r11, r12, r13, r14, r15, r0, r19, r5, r6, r9.m, r9.n, r4, r9.e, r9.l, r9.o);
        r10.n = true;
        r5 = (defpackage.ajw) defpackage.aei.e(defpackage.ixf.f(r9.a));
        r5.h = r10.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f3, code lost:
    
        r6 = r5.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040e A[Catch: all -> 0x0507, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:13:0x0018, B:15:0x0020, B:17:0x0048, B:18:0x0071, B:20:0x012c, B:22:0x0130, B:23:0x0148, B:25:0x0152, B:26:0x0156, B:28:0x015c, B:32:0x0171, B:33:0x017c, B:35:0x017d, B:37:0x0181, B:38:0x0186, B:40:0x01a0, B:42:0x01a7, B:45:0x01b2, B:47:0x01b6, B:49:0x01ba, B:51:0x01f3, B:53:0x01fc, B:54:0x021a, B:55:0x0237, B:57:0x023e, B:59:0x024b, B:66:0x0257, B:68:0x0266, B:70:0x026f, B:71:0x028e, B:73:0x028f, B:76:0x02a3, B:77:0x02ab, B:79:0x02b1, B:81:0x02c9, B:83:0x02d1, B:84:0x02d3, B:87:0x02df, B:93:0x02e3, B:94:0x02f7, B:96:0x02fd, B:97:0x0313, B:99:0x0319, B:101:0x0326, B:114:0x0334, B:109:0x0346, B:111:0x0358, B:112:0x0383, B:118:0x0384, B:121:0x0399, B:123:0x03aa, B:124:0x03b1, B:126:0x03c8, B:127:0x03cf, B:129:0x03d7, B:130:0x03de, B:132:0x03ed, B:133:0x03f4, B:136:0x040a, B:138:0x040e, B:140:0x0412, B:141:0x0419, B:144:0x042f, B:146:0x0433, B:147:0x04b9, B:148:0x0420, B:150:0x0424, B:152:0x0428, B:155:0x04ba, B:156:0x03fb, B:158:0x03ff, B:160:0x0403, B:163:0x038f, B:169:0x04bb, B:170:0x04da, B:171:0x0297, B:173:0x029b, B:179:0x04db, B:180:0x04e2, B:182:0x020d, B:185:0x04e3, B:186:0x04ea, B:187:0x04eb, B:188:0x04f2, B:192:0x013b, B:194:0x013f, B:196:0x0144, B:197:0x0052, B:199:0x005c, B:201:0x0064, B:202:0x04f3, B:203:0x04fa, B:204:0x04fb, B:205:0x0502, B:206:0x0503, B:207:0x0505), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0433 A[Catch: all -> 0x0507, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:13:0x0018, B:15:0x0020, B:17:0x0048, B:18:0x0071, B:20:0x012c, B:22:0x0130, B:23:0x0148, B:25:0x0152, B:26:0x0156, B:28:0x015c, B:32:0x0171, B:33:0x017c, B:35:0x017d, B:37:0x0181, B:38:0x0186, B:40:0x01a0, B:42:0x01a7, B:45:0x01b2, B:47:0x01b6, B:49:0x01ba, B:51:0x01f3, B:53:0x01fc, B:54:0x021a, B:55:0x0237, B:57:0x023e, B:59:0x024b, B:66:0x0257, B:68:0x0266, B:70:0x026f, B:71:0x028e, B:73:0x028f, B:76:0x02a3, B:77:0x02ab, B:79:0x02b1, B:81:0x02c9, B:83:0x02d1, B:84:0x02d3, B:87:0x02df, B:93:0x02e3, B:94:0x02f7, B:96:0x02fd, B:97:0x0313, B:99:0x0319, B:101:0x0326, B:114:0x0334, B:109:0x0346, B:111:0x0358, B:112:0x0383, B:118:0x0384, B:121:0x0399, B:123:0x03aa, B:124:0x03b1, B:126:0x03c8, B:127:0x03cf, B:129:0x03d7, B:130:0x03de, B:132:0x03ed, B:133:0x03f4, B:136:0x040a, B:138:0x040e, B:140:0x0412, B:141:0x0419, B:144:0x042f, B:146:0x0433, B:147:0x04b9, B:148:0x0420, B:150:0x0424, B:152:0x0428, B:155:0x04ba, B:156:0x03fb, B:158:0x03ff, B:160:0x0403, B:163:0x038f, B:169:0x04bb, B:170:0x04da, B:171:0x0297, B:173:0x029b, B:179:0x04db, B:180:0x04e2, B:182:0x020d, B:185:0x04e3, B:186:0x04ea, B:187:0x04eb, B:188:0x04f2, B:192:0x013b, B:194:0x013f, B:196:0x0144, B:197:0x0052, B:199:0x005c, B:201:0x0064, B:202:0x04f3, B:203:0x04fa, B:204:0x04fb, B:205:0x0502, B:206:0x0503, B:207:0x0505), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04b9 A[Catch: all -> 0x0507, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:13:0x0018, B:15:0x0020, B:17:0x0048, B:18:0x0071, B:20:0x012c, B:22:0x0130, B:23:0x0148, B:25:0x0152, B:26:0x0156, B:28:0x015c, B:32:0x0171, B:33:0x017c, B:35:0x017d, B:37:0x0181, B:38:0x0186, B:40:0x01a0, B:42:0x01a7, B:45:0x01b2, B:47:0x01b6, B:49:0x01ba, B:51:0x01f3, B:53:0x01fc, B:54:0x021a, B:55:0x0237, B:57:0x023e, B:59:0x024b, B:66:0x0257, B:68:0x0266, B:70:0x026f, B:71:0x028e, B:73:0x028f, B:76:0x02a3, B:77:0x02ab, B:79:0x02b1, B:81:0x02c9, B:83:0x02d1, B:84:0x02d3, B:87:0x02df, B:93:0x02e3, B:94:0x02f7, B:96:0x02fd, B:97:0x0313, B:99:0x0319, B:101:0x0326, B:114:0x0334, B:109:0x0346, B:111:0x0358, B:112:0x0383, B:118:0x0384, B:121:0x0399, B:123:0x03aa, B:124:0x03b1, B:126:0x03c8, B:127:0x03cf, B:129:0x03d7, B:130:0x03de, B:132:0x03ed, B:133:0x03f4, B:136:0x040a, B:138:0x040e, B:140:0x0412, B:141:0x0419, B:144:0x042f, B:146:0x0433, B:147:0x04b9, B:148:0x0420, B:150:0x0424, B:152:0x0428, B:155:0x04ba, B:156:0x03fb, B:158:0x03ff, B:160:0x0403, B:163:0x038f, B:169:0x04bb, B:170:0x04da, B:171:0x0297, B:173:0x029b, B:179:0x04db, B:180:0x04e2, B:182:0x020d, B:185:0x04e3, B:186:0x04ea, B:187:0x04eb, B:188:0x04f2, B:192:0x013b, B:194:0x013f, B:196:0x0144, B:197:0x0052, B:199:0x005c, B:201:0x0064, B:202:0x04f3, B:203:0x04fa, B:204:0x04fb, B:205:0x0502, B:206:0x0503, B:207:0x0505), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ba A[Catch: all -> 0x0507, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:13:0x0018, B:15:0x0020, B:17:0x0048, B:18:0x0071, B:20:0x012c, B:22:0x0130, B:23:0x0148, B:25:0x0152, B:26:0x0156, B:28:0x015c, B:32:0x0171, B:33:0x017c, B:35:0x017d, B:37:0x0181, B:38:0x0186, B:40:0x01a0, B:42:0x01a7, B:45:0x01b2, B:47:0x01b6, B:49:0x01ba, B:51:0x01f3, B:53:0x01fc, B:54:0x021a, B:55:0x0237, B:57:0x023e, B:59:0x024b, B:66:0x0257, B:68:0x0266, B:70:0x026f, B:71:0x028e, B:73:0x028f, B:76:0x02a3, B:77:0x02ab, B:79:0x02b1, B:81:0x02c9, B:83:0x02d1, B:84:0x02d3, B:87:0x02df, B:93:0x02e3, B:94:0x02f7, B:96:0x02fd, B:97:0x0313, B:99:0x0319, B:101:0x0326, B:114:0x0334, B:109:0x0346, B:111:0x0358, B:112:0x0383, B:118:0x0384, B:121:0x0399, B:123:0x03aa, B:124:0x03b1, B:126:0x03c8, B:127:0x03cf, B:129:0x03d7, B:130:0x03de, B:132:0x03ed, B:133:0x03f4, B:136:0x040a, B:138:0x040e, B:140:0x0412, B:141:0x0419, B:144:0x042f, B:146:0x0433, B:147:0x04b9, B:148:0x0420, B:150:0x0424, B:152:0x0428, B:155:0x04ba, B:156:0x03fb, B:158:0x03ff, B:160:0x0403, B:163:0x038f, B:169:0x04bb, B:170:0x04da, B:171:0x0297, B:173:0x029b, B:179:0x04db, B:180:0x04e2, B:182:0x020d, B:185:0x04e3, B:186:0x04ea, B:187:0x04eb, B:188:0x04f2, B:192:0x013b, B:194:0x013f, B:196:0x0144, B:197:0x0052, B:199:0x005c, B:201:0x0064, B:202:0x04f3, B:203:0x04fa, B:204:0x04fb, B:205:0x0502, B:206:0x0503, B:207:0x0505), top: B:3:0x0005 }] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(Context context, arv arvVar) {
        Context applicationContext;
        auy auyVar;
        ldt ldtVar;
        ajd ajdVar;
        int i;
        ajw ajwVar;
        akb akbVar;
        int i2;
        boolean z;
        synchronized (a) {
            auy auyVar2 = m;
            if (auyVar2 != null && n != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
        ajwVar.i = akbVar == null ? new ajb(ajdVar, new ajt(i), new ajv(ajwVar, 1)) : new ajb(ajdVar, (aka) akbVar, new ajv(ajwVar, 0));
        ajwVar.d = ajwVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set i3 = ajwVar.i();
        List list = ajdVar.l;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator it = i3.iterator();
        while (true) {
            int i4 = -1;
            if (it.hasNext()) {
                ktj ktjVar = (ktj) it.next();
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i5 = size2 - 1;
                        if (ktjVar.d(list.get(size2))) {
                            zArr[size2] = true;
                            i4 = size2;
                            break;
                        } else if (i5 < 0) {
                            break;
                        } else {
                            size2 = i5;
                        }
                    }
                }
                if (i4 < 0) {
                    throw new IllegalArgumentException("A required auto migration spec (" + ktjVar.b() + ") is missing in the database configuration.");
                }
                linkedHashMap.put(ktjVar, list.get(i4));
            } else {
                int size3 = list.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i6 = size3 - 1;
                        if (size3 >= size || !zArr[size3]) {
                            break;
                        } else if (i6 < 0) {
                            break;
                        } else {
                            size3 = i6;
                        }
                    }
                }
                for (alk alkVar : ajwVar.f(linkedHashMap)) {
                    brn brnVar = ajdVar.q;
                    int i7 = alkVar.a;
                    int i8 = alkVar.b;
                    ?? r12 = brnVar.a;
                    Integer valueOf = Integer.valueOf(i7);
                    if (r12.containsKey(valueOf)) {
                        Map map = (Map) r12.get(valueOf);
                        if (map == null) {
                            map = kpl.a;
                        }
                        z = map.containsKey(Integer.valueOf(i8));
                    } else {
                        z = false;
                    }
                    if (!z) {
                        brnVar.E(alkVar);
                    }
                }
                Map g = ajwVar.g();
                List list2 = ajdVar.k;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry entry : g.entrySet()) {
                    ktj ktjVar2 = (ktj) entry.getKey();
                    for (ktj ktjVar3 : (List) entry.getValue()) {
                        int size4 = list2.size() + i4;
                        if (size4 >= 0) {
                            while (true) {
                                int i9 = size4 - 1;
                                i2 = i4;
                                if (ktjVar3.d(list2.get(size4))) {
                                    zArr2[size4] = true;
                                    break;
                                } else {
                                    if (i9 < 0) {
                                        break;
                                    }
                                    size4 = i9;
                                    i4 = i2;
                                }
                            }
                        } else {
                            i2 = i4;
                        }
                        size4 = i2;
                        if (size4 < 0) {
                            throw new IllegalArgumentException("A required type converter (" + ktjVar3.b() + ") for " + ktjVar2.b() + " is missing in the database configuration.");
                        }
                        Object obj = list2.get(size4);
                        ktjVar3.getClass();
                        obj.getClass();
                        ajwVar.g.put(ktjVar3, obj);
                        i4 = i2;
                    }
                }
                int size5 = list2.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i10 = size5 - 1;
                        if (!zArr2[size5]) {
                            throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        }
                        if (i10 < 0) {
                            break;
                        } else {
                            size5 = i10;
                        }
                    }
                }
                ajwVar.b = ajdVar.f;
                ajwVar.c = new akf(ajdVar.g);
                Executor executor = ajwVar.b;
                if (executor == null) {
                    ksp.a("internalQueryExecutor");
                    executor = null;
                }
                ajwVar.a = kvp.g(ixh.b(executor).plus(new kxt()));
                kvm kvmVar = ajwVar.a;
                if (kvmVar == null) {
                    ksp.a("coroutineScope");
                    kvmVar = null;
                }
                kqn kqnVar = ((lby) kvmVar).a;
                Executor executor2 = ajwVar.c;
                if (executor2 == null) {
                    ksp.a("internalTransactionExecutor");
                    executor2 = null;
                }
                kqnVar.plus(ixh.b(executor2));
                ajwVar.e = ajdVar.e;
                ajb ajbVar = ajwVar.i;
                if (ajbVar == null) {
                    ksp.a("connectionManager");
                    ajbVar = null;
                }
                amn amnVar = ajbVar.d;
                if (amnVar != null) {
                    while (!(amnVar instanceof alm)) {
                        if (amnVar instanceof aje) {
                            amnVar = ((aje) amnVar).a();
                        }
                    }
                    if (((alm) amnVar) == null) {
                        throw null;
                    }
                    ajb ajbVar2 = ajwVar.i;
                    if (ajbVar2 == null) {
                        ksp.a("connectionManager");
                        ajbVar2 = null;
                    }
                    amn amnVar2 = ajbVar2.d;
                    if (amnVar2 != null) {
                        while (!(amnVar2 instanceof all)) {
                            if (amnVar2 instanceof aje) {
                                amnVar2 = ((aje) amnVar2).a();
                            }
                        }
                        if (((all) amnVar2) == null) {
                            throw null;
                        }
                        WorkDatabase workDatabase = (WorkDatabase) ajwVar;
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        applicationContext2.getClass();
                        Context applicationContext3 = applicationContext2.getApplicationContext();
                        applicationContext3.getClass();
                        awi awiVar = new awi(applicationContext3, ldtVar);
                        Context applicationContext4 = applicationContext2.getApplicationContext();
                        applicationContext4.getClass();
                        awk awkVar = new awk(applicationContext4, ldtVar);
                        Context applicationContext5 = applicationContext2.getApplicationContext();
                        applicationContext5.getClass();
                        cfz cfzVar = new cfz(applicationContext2, awiVar, awkVar, new awr(applicationContext5, ldtVar));
                        atx atxVar = new atx(applicationContext.getApplicationContext(), arvVar, ldtVar, workDatabase);
                        workDatabase.getClass();
                        kpt kptVar = new kpt(10);
                        int i11 = aub.a;
                        avs avsVar = new avs(applicationContext, workDatabase, arvVar);
                        aym.a(applicationContext, SystemJobService.class, true);
                        asq.a();
                        kptVar.add(avsVar);
                        kptVar.add(new avo(applicationContext, arvVar, cfzVar, atxVar, new brr(atxVar, ldtVar), ldtVar));
                        auyVar = new auy(applicationContext.getApplicationContext(), arvVar, ldtVar, workDatabase, ixc.a(kptVar), atxVar, cfzVar);
                        n = auyVar;
                    }
                    amnVar2 = null;
                    if (((all) amnVar2) == null) {
                    }
                }
                amnVar = null;
                if (((alm) amnVar) == null) {
                }
            }
        }
        m = auyVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.atd
    public final asv a(String str) {
        yn ynVar = this.c.m;
        ?? r1 = this.k.e;
        r1.getClass();
        return yo.f(ynVar, "CancelWorkByName_".concat(str), r1, new awb(str, this, 2));
    }

    @Override // defpackage.atd
    public final asv b(UUID uuid) {
        return aei.g(uuid, this);
    }

    @Override // defpackage.atd
    public final asv c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new auj(this, null, 2, list).g();
    }

    @Override // defpackage.atd
    public final asv e(String str, int i, List list) {
        return new auj(this, str, i, list).g();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.atd
    public final asv g(String str, int i, bvw bvwVar) {
        if (i != 3) {
            return new auj(this, str, i != 2 ? 1 : 2, Collections.singletonList(bvwVar)).g();
        }
        yn ynVar = this.c.m;
        String concat = "enqueueUniquePeriodic_".concat(str);
        ?? r1 = this.k.e;
        r1.getClass();
        return yo.f(ynVar, concat, r1, new avb(this, str, bvwVar, 0));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.atd
    public final hvi h(brn brnVar) {
        WorkDatabase workDatabase = this.d;
        ldt ldtVar = this.k;
        workDatabase.getClass();
        ldtVar.getClass();
        ajq ajqVar = new ajq(brnVar, 14);
        ?? r3 = ldtVar.e;
        r3.getClass();
        return yn.f(r3, "loadStatusFuture", new awb(ajqVar, workDatabase, 4));
    }

    public final void k() {
        synchronized (a) {
            this.g = true;
            BroadcastReceiver.PendingResult pendingResult = this.h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.h = null;
            }
        }
    }

    public final void l() {
        yn ynVar = this.c.m;
        aux auxVar = new aux(this, 0);
        boolean g = yk.g();
        if (g) {
            try {
                yk.f("ReschedulingWork");
            } catch (Throwable th) {
                if (g) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        auxVar.a();
        if (g) {
            Trace.endSection();
        }
    }

    public final void m(axl axlVar, int i) {
        this.k.r(new ayp(this.f, new brn(axlVar), true, i));
    }
}
