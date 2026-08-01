package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.fp;
import defpackage.ix;
import defpackage.m3;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements fp {
    @Override // defpackage.fp
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.fp
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new m3(this, context.getApplicationContext()));
        return new ix(4);
    }
}
