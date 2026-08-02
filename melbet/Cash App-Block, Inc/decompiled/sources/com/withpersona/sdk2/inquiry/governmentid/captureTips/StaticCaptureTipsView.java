package com.withpersona.sdk2.inquiry.governmentid.captureTips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidStaticCaptureTipsBinding;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class StaticCaptureTipsView extends LinearLayout {
    public final Pi2GovernmentidStaticCaptureTipsBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCaptureTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.pi2_governmentid_static_capture_tips, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.icon);
        if (imageView != null) {
            i2 = R.id.icon_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.icon_container);
            if (constraintLayout != null) {
                i2 = R.id.subtext;
                TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.subtext);
                if (textView != null) {
                    i2 = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                    if (textView2 != null) {
                        this.binding = new Pi2GovernmentidStaticCaptureTipsBinding((LinearLayout) inflate, imageView, constraintLayout, textView, textView2);
                        return;
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StaticCaptureTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ StaticCaptureTipsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StaticCaptureTipsView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
