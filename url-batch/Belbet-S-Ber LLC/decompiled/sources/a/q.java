package a;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q extends View {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f71f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, Context context) {
        super(context);
        this.f71f = pVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        i3.d.e(configuration, "newConfig");
        this.f71f.run();
    }
}
