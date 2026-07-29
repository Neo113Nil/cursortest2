package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;
import java.lang.Thread;
import java.util.ArrayList;

@VisibleForTesting
/* loaded from: classes.dex */
public class ExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler zzqq;
    private final Tracker zzqr;
    private final Context zzqs;
    private ExceptionParser zzqt;
    private GoogleAnalytics zzqu;

    public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (tracker == null) {
            throw new NullPointerException("tracker cannot be null");
        }
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.zzqq = uncaughtExceptionHandler;
        this.zzqr = tracker;
        this.zzqt = new StandardExceptionParser(context, new ArrayList());
        this.zzqs = context.getApplicationContext();
        String valueOf = String.valueOf(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
        zzcl.v(valueOf.length() != 0 ? "ExceptionReporter created, original handler is ".concat(valueOf) : new String("ExceptionReporter created, original handler is "));
    }

    public ExceptionParser getExceptionParser() {
        return this.zzqt;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzqt = exceptionParser;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.zzqt != null) {
            str = this.zzqt.getDescription(thread != null ? thread.getName() : null, th);
        }
        String valueOf = String.valueOf(str);
        zzcl.v(valueOf.length() != 0 ? "Reporting uncaught exception: ".concat(valueOf) : new String("Reporting uncaught exception: "));
        this.zzqr.send(new HitBuilders.ExceptionBuilder().setDescription(str).setFatal(true).build());
        if (this.zzqu == null) {
            this.zzqu = GoogleAnalytics.getInstance(this.zzqs);
        }
        GoogleAnalytics googleAnalytics = this.zzqu;
        googleAnalytics.dispatchLocalHits();
        googleAnalytics.zzh().zzby().zzbp();
        if (this.zzqq != null) {
            zzcl.v("Passing exception to the original handler");
            this.zzqq.uncaughtException(thread, th);
        }
    }

    final Thread.UncaughtExceptionHandler zzl() {
        return this.zzqq;
    }
}
