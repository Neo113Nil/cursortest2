package androidx.profileinstaller;

import B0.C0023a;
import D0.RunnableC0061v;
import N.i;
import Q.b;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // Q.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // Q.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0023a(15);
        }
        i.a(new RunnableC0061v(1, this, context.getApplicationContext()));
        return new C0023a(15);
    }
}
