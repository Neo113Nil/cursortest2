package androidx.profileinstaller;

import B1.o;
import H1.f;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import u1.AbstractC1223g;
import w1.InterfaceC1291b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1291b {
    @Override // w1.InterfaceC1291b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // w1.InterfaceC1291b
    public final Object b(Context context) {
        AbstractC1223g.a(new o(this, 7, context.getApplicationContext()));
        return new f(21, false);
    }
}
