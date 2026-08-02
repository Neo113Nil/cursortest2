package com.squareup.cash.transfers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavArgumentKt;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.cdf.instrument.InstrumentLinkInitiate;
import com.squareup.cash.cdf.instrument.InstrumentLinkShowOptions;
import com.squareup.cash.cdf.instrument.InstrumentViewViewLinkingOptions;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.instruments.backend.api.InstrumentLinkingOptionManager$InstrumentLinkingOption;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.transfers.screens.InstrumentDetailsFullscreenScreen;
import com.squareup.cash.transfers.screens.InstrumentDetailsSheetScreen;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsQuestion;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewEvent;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class LinkedAccountsPresenter$models$2$1$2 implements FlowCollector {
    public final /* synthetic */ State $instrumentLinkingOptionsMetadata$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MutableState $viewModel$delegate;
    public final /* synthetic */ LinkedAccountsPresenter this$0;

    public LinkedAccountsPresenter$models$2$1$2(LinkedAccountsPresenter linkedAccountsPresenter, State state, MutableState mutableState) {
        this.this$0 = linkedAccountsPresenter;
        this.$instrumentLinkingOptionsMetadata$delegate = state;
        this.$viewModel$delegate = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v62, types: [kotlin.collections.EmptyList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        List list;
        ?? arrayList;
        int i;
        int i2;
        ?? r9;
        int i3 = this.$r8$classId;
        MutableState mutableState = this.$viewModel$delegate;
        State state = this.$instrumentLinkingOptionsMetadata$delegate;
        LinkedAccountsPresenter linkedAccountsPresenter = this.this$0;
        switch (i3) {
            case 0:
                Pair pair = (Pair) obj;
                List list2 = (List) pair.first;
                List list3 = (List) pair.second;
                LinkedAccountsPresenter.InstrumentLinkingOptionsMetadata instrumentLinkingOptionsMetadata = (LinkedAccountsPresenter.InstrumentLinkingOptionsMetadata) state.getValue();
                AndroidStringManager androidStringManager = linkedAccountsPresenter.stringManager;
                CashInstrumentType cashInstrumentType = CashInstrumentType.BANK_ACCOUNT;
                CashInstrumentType cashInstrumentType2 = CashInstrumentType.DEBIT_CARD;
                CashInstrumentType cashInstrumentType3 = CashInstrumentType.CREDIT_CARD;
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CashInstrumentType[]{cashInstrumentType, cashInstrumentType2, cashInstrumentType3});
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(cashInstrumentType2, new ArrayList());
                linkedHashMap.put(cashInstrumentType, new ArrayList());
                linkedHashMap.put(cashInstrumentType3, new ArrayList());
                List list4 = list2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list4) {
                    if (listOf.contains(((Instrument) obj2).cashInstrumentType)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Instrument instrument = (Instrument) it.next();
                    CashInstrumentType cashInstrumentType4 = instrument.cashInstrumentType;
                    ?? r12 = linkedHashMap.get(cashInstrumentType4);
                    if (r12 == null) {
                        r12 = new ArrayList();
                        linkedHashMap.put(cashInstrumentType4, r12);
                    }
                    ((List) r12).add(instrument);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (true) {
                    boolean z = false;
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            if (!((List) entry.getValue()).isEmpty()) {
                                linkedHashMap3.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = linkedHashMap3.entrySet().iterator();
                        while (it3.hasNext()) {
                            CollectionsKt__MutableCollectionsKt.addAll((Iterable) ((Map.Entry) it3.next()).getValue(), arrayList3);
                        }
                        if (arrayList3.isEmpty()) {
                            ?? linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.put(CashInstrumentType.DEBIT_CARD, null);
                            linkedHashMap4.put(CashInstrumentType.BANK_ACCOUNT, null);
                            linkedHashMap4.put(CashInstrumentType.CREDIT_CARD, null);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : list3) {
                                if (listOf.contains(CollectionsKt.first(((InstrumentLinkingOptionManager$InstrumentLinkingOption) obj3).cashInstrumentType))) {
                                    arrayList4.add(obj3);
                                }
                            }
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                InstrumentLinkingOptionManager$InstrumentLinkingOption instrumentLinkingOptionManager$InstrumentLinkingOption = (InstrumentLinkingOptionManager$InstrumentLinkingOption) it4.next();
                                CashInstrumentType cashInstrumentType5 = (CashInstrumentType) CollectionsKt.first(instrumentLinkingOptionManager$InstrumentLinkingOption.cashInstrumentType);
                                if (linkedHashMap4.get(cashInstrumentType5) == null) {
                                    linkedHashMap4.put(cashInstrumentType5, instrumentLinkingOptionManager$InstrumentLinkingOption);
                                } else {
                                    ((ErrorReporter) linkedAccountsPresenter.errorReporter).report(new LinkedAccountsPresenter.MultipleInstrumentLinkingOptionsOfSameTypeError(cashInstrumentType5), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(linkedHashMap4.size());
                            Iterator it5 = linkedHashMap4.entrySet().iterator();
                            while (it5.hasNext()) {
                                arrayList5.add((InstrumentLinkingOptionManager$InstrumentLinkingOption) ((Map.Entry) it5.next()).getValue());
                            }
                            ArrayList filterNotNull = CollectionsKt.filterNotNull(arrayList5);
                            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterNotNull, 10));
                            Iterator it6 = filterNotNull.iterator();
                            while (it6.hasNext()) {
                                InstrumentLinkingOptionManager$InstrumentLinkingOption instrumentLinkingOptionManager$InstrumentLinkingOption2 = (InstrumentLinkingOptionManager$InstrumentLinkingOption) it6.next();
                                String str = instrumentLinkingOptionManager$InstrumentLinkingOption2.title;
                                String str2 = str == null ? "" : str;
                                String str3 = instrumentLinkingOptionManager$InstrumentLinkingOption2.description;
                                arrayList6.add(new LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow(new InstrumentCellViewModel(str2, str3 == null ? "" : str3, true, CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.LocalIcon(Icons.Add24, null, null, null, null, 30)), InstrumentCellViewModel.Accessory.Push.INSTANCE, null, null, null, null, 480), new LinkedAccountsViewEvent.Link(instrumentLinkingOptionManager$InstrumentLinkingOption2.cashInstrumentType)));
                            }
                            list = arrayList6;
                        } else {
                            list = EmptyList.INSTANCE;
                        }
                        ArrayList plus = CollectionsKt.plus((Iterable) list, (Collection) arrayList3);
                        Analytics analytics = (Analytics) linkedAccountsPresenter.analytics;
                        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
                        Iterator it7 = plus.iterator();
                        while (it7.hasNext()) {
                            LinkedAccountsViewEvent linkedAccountsViewEvent = ((LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow) it7.next()).linkedAccountsViewEvent;
                            arrayList7.add(linkedAccountsViewEvent instanceof LinkedAccountsViewEvent.ShowCardOptionsSheet ? "Linked|" + ((LinkedAccountsViewEvent.ShowCardOptionsSheet) linkedAccountsViewEvent).cashInstrumentType : linkedAccountsViewEvent instanceof LinkedAccountsViewEvent.Link ? Boxes$$ExternalSyntheticOutline1.m("Link|", CollectionsKt.first(((LinkedAccountsViewEvent.Link) linkedAccountsViewEvent).types)) : null);
                        }
                        analytics.track(new InstrumentViewViewLinkingOptions(CollectionsKt.joinToString$default(arrayList7, null, null, null, 0, null, null, 63)), null);
                        if (arrayList3.isEmpty()) {
                            arrayList = CollectionsKt__CollectionsJVMKt.listOf(new LinkedAccountsViewModel.Ready.InstrumentSection(null, list, false));
                        } else if (linkedAccountsPresenter.useStackedCardsUx) {
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj4 : list4) {
                                CashInstrumentType cashInstrumentType6 = ((Instrument) obj4).cashInstrumentType;
                                boolean z2 = z;
                                if (cashInstrumentType6 == CashInstrumentType.DEBIT_CARD || cashInstrumentType6 == CashInstrumentType.CREDIT_CARD) {
                                    arrayList9.add(obj4);
                                }
                                z = z2;
                            }
                            boolean z3 = z;
                            if (!arrayList9.isEmpty()) {
                                TaxWebAppBridge$$ExternalSyntheticLambda1 taxWebAppBridge$$ExternalSyntheticLambda1 = new TaxWebAppBridge$$ExternalSyntheticLambda1(11);
                                TaxWebAppBridge$$ExternalSyntheticLambda1 taxWebAppBridge$$ExternalSyntheticLambda12 = new TaxWebAppBridge$$ExternalSyntheticLambda1(12);
                                TaxWebAppBridge$$ExternalSyntheticLambda1 taxWebAppBridge$$ExternalSyntheticLambda13 = new TaxWebAppBridge$$ExternalSyntheticLambda1(13);
                                Function1[] function1Arr = new Function1[3];
                                function1Arr[z3 ? 1 : 0] = taxWebAppBridge$$ExternalSyntheticLambda1;
                                function1Arr[1] = taxWebAppBridge$$ExternalSyntheticLambda12;
                                function1Arr[2] = taxWebAppBridge$$ExternalSyntheticLambda13;
                                List sortedWith = CollectionsKt.sortedWith(arrayList9, ComparisonsKt__ComparisonsKt.compareBy(function1Arr));
                                ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                                Iterator it8 = sortedWith.iterator();
                                while (it8.hasNext()) {
                                    arrayList10.add(linkedAccountsPresenter.toInstrumentRow((Instrument) it8.next(), InstrumentIcon.IconShape.CARD, true));
                                }
                                arrayList8.add(new LinkedAccountsViewModel.Ready.InstrumentSection(androidStringManager.get(R.string.linked_cards_section_header), arrayList10, true));
                            }
                            List list5 = (List) linkedHashMap3.get(CashInstrumentType.BANK_ACCOUNT);
                            List list6 = list5;
                            if (list6 != null && !list6.isEmpty()) {
                                arrayList8.add(new LinkedAccountsViewModel.Ready.InstrumentSection(androidStringManager.get(R.string.linked_bank_accounts_section_header), list5, z3));
                            }
                            arrayList = arrayList8;
                        } else {
                            int i4 = 2;
                            arrayList = new ArrayList(linkedHashMap3.size());
                            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                int i5 = LinkedAccountsPresenter.WhenMappings.$EnumSwitchMapping$0[((CashInstrumentType) entry2.getKey()).ordinal()];
                                if (i5 != 1) {
                                    i = i4;
                                    if (i5 == i) {
                                        i2 = R.string.linked_bank_accounts_section_header;
                                    } else {
                                        if (i5 != 3) {
                                            a$$ExternalSyntheticBUOutline0.m$1(Boxes$$ExternalSyntheticOutline1.m("Unexpected cash instrument type: ", entry2.getKey()));
                                            return null;
                                        }
                                        i2 = R.string.linked_credit_cards_section_header;
                                    }
                                } else {
                                    i = i4;
                                    i2 = R.string.linked_debit_cards_section_header;
                                }
                                arrayList.add(new LinkedAccountsViewModel.Ready.InstrumentSection(androidStringManager.get(i2), (List) entry2.getValue(), false));
                                i4 = i;
                            }
                        }
                        mutableState.setValue(new LinkedAccountsViewModel.Ready(arrayList, list.isEmpty() ? instrumentLinkingOptionsMetadata != null ? instrumentLinkingOptionsMetadata.linkingOptionCtaLabel : null : null));
                        return Unit.INSTANCE;
                    }
                    Map.Entry entry3 = (Map.Entry) it2.next();
                    Object key = entry3.getKey();
                    List list7 = (List) entry3.getValue();
                    if (list7.isEmpty()) {
                        r9 = EmptyList.INSTANCE;
                    } else {
                        List<Instrument> list8 = list7;
                        ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                        for (Instrument instrument2 : list8) {
                            arrayList11.add(linkedAccountsPresenter.toInstrumentRow(instrument2, (!linkedAccountsPresenter.useInstrumentCardArt || instrument2.cashInstrumentType == CashInstrumentType.BANK_ACCOUNT) ? InstrumentIcon.IconShape.CIRCLE : InstrumentIcon.IconShape.CARD, false));
                        }
                        r9 = arrayList11;
                    }
                    linkedHashMap2.put(key, r9);
                }
                break;
            default:
                LinkedAccountsScreen linkedAccountsScreen = (LinkedAccountsScreen) linkedAccountsPresenter.args;
                Analytics analytics2 = (Analytics) linkedAccountsPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) linkedAccountsPresenter.navigator;
                LinkedAccountsViewEvent linkedAccountsViewEvent2 = (LinkedAccountsViewEvent) obj;
                if (Intrinsics.areEqual(linkedAccountsViewEvent2, LinkedAccountsViewEvent.ExitFlow.INSTANCE)) {
                    screenNavigator.goTo(Back.INSTANCE);
                } else if (linkedAccountsViewEvent2 instanceof LinkedAccountsViewEvent.Link) {
                    LinkedAccountsPresenter.InstrumentLinkingOptionsMetadata instrumentLinkingOptionsMetadata2 = (LinkedAccountsPresenter.InstrumentLinkingOptionsMetadata) state.getValue();
                    List list9 = (List) mutableState.getValue();
                    analytics2.track(new InstrumentLinkShowOptions(InstrumentLinkShowOptions.OptionSheetType.LINK), null);
                    screenNavigator.askQuestion(InstrumentLinkingOptionsQuestion.INSTANCE, new CardTransitionKt$$ExternalSyntheticLambda4(14, instrumentLinkingOptionsMetadata2, linkedAccountsPresenter, list9));
                } else {
                    if (!(linkedAccountsViewEvent2 instanceof LinkedAccountsViewEvent.ShowCardOptionsSheet)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CashInstrumentType cashInstrumentType7 = CashInstrumentType.BANK_ACCOUNT;
                    Set set = ArraysKt___ArraysKt.toSet(new CashInstrumentType[]{cashInstrumentType7, CashInstrumentType.DEBIT_CARD, CashInstrumentType.CREDIT_CARD});
                    LinkedAccountsViewEvent.ShowCardOptionsSheet showCardOptionsSheet = (LinkedAccountsViewEvent.ShowCardOptionsSheet) linkedAccountsViewEvent2;
                    String str4 = showCardOptionsSheet.instrumentToken;
                    CashInstrumentType cashInstrumentType8 = showCardOptionsSheet.cashInstrumentType;
                    if (!set.contains(cashInstrumentType8)) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Received an unexpected instrument type: ", cashInstrumentType8, ".");
                        return null;
                    }
                    cashInstrumentType8.getClass();
                    analytics2.track(new InstrumentLinkInitiate(NavArgumentKt.toCdfInstrumentType(cashInstrumentType8), null, 6), null);
                    screenNavigator.goTo((!linkedAccountsPresenter.useStackedCardsUx || cashInstrumentType8 == cashInstrumentType7) ? new InstrumentDetailsSheetScreen(linkedAccountsScreen, cashInstrumentType8, str4) : new InstrumentDetailsFullscreenScreen(linkedAccountsScreen, cashInstrumentType8, str4));
                }
                return Unit.INSTANCE;
        }
    }

    public LinkedAccountsPresenter$models$2$1$2(CoroutineScope coroutineScope, LinkedAccountsPresenter linkedAccountsPresenter, State state, MutableState mutableState) {
        this.this$0 = linkedAccountsPresenter;
        this.$instrumentLinkingOptionsMetadata$delegate = state;
        this.$viewModel$delegate = mutableState;
    }
}
