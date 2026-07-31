package x3;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import o3.j;
import r3.o;

/* loaded from: classes.dex */
public abstract class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f23187a;

    /* renamed from: b, reason: collision with root package name */
    private T f23188b;

    public static class a extends Exception {
        public a(@RecentlyNonNull String str) {
            super(str);
        }

        public a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    protected c(@RecentlyNonNull String str) {
        this.f23187a = str;
    }

    @RecentlyNonNull
    protected abstract T a(@RecentlyNonNull IBinder iBinder);

    @RecentlyNonNull
    protected final T b(@RecentlyNonNull Context context) {
        if (this.f23188b == null) {
            o.i(context);
            Context c7 = j.c(context);
            if (c7 == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f23188b = a((IBinder) c7.getClassLoader().loadClass(this.f23187a).newInstance());
            } catch (ClassNotFoundException e7) {
                throw new a("Could not load creator class.", e7);
            } catch (IllegalAccessException e8) {
                throw new a("Could not access creator.", e8);
            } catch (InstantiationException e9) {
                throw new a("Could not instantiate creator.", e9);
            }
        }
        return this.f23188b;
    }
}
