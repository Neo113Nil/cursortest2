package androidx.profileinstaller;

import A.b;
import B.i;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import m.AbstractC0074j;
import n.InterfaceC0082b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0082b {
    @Override // n.InterfaceC0082b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // n.InterfaceC0082b
    public final Object b(Context context) {
        AbstractC0074j.a(new i(2, this, context.getApplicationContext()));
        return new b(11);
    }
}
