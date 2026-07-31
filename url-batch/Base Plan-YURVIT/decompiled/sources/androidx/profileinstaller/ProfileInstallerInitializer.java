package androidx.profileinstaller;

import B0.C0000a;
import L.h;
import L.j;
import O.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // O.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // O.b
    public final Object b(Context context) {
        j.a(new h(this, context.getApplicationContext()));
        return new C0000a(9);
    }
}
