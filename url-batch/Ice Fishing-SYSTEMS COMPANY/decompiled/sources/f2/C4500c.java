package f2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import j2.AbstractC4595a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4500c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37666a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.d f37667b;

    /* renamed from: c, reason: collision with root package name */
    public final C4498a f37668c;

    public C4500c(Context context, g2.d dVar, C4498a c4498a) {
        this.f37666a = context;
        this.f37667b = dVar;
        this.f37668c = c4498a;
    }

    public final void a(Z1.i iVar, int i, boolean z8) {
        Context context = this.f37666a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f4225a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        W1.d dVar = iVar.f4227c;
        adler32.update(allocate.putInt(AbstractC4595a.a(dVar)).array());
        byte[] bArr = iVar.f4226b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z8) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i4 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i4 >= i) {
                        U2.a.c("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase b9 = ((g2.h) this.f37667b).b();
        String valueOf = String.valueOf(AbstractC4595a.a(dVar));
        String str = iVar.f4225a;
        Cursor rawQuery = b9.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C4498a c4498a = this.f37668c;
            builder.setMinimumLatency(c4498a.a(dVar, longValue, i));
            Set set = ((C4499b) c4498a.f37662b.get(dVar)).f37665c;
            if (set.contains(EnumC4501d.f37669n)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC4501d.f37671v)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC4501d.f37670u)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC4595a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(c4498a.a(dVar, longValue, i)), valueOf2, Integer.valueOf(i)};
            String j9 = U2.a.j("JobInfoScheduler");
            if (Log.isLoggable(j9, 3)) {
                Log.d(j9, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
