package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.Date;

/* loaded from: classes2.dex */
public class zl implements SegmentListener {

    /* renamed from: a, reason: collision with root package name */
    private SegmentListener f20555a;

    /* renamed from: b, reason: collision with root package name */
    private final b f20556b;

    /* renamed from: c, reason: collision with root package name */
    protected long f20557c;

    private class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f20558a;

        private b() {
        }

        public Handler a() {
            return this.f20558a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f20558a = new Handler();
            Looper.loop();
        }
    }

    public zl() {
        b bVar = new b();
        this.f20556b = bVar;
        bVar.start();
        this.f20557c = new Date().getTime();
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(final String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onSegmentReceived(" + str + ")", 1);
        if (a((Object) this.f20555a)) {
            a(new Runnable() { // from class: com.ironsource.K5
                @Override // java.lang.Runnable
                public final void run() {
                    zl.this.a(str);
                }
            });
        }
    }

    public void a(SegmentListener segmentListener) {
        this.f20555a = segmentListener;
    }

    protected void a(Runnable runnable) {
        Handler a4;
        b bVar = this.f20556b;
        if (bVar == null || (a4 = bVar.a()) == null) {
            return;
        }
        a4.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f20555a.onSegmentReceived(str);
    }

    protected boolean a(Object obj) {
        return (obj == null || this.f20556b == null) ? false : true;
    }
}
