package z2;

import a3.r1;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class v extends o {
    public v(Activity activity) {
        super(activity);
    }

    @Override // z2.o, com.google.android.gms.internal.ads.zg0
    public final void P2(Bundle bundle) {
        r1.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f23677y = 4;
        this.f23658f.finish();
    }
}
