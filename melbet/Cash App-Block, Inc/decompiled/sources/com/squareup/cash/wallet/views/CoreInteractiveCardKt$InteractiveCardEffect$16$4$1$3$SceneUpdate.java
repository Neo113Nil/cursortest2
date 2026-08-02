package com.squareup.cash.wallet.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.graphics.backend.math.Quat;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate {
    public final EquatableBitmap customization;
    public final boolean decodeFinished;
    public final boolean expectsCustomization;
    public final Quat rotation;
    public final CardModelView.ViewModel viewModel;
    public final float zTranslation;

    public CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate(CardModelView.ViewModel viewModel, Quat quat, float f, EquatableBitmap equatableBitmap, boolean z, boolean z2) {
        this.viewModel = viewModel;
        this.rotation = quat;
        this.zTranslation = f;
        this.customization = equatableBitmap;
        this.expectsCustomization = z;
        this.decodeFinished = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate)) {
            return false;
        }
        CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate = (CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate) obj;
        return Intrinsics.areEqual(this.viewModel, coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.viewModel) && this.rotation.equals(coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.rotation) && Float.compare(this.zTranslation, coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.zTranslation) == 0 && Intrinsics.areEqual(this.customization, coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.customization) && this.expectsCustomization == coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.expectsCustomization && this.decodeFinished == coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.decodeFinished;
    }

    public final int hashCode() {
        CardModelView.ViewModel viewModel = this.viewModel;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.zTranslation, (this.rotation.hashCode() + ((viewModel == null ? 0 : viewModel.hashCode()) * 31)) * 31, 31);
        EquatableBitmap equatableBitmap = this.customization;
        return Boolean.hashCode(this.decodeFinished) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (equatableBitmap != null ? equatableBitmap.pixelHash : 0)) * 31, 31, this.expectsCustomization);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SceneUpdate(viewModel=");
        sb.append(this.viewModel);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", zTranslation=");
        sb.append(this.zTranslation);
        sb.append(", customization=");
        sb.append(this.customization);
        sb.append(", expectsCustomization=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.expectsCustomization, ", decodeFinished=", this.decodeFinished, ")");
    }
}
