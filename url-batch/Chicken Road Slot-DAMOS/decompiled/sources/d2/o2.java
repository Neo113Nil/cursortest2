package d2;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ie.c f3498a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(ie.c cVar, Handler handler) {
        super(handler);
        this.f3498a = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        this.f3498a.b(Unit.f5554a);
    }
}
