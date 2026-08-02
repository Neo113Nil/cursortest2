package J0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f625c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f626d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f627a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f628b;

    public a(Context context) {
        this.f628b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f627a;
        reentrantLock.lock();
        try {
            return this.f628b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
