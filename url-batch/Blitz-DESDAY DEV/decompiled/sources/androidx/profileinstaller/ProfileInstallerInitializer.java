package androidx.profileinstaller;

import D.o;
import L0.e;
import android.content.Context;
import f0.AbstractC0093i;
import java.util.Collections;
import java.util.List;
import k0.b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // k0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // k0.b
    public final Object b(Context context) {
        AbstractC0093i.a(new o(this, 2, context.getApplicationContext()));
        return new e(22);
    }
}
