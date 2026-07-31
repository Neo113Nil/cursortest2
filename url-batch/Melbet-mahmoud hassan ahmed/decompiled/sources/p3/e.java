package p3;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p3.a;
import p3.a.d;
import q3.d0;
import q3.o0;
import q3.z;
import r3.d;
import r3.o;

/* loaded from: classes.dex */
public abstract class e<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20116a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20117b;

    /* renamed from: c, reason: collision with root package name */
    private final p3.a<O> f20118c;

    /* renamed from: d, reason: collision with root package name */
    private final O f20119d;

    /* renamed from: e, reason: collision with root package name */
    private final q3.b<O> f20120e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f20121f;

    /* renamed from: g, reason: collision with root package name */
    private final int f20122g;

    /* renamed from: h, reason: collision with root package name */
    private final f f20123h;

    /* renamed from: i, reason: collision with root package name */
    private final q3.m f20124i;

    /* renamed from: j, reason: collision with root package name */
    @RecentlyNonNull
    protected final q3.e f20125j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public static final a f20126c = new C0122a().a();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public final q3.m f20127a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public final Looper f20128b;

        /* renamed from: p3.e$a$a, reason: collision with other inner class name */
        public static class C0122a {

            /* renamed from: a, reason: collision with root package name */
            private q3.m f20129a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f20130b;

            /* JADX WARN: Multi-variable type inference failed */
            @RecentlyNonNull
            public a a() {
                if (this.f20129a == null) {
                    this.f20129a = new q3.a();
                }
                if (this.f20130b == null) {
                    this.f20130b = Looper.getMainLooper();
                }
                return new a(this.f20129a, this.f20130b);
            }
        }

        private a(q3.m mVar, Account account, Looper looper) {
            this.f20127a = mVar;
            this.f20128b = looper;
        }
    }

    public e(@RecentlyNonNull Context context, @RecentlyNonNull p3.a<O> aVar, @RecentlyNonNull O o7, @RecentlyNonNull a aVar2) {
        o.j(context, "Null context is not permitted.");
        o.j(aVar, "Api must not be null.");
        o.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f20116a = applicationContext;
        String l7 = l(context);
        this.f20117b = l7;
        this.f20118c = aVar;
        this.f20119d = o7;
        this.f20121f = aVar2.f20128b;
        this.f20120e = q3.b.a(aVar, o7, l7);
        this.f20123h = new d0(this);
        q3.e m7 = q3.e.m(applicationContext);
        this.f20125j = m7;
        this.f20122g = m7.n();
        this.f20124i = aVar2.f20127a;
        m7.o(this);
    }

    private final <TResult, A extends a.b> j4.h<TResult> k(int i7, q3.n<A, TResult> nVar) {
        j4.i iVar = new j4.i();
        this.f20125j.r(this, i7, nVar, iVar, this.f20124i);
        return iVar.a();
    }

    private static String l(Object obj) {
        if (!v3.l.k()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @RecentlyNonNull
    protected d.a c() {
        Account a7;
        GoogleSignInAccount b7;
        GoogleSignInAccount b8;
        d.a aVar = new d.a();
        O o7 = this.f20119d;
        if (!(o7 instanceof a.d.b) || (b8 = ((a.d.b) o7).b()) == null) {
            O o8 = this.f20119d;
            a7 = o8 instanceof a.d.InterfaceC0121a ? ((a.d.InterfaceC0121a) o8).a() : null;
        } else {
            a7 = b8.c();
        }
        aVar.c(a7);
        O o9 = this.f20119d;
        aVar.d((!(o9 instanceof a.d.b) || (b7 = ((a.d.b) o9).b()) == null) ? Collections.emptySet() : b7.n());
        aVar.e(this.f20116a.getClass().getName());
        aVar.b(this.f20116a.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> j4.h<TResult> d(@RecentlyNonNull q3.n<A, TResult> nVar) {
        return k(2, nVar);
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> j4.h<TResult> e(@RecentlyNonNull q3.n<A, TResult> nVar) {
        return k(0, nVar);
    }

    @RecentlyNonNull
    public final q3.b<O> f() {
        return this.f20120e;
    }

    @RecentlyNullable
    protected String g() {
        return this.f20117b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f h(Looper looper, z<O> zVar) {
        a.f a7 = ((a.AbstractC0120a) o.i(this.f20118c.a())).a(this.f20116a, looper, c().a(), this.f20119d, zVar, zVar);
        String g7 = g();
        if (g7 != null && (a7 instanceof r3.c)) {
            ((r3.c) a7).O(g7);
        }
        if (g7 != null && (a7 instanceof q3.i)) {
            ((q3.i) a7).q(g7);
        }
        return a7;
    }

    public final int i() {
        return this.f20122g;
    }

    public final o0 j(Context context, Handler handler) {
        return new o0(context, handler, c().a());
    }
}
