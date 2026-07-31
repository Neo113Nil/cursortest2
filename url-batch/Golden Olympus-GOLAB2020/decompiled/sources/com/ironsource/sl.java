package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface sl<T> {

    @Metadata
    public static final class a<T> implements sl<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final IronSourceError f19616a;

        public a(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f19616a = error;
        }

        @NotNull
        public final IronSourceError a() {
            return this.f19616a;
        }

        @NotNull
        public final IronSourceError b() {
            return this.f19616a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f19616a, ((a) obj).f19616a);
        }

        public int hashCode() {
            return this.f19616a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.f19616a + ')';
        }

        @NotNull
        public final a<T> a(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                ironSourceError = aVar.f19616a;
            }
            return aVar.a(ironSourceError);
        }
    }

    @Metadata
    public static final class b<T> implements sl<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f19617a;

        public b(T t4) {
            this.f19617a = t4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = bVar.f19617a;
            }
            return bVar.a(obj);
        }

        public final T b() {
            return this.f19617a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f19617a, ((b) obj).f19617a);
        }

        public int hashCode() {
            T t4 = this.f19617a;
            if (t4 == null) {
                return 0;
            }
            return t4.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.f19617a + ')';
        }

        @NotNull
        public final b<T> a(T t4) {
            return new b<>(t4);
        }

        public final T a() {
            return this.f19617a;
        }
    }
}
