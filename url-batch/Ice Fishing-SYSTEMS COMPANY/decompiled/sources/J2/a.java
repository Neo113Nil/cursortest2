package J2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f1394c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f1395d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1396a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1397b;

    public a(Context context) {
        this.f1397b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f1396a;
        reentrantLock.lock();
        try {
            return this.f1397b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
