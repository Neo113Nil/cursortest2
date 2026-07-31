package x1;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7.c f8406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(c7.c cVar, Handler handler) {
        super(handler);
        this.f8406a = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3, Uri uri) {
        this.f8406a.t(c6.m.f1757a);
    }
}
