package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import d1.b;
import java.util.Collections;
import java.util.List;
import r0.c;
import z0.i;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // d1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // d1.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new c(this, context.getApplicationContext()));
        return new i();
    }
}
