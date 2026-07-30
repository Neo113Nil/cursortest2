package P0;

import G0.C0104d;
import G0.EnumC0101a;
import G0.t;
import G0.z;
import a.AbstractC0169a;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import h0.AbstractC0467m;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends AbstractC0467m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i2) {
        super(workDatabase);
        this.f2185d = i2;
    }

    @Override // h0.AbstractC0467m
    public final String c() {
        switch (this.f2185d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void e(m0.j jVar, Object obj) {
        int i2;
        int i5;
        byte[] byteArray;
        int i7 = 3;
        switch (this.f2185d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f2183a;
                if (str == null) {
                    jVar.l(1);
                } else {
                    jVar.f(1, str);
                }
                String str2 = aVar.f2184b;
                if (str2 == null) {
                    jVar.l(2);
                    return;
                } else {
                    jVar.f(2, str2);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                jVar.f(1, dVar.f2191a);
                jVar.r(dVar.f2192b.longValue(), 2);
                return;
            case 2:
                String str3 = ((g) obj).f2196a;
                if (str3 == null) {
                    jVar.l(1);
                } else {
                    jVar.f(1, str3);
                }
                jVar.r(r2.f2197b, 2);
                jVar.r(r2.f2198c, 3);
                return;
            case 3:
                k kVar = (k) obj;
                String str4 = kVar.f2206a;
                if (str4 == null) {
                    jVar.l(1);
                } else {
                    jVar.f(1, str4);
                }
                String str5 = kVar.f2207b;
                if (str5 == null) {
                    jVar.l(2);
                    return;
                } else {
                    jVar.f(2, str5);
                    return;
                }
            case 4:
                m mVar = (m) obj;
                String str6 = mVar.f2211a;
                if (str6 == null) {
                    jVar.l(1);
                } else {
                    jVar.f(1, str6);
                }
                byte[] c7 = G0.h.c(mVar.f2212b);
                if (c7 == null) {
                    jVar.l(2);
                    return;
                } else {
                    jVar.D(c7, 2);
                    return;
                }
            case 5:
                p pVar = (p) obj;
                String str7 = pVar.f2220a;
                if (str7 == null) {
                    jVar.l(1);
                } else {
                    jVar.f(1, str7);
                }
                jVar.r(O6.g.Y(pVar.f2221b), 2);
                String str8 = pVar.f2222c;
                if (str8 == null) {
                    jVar.l(3);
                } else {
                    jVar.f(3, str8);
                }
                String str9 = pVar.f2223d;
                if (str9 == null) {
                    jVar.l(4);
                } else {
                    jVar.f(4, str9);
                }
                byte[] c8 = G0.h.c(pVar.f2224e);
                if (c8 == null) {
                    jVar.l(5);
                } else {
                    jVar.D(c8, 5);
                }
                byte[] c9 = G0.h.c(pVar.f2225f);
                if (c9 == null) {
                    jVar.l(6);
                } else {
                    jVar.D(c9, 6);
                }
                jVar.r(pVar.f2226g, 7);
                jVar.r(pVar.f2227h, 8);
                jVar.r(pVar.f2228i, 9);
                jVar.r(pVar.f2229k, 10);
                EnumC0101a backoffPolicy = pVar.f2230l;
                Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                int ordinal = backoffPolicy.ordinal();
                if (ordinal == 0) {
                    i2 = 0;
                } else {
                    if (ordinal != 1) {
                        throw new R5.k();
                    }
                    i2 = 1;
                }
                jVar.r(i2, 11);
                jVar.r(pVar.f2231m, 12);
                jVar.r(pVar.f2232n, 13);
                jVar.r(pVar.f2233o, 14);
                jVar.r(pVar.f2234p, 15);
                jVar.r(pVar.f2235q ? 1L : 0L, 16);
                z policy = pVar.f2236r;
                Intrinsics.checkNotNullParameter(policy, "policy");
                int ordinal2 = policy.ordinal();
                if (ordinal2 == 0) {
                    i5 = 0;
                } else {
                    if (ordinal2 != 1) {
                        throw new R5.k();
                    }
                    i5 = 1;
                }
                jVar.r(i5, 17);
                jVar.r(pVar.f2237s, 18);
                jVar.r(pVar.f2238t, 19);
                G0.e eVar = pVar.j;
                if (eVar == null) {
                    jVar.l(20);
                    jVar.l(21);
                    jVar.l(22);
                    jVar.l(23);
                    jVar.l(24);
                    jVar.l(25);
                    jVar.l(26);
                    jVar.l(27);
                    return;
                }
                t networkType = eVar.f794a;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                int ordinal3 = networkType.ordinal();
                if (ordinal3 == 0) {
                    i7 = 0;
                } else if (ordinal3 == 1) {
                    i7 = 1;
                } else if (ordinal3 == 2) {
                    i7 = 2;
                } else if (ordinal3 != 3) {
                    if (ordinal3 == 4) {
                        i7 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || networkType != t.f830n) {
                            throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                        }
                        i7 = 5;
                    }
                }
                jVar.r(i7, 20);
                jVar.r(eVar.f795b ? 1L : 0L, 21);
                jVar.r(eVar.f796c ? 1L : 0L, 22);
                jVar.r(eVar.f797d ? 1L : 0L, 23);
                jVar.r(eVar.f798e ? 1L : 0L, 24);
                jVar.r(eVar.f799f, 25);
                jVar.r(eVar.f800g, 26);
                Set<C0104d> triggers = eVar.f801h;
                Intrinsics.checkNotNullParameter(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (C0104d c0104d : triggers) {
                                objectOutputStream.writeUTF(c0104d.f791a.toString());
                                objectOutputStream.writeBoolean(c0104d.f792b);
                            }
                            Unit unit = Unit.f6114a;
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC0169a.d(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                if (byteArray == null) {
                    jVar.l(27);
                    return;
                } else {
                    jVar.D(byteArray, 27);
                    return;
                }
            default:
                r rVar = (r) obj;
                String str10 = rVar.f2249a;
                if (str10 == null) {
                    jVar.l(1);
                } else {
                    jVar.f(1, str10);
                }
                String str11 = rVar.f2250b;
                if (str11 == null) {
                    jVar.l(2);
                    return;
                } else {
                    jVar.f(2, str11);
                    return;
                }
        }
    }

    public final void f(Object obj) {
        m0.j a7 = a();
        try {
            e(a7, obj);
            a7.f6518e.executeInsert();
        } finally {
            d(a7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WorkDatabase database) {
        super(database);
        this.f2185d = 1;
        Intrinsics.checkNotNullParameter(database, "database");
    }
}
