package l4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    private static class b<T> implements k<T>, Serializable {

        /* renamed from: f, reason: collision with root package name */
        private final List<? extends k<? super T>> f18618f;

        private b(List<? extends k<? super T>> list) {
            this.f18618f = list;
        }

        @Override // l4.k
        public boolean apply(T t6) {
            for (int i7 = 0; i7 < this.f18618f.size(); i7++) {
                if (!this.f18618f.get(i7).apply(t6)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f18618f.equals(((b) obj).f18618f);
            }
            return false;
        }

        public int hashCode() {
            return this.f18618f.hashCode() + 306654252;
        }

        public String toString() {
            return l.d("and", this.f18618f);
        }
    }

    public static <T> k<T> b(k<? super T> kVar, k<? super T> kVar2) {
        return new b(c((k) j.i(kVar), (k) j.i(kVar2)));
    }

    private static <T> List<k<? super T>> c(k<? super T> kVar, k<? super T> kVar2) {
        return Arrays.asList(kVar, kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z6 = true;
        for (Object obj : iterable) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
