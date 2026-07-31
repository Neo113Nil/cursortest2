package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class NativeAdViewHolder {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private View f17286a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private View f17287b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private View f17288c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private View f17289d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private LevelPlayMediaView f17290e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private View f17291f;

    @Nullable
    public final View getAdvertiserView() {
        return this.f17287b;
    }

    @Nullable
    public final View getBodyView() {
        return this.f17289d;
    }

    @Nullable
    public final View getCallToActionView() {
        return this.f17291f;
    }

    @Nullable
    public final View getIconView() {
        return this.f17288c;
    }

    @Nullable
    public final LevelPlayMediaView getMediaView() {
        return this.f17290e;
    }

    @Nullable
    public final View getTitleView() {
        return this.f17286a;
    }

    public final void setAdvertiserView(@Nullable View view) {
        this.f17287b = view;
    }

    public final void setBodyView(@Nullable View view) {
        this.f17289d = view;
    }

    public final void setCallToActionView(@Nullable View view) {
        this.f17291f = view;
    }

    public final void setIconView(@Nullable View view) {
        this.f17288c = view;
    }

    public final void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f17290e = levelPlayMediaView;
    }

    public final void setTitleView(@Nullable View view) {
        this.f17286a = view;
    }
}
