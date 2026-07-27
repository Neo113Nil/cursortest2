package s0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class g1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y2.e f10233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Y2.e eVar, Handler handler) {
        super(handler);
        this.f10233a = eVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4, Uri uri) {
        this.f10233a.o(Unit.f7487a);
    }
}
