package g;

import Y.AbstractC0041g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0041g f2282a;

    public x(AbstractC0041g abstractC0041g) {
        this.f2282a = abstractC0041g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2282a.h();
    }
}
