package com.yandex.mobile.ads.impl;

import com.ironsource.b9;

/* loaded from: classes3.dex */
public interface tw1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final vw1 f32717a;

        /* renamed from: b, reason: collision with root package name */
        public final vw1 f32718b;

        public a(vw1 vw1Var) {
            this(vw1Var, vw1Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f32717a.equals(aVar.f32717a) && this.f32718b.equals(aVar.f32718b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f32718b.hashCode() + (this.f32717a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder(b9.i.f15550d);
            sb.append(this.f32717a);
            if (this.f32717a.equals(this.f32718b)) {
                str = "";
            } else {
                str = ", " + this.f32718b;
            }
            sb.append(str);
            sb.append(b9.i.f15552e);
            return sb.toString();
        }

        public a(vw1 vw1Var, vw1 vw1Var2) {
            this.f32717a = (vw1) C2253tf.a(vw1Var);
            this.f32718b = (vw1) C2253tf.a(vw1Var2);
        }
    }

    public static class b implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f32719a;

        /* renamed from: b, reason: collision with root package name */
        private final a f32720b;

        public b() {
            this(-9223372036854775807L, 0L);
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f32719a;
        }

        public b(long j4, long j5) {
            this.f32719a = j4;
            this.f32720b = new a(j5 == 0 ? vw1.f33814c : new vw1(0L, j5));
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final a b(long j4) {
            return this.f32720b;
        }
    }

    a b(long j4);

    boolean b();

    long c();
}
