package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class m extends a {
    final /* synthetic */ o this$0;

    public m(o oVar) {
        this.this$0 = oVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        F0.i.e(activity, "activity");
        this.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        F0.i.e(activity, "activity");
        o oVar = this.this$0;
        int i2 = oVar.f1531e + 1;
        oVar.f1531e = i2;
        if (i2 == 1 && oVar.f1534h) {
            oVar.f1536j.a(d.ON_START);
            oVar.f1534h = false;
        }
    }
}
