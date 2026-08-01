package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ih extends ContentObserver {
    public final /* synthetic */ yf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(yf0 yf0Var) {
        super(new Handler());
        this.a = yf0Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        yf0 yf0Var = this.a;
        if (!yf0Var.g || (cursor = yf0Var.h) == null || cursor.isClosed()) {
            return;
        }
        yf0Var.f = yf0Var.h.requery();
    }
}
