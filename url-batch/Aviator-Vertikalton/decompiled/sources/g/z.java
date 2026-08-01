package g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.AbstractC0050g;

/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0050g f2605a;

    public z(AbstractC0050g abstractC0050g) {
        this.f2605a = abstractC0050g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2605a.h();
    }
}
