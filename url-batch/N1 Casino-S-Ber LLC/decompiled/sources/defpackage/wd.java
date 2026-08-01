package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wd extends ContentObserver {
    public final /* synthetic */ o40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(o40 o40Var) {
        super(new Handler());
        this.a = o40Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        o40 o40Var = this.a;
        if (!o40Var.g || (cursor = o40Var.h) == null || cursor.isClosed()) {
            return;
        }
        o40Var.f = o40Var.h.requery();
    }
}
