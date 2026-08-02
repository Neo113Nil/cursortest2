package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fce extends BroadcastReceiver {
    public final hvw a = new hvw();
    public final Set b;
    public final Object c;

    public fce(Set set) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new Object();
        hashSet.addAll(set);
        a();
    }

    private final void a() {
        synchronized (this.c) {
            if (this.b.isEmpty()) {
                this.a.o(null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String R = hoq.R(intent.getPackage());
        synchronized (this.c) {
            this.b.remove(R);
        }
        a();
    }
}
