package I;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import k.ViewOnClickListenerC1209d0;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewOnClickListenerC1209d0 f1109a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewOnClickListenerC1209d0 viewOnClickListenerC1209d0) {
        super(new Handler());
        this.f1109a = viewOnClickListenerC1209d0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        ViewOnClickListenerC1209d0 viewOnClickListenerC1209d0 = this.f1109a;
        if (!viewOnClickListenerC1209d0.f1113b || (cursor = viewOnClickListenerC1209d0.f1114c) == null || cursor.isClosed()) {
            return;
        }
        viewOnClickListenerC1209d0.f1112a = viewOnClickListenerC1209d0.f1114c.requery();
    }
}
