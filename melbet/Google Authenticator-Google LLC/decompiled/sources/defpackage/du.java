package defpackage;

import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class du extends dt {
    final /* synthetic */ dy a;
    public final bvw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(dy dyVar, bvw bvwVar) {
        super(dyVar);
        this.a = dyVar;
        this.b = bvwVar;
    }

    @Override // defpackage.dt
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.dt
    public final void b() {
        this.a.M(true, true);
    }
}
