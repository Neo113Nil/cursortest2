package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.cash.R;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class BrandingComponentKt {
    public static final ShapeableImageView makeView(BrandingComponent brandingComponent, MarkwonImpl markwonImpl) {
        Context context = (Context) markwonImpl.parser;
        if (!brandingComponent.showBranding) {
            return null;
        }
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setImageResource(R.drawable.pi2_inquiry_persona_branding);
        shapeableImageView.setAdjustViewBounds(true);
        int dimension = (int) context.getResources().getDimension(R.dimen.startEndMargin);
        shapeableImageView.setPadding(dimension, (int) (16.0f * context.getResources().getDisplayMetrics().density), dimension, shapeableImageView.getPaddingBottom());
        ((LinkedList) markwonImpl.plugins).add(new Choreographers$$ExternalSyntheticLambda1(shapeableImageView, 4));
        return shapeableImageView;
    }
}
