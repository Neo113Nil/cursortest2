package com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationTroubleshootingTipsPageItemBinding;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class HelpPagerAdapter$adapterHelper$2$1 extends FunctionReferenceImpl implements Function3 {
    public static final HelpPagerAdapter$adapterHelper$2$1 INSTANCE = new HelpPagerAdapter$adapterHelper$2$1(3, Pi2NavigationTroubleshootingTipsPageItemBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2NavigationTroubleshootingTipsPageItemBinding;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.pi2_navigation_troubleshooting_tips_page_item, viewGroup, false);
        if (booleanValue) {
            viewGroup.addView(inflate);
        }
        int i = R.id.description;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.description);
        if (textView != null) {
            i = R.id.lottie_view;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.lottie_view);
            if (themeableLottieAnimationView != null) {
                return new Pi2NavigationTroubleshootingTipsPageItemBinding((LinearLayout) inflate, textView, themeableLottieAnimationView);
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
