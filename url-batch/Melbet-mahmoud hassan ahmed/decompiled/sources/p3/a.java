package p3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p3.a.d;
import p3.f;
import r3.c;
import r3.o;

/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0120a<?, O> f20110a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f20111b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20112c;

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0120a<T extends f, O> extends e<T, O> {
        @RecentlyNonNull
        @Deprecated
        public T a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull r3.d dVar, @RecentlyNonNull O o7, @RecentlyNonNull f.a aVar, @RecentlyNonNull f.b bVar) {
            return b(context, looper, dVar, o7, aVar, bVar);
        }

        @RecentlyNonNull
        public T b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull r3.d dVar, @RecentlyNonNull O o7, @RecentlyNonNull q3.d dVar2, @RecentlyNonNull q3.j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public static final c f20113a = new c(null);

        /* renamed from: p3.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0121a extends d {
            @RecentlyNonNull
            Account a();
        }

        public interface b extends d {
            @RecentlyNullable
            GoogleSignInAccount b();
        }

        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(m mVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        boolean a();

        Set<Scope> b();

        void c(@RecentlyNonNull c.InterfaceC0129c interfaceC0129c);

        void d();

        void e(r3.i iVar, Set<Scope> set);

        void f(@RecentlyNonNull String str);

        void g(@RecentlyNonNull c.e eVar);

        boolean h();

        int j();

        boolean k();

        @RecentlyNonNull
        o3.d[] l();

        @RecentlyNonNull
        String m();

        @RecentlyNullable
        String n();

        boolean o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(@RecentlyNonNull String str, @RecentlyNonNull AbstractC0120a<C, O> abstractC0120a, @RecentlyNonNull g<C> gVar) {
        o.j(abstractC0120a, "Cannot construct an Api with a null ClientBuilder");
        o.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f20112c = str;
        this.f20110a = abstractC0120a;
        this.f20111b = gVar;
    }

    @RecentlyNonNull
    public final AbstractC0120a<?, O> a() {
        return this.f20110a;
    }

    @RecentlyNonNull
    public final String b() {
        return this.f20112c;
    }
}
