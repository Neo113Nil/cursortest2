package B;

import I.InterfaceC0109e;
import P.C0139d;
import P.c0;
import P.e0;
import P.m0;
import P.n0;
import T6.y;
import a.AbstractC0169a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase;
import b1.C0269d;
import c1.C0290c;
import c1.InterfaceC0289b;
import c4.AbstractC0303i;
import c4.C0295a;
import c4.C0297c;
import c4.C0306l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.appsflyer.attribution.RequestError;
import com.google.firebase.messaging.z;
import e4.C0375a;
import g0.AbstractC0440t;
import g0.C0432l;
import g0.C0441u;
import g0.InterfaceC0419L;
import h0.C0464j;
import j0.C0563a;
import j0.C0564b;
import j0.C0566d;
import j0.C0567e;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import m0.C0684c;
import n5.C0761c;
import q6.v;
import r4.q;
import r6.s;
import s4.n;
import s4.o;
import s4.p;
import w.AbstractC0987g;
import w.C0982b;

/* loaded from: classes.dex */
public final class f implements InterfaceC0109e, InterfaceC0289b, InstallReferrerStateListener, o, InterfaceC0419L {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151d;

    /* renamed from: e, reason: collision with root package name */
    public Object f152e;

    public /* synthetic */ f(int i2, Object obj) {
        this.f151d = i2;
        this.f152e = obj;
    }

