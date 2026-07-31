package r0;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import r0.i;

/* loaded from: classes.dex */
public class r2 extends Exception implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final i.a<r2> f20906h = new i.a() { // from class: r0.q2
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            return new r2(bundle);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final int f20907f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20908g;

    protected r2(Bundle bundle) {
        this(bundle.getString(d(2)), c(bundle), bundle.getInt(d(0), 1000), bundle.getLong(d(1), SystemClock.elapsedRealtime()));
    }

    protected r2(String str, Throwable th, int i7, long j7) {
        super(str, th);
        this.f20907f = i7;
        this.f20908g = j7;
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(d(3));
        String string2 = bundle.getString(d(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, r2.class.getClassLoader());
            Throwable b7 = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            if (b7 != null) {
                return b7;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    protected static String d(int i7) {
        return Integer.toString(i7, 36);
    }
}
