package androidx.profileinstaller;

import B3.c;
import U.j;
import android.content.Context;
import e0.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // e0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // e0.b
    public final Object create(Context context) {
        j.a(new c(this, 8, context.getApplicationContext()));
        return new l1.j(15);
    }
}
