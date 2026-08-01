package androidx.profileinstaller;

import B.o;
import H0.e;
import android.content.Context;
import c0.h;
import h0.InterfaceC0165b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0165b {
    @Override // h0.InterfaceC0165b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // h0.InterfaceC0165b
    public final Object b(Context context) {
        h.a(new o(this, 2, context.getApplicationContext()));
        return new e(19);
    }
}
