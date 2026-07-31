package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.framework.common.BundleUtil;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class md1 implements x31 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29028a;

    public md1(int i4) {
        this.f29028a = i4;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final View a(@NotNull View container, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        View findViewWithTag = container.findViewWithTag(assetName + BundleUtil.UNDERLINE_TAG + this.f29028a);
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final CheckBox b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("mute_button_" + this.f29028a);
        if (findViewWithTag instanceof CheckBox) {
            return (CheckBox) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final CustomizableMediaView c(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("media_" + this.f29028a);
        if (findViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView d(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("price_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView e(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("call_to_action_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView f(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("warning_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ImageView g(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("favicon_" + this.f29028a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView h(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("age_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final View i(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("rating_" + this.f29028a);
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView j(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("title_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ProgressBar k(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ProgressBar) container.findViewWithTag("video_progress_" + this.f29028a);
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ImageView l(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("feedback_" + this.f29028a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView m(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("sponsored_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView n(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("domain_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final ImageView o(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("icon_" + this.f29028a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView p(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("review_count_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.x31
    @Nullable
    public final TextView a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("body_" + this.f29028a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }
}
