package x6;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f10515c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f10516d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10517a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f10518b;

    public a(Context context) {
        this.f10518b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f10517a;
        reentrantLock.lock();
        try {
            return this.f10518b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
