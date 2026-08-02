package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class HeroTagViewKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ HeroTagViewKt$$ExternalSyntheticLambda6(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        Offset offset = (Offset) obj;
        Size size = (Size) obj2;
        switch (i) {
            case 0:
                MiniCardScene miniCardScene = (MiniCardScene) mutableState.getValue();
                return Boolean.valueOf(miniCardScene != null ? miniCardScene.touchIntersectsMiniCard(Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (size.packedValue >> 32)), Float.intBitsToFloat((int) (size.packedValue & BodyPartID.bodyIdMax))) : false);
            default:
                WandScene wandScene = (WandScene) mutableState.getValue();
                return Boolean.valueOf(wandScene != null ? wandScene.touchIntersectsWand(Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (size.packedValue >> 32)), Float.intBitsToFloat((int) (size.packedValue & BodyPartID.bodyIdMax))) : false);
        }
    }
}
