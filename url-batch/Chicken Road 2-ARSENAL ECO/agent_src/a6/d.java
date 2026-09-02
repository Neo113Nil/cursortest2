package a6;

import D.C0102o;
import N3.n;
import N3.p;
import Q.j;
import T0.M;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import c3.f;
import d3.C0318a;
import io.flutter.plugin.platform.k;
import j.o;
import j.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import k.C0450i;
import k.InterfaceC0453l;
import k5.C0477g;
import kotlin.jvm.internal.i;
import p5.EnumC0580a;
import q1.g;
import q5.AbstractC0607c;
import r.h;
import u0.AbstractC0676f;
import u0.C0684n;

/* loaded from: classes.dex */
public final class d implements o, InterfaceC0453l {

    /* renamed from: f, reason: collision with root package name */
    public Object f3172f;

    public /* synthetic */ d(Object obj) {
        this.f3172f = obj;
    }

    public static void c(V.c cVar) {
        cVar.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static boolean f(int i7) {
        return (48 <= i7 && i7 <= 57) || i7 == 35 || i7 == 42;
    }

    public static j g(V.c cVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new S.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new S.a("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new S.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new S.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new S.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new S.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        S.e eVar = new S.e("Dependency", hashMap, hashSet, hashSet2);
        S.e a7 = S.e.a(cVar, "Dependency");
        if (!eVar.equals(a7)) {
            return new j(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a7);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new S.a("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new S.a("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new S.a("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new S.a("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new S.a("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new S.a("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new S.a("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new S.a("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new S.a("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new S.a("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new S.a("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new S.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new S.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new S.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new S.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new S.a("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new S.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new S.a("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new S.a("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("required_network_type", new S.a("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_charging", new S.a("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new S.a("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new S.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new S.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new S.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new S.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new S.a("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new S.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new S.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        S.e eVar2 = new S.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        S.e a8 = S.e.a(cVar, "WorkSpec");
        if (!eVar2.equals(a8)) {
            return new j(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a8);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new S.a("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new S.a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new S.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new S.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        S.e eVar3 = new S.e("WorkTag", hashMap3, hashSet5, hashSet6);
        S.e a9 = S.e.a(cVar, "WorkTag");
        if (!eVar3.equals(a9)) {
            return new j(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a9);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new S.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new S.a("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new S.a("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new S.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        S.e eVar4 = new S.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        S.e a10 = S.e.a(cVar, "SystemIdInfo");
        if (!eVar4.equals(a10)) {
            return new j(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a10);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new S.a("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new S.a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new S.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new S.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        S.e eVar5 = new S.e("WorkName", hashMap5, hashSet8, hashSet9);
        S.e a11 = S.e.a(cVar, "WorkName");
        if (!eVar5.equals(a11)) {
            return new j(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a11);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new S.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new S.a("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new S.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        S.e eVar6 = new S.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        S.e a12 = S.e.a(cVar, "WorkProgress");
        if (!eVar6.equals(a12)) {
            return new j(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a12);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new S.a("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new S.a("long_value", "INTEGER", false, 0, null, 1));
        S.e eVar7 = new S.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        S.e a13 = S.e.a(cVar, "Preference");
        if (eVar7.equals(a13)) {
            return new j(true, (String) null);
        }
        return new j(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a13);
    }

    @Override // j.o
    public void a(j.j jVar, boolean z5) {
        if (jVar instanceof t) {
            ((t) jVar).f4873v.j().c(false);
        }
        o oVar = ((C0450i) this.f3172f).f5008j;
        if (oVar != null) {
            oVar.a(jVar, z5);
        }
    }

    @Override // j.o
    public boolean b(j.j jVar) {
        C0450i c0450i = (C0450i) this.f3172f;
        if (jVar == c0450i.f5006h) {
            return false;
        }
        ((t) jVar).f4874w.getClass();
        c0450i.getClass();
        o oVar = c0450i.f5008j;
        if (oVar != null) {
            return oVar.b(jVar);
        }
        return false;
    }

    public void d(int i7) {
        k kVar = (k) this.f3172f;
        kVar.f4573r.remove(Integer.valueOf(i7));
        if (kVar.f4567l.get(i7) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(AbstractC0607c abstractC0607c) {
        C0318a c0318a;
        int i7;
        C0477g[] c0477gArr;
        d dVar;
        String str;
        C0477g[] c0477gArr2;
        if (abstractC0607c instanceof C0318a) {
            c0318a = (C0318a) abstractC0607c;
            int i8 = c0318a.f3948l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0318a.f3948l = i8 - Integer.MIN_VALUE;
                Object obj = c0318a.f3946j;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0318a.f3948l;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    c0477gArr = new C0477g[10];
                    f fVar = (f) this.f3172f;
                    c0318a.f3942f = this;
                    c0318a.f3943g = c0477gArr;
                    c0318a.f3944h = c0477gArr;
                    c0318a.f3945i = "ossdk.install_id";
                    c0318a.f3948l = 1;
                    obj = fVar.getInstallId(c0318a);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    dVar = this;
                    str = "ossdk.install_id";
                    c0477gArr2 = c0477gArr;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = c0318a.f3945i;
                    c0477gArr = c0318a.f3944h;
                    c0477gArr2 = c0318a.f3943g;
                    dVar = c0318a.f3942f;
                    AbstractC0676f.w(obj);
                }
                c0477gArr[0] = new C0477g(str, obj);
                f fVar2 = (f) dVar.f3172f;
                c0477gArr2[1] = new C0477g("ossdk.sdk_base", fVar2.getSdkBase());
                c0477gArr2[2] = new C0477g("ossdk.sdk_base_version", fVar2.getSdkBaseVersion());
                c0477gArr2[3] = new C0477g("ossdk.app_package_id", fVar2.getAppPackageId());
                c0477gArr2[4] = new C0477g("ossdk.app_version", fVar2.getAppVersion());
                c0477gArr2[5] = new C0477g("device.manufacturer", fVar2.getDeviceManufacturer());
                c0477gArr2[6] = new C0477g("device.model.identifier", fVar2.getDeviceModel());
                c0477gArr2[7] = new C0477g("os.name", fVar2.getOsName());
                c0477gArr2[8] = new C0477g("os.version", fVar2.getOsVersion());
                c0477gArr2[9] = new C0477g("os.build_id", fVar2.getOsBuildId());
                LinkedHashMap linkedHashMap = new LinkedHashMap(l5.t.p0(c0477gArr2.length));
                l5.t.r0(linkedHashMap, c0477gArr2);
                A3.c.U(linkedHashMap, "ossdk.sdk_wrapper", fVar2.getSdkWrapper());
                A3.c.U(linkedHashMap, "ossdk.sdk_wrapper_version", fVar2.getSdkWrapperVersion());
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                i.d(unmodifiableMap, "unmodifiableMap(...)");
                return unmodifiableMap;
            }
        }
        c0318a = new C0318a(this, abstractC0607c);
        Object obj2 = c0318a.f3946j;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0318a.f3948l;
        if (i7 != 0) {
        }
        c0477gArr[0] = new C0477g(str, obj2);
        f fVar22 = (f) dVar.f3172f;
        c0477gArr2[1] = new C0477g("ossdk.sdk_base", fVar22.getSdkBase());
        c0477gArr2[2] = new C0477g("ossdk.sdk_base_version", fVar22.getSdkBaseVersion());
        c0477gArr2[3] = new C0477g("ossdk.app_package_id", fVar22.getAppPackageId());
        c0477gArr2[4] = new C0477g("ossdk.app_version", fVar22.getAppVersion());
        c0477gArr2[5] = new C0477g("device.manufacturer", fVar22.getDeviceManufacturer());
        c0477gArr2[6] = new C0477g("device.model.identifier", fVar22.getDeviceModel());
        c0477gArr2[7] = new C0477g("os.name", fVar22.getOsName());
        c0477gArr2[8] = new C0477g("os.version", fVar22.getOsVersion());
        c0477gArr2[9] = new C0477g("os.build_id", fVar22.getOsBuildId());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(l5.t.p0(c0477gArr2.length));
        l5.t.r0(linkedHashMap2, c0477gArr2);
        A3.c.U(linkedHashMap2, "ossdk.sdk_wrapper", fVar22.getSdkWrapper());
        A3.c.U(linkedHashMap2, "ossdk.sdk_wrapper_version", fVar22.getSdkWrapperVersion());
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        i.d(unmodifiableMap2, "unmodifiableMap(...)");
        return unmodifiableMap2;
    }

    public void h(int i7, n nVar) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f3172f;
        iVar.c();
        iVar.f4538f = nVar;
        iVar.f4537e = new C0102o(2, i7);
        iVar.f4540h.e(iVar);
        C0684n c0684n = nVar.f1741j;
        iVar.f4540h = new io.flutter.plugin.editing.f(c0684n != null ? (p) c0684n.f5996i : null, iVar.f4533a);
        iVar.d(nVar);
        iVar.f4541i = true;
        if (iVar.f4537e.f299a == 3) {
            iVar.f4548p = false;
        }
        iVar.f4545m = null;
        iVar.f4540h.a(iVar);
    }

    public void i(double d7, double d8, double[] dArr) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f3172f;
        double[] dArr2 = new double[4];
        boolean z5 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d9 = dArr[12];
        double d10 = dArr[15];
        double d11 = d9 / d10;
        dArr2[1] = d11;
        dArr2[0] = d11;
        double d12 = dArr[13] / d10;
        dArr2[3] = d12;
        dArr2[2] = d12;
        M m4 = new M(z5, dArr, dArr2);
        m4.b(d7, 0.0d);
        m4.b(d7, d8);
        m4.b(0.0d, d8);
        double d13 = iVar.f4533a.getContext().getResources().getDisplayMetrics().density;
        iVar.f4545m = new Rect((int) (dArr2[0] * d13), (int) (dArr2[2] * d13), (int) Math.ceil(dArr2[1] * d13), (int) Math.ceil(dArr2[3] * d13));
    }

    public void j(p pVar) {
        p pVar2;
        int i7;
        int i8;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f3172f;
        View view = iVar.f4533a;
        if (!iVar.f4541i && (pVar2 = iVar.f4547o) != null && (i7 = pVar2.f1751d) >= 0 && (i8 = pVar2.f1752e) > i7) {
            int i9 = i8 - i7;
            int i10 = pVar.f1752e;
            int i11 = pVar.f1751d;
            boolean z5 = true;
            if (i9 == i10 - i11) {
                int i12 = 0;
                while (true) {
                    if (i12 >= i9) {
                        z5 = false;
                        break;
                    } else if (pVar2.f1748a.charAt(i12 + i7) != pVar.f1748a.charAt(i12 + i11)) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            iVar.f4541i = z5;
        }
        iVar.f4547o = pVar;
        iVar.f4540h.f(pVar);
        if (iVar.f4541i) {
            iVar.f4534b.restartInput(view);
            iVar.f4541i = false;
        }
    }

    public void k(Exception exc) {
        g gVar = (g) this.f3172f;
        if (h.f5835k.B(gVar, null, new r.c(exc))) {
            h.d(gVar);
        }
    }

    public void l(n6.i value) {
        i.e(value, "value");
        ((n6.g) this.f3172f).u(value);
    }

    public void m(int i7, z3.d fieldEncoding) {
        i.e(fieldEncoding, "fieldEncoding");
        n((i7 << 3) | fieldEncoding.f6302f);
    }

    public void n(int i7) {
        n6.g gVar = (n6.g) this.f3172f;
        while ((i7 & (-128)) != 0) {
            gVar.writeByte((i7 & 127) | 128);
            i7 >>>= 7;
        }
        gVar.writeByte(i7);
    }

    public void o(long j4) {
        n6.g gVar = (n6.g) this.f3172f;
        while (((-128) & j4) != 0) {
            gVar.writeByte((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        gVar.writeByte((int) j4);
    }

    public d(n6.g sink) {
        i.e(sink, "sink");
        this.f3172f = sink;
    }
}
