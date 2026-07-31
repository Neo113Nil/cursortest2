package m3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import r3.o;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f19093c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static a f19094d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f19095a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f19096b;

    a(Context context) {
        this.f19096b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        o.i(context);
        Lock lock = f19093c;
        lock.lock();
        try {
            if (f19094d == null) {
                f19094d = new a(context.getApplicationContext());
            }
            a aVar = f19094d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f19093c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @RecentlyNullable
    public GoogleSignInAccount b() {
        String c7;
        String c8 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c8) || (c7 = c(d("googleSignInAccount", c8))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.p(c7);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RecentlyNullable
    protected final String c(@RecentlyNonNull String str) {
        this.f19095a.lock();
        try {
            return this.f19096b.getString(str, null);
        } finally {
            this.f19095a.unlock();
        }
    }
}
