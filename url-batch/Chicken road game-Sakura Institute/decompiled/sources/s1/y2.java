package s1;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e7.e f8483a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(e7.e eVar, Handler handler) {
        super(handler);
        this.f8483a = eVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8, Uri uri) {
        this.f8483a.e(d6.z.f2639a);
    }
}
