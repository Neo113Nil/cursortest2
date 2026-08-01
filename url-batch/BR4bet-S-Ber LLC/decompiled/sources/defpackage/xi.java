package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xi extends View {
    public final /* synthetic */ wi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(wi wiVar, Context context) {
        super(context);
        this.f = wiVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f.run();
    }
}
