package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import e1.g;
import i1.b;
import java.util.Collections;
import java.util.List;
import o2.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // i1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // i1.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new g(this, context.getApplicationContext()));
        return new f(13);
    }
}
