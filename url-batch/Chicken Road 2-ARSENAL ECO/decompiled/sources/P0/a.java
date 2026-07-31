package P0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f1872c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f1873d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1874a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1875b;

    public a(Context context) {
        this.f1875b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f1874a;
        reentrantLock.lock();
        try {
            return this.f1875b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
