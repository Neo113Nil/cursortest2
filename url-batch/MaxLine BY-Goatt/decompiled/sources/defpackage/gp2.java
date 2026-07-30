package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gp2 {
    public static final ReentrantLock c = new ReentrantLock();
    public static gp2 d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public gp2(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
