package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.bv;
import defpackage.m3;
import defpackage.xy;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements bv {
    @Override // defpackage.bv
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.bv
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new m3(this, context.getApplicationContext()));
        return new xy(9);
    }
}
