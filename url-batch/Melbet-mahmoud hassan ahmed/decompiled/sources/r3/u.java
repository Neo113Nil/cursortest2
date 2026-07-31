package r3;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p3.a;

/* loaded from: classes.dex */
public class u implements a.d {

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public static final u f21330c = c().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f21331b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f21332a;

        /* synthetic */ a(w wVar) {
        }

        @RecentlyNonNull
        public u a() {
            return new u(this.f21332a, null);
        }
    }

    /* synthetic */ u(String str, w wVar) {
        this.f21331b = str;
    }

    @RecentlyNonNull
    public static a c() {
        return new a(null);
    }

    @RecentlyNonNull
    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f21331b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return n.a(this.f21331b, ((u) obj).f21331b);
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f21331b);
    }
}
