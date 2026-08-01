package androidx.profileinstaller;

import B.n;
import R0.e;
import android.content.Context;
import e0.i;
import java.util.Collections;
import java.util.List;
import n0.b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // n0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // n0.b
    public final Object b(Context context) {
        i.a(new n(this, 2, context.getApplicationContext()));
        return new e(23);
    }
}
