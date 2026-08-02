package com.squareup.cash.transfers.views;

import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.navigation.NavInflater;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda5;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class WithdrawView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WithdrawView f$0;
    public final /* synthetic */ WithdrawViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ WithdrawView$$ExternalSyntheticLambda0(WithdrawViewModel withdrawViewModel, Function1 function1, WithdrawView withdrawView) {
        this.$r8$classId = 3;
        this.f$1 = withdrawViewModel;
        this.f$2 = function1;
        this.f$0 = withdrawView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        WithdrawViewModel withdrawViewModel = this.f$1;
        WithdrawView withdrawView = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                withdrawView.Content(withdrawViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(withdrawView.imageLoader), Expect_jvmKt.rememberComposableLambda(832164933, new WithdrawView$$ExternalSyntheticLambda0(withdrawViewModel, function1, withdrawView), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                withdrawView.Content(withdrawViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    final WithdrawView withdrawView2 = this.f$0;
                    Object obj3 = Composer.Companion.Empty;
                    if (rememberedValue == obj3) {
                        rememberedValue = withdrawView2.moneyFormatterFactory.createNoSymbolCompact();
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    final MoneyFormatter moneyFormatter = (MoneyFormatter) rememberedValue;
                    final Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    gapComposer2.startReplaceGroup(846589424);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(Arrangement$End$1.current(gapComposer2).navigationBars.getInsets$foundation_layout().bottom);
                    gapComposer2.end(false);
                    final Function1 function12 = this.f$2;
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue2 == obj3) {
                        rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda5(21, function12);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = new TaxWebAppBridge$$ExternalSyntheticLambda1(24);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function13 = (Function1) rememberedValue3;
                    boolean changedInstance = gapComposer2.changedInstance(withdrawView2) | gapComposer2.changed(density) | gapComposer2.changed(mo233toDpu2uoSUM);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue4 == obj3) {
                        rememberedValue4 = new ThumbNode$$ExternalSyntheticLambda0(withdrawView2, density, mo233toDpu2uoSUM, 12);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function14 = (Function1) rememberedValue4;
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue5 == obj3) {
                        rememberedValue5 = new HeroCardViewKt$$ExternalSyntheticLambda5(22, function12);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function02 = (Function0) rememberedValue5;
                    boolean changed3 = gapComposer2.changed(function12);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue6 == obj3) {
                        rememberedValue6 = new HeroCardViewKt$$ExternalSyntheticLambda5(23, function12);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function03 = (Function0) rememberedValue6;
                    final WithdrawViewModel withdrawViewModel2 = this.f$1;
                    NavInflater.Companion.TransferSheet(withdrawViewModel2, function0, function13, function14, function02, function03, false, ((withdrawViewModel2 instanceof WithdrawViewModel.ManagedAccountAmountEntry) || (withdrawViewModel2 instanceof WithdrawViewModel.ManagedAccountConfirmation)) ? UserDismissMode.OutsideTapOnly : UserDismissMode.All, Expect_jvmKt.rememberComposableLambda(-152793333, new Function6() { // from class: com.squareup.cash.transfers.views.WithdrawView$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function6
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                            int i2;
                            float floatValue = ((Float) obj4).floatValue();
                            PaddingValues paddingValues = (PaddingValues) obj5;
                            Function0 function04 = (Function0) obj6;
                            Function0 function05 = (Function0) obj7;
                            Composer composer3 = (Composer) obj8;
                            int intValue3 = ((Integer) obj9).intValue();
                            paddingValues.getClass();
                            function04.getClass();
                            function05.getClass();
                            if ((intValue3 & 6) == 0) {
                                i2 = (((GapComposer) composer3).changed(floatValue) ? 4 : 2) | intValue3;
                            } else {
                                i2 = intValue3;
                            }
                            if ((intValue3 & 48) == 0) {
                                i2 |= ((GapComposer) composer3).changed(paddingValues) ? 32 : 16;
                            }
                            if ((intValue3 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i2 |= ((GapComposer) composer3).changedInstance(function04) ? 256 : 128;
                            }
                            if ((intValue3 & 3072) == 0) {
                                i2 |= ((GapComposer) composer3).changedInstance(function05) ? 2048 : 1024;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                                Density density2 = Density.this;
                                float density3 = density2.getDensity();
                                float fontScale = density2.getFontScale();
                                if (fontScale > 1.5f) {
                                    fontScale = 1.5f;
                                }
                                Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(new DensityImpl(density3, fontScale)), Expect_jvmKt.rememberComposableLambda(783922123, new WithdrawView$$ExternalSyntheticLambda11(withdrawViewModel2, floatValue, paddingValues, function12, function04, moneyFormatter, function05, withdrawView2), gapComposer3), gapComposer3, 56);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 100663680, 64);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WithdrawView$$ExternalSyntheticLambda0(WithdrawView withdrawView, WithdrawViewModel withdrawViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = withdrawView;
        this.f$1 = withdrawViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ WithdrawView$$ExternalSyntheticLambda0(WithdrawView withdrawView, WithdrawViewModel withdrawViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = withdrawView;
        this.f$1 = withdrawViewModel;
        this.f$2 = function1;
    }
}
