package g;

import X.AbstractC0038g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0038g f2420a;

    public x(AbstractC0038g abstractC0038g) {
        this.f2420a = abstractC0038g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2420a.h();
    }
}
