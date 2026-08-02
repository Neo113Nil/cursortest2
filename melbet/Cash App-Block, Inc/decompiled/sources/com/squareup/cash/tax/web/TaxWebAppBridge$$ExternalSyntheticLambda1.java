package com.squareup.cash.tax.web;

import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import coil3.request.ImageRequest;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.out.sync_entity.BankAccountQualifier;
import com.squareup.cash.out.sync_entity.CashOutFeeData;
import com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig;
import com.squareup.cash.out.sync_entity.DebitCardQualifier;
import com.squareup.cash.out.sync_entity.InstrumentCapability;
import com.squareup.cash.out.sync_entity.PreselectionPriorityItem;
import com.squareup.cash.out.sync_entity.QualifiedCapability;
import com.squareup.cash.out.sync_entity.SupportedFlows;
import com.squareup.cash.out.sync_entity.UnsupportedSpeedAction;
import com.squareup.cash.transactionpicker.views.ComposableSingletons$ArcadeTransactionPickerViewKt;
import com.squareup.cash.transfers.backend.api.CashOutCapabilityManager$CashOutCapabilities;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.protos.access.sync_values.PasswordInfo;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.scannerview.SizeMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxWebAppBridge$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TaxWebAppBridge$$ExternalSyntheticLambda1(SizeMap sizeMap) {
        this.$r8$classId = 9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier bankAccount;
        CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier bankAccount2;
        switch (this.$r8$classId) {
            case 0:
                TaxUrlsAllowlistMatcher taxUrlsAllowlistMatcher = (TaxUrlsAllowlistMatcher) obj;
                taxUrlsAllowlistMatcher.getClass();
                CollectionsKt__MutableCollectionsKt.removeAll(taxUrlsAllowlistMatcher.serverSentPatterns, new TaxWebAppBridge$$ExternalSyntheticLambda1(4));
                break;
            case 1:
                PasswordInfo passwordInfo = (PasswordInfo) obj;
                if (passwordInfo != null) {
                    break;
                }
                break;
            case 2:
                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj;
                featureFlag$EnabledDisabledAmplitudeExperiment$Options.getClass();
                break;
            case 3:
                ThemeInfo themeInfo = (ThemeInfo) obj;
                themeInfo.getClass();
                break;
            case 4:
                ((Regex) obj).getClass();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope.getClass();
                realCellActivityAccessoryScope.custom(ComposableSingletons$ArcadeTransactionPickerViewKt.f730lambda$1303222614);
                break;
            case 9:
                CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = (CashOutInstrumentCapabilityConfig) obj;
                cashOutInstrumentCapabilityConfig.getClass();
                List<InstrumentCapability> list = cashOutInstrumentCapabilityConfig.capabilities;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (InstrumentCapability instrumentCapability : list) {
                    CashInstrumentType asCashInstrumentType = SizeMap.asCashInstrumentType(instrumentCapability.instrument_type);
                    List<QualifiedCapability> list2 = instrumentCapability.qualified_capabilities;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (QualifiedCapability qualifiedCapability : list2) {
                        List list3 = qualifiedCapability.supported_flows;
                        DebitCardQualifier debitCardQualifier = qualifiedCapability.debit_card_qualifier;
                        if (debitCardQualifier != null) {
                            bankAccount2 = new CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.Debit(debitCardQualifier);
                        } else {
                            BankAccountQualifier bankAccountQualifier = qualifiedCapability.bank_account_qualifier;
                            bankAccount2 = bankAccountQualifier != null ? new CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.BankAccount(bankAccountQualifier) : null;
                        }
                        arrayList2.add(new CashOutCapabilityManager$CashOutCapabilities.QualifiedCapability(list3, bankAccount2));
                    }
                    arrayList.add(new CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability(asCashInstrumentType, arrayList2));
                }
                List<PreselectionPriorityItem> list4 = cashOutInstrumentCapabilityConfig.preselection_priority;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (PreselectionPriorityItem preselectionPriorityItem : list4) {
                    CashInstrumentType asCashInstrumentType2 = SizeMap.asCashInstrumentType(preselectionPriorityItem.instrument_type);
                    DebitCardQualifier debitCardQualifier2 = preselectionPriorityItem.debit_card_qualifier;
                    if (debitCardQualifier2 != null) {
                        bankAccount = new CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.Debit(debitCardQualifier2);
                    } else {
                        BankAccountQualifier bankAccountQualifier2 = preselectionPriorityItem.bank_account_qualifier;
                        bankAccount = bankAccountQualifier2 != null ? new CashOutCapabilityManager$CashOutCapabilities.InstrumentQualifier.BankAccount(bankAccountQualifier2) : null;
                    }
                    arrayList3.add(new CashOutCapabilityManager$CashOutCapabilities.PreselectionPriorityItem(asCashInstrumentType2, bankAccount));
                }
                List<UnsupportedSpeedAction> list5 = cashOutInstrumentCapabilityConfig.unsupported_speed_actions;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (UnsupportedSpeedAction unsupportedSpeedAction : list5) {
                    SupportedFlows supportedFlows = unsupportedSpeedAction.supported_flow;
                    CashInstrumentType asCashInstrumentType3 = SizeMap.asCashInstrumentType(unsupportedSpeedAction.instrument_type_to_link);
                    String str = unsupportedSpeedAction.title;
                    if (str == null) {
                        str = "";
                    }
                    arrayList4.add(new CashOutCapabilityManager$CashOutCapabilities.UnsupportedSpeedAction(supportedFlows, asCashInstrumentType3, str));
                }
                break;
            case 10:
                CashOutFeeData cashOutFeeData = (CashOutFeeData) obj;
                cashOutFeeData.getClass();
                break;
            case 11:
                Instrument instrument = (Instrument) obj;
                instrument.getClass();
                break;
            case 12:
                ((Instrument) obj).getClass();
                break;
            case 13:
                Instrument instrument2 = (Instrument) obj;
                instrument2.getClass();
                break;
            case 14:
                AddMoneyViewModel addMoneyViewModel = (AddMoneyViewModel) obj;
                addMoneyViewModel.getClass();
                break;
            case 15:
                AddMoneyViewModel addMoneyViewModel2 = (AddMoneyViewModel) obj;
                addMoneyViewModel2.getClass();
                break;
            case 16:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                break;
            case 17:
                InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) obj;
                instrumentCellViewModel.getClass();
                break;
            case 18:
                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj;
                recurringReloadConfigurationViewModel.getClass();
                break;
            case 19:
                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel2 = (RecurringReloadConfigurationViewModel) obj;
                recurringReloadConfigurationViewModel2.getClass();
                break;
            case 20:
                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel3 = (RecurringReloadConfigurationViewModel) obj;
                recurringReloadConfigurationViewModel3.getClass();
                break;
            case 21:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                boolean z = AddMoneyViewKt.getNavigationStep((RecurringReloadConfigurationViewModel) animatedContentTransitionScopeImpl.getTargetState()) > AddMoneyViewKt.getNavigationStep((RecurringReloadConfigurationViewModel) animatedContentTransitionScopeImpl.getInitialState());
                break;
            case 22:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 23:
                ((WithdrawViewModel) obj).getClass();
                break;
            case 24:
                WithdrawViewModel withdrawViewModel = (WithdrawViewModel) obj;
                withdrawViewModel.getClass();
                break;
            case 25:
                obj.getClass();
                break;
            case 26:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                break;
            case 27:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("treehouseAppConfigurations");
                break;
            case 28:
                ((ImageRequest.Builder) obj).getClass();
                break;
            default:
                ObjectAnimator objectAnimator = (ObjectAnimator) obj;
                objectAnimator.getClass();
                objectAnimator.setDuration(350L);
                objectAnimator.setStartDelay(300L);
                objectAnimator.setInterpolator(new DecelerateInterpolator(1.5f));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TaxWebAppBridge$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
