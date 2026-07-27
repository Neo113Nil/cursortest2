package B0;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import b2.AbstractC0279e;
import c0.C0307i;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import s0.C1415c;
import s0.C1416d;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class b extends X.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i2) {
        super(workDatabase);
        this.f138d = i2;
    }

    @Override // X.m
    public final String l() {
        switch (this.f138d) {
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

    public final void p(C0307i c0307i, Object obj) {
        int i2;
        int i3;
        byte[] byteArray;
        switch (this.f138d) {
            case 0:
                a aVar = (a) obj;
                c0307i.f(1, aVar.f136a);
                String str = aVar.f137b;
                if (str == null) {
                    c0307i.j(2);
                    return;
                } else {
                    c0307i.f(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                c0307i.f(1, dVar.f142a);
                c0307i.t(2, dVar.f143b.longValue());
                return;
            case 2:
                String str2 = ((g) obj).f148a;
                if (str2 == null) {
                    c0307i.j(1);
                } else {
                    c0307i.f(1, str2);
                }
                c0307i.t(2, r2.f149b);
                c0307i.t(3, r2.f150c);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f159a;
                if (str3 == null) {
                    c0307i.j(1);
                } else {
                    c0307i.f(1, str3);
                }
                c0307i.f(2, kVar.f160b);
                return;
            case 4:
                m mVar = (m) obj;
                String str4 = mVar.f165a;
                if (str4 == null) {
                    c0307i.j(1);
                } else {
                    c0307i.f(1, str4);
                }
                byte[] c2 = s0.g.c(mVar.f166b);
                if (c2 == null) {
                    c0307i.j(2);
                    return;
                } else {
                    c0307i.w(2, c2);
                    return;
                }
            case 5:
                q qVar = (q) obj;
                String str5 = qVar.f173a;
                int i6 = 1;
                if (str5 == null) {
                    c0307i.j(1);
                } else {
                    c0307i.f(1, str5);
                }
                c0307i.t(2, f.K(qVar.f174b));
                String str6 = qVar.f175c;
                if (str6 == null) {
                    c0307i.j(3);
                } else {
                    c0307i.f(3, str6);
                }
                String str7 = qVar.f176d;
                if (str7 == null) {
                    c0307i.j(4);
                } else {
                    c0307i.f(4, str7);
                }
                byte[] c6 = s0.g.c(qVar.f177e);
                if (c6 == null) {
                    c0307i.j(5);
                } else {
                    c0307i.w(5, c6);
                }
                byte[] c7 = s0.g.c(qVar.f178f);
                if (c7 == null) {
                    c0307i.j(6);
                } else {
                    c0307i.w(6, c7);
                }
                c0307i.t(7, qVar.f179g);
                c0307i.t(8, qVar.f180h);
                c0307i.t(9, qVar.f181i);
                c0307i.t(10, qVar.f183k);
                int i7 = qVar.f184l;
                AbstractC0279e.k(i7, "backoffPolicy");
                int b6 = O.j.b(i7);
                if (b6 == 0) {
                    i2 = 0;
                } else {
                    if (b6 != 1) {
                        throw new C1.b();
                    }
                    i2 = 1;
                }
                c0307i.t(11, i2);
                c0307i.t(12, qVar.f185m);
                c0307i.t(13, qVar.f186n);
                c0307i.t(14, qVar.f187o);
                c0307i.t(15, qVar.f188p);
                c0307i.t(16, qVar.f189q ? 1L : 0L);
                int i8 = qVar.f190r;
                AbstractC0279e.k(i8, "policy");
                int b7 = O.j.b(i8);
                if (b7 == 0) {
                    i3 = 0;
                } else {
                    if (b7 != 1) {
                        throw new C1.b();
                    }
                    i3 = 1;
                }
                c0307i.t(17, i3);
                c0307i.t(18, qVar.f191s);
                c0307i.t(19, qVar.f192t);
                C1416d c1416d = qVar.f182j;
                if (c1416d == null) {
                    c0307i.j(20);
                    c0307i.j(21);
                    c0307i.j(22);
                    c0307i.j(23);
                    c0307i.j(24);
                    c0307i.j(25);
                    c0307i.j(26);
                    c0307i.j(27);
                    return;
                }
                int i9 = c1416d.f11762a;
                AbstractC0279e.k(i9, "networkType");
                int b8 = O.j.b(i9);
                if (b8 == 0) {
                    i6 = 0;
                } else if (b8 != 1) {
                    if (b8 == 2) {
                        i6 = 2;
                    } else if (b8 == 3) {
                        i6 = 3;
                    } else if (b8 == 4) {
                        i6 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i9 != 6) {
                            throw new IllegalArgumentException("Could not convert " + AbstractC0279e.q(i9) + " to int");
                        }
                        i6 = 5;
                    }
                }
                c0307i.t(20, i6);
                c0307i.t(21, c1416d.f11763b ? 1L : 0L);
                c0307i.t(22, c1416d.f11764c ? 1L : 0L);
                c0307i.t(23, c1416d.f11765d ? 1L : 0L);
                c0307i.t(24, c1416d.f11766e ? 1L : 0L);
                c0307i.t(25, c1416d.f11767f);
                c0307i.t(26, c1416d.f11768g);
                Set<C1415c> triggers = c1416d.f11769h;
                kotlin.jvm.internal.i.e(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (C1415c c1415c : triggers) {
                                objectOutputStream.writeUTF(c1415c.f11759a.toString());
                                objectOutputStream.writeBoolean(c1415c.f11760b);
                            }
                            AbstractC1477a.e(objectOutputStream, null);
                            AbstractC1477a.e(byteArrayOutputStream, null);
                            byteArray = byteArrayOutputStream.toByteArray();
                            kotlin.jvm.internal.i.d(byteArray, "outputStream.toByteArray()");
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1477a.e(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                c0307i.w(27, byteArray);
                return;
            default:
                s sVar = (s) obj;
                String str8 = sVar.f204a;
                if (str8 == null) {
                    c0307i.j(1);
                } else {
                    c0307i.f(1, str8);
                }
                c0307i.f(2, sVar.f205b);
                return;
        }
    }

    public final void q(Object obj) {
        C0307i a6 = a();
        try {
            p(a6, obj);
            a6.f4892b.executeInsert();
        } finally {
            n(a6);
        }
    }
}
