package r3;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f21308a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f21309b;

        /* synthetic */ a(Object obj, n0 n0Var) {
            o.i(obj);
            this.f21309b = obj;
            this.f21308a = new ArrayList();
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.f21308a;
            o.i(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f21309b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f21308a.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append(this.f21308a.get(i7));
                if (i7 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    public static a c(@RecentlyNonNull Object obj) {
        return new a(obj, null);
    }
}
