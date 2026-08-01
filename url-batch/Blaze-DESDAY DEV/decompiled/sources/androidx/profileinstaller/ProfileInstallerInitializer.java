package androidx.profileinstaller;

import B.o;
import J0.e;
import android.content.Context;
import e0.i;
import j0.InterfaceC0148b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0148b {
    @Override // j0.InterfaceC0148b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // j0.InterfaceC0148b
    public final Object b(Context context) {
        i.a(new o(this, 2, context.getApplicationContext()));
        return new e(22);
    }
}
