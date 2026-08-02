package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.protos.cash.ui.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class TagHeroBackgroundKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Image f$0;
    public final /* synthetic */ Modifier f$1;

    public /* synthetic */ TagHeroBackgroundKt$$ExternalSyntheticLambda1(int i, int i2, Modifier modifier, Image image) {
        this.$r8$classId = i2;
        this.f$0 = image;
        this.f$1 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                TagHeroBackgroundKt.TagHeroBackground(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                SharedUIKt.RemotePromotedAppletImage(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                LocaleToggleKt.OverviewHeaderImage(this.f$0, this.f$1, composer, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
