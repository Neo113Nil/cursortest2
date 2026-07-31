package androidx.profileinstaller;

import P.f;
import P.h;
import X.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // X.b
    public final Object create(Context context) {
        h.a(new f(this, context.getApplicationContext()));
        return new U0.h(7);
    }

    @Override // X.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
