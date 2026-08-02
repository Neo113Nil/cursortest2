package com.withpersona.sdk2.inquiry.steps.ui.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.integrity.internal.ah;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepUtils$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt;
import io.noties.markwon.MarkwonImpl;

/* loaded from: classes9.dex */
public abstract class RemoteImageUtilsKt {
    public static final View renderToContainer(RemoteImage remoteImage, ConstraintLayout constraintLayout, boolean z) {
        remoteImage.getClass();
        constraintLayout.getClass();
        Context context = constraintLayout.getContext();
        context.getClass();
        MarkwonImpl markwonImpl = new MarkwonImpl(context);
        View makeView = RemoteImageComponentKt.makeView(new RemoteImageComponent(remoteImage), markwonImpl, remoteImage);
        constraintLayout.addView(makeView);
        ViewGroup.LayoutParams layoutParams = makeView.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.topToTop = 0;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        if (z) {
            layoutParams2.bottomToBottom = 0;
        }
        makeView.setLayoutParams(layoutParams2);
        ah.addOneShotPreDrawListenerAndDiscardFrame(constraintLayout, new UiStepUtils$$ExternalSyntheticLambda0(markwonImpl, 1));
        return makeView;
    }
}
