package androidx.profileinstaller;

import C.o;
import K0.e;
import android.content.Context;
import f0.i;
import java.util.Collections;
import java.util.List;
import k0.InterfaceC0151b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0151b {
    @Override // k0.InterfaceC0151b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // k0.InterfaceC0151b
    public final Object b(Context context) {
        i.a(new o(this, 2, context.getApplicationContext()));
        return new e(23);
    }
}
