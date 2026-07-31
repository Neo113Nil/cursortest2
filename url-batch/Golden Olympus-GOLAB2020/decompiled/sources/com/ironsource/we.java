package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class we {

    @Metadata
    public static final class a implements kotlin.properties.c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private WeakReference<T> f20193a;

        a(T t4) {
            this.f20193a = new WeakReference<>(t4);
        }

        @NotNull
        public final WeakReference<T> a() {
            return this.f20193a;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
        @Override // kotlin.properties.c
        @Nullable
        public T getValue(@NotNull Object thisRef, @NotNull m2.h property) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f20193a.get();
        }

        @Override // kotlin.properties.c
        public void setValue(@NotNull Object thisRef, @NotNull m2.h property, @Nullable T t4) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            this.f20193a = new WeakReference<>(t4);
        }

        public final void a(@NotNull WeakReference<T> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.f20193a = weakReference;
        }
    }

    @NotNull
    public static final <T> kotlin.properties.c a(@Nullable T t4) {
        return new a(t4);
    }

    public static /* synthetic */ kotlin.properties.c a(Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }
}
