package m8;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f6586e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f6587i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f6588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f6589s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f6590t;

    public /* synthetic */ d(g gVar, Runnable runnable, long j, long j3, TimeUnit timeUnit, int i3) {
        this.f6585d = i3;
        this.f6586e = gVar;
        this.f6587i = runnable;
        this.f6588r = j;
        this.f6589s = j3;
        this.f6590t = timeUnit;
    }

    @Override // m8.h
    public final ScheduledFuture b(l.d dVar) {
        switch (this.f6585d) {
            case 0:
                g gVar = this.f6586e;
                return gVar.f6600e.scheduleAtFixedRate(new e(gVar, this.f6587i, dVar, 0), this.f6588r, this.f6589s, this.f6590t);
            default:
                g gVar2 = this.f6586e;
                return gVar2.f6600e.scheduleWithFixedDelay(new e(gVar2, this.f6587i, dVar, 2), this.f6588r, this.f6589s, this.f6590t);
        }
    }
}
