package androidx.profileinstaller;

import android.content.Context;
import e0.f;
import e0.h;
import java.util.Collections;
import java.util.List;
import o0.InterfaceC0797b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0797b {
    @Override // o0.InterfaceC0797b
    public final Object create(Context context) {
        h.a(new f(this, context.getApplicationContext()));
        return new q1.h(15);
    }

    @Override // o0.InterfaceC0797b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
