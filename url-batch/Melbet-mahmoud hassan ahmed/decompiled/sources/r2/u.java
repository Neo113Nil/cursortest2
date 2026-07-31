package r2;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.io0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public static final List<String> f21172e = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f21173a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21174b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21175c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f21176d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f21177a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f21178b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f21179c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List<String> f21180d = new ArrayList();

        @RecentlyNonNull
        public u a() {
            return new u(this.f21177a, this.f21178b, this.f21179c, this.f21180d, null);
        }

        @RecentlyNonNull
        public a b(String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                io0.g(str.length() != 0 ? "Invalid value passed to setMaxAdContentRating: ".concat(str) : new String("Invalid value passed to setMaxAdContentRating: "));
                return this;
            }
            this.f21179c = str;
            return this;
        }

        @RecentlyNonNull
        public a c(int i7) {
            if (i7 == -1 || i7 == 0 || i7 == 1) {
                this.f21177a = i7;
            } else {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i7);
                io0.g(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        public a d(int i7) {
            if (i7 == -1 || i7 == 0 || i7 == 1) {
                this.f21178b = i7;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i7);
                io0.g(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        public a e(List<String> list) {
            this.f21180d.clear();
            if (list != null) {
                this.f21180d.addAll(list);
            }
            return this;
        }
    }

    /* synthetic */ u(int i7, int i8, String str, List list, a0 a0Var) {
        this.f21173a = i7;
        this.f21174b = i8;
        this.f21175c = str;
        this.f21176d = list;
    }

    @RecentlyNonNull
    public String a() {
        String str = this.f21175c;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f21173a;
    }

    public int c() {
        return this.f21174b;
    }

    @RecentlyNonNull
    public List<String> d() {
        return new ArrayList(this.f21176d);
    }

    @RecentlyNonNull
    public a e() {
        a aVar = new a();
        aVar.c(this.f21173a);
        aVar.d(this.f21174b);
        aVar.b(this.f21175c);
        aVar.e(this.f21176d);
        return aVar;
    }
}
