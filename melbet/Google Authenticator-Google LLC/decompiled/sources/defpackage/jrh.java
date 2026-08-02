package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrh implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public jrh(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    public final Activity a() {
        int i = this.b;
        jsb jsbVar = this.a;
        if (i != 0) {
            Activity activity = (Activity) ((jrx) jsbVar).a;
            hnu.bd(activity);
            return activity;
        }
        Activity activity2 = (Activity) ((jrx) jsbVar).a;
        iwh.a(activity2);
        return activity2;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        return this.b != 0 ? a() : a();
    }
}
