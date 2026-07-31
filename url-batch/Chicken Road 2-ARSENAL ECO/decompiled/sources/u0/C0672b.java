package u0;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import l0.C0489c;
import m1.AbstractC0521b;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672b extends Q.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0672b(WorkDatabase workDatabase, int i7) {
        super(workDatabase);
        this.f5967d = i7;
    }

    @Override // Q.n
    public final String l() {
        switch (this.f5967d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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

    public final void p(V.i iVar, Object obj) {
        int i7;
        int i8;
        byte[] byteArray;
        switch (this.f5967d) {
            case 0:
                C0671a c0671a = (C0671a) obj;
                iVar.B(c0671a.f5965a, 1);
                String str = c0671a.f5966b;
                if (str == null) {
                    iVar.o(2);
                    return;
                } else {
                    iVar.B(str, 2);
                    return;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                C0674d c0674d = (C0674d) obj;
                iVar.B(c0674d.f5970a, 1);
                iVar.t(c0674d.f5971b.longValue(), 2);
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                String str2 = ((C0677g) obj).f5977a;
                if (str2 == null) {
                    iVar.o(1);
                } else {
                    iVar.B(str2, 1);
                }
                iVar.t(r2.f5978b, 2);
                iVar.t(r2.f5979c, 3);
                return;
            case 3:
                C0681k c0681k = (C0681k) obj;
                String str3 = c0681k.f5987a;
                if (str3 == null) {
                    iVar.o(1);
                } else {
                    iVar.B(str3, 1);
                }
                iVar.B(c0681k.f5988b, 2);
                return;
            case 4:
                C0683m c0683m = (C0683m) obj;
                String str4 = c0683m.f5991a;
                if (str4 == null) {
                    iVar.o(1);
                } else {
                    iVar.B(str4, 1);
                }
                byte[] c7 = l0.g.c(c0683m.f5992b);
                if (c7 == null) {
                    iVar.o(2);
                    return;
                } else {
                    iVar.A(2, c7);
                    return;
                }
            case 5:
                C0686p c0686p = (C0686p) obj;
                String str5 = c0686p.f6000a;
                int i9 = 1;
                if (str5 == null) {
                    iVar.o(1);
                } else {
                    iVar.B(str5, 1);
                }
                iVar.t(AbstractC0521b.D(c0686p.f6001b), 2);
                String str6 = c0686p.f6002c;
                if (str6 == null) {
                    iVar.o(3);
                } else {
                    iVar.B(str6, 3);
                }
                String str7 = c0686p.f6003d;
                if (str7 == null) {
                    iVar.o(4);
                } else {
                    iVar.B(str7, 4);
                }
                byte[] c8 = l0.g.c(c0686p.f6004e);
                if (c8 == null) {
                    iVar.o(5);
                } else {
                    iVar.A(5, c8);
                }
                byte[] c9 = l0.g.c(c0686p.f6005f);
                if (c9 == null) {
                    iVar.o(6);
                } else {
                    iVar.A(6, c9);
                }
                iVar.t(c0686p.f6006g, 7);
                iVar.t(c0686p.f6007h, 8);
                iVar.t(c0686p.f6008i, 9);
                iVar.t(c0686p.f6010k, 10);
                int i10 = c0686p.f6011l;
                W4.o.f("backoffPolicy", i10);
                int c10 = N.p.c(i10);
                if (c10 == 0) {
                    i7 = 0;
                } else {
                    if (c10 != 1) {
                        throw new H5.r();
                    }
                    i7 = 1;
                }
                iVar.t(i7, 11);
                iVar.t(c0686p.f6012m, 12);
                iVar.t(c0686p.f6013n, 13);
                iVar.t(c0686p.f6014o, 14);
                iVar.t(c0686p.f6015p, 15);
                iVar.t(c0686p.f6016q ? 1L : 0L, 16);
                int i11 = c0686p.f6017r;
                W4.o.f("policy", i11);
                int c11 = N.p.c(i11);
                if (c11 == 0) {
                    i8 = 0;
                } else {
                    if (c11 != 1) {
                        throw new H5.r();
                    }
                    i8 = 1;
                }
                iVar.t(i8, 17);
                iVar.t(c0686p.f6018s, 18);
                iVar.t(c0686p.f6019t, 19);
                l0.d dVar = c0686p.f6009j;
                if (dVar == null) {
                    iVar.o(20);
                    iVar.o(21);
                    iVar.o(22);
                    iVar.o(23);
                    iVar.o(24);
                    iVar.o(25);
                    iVar.o(26);
                    iVar.o(27);
                    return;
                }
                int i12 = dVar.f5255a;
                W4.o.f("networkType", i12);
                int c12 = N.p.c(i12);
                if (c12 == 0) {
                    i9 = 0;
                } else if (c12 != 1) {
                    if (c12 == 2) {
                        i9 = 2;
                    } else if (c12 == 3) {
                        i9 = 3;
                    } else if (c12 == 4) {
                        i9 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i12 != 6) {
                            throw new IllegalArgumentException("Could not convert " + W4.o.g(i12) + " to int");
                        }
                        i9 = 5;
                    }
                }
                iVar.t(i9, 20);
                iVar.t(dVar.f5256b ? 1L : 0L, 21);
                iVar.t(dVar.f5257c ? 1L : 0L, 22);
                iVar.t(dVar.f5258d ? 1L : 0L, 23);
                iVar.t(dVar.f5259e ? 1L : 0L, 24);
                iVar.t(dVar.f5260f, 25);
                iVar.t(dVar.f5261g, 26);
                Set<C0489c> triggers = dVar.f5262h;
                kotlin.jvm.internal.i.e(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (C0489c c0489c : triggers) {
                                objectOutputStream.writeUTF(c0489c.f5252a.toString());
                                objectOutputStream.writeBoolean(c0489c.f5253b);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            kotlin.jvm.internal.i.d(byteArray, "outputStream.toByteArray()");
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            A3.c.D(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                iVar.A(27, byteArray);
                return;
            default:
                C0688r c0688r = (C0688r) obj;
                String str8 = c0688r.f6031a;
                if (str8 == null) {
                    iVar.o(1);
                } else {
                    iVar.B(str8, 1);
                }
                iVar.B(c0688r.f6032b, 2);
                return;
        }
    }

    public final void q(Object obj) {
        V.i a7 = a();
        try {
            p(a7, obj);
            a7.f2704g.executeInsert();
        } finally {
            n(a7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0672b(WorkDatabase database) {
        super(database);
        this.f5967d = 1;
        kotlin.jvm.internal.i.e(database, "database");
    }
}
