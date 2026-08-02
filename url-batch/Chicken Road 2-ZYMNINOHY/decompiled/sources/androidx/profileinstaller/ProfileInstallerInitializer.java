package androidx.profileinstaller;

import a0.C0144j;
import android.content.Context;
import com.startapp.sdk.internal.C;
import j1.g;
import java.util.Collections;
import java.util.List;
import n1.InterfaceC1319b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1319b {
    @Override // n1.InterfaceC1319b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // n1.InterfaceC1319b
    public final Object create(Context context) {
        g.a(new C(this, context.getApplicationContext()));
        return new C0144j(13, false);
    }
}
