package h;

import Z.AbstractC0043g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class w extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0043g f2827a;

    public w(AbstractC0043g abstractC0043g) {
        this.f2827a = abstractC0043g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2827a.h();
    }
}
