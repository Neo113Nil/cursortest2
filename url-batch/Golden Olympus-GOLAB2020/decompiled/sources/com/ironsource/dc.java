package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface dc<T> {

    @Metadata
    public static final class a<T> implements dc<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList<T> f15887a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList<T> f15888b;

        public a(@NotNull ArrayList<T> a4, @NotNull ArrayList<T> b4) {
            Intrinsics.checkNotNullParameter(a4, "a");
            Intrinsics.checkNotNullParameter(b4, "b");
            this.f15887a = a4;
            this.f15888b = b4;
        }

        @Override // com.ironsource.dc
        public boolean contains(T t4) {
            return this.f15887a.contains(t4) || this.f15888b.contains(t4);
        }

        @Override // com.ironsource.dc
        public int size() {
            return this.f15887a.size() + this.f15888b.size();
        }

        @Override // com.ironsource.dc
        @NotNull
        public List<T> value() {
            return CollectionsKt.plus((Collection) this.f15887a, (Iterable) this.f15888b);
        }
    }

    @Metadata
    public static final class b<T> implements dc<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final dc<T> f15889a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Comparator<T> f15890b;

        public b(@NotNull dc<T> collection, @NotNull Comparator<T> comparator) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            this.f15889a = collection;
            this.f15890b = comparator;
        }

        @Override // com.ironsource.dc
        public boolean contains(T t4) {
            return this.f15889a.contains(t4);
        }

        @Override // com.ironsource.dc
        public int size() {
            return this.f15889a.size();
        }

        @Override // com.ironsource.dc
        @NotNull
        public List<T> value() {
            return CollectionsKt.sortedWith(this.f15889a.value(), this.f15890b);
        }
    }

    @Metadata
    public static final class c<T> implements dc<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f15891a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<T> f15892b;

        public c(@NotNull dc<T> collection, int i4) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            this.f15891a = i4;
            this.f15892b = collection.value();
        }

        @NotNull
        public final List<T> a() {
            int size = this.f15892b.size();
            int i4 = this.f15891a;
            if (size <= i4) {
                return CollectionsKt.emptyList();
            }
            List<T> list = this.f15892b;
            return list.subList(i4, list.size());
        }

        @NotNull
        public final List<T> b() {
            List<T> list = this.f15892b;
            return list.subList(0, kotlin.ranges.g.g(list.size(), this.f15891a));
        }

        @Override // com.ironsource.dc
        public boolean contains(T t4) {
            return this.f15892b.contains(t4);
        }

        @Override // com.ironsource.dc
        public int size() {
            return this.f15892b.size();
        }

        @Override // com.ironsource.dc
        @NotNull
        public List<T> value() {
            return this.f15892b;
        }
    }

    boolean contains(T t4);

    int size();

    @NotNull
    List<T> value();
}
