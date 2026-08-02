package com.squareup.cash.tabs.views;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.nearby.views.PulsingState;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.views.ProductSearchViewState;
import com.squareup.cash.support.chat.views.transcript.message.compose.ImageState;
import com.squareup.cash.wallet.views.InteractiveCardState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda10(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        long Color;
        long Color2;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(Float.valueOf(Float.intBitsToFloat((int) (ValueInsets.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, true).m633getCenterF1C5BW0() >> 32))));
                break;
            case 1:
                PulsingState pulsingState = (PulsingState) obj;
                pulsingState.getClass();
                mutableState.setValue(pulsingState);
                break;
            case 2:
                Map map = (Map) obj;
                map.getClass();
                mutableState.setValue(map);
                break;
            case 3:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                long mo838getSizeYbymL2g = layoutCoordinates2.mo838getSizeYbymL2g();
                long mo843localToWindowMKHz9U = layoutCoordinates2.mo843localToWindowMKHz9U(0L);
                mutableState.setValue(new Offset((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo843localToWindowMKHz9U >> 32)) + ((int) (mo838getSizeYbymL2g >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo843localToWindowMKHz9U & BodyPartID.bodyIdMax)) + (((int) (mo838getSizeYbymL2g & BodyPartID.bodyIdMax)) / 2)) & BodyPartID.bodyIdMax)));
                break;
            case 4:
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
                layoutCoordinates3.getClass();
                mutableState.setValue(layoutCoordinates3);
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mutableState.setValue(bool);
                break;
            case 6:
                mutableState.setValue((RealQrCodesPresenter.State) ((Function1) obj).invoke((RealQrCodesPresenter.State) mutableState.getValue()));
                break;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 8:
                ProductSearchPresenter.State state = (ProductSearchPresenter.State) obj;
                state.getClass();
                mutableState.setValue(state);
                break;
            case 9:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                break;
            case 10:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                mutableState.setValue(textLayoutResult);
                break;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(ProductSearchViewState.copy$default((ProductSearchViewState) mutableState.getValue(), str2, false, false, false, 30));
                break;
            case 12:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
            case 13:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                break;
            case 14:
                ((AsyncImagePainter.State.Loading) obj).getClass();
                mutableState.setValue(ImageState.LOADING);
                break;
            case 15:
                ((AsyncImagePainter.State.Success) obj).getClass();
                mutableState.setValue(ImageState.SUCCESS);
                break;
            case 16:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                mutableState.setValue(bool5);
                break;
            case 17:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                mutableState.setValue(bool6);
                break;
            case 18:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                mutableState.setValue(bool7);
                break;
            case 19:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                mutableState.setValue(bool8);
                break;
            case 20:
                Boolean bool9 = (Boolean) obj;
                bool9.getClass();
                mutableState.setValue(bool9);
                break;
            case 21:
                ((CardModelView) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 22:
                ((CardScene) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 23:
                LayoutCoordinates layoutCoordinates4 = (LayoutCoordinates) obj;
                layoutCoordinates4.getClass();
                LayoutCoordinates findRootCoordinates = ValueInsets.findRootCoordinates(layoutCoordinates4);
                mutableState.setValue(new Offset(findRootCoordinates.mo843localToWindowMKHz9U(findRootCoordinates.localBoundingBoxOf(layoutCoordinates4, false).m633getCenterF1C5BW0())));
                break;
            case 24:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                float floatValue = ((Number) ((InteractiveCardState) mutableState.getValue()).lockDimmer.getValue()).floatValue();
                f = floatValue <= 1.0f ? floatValue : 1.0f;
                AndroidPaint Paint = ColorKt.Paint();
                Color = ColorKt.Color(f, f, f, 1.0f, ColorSpaces.Srgb);
                Paint.setColorFilter(new BlendModeColorFilter(Color, 13, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(13))));
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                Canvas canvas = canvasDrawScope.drawContext.getCanvas();
                canvas.saveLayer(new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))), Paint);
                layoutNodeDrawScope.drawContent();
                canvas.restore();
                break;
            case 25:
                LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) obj;
                lifecycleResumePauseEffectScope.getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 26:
                ((DisposableEffectScope) obj).getClass();
                break;
            case 27:
                LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope2 = (LifecycleResumePauseEffectScope) obj;
                lifecycleResumePauseEffectScope2.getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 28:
                LayoutNodeDrawScope layoutNodeDrawScope2 = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope2.getClass();
                float floatValue2 = ((Number) ((InteractiveCardState) mutableState.getValue()).lockDimmer.getValue()).floatValue();
                f = floatValue2 <= 1.0f ? floatValue2 : 1.0f;
                AndroidPaint Paint2 = ColorKt.Paint();
                Color2 = ColorKt.Color(f, f, f, 1.0f, ColorSpaces.Srgb);
                Paint2.setColorFilter(new BlendModeColorFilter(Color2, 13, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color2), ColorKt.m693toAndroidBlendModes9anfk8(13))));
                CanvasDrawScope canvasDrawScope2 = layoutNodeDrawScope2.canvasDrawScope;
                Canvas canvas2 = canvasDrawScope2.drawContext.getCanvas();
                canvas2.saveLayer(new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))), Paint2);
                layoutNodeDrawScope2.drawContent();
                canvas2.restore();
                break;
            default:
                CardModelView cardModelView = (CardModelView) obj;
                cardModelView.getClass();
                mutableState.setValue(cardModelView);
                break;
        }
        return Unit.INSTANCE;
    }
}
