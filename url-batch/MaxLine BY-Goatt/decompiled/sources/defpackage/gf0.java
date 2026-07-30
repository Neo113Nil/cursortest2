package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gf0 extends View {
    public final /* synthetic */ ff0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(ff0 ff0Var, Context context) {
        super(context);
        this.m = ff0Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.m.run();
    }
}
