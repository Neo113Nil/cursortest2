package g0;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import d0.c;
import d0.j;
import d0.k;
import java.util.Iterator;
import l0.p;

/* loaded from: classes.dex */
class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16218b = j.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f16219a;

    /* renamed from: g0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0064a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16220a;

        static {
            int[] iArr = new int[k.values().length];
            f16220a = iArr;
            try {
                iArr[k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16220a[k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16220a[k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16220a[k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16220a[k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    a(Context context) {
        this.f16219a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(c.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(k kVar) {
        int i7 = C0064a.f16220a[kVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 != 4) {
            if (i7 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        j.c().a(f16218b, String.format("API version too low. Cannot convert network type value %s", kVar), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(p pVar, int i7) {
        d0.b bVar = pVar.f18486j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f18477a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i7, this.f16219a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.b());
        if (!bVar.h()) {
            extras.setBackoffCriteria(pVar.f18489m, pVar.f18488l == d0.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f18493q) {
            extras.setImportantWhileForeground(true);
        }
        if (i8 >= 24 && bVar.e()) {
            Iterator<c.a> it = bVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.c());
            extras.setTriggerContentMaxDelay(bVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z6 = pVar.f18487k > 0;
        if (p.a.b() && pVar.f18493q && !z6) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
