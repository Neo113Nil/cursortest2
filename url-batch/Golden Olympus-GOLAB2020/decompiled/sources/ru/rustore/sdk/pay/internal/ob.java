package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44726a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44727b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f44728c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<kl> f44729d;

    public ob(@NotNull String id, @NotNull String title, @NotNull String imageUrl, @Nullable List<kl> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f44726a = id;
        this.f44727b = title;
        this.f44728c = imageUrl;
        this.f44729d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return Intrinsics.areEqual(this.f44726a, obVar.f44726a) && Intrinsics.areEqual(this.f44727b, obVar.f44727b) && Intrinsics.areEqual(this.f44728c, obVar.f44728c) && Intrinsics.areEqual(this.f44729d, obVar.f44729d);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f44728c, j1.a(this.f44727b, this.f44726a.hashCode() * 31, 31), 31);
        List<kl> list = this.f44729d;
        return a4 + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ProductInfoDto(id=" + this.f44726a + ", title=" + this.f44727b + ", imageUrl=" + this.f44728c + ", subscriptionTariffs=" + this.f44729d + ')';
    }
}
