package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class up1 extends ContentObserver {
    public final /* synthetic */ we a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(we weVar, Handler handler) {
        super(handler);
        this.a = weVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.s(Unit.a);
    }
}
