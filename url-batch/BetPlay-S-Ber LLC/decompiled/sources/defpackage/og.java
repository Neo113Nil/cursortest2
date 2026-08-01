package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class og extends View {
    public final /* synthetic */ ng f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(ng ngVar, Context context) {
        super(context);
        this.f = ngVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f.run();
    }
}
