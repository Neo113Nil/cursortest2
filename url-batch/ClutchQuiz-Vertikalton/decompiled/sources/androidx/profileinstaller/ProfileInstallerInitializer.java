package androidx.profileinstaller;

import B.o;
import O0.e;
import android.content.Context;
import d0.i;
import java.util.Collections;
import java.util.List;
import l0.InterfaceC0254b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0254b {
    @Override // l0.InterfaceC0254b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // l0.InterfaceC0254b
    public final Object b(Context context) {
        i.a(new o(this, 3, context.getApplicationContext()));
        return new e(24);
    }
}
