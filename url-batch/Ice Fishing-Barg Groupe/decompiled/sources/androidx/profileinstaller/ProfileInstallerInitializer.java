package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.ib0;
import defpackage.sq1;
import defpackage.yo0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements yo0 {
    @Override // defpackage.yo0
    public final List PxuCJdSBwIXG() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.yo0
    public final Object lS5Rgt96tfkO(Context context) {
        Choreographer.getInstance().postFrameCallback(new sq1(this, context.getApplicationContext()));
        return new ib0(11);
    }
}
