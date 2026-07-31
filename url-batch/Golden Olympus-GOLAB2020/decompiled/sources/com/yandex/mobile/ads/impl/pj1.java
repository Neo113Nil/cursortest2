package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class pj1 {

    private static class a<T> implements oj1<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        private final List<? extends oj1<? super T>> f30468b;

        @Override // com.yandex.mobile.ads.impl.oj1
        public final boolean apply(T t4) {
            for (int i4 = 0; i4 < this.f30468b.size(); i4++) {
                if (!this.f30468b.get(i4).apply(t4)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f30468b.equals(((a) obj).f30468b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f30468b.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends oj1<? super T>> list = this.f30468b;
            StringBuilder sb = new StringBuilder("Predicates.and(");
            boolean z4 = true;
            for (T t4 : list) {
                if (!z4) {
                    sb.append(',');
                }
                sb.append(t4);
                z4 = false;
            }
            sb.append(')');
            return sb.toString();
        }

        private a(List<? extends oj1<? super T>> list) {
            this.f30468b = list;
        }
    }

    public static <T> oj1<T> a(oj1<? super T> oj1Var, oj1<? super T> oj1Var2) {
        oj1Var.getClass();
        oj1Var2.getClass();
        return new a(Arrays.asList(oj1Var, oj1Var2));
    }
}
