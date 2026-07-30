package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.g21;
import defpackage.g52;
import defpackage.nm1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements g21 {
    @Override // defpackage.g21
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.g21
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new g52(this, context.getApplicationContext()));
        return new nm1(15);
    }
}
