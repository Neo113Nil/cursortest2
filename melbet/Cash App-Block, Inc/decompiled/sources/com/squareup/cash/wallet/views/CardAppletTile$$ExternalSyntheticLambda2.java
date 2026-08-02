package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTile$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardAppletTile f$0;
    public final /* synthetic */ AppletTile.AppletTileAppearance f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CardAppletTile$$ExternalSyntheticLambda2(CardAppletTile cardAppletTile, AppletTile.AppletTileAppearance appletTileAppearance, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = cardAppletTile;
        this.f$1 = appletTileAppearance;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        AppletTile.AppletTileAppearance appletTileAppearance = this.f$1;
        CardAppletTile cardAppletTile = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                cardAppletTile.UninstalledRowUI(appletTileAppearance, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                cardAppletTile.PromotedUI(appletTileAppearance, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                cardAppletTile.UI(appletTileAppearance, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
