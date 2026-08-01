package androidx.profileinstaller;

import B.o;
import I0.e;
import android.content.Context;
import d0.i;
import i0.InterfaceC0138b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0138b {
    @Override // i0.InterfaceC0138b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // i0.InterfaceC0138b
    public final Object b(Context context) {
        i.a(new o(this, 2, context.getApplicationContext()));
        return new e(22);
    }
}
