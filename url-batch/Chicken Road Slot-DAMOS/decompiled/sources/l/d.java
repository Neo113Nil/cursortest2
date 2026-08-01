package l;

import a2.a0;
import android.app.ActivityManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import c7.p0;
import d6.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k1.x;
import kotlin.collections.i0;
import m.d1;
import m.z;
import n0.e2;
import n0.j1;
import n0.m2;
import n0.n1;
import n0.y0;
import s7.b2;
import s7.c0;
import s7.c2;
import s7.e0;
import s7.f1;
import s7.k1;
import s7.o4;
import s7.q1;
import s7.q2;
import s7.t0;
import s7.t3;
import s7.v0;
import s7.z1;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d implements d1, i5.b, j5.f, m6.b, n, z, o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5642d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5643e;

    public d(int i3) {
        this.f5642d = i3;
        switch (i3) {
            case 16:
                if (Build.VERSION.SDK_INT < 26) {
                    this.f5643e = new p3.g(this);
                    break;
                } else {
                    this.f5643e = new p3.h(this);
                    break;
                }
            case 19:
                this.f5643e = new EnumMap(b2.class);
                break;
            case 28:
                this.f5643e = a.a.l(Looper.getMainLooper());
                break;
            default:
                this.f5643e = Build.VERSION.SDK_INT >= 28 ? new k5.c(11) : new k5.c(12);
                break;
        }
    }

    public static d F(String str) {
        return new d(20, (TextUtils.isEmpty(str) || str.length() > 1) ? z1.UNINITIALIZED : c2.e(str.charAt(0)));
    }

    public static void o(k5.d dVar) {
        SQLiteDatabase sQLiteDatabase = dVar.f5410d;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static p0 v(k5.d dVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new e5.h("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new e5.h("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new e5.i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new e5.i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new e5.j("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new e5.j("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        e5.k kVar = new e5.k("Dependency", hashMap, hashSet, hashSet2);
        e5.k a9 = e5.k.a(dVar, "Dependency");
        if (!kVar.equals(a9)) {
            return new p0(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + kVar + "\n Found:\n" + a9, 3);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new e5.h("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new e5.h("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new e5.h("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new e5.h("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new e5.h("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new e5.h("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new e5.h("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new e5.h("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new e5.h("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new e5.h("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new e5.h("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new e5.h("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new e5.h("last_enqueue_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new e5.h("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new e5.h("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new e5.h("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new e5.h("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new e5.h("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new e5.h("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("required_network_type", new e5.h("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_charging", new e5.h("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new e5.h("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new e5.h("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new e5.h("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new e5.h("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new e5.h("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new e5.h("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new e5.j("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new e5.j("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        e5.k kVar2 = new e5.k("WorkSpec", hashMap2, hashSet3, hashSet4);
        e5.k a10 = e5.k.a(dVar, "WorkSpec");
        if (!kVar2.equals(a10)) {
            return new p0(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + kVar2 + "\n Found:\n" + a10, 3);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new e5.h("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new e5.h("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new e5.i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new e5.j("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        e5.k kVar3 = new e5.k("WorkTag", hashMap3, hashSet5, hashSet6);
        e5.k a11 = e5.k.a(dVar, "WorkTag");
        if (!kVar3.equals(a11)) {
            return new p0(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + kVar3 + "\n Found:\n" + a11, 3);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new e5.h("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new e5.h("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new e5.h("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new e5.i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e5.k kVar4 = new e5.k("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        e5.k a12 = e5.k.a(dVar, "SystemIdInfo");
        if (!kVar4.equals(a12)) {
            return new p0(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + kVar4 + "\n Found:\n" + a12, 3);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new e5.h("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new e5.h("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new e5.i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new e5.j("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        e5.k kVar5 = new e5.k("WorkName", hashMap5, hashSet8, hashSet9);
        e5.k a13 = e5.k.a(dVar, "WorkName");
        if (!kVar5.equals(a13)) {
            return new p0(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + kVar5 + "\n Found:\n" + a13, 3);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new e5.h("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new e5.h("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new e5.i("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e5.k kVar6 = new e5.k("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        e5.k a14 = e5.k.a(dVar, "WorkProgress");
        if (!kVar6.equals(a14)) {
            return new p0(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + kVar6 + "\n Found:\n" + a14, 3);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new e5.h("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new e5.h("long_value", "INTEGER", false, 0, null, 1));
        e5.k kVar7 = new e5.k("Preference", hashMap7, new HashSet(0), new HashSet(0));
        e5.k a15 = e5.k.a(dVar, "Preference");
        if (kVar7.equals(a15)) {
            return new p0(true, (String) null, 3);
        }
        return new p0(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + kVar7 + "\n Found:\n" + a15, 3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList w(java.lang.String r22, l.d r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.d.w(java.lang.String, l.d):java.util.ArrayList");
    }

    public void A(boolean z10) {
        e4.i iVar = (e4.i) ((c6.l) ((d9.c) this.f5643e).f3701e).f1830i;
        if (iVar.f3870i != z10) {
            if (iVar.f3869e != null) {
                c4.k a9 = c4.k.a();
                e4.h hVar = iVar.f3869e;
                a9.getClass();
                i7.a.A(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a9.f1757a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a9.f1758b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f3870i = z10;
            if (z10) {
                e4.i.a(iVar.f3868d, c4.k.a().b());
            }
        }
    }

    public void B() {
        t3 t3Var = (t3) this.f5643e;
        t3Var.s();
        q1 q1Var = (q1) t3Var.f1478d;
        f1 f1Var = q1Var.f8936s;
        q1.j(f1Var);
        q1Var.f8942y.getClass();
        if (f1Var.B(System.currentTimeMillis())) {
            f1 f1Var2 = q1Var.f8936s;
            q1.j(f1Var2);
            f1Var2.f8691z.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.B.a("Detected application was in foreground");
                G(System.currentTimeMillis(), q1Var.f8935r.D(null, e0.f8619e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    public void C(int i3, String str, List list, boolean z10, boolean z11) {
        t0 t0Var;
        k1 k1Var = (k1) this.f5643e;
        int i10 = i3 - 1;
        if (i10 == 0) {
            v0 v0Var = ((q1) k1Var.f1478d).f8937t;
            q1.l(v0Var);
            t0Var = v0Var.A;
        } else if (i10 != 1) {
            if (i10 == 3) {
                v0 v0Var2 = ((q1) k1Var.f1478d).f8937t;
                q1.l(v0Var2);
                t0Var = v0Var2.B;
            } else if (i10 != 4) {
                v0 v0Var3 = ((q1) k1Var.f1478d).f8937t;
                q1.l(v0Var3);
                t0Var = v0Var3.f9056z;
            } else if (z10) {
                v0 v0Var4 = ((q1) k1Var.f1478d).f8937t;
                q1.l(v0Var4);
                t0Var = v0Var4.f9054x;
            } else if (z11) {
                v0 v0Var5 = ((q1) k1Var.f1478d).f8937t;
                q1.l(v0Var5);
                t0Var = v0Var5.f9053w;
            } else {
                v0 v0Var6 = ((q1) k1Var.f1478d).f8937t;
                q1.l(v0Var6);
                t0Var = v0Var6.f9055y;
            }
        } else if (z10) {
            v0 v0Var7 = ((q1) k1Var.f1478d).f8937t;
            q1.l(v0Var7);
            t0Var = v0Var7.f9051u;
        } else if (z11) {
            v0 v0Var8 = ((q1) k1Var.f1478d).f8937t;
            q1.l(v0Var8);
            t0Var = v0Var8.f9050t;
        } else {
            v0 v0Var9 = ((q1) k1Var.f1478d).f8937t;
            q1.l(v0Var9);
            t0Var = v0Var9.f9052v;
        }
        int size = list.size();
        if (size == 1) {
            t0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            t0Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            t0Var.a(str);
        } else {
            t0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void D(long j, long j3) {
        t3 t3Var = (t3) this.f5643e;
        t3Var.s();
        t3Var.w();
        q1 q1Var = (q1) t3Var.f1478d;
        f1 f1Var = q1Var.f8936s;
        q1.j(f1Var);
        if (f1Var.B(j)) {
            q1.j(f1Var);
            f1Var.f8691z.b(true);
            q1Var.q().x();
        }
        q1.j(f1Var);
        f1Var.D.b(j);
        if (f1Var.f8691z.a()) {
            G(j, j3);
        }
    }

    public void E(b2 b2Var, int i3) {
        s7.h hVar;
        if (i3 != -30) {
            if (i3 != -20) {
                if (i3 == -10) {
                    hVar = s7.h.MANIFEST;
                } else if (i3 != 0) {
                    hVar = i3 != 30 ? s7.h.UNSET : s7.h.INITIALIZATION;
                }
            }
            hVar = s7.h.API;
        } else {
            hVar = s7.h.TCF;
        }
        ((EnumMap) this.f5643e).put((EnumMap) b2Var, (b2) hVar);
    }

    public void G(long j, long j3) {
        t3 t3Var = (t3) this.f5643e;
        t3Var.s();
        q1 q1Var = (q1) t3Var.f1478d;
        if (q1Var.c()) {
            f1 f1Var = q1Var.f8936s;
            q1.j(f1Var);
            f1Var.D.b(j);
            q1Var.f8942y.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.B.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j10 = j / 1000;
            Long valueOf = Long.valueOf(j10);
            q2 q2Var = q1Var.A;
            q1.k(q2Var);
            q2Var.D(j, valueOf, "auto", "_sid");
            q1.j(f1Var);
            f1Var.E.b(j10);
            f1Var.f8691z.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            q1.k(q2Var);
            q2Var.A(j, j3, bundle, "auto", "_s");
            String d10 = f1Var.J.d();
            if (TextUtils.isEmpty(d10)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", d10);
            q1.k(q2Var);
            q2Var.A(j, j3, bundle2, "auto", "_ssr");
        }
    }

    public void H(b2 b2Var, s7.h hVar) {
        ((EnumMap) this.f5643e).put((EnumMap) b2Var, (b2) hVar);
    }

    @Override // s7.o4
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        q2 q2Var = (q2) this.f5643e;
        if (isEmpty) {
            q2Var.w("auto", "_err", bundle);
        } else {
            q2Var.getClass();
            i0.l("Unexpected call on client side");
        }
    }

    @Override // l.n
    public void b(i iVar, boolean z10) {
        if (iVar instanceof s) {
            ((s) iVar).f5729v.j().c(false);
        }
        n nVar = ((m.j) this.f5643e).f6102s;
        if (nVar != null) {
            nVar.b(iVar, z10);
        }
    }

    @Override // i5.b
    public i5.a c(String str) {
        str.getClass();
        j5.d dVar = (j5.d) this.f5643e;
        String databaseName = dVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                a2.r.h(n0.l.g("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str)) {
            int lastIndexOf = databaseName.lastIndexOf(47, databaseName.length() - 1);
            if (lastIndexOf != -1) {
                databaseName = databaseName.substring(lastIndexOf + 1, databaseName.length());
            }
            int lastIndexOf2 = str.lastIndexOf(47, str.length() - 1);
            if (!databaseName.equals(lastIndexOf2 == -1 ? str : str.substring(lastIndexOf2 + 1, str.length()))) {
                a1.f("This driver is configured to open a database named '", dVar.getDatabaseName(), "' but '", str, "' was requested.");
                return null;
            }
        }
        return new l5.a(dVar.G());
    }

    @Override // m.d1
    public void e(i iVar, j jVar) {
        f fVar = (f) this.f5643e;
        Handler handler = fVar.f5651t;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f5653v;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i3)).f5645b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i10 = i3 + 1;
        handler.postAtTime(new t(this, i10 < arrayList.size() ? (e) arrayList.get(i10) : null, jVar, iVar, 1), iVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.n
    public boolean f(i iVar) {
        m.j jVar = (m.j) this.f5643e;
        if (iVar == jVar.f6100i) {
            return false;
        }
        ((s) iVar).f5730w.getClass();
        n nVar = jVar.f6102s;
        if (nVar != null) {
            return nVar.f(iVar);
        }
        return false;
    }

    @Override // m.d1
    public void g(i iVar, MenuItem menuItem) {
        ((f) this.f5643e).f5651t.removeCallbacksAndMessages(iVar);
    }

    @Override // gd.a
    public Object get() {
        return new a1.n((Context) ((f2.a) this.f5643e).f4064d, new c0(20), new c0(19), 24);
    }

    @Override // j5.f
    public String h() {
        return ((l5.e) this.f5643e).f5878e;
    }

    @Override // j5.f
    public void i(j5.e eVar) {
        l5.e eVar2 = (l5.e) this.f5643e;
        int length = eVar2.f5871r.length;
        for (int i3 = 1; i3 < length; i3++) {
            int i10 = eVar2.f5871r[i3];
            if (i10 == 1) {
                eVar.f(i3, eVar2.f5872s[i3]);
            } else if (i10 == 2) {
                eVar.n(eVar2.f5873t[i3], i3);
            } else if (i10 == 3) {
                String str = eVar2.f5874u[i3];
                str.getClass();
                eVar.l(i3, str);
            } else if (i10 == 4) {
                byte[] bArr = eVar2.f5875v[i3];
                bArr.getClass();
                eVar.D(i3, bArr);
            } else if (i10 == 5) {
                eVar.r(i3);
            }
        }
    }

    @Override // i5.b
    public boolean k() {
        return true;
    }

    public p3.f n(int i3) {
        return null;
    }

    public void p() {
        ((n0.o) this.f5643e).getClass();
    }

    public p3.f q(int i3) {
        return null;
    }

    public m2 r() {
        c4.k a9 = c4.k.a();
        if (a9.b() == 1) {
            return new t2.j(true);
        }
        j1 r9 = n0.h.r(Boolean.FALSE);
        a9.g(new t2.f(r9, this));
        return r9;
    }

    public KeyListener s(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((c6.l) ((d9.c) this.f5643e).f3701e).getClass();
        if (keyListener instanceof e4.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e4.e(keyListener);
    }

    public void t() {
        View view = (View) this.f5643e;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public String toString() {
        switch (this.f5642d) {
            case 19:
                StringBuilder sb2 = new StringBuilder("1");
                for (b2 b2Var : b2.values()) {
                    s7.h hVar = (s7.h) ((EnumMap) this.f5643e).get(b2Var);
                    if (hVar == null) {
                        hVar = s7.h.UNSET;
                    }
                    sb2.append(hVar.f8722d);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(float f3, float f10, float f11, float f12) {
        a1.n nVar = (a1.n) this.f5643e;
        k1.n p4 = nVar.p();
        float intBitsToFloat = Float.intBitsToFloat((int) (nVar.u() >> 32)) - (f11 + f3);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (nVar.u() & 4294967295L)) - (f12 + f10);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            x.a("Width and height must be greater than or equal to zero");
        }
        nVar.K(floatToRawIntBits);
        p4.e(f3, f10);
    }

    public boolean x(int i3, int i10, Bundle bundle) {
        return false;
    }

    public Object y(ie.g gVar, a0 a0Var) {
        e2 e2Var;
        ie.o oVar;
        int i3;
        if (((c1.b) this.f5643e) == null) {
            n1.b("Called runAndWatch on a manager that has been disposed of");
        }
        c1.b bVar = (c1.b) this.f5643e;
        if ((bVar instanceof e2) && (oVar = (e2Var = (e2) bVar).f6674t) != null && !oVar.equals(gVar)) {
            y0 y0Var = new y0();
            ie.o oVar2 = e2Var.f6674t;
            if (oVar2 == null) {
                n1.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            s.i0 i0Var = e2Var.f6672r;
            ArrayList arrayList = y0Var.f6856i;
            if (i0Var == null) {
                Object obj = e2Var.f6670e;
                obj.getClass();
                arrayList.add(new n0.v0(obj, oVar2));
            } else {
                Object[] objArr = i0Var.f8320b;
                long[] jArr = i0Var.f8319a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j & 255) < 128) {
                                    i3 = i11;
                                    arrayList.add(new n0.v0(objArr[(i10 << 3) + i13], oVar2));
                                } else {
                                    i3 = i11;
                                }
                                j >>= i3;
                                i13++;
                                i11 = i3;
                            }
                            if (i12 != i11) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            y0Var.j();
            e2Var.k();
            this.f5643e = y0Var;
        }
        c1.b bVar2 = (c1.b) this.f5643e;
        bVar2.getClass();
        b1.i u2 = b1.r.j().u(bVar2.n(gVar));
        bVar2.i(gVar);
        try {
            b1.i j3 = u2.j();
            try {
                Object invoke = a0Var.invoke();
                u2.c();
                bVar2.j();
                return invoke;
            } finally {
                b1.i.q(j3);
            }
        } catch (Throwable th) {
            u2.c();
            throw th;
        }
    }

    public void z(float f3, float f10, long j) {
        k1.n p4 = ((a1.n) this.f5643e).p();
        int i3 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        p4.e(Float.intBitsToFloat(i3), Float.intBitsToFloat(i10));
        p4.b(f3, f10);
        p4.e(-Float.intBitsToFloat(i3), -Float.intBitsToFloat(i10));
    }

    @Override // m.z
    public void d(int i3) {
    }

    @Override // m.z
    public void j(int i3) {
    }

    @Override // m.z
    public void l(int i3, float f3) {
    }

    public /* synthetic */ d(int i3, boolean z10) {
        this.f5642d = i3;
    }

    public d(EnumMap enumMap) {
        this.f5642d = 19;
        EnumMap enumMap2 = new EnumMap(b2.class);
        this.f5643e = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public /* synthetic */ d(int i3, Object obj) {
        this.f5642d = i3;
        this.f5643e = obj;
    }

    public d(j5.d dVar) {
        this.f5642d = 1;
        dVar.getClass();
        this.f5643e = dVar;
    }

    public d(View view) {
        this.f5642d = 14;
        if (Build.VERSION.SDK_INT >= 30) {
            o3.p pVar = new o3.p(13, view);
            pVar.f7430i = view;
            this.f5643e = pVar;
            return;
        }
        this.f5643e = new d(13, view);
    }

    public d(m.n nVar) {
        this.f5642d = 6;
        this.f5643e = new d9.c(nVar);
    }

    public d(Runnable runnable) {
        this.f5642d = 12;
        this.f5643e = new CopyOnWriteArrayList();
        new HashMap();
    }

    public void m(int i3, p3.f fVar, String str, Bundle bundle) {
    }
}
