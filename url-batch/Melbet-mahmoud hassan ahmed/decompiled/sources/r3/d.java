package r3;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f21231a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Scope> f21232b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Scope> f21233c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<p3.a<?>, x> f21234d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21235e;

    /* renamed from: f, reason: collision with root package name */
    private final View f21236f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21237g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21238h;

    /* renamed from: i, reason: collision with root package name */
    private final h4.a f21239i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f21240j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f21241a;

        /* renamed from: b, reason: collision with root package name */
        private h.b<Scope> f21242b;

        /* renamed from: c, reason: collision with root package name */
        private String f21243c;

        /* renamed from: d, reason: collision with root package name */
        private String f21244d;

        /* renamed from: e, reason: collision with root package name */
        private h4.a f21245e = h4.a.f16821k;

        @RecentlyNonNull
        public d a() {
            return new d(this.f21241a, this.f21242b, null, 0, null, this.f21243c, this.f21244d, this.f21245e, false);
        }

        @RecentlyNonNull
        public a b(@RecentlyNonNull String str) {
            this.f21243c = str;
            return this;
        }

        @RecentlyNonNull
        public final a c(Account account) {
            this.f21241a = account;
            return this;
        }

        @RecentlyNonNull
        public final a d(@RecentlyNonNull Collection<Scope> collection) {
            if (this.f21242b == null) {
                this.f21242b = new h.b<>();
            }
            this.f21242b.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public final a e(@RecentlyNonNull String str) {
            this.f21244d = str;
            return this;
        }
    }

    public d(Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<p3.a<?>, x> map, int i7, View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, h4.a aVar, boolean z6) {
        this.f21231a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f21232b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f21234d = map;
        this.f21236f = view;
        this.f21235e = i7;
        this.f21237g = str;
        this.f21238h = str2;
        this.f21239i = aVar == null ? h4.a.f16821k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator<x> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f21338a);
        }
        this.f21233c = Collections.unmodifiableSet(hashSet);
    }

    @RecentlyNullable
    public Account a() {
        return this.f21231a;
    }

    @RecentlyNonNull
    public Account b() {
        Account account = this.f21231a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @RecentlyNonNull
    public Set<Scope> c() {
        return this.f21233c;
    }

    @RecentlyNonNull
    public String d() {
        return this.f21237g;
    }

    @RecentlyNonNull
    public Set<Scope> e() {
        return this.f21232b;
    }

    @RecentlyNullable
    public final String f() {
        return this.f21238h;
    }

    @RecentlyNonNull
    public final h4.a g() {
        return this.f21239i;
    }

    @RecentlyNullable
    public final Integer h() {
        return this.f21240j;
    }

    public final void i(@RecentlyNonNull Integer num) {
        this.f21240j = num;
    }
}
