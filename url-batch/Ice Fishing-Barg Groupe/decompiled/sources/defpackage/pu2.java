package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pu2 extends ContentObserver {
    public final /* synthetic */ eg PxuCJdSBwIXG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu2(eg egVar, Handler handler) {
        super(handler);
        this.PxuCJdSBwIXG = egVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.PxuCJdSBwIXG.Y1f8riQaR6yg(no2.PxuCJdSBwIXG);
    }
}
