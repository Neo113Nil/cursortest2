package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import o.h;
import o.j;
import p.b;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // p.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p.b
    public final Object b(Context context) {
        j.a(new h(this, context.getApplicationContext()));
        return new c0.b(12);
    }
}
