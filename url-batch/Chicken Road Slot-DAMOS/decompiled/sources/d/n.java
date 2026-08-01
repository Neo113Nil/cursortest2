package d;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f3262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, Context context) {
        super(context);
        this.f3262d = mVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f3262d.run();
    }
}
