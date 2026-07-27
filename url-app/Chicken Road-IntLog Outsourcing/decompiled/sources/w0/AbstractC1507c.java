package w0;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1507c {
    public static String[] a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}
