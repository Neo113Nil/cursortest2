package d0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Set<a> f15467a = new HashSet();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f15468a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15469b;

        a(Uri uri, boolean z6) {
            this.f15468a = uri;
            this.f15469b = z6;
        }

        public Uri a() {
            return this.f15468a;
        }

        public boolean b() {
            return this.f15469b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15469b == aVar.f15469b && this.f15468a.equals(aVar.f15468a);
        }

        public int hashCode() {
            return (this.f15468a.hashCode() * 31) + (this.f15469b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z6) {
        this.f15467a.add(new a(uri, z6));
    }

    public Set<a> b() {
        return this.f15467a;
    }

    public int c() {
        return this.f15467a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f15467a.equals(((c) obj).f15467a);
    }

    public int hashCode() {
        return this.f15467a.hashCode();
    }
}
