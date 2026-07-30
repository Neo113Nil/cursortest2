package o1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f7116c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C0798a f7117d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f7118a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f7119b;

    public C0798a(Context context) {
        this.f7119b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f7118a;
        reentrantLock.lock();
        try {
            return this.f7119b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
