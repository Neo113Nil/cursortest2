package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y31 implements x31 {
    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final View a(@NotNull View container, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final CheckBox b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final CustomizableMediaView c(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (CustomizableMediaView) container.findViewById(R.id.media);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView d(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.price);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView e(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.call_to_action);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView f(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.warning);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ImageView g(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(R.id.favicon);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView h(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.age);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final View i(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewById(R.id.rating);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView j(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.title);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ProgressBar k(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ImageView l(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(R.id.feedback);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView m(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.sponsored);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView n(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.domain);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ImageView o(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(R.id.icon);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView p(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.review_count);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (TextView) container.findViewById(R.id.body);
    }
}
