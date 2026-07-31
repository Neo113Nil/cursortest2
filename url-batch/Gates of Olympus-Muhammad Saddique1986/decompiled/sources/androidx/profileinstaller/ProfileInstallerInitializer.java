package androidx.profileinstaller;

import C1.b;
import L1.h;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import m1.w;
import v1.AbstractC1164f;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // C1.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // C1.b
    public final Object b(Context context) {
        AbstractC1164f.a(new h(this, 3, context.getApplicationContext()));
        return new w(6);
    }
}
