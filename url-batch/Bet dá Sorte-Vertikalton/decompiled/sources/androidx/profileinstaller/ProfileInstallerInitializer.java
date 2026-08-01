package androidx.profileinstaller;

import B.o;
import M0.e;
import android.content.Context;
import d0.i;
import i0.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // i0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // i0.b
    public final Object b(Context context) {
        i.a(new o(this, 2, context.getApplicationContext()));
        return new e(20);
    }
}
