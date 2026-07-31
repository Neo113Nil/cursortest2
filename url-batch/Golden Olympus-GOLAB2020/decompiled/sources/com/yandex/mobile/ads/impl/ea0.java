package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ea0 implements InterfaceC2237t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25155a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a> f25156b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25157a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25158b;

        public a(@NotNull String title, @NotNull String url) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f25157a = title;
            this.f25158b = url;
        }

        @NotNull
        public final String a() {
            return this.f25157a;
        }

        @NotNull
        public final String b() {
            return this.f25158b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f25157a, aVar.f25157a) && Intrinsics.areEqual(this.f25158b, aVar.f25158b);
        }

        public final int hashCode() {
            return this.f25158b.hashCode() + (this.f25157a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Item(title=" + this.f25157a + ", url=" + this.f25158b + ")";
        }
    }

    public ea0(@NotNull String actionType, @NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25155a = actionType;
        this.f25156b = items;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2237t
    @NotNull
    public final String a() {
        return this.f25155a;
    }

    @NotNull
    public final List<a> c() {
        return this.f25156b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0Var = (ea0) obj;
        return Intrinsics.areEqual(this.f25155a, ea0Var.f25155a) && Intrinsics.areEqual(this.f25156b, ea0Var.f25156b);
    }

    public final int hashCode() {
        return this.f25156b.hashCode() + (this.f25155a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "FeedbackAction(actionType=" + this.f25155a + ", items=" + this.f25156b + ")";
    }
}
