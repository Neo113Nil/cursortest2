package androidx.profileinstaller;

import D1.j;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import k.C0523b;
import s1.g;
import y1.InterfaceC1064b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1064b {
    @Override // y1.InterfaceC1064b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // y1.InterfaceC1064b
    public final Object b(Context context) {
        g.a(new j(this, 4, context.getApplicationContext()));
        return new C0523b(5);
    }
}
