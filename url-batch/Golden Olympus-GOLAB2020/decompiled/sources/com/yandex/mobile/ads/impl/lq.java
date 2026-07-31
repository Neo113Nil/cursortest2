package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class lq {

    /* renamed from: a, reason: collision with root package name */
    private static final lq f28706a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final lq f28707b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final lq f28708c = new b(1);

    final class a extends lq {
        a() {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final int a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq b(boolean z4, boolean z5) {
            char c4 = z5 == z4 ? (char) 0 : z5 ? (char) 1 : (char) 65535;
            return c4 < 0 ? lq.f28707b : c4 > 0 ? lq.f28708c : lq.f28706a;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq a(int i4, int i5) {
            char c4 = i4 < i5 ? (char) 65535 : i4 > i5 ? (char) 1 : (char) 0;
            return c4 < 0 ? lq.f28707b : c4 > 0 ? lq.f28708c : lq.f28706a;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq a(long j4, long j5) {
            char c4 = j4 < j5 ? (char) 65535 : j4 > j5 ? (char) 1 : (char) 0;
            if (c4 < 0) {
                return lq.f28707b;
            }
            return c4 > 0 ? lq.f28708c : lq.f28706a;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final <T> lq a(T t4, T t5, Comparator<T> comparator) {
            int compare = comparator.compare(t4, t5);
            if (compare < 0) {
                return lq.f28707b;
            }
            return compare > 0 ? lq.f28708c : lq.f28706a;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq a(boolean z4, boolean z5) {
            char c4 = z4 == z5 ? (char) 0 : z4 ? (char) 1 : (char) 65535;
            if (c4 < 0) {
                return lq.f28707b;
            }
            return c4 > 0 ? lq.f28708c : lq.f28706a;
        }
    }

    private static final class b extends lq {

        /* renamed from: d, reason: collision with root package name */
        final int f28709d;

        b(int i4) {
            super();
            this.f28709d = i4;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq a(int i4, int i5) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq b(boolean z4, boolean z5) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq a(long j4, long j5) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final <T> lq a(T t4, T t5, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final lq a(boolean z4, boolean z5) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.lq
        public final int a() {
            return this.f28709d;
        }
    }

    public static lq b() {
        return f28706a;
    }

    public abstract int a();

    public abstract lq a(int i4, int i5);

    public abstract lq a(long j4, long j5);

    public abstract <T> lq a(T t4, T t5, Comparator<T> comparator);

    public abstract lq a(boolean z4, boolean z5);

    public abstract lq b(boolean z4, boolean z5);

    private lq() {
    }
}
