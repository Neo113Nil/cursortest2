package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import d1.g;
import h1.b;
import java.util.Collections;
import java.util.List;
import l2.f;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // h1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // h1.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new g(this, context.getApplicationContext()));
        return new f(12);
    }
}
