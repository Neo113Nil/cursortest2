package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.br;
import defpackage.e3;
import defpackage.ky;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements br {
    @Override // defpackage.br
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.br
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new e3(this, context.getApplicationContext()));
        return new ky(6);
    }
}
