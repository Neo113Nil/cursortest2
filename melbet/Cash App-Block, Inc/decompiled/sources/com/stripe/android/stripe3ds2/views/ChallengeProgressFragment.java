package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public final class ChallengeProgressFragment extends Fragment {
    public final Integer accentColor;
    public final String directoryServerName;
    public final SdkTransactionId sdkTransactionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressFragment(String str, SdkTransactionId sdkTransactionId, Integer num) {
        super(R.layout.stripe_progress_view_layout);
        str.getClass();
        sdkTransactionId.getClass();
        this.directoryServerName = str;
        this.sdkTransactionId = sdkTransactionId;
        this.accentColor = num;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i = R.id.brand_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.brand_logo);
        if (imageView != null) {
            i = R.id.progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, R.id.progress_bar);
            if (circularProgressIndicator != null) {
                Context requireContext = requireContext();
                requireContext.getClass();
                DefaultErrorReporter defaultErrorReporter = new DefaultErrorReporter(requireContext, new Stripe3ds2ErrorReporterConfig(this.sdkTransactionId), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                Brand.Companion.getClass();
                Brand lookup$3ds2sdk_release = POPMatchingFactory.lookup$3ds2sdk_release(this.directoryServerName, defaultErrorReporter);
                FragmentActivity activity = getActivity();
                imageView.setImageDrawable(activity != null ? activity.getDrawable(lookup$3ds2sdk_release.drawableResId) : null);
                Integer num = lookup$3ds2sdk_release.nameResId;
                imageView.setContentDescription(num != null ? getString(num.intValue()) : null);
                if (lookup$3ds2sdk_release.shouldStretch) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        imageView.setLayoutParams(layoutParams);
                    }
                }
                imageView.setVisibility(0);
                Integer num2 = this.accentColor;
                if (num2 != null) {
                    circularProgressIndicator.setIndicatorColor(num2.intValue());
                    return;
                }
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
