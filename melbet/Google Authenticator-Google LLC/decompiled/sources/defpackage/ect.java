package defpackage;

import android.animation.AnimatorSet;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ect implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ect(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r13v35, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v2, types: [hvm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        long startElapsedRealtime;
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                ((ecv) this.a).a = false;
                return;
            case 1:
                ((fwm) this.a).D();
                return;
            case 2:
                eea eeaVar = (eea) this.a;
                AnimatorSet animatorSet = eeaVar.v;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                eeaVar.f(true);
                return;
            case 3:
                ((eea) this.a).i(false);
                return;
            case 4:
                eea eeaVar2 = ((edw) this.a).a;
                eeaVar2.f(true);
                eeaVar2.m(eeaVar2.e.a.g(), eeaVar2.e.a.a());
                return;
            case 5:
                fym fymVar = (fym) ((fym) this.a).b;
                ((ejl) fymVar.a).a(new ejq(fymVar));
                return;
            case 6:
                elf elfVar = (elf) this.a;
                eik eikVar = elfVar.h;
                eikVar.getClass();
                if (elfVar.b == 0) {
                    elfVar.c = true;
                    Iterator it = elfVar.g.iterator();
                    while (it.hasNext()) {
                        ((ekp) it.next()).k(eikVar);
                    }
                }
                elfVar.h.getClass();
                elfVar.a();
                return;
            case 7:
                ((emv) this.a).a();
                return;
            case 8:
                eny enyVar = (eny) this.a;
                if (((Boolean) enyVar.h.b()).booleanValue()) {
                    ejl ejlVar = enyVar.j;
                    Iterator it2 = ejlVar.b.iterator();
                    while (it2.hasNext()) {
                        hti.g(((ejo) it2.next()).a(), new doj(ejlVar, 2), ejlVar.a);
                    }
                }
                fym fymVar2 = enyVar.k;
                if (((Boolean) fymVar2.c.b()).booleanValue()) {
                    double longValue = ((Long) fymVar2.f.b()).longValue();
                    Object obj = fymVar2.d;
                    ?? r3 = fymVar2.e;
                    fymVar2.a.scheduleWithFixedDelay(new ect(fymVar2, 5), Math.round(longValue + (((Random) obj).nextDouble() * ((Long) r3.b()).longValue())), ((Long) r3.b()).longValue(), TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 9:
                final eny enyVar2 = (eny) this.a;
                hnu.aN(new htq() { // from class: enx
                    /* JADX WARN: Code restructure failed: missing block: B:183:0x026f, code lost:
                    
                        r0 = r13.getAnrInfo();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:228:0x0316, code lost:
                    
                        if (r8 != null) goto L581;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:154:0x09c7  */
                    /* JADX WARN: Removed duplicated region for block: B:262:0x0924 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:451:0x07ef A[Catch: all -> 0x08e5, TryCatch #2 {all -> 0x08e5, blocks: (B:249:0x08cd, B:251:0x08d5, B:252:0x08d8, B:448:0x07e1, B:449:0x07e9, B:451:0x07ef, B:454:0x0801, B:456:0x080d, B:457:0x0810, B:459:0x082c, B:461:0x0836, B:462:0x0839, B:463:0x084a, B:465:0x085e, B:466:0x0861, B:468:0x087e, B:469:0x0881, B:471:0x088d, B:472:0x0893, B:474:0x08a6, B:475:0x08a9, B:477:0x08b8, B:478:0x08be, B:483:0x08c5, B:489:0x07c6, B:530:0x07d8), top: B:248:0x08cd }] */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0973  */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x09ca  */
                    /* JADX WARN: Removed duplicated region for block: B:84:0x09ff  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x0a09  */
                    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, koe] */
                    /* JADX WARN: Type inference failed for: r11v16 */
                    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, koe] */
                    @Override // defpackage.htq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final hvi a() {
                        String processName;
                        List historicalProcessExitReasons;
                        String processName2;
                        String processName3;
                        int status;
                        long timestamp;
                        long pss;
                        long rss;
                        boolean isLowMemoryKillReportSupported;
                        int reason;
                        String description;
                        int i3;
                        int i4;
                        eny enyVar3;
                        String str;
                        heg hegVar;
                        long j;
                        ApplicationExitInfo applicationExitInfo;
                        Iterator it3;
                        int i5;
                        File file;
                        String str2;
                        int importance;
                        int i6;
                        eqm eqmVar;
                        final int pid;
                        long timestamp2;
                        jkj jkjVar;
                        hvi aJ;
                        jkj jkjVar2;
                        String str3;
                        InputStream traceInputStream;
                        InputStream inputStream;
                        Throwable th;
                        int i7;
                        int i8;
                        String str4;
                        jnq jnqVar;
                        boolean z;
                        hfs a;
                        Object[] objArr;
                        hjr it4;
                        jnt jntVar;
                        jnr jnrVar;
                        InputStream traceInputStream2;
                        String description2;
                        jkj k;
                        jjp jjpVar;
                        GZIPOutputStream gZIPOutputStream;
                        ApplicationExitInfo.AnrInfo anrInfo;
                        boolean isUserPerceptible;
                        long timestamp3;
                        eny enyVar4 = eny.this;
                        jpt jptVar = enyVar4.e;
                        if (!((ent) jptVar.b()).b()) {
                            return hve.a;
                        }
                        String packageName = enyVar4.b.getPackageName();
                        String str5 = ((ent) jptVar.b()).a;
                        String valueOf = String.valueOf(packageName);
                        String valueOf2 = String.valueOf(str5);
                        processName = Application.getProcessName();
                        if (!processName.equals(valueOf.concat(valueOf2))) {
                            return hve.a;
                        }
                        if (!((Boolean) enyVar4.f.b()).booleanValue()) {
                            return hve.a;
                        }
                        final env envVar = enyVar4.i;
                        koe koeVar = enyVar4.d;
                        String string = ((SharedPreferences) koeVar.b()).getString("lastExitProcessName", null);
                        long j2 = ((SharedPreferences) koeVar.b()).getLong("lastExitTimestamp", -1L);
                        Context context = envVar.a;
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        activityManager.getClass();
                        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 0);
                        int i9 = hel.d;
                        int i10 = 4;
                        heg hegVar2 = new heg(4);
                        Iterator it5 = historicalProcessExitReasons.iterator();
                        while (it5.hasNext()) {
                            ApplicationExitInfo m = it$$ExternalSyntheticApiModelOutline0.m(it5.next());
                            processName2 = m.getProcessName();
                            if (processName2.equals(string)) {
                                timestamp3 = m.getTimestamp();
                                if (timestamp3 == j2) {
                                    eny enyVar5 = enyVar4;
                                    hvi aG = hnu.aG(hegVar2.g());
                                    drv drvVar = new drv(18);
                                    huf hufVar = huf.a;
                                    return hti.g(hti.f(aG, drvVar, hufVar), new doj(enyVar5, 3), hufVar);
                                }
                            }
                            jkj k2 = leg.a.k();
                            processName3 = m.getProcessName();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            leg legVar = (leg) k2.b;
                            processName3.getClass();
                            legVar.b |= 1;
                            legVar.c = processName3;
                            status = m.getStatus();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            leg legVar2 = (leg) k2.b;
                            legVar2.b |= i10;
                            legVar2.e = status;
                            timestamp = m.getTimestamp();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            leg legVar3 = (leg) k2.b;
                            legVar3.b |= 16;
                            legVar3.g = timestamp;
                            pss = m.getPss();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            leg legVar4 = (leg) k2.b;
                            legVar4.b |= 64;
                            legVar4.i = pss;
                            rss = m.getRss();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            leg legVar5 = (leg) k2.b;
                            legVar5.b |= 128;
                            legVar5.j = rss;
                            isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            leg legVar6 = (leg) k2.b;
                            legVar6.b |= 256;
                            legVar6.k = isLowMemoryKillReportSupported;
                            reason = m.getReason();
                            description = m.getDescription();
                            switch (reason) {
                                case 0:
                                    i3 = 15;
                                    i4 = 2;
                                    break;
                                case 1:
                                    i3 = 2;
                                    i4 = 2;
                                    break;
                                case 2:
                                    i3 = 3;
                                    i4 = 2;
                                    break;
                                case 3:
                                    i3 = 4;
                                    i4 = 2;
                                    break;
                                case 4:
                                    i3 = 5;
                                    i4 = 2;
                                    break;
                                case 5:
                                    i3 = 6;
                                    i4 = 2;
                                    break;
                                case 6:
                                    i3 = 7;
                                    i4 = 2;
                                    break;
                                case 7:
                                    i3 = 8;
                                    i4 = 2;
                                    break;
                                case 8:
                                    i3 = 9;
                                    i4 = 2;
                                    break;
                                case 9:
                                    i3 = 10;
                                    i4 = 2;
                                    break;
                                case 10:
                                    i3 = 11;
                                    i4 = 2;
                                    break;
                                case 11:
                                    i3 = 12;
                                    i4 = 2;
                                    break;
                                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                    i3 = 13;
                                    i4 = 2;
                                    break;
                                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                    i3 = (description == null || !description.contains("MemoryLimiter:AnonSwap")) ? 14 : 18;
                                    i4 = 2;
                                    break;
                                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                    i3 = 100;
                                    i4 = 2;
                                    break;
                                case 15:
                                    i3 = 16;
                                    i4 = 2;
                                    break;
                                case 16:
                                    i3 = 17;
                                    i4 = 2;
                                    break;
                                default:
                                    i4 = 2;
                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toReasonEnum", 442, "ApplicationExitInfoCaptureImpl.java")).u("Unknown ApplicationExitInfo Reason: %s", new eki(reason));
                                    i3 = 0;
                                    break;
                            }
                            if (i3 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                leg legVar7 = (leg) k2.b;
                                int i11 = i3 - 1;
                                legVar7.d = i11;
                                legVar7.b |= 2;
                                if (i11 == 5) {
                                    j = j2;
                                    if (Build.VERSION.SDK_INT >= 31 && ((Boolean) envVar.m.b()).booleanValue()) {
                                        try {
                                            traceInputStream = m.getTraceInputStream();
                                        } catch (IOException e) {
                                            e = e;
                                            enyVar3 = enyVar4;
                                            str = string;
                                            hegVar = hegVar2;
                                            str3 = "ApplicationExitInfoCaptureImpl.java";
                                            it3 = it5;
                                            str2 = "ApplicationExitInfoCaptureImpl.java";
                                            applicationExitInfo = m;
                                            file = null;
                                            i5 = 0;
                                        }
                                        if (traceInputStream == null) {
                                            try {
                                                ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetNativeCrashInfo", 307, "ApplicationExitInfoCaptureImpl.java")).s("Native crash tombstone input stream is null");
                                            } catch (Throwable th2) {
                                                th = th2;
                                                enyVar3 = enyVar4;
                                                str = string;
                                            }
                                        } else {
                                            joh johVar = (joh) jkp.t(joh.a, traceInputStream, jkd.a());
                                            long longValue2 = ((Long) envVar.n.b()).longValue();
                                            int i12 = johVar.c;
                                            str = string;
                                            try {
                                                jog jogVar = (jog) DesugarCollections.unmodifiableMap(johVar.f).get(Integer.valueOf(i12));
                                                if (jogVar == null) {
                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toNativeCrashInfo", 516, "ApplicationExitInfoCaptureImpl.java")).t("Tombstone missing crashed thread %d", i12);
                                                    enyVar3 = enyVar4;
                                                    hegVar = hegVar2;
                                                    str3 = "ApplicationExitInfoCaptureImpl.java";
                                                    inputStream = traceInputStream;
                                                    it3 = it5;
                                                    str2 = "ApplicationExitInfoCaptureImpl.java";
                                                    applicationExitInfo = m;
                                                    jntVar = null;
                                                    file = null;
                                                    i5 = 0;
                                                } else {
                                                    jkj k3 = jnt.a.k();
                                                    str3 = "ApplicationExitInfoCaptureImpl.java";
                                                    try {
                                                        jof jofVar = johVar.d;
                                                        if (jofVar == null) {
                                                            jofVar = jof.a;
                                                        }
                                                        int i13 = jofVar.b;
                                                        inputStream = traceInputStream;
                                                        try {
                                                            if (!k3.b.M()) {
                                                                k3.t();
                                                            }
                                                            jkp jkpVar = k3.b;
                                                            jnt jntVar2 = (jnt) jkpVar;
                                                            it3 = it5;
                                                            try {
                                                                jntVar2.b |= 1;
                                                                jntVar2.c = i13;
                                                                jof jofVar2 = johVar.d;
                                                                if (jofVar2 == null) {
                                                                    jofVar2 = jof.a;
                                                                }
                                                                int i14 = jofVar2.c;
                                                                if (!jkpVar.M()) {
                                                                    k3.t();
                                                                }
                                                                jkp jkpVar2 = k3.b;
                                                                jnt jntVar3 = (jnt) jkpVar2;
                                                                jntVar3.b |= 2;
                                                                jntVar3.d = i14;
                                                                int i15 = johVar.b;
                                                                if (i15 == 0) {
                                                                    i7 = 5;
                                                                    i8 = 2;
                                                                } else if (i15 == 1) {
                                                                    i7 = 5;
                                                                    i8 = 3;
                                                                } else if (i15 == i4) {
                                                                    i7 = 5;
                                                                    i8 = 4;
                                                                } else if (i15 == 3) {
                                                                    i7 = 5;
                                                                    i8 = 5;
                                                                } else if (i15 != 4) {
                                                                    i7 = 5;
                                                                    i8 = i15 != 5 ? 0 : 7;
                                                                } else {
                                                                    i7 = 5;
                                                                    i8 = 6;
                                                                }
                                                                if (i8 == 0) {
                                                                    i8 = 1;
                                                                }
                                                                int i16 = i8 - 2;
                                                                int i17 = i16 != 0 ? i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? 1 : 6 : i7 : 4 : 3 : 2;
                                                                if (!jkpVar2.M()) {
                                                                    k3.t();
                                                                }
                                                                jkp jkpVar3 = k3.b;
                                                                jnt jntVar4 = (jnt) jkpVar3;
                                                                jntVar4.f = i17 - 1;
                                                                jntVar4.b |= 8;
                                                                jof jofVar3 = johVar.d;
                                                                if ((jofVar3 == null ? jof.a : jofVar3).d) {
                                                                    if (jofVar3 == null) {
                                                                        jofVar3 = jof.a;
                                                                    }
                                                                    try {
                                                                        long j3 = jofVar3.e;
                                                                        if (!jkpVar3.M()) {
                                                                            k3.t();
                                                                        }
                                                                        jnt jntVar5 = (jnt) k3.b;
                                                                        str4 = "ApplicationExitInfoCaptureImpl.java";
                                                                        try {
                                                                            jntVar5.b |= 4;
                                                                            jntVar5.e = j3;
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            enyVar3 = enyVar4;
                                                                            hegVar = hegVar2;
                                                                            applicationExitInfo = m;
                                                                            str2 = str4;
                                                                            file = null;
                                                                            i5 = 0;
                                                                            th = th;
                                                                            if (inputStream != null) {
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        str4 = "ApplicationExitInfoCaptureImpl.java";
                                                                        enyVar3 = enyVar4;
                                                                        hegVar = hegVar2;
                                                                        applicationExitInfo = m;
                                                                        str2 = str4;
                                                                        file = null;
                                                                        i5 = 0;
                                                                        th = th;
                                                                        if (inputStream != null) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    str4 = "ApplicationExitInfoCaptureImpl.java";
                                                                }
                                                                jnq jnqVar2 = jnq.a;
                                                                jkj k4 = jnqVar2.k();
                                                                if (!k4.b.M()) {
                                                                    k4.t();
                                                                }
                                                                jnq jnqVar3 = (jnq) k4.b;
                                                                jnqVar3.b |= 2;
                                                                jnqVar3.d = i12;
                                                                if (jogVar.b.isEmpty()) {
                                                                    jnqVar = jnqVar2;
                                                                } else {
                                                                    String str6 = jogVar.b;
                                                                    if (!k4.b.M()) {
                                                                        k4.t();
                                                                    }
                                                                    jnq jnqVar4 = (jnq) k4.b;
                                                                    str6.getClass();
                                                                    jnqVar = jnqVar2;
                                                                    jnqVar4.b |= 1;
                                                                    jnqVar4.c = str6;
                                                                }
                                                                jnq jnqVar5 = (jnq) k4.q();
                                                                if (!k3.b.M()) {
                                                                    k3.t();
                                                                }
                                                                jnt jntVar6 = (jnt) k3.b;
                                                                jnqVar5.getClass();
                                                                jntVar6.j = jnqVar5;
                                                                jntVar6.b |= 128;
                                                                Collection values = DesugarCollections.unmodifiableMap(johVar.f).values();
                                                                hen henVar = new hen(4);
                                                                HashSet hashSet = new HashSet();
                                                                Iterator it6 = values.iterator();
                                                                while (it6.hasNext()) {
                                                                    try {
                                                                        Iterator it7 = ((jog) it6.next()).c.iterator();
                                                                        while (it7.hasNext()) {
                                                                            Iterator it8 = it6;
                                                                            joe joeVar = (joe) it7.next();
                                                                            Iterator it9 = it7;
                                                                            if (joeVar.e.isEmpty()) {
                                                                                it7 = it9;
                                                                                it6 = it8;
                                                                            } else {
                                                                                int size = hashSet.size();
                                                                                applicationExitInfo = m;
                                                                                try {
                                                                                    if (hashSet.add(joeVar.e)) {
                                                                                        jkj k5 = jnr.a.k();
                                                                                        HashSet hashSet2 = hashSet;
                                                                                        String str7 = joeVar.e;
                                                                                        enyVar3 = enyVar4;
                                                                                        try {
                                                                                            if (!k5.b.M()) {
                                                                                                try {
                                                                                                    k5.t();
                                                                                                } catch (Throwable th5) {
                                                                                                    th = th5;
                                                                                                    hegVar = hegVar2;
                                                                                                    str2 = str4;
                                                                                                    file = null;
                                                                                                    i5 = 0;
                                                                                                    if (inputStream != null) {
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            }
                                                                                            jnrVar = (jnr) k5.b;
                                                                                            str7.getClass();
                                                                                            hegVar = hegVar2;
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            hegVar = hegVar2;
                                                                                            th = th;
                                                                                            str2 = str4;
                                                                                            file = null;
                                                                                            i5 = 0;
                                                                                            if (inputStream != null) {
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                        try {
                                                                                            jnrVar.b |= 2;
                                                                                            jnrVar.d = str7;
                                                                                            if (!joeVar.d.isEmpty()) {
                                                                                                String str8 = joeVar.d;
                                                                                                if (!k5.b.M()) {
                                                                                                    k5.t();
                                                                                                }
                                                                                                jnr jnrVar2 = (jnr) k5.b;
                                                                                                str8.getClass();
                                                                                                jnrVar2.b |= 1;
                                                                                                jnrVar2.c = str8;
                                                                                            }
                                                                                            henVar.g(joeVar.e, new bsh((jnr) k5.q(), size));
                                                                                            it7 = it9;
                                                                                            it6 = it8;
                                                                                            hashSet = hashSet2;
                                                                                            m = applicationExitInfo;
                                                                                            enyVar4 = enyVar3;
                                                                                            hegVar2 = hegVar;
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            th = th;
                                                                                            str2 = str4;
                                                                                            file = null;
                                                                                            i5 = 0;
                                                                                            if (inputStream != null) {
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } else {
                                                                                        it7 = it9;
                                                                                        it6 = it8;
                                                                                        m = applicationExitInfo;
                                                                                    }
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    enyVar3 = enyVar4;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        enyVar3 = enyVar4;
                                                                        hegVar = hegVar2;
                                                                        applicationExitInfo = m;
                                                                    }
                                                                }
                                                                enyVar3 = enyVar4;
                                                                hegVar = hegVar2;
                                                                applicationExitInfo = m;
                                                                try {
                                                                    her d = henVar.d(true);
                                                                    hjr it10 = d.values().iterator();
                                                                    while (it10.hasNext()) {
                                                                        Object obj2 = ((bsh) it10.next()).b;
                                                                        if (!k3.b.M()) {
                                                                            k3.t();
                                                                        }
                                                                        jnt jntVar7 = (jnt) k3.b;
                                                                        obj2.getClass();
                                                                        jkx jkxVar = jntVar7.h;
                                                                        if (!jkxVar.c()) {
                                                                            jntVar7.h = jkp.A(jkxVar);
                                                                        }
                                                                        jntVar7.h.add(obj2);
                                                                    }
                                                                    hel a2 = env.a(jogVar, d, longValue2);
                                                                    if (!k3.b.M()) {
                                                                        k3.t();
                                                                    }
                                                                    jnt jntVar8 = (jnt) k3.b;
                                                                    jkx jkxVar2 = jntVar8.g;
                                                                    if (!jkxVar2.c()) {
                                                                        jntVar8.g = jkp.A(jkxVar2);
                                                                    }
                                                                    jiz.f(a2, jntVar8.g);
                                                                    if (!johVar.e.isEmpty()) {
                                                                        String str9 = johVar.e;
                                                                        if (!k3.b.M()) {
                                                                            k3.t();
                                                                        }
                                                                        jnt jntVar9 = (jnt) k3.b;
                                                                        str9.getClass();
                                                                        jntVar9.b |= 64;
                                                                        jntVar9.i = str9;
                                                                    }
                                                                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(johVar.f);
                                                                    Comparator comparator = hfs.b;
                                                                    if (unmodifiableMap instanceof SortedMap) {
                                                                        Comparator comparator2 = ((SortedMap) unmodifiableMap).comparator();
                                                                        z = comparator2 == null ? true : comparator.equals(comparator2);
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    if (z && (unmodifiableMap instanceof hfs)) {
                                                                        a = (hfs) unmodifiableMap;
                                                                        if (!a.e()) {
                                                                            str2 = str4;
                                                                            file = null;
                                                                            i5 = 0;
                                                                            it4 = a.entrySet().iterator();
                                                                            while (it4.hasNext()) {
                                                                                Map.Entry entry = (Map.Entry) it4.next();
                                                                                int intValue = ((Integer) entry.getKey()).intValue();
                                                                                if (intValue != i12) {
                                                                                    jkj k6 = jnqVar.k();
                                                                                    if (!k6.b.M()) {
                                                                                        k6.t();
                                                                                    }
                                                                                    jnq jnqVar6 = (jnq) k6.b;
                                                                                    jnqVar6.b |= 2;
                                                                                    jnqVar6.d = intValue;
                                                                                    jog jogVar2 = (jog) entry.getValue();
                                                                                    if (!jogVar2.b.isEmpty()) {
                                                                                        String str10 = jogVar2.b;
                                                                                        if (!k6.b.M()) {
                                                                                            k6.t();
                                                                                        }
                                                                                        jnq jnqVar7 = (jnq) k6.b;
                                                                                        str10.getClass();
                                                                                        jnqVar7.b |= 1;
                                                                                        jnqVar7.c = str10;
                                                                                    }
                                                                                    jkj k7 = jnp.a.k();
                                                                                    jnq jnqVar8 = (jnq) k6.q();
                                                                                    if (!k7.b.M()) {
                                                                                        k7.t();
                                                                                    }
                                                                                    jnp jnpVar = (jnp) k7.b;
                                                                                    jnqVar8.getClass();
                                                                                    jnpVar.c = jnqVar8;
                                                                                    jnpVar.b |= 1;
                                                                                    hel a3 = env.a(jogVar2, d, longValue2);
                                                                                    if (!k7.b.M()) {
                                                                                        k7.t();
                                                                                    }
                                                                                    jnp jnpVar2 = (jnp) k7.b;
                                                                                    jkx jkxVar3 = jnpVar2.d;
                                                                                    if (!jkxVar3.c()) {
                                                                                        jnpVar2.d = jkp.A(jkxVar3);
                                                                                    }
                                                                                    jiz.f(a3, jnpVar2.d);
                                                                                    jnp jnpVar3 = (jnp) k7.q();
                                                                                    if (!k3.b.M()) {
                                                                                        k3.t();
                                                                                    }
                                                                                    jnt jntVar10 = (jnt) k3.b;
                                                                                    jnpVar3.getClass();
                                                                                    jkx jkxVar4 = jntVar10.k;
                                                                                    if (!jkxVar4.c()) {
                                                                                        jntVar10.k = jkp.A(jkxVar4);
                                                                                    }
                                                                                    jntVar10.k.add(jnpVar3);
                                                                                }
                                                                            }
                                                                            jntVar = (jnt) k3.q();
                                                                        }
                                                                    }
                                                                    Map.Entry[] entryArr = (Map.Entry[]) hnu.Y(unmodifiableMap.entrySet()).toArray(hfs.a);
                                                                    int length = entryArr.length;
                                                                    if (length == 0) {
                                                                        str2 = str4;
                                                                        file = null;
                                                                        i5 = 0;
                                                                        a = hfs.a(comparator);
                                                                    } else if (length != 1) {
                                                                        try {
                                                                            Object[] objArr2 = new Object[length];
                                                                            Object[] objArr3 = new Object[length];
                                                                            if (z) {
                                                                                for (int i18 = 0; i18 < length; i18++) {
                                                                                    Map.Entry entry2 = entryArr[i18];
                                                                                    entry2.getClass();
                                                                                    Object key = entry2.getKey();
                                                                                    Object value = entry2.getValue();
                                                                                    hnu.ao(key, value);
                                                                                    objArr2[i18] = key;
                                                                                    objArr3[i18] = value;
                                                                                }
                                                                                objArr = objArr2;
                                                                                str2 = str4;
                                                                            } else {
                                                                                Arrays.sort(entryArr, 0, length, new hfn(comparator, 0));
                                                                                Map.Entry entry3 = entryArr[0];
                                                                                entry3.getClass();
                                                                                Object key2 = entry3.getKey();
                                                                                objArr2[0] = key2;
                                                                                Object value2 = entry3.getValue();
                                                                                objArr3[0] = value2;
                                                                                Object obj3 = objArr2[0];
                                                                                objArr = objArr2;
                                                                                str2 = str4;
                                                                                hnu.ao(obj3, value2);
                                                                                int i19 = 1;
                                                                                while (i19 < length) {
                                                                                    try {
                                                                                        Map.Entry entry4 = entryArr[i19 - 1];
                                                                                        entry4.getClass();
                                                                                        Map.Entry entry5 = entryArr[i19];
                                                                                        entry5.getClass();
                                                                                        Map.Entry[] entryArr2 = entryArr;
                                                                                        Object key3 = entry5.getKey();
                                                                                        int i20 = length;
                                                                                        Object value3 = entry5.getValue();
                                                                                        hnu.ao(key3, value3);
                                                                                        objArr[i19] = key3;
                                                                                        objArr3[i19] = value3;
                                                                                        if (comparator.compare(key2, key3) == 0) {
                                                                                            throw new IllegalArgumentException("Multiple entries with same key: " + entry4.toString() + " and " + entry5.toString());
                                                                                        }
                                                                                        i19++;
                                                                                        key2 = key3;
                                                                                        entryArr = entryArr2;
                                                                                        length = i20;
                                                                                    } catch (Throwable th10) {
                                                                                        th = th10;
                                                                                        file = null;
                                                                                        i5 = 0;
                                                                                        if (inputStream != null) {
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            }
                                                                            try {
                                                                                hjc hjcVar = new hjc(hel.h(objArr), comparator);
                                                                                hel h = hel.h(objArr3);
                                                                                file = null;
                                                                                try {
                                                                                    a = new hfs(hjcVar, h, null);
                                                                                    i5 = 0;
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                    th = th;
                                                                                    i5 = 0;
                                                                                    if (inputStream != null) {
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                                file = null;
                                                                                th = th;
                                                                                i5 = 0;
                                                                                if (inputStream != null) {
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th13) {
                                                                            th = th13;
                                                                            str2 = str4;
                                                                        }
                                                                    } else {
                                                                        str2 = str4;
                                                                        file = null;
                                                                        i5 = 0;
                                                                        Map.Entry entry6 = entryArr[0];
                                                                        entry6.getClass();
                                                                        a = hfs.o(comparator, entry6.getKey(), entry6.getValue());
                                                                    }
                                                                    it4 = a.entrySet().iterator();
                                                                    while (it4.hasNext()) {
                                                                    }
                                                                    jntVar = (jnt) k3.q();
                                                                } catch (Throwable th14) {
                                                                    th = th14;
                                                                    str2 = str4;
                                                                    file = null;
                                                                    i5 = 0;
                                                                    th = th;
                                                                    if (inputStream != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                                enyVar3 = enyVar4;
                                                                hegVar = hegVar2;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                            enyVar3 = enyVar4;
                                                            hegVar = hegVar2;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        enyVar3 = enyVar4;
                                                        hegVar = hegVar2;
                                                    }
                                                }
                                                if (jntVar != null) {
                                                    try {
                                                        if (!k2.b.M()) {
                                                            k2.t();
                                                        }
                                                        leg legVar8 = (leg) k2.b;
                                                        legVar8.p = jntVar;
                                                        legVar8.b |= 8192;
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                    }
                                                }
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetNativeCrashInfo", (char) 318, str3)).s("Failed to read native crash tombstone");
                                                    importance = applicationExitInfo.getImportance();
                                                    if (importance == 100) {
                                                    }
                                                    if (i6 != 0) {
                                                    }
                                                    eqmVar = envVar.o;
                                                    pid = applicationExitInfo.getPid();
                                                    timestamp2 = applicationExitInfo.getTimestamp();
                                                    jmh b = jmx.b(timestamp2);
                                                    if (((Boolean) eqmVar.c.b()).booleanValue()) {
                                                    }
                                                    jkjVar = k2;
                                                    final jkj jkjVar3 = jkjVar;
                                                    heg hegVar3 = hegVar;
                                                    hegVar3.h(hti.f(aJ, new gzf() { // from class: enu
                                                        @Override // defpackage.gzf
                                                        public final Object a(Object obj4) {
                                                            hel helVar;
                                                            gzp gzpVar = (gzp) obj4;
                                                            boolean f = gzpVar.f();
                                                            jkj jkjVar4 = jkjVar3;
                                                            if (!f) {
                                                                return (leg) jkjVar4.q();
                                                            }
                                                            for (ejb ejbVar : ((ejf) gzpVar.b()).e) {
                                                                int i21 = ejbVar.b;
                                                                int i22 = 0;
                                                                int i23 = 2;
                                                                int i24 = 3;
                                                                int i25 = 1;
                                                                int i26 = i21 != 0 ? i21 != 1 ? i21 != 2 ? i21 != 3 ? i21 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                                if (i26 == 0) {
                                                                    throw null;
                                                                }
                                                                int i27 = i26 - 1;
                                                                env envVar2 = env.this;
                                                                if (i27 != 0) {
                                                                    if (i27 == 1) {
                                                                        jmh jmhVar = (i21 == 2 ? (ejc) ejbVar.c : ejc.a).c;
                                                                        if (jmhVar == null) {
                                                                            jmhVar = jmh.a;
                                                                        }
                                                                        long a4 = jmx.a(jmhVar);
                                                                        if (!jkjVar4.b.M()) {
                                                                            jkjVar4.t();
                                                                        }
                                                                        leg legVar9 = (leg) jkjVar4.b;
                                                                        leg legVar10 = leg.a;
                                                                        legVar9.b |= 32;
                                                                        legVar9.h = a4;
                                                                    } else if (i27 != 2) {
                                                                        if (i27 == 3) {
                                                                            eje ejeVar = i21 == 4 ? (eje) ejbVar.c : eje.a;
                                                                            jkj k8 = lhb.a.k();
                                                                            if (!ejeVar.c.equals(((emq) envVar2.b).b())) {
                                                                                String str11 = ejeVar.c;
                                                                                if (!k8.b.M()) {
                                                                                    k8.t();
                                                                                }
                                                                                lhb lhbVar = (lhb) k8.b;
                                                                                str11.getClass();
                                                                                lhbVar.b |= 1;
                                                                                lhbVar.c = str11;
                                                                                i22 = 1;
                                                                            }
                                                                            if (ejeVar.d != ((emp) envVar2.c).a().intValue()) {
                                                                                int i28 = ejeVar.d;
                                                                                if (!k8.b.M()) {
                                                                                    k8.t();
                                                                                }
                                                                                lhb lhbVar2 = (lhb) k8.b;
                                                                                lhbVar2.b = 2 | lhbVar2.b;
                                                                                lhbVar2.d = i28;
                                                                                i22 = 1;
                                                                            }
                                                                            if (ejeVar.e != ((Integer) envVar2.d.b()).intValue()) {
                                                                                int i29 = ejeVar.e;
                                                                                if (!k8.b.M()) {
                                                                                    k8.t();
                                                                                }
                                                                                lhb lhbVar3 = (lhb) k8.b;
                                                                                lhbVar3.b = 4 | lhbVar3.b;
                                                                                lhbVar3.e = i29;
                                                                            } else {
                                                                                i25 = i22;
                                                                            }
                                                                            if (ejeVar.f != Build.VERSION.SDK_INT) {
                                                                                int i30 = ejeVar.f;
                                                                                if (!k8.b.M()) {
                                                                                    k8.t();
                                                                                }
                                                                                lhb lhbVar4 = (lhb) k8.b;
                                                                                lhbVar4.b |= 8;
                                                                                lhbVar4.f = i30;
                                                                            } else if (i25 != 0) {
                                                                            }
                                                                            lhb lhbVar5 = (lhb) k8.q();
                                                                            if (!jkjVar4.b.M()) {
                                                                                jkjVar4.t();
                                                                            }
                                                                            leg legVar11 = (leg) jkjVar4.b;
                                                                            leg legVar12 = leg.a;
                                                                            lhbVar5.getClass();
                                                                            legVar11.o = lhbVar5;
                                                                            legVar11.b |= 4096;
                                                                        }
                                                                    } else if ((((leg) jkjVar4.b).b & 512) != 0 && ((Boolean) envVar2.h.b()).booleanValue()) {
                                                                        ejd ejdVar = ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a;
                                                                        koe koeVar2 = envVar2.j;
                                                                        List list = ejdVar.c;
                                                                        if (((Long) koeVar2.b()).longValue() >= 0) {
                                                                            Instant minusSeconds = Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar2.b()).longValue());
                                                                            jmh jmhVar2 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                            if (jmhVar2 == null) {
                                                                                jmhVar2 = jmh.a;
                                                                            }
                                                                            if (!imk.c(jmhVar2).isBefore(minusSeconds)) {
                                                                            }
                                                                        }
                                                                        koe koeVar3 = envVar2.i;
                                                                        if (((Long) koeVar3.b()).longValue() >= 0) {
                                                                            Stream filter = Collection.EL.stream(list).filter(new gqj(Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar3.b()).longValue()), i25));
                                                                            int i31 = hel.d;
                                                                            list = (List) filter.collect(hby.a);
                                                                        }
                                                                        long longValue3 = ((Long) envVar2.k.b()).longValue();
                                                                        long longValue4 = ((Long) envVar2.l.b()).longValue();
                                                                        Iterator it11 = list.iterator();
                                                                        boolean z2 = false;
                                                                        boolean z3 = false;
                                                                        while (it11.hasNext()) {
                                                                            int i32 = i23;
                                                                            int i33 = ((lgx) it11.next()).c;
                                                                            z2 |= i33 == 1;
                                                                            z3 |= i33 == 3;
                                                                            i23 = i32;
                                                                        }
                                                                        int i34 = i23;
                                                                        if (z2 && z3) {
                                                                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java")).s("TraceContext list contains both Trace and TraceRecord");
                                                                            int i35 = hel.d;
                                                                            helVar = his.a;
                                                                        } else if (z2) {
                                                                            Stream map = Collection.EL.stream(list).map(new ejs(i24));
                                                                            int i36 = hel.d;
                                                                            helVar = ejw.a((List) map.collect(hby.a), longValue3, longValue4);
                                                                        } else if (z3) {
                                                                            Stream map2 = Collection.EL.stream(list).map(new ejs(i22));
                                                                            int i37 = hel.d;
                                                                            helVar = ejw.a((List) map2.collect(hby.a), longValue3, longValue4);
                                                                        } else {
                                                                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java")).s("TraceContext list contains neither Trace nor TraceRecord");
                                                                            int i38 = hel.d;
                                                                            helVar = his.a;
                                                                        }
                                                                        if (!helVar.isEmpty()) {
                                                                            jkj k9 = lgy.a.k();
                                                                            if (!k9.b.M()) {
                                                                                k9.t();
                                                                            }
                                                                            lgy lgyVar = (lgy) k9.b;
                                                                            jkx jkxVar5 = lgyVar.c;
                                                                            if (!jkxVar5.c()) {
                                                                                lgyVar.c = jkp.A(jkxVar5);
                                                                            }
                                                                            jiz.f(helVar, lgyVar.c);
                                                                            jmh jmhVar3 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                            if (jmhVar3 == null) {
                                                                                jmhVar3 = jmh.a;
                                                                            }
                                                                            if (!k9.b.M()) {
                                                                                k9.t();
                                                                            }
                                                                            jkp jkpVar4 = k9.b;
                                                                            lgy lgyVar2 = (lgy) jkpVar4;
                                                                            jmhVar3.getClass();
                                                                            lgyVar2.d = jmhVar3;
                                                                            lgyVar2.b |= 1;
                                                                            int x = a.x((ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).e);
                                                                            if (x == 0) {
                                                                                x = 1;
                                                                            }
                                                                            int i39 = x - 1;
                                                                            if (i39 == 0) {
                                                                                i24 = 1;
                                                                            } else if (i39 == 1) {
                                                                                i24 = i34;
                                                                            }
                                                                            if (!jkpVar4.M()) {
                                                                                k9.t();
                                                                            }
                                                                            lgy lgyVar3 = (lgy) k9.b;
                                                                            lgyVar3.e = i24 - 1;
                                                                            lgyVar3.b |= 2;
                                                                            lgy lgyVar4 = (lgy) k9.q();
                                                                            if (!jkjVar4.b.M()) {
                                                                                jkjVar4.t();
                                                                            }
                                                                            leg legVar13 = (leg) jkjVar4.b;
                                                                            lgyVar4.getClass();
                                                                            legVar13.n = lgyVar4;
                                                                            legVar13.b |= 2048;
                                                                        }
                                                                    }
                                                                } else if ((((leg) jkjVar4.b).b & 1024) != 0) {
                                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 220, "ApplicationExitInfoCaptureImpl.java")).s("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                                } else {
                                                                    lew lewVar = i21 == 1 ? (lew) ejbVar.c : lew.a;
                                                                    if (!jkjVar4.b.M()) {
                                                                        jkjVar4.t();
                                                                    }
                                                                    leg legVar14 = (leg) jkjVar4.b;
                                                                    lewVar.getClass();
                                                                    legVar14.m = lewVar;
                                                                    legVar14.b |= 1024;
                                                                }
                                                            }
                                                            return (leg) jkjVar4.q();
                                                        }
                                                    }, huf.a));
                                                    hegVar2 = hegVar3;
                                                    j2 = j;
                                                    string = str;
                                                    it5 = it3;
                                                    enyVar4 = enyVar3;
                                                    i10 = 4;
                                                }
                                                importance = applicationExitInfo.getImportance();
                                                if (importance == 100) {
                                                    i6 = 2;
                                                } else if (importance == 125) {
                                                    i6 = 3;
                                                } else if (importance == 200) {
                                                    i6 = 5;
                                                } else if (importance == 230) {
                                                    i6 = 6;
                                                } else if (importance == 300) {
                                                    i6 = 8;
                                                } else if (importance == 325) {
                                                    i6 = 4;
                                                } else if (importance == 350) {
                                                    i6 = 7;
                                                } else if (importance == 400) {
                                                    i6 = 9;
                                                } else if (importance != 1000) {
                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "toImportanceEnum", 472, str2)).u("Unknown ApplicationExitInfo Importance: %s", new eki(importance));
                                                    i6 = i5;
                                                } else {
                                                    i6 = 10;
                                                }
                                                if (i6 != 0) {
                                                    if (!k2.b.M()) {
                                                        k2.t();
                                                    }
                                                    leg legVar9 = (leg) k2.b;
                                                    legVar9.f = i6 - 1;
                                                    legVar9.b |= 8;
                                                }
                                                eqmVar = envVar.o;
                                                pid = applicationExitInfo.getPid();
                                                timestamp2 = applicationExitInfo.getTimestamp();
                                                jmh b2 = jmx.b(timestamp2);
                                                if (((Boolean) eqmVar.c.b()).booleanValue()) {
                                                    File file2 = new File(((Context) eqmVar.a).getFilesDir(), "flight_records");
                                                    if (((Boolean) eqmVar.b.b()).booleanValue()) {
                                                        eqm.a(file2, Instant.now().getEpochSecond());
                                                    }
                                                    if (file2.exists()) {
                                                        File[] listFiles = file2.listFiles(new FilenameFilter() { // from class: ejg
                                                            @Override // java.io.FilenameFilter
                                                            public final boolean accept(File file3, String str11) {
                                                                return str11.startsWith(pid + "_");
                                                            }
                                                        });
                                                        if (listFiles == null) {
                                                            ((hkf) ((hkf) eiu.a.e()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 67, "FlightRecordReaderImpl.java")).t("Failed to find any valid flight records for process id %d", pid);
                                                            aJ = hnu.aJ(gyf.a);
                                                        } else {
                                                            File file3 = file;
                                                            Long l = file3;
                                                            int i21 = i5;
                                                            while (i21 < listFiles.length) {
                                                                File file4 = listFiles[i21];
                                                                List e3 = gzz.b('_').e(file4.getName());
                                                                if (e3.size() != 2) {
                                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 76, "FlightRecordReaderImpl.java")).u("Invalid flight record file name: %s", file4.getName());
                                                                    jkjVar2 = k2;
                                                                } else {
                                                                    try {
                                                                        long parseLong = Long.parseLong((String) e3.get(1));
                                                                        jkjVar2 = k2;
                                                                        long j4 = b2.b;
                                                                        if (parseLong <= j4 && (l == 0 || j4 - parseLong < l.longValue())) {
                                                                            l = Long.valueOf(b2.b - parseLong);
                                                                            file3 = file4;
                                                                        }
                                                                    } catch (NumberFormatException e4) {
                                                                        jkjVar2 = k2;
                                                                        ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e4)).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 83, "FlightRecordReaderImpl.java")).u("Invalid timestamp in flight record file name: %s", file4.getName());
                                                                    }
                                                                }
                                                                i21++;
                                                                k2 = jkjVar2;
                                                                l = l;
                                                            }
                                                            jkjVar = k2;
                                                            if (file3 == null) {
                                                                ((hkf) ((hkf) eiu.a.e()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 100, "FlightRecordReaderImpl.java")).t("Failed to find any valid flight records for process id %d", pid);
                                                                aJ = hnu.aJ(gyf.a);
                                                            } else {
                                                                try {
                                                                    FileInputStream fileInputStream = new FileInputStream(file3);
                                                                    try {
                                                                        ejf ejfVar = (ejf) jkp.t(ejf.a, fileInputStream, jkd.a());
                                                                        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 106, "FlightRecordReaderImpl.java")).s("Read and serialization successful");
                                                                        aJ = hnu.aJ(gzp.h(ejfVar));
                                                                        fileInputStream.close();
                                                                    } finally {
                                                                    }
                                                                } catch (IOException e5) {
                                                                    ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e5)).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 'm', "FlightRecordReaderImpl.java")).s("Failed to read FlightRecord from file");
                                                                    aJ = hnu.aJ(gyf.a);
                                                                }
                                                            }
                                                            final jkj jkjVar32 = jkjVar;
                                                            heg hegVar32 = hegVar;
                                                            hegVar32.h(hti.f(aJ, new gzf() { // from class: enu
                                                                @Override // defpackage.gzf
                                                                public final Object a(Object obj4) {
                                                                    hel helVar;
                                                                    gzp gzpVar = (gzp) obj4;
                                                                    boolean f = gzpVar.f();
                                                                    jkj jkjVar4 = jkjVar32;
                                                                    if (!f) {
                                                                        return (leg) jkjVar4.q();
                                                                    }
                                                                    for (ejb ejbVar : ((ejf) gzpVar.b()).e) {
                                                                        int i212 = ejbVar.b;
                                                                        int i22 = 0;
                                                                        int i23 = 2;
                                                                        int i24 = 3;
                                                                        int i25 = 1;
                                                                        int i26 = i212 != 0 ? i212 != 1 ? i212 != 2 ? i212 != 3 ? i212 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                                        if (i26 == 0) {
                                                                            throw null;
                                                                        }
                                                                        int i27 = i26 - 1;
                                                                        env envVar2 = env.this;
                                                                        if (i27 != 0) {
                                                                            if (i27 == 1) {
                                                                                jmh jmhVar = (i212 == 2 ? (ejc) ejbVar.c : ejc.a).c;
                                                                                if (jmhVar == null) {
                                                                                    jmhVar = jmh.a;
                                                                                }
                                                                                long a4 = jmx.a(jmhVar);
                                                                                if (!jkjVar4.b.M()) {
                                                                                    jkjVar4.t();
                                                                                }
                                                                                leg legVar92 = (leg) jkjVar4.b;
                                                                                leg legVar10 = leg.a;
                                                                                legVar92.b |= 32;
                                                                                legVar92.h = a4;
                                                                            } else if (i27 != 2) {
                                                                                if (i27 == 3) {
                                                                                    eje ejeVar = i212 == 4 ? (eje) ejbVar.c : eje.a;
                                                                                    jkj k8 = lhb.a.k();
                                                                                    if (!ejeVar.c.equals(((emq) envVar2.b).b())) {
                                                                                        String str11 = ejeVar.c;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar = (lhb) k8.b;
                                                                                        str11.getClass();
                                                                                        lhbVar.b |= 1;
                                                                                        lhbVar.c = str11;
                                                                                        i22 = 1;
                                                                                    }
                                                                                    if (ejeVar.d != ((emp) envVar2.c).a().intValue()) {
                                                                                        int i28 = ejeVar.d;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar2 = (lhb) k8.b;
                                                                                        lhbVar2.b = 2 | lhbVar2.b;
                                                                                        lhbVar2.d = i28;
                                                                                        i22 = 1;
                                                                                    }
                                                                                    if (ejeVar.e != ((Integer) envVar2.d.b()).intValue()) {
                                                                                        int i29 = ejeVar.e;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar3 = (lhb) k8.b;
                                                                                        lhbVar3.b = 4 | lhbVar3.b;
                                                                                        lhbVar3.e = i29;
                                                                                    } else {
                                                                                        i25 = i22;
                                                                                    }
                                                                                    if (ejeVar.f != Build.VERSION.SDK_INT) {
                                                                                        int i30 = ejeVar.f;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar4 = (lhb) k8.b;
                                                                                        lhbVar4.b |= 8;
                                                                                        lhbVar4.f = i30;
                                                                                    } else if (i25 != 0) {
                                                                                    }
                                                                                    lhb lhbVar5 = (lhb) k8.q();
                                                                                    if (!jkjVar4.b.M()) {
                                                                                        jkjVar4.t();
                                                                                    }
                                                                                    leg legVar11 = (leg) jkjVar4.b;
                                                                                    leg legVar12 = leg.a;
                                                                                    lhbVar5.getClass();
                                                                                    legVar11.o = lhbVar5;
                                                                                    legVar11.b |= 4096;
                                                                                }
                                                                            } else if ((((leg) jkjVar4.b).b & 512) != 0 && ((Boolean) envVar2.h.b()).booleanValue()) {
                                                                                ejd ejdVar = ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a;
                                                                                koe koeVar2 = envVar2.j;
                                                                                List list = ejdVar.c;
                                                                                if (((Long) koeVar2.b()).longValue() >= 0) {
                                                                                    Instant minusSeconds = Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar2.b()).longValue());
                                                                                    jmh jmhVar2 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                                    if (jmhVar2 == null) {
                                                                                        jmhVar2 = jmh.a;
                                                                                    }
                                                                                    if (!imk.c(jmhVar2).isBefore(minusSeconds)) {
                                                                                    }
                                                                                }
                                                                                koe koeVar3 = envVar2.i;
                                                                                if (((Long) koeVar3.b()).longValue() >= 0) {
                                                                                    Stream filter = Collection.EL.stream(list).filter(new gqj(Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar3.b()).longValue()), i25));
                                                                                    int i31 = hel.d;
                                                                                    list = (List) filter.collect(hby.a);
                                                                                }
                                                                                long longValue3 = ((Long) envVar2.k.b()).longValue();
                                                                                long longValue4 = ((Long) envVar2.l.b()).longValue();
                                                                                Iterator it11 = list.iterator();
                                                                                boolean z2 = false;
                                                                                boolean z3 = false;
                                                                                while (it11.hasNext()) {
                                                                                    int i32 = i23;
                                                                                    int i33 = ((lgx) it11.next()).c;
                                                                                    z2 |= i33 == 1;
                                                                                    z3 |= i33 == 3;
                                                                                    i23 = i32;
                                                                                }
                                                                                int i34 = i23;
                                                                                if (z2 && z3) {
                                                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java")).s("TraceContext list contains both Trace and TraceRecord");
                                                                                    int i35 = hel.d;
                                                                                    helVar = his.a;
                                                                                } else if (z2) {
                                                                                    Stream map = Collection.EL.stream(list).map(new ejs(i24));
                                                                                    int i36 = hel.d;
                                                                                    helVar = ejw.a((List) map.collect(hby.a), longValue3, longValue4);
                                                                                } else if (z3) {
                                                                                    Stream map2 = Collection.EL.stream(list).map(new ejs(i22));
                                                                                    int i37 = hel.d;
                                                                                    helVar = ejw.a((List) map2.collect(hby.a), longValue3, longValue4);
                                                                                } else {
                                                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java")).s("TraceContext list contains neither Trace nor TraceRecord");
                                                                                    int i38 = hel.d;
                                                                                    helVar = his.a;
                                                                                }
                                                                                if (!helVar.isEmpty()) {
                                                                                    jkj k9 = lgy.a.k();
                                                                                    if (!k9.b.M()) {
                                                                                        k9.t();
                                                                                    }
                                                                                    lgy lgyVar = (lgy) k9.b;
                                                                                    jkx jkxVar5 = lgyVar.c;
                                                                                    if (!jkxVar5.c()) {
                                                                                        lgyVar.c = jkp.A(jkxVar5);
                                                                                    }
                                                                                    jiz.f(helVar, lgyVar.c);
                                                                                    jmh jmhVar3 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                                    if (jmhVar3 == null) {
                                                                                        jmhVar3 = jmh.a;
                                                                                    }
                                                                                    if (!k9.b.M()) {
                                                                                        k9.t();
                                                                                    }
                                                                                    jkp jkpVar4 = k9.b;
                                                                                    lgy lgyVar2 = (lgy) jkpVar4;
                                                                                    jmhVar3.getClass();
                                                                                    lgyVar2.d = jmhVar3;
                                                                                    lgyVar2.b |= 1;
                                                                                    int x = a.x((ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).e);
                                                                                    if (x == 0) {
                                                                                        x = 1;
                                                                                    }
                                                                                    int i39 = x - 1;
                                                                                    if (i39 == 0) {
                                                                                        i24 = 1;
                                                                                    } else if (i39 == 1) {
                                                                                        i24 = i34;
                                                                                    }
                                                                                    if (!jkpVar4.M()) {
                                                                                        k9.t();
                                                                                    }
                                                                                    lgy lgyVar3 = (lgy) k9.b;
                                                                                    lgyVar3.e = i24 - 1;
                                                                                    lgyVar3.b |= 2;
                                                                                    lgy lgyVar4 = (lgy) k9.q();
                                                                                    if (!jkjVar4.b.M()) {
                                                                                        jkjVar4.t();
                                                                                    }
                                                                                    leg legVar13 = (leg) jkjVar4.b;
                                                                                    lgyVar4.getClass();
                                                                                    legVar13.n = lgyVar4;
                                                                                    legVar13.b |= 2048;
                                                                                }
                                                                            }
                                                                        } else if ((((leg) jkjVar4.b).b & 1024) != 0) {
                                                                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 220, "ApplicationExitInfoCaptureImpl.java")).s("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                                        } else {
                                                                            lew lewVar = i212 == 1 ? (lew) ejbVar.c : lew.a;
                                                                            if (!jkjVar4.b.M()) {
                                                                                jkjVar4.t();
                                                                            }
                                                                            leg legVar14 = (leg) jkjVar4.b;
                                                                            lewVar.getClass();
                                                                            legVar14.m = lewVar;
                                                                            legVar14.b |= 1024;
                                                                        }
                                                                    }
                                                                    return (leg) jkjVar4.q();
                                                                }
                                                            }, huf.a));
                                                            hegVar2 = hegVar32;
                                                            j2 = j;
                                                            string = str;
                                                            it5 = it3;
                                                            enyVar4 = enyVar3;
                                                            i10 = 4;
                                                        }
                                                    } else {
                                                        ((hkf) ((hkf) eiu.a.e()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 59, "FlightRecordReaderImpl.java")).s("Flight records directory does not exist");
                                                        aJ = hnu.aJ(gyf.a);
                                                    }
                                                } else {
                                                    aJ = hnu.aJ(gyf.a);
                                                }
                                                jkjVar = k2;
                                                final jkj jkjVar322 = jkjVar;
                                                heg hegVar322 = hegVar;
                                                hegVar322.h(hti.f(aJ, new gzf() { // from class: enu
                                                    @Override // defpackage.gzf
                                                    public final Object a(Object obj4) {
                                                        hel helVar;
                                                        gzp gzpVar = (gzp) obj4;
                                                        boolean f = gzpVar.f();
                                                        jkj jkjVar4 = jkjVar322;
                                                        if (!f) {
                                                            return (leg) jkjVar4.q();
                                                        }
                                                        for (ejb ejbVar : ((ejf) gzpVar.b()).e) {
                                                            int i212 = ejbVar.b;
                                                            int i22 = 0;
                                                            int i23 = 2;
                                                            int i24 = 3;
                                                            int i25 = 1;
                                                            int i26 = i212 != 0 ? i212 != 1 ? i212 != 2 ? i212 != 3 ? i212 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                            if (i26 == 0) {
                                                                throw null;
                                                            }
                                                            int i27 = i26 - 1;
                                                            env envVar2 = env.this;
                                                            if (i27 != 0) {
                                                                if (i27 == 1) {
                                                                    jmh jmhVar = (i212 == 2 ? (ejc) ejbVar.c : ejc.a).c;
                                                                    if (jmhVar == null) {
                                                                        jmhVar = jmh.a;
                                                                    }
                                                                    long a4 = jmx.a(jmhVar);
                                                                    if (!jkjVar4.b.M()) {
                                                                        jkjVar4.t();
                                                                    }
                                                                    leg legVar92 = (leg) jkjVar4.b;
                                                                    leg legVar10 = leg.a;
                                                                    legVar92.b |= 32;
                                                                    legVar92.h = a4;
                                                                } else if (i27 != 2) {
                                                                    if (i27 == 3) {
                                                                        eje ejeVar = i212 == 4 ? (eje) ejbVar.c : eje.a;
                                                                        jkj k8 = lhb.a.k();
                                                                        if (!ejeVar.c.equals(((emq) envVar2.b).b())) {
                                                                            String str11 = ejeVar.c;
                                                                            if (!k8.b.M()) {
                                                                                k8.t();
                                                                            }
                                                                            lhb lhbVar = (lhb) k8.b;
                                                                            str11.getClass();
                                                                            lhbVar.b |= 1;
                                                                            lhbVar.c = str11;
                                                                            i22 = 1;
                                                                        }
                                                                        if (ejeVar.d != ((emp) envVar2.c).a().intValue()) {
                                                                            int i28 = ejeVar.d;
                                                                            if (!k8.b.M()) {
                                                                                k8.t();
                                                                            }
                                                                            lhb lhbVar2 = (lhb) k8.b;
                                                                            lhbVar2.b = 2 | lhbVar2.b;
                                                                            lhbVar2.d = i28;
                                                                            i22 = 1;
                                                                        }
                                                                        if (ejeVar.e != ((Integer) envVar2.d.b()).intValue()) {
                                                                            int i29 = ejeVar.e;
                                                                            if (!k8.b.M()) {
                                                                                k8.t();
                                                                            }
                                                                            lhb lhbVar3 = (lhb) k8.b;
                                                                            lhbVar3.b = 4 | lhbVar3.b;
                                                                            lhbVar3.e = i29;
                                                                        } else {
                                                                            i25 = i22;
                                                                        }
                                                                        if (ejeVar.f != Build.VERSION.SDK_INT) {
                                                                            int i30 = ejeVar.f;
                                                                            if (!k8.b.M()) {
                                                                                k8.t();
                                                                            }
                                                                            lhb lhbVar4 = (lhb) k8.b;
                                                                            lhbVar4.b |= 8;
                                                                            lhbVar4.f = i30;
                                                                        } else if (i25 != 0) {
                                                                        }
                                                                        lhb lhbVar5 = (lhb) k8.q();
                                                                        if (!jkjVar4.b.M()) {
                                                                            jkjVar4.t();
                                                                        }
                                                                        leg legVar11 = (leg) jkjVar4.b;
                                                                        leg legVar12 = leg.a;
                                                                        lhbVar5.getClass();
                                                                        legVar11.o = lhbVar5;
                                                                        legVar11.b |= 4096;
                                                                    }
                                                                } else if ((((leg) jkjVar4.b).b & 512) != 0 && ((Boolean) envVar2.h.b()).booleanValue()) {
                                                                    ejd ejdVar = ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a;
                                                                    koe koeVar2 = envVar2.j;
                                                                    List list = ejdVar.c;
                                                                    if (((Long) koeVar2.b()).longValue() >= 0) {
                                                                        Instant minusSeconds = Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar2.b()).longValue());
                                                                        jmh jmhVar2 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                        if (jmhVar2 == null) {
                                                                            jmhVar2 = jmh.a;
                                                                        }
                                                                        if (!imk.c(jmhVar2).isBefore(minusSeconds)) {
                                                                        }
                                                                    }
                                                                    koe koeVar3 = envVar2.i;
                                                                    if (((Long) koeVar3.b()).longValue() >= 0) {
                                                                        Stream filter = Collection.EL.stream(list).filter(new gqj(Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar3.b()).longValue()), i25));
                                                                        int i31 = hel.d;
                                                                        list = (List) filter.collect(hby.a);
                                                                    }
                                                                    long longValue3 = ((Long) envVar2.k.b()).longValue();
                                                                    long longValue4 = ((Long) envVar2.l.b()).longValue();
                                                                    Iterator it11 = list.iterator();
                                                                    boolean z2 = false;
                                                                    boolean z3 = false;
                                                                    while (it11.hasNext()) {
                                                                        int i32 = i23;
                                                                        int i33 = ((lgx) it11.next()).c;
                                                                        z2 |= i33 == 1;
                                                                        z3 |= i33 == 3;
                                                                        i23 = i32;
                                                                    }
                                                                    int i34 = i23;
                                                                    if (z2 && z3) {
                                                                        ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java")).s("TraceContext list contains both Trace and TraceRecord");
                                                                        int i35 = hel.d;
                                                                        helVar = his.a;
                                                                    } else if (z2) {
                                                                        Stream map = Collection.EL.stream(list).map(new ejs(i24));
                                                                        int i36 = hel.d;
                                                                        helVar = ejw.a((List) map.collect(hby.a), longValue3, longValue4);
                                                                    } else if (z3) {
                                                                        Stream map2 = Collection.EL.stream(list).map(new ejs(i22));
                                                                        int i37 = hel.d;
                                                                        helVar = ejw.a((List) map2.collect(hby.a), longValue3, longValue4);
                                                                    } else {
                                                                        ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java")).s("TraceContext list contains neither Trace nor TraceRecord");
                                                                        int i38 = hel.d;
                                                                        helVar = his.a;
                                                                    }
                                                                    if (!helVar.isEmpty()) {
                                                                        jkj k9 = lgy.a.k();
                                                                        if (!k9.b.M()) {
                                                                            k9.t();
                                                                        }
                                                                        lgy lgyVar = (lgy) k9.b;
                                                                        jkx jkxVar5 = lgyVar.c;
                                                                        if (!jkxVar5.c()) {
                                                                            lgyVar.c = jkp.A(jkxVar5);
                                                                        }
                                                                        jiz.f(helVar, lgyVar.c);
                                                                        jmh jmhVar3 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                        if (jmhVar3 == null) {
                                                                            jmhVar3 = jmh.a;
                                                                        }
                                                                        if (!k9.b.M()) {
                                                                            k9.t();
                                                                        }
                                                                        jkp jkpVar4 = k9.b;
                                                                        lgy lgyVar2 = (lgy) jkpVar4;
                                                                        jmhVar3.getClass();
                                                                        lgyVar2.d = jmhVar3;
                                                                        lgyVar2.b |= 1;
                                                                        int x = a.x((ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).e);
                                                                        if (x == 0) {
                                                                            x = 1;
                                                                        }
                                                                        int i39 = x - 1;
                                                                        if (i39 == 0) {
                                                                            i24 = 1;
                                                                        } else if (i39 == 1) {
                                                                            i24 = i34;
                                                                        }
                                                                        if (!jkpVar4.M()) {
                                                                            k9.t();
                                                                        }
                                                                        lgy lgyVar3 = (lgy) k9.b;
                                                                        lgyVar3.e = i24 - 1;
                                                                        lgyVar3.b |= 2;
                                                                        lgy lgyVar4 = (lgy) k9.q();
                                                                        if (!jkjVar4.b.M()) {
                                                                            jkjVar4.t();
                                                                        }
                                                                        leg legVar13 = (leg) jkjVar4.b;
                                                                        lgyVar4.getClass();
                                                                        legVar13.n = lgyVar4;
                                                                        legVar13.b |= 2048;
                                                                    }
                                                                }
                                                            } else if ((((leg) jkjVar4.b).b & 1024) != 0) {
                                                                ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 220, "ApplicationExitInfoCaptureImpl.java")).s("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                            } else {
                                                                lew lewVar = i212 == 1 ? (lew) ejbVar.c : lew.a;
                                                                if (!jkjVar4.b.M()) {
                                                                    jkjVar4.t();
                                                                }
                                                                leg legVar14 = (leg) jkjVar4.b;
                                                                lewVar.getClass();
                                                                legVar14.m = lewVar;
                                                                legVar14.b |= 1024;
                                                            }
                                                        }
                                                        return (leg) jkjVar4.q();
                                                    }
                                                }, huf.a));
                                                hegVar2 = hegVar322;
                                                j2 = j;
                                                string = str;
                                                it5 = it3;
                                                enyVar4 = enyVar3;
                                                i10 = 4;
                                            } catch (Throwable th19) {
                                                th = th19;
                                                enyVar3 = enyVar4;
                                            }
                                        }
                                        hegVar = hegVar2;
                                        str3 = "ApplicationExitInfoCaptureImpl.java";
                                        inputStream = traceInputStream;
                                        it3 = it5;
                                        str2 = "ApplicationExitInfoCaptureImpl.java";
                                        applicationExitInfo = m;
                                        file = null;
                                        i5 = 0;
                                        th = th;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th20) {
                                                th.addSuppressed(th20);
                                            }
                                        }
                                        throw th;
                                    }
                                } else if (i11 == 6) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        try {
                                            traceInputStream2 = m.getTraceInputStream();
                                            try {
                                                description2 = m.getDescription();
                                                if (traceInputStream2 != null && !hoq.S(description2)) {
                                                    jjq z2 = jjq.z(traceInputStream2);
                                                    koe koeVar2 = envVar.f;
                                                    try {
                                                        try {
                                                            if (((Long) koeVar2.b()).longValue() >= 0) {
                                                                j = j2;
                                                                try {
                                                                    if (z2.c() > ((Long) koeVar2.b()).longValue()) {
                                                                        traceInputStream2.close();
                                                                    }
                                                                } catch (Throwable th21) {
                                                                    th = th21;
                                                                    Throwable th22 = th;
                                                                    if (traceInputStream2 != null) {
                                                                        try {
                                                                            traceInputStream2.close();
                                                                        } catch (Throwable th23) {
                                                                            th22.addSuppressed(th23);
                                                                        }
                                                                    }
                                                                    throw th22;
                                                                }
                                                            } else {
                                                                j = j2;
                                                            }
                                                            traceInputStream2.close();
                                                        } catch (IOException e6) {
                                                            e = e6;
                                                            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", (char) 369, "ApplicationExitInfoCaptureImpl.java")).s("Failed to read ANR trace");
                                                            enyVar3 = enyVar4;
                                                            str = string;
                                                            hegVar = hegVar2;
                                                            it3 = it5;
                                                            str2 = "ApplicationExitInfoCaptureImpl.java";
                                                            applicationExitInfo = m;
                                                            file = null;
                                                            i5 = 0;
                                                            importance = applicationExitInfo.getImportance();
                                                            if (importance == 100) {
                                                            }
                                                            if (i6 != 0) {
                                                            }
                                                            eqmVar = envVar.o;
                                                            pid = applicationExitInfo.getPid();
                                                            timestamp2 = applicationExitInfo.getTimestamp();
                                                            jmh b22 = jmx.b(timestamp2);
                                                            if (((Boolean) eqmVar.c.b()).booleanValue()) {
                                                            }
                                                            jkjVar = k2;
                                                            final jkj jkjVar3222 = jkjVar;
                                                            heg hegVar3222 = hegVar;
                                                            hegVar3222.h(hti.f(aJ, new gzf() { // from class: enu
                                                                @Override // defpackage.gzf
                                                                public final Object a(Object obj4) {
                                                                    hel helVar;
                                                                    gzp gzpVar = (gzp) obj4;
                                                                    boolean f = gzpVar.f();
                                                                    jkj jkjVar4 = jkjVar3222;
                                                                    if (!f) {
                                                                        return (leg) jkjVar4.q();
                                                                    }
                                                                    for (ejb ejbVar : ((ejf) gzpVar.b()).e) {
                                                                        int i212 = ejbVar.b;
                                                                        int i22 = 0;
                                                                        int i23 = 2;
                                                                        int i24 = 3;
                                                                        int i25 = 1;
                                                                        int i26 = i212 != 0 ? i212 != 1 ? i212 != 2 ? i212 != 3 ? i212 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                                        if (i26 == 0) {
                                                                            throw null;
                                                                        }
                                                                        int i27 = i26 - 1;
                                                                        env envVar2 = env.this;
                                                                        if (i27 != 0) {
                                                                            if (i27 == 1) {
                                                                                jmh jmhVar = (i212 == 2 ? (ejc) ejbVar.c : ejc.a).c;
                                                                                if (jmhVar == null) {
                                                                                    jmhVar = jmh.a;
                                                                                }
                                                                                long a4 = jmx.a(jmhVar);
                                                                                if (!jkjVar4.b.M()) {
                                                                                    jkjVar4.t();
                                                                                }
                                                                                leg legVar92 = (leg) jkjVar4.b;
                                                                                leg legVar10 = leg.a;
                                                                                legVar92.b |= 32;
                                                                                legVar92.h = a4;
                                                                            } else if (i27 != 2) {
                                                                                if (i27 == 3) {
                                                                                    eje ejeVar = i212 == 4 ? (eje) ejbVar.c : eje.a;
                                                                                    jkj k8 = lhb.a.k();
                                                                                    if (!ejeVar.c.equals(((emq) envVar2.b).b())) {
                                                                                        String str11 = ejeVar.c;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar = (lhb) k8.b;
                                                                                        str11.getClass();
                                                                                        lhbVar.b |= 1;
                                                                                        lhbVar.c = str11;
                                                                                        i22 = 1;
                                                                                    }
                                                                                    if (ejeVar.d != ((emp) envVar2.c).a().intValue()) {
                                                                                        int i28 = ejeVar.d;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar2 = (lhb) k8.b;
                                                                                        lhbVar2.b = 2 | lhbVar2.b;
                                                                                        lhbVar2.d = i28;
                                                                                        i22 = 1;
                                                                                    }
                                                                                    if (ejeVar.e != ((Integer) envVar2.d.b()).intValue()) {
                                                                                        int i29 = ejeVar.e;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar3 = (lhb) k8.b;
                                                                                        lhbVar3.b = 4 | lhbVar3.b;
                                                                                        lhbVar3.e = i29;
                                                                                    } else {
                                                                                        i25 = i22;
                                                                                    }
                                                                                    if (ejeVar.f != Build.VERSION.SDK_INT) {
                                                                                        int i30 = ejeVar.f;
                                                                                        if (!k8.b.M()) {
                                                                                            k8.t();
                                                                                        }
                                                                                        lhb lhbVar4 = (lhb) k8.b;
                                                                                        lhbVar4.b |= 8;
                                                                                        lhbVar4.f = i30;
                                                                                    } else if (i25 != 0) {
                                                                                    }
                                                                                    lhb lhbVar5 = (lhb) k8.q();
                                                                                    if (!jkjVar4.b.M()) {
                                                                                        jkjVar4.t();
                                                                                    }
                                                                                    leg legVar11 = (leg) jkjVar4.b;
                                                                                    leg legVar12 = leg.a;
                                                                                    lhbVar5.getClass();
                                                                                    legVar11.o = lhbVar5;
                                                                                    legVar11.b |= 4096;
                                                                                }
                                                                            } else if ((((leg) jkjVar4.b).b & 512) != 0 && ((Boolean) envVar2.h.b()).booleanValue()) {
                                                                                ejd ejdVar = ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a;
                                                                                koe koeVar22 = envVar2.j;
                                                                                List list = ejdVar.c;
                                                                                if (((Long) koeVar22.b()).longValue() >= 0) {
                                                                                    Instant minusSeconds = Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar22.b()).longValue());
                                                                                    jmh jmhVar2 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                                    if (jmhVar2 == null) {
                                                                                        jmhVar2 = jmh.a;
                                                                                    }
                                                                                    if (!imk.c(jmhVar2).isBefore(minusSeconds)) {
                                                                                    }
                                                                                }
                                                                                koe koeVar3 = envVar2.i;
                                                                                if (((Long) koeVar3.b()).longValue() >= 0) {
                                                                                    Stream filter = Collection.EL.stream(list).filter(new gqj(Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar3.b()).longValue()), i25));
                                                                                    int i31 = hel.d;
                                                                                    list = (List) filter.collect(hby.a);
                                                                                }
                                                                                long longValue3 = ((Long) envVar2.k.b()).longValue();
                                                                                long longValue4 = ((Long) envVar2.l.b()).longValue();
                                                                                Iterator it11 = list.iterator();
                                                                                boolean z22 = false;
                                                                                boolean z3 = false;
                                                                                while (it11.hasNext()) {
                                                                                    int i32 = i23;
                                                                                    int i33 = ((lgx) it11.next()).c;
                                                                                    z22 |= i33 == 1;
                                                                                    z3 |= i33 == 3;
                                                                                    i23 = i32;
                                                                                }
                                                                                int i34 = i23;
                                                                                if (z22 && z3) {
                                                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java")).s("TraceContext list contains both Trace and TraceRecord");
                                                                                    int i35 = hel.d;
                                                                                    helVar = his.a;
                                                                                } else if (z22) {
                                                                                    Stream map = Collection.EL.stream(list).map(new ejs(i24));
                                                                                    int i36 = hel.d;
                                                                                    helVar = ejw.a((List) map.collect(hby.a), longValue3, longValue4);
                                                                                } else if (z3) {
                                                                                    Stream map2 = Collection.EL.stream(list).map(new ejs(i22));
                                                                                    int i37 = hel.d;
                                                                                    helVar = ejw.a((List) map2.collect(hby.a), longValue3, longValue4);
                                                                                } else {
                                                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java")).s("TraceContext list contains neither Trace nor TraceRecord");
                                                                                    int i38 = hel.d;
                                                                                    helVar = his.a;
                                                                                }
                                                                                if (!helVar.isEmpty()) {
                                                                                    jkj k9 = lgy.a.k();
                                                                                    if (!k9.b.M()) {
                                                                                        k9.t();
                                                                                    }
                                                                                    lgy lgyVar = (lgy) k9.b;
                                                                                    jkx jkxVar5 = lgyVar.c;
                                                                                    if (!jkxVar5.c()) {
                                                                                        lgyVar.c = jkp.A(jkxVar5);
                                                                                    }
                                                                                    jiz.f(helVar, lgyVar.c);
                                                                                    jmh jmhVar3 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                                                    if (jmhVar3 == null) {
                                                                                        jmhVar3 = jmh.a;
                                                                                    }
                                                                                    if (!k9.b.M()) {
                                                                                        k9.t();
                                                                                    }
                                                                                    jkp jkpVar4 = k9.b;
                                                                                    lgy lgyVar2 = (lgy) jkpVar4;
                                                                                    jmhVar3.getClass();
                                                                                    lgyVar2.d = jmhVar3;
                                                                                    lgyVar2.b |= 1;
                                                                                    int x = a.x((ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).e);
                                                                                    if (x == 0) {
                                                                                        x = 1;
                                                                                    }
                                                                                    int i39 = x - 1;
                                                                                    if (i39 == 0) {
                                                                                        i24 = 1;
                                                                                    } else if (i39 == 1) {
                                                                                        i24 = i34;
                                                                                    }
                                                                                    if (!jkpVar4.M()) {
                                                                                        k9.t();
                                                                                    }
                                                                                    lgy lgyVar3 = (lgy) k9.b;
                                                                                    lgyVar3.e = i24 - 1;
                                                                                    lgyVar3.b |= 2;
                                                                                    lgy lgyVar4 = (lgy) k9.q();
                                                                                    if (!jkjVar4.b.M()) {
                                                                                        jkjVar4.t();
                                                                                    }
                                                                                    leg legVar13 = (leg) jkjVar4.b;
                                                                                    lgyVar4.getClass();
                                                                                    legVar13.n = lgyVar4;
                                                                                    legVar13.b |= 2048;
                                                                                }
                                                                            }
                                                                        } else if ((((leg) jkjVar4.b).b & 1024) != 0) {
                                                                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 220, "ApplicationExitInfoCaptureImpl.java")).s("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                                        } else {
                                                                            lew lewVar = i212 == 1 ? (lew) ejbVar.c : lew.a;
                                                                            if (!jkjVar4.b.M()) {
                                                                                jkjVar4.t();
                                                                            }
                                                                            leg legVar14 = (leg) jkjVar4.b;
                                                                            lewVar.getClass();
                                                                            legVar14.m = lewVar;
                                                                            legVar14.b |= 1024;
                                                                        }
                                                                    }
                                                                    return (leg) jkjVar4.q();
                                                                }
                                                            }, huf.a));
                                                            hegVar2 = hegVar3222;
                                                            j2 = j;
                                                            string = str;
                                                            it5 = it3;
                                                            enyVar4 = enyVar3;
                                                            i10 = 4;
                                                        }
                                                        z2.j(gZIPOutputStream);
                                                        gZIPOutputStream.close();
                                                        jjq b3 = jjpVar.b();
                                                        koe koeVar3 = envVar.g;
                                                        if (((Long) koeVar3.b()).longValue() < 0 || b3.c() <= ((Long) koeVar3.b()).longValue()) {
                                                            if (!k.b.M()) {
                                                                k.t();
                                                            }
                                                            lef lefVar = (lef) k.b;
                                                            b3.getClass();
                                                            lefVar.c = 5;
                                                            lefVar.d = b3;
                                                            lef lefVar2 = (lef) k.q();
                                                            if (!k2.b.M()) {
                                                                k2.t();
                                                            }
                                                            leg legVar10 = (leg) k2.b;
                                                            lefVar2.getClass();
                                                            legVar10.l = lefVar2;
                                                            legVar10.b |= 512;
                                                        }
                                                    } finally {
                                                    }
                                                    k = lef.a.k();
                                                    if (!k.b.M()) {
                                                        k.t();
                                                    }
                                                    lef lefVar3 = (lef) k.b;
                                                    description2.getClass();
                                                    lefVar3.b |= 1;
                                                    lefVar3.e = description2;
                                                    if (Build.VERSION.SDK_INT >= 37 && ((Boolean) envVar.e.b()).booleanValue() && anrInfo != null) {
                                                        isUserPerceptible = anrInfo.isUserPerceptible();
                                                        if (!k.b.M()) {
                                                            k.t();
                                                        }
                                                        lef lefVar4 = (lef) k.b;
                                                        lefVar4.b |= 8;
                                                        lefVar4.f = isUserPerceptible;
                                                    }
                                                    jjpVar = new jjp();
                                                    gZIPOutputStream = new GZIPOutputStream(jjpVar);
                                                }
                                                j = j2;
                                            } catch (Throwable th24) {
                                                th = th24;
                                                j = j2;
                                            }
                                        } catch (IOException e7) {
                                            e = e7;
                                            j = j2;
                                        }
                                    } else {
                                        j = j2;
                                    }
                                }
                                enyVar3 = enyVar4;
                                str = string;
                                hegVar = hegVar2;
                                it3 = it5;
                                str2 = "ApplicationExitInfoCaptureImpl.java";
                                applicationExitInfo = m;
                                file = null;
                                i5 = 0;
                                importance = applicationExitInfo.getImportance();
                                if (importance == 100) {
                                }
                                if (i6 != 0) {
                                }
                                eqmVar = envVar.o;
                                pid = applicationExitInfo.getPid();
                                timestamp2 = applicationExitInfo.getTimestamp();
                                jmh b222 = jmx.b(timestamp2);
                                if (((Boolean) eqmVar.c.b()).booleanValue()) {
                                }
                                jkjVar = k2;
                                final jkj jkjVar32222 = jkjVar;
                                heg hegVar32222 = hegVar;
                                hegVar32222.h(hti.f(aJ, new gzf() { // from class: enu
                                    @Override // defpackage.gzf
                                    public final Object a(Object obj4) {
                                        hel helVar;
                                        gzp gzpVar = (gzp) obj4;
                                        boolean f = gzpVar.f();
                                        jkj jkjVar4 = jkjVar32222;
                                        if (!f) {
                                            return (leg) jkjVar4.q();
                                        }
                                        for (ejb ejbVar : ((ejf) gzpVar.b()).e) {
                                            int i212 = ejbVar.b;
                                            int i22 = 0;
                                            int i23 = 2;
                                            int i24 = 3;
                                            int i25 = 1;
                                            int i26 = i212 != 0 ? i212 != 1 ? i212 != 2 ? i212 != 3 ? i212 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                            if (i26 == 0) {
                                                throw null;
                                            }
                                            int i27 = i26 - 1;
                                            env envVar2 = env.this;
                                            if (i27 != 0) {
                                                if (i27 == 1) {
                                                    jmh jmhVar = (i212 == 2 ? (ejc) ejbVar.c : ejc.a).c;
                                                    if (jmhVar == null) {
                                                        jmhVar = jmh.a;
                                                    }
                                                    long a4 = jmx.a(jmhVar);
                                                    if (!jkjVar4.b.M()) {
                                                        jkjVar4.t();
                                                    }
                                                    leg legVar92 = (leg) jkjVar4.b;
                                                    leg legVar102 = leg.a;
                                                    legVar92.b |= 32;
                                                    legVar92.h = a4;
                                                } else if (i27 != 2) {
                                                    if (i27 == 3) {
                                                        eje ejeVar = i212 == 4 ? (eje) ejbVar.c : eje.a;
                                                        jkj k8 = lhb.a.k();
                                                        if (!ejeVar.c.equals(((emq) envVar2.b).b())) {
                                                            String str11 = ejeVar.c;
                                                            if (!k8.b.M()) {
                                                                k8.t();
                                                            }
                                                            lhb lhbVar = (lhb) k8.b;
                                                            str11.getClass();
                                                            lhbVar.b |= 1;
                                                            lhbVar.c = str11;
                                                            i22 = 1;
                                                        }
                                                        if (ejeVar.d != ((emp) envVar2.c).a().intValue()) {
                                                            int i28 = ejeVar.d;
                                                            if (!k8.b.M()) {
                                                                k8.t();
                                                            }
                                                            lhb lhbVar2 = (lhb) k8.b;
                                                            lhbVar2.b = 2 | lhbVar2.b;
                                                            lhbVar2.d = i28;
                                                            i22 = 1;
                                                        }
                                                        if (ejeVar.e != ((Integer) envVar2.d.b()).intValue()) {
                                                            int i29 = ejeVar.e;
                                                            if (!k8.b.M()) {
                                                                k8.t();
                                                            }
                                                            lhb lhbVar3 = (lhb) k8.b;
                                                            lhbVar3.b = 4 | lhbVar3.b;
                                                            lhbVar3.e = i29;
                                                        } else {
                                                            i25 = i22;
                                                        }
                                                        if (ejeVar.f != Build.VERSION.SDK_INT) {
                                                            int i30 = ejeVar.f;
                                                            if (!k8.b.M()) {
                                                                k8.t();
                                                            }
                                                            lhb lhbVar4 = (lhb) k8.b;
                                                            lhbVar4.b |= 8;
                                                            lhbVar4.f = i30;
                                                        } else if (i25 != 0) {
                                                        }
                                                        lhb lhbVar5 = (lhb) k8.q();
                                                        if (!jkjVar4.b.M()) {
                                                            jkjVar4.t();
                                                        }
                                                        leg legVar11 = (leg) jkjVar4.b;
                                                        leg legVar12 = leg.a;
                                                        lhbVar5.getClass();
                                                        legVar11.o = lhbVar5;
                                                        legVar11.b |= 4096;
                                                    }
                                                } else if ((((leg) jkjVar4.b).b & 512) != 0 && ((Boolean) envVar2.h.b()).booleanValue()) {
                                                    ejd ejdVar = ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a;
                                                    koe koeVar22 = envVar2.j;
                                                    List list = ejdVar.c;
                                                    if (((Long) koeVar22.b()).longValue() >= 0) {
                                                        Instant minusSeconds = Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar22.b()).longValue());
                                                        jmh jmhVar2 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                        if (jmhVar2 == null) {
                                                            jmhVar2 = jmh.a;
                                                        }
                                                        if (!imk.c(jmhVar2).isBefore(minusSeconds)) {
                                                        }
                                                    }
                                                    koe koeVar32 = envVar2.i;
                                                    if (((Long) koeVar32.b()).longValue() >= 0) {
                                                        Stream filter = Collection.EL.stream(list).filter(new gqj(Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar32.b()).longValue()), i25));
                                                        int i31 = hel.d;
                                                        list = (List) filter.collect(hby.a);
                                                    }
                                                    long longValue3 = ((Long) envVar2.k.b()).longValue();
                                                    long longValue4 = ((Long) envVar2.l.b()).longValue();
                                                    Iterator it11 = list.iterator();
                                                    boolean z22 = false;
                                                    boolean z3 = false;
                                                    while (it11.hasNext()) {
                                                        int i32 = i23;
                                                        int i33 = ((lgx) it11.next()).c;
                                                        z22 |= i33 == 1;
                                                        z3 |= i33 == 3;
                                                        i23 = i32;
                                                    }
                                                    int i34 = i23;
                                                    if (z22 && z3) {
                                                        ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java")).s("TraceContext list contains both Trace and TraceRecord");
                                                        int i35 = hel.d;
                                                        helVar = his.a;
                                                    } else if (z22) {
                                                        Stream map = Collection.EL.stream(list).map(new ejs(i24));
                                                        int i36 = hel.d;
                                                        helVar = ejw.a((List) map.collect(hby.a), longValue3, longValue4);
                                                    } else if (z3) {
                                                        Stream map2 = Collection.EL.stream(list).map(new ejs(i22));
                                                        int i37 = hel.d;
                                                        helVar = ejw.a((List) map2.collect(hby.a), longValue3, longValue4);
                                                    } else {
                                                        ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java")).s("TraceContext list contains neither Trace nor TraceRecord");
                                                        int i38 = hel.d;
                                                        helVar = his.a;
                                                    }
                                                    if (!helVar.isEmpty()) {
                                                        jkj k9 = lgy.a.k();
                                                        if (!k9.b.M()) {
                                                            k9.t();
                                                        }
                                                        lgy lgyVar = (lgy) k9.b;
                                                        jkx jkxVar5 = lgyVar.c;
                                                        if (!jkxVar5.c()) {
                                                            lgyVar.c = jkp.A(jkxVar5);
                                                        }
                                                        jiz.f(helVar, lgyVar.c);
                                                        jmh jmhVar3 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                        if (jmhVar3 == null) {
                                                            jmhVar3 = jmh.a;
                                                        }
                                                        if (!k9.b.M()) {
                                                            k9.t();
                                                        }
                                                        jkp jkpVar4 = k9.b;
                                                        lgy lgyVar2 = (lgy) jkpVar4;
                                                        jmhVar3.getClass();
                                                        lgyVar2.d = jmhVar3;
                                                        lgyVar2.b |= 1;
                                                        int x = a.x((ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).e);
                                                        if (x == 0) {
                                                            x = 1;
                                                        }
                                                        int i39 = x - 1;
                                                        if (i39 == 0) {
                                                            i24 = 1;
                                                        } else if (i39 == 1) {
                                                            i24 = i34;
                                                        }
                                                        if (!jkpVar4.M()) {
                                                            k9.t();
                                                        }
                                                        lgy lgyVar3 = (lgy) k9.b;
                                                        lgyVar3.e = i24 - 1;
                                                        lgyVar3.b |= 2;
                                                        lgy lgyVar4 = (lgy) k9.q();
                                                        if (!jkjVar4.b.M()) {
                                                            jkjVar4.t();
                                                        }
                                                        leg legVar13 = (leg) jkjVar4.b;
                                                        lgyVar4.getClass();
                                                        legVar13.n = lgyVar4;
                                                        legVar13.b |= 2048;
                                                    }
                                                }
                                            } else if ((((leg) jkjVar4.b).b & 1024) != 0) {
                                                ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 220, "ApplicationExitInfoCaptureImpl.java")).s("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                            } else {
                                                lew lewVar = i212 == 1 ? (lew) ejbVar.c : lew.a;
                                                if (!jkjVar4.b.M()) {
                                                    jkjVar4.t();
                                                }
                                                leg legVar14 = (leg) jkjVar4.b;
                                                lewVar.getClass();
                                                legVar14.m = lewVar;
                                                legVar14.b |= 1024;
                                            }
                                        }
                                        return (leg) jkjVar4.q();
                                    }
                                }, huf.a));
                                hegVar2 = hegVar32222;
                                j2 = j;
                                string = str;
                                it5 = it3;
                                enyVar4 = enyVar3;
                                i10 = 4;
                            }
                            enyVar3 = enyVar4;
                            str = string;
                            hegVar = hegVar2;
                            j = j2;
                            it3 = it5;
                            str2 = "ApplicationExitInfoCaptureImpl.java";
                            applicationExitInfo = m;
                            file = null;
                            i5 = 0;
                            importance = applicationExitInfo.getImportance();
                            if (importance == 100) {
                            }
                            if (i6 != 0) {
                            }
                            eqmVar = envVar.o;
                            pid = applicationExitInfo.getPid();
                            timestamp2 = applicationExitInfo.getTimestamp();
                            jmh b2222 = jmx.b(timestamp2);
                            if (((Boolean) eqmVar.c.b()).booleanValue()) {
                            }
                            jkjVar = k2;
                            final jkj jkjVar322222 = jkjVar;
                            heg hegVar322222 = hegVar;
                            hegVar322222.h(hti.f(aJ, new gzf() { // from class: enu
                                @Override // defpackage.gzf
                                public final Object a(Object obj4) {
                                    hel helVar;
                                    gzp gzpVar = (gzp) obj4;
                                    boolean f = gzpVar.f();
                                    jkj jkjVar4 = jkjVar322222;
                                    if (!f) {
                                        return (leg) jkjVar4.q();
                                    }
                                    for (ejb ejbVar : ((ejf) gzpVar.b()).e) {
                                        int i212 = ejbVar.b;
                                        int i22 = 0;
                                        int i23 = 2;
                                        int i24 = 3;
                                        int i25 = 1;
                                        int i26 = i212 != 0 ? i212 != 1 ? i212 != 2 ? i212 != 3 ? i212 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                        if (i26 == 0) {
                                            throw null;
                                        }
                                        int i27 = i26 - 1;
                                        env envVar2 = env.this;
                                        if (i27 != 0) {
                                            if (i27 == 1) {
                                                jmh jmhVar = (i212 == 2 ? (ejc) ejbVar.c : ejc.a).c;
                                                if (jmhVar == null) {
                                                    jmhVar = jmh.a;
                                                }
                                                long a4 = jmx.a(jmhVar);
                                                if (!jkjVar4.b.M()) {
                                                    jkjVar4.t();
                                                }
                                                leg legVar92 = (leg) jkjVar4.b;
                                                leg legVar102 = leg.a;
                                                legVar92.b |= 32;
                                                legVar92.h = a4;
                                            } else if (i27 != 2) {
                                                if (i27 == 3) {
                                                    eje ejeVar = i212 == 4 ? (eje) ejbVar.c : eje.a;
                                                    jkj k8 = lhb.a.k();
                                                    if (!ejeVar.c.equals(((emq) envVar2.b).b())) {
                                                        String str11 = ejeVar.c;
                                                        if (!k8.b.M()) {
                                                            k8.t();
                                                        }
                                                        lhb lhbVar = (lhb) k8.b;
                                                        str11.getClass();
                                                        lhbVar.b |= 1;
                                                        lhbVar.c = str11;
                                                        i22 = 1;
                                                    }
                                                    if (ejeVar.d != ((emp) envVar2.c).a().intValue()) {
                                                        int i28 = ejeVar.d;
                                                        if (!k8.b.M()) {
                                                            k8.t();
                                                        }
                                                        lhb lhbVar2 = (lhb) k8.b;
                                                        lhbVar2.b = 2 | lhbVar2.b;
                                                        lhbVar2.d = i28;
                                                        i22 = 1;
                                                    }
                                                    if (ejeVar.e != ((Integer) envVar2.d.b()).intValue()) {
                                                        int i29 = ejeVar.e;
                                                        if (!k8.b.M()) {
                                                            k8.t();
                                                        }
                                                        lhb lhbVar3 = (lhb) k8.b;
                                                        lhbVar3.b = 4 | lhbVar3.b;
                                                        lhbVar3.e = i29;
                                                    } else {
                                                        i25 = i22;
                                                    }
                                                    if (ejeVar.f != Build.VERSION.SDK_INT) {
                                                        int i30 = ejeVar.f;
                                                        if (!k8.b.M()) {
                                                            k8.t();
                                                        }
                                                        lhb lhbVar4 = (lhb) k8.b;
                                                        lhbVar4.b |= 8;
                                                        lhbVar4.f = i30;
                                                    } else if (i25 != 0) {
                                                    }
                                                    lhb lhbVar5 = (lhb) k8.q();
                                                    if (!jkjVar4.b.M()) {
                                                        jkjVar4.t();
                                                    }
                                                    leg legVar11 = (leg) jkjVar4.b;
                                                    leg legVar12 = leg.a;
                                                    lhbVar5.getClass();
                                                    legVar11.o = lhbVar5;
                                                    legVar11.b |= 4096;
                                                }
                                            } else if ((((leg) jkjVar4.b).b & 512) != 0 && ((Boolean) envVar2.h.b()).booleanValue()) {
                                                ejd ejdVar = ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a;
                                                koe koeVar22 = envVar2.j;
                                                List list = ejdVar.c;
                                                if (((Long) koeVar22.b()).longValue() >= 0) {
                                                    Instant minusSeconds = Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar22.b()).longValue());
                                                    jmh jmhVar2 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                    if (jmhVar2 == null) {
                                                        jmhVar2 = jmh.a;
                                                    }
                                                    if (!imk.c(jmhVar2).isBefore(minusSeconds)) {
                                                    }
                                                }
                                                koe koeVar32 = envVar2.i;
                                                if (((Long) koeVar32.b()).longValue() >= 0) {
                                                    Stream filter = Collection.EL.stream(list).filter(new gqj(Instant.ofEpochMilli(((leg) jkjVar4.b).g).minusSeconds(((Long) koeVar32.b()).longValue()), i25));
                                                    int i31 = hel.d;
                                                    list = (List) filter.collect(hby.a);
                                                }
                                                long longValue3 = ((Long) envVar2.k.b()).longValue();
                                                long longValue4 = ((Long) envVar2.l.b()).longValue();
                                                Iterator it11 = list.iterator();
                                                boolean z22 = false;
                                                boolean z3 = false;
                                                while (it11.hasNext()) {
                                                    int i32 = i23;
                                                    int i33 = ((lgx) it11.next()).c;
                                                    z22 |= i33 == 1;
                                                    z3 |= i33 == 3;
                                                    i23 = i32;
                                                }
                                                int i34 = i23;
                                                if (z22 && z3) {
                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java")).s("TraceContext list contains both Trace and TraceRecord");
                                                    int i35 = hel.d;
                                                    helVar = his.a;
                                                } else if (z22) {
                                                    Stream map = Collection.EL.stream(list).map(new ejs(i24));
                                                    int i36 = hel.d;
                                                    helVar = ejw.a((List) map.collect(hby.a), longValue3, longValue4);
                                                } else if (z3) {
                                                    Stream map2 = Collection.EL.stream(list).map(new ejs(i22));
                                                    int i37 = hel.d;
                                                    helVar = ejw.a((List) map2.collect(hby.a), longValue3, longValue4);
                                                } else {
                                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java")).s("TraceContext list contains neither Trace nor TraceRecord");
                                                    int i38 = hel.d;
                                                    helVar = his.a;
                                                }
                                                if (!helVar.isEmpty()) {
                                                    jkj k9 = lgy.a.k();
                                                    if (!k9.b.M()) {
                                                        k9.t();
                                                    }
                                                    lgy lgyVar = (lgy) k9.b;
                                                    jkx jkxVar5 = lgyVar.c;
                                                    if (!jkxVar5.c()) {
                                                        lgyVar.c = jkp.A(jkxVar5);
                                                    }
                                                    jiz.f(helVar, lgyVar.c);
                                                    jmh jmhVar3 = (ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).d;
                                                    if (jmhVar3 == null) {
                                                        jmhVar3 = jmh.a;
                                                    }
                                                    if (!k9.b.M()) {
                                                        k9.t();
                                                    }
                                                    jkp jkpVar4 = k9.b;
                                                    lgy lgyVar2 = (lgy) jkpVar4;
                                                    jmhVar3.getClass();
                                                    lgyVar2.d = jmhVar3;
                                                    lgyVar2.b |= 1;
                                                    int x = a.x((ejbVar.b == 3 ? (ejd) ejbVar.c : ejd.a).e);
                                                    if (x == 0) {
                                                        x = 1;
                                                    }
                                                    int i39 = x - 1;
                                                    if (i39 == 0) {
                                                        i24 = 1;
                                                    } else if (i39 == 1) {
                                                        i24 = i34;
                                                    }
                                                    if (!jkpVar4.M()) {
                                                        k9.t();
                                                    }
                                                    lgy lgyVar3 = (lgy) k9.b;
                                                    lgyVar3.e = i24 - 1;
                                                    lgyVar3.b |= 2;
                                                    lgy lgyVar4 = (lgy) k9.q();
                                                    if (!jkjVar4.b.M()) {
                                                        jkjVar4.t();
                                                    }
                                                    leg legVar13 = (leg) jkjVar4.b;
                                                    lgyVar4.getClass();
                                                    legVar13.n = lgyVar4;
                                                    legVar13.b |= 2048;
                                                }
                                            }
                                        } else if ((((leg) jkjVar4.b).b & 1024) != 0) {
                                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 220, "ApplicationExitInfoCaptureImpl.java")).s("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                        } else {
                                            lew lewVar = i212 == 1 ? (lew) ejbVar.c : lew.a;
                                            if (!jkjVar4.b.M()) {
                                                jkjVar4.t();
                                            }
                                            leg legVar14 = (leg) jkjVar4.b;
                                            lewVar.getClass();
                                            legVar14.m = lewVar;
                                            legVar14.b |= 1024;
                                        }
                                    }
                                    return (leg) jkjVar4.q();
                                }
                            }, huf.a));
                            hegVar2 = hegVar322222;
                            j2 = j;
                            string = str;
                            it5 = it3;
                            enyVar4 = enyVar3;
                            i10 = 4;
                        }
                        eny enyVar52 = enyVar4;
                        hvi aG2 = hnu.aG(hegVar2.g());
                        drv drvVar2 = new drv(18);
                        huf hufVar2 = huf.a;
                        return hti.g(hti.f(aG2, drvVar2, hufVar2), new doj(enyVar52, 3), hufVar2);
                    }
                }, enyVar2.c);
                return;
            case 10:
                ((eql) this.a).a(0);
                return;
            case 11:
                int i3 = eqi.b;
                fao.c();
                eql eqlVar = ((eqk) this.a).b;
                if (eqlVar.h != null) {
                    return;
                }
                eqlVar.h = ems.a();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i4 = eqi.b;
                fao.c();
                ?? r13 = this.a;
                eqk eqkVar = (eqk) r13;
                eql eqlVar2 = eqkVar.b;
                if (eqlVar2.i != null) {
                    return;
                }
                eqlVar2.i = ems.a();
                long j = eqlVar2.i.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    startElapsedRealtime = Process.getStartElapsedRealtime();
                    Trace.setCounter("Primes-ttfdd-end-and-length-ms", j - startElapsedRealtime);
                    Trace.setCounter("Primes-ttfdd-end-and-length-ms", 0L);
                }
                eqkVar.a.unregisterActivityLifecycleCallbacks(r13);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                fao.c();
                eql eqlVar3 = ((eqk) this.a).b;
                if (eqlVar3.k != null) {
                    return;
                }
                eqlVar3.k = ems.a();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fao.c();
                eql eqlVar4 = ((eqk) this.a).b;
                if (eqlVar4.j != null) {
                    return;
                }
                eqlVar4.j = ems.a();
                return;
            case 15:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 16:
                ((evi) this.a).a();
                return;
            case 17:
                evi eviVar = (evi) this.a;
                if (eviVar.f) {
                    etd etdVar = eviVar.c;
                    if (djl.h(etdVar.c)) {
                        evi.a.a(etdVar);
                        return;
                    }
                }
                eviVar.c();
                return;
            case 18:
                Object obj2 = this.a;
                evi eviVar2 = (evi) obj2;
                etd etdVar2 = eviVar2.c;
                hvi a = evo.b(etdVar2).a(new bso(eviVar2.d, 6), etdVar2.d());
                a.c(new evb(obj2, a, i), etdVar2.d());
                return;
            case 19:
                ((evi) this.a).c.h.a(iac.FILE, new evc());
                return;
            default:
                evf evfVar = new evf(i2);
                Object obj3 = this.a;
                Iterator it3 = ((evh) obj3).b.values().iterator();
                while (it3.hasNext()) {
                    ((bry) it3.next()).d(evfVar);
                }
                synchronized (obj3) {
                    ((evh) obj3).a = null;
                }
                return;
        }
    }
}
