package com.squareup.cash.support.chat.views;

import android.content.Context;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.GestureControllerForPager;
import com.alexvasilkov.gestures.Settings;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.squareup.cash.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class ChatImageDetailViewKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ChatImageDetailViewKt$$ExternalSyntheticLambda2(int i, long j, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                GestureImageView gestureImageView = new GestureImageView(context);
                gestureImageView.setBackgroundColor(ColorKt.m694toArgb8_81llA(this.f$0));
                gestureImageView.setContentDescription(context.getString(R.string.support_chat_image_detail_content_description));
                GestureControllerForPager gestureControllerForPager = gestureImageView.controller;
                Settings settings = gestureControllerForPager.settings;
                settings.maxZoom = 3.0f;
                settings.isFillViewport = true;
                settings.isPanEnabled = true;
                settings.isZoomEnabled = true;
                gestureControllerForPager.stateListeners.add(new GestureImageView.AnonymousClass1(gestureImageView, 1));
                gestureImageView.setOnClickListener(new ChatImageDetailViewKt$$ExternalSyntheticLambda5(0, function1));
                return gestureImageView;
            default:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                drawScope.mo729drawLineNGM6Ib0(this.f$0, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32), (BodyPartID.bodyIdMax & Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE)) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32), (r23 & 8) != 0 ? 0.0f : drawScope.mo236toPx0680j_4(2.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : (PathEffect) function1.invoke(drawScope), (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
        }
    }
}
