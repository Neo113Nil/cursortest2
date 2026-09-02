package R1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import i2.AbstractC0457a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2332a;

    /* renamed from: b, reason: collision with root package name */
    public final S1.d f2333b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2334c;

    public d(Context context, S1.d dVar, b bVar) {
        this.f2332a = context;
        this.f2333b = dVar;
        this.f2334c = bVar;
    }

    public final void a(L1.j jVar, int i4, boolean z) {
        Context context = this.f2332a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(CharEncoding.UTF_8)));
        String str = jVar.f1645a;
        String str2 = jVar.f1645a;
        adler32.update(str.getBytes(Charset.forName(CharEncoding.UTF_8)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        I1.c cVar = jVar.f1647c;
        adler32.update(allocate.putInt(V1.a.a(cVar)).array());
        byte[] bArr = jVar.f1646b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i5 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i5 >= i4) {
                        AbstractC0457a.k("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((S1.j) this.f2333b).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(V1.a.a(cVar))});
        try {
            Cursor cursor = rawQuery;
            Long valueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f2334c;
            builder.setMinimumLatency(bVar.a(cVar, longValue, i4));
            Set set = ((c) bVar.f2328b.get(cVar)).f2331c;
            if (set.contains(f.f2338a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(f.f2340c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(f.f2339b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i4);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", V1.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(cVar, longValue, i4)), valueOf, Integer.valueOf(i4)};
            String r4 = AbstractC0457a.r("JobInfoScheduler");
            if (Log.isLoggable(r4, 3)) {
                Log.d(r4, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
