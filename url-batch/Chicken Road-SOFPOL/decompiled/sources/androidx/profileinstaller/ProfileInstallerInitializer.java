package androidx.profileinstaller;

import a5.b;
import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // a5.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // a5.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new c4.b(this, context.getApplicationContext()));
        return new p.b(8);
    }
}
