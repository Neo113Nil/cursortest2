package g;

import X.AbstractC0037g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0037g f2459a;

    public x(AbstractC0037g abstractC0037g) {
        this.f2459a = abstractC0037g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2459a.h();
    }
}
