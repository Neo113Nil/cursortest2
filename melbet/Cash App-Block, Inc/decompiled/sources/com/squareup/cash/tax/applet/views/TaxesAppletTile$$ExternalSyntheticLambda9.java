package com.squareup.cash.tax.applet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.ProgressMeter$CompletionBehavior;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.work.views.menu.ExpandableContentKt;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class TaxesAppletTile$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ TaxesAppletTile$$ExternalSyntheticLambda9(TaxesAppletTileModel.Installed installed, TaxesAppletTile taxesAppletTile, float f, boolean z) {
        this.f$0 = installed;
        this.f$1 = taxesAppletTile;
        this.f$2 = f;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                TaxesAppletTileModel.Installed installed = (TaxesAppletTileModel.Installed) obj4;
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean z = installed instanceof TaxesAppletTileModel.Installed.Idle;
                    float f = this.f$2;
                    boolean z2 = this.f$3;
                    if (z) {
                        gapComposer.startReplaceGroup(-1374510057);
                        TaxesAppletTileModel.Accessory.Icon icon = ((TaxesAppletTileModel.Installed.Idle) installed).icon;
                        taxesAppletTile.m3766TaxesIcon6a0pyJM(icon.isWarningIcon, icon.f1213type, f, z2, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        if (!(installed instanceof TaxesAppletTileModel.Installed.Pending)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1202585911, false);
                        }
                        gapComposer.startReplaceGroup(-1374215278);
                        TaxesAppletTileModel.Accessory accessory = ((TaxesAppletTileModel.Installed.Pending) installed).accessory;
                        if (accessory instanceof TaxesAppletTileModel.Accessory.Icon) {
                            gapComposer.startReplaceGroup(-1374141219);
                            TaxesAppletTileModel.Accessory.Icon icon2 = (TaxesAppletTileModel.Accessory.Icon) accessory;
                            taxesAppletTile.m3766TaxesIcon6a0pyJM(icon2.isWarningIcon, icon2.f1213type, f, z2, gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            if (!(accessory instanceof TaxesAppletTileModel.Accessory.Progress)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1202596464, false);
                            }
                            gapComposer.startReplaceGroup(-1373825918);
                            float f2 = ((TaxesAppletTileModel.Accessory.Progress) accessory).progress;
                            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, f);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            long j = colors.semantic.service.taxes;
                            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            VisibleKt.m3497ProgressMeterUV7SVM(f2, j, 4.0f, m285size3ABfNKs, colors2.surface.money.applet.data.inactive.border, RecyclerView.DECELERATION_RATE, 0L, ProgressMeter$CompletionBehavior.NONE, null, null, null, null, null, gapComposer, 12582912, 0, 8032);
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ExpandableContentKt.m3808ExpandableContent0aeBpQE((ListBuilder) obj4, this.f$3, this.f$2, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(24961));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TaxesAppletTile$$ExternalSyntheticLambda9(ListBuilder listBuilder, boolean z, float f, Function0 function0, int i) {
        this.f$0 = listBuilder;
        this.f$3 = z;
        this.f$2 = f;
        this.f$1 = function0;
    }
}