    public static void f(C0684c c0684c) {
        c0684c.j("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0684c.j("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c0684c.j("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c0684c.j("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c0684c.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c0684c.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c0684c.j("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0684c.j("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c0684c.j("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0684c.j("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0684c.j("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c0684c.j("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0684c.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c0684c.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0684c.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static int l(int i2, int i5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            i7++;
            if (i7 == i5) {
                i8++;
                i7 = 0;
            } else if (i7 > i5) {
                i8++;
                i7 = 1;
            }
        }
        return i7 + 1 > i5 ? i8 + 1 : i8;
    }

    public static boolean m(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    public static C0464j o(C0684c c0684c) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C0563a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new C0563a("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C0564b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C0564b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C0566d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new C0566d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        C0567e c0567e = new C0567e("Dependency", hashMap, hashSet, hashSet2);
        C0567e a7 = C0567e.a(c0684c, "Dependency");
        if (!c0567e.equals(a7)) {
            return new C0464j("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c0567e + "\n Found:\n" + a7, false);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put("id", new C0563a("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new C0563a("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new C0563a("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new C0563a("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new C0563a("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new C0563a("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new C0563a("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new C0563a("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new C0563a("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new C0563a("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new C0563a("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new C0563a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new C0563a("last_enqueue_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new C0563a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new C0563a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new C0563a("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new C0563a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new C0563a("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new C0563a("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("required_network_type", new C0563a("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_charging", new C0563a("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new C0563a("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new C0563a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new C0563a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new C0563a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new C0563a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new C0563a("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C0566d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new C0566d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        C0567e c0567e2 = new C0567e("WorkSpec", hashMap2, hashSet3, hashSet4);
        C0567e a8 = C0567e.a(c0684c, "WorkSpec");
        if (!c0567e2.equals(a8)) {
            return new C0464j("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c0567e2 + "\n Found:\n" + a8, false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C0563a("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new C0563a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C0564b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C0566d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C0567e c0567e3 = new C0567e("WorkTag", hashMap3, hashSet5, hashSet6);
        C0567e a9 = C0567e.a(c0684c, "WorkTag");
        if (!c0567e3.equals(a9)) {
            return new C0464j("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c0567e3 + "\n Found:\n" + a9, false);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C0563a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new C0563a("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new C0563a("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C0564b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C0567e c0567e4 = new C0567e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        C0567e a10 = C0567e.a(c0684c, "SystemIdInfo");
        if (!c0567e4.equals(a10)) {
            return new C0464j("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c0567e4 + "\n Found:\n" + a10, false);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C0563a("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new C0563a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C0564b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C0566d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C0567e c0567e5 = new C0567e("WorkName", hashMap5, hashSet8, hashSet9);
        C0567e a11 = C0567e.a(c0684c, "WorkName");
        if (!c0567e5.equals(a11)) {
            return new C0464j("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c0567e5 + "\n Found:\n" + a11, false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C0563a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new C0563a("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C0564b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C0567e c0567e6 = new C0567e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        C0567e a12 = C0567e.a(c0684c, "WorkProgress");
        if (!c0567e6.equals(a12)) {
            return new C0464j("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c0567e6 + "\n Found:\n" + a12, false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C0563a("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new C0563a("long_value", "INTEGER", false, 0, null, 1));
        C0567e c0567e7 = new C0567e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        C0567e a13 = C0567e.a(c0684c, "Preference");
        if (c0567e7.equals(a13)) {
            return new C0464j(null, true);
        }
        return new C0464j("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c0567e7 + "\n Found:\n" + a13, false);
    }

    @Override // I.InterfaceC0109e
    public int a() {
        int source;
        source = ((ContentInfo) this.f152e).getSource();
        return source;
    }

    @Override // I.InterfaceC0109e
    public ClipData b() {
        ClipData clip;
        clip = ((ContentInfo) this.f152e).getClip();
        return clip;
    }

    @Override // I.InterfaceC0109e
    public int c() {
        int flags;
        flags = ((ContentInfo) this.f152e).getFlags();
        return flags;
    }

    @Override // I.InterfaceC0109e
    public ContentInfo d() {
        return (ContentInfo) this.f152e;
    }

    public long e() {
        return ((C0295a) this.f152e).c();
    }

    @Override // g0.InterfaceC0419L
    public int g() {
        AbstractC0440t abstractC0440t = (AbstractC0440t) this.f152e;
        return abstractC0440t.f4967f - abstractC0440t.t();
    }

    @Override // Q5.a
    public Object get() {
        switch (this.f151d) {
            case 17:
                return new C0269d((Context) ((C0290c) this.f152e).f4173d, new q1.h(22), new c2.e());
            default:
                String packageName = ((Context) ((Q5.a) this.f152e).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // g0.InterfaceC0419L
    public int h(View view) {
        return (view.getLeft() - ((C0441u) view.getLayoutParams()).f4969a.left) - ((ViewGroup.MarginLayoutParams) ((C0441u) view.getLayoutParams())).leftMargin;
    }

    public T6.i i(long j) {
        return ((C0295a) this.f152e).d((int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(X5.c cVar) {
        F3.a aVar;
        int i2;
        Pair[] pairArr;
        f fVar;
        String str;
        Pair[] pairArr2;
        if (cVar instanceof F3.a) {
            aVar = (F3.a) cVar;
            int i5 = aVar.f763o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f763o = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f761m;
                W5.a aVar2 = W5.a.f2787d;
                i2 = aVar.f763o;
                if (i2 != 0) {
                    V6.b.P(obj);
                    pairArr = new Pair[10];
                    E3.f fVar2 = (E3.f) this.f152e;
                    aVar.f757d = this;
                    aVar.f758e = pairArr;
                    aVar.f759i = pairArr;
                    aVar.f760l = "ossdk.install_id";
                    aVar.f763o = 1;
                    obj = fVar2.getInstallId(aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    fVar = this;
                    str = "ossdk.install_id";
                    pairArr2 = pairArr;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = aVar.f760l;
                    pairArr = aVar.f759i;
                    pairArr2 = aVar.f758e;
                    fVar = aVar.f757d;
                    V6.b.P(obj);
                }
                pairArr[0] = new Pair(str, obj);
                E3.f fVar3 = (E3.f) fVar.f152e;
                pairArr2[1] = new Pair("ossdk.sdk_base", fVar3.getSdkBase());
                pairArr2[2] = new Pair("ossdk.sdk_base_version", fVar3.getSdkBaseVersion());
                pairArr2[3] = new Pair("ossdk.app_package_id", fVar3.getAppPackageId());
                pairArr2[4] = new Pair("ossdk.app_version", fVar3.getAppVersion());
                pairArr2[5] = new Pair("device.manufacturer", fVar3.getDeviceManufacturer());
                pairArr2[6] = new Pair("device.model.identifier", fVar3.getDeviceModel());
                pairArr2[7] = new Pair("os.name", fVar3.getOsName());
                pairArr2[8] = new Pair("os.version", fVar3.getOsVersion());
                pairArr2[9] = new Pair("os.build_id", fVar3.getOsBuildId());
                LinkedHashMap f7 = I.f(pairArr2);
                AbstractC0169a.w(f7, "ossdk.sdk_wrapper", fVar3.getSdkWrapper());
                AbstractC0169a.w(f7, "ossdk.sdk_wrapper_version", fVar3.getSdkWrapperVersion());
                Map unmodifiableMap = Collections.unmodifiableMap(f7);
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
                return unmodifiableMap;
            }
        }
        aVar = new F3.a(this, cVar);
        Object obj2 = aVar.f761m;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.f763o;
        if (i2 != 0) {
        }
        pairArr[0] = new Pair(str, obj2);
        E3.f fVar32 = (E3.f) fVar.f152e;
        pairArr2[1] = new Pair("ossdk.sdk_base", fVar32.getSdkBase());
        pairArr2[2] = new Pair("ossdk.sdk_base_version", fVar32.getSdkBaseVersion());
        pairArr2[3] = new Pair("ossdk.app_package_id", fVar32.getAppPackageId());
        pairArr2[4] = new Pair("ossdk.app_version", fVar32.getAppVersion());
        pairArr2[5] = new Pair("device.manufacturer", fVar32.getDeviceManufacturer());
        pairArr2[6] = new Pair("device.model.identifier", fVar32.getDeviceModel());
        pairArr2[7] = new Pair("os.name", fVar32.getOsName());
        pairArr2[8] = new Pair("os.version", fVar32.getOsVersion());
        pairArr2[9] = new Pair("os.build_id", fVar32.getOsBuildId());
        LinkedHashMap f72 = I.f(pairArr2);
        AbstractC0169a.w(f72, "ossdk.sdk_wrapper", fVar32.getSdkWrapper());
        AbstractC0169a.w(f72, "ossdk.sdk_wrapper_version", fVar32.getSdkWrapperVersion());
        Map unmodifiableMap2 = Collections.unmodifiableMap(f72);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap2, "unmodifiableMap(...)");
        return unmodifiableMap2;
    }

    public m0 k() {
        v vVar = (v) this.f152e;
        vVar.getClass();
        Object obj = v.f7420m.get(vVar);
        if (obj == s.f7582a) {
            obj = null;
        }
        return (m0) obj;
    }

    @Override // g0.InterfaceC0419L
    public View n(int i2) {
        return ((AbstractC0440t) this.f152e).o(i2);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i2) {
        C0375a c0375a = (C0375a) this.f152e;
        synchronized (c0375a) {
            try {
                if (i2 == -1) {
                    c0375a.f4711n = new Pair("SERVICE_DISCONNECTED", "Play Store service is not connected now - potentially transient state.");
                } else if (i2 == 0) {
                    InstallReferrerClient installReferrerClient = c0375a.f4709l;
                    if (installReferrerClient != null) {
                        c0375a.f4710m = installReferrerClient.getInstallReferrer();
                    } else {
                        c0375a.f4711n = new Pair("BAD_STATE", "Result is null.");
                    }
                } else if (i2 == 1) {
                    c0375a.f4711n = new Pair("SERVICE_UNAVAILABLE", "Connection couldn't be established.");
                } else if (i2 == 2) {
                    c0375a.f4711n = new Pair("FEATURE_NOT_SUPPORTED", "API not available on the current Play Store app.");
                } else if (i2 == 3) {
                    c0375a.f4711n = new Pair("DEVELOPER_ERROR", "General errors caused by incorrect usage.");
                } else if (i2 != 4) {
                    c0375a.f4711n = new Pair("UNKNOWN_ERROR", "InstallReferrerClient returned unknown response code.");
                } else {
                    c0375a.f4711n = new Pair("PERMISSION_ERROR", "App is not allowed to bind to the Service.");
                }
                synchronized (c0375a) {
                    try {
                        ArrayList arrayList = c0375a.f4708i;
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            c0375a.a((p) obj);
                        }
                        c0375a.f4708i.clear();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        InstallReferrerClient installReferrerClient2 = c0375a.f4709l;
        if (installReferrerClient2 != null) {
            installReferrerClient2.endConnection();
        }
    }

    @Override // s4.o
    public void onMethodCall(n nVar, p pVar) {
        if (!"check".equals(nVar.f7767a)) {
            ((r4.l) pVar).notImplemented();
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ((l2.c) this.f152e).f6269d;
        ((r4.l) pVar).success(l2.c.w(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
    }

    @Override // g0.InterfaceC0419L
    public int p() {
        return ((AbstractC0440t) this.f152e).s();
    }

    public void q(int i2) {
        ((C0295a) this.f152e).k(i2);
    }

    @Override // g0.InterfaceC0419L
    public int r(View view) {
        return view.getRight() + ((C0441u) view.getLayoutParams()).f4969a.right + ((ViewGroup.MarginLayoutParams) ((C0441u) view.getLayoutParams())).rightMargin;
    }

    public void s(int i2, r4.o oVar) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f152e;
        iVar.d();
        iVar.f5658f = oVar;
        iVar.f5657e = new C0432l(2, i2);
        iVar.f5660h.e(iVar);
        z zVar = oVar.j;
        iVar.f5660h = new io.flutter.plugin.editing.f(zVar != null ? (q) zVar.f4537i : null, iVar.f5653a);
        iVar.e(oVar);
        iVar.f5661i = true;
        if (iVar.f5657e.f4946b == 3) {
            iVar.f5667p = false;
        }
        iVar.f5664m = null;
        iVar.f5660h.a(iVar);
    }

    public void t(double d7, double d8, double[] dArr) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f152e;
        double[] dArr2 = new double[4];
        boolean z7 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d9 = dArr[12];
        double d10 = dArr[15];
        double d11 = d9 / d10;
        dArr2[1] = d11;
        dArr2[0] = d11;
        double d12 = dArr[13] / d10;
        dArr2[3] = d12;
        dArr2[2] = d12;
        K1.m mVar = new K1.m(z7, dArr, dArr2);
        mVar.a(d7, 0.0d);
        mVar.a(d7, d8);
        mVar.a(0.0d, d8);
        double d13 = iVar.f5653a.getContext().getResources().getDisplayMetrics().density;
        iVar.f5664m = new Rect((int) (dArr2[0] * d13), (int) (dArr2[2] * d13), (int) Math.ceil(dArr2[1] * d13), (int) Math.ceil(dArr2[3] * d13));
    }

    public String toString() {
        switch (this.f151d) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.f152e) + "}";
            case 9:
                return (String) this.f152e;
            default:
                return super.toString();
        }
    }

    public void u(q qVar) {
        q qVar2;
        int i2;
        int i5;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f152e;
        View view = iVar.f5653a;
        if (!iVar.f5661i && (qVar2 = iVar.f5666o) != null && (i2 = qVar2.f7525d) >= 0 && (i5 = qVar2.f7526e) > i2) {
            int i7 = i5 - i2;
            int i8 = qVar.f7526e;
            int i9 = qVar.f7525d;
            boolean z7 = true;
            if (i7 == i8 - i9) {
                int i10 = 0;
                while (true) {
                    if (i10 >= i7) {
                        z7 = false;
                        break;
                    } else if (qVar2.f7522a.charAt(i10 + i2) != qVar.f7522a.charAt(i10 + i9)) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            iVar.f5661i = z7;
        }
        iVar.f5666o = qVar;
        iVar.f5660h.f(qVar);
        if (iVar.f5661i) {
            iVar.f5654b.restartInput(view);
            iVar.f5661i = false;
        }
    }

    public void v(Exception exc) {
        T1.h hVar = (T1.h) this.f152e;
        if (AbstractC0987g.f8274n.i(hVar, null, new C0982b(exc))) {
            AbstractC0987g.d(hVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f2137a > r3.f2137a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(m0 newState) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(newState, "newState");
        v vVar = (v) this.f152e;
        do {
            vVar.getClass();
            Object obj3 = v.f7420m.get(vVar);
            obj = s.f7582a;
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            m0 m0Var = (m0) obj2;
            if (!(m0Var instanceof e0 ? true : Intrinsics.a(m0Var, n0.f2140b))) {
                if (!(m0Var instanceof C0139d)) {
                    if (!(m0Var instanceof c0)) {
                        throw new R5.k();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (m0Var != null) {
                    obj = m0Var;
                }
            }
            m0Var = newState;
            if (obj2 == null) {
            }
            if (m0Var != null) {
            }
        } while (!vVar.c(obj2, obj));
    }

    public void x(OutputStream stream) {
        T6.f fVar;
        C0761c c0761c = (C0761c) this.f152e;
        int i2 = c0761c.f7002c;
        C0297c c0297c = AbstractC0303i.f4225g;
        Integer valueOf = Integer.valueOf(i2);
        c0297c.getClass();
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(stream, "<this>");
        T6.o oVar = new T6.o(stream, new y());
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        T6.p sink = new T6.p(oVar);
        Intrinsics.checkNotNullParameter(sink, "sink");
        C0306l writer = new C0306l();
        c0297c.getClass();
        int intValue = valueOf.intValue();
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (intValue >= 0) {
            int i5 = (intValue & (-128)) == 0 ? 1 : (intValue & (-16384)) == 0 ? 2 : ((-2097152) & intValue) == 0 ? 3 : ((-268435456) & intValue) == 0 ? 4 : 5;
            writer.b(i5);
            int i7 = writer.f4249e - i5;
            writer.f4249e = i7;
            while ((intValue & (-128)) != 0) {
                writer.f4248d[i7] = (byte) ((intValue & 127) | 128);
                intValue >>>= 7;
                i7++;
            }
            writer.f4248d[i7] = (byte) intValue;
        } else {
            long j = intValue;
            int S7 = V6.b.S(j);
            writer.b(S7);
            int i8 = writer.f4249e - S7;
            writer.f4249e = i8;
            while (((-128) & j) != 0) {
                writer.f4248d[i8] = (byte) ((127 & j) | 128);
                j >>>= 7;
                i8++;
            }
            writer.f4248d[i8] = (byte) j;
        }
        Intrinsics.checkNotNullParameter(sink, "sink");
        writer.a();
        T6.f source = writer.f4245a;
        Intrinsics.checkNotNullParameter(source, "source");
        while (true) {
            fVar = sink.f2638e;
            if (source.o(8192L, fVar) == -1) {
                break;
            } else {
                sink.a();
            }
        }
        if (sink.f2639i) {
            throw new IllegalStateException("closed");
        }
        long j7 = fVar.f2617e;
        if (j7 > 0) {
            sink.f2637d.x(j7, fVar);
        }
        c0761c.b(stream);
    }

    public /* synthetic */ f(int i2, boolean z7) {
        this.f151d = i2;
    }

    public f(Context context, int i2) {
        boolean isEmpty;
        this.f151d = i2;
        switch (i2) {
            case 20:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.f152e = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            isEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (isEmpty) {
                            return;
                        }
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                        return;
                    }
                    return;
                } catch (IOException e7) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
                        return;
                    }
                    return;
                }
            default:
                N1.i iVar = new N1.i(context, 0);
                this.f152e = N1.g.a(new l2.c(N1.g.a(new P0.c(iVar, N1.g.a(L1.j.f1682b), new L1.c(iVar)))));
                return;
        }
    }

    public f(E3.f platformProvider) {
        this.f151d = 2;
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        this.f152e = platformProvider;
    }

    public f(WorkDatabase workDatabase) {
        this.f151d = 12;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f152e = workDatabase;
    }

    public f(C0295a delegate) {
        this.f151d = 18;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        T6.f source = new T6.f();
        Intrinsics.checkNotNullParameter(source, "source");
        new ArrayList();
        this.f152e = delegate;
    }

    public f(int i2) {
        this.f151d = i2;
        switch (i2) {
            case RequestError.STOP_TRACKING /* 11 */:
                this.f152e = new v(n0.f2140b);
                break;
            case 16:
                this.f152e = new C0761c();
                break;
            case 23:
                this.f152e = new SparseIntArray();
                break;
            default:
                this.f152e = new AtomicInteger(0);
                break;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    public f(boolean z7) {
        this.f151d = 13;
        this.f152e = new AtomicBoolean(z7);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [D6.h] */
    public f(final int i2, final int i5, final int i7, final int i8, final boolean z7, final boolean z8, final l2.c routeDatabase) {
        this.f151d = 1;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final G6.d taskRunner = G6.d.f859l;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        H6.e connectionListener = H6.e.f1035a;
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        H6.s delegate = new H6.s(taskRunner, new e6.n() { // from class: D6.h
            @Override // e6.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                H6.s pool = (H6.s) obj;
                C0093a address = (C0093a) obj2;
                H6.a user = (H6.a) obj3;
                Intrinsics.checkNotNullParameter(pool, "pool");
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(user, "user");
                G6.d dVar = G6.d.this;
                return new H6.l(new H6.m(new H6.t(dVar, pool, i2, i5, i7, i8, z7, z8, address, routeDatabase, user), 0), dVar);
            }
        });
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f152e = delegate;
    }

    public f(EditText editText) {
        this.f151d = 15;
        this.f152e = new P0.l(editText);
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f151d = 6;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f152e = new K.g(uri, clipDescription, uri2);
        } else {
            this.f152e = new D0.j(uri, clipDescription, uri2, 4);
        }
    }

    public f(E6.d threadFactory) {
        this.f151d = 3;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f152e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public f(ContentInfo contentInfo) {
        this.f151d = 5;
        contentInfo.getClass();
        this.f152e = e.l(contentInfo);
    }
}
