package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.qo;
import defpackage.u2;
import defpackage.vw;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements qo {
    @Override // defpackage.qo
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.qo
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new u2(this, context.getApplicationContext()));
        return new vw(4);
    }
}
