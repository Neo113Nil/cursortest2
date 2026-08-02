package B0;

import a.AbstractC0129a;
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
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import s0.EnumC1186c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f119a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.d f120b;

    /* renamed from: c, reason: collision with root package name */
    public final b f121c;

    public d(Context context, C0.d dVar, b bVar) {
        this.f119a = context;
        this.f120b = dVar;
        this.f121c = bVar;
    }

    public final void a(v0.i iVar, int i3, boolean z) {
        Context context = this.f119a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(CharEncoding.UTF_8)));
        adler32.update(iVar.f10554a.getBytes(Charset.forName(CharEncoding.UTF_8)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        EnumC1186c enumC1186c = iVar.f10556c;
        adler32.update(allocate.putInt(F0.a.a(enumC1186c)).array());
        byte[] bArr = iVar.f10555b;
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
                int i4 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i4 >= i3) {
                        AbstractC0129a.j("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a3 = ((C0.k) this.f120b).a();
        String valueOf = String.valueOf(F0.a.a(enumC1186c));
        String str = iVar.f10554a;
        Cursor rawQuery = a3.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Cursor cursor = rawQuery;
            Long valueOf2 = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f121c;
            builder.setMinimumLatency(bVar.a(enumC1186c, longValue, i3));
            Set set = ((c) bVar.f115b.get(enumC1186c)).f118c;
            if (set.contains(e.f122a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f124c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f123b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", F0.a.a(enumC1186c));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(enumC1186c, longValue, i3)), valueOf2, Integer.valueOf(i3)};
            String p3 = AbstractC0129a.p("JobInfoScheduler");
            if (Log.isLoggable(p3, 3)) {
                Log.d(p3, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
