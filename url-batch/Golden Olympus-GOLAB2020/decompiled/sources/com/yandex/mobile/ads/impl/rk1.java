package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rk1<T, V> {

    /* renamed from: a, reason: collision with root package name */
    private final long f31254a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31255b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d70 f31256c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e70 f31257d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f31258e;

    public static final class a<T, V> implements c70 {

        /* renamed from: a, reason: collision with root package name */
        private final T f31259a;

        /* renamed from: b, reason: collision with root package name */
        private final V f31260b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31261c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ld0 ld0Var, Object obj, long j4) {
            this.f31259a = ld0Var;
            this.f31260b = obj;
            this.f31261c = j4;
        }

        @Override // com.yandex.mobile.ads.impl.c70
        public final long a() {
            return this.f31261c;
        }

        public final V b() {
            return this.f31260b;
        }

        public final T c() {
            return this.f31259a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f31259a, aVar.f31259a) && Intrinsics.areEqual(this.f31260b, aVar.f31260b) && this.f31261c == aVar.f31261c;
        }

        public final int hashCode() {
            T t4 = this.f31259a;
            int hashCode = (t4 == null ? 0 : t4.hashCode()) * 31;
            V v4 = this.f31260b;
            return Long.hashCode(this.f31261c) + ((hashCode + (v4 != null ? v4.hashCode() : 0)) * 31);
        }

        @NotNull
        public final String toString() {
            return "CachedItem(params=" + this.f31259a + ", item=" + this.f31260b + ", expiresAtTimestampMillis=" + this.f31261c + ")";
        }
    }

    public /* synthetic */ rk1() {
        this(86400000L, 5, new d70(), new e70());
    }

    public final synchronized void a(ld0 ld0Var, Object obj) {
        a();
        if (this.f31258e.size() < this.f31255b) {
            ArrayList arrayList = this.f31258e;
            e70 e70Var = this.f31257d;
            long j4 = this.f31254a;
            e70Var.getClass();
            arrayList.add(new a(ld0Var, obj, System.currentTimeMillis() + j4));
        }
    }

    public final synchronized boolean b() {
        a();
        return this.f31258e.size() < this.f31255b;
    }

    public rk1(long j4, int i4, @NotNull d70 expirationChecker, @NotNull e70 expirationTimestampUtil) {
        Intrinsics.checkNotNullParameter(expirationChecker, "expirationChecker");
        Intrinsics.checkNotNullParameter(expirationTimestampUtil, "expirationTimestampUtil");
        this.f31254a = j4;
        this.f31255b = i4;
        this.f31256c = expirationChecker;
        this.f31257d = expirationTimestampUtil;
        this.f31258e = new ArrayList();
    }

    private final void a() {
        ArrayList arrayList = this.f31258e;
        d70 d70Var = this.f31256c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            c70 any = (c70) obj;
            d70Var.getClass();
            Intrinsics.checkNotNullParameter(any, "any");
            if (System.currentTimeMillis() > any.a()) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            this.f31258e.remove((a) obj2);
        }
    }

    @Nullable
    public final synchronized Object a(ld0 ld0Var) {
        Object obj;
        Object obj2;
        Object b4;
        try {
            a();
            ArrayList arrayList = this.f31258e;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                obj = null;
                if (i4 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i4);
                i4++;
                if (Intrinsics.areEqual(((a) obj2).c(), ld0Var)) {
                    break;
                }
            }
            a aVar = (a) obj2;
            if (aVar != null && (b4 = aVar.b()) != null) {
                this.f31258e.remove(aVar);
                obj = b4;
            }
        } catch (Throwable th) {
            throw th;
        }
        return obj;
    }
}
