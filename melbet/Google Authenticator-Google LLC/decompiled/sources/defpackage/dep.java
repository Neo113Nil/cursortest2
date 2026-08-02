package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dep extends ContentObserver {
    final /* synthetic */ der a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dep(der derVar) {
        super(null);
        this.a = derVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e = (byte) 1;
    }
}
