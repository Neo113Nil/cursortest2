package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wg extends View {
    public final /* synthetic */ vg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(vg vgVar, Context context) {
        super(context);
        this.f = vgVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f.run();
    }
}
