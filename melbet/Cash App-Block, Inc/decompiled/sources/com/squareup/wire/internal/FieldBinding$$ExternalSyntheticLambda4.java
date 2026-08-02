package com.squareup.wire.internal;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.ui.SubtitleViewUtils;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel;
import com.squareup.cash.timeline.viewmodels.TimelineWidgetModel;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.gcm.NotificationActionService;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda6;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.PastPayStubViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.cash.work.viewmodels.ShiftFilterViewModel;
import com.squareup.cash.work.viewmodels.ShiftListDayViewModel;
import com.squareup.cash.work.viewmodels.TimecardDetailViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.cash.work.views.menu.DropdownItem;
import com.squareup.cash.work.views.shift.ShiftDetailViewKt;
import com.squareup.cash.work.views.timecard.TimecardDetailViewKt;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class FieldBinding$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FieldBinding$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Continuation continuation = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                WireField wireField = (WireField) obj3;
                Message.Builder builder = (Message.Builder) obj;
                builder.getClass();
                KotlinConstructorBuilder kotlinConstructorBuilder = (KotlinConstructorBuilder) builder;
                LinkedHashMap linkedHashMap = kotlinConstructorBuilder.fieldValueMap;
                if (wireField.keyAdapter().length() > 0) {
                    LinkedHashMap linkedHashMap2 = kotlinConstructorBuilder.mapFieldKeyValueMap;
                    Integer valueOf = Integer.valueOf(wireField.tag());
                    obj2.getClass();
                    linkedHashMap2.put(valueOf, new Pair(wireField, TypeIntrinsics.asMutableMap(obj2)));
                } else if (wireField.label().isRepeated()) {
                    LinkedHashMap linkedHashMap3 = kotlinConstructorBuilder.repeatedFieldValueMap;
                    Integer valueOf2 = Integer.valueOf(wireField.tag());
                    obj2.getClass();
                    linkedHashMap3.put(valueOf2, new Pair(wireField, TypeIntrinsics.asMutableList(obj2)));
                } else {
                    linkedHashMap.put(Integer.valueOf(wireField.tag()), new Pair(wireField, obj2));
                    if (obj2 != null) {
                        WireField.Label label = wireField.label();
                        label.getClass();
                        if (label == WireField.Label.ONE_OF) {
                            Collection values = linkedHashMap.values();
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
                            Iterator it = values.iterator();
                            while (it.hasNext()) {
                                arrayList.add((WireField) ((Pair) it.next()).first);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                WireField wireField2 = (WireField) next;
                                if (Intrinsics.areEqual(wireField2.oneofName(), wireField.oneofName()) && wireField2.tag() != wireField.tag()) {
                                    arrayList2.add(next);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                linkedHashMap.remove(Integer.valueOf(((WireField) it3.next()).tag()));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                SubtitleViewUtils.ThreeDsProgress((ThreeDsViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                int intValue = ((Integer) obj).intValue();
                TimelineView.ItemView itemView = (TimelineView.ItemView) obj2;
                itemView.getClass();
                itemView.setItem((TimelineWidgetModel.Item) ((TimelineWidgetModel) obj3).items.get(intValue));
                return Unit.INSTANCE;
            case 3:
                AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj3;
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = app.cash.molecule.PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str = keypad.title;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    String str2 = keypad.subtitle;
                    if (str2 == null) {
                        gapComposer.startReplaceGroup(1510508913);
                    } else {
                        gapComposer.startReplaceGroup(1510508914);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                AddMoneyViewModel.RecurringCashInToggle recurringCashInToggle = (AddMoneyViewModel.RecurringCashInToggle) obj3;
                Composer composer2 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringCashInToggle.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                InstrumentNotLinkedViewModel instrumentNotLinkedViewModel = (InstrumentNotLinkedViewModel) obj3;
                Composer composer3 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    zzd zzdVar = Icons.Companion;
                    String str3 = instrumentNotLinkedViewModel.headerIcon;
                    zzdVar.getClass();
                    Icons icons = zzd.get(str3);
                    icons.getClass();
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal2);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons, colors.semantic.icon.standard, 4);
                    Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal2);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", colors2.semantic.background.subtle, null, localIcon, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                RecurringReloadOptionViewModel.SettingRow settingRow = (RecurringReloadOptionViewModel.SettingRow) obj3;
                Composer composer4 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, settingRow.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                WithdrawViewModel.ChangeAmount changeAmount = (WithdrawViewModel.ChangeAmount) obj3;
                Composer composer5 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer5, 48);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = app.cash.molecule.PlatformKt.materializeModifier(gapComposer5, fillMaxWidth2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String str4 = changeAmount.title;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, ((Typography) gapComposer5.consume(staticProvidableCompositionLocal3)).labelMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, ((Typography) gapComposer5.consume(staticProvidableCompositionLocal3)).bodyMedium, (TextLineBalancing) null, changeAmount.subtitle, (Map) null, (Function1) null, false);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                RecurringReloadConfigurationViewModel.Keypad keypad2 = (RecurringReloadConfigurationViewModel.Keypad) obj3;
                Composer composer6 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer6, 48);
                    int hashCode3 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier3 = app.cash.molecule.PlatformKt.materializeModifier(gapComposer6, fillMaxWidth3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    String title = keypad2.getTitle();
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer6.consume(staticProvidableCompositionLocal4)).labelMedium, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
                    String subtitle = keypad2.getSubtitle();
                    TextStyle textStyle = ((Typography) gapComposer6.consume(staticProvidableCompositionLocal4)).bodyMedium;
                    Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, textStyle, (TextLineBalancing) null, subtitle, (Map) null, (Function1) null, false);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ((SplashScreenAnimationObserver) obj3).TranslationYObserver((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                NotificationActionService notificationActionService = (NotificationActionService) obj3;
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj2;
                int i2 = NotificationActionService.$r8$clinit;
                ((CoroutineScope) obj).getClass();
                variantSandboxedComponent.getClass();
                VariantSandboxedComponent.Impl impl = (VariantSandboxedComponent.Impl) variantSandboxedComponent;
                AppService appService = (AppService) impl.provideFranklinAppServiceProvider.getValue();
                appService.getClass();
                notificationActionService.appService = appService;
                Analytics analytics = (Analytics) impl.provideAnalyticsProvider.getValue();
                analytics.getClass();
                notificationActionService.analytics = analytics;
                AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) impl.variantAppComponentNotificationManagerProvider.lambda.invoke();
                androidNotificationManager.getClass();
                notificationActionService.notificationManager = androidNotificationManager;
                notificationActionService.attributionEventEmitter = (ProductionAttributionEventEmitter) impl.productionAttributionEventEmitterProvider.invoke();
                return Unit.INSTANCE;
            case 11:
                JobKt.launch$default((CoroutineScope) obj, null, null, new TaxWebAppBridge.AnonymousClass3((VariantSandboxedComponent) obj2, (ProducerScope) obj3, continuation, 26), 3);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                zzrl.NullStateUiGroupContent((UiGroupViewModel) obj3, companion, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                CardSchemeViewModel.CardNullStateBooklet.Content content = (CardSchemeViewModel.CardNullStateBooklet.Content) obj3;
                Composer composer7 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1466575249, new HeroCardNullStateKt$$ExternalSyntheticLambda6(content, r10 ? 1 : 0), gapComposer7), gapComposer7, 24576, 15);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                PresentationTimelineViewModel presentationTimelineViewModel = (PresentationTimelineViewModel) obj3;
                Composer composer8 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    UtilsKt.TimelineHeaderAvatar(presentationTimelineViewModel.icon, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                UtilsKt.TimelineHeaderAvatar((PresentationTimelineViewModel.Icon) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                CardSchemeViewModel.Module.NextUpCard nextUpCard = (CardSchemeViewModel.Module.NextUpCard) obj3;
                Composer composer9 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    UtilsKt.NextUpCardImage(nextUpCard.icon, nextUpCard.image, nextUpCard.isDisabled, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                UtilsKt.StatusModuleAvatar((CardSchemeViewModel.Module.Icon.LegacyAvatar) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj3;
                Composer composer10 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    String str5 = clockInBottomSheetViewModel.shiftDateTimeText;
                    if (str5 == null) {
                        str5 = re$$ExternalSyntheticOutline0.m(gapComposer10, 52589563, R.string.work_views_clock_in_unscheduled, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(52588726);
                        gapComposer10.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = (DeclareCashTipBottomSheetViewModel) obj3;
                Composer composer11 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, declareCashTipBottomSheetViewModel.currencySymbol, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                DropdownItem dropdownItem = (DropdownItem) obj3;
                Composer composer12 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer12, 48);
                    int hashCode4 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier4 = app.cash.molecule.PlatformKt.materializeModifier(gapComposer12, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    gapComposer12.startReplaceGroup(-1676855659);
                    Icons icons2 = dropdownItem.icon;
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    Colors colors4 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, (String) null, m285size3ABfNKs, colors4.semantic.icon.standard, gapComposer12, 432, 0);
                    SpacerKt.Spacer(gapComposer12, SizeKt.m290width3ABfNKs(companion, 12.0f));
                    gapComposer12.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 1, 0, 0, 3834, 0L, (Composer) gapComposer12, (Modifier) null, ((Typography) gapComposer12.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer12, dropdownItem.textRes), (Map) null, (Function1) null, false);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) obj3;
                Composer composer13 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    SellerCardKt.SellerCard(sellerCardViewModel, null, SellerCardSize.Medium, null, gapComposer13, MLKEMEngine.KyberPolyBytes, 10);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                PastPayStubViewModel pastPayStubViewModel = (PastPayStubViewModel) obj3;
                Composer composer14 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pastPayStubViewModel.payDate, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ShiftDetailViewKt.ShiftHeroHeader((ShiftDetailViewModel.Loaded.Header) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ShiftDetailViewKt.DetailsSection((ShiftDetailViewModel.Loaded.Details) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ShiftDetailViewKt.NoteCard((ShiftDetailViewModel.Loaded.Note) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ShiftListDayViewModel shiftListDayViewModel = (ShiftListDayViewModel) obj3;
                Composer composer15 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListDayViewModel.dateHeader, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ShiftFilterViewModel.Option option = (ShiftFilterViewModel.Option) obj3;
                Composer composer16 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, option.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                TimecardDetailViewKt.SummaryTable((TimecardDetailViewModel.SummaryTable) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                TimecardDetailViewKt.DetailsSection((TimecardDetailViewModel.Details) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FieldBinding$$ExternalSyntheticLambda4(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
