package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d40 extends View {
    public final /* synthetic */ gd rtx2ld2ELZv4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(gd gdVar, Context context) {
        super(context);
        this.rtx2ld2ELZv4 = gdVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.rtx2ld2ELZv4.run();
    }
}
