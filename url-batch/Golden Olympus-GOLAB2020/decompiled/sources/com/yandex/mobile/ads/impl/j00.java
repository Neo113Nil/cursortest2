package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.instream.view.InstreamMuteView;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.db2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xm0 f27430a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final at1<ExtendedVideoAdControlsContainer> f27431b;

    public j00(@NotNull xm0 instreamDesign) {
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        this.f27430a = instreamDesign;
        this.f27431b = new at1<>();
    }

    @Nullable
    public final db2 a(@NotNull Context context, @NotNull ViewGroup rootView) {
        int i4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        xm0 instreamDesign = this.f27430a;
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        int ordinal = instreamDesign.ordinal();
        if (ordinal == 0) {
            i4 = R.layout.monetization_ads_internal_instream_skin_v1;
        } else {
            if (ordinal != 1) {
                throw new W1.m();
            }
            i4 = R.layout.monetization_ads_internal_instream_skin_v2;
        }
        this.f27431b.getClass();
        ExtendedVideoAdControlsContainer extendedVideoAdControlsContainer = (ExtendedVideoAdControlsContainer) at1.a(context, ExtendedVideoAdControlsContainer.class, i4, rootView);
        if (extendedVideoAdControlsContainer == null) {
            return null;
        }
        ImageView imageView = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.sponsored_image);
        ImageView imageView2 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.favicon);
        TextView textView = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.call_to_action);
        ImageView imageView3 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.instream_call_to_action);
        InstreamMuteView instreamMuteView = (InstreamMuteView) extendedVideoAdControlsContainer.findViewById(R.id.instream_mute);
        ProgressBar progressBar = (ProgressBar) extendedVideoAdControlsContainer.findViewById(R.id.instream_progress_display_view);
        View findViewById = extendedVideoAdControlsContainer.findViewById(R.id.instream_skip);
        TextView textView2 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.domain);
        TextView textView3 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.sponsored);
        TextView textView4 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.ad_position);
        ImageView imageView4 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.trademark_icon);
        TextView textView5 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.trademark_delimiter);
        View findViewById2 = extendedVideoAdControlsContainer.findViewById(R.id.instream_cta_container);
        ImageView imageView5 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.feedback);
        TextView textView6 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.timer_value);
        TextView textView7 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.warning);
        ViewGroup viewGroup = (ViewGroup) extendedVideoAdControlsContainer.findViewById(R.id.qrcode_container);
        return new db2(new db2.a(extendedVideoAdControlsContainer).e(imageView).b(imageView2).b(textView).a(imageView3).a((m31) instreamMuteView).a(progressBar).b(findViewById).e(textView3).c(textView2).a(textView4).f(imageView4).f(textView5).d(textView6).a(findViewById2).c(imageView5).g(textView7).a(viewGroup).d((ImageView) extendedVideoAdControlsContainer.findViewById(R.id.qrcode_image)), 0);
    }
}
