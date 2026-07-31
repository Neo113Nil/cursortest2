package u0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class f1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2.g f9348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(s2.g gVar, Handler handler) {
        super(handler);
        this.f9348a = gVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3, Uri uri) {
        this.f9348a.p(R1.y.f4171a);
    }
}
