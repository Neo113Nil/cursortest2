package androidx.profileinstaller;

import D.n;
import N0.e;
import android.content.Context;
import f0.i;
import java.util.Collections;
import java.util.List;
import n0.InterfaceC0315b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0315b {
    @Override // n0.InterfaceC0315b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // n0.InterfaceC0315b
    public final Object b(Context context) {
        i.a(new n(this, 3, context.getApplicationContext()));
        return new e(25);
    }
}
