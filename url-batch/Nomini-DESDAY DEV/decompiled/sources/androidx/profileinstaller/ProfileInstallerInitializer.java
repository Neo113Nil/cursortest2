package androidx.profileinstaller;

import B.o;
import H0.e;
import android.content.Context;
import d0.i;
import i0.InterfaceC0136b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0136b {
    @Override // i0.InterfaceC0136b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // i0.InterfaceC0136b
    public final Object b(Context context) {
        i.a(new o(this, 2, context.getApplicationContext()));
        return new e(20);
    }
}
