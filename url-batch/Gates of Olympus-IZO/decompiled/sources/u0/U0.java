package u0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class U0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2.e f8259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(m2.e eVar, Handler handler) {
        super(handler);
        this.f8259a = eVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3, Uri uri) {
        this.f8259a.g(L1.z.f2729a);
    }
}
