package c6;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import z4.b0;
import z4.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u uVar) {
        super(uVar);
        this.f1807d = 1;
        uVar.getClass();
    }

    @Override // z4.b0
    public final String b() {
        switch (this.f1807d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void d(k5.k kVar, Object obj) {
        int i3;
        int i10;
        byte[] byteArray;
        switch (this.f1807d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f1805a;
                if (str == null) {
                    kVar.r(1);
                } else {
                    kVar.l(1, str);
                }
                String str2 = aVar.f1806b;
                if (str2 == null) {
                    kVar.r(2);
                    return;
                } else {
                    kVar.l(2, str2);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                kVar.l(1, dVar.f1811a);
                kVar.f(2, dVar.f1812b.longValue());
                return;
            case 2:
                String str3 = ((g) obj).f1816a;
                if (str3 == null) {
                    kVar.r(1);
                } else {
                    kVar.l(1, str3);
                }
                kVar.f(2, r2.f1817b);
                kVar.f(3, r2.f1818c);
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                k kVar2 = (k) obj;
                String str4 = kVar2.f1826a;
                if (str4 == null) {
                    kVar.r(1);
                } else {
                    kVar.l(1, str4);
                }
                String str5 = kVar2.f1827b;
                if (str5 == null) {
                    kVar.r(2);
                    return;
                } else {
                    kVar.l(2, str5);
                    return;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                m mVar = (m) obj;
                String str6 = mVar.f1831a;
                if (str6 == null) {
                    kVar.r(1);
                } else {
                    kVar.l(1, str6);
                }
                byte[] c10 = t5.e.c(mVar.f1832b);
                if (c10 == null) {
                    kVar.r(2);
                    return;
                } else {
                    kVar.D(2, c10);
                    return;
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                p pVar = (p) obj;
                String str7 = pVar.f1839a;
                int i11 = 1;
                if (str7 == null) {
                    kVar.r(1);
                } else {
                    kVar.l(1, str7);
                }
                kVar.f(2, i7.a.g0(pVar.f1840b));
                String str8 = pVar.f1841c;
                if (str8 == null) {
                    kVar.r(3);
                } else {
                    kVar.l(3, str8);
                }
                String str9 = pVar.f1842d;
                if (str9 == null) {
                    kVar.r(4);
                } else {
                    kVar.l(4, str9);
                }
                byte[] c11 = t5.e.c(pVar.f1843e);
                if (c11 == null) {
                    kVar.r(5);
                } else {
                    kVar.D(5, c11);
                }
                byte[] c12 = t5.e.c(pVar.f1844f);
                if (c12 == null) {
                    kVar.r(6);
                } else {
                    kVar.D(6, c12);
                }
                kVar.f(7, pVar.g);
                kVar.f(8, pVar.f1845h);
                kVar.f(9, pVar.f1846i);
                kVar.f(10, pVar.f1847k);
                int i12 = pVar.f1848l;
                if (i12 == 0) {
                    throw null;
                }
                int b10 = a4.i.b(i12);
                if (b10 == 0) {
                    i3 = 0;
                } else {
                    if (b10 != 1) {
                        a2.r.p();
                        return;
                    }
                    i3 = 1;
                }
                kVar.f(11, i3);
                kVar.f(12, pVar.f1849m);
                kVar.f(13, pVar.f1850n);
                kVar.f(14, pVar.f1851o);
                kVar.f(15, pVar.f1852p);
                kVar.f(16, pVar.f1853q ? 1L : 0L);
                int i13 = pVar.f1854r;
                if (i13 == 0) {
                    throw null;
                }
                int b11 = a4.i.b(i13);
                if (b11 == 0) {
                    i10 = 0;
                } else {
                    if (b11 != 1) {
                        a2.r.p();
                        return;
                    }
                    i10 = 1;
                }
                kVar.f(17, i10);
                kVar.f(18, pVar.f1855s);
                kVar.f(19, pVar.f1856t);
                t5.d dVar2 = pVar.j;
                if (dVar2 == null) {
                    kVar.r(20);
                    kVar.r(21);
                    kVar.r(22);
                    kVar.r(23);
                    kVar.r(24);
                    kVar.r(25);
                    kVar.r(26);
                    kVar.r(27);
                    return;
                }
                int i14 = dVar2.f9293a;
                if (i14 == 0) {
                    throw null;
                }
                int b12 = a4.i.b(i14);
                if (b12 == 0) {
                    i11 = 0;
                } else if (b12 != 1) {
                    if (b12 == 2) {
                        i11 = 2;
                    } else if (b12 == 3) {
                        i11 = 3;
                    } else if (b12 == 4) {
                        i11 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i14 != 6) {
                            throw new IllegalArgumentException("Could not convert " + n0.l.m(i14) + " to int");
                        }
                        i11 = 5;
                    }
                }
                kVar.f(20, i11);
                kVar.f(21, dVar2.f9294b ? 1L : 0L);
                kVar.f(22, dVar2.f9295c ? 1L : 0L);
                kVar.f(23, dVar2.f9296d ? 1L : 0L);
                kVar.f(24, dVar2.f9297e ? 1L : 0L);
                kVar.f(25, dVar2.f9298f);
                kVar.f(26, dVar2.g);
                Set<t5.c> set = dVar2.f9299h;
                set.getClass();
                if (set.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(set.size());
                            for (t5.c cVar : set) {
                                objectOutputStream.writeUTF(cVar.f9290a.toString());
                                objectOutputStream.writeBoolean(cVar.f9291b);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArray.getClass();
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            i7.a.G(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                kVar.D(27, byteArray);
                return;
            default:
                r rVar = (r) obj;
                String str10 = rVar.f1866a;
                if (str10 == null) {
                    kVar.r(1);
                } else {
                    kVar.l(1, str10);
                }
                kVar.l(2, rVar.f1867b);
                return;
        }
    }

    public final void e(Object obj) {
        k5.k a9 = a();
        try {
            d(a9, obj);
            a9.f5437e.executeInsert();
        } finally {
            c(a9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u uVar, int i3) {
        super(uVar);
        this.f1807d = i3;
    }
}
