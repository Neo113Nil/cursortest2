package com.squareup.cash.support.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.media3.extractor.ts.MpeghUtil;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.R;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewNodes;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportShowInAppPhoneInSearch;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SupportSearchDebounce;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.SupportSearchService$DefaultNodes;
import com.squareup.cash.support.backend.api.SupportSearchService$Result;
import com.squareup.cash.support.backend.api.SupportSearchService$SearchNode;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.real.RealSupportFlowManager;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SupportSearchPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final SupportScreens.FlowScreens.SupportSearchScreen args;
    public final RealArticlesService articlesService;
    public final AndroidClock clock;
    public final AndroidDateFormatManager dateFormatManager;
    public final FeatureFlagManager featureFlagManager;
    public final boolean isInAppPhoneFlagEnabled;
    public final RealSupportLinkNavigator linkNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Lazy nodeTokenAdapter$delegate;
    public final RealRouter router;
    public final long searchDebounceInMilliSeconds;
    public final DefaultResults storedDefaultResults;
    public final AndroidStringManager stringManager;
    public final RealSupportPhoneService supportPhoneService;
    public final TextSetter supportSearchService;
    public final RealViewTokenGenerator viewTokenGenerator;

    public final class DefaultResults {
        public static final DefaultResults Empty;
        public final Map recentlyViewed;
        public final Map suggested;

        static {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            Empty = new DefaultResults(emptyMap, emptyMap);
        }

        public DefaultResults(Map map, Map map2) {
            map.getClass();
            map2.getClass();
            this.suggested = map;
            this.recentlyViewed = map2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultResults)) {
                return false;
            }
            DefaultResults defaultResults = (DefaultResults) obj;
            return Intrinsics.areEqual(this.suggested, defaultResults.suggested) && Intrinsics.areEqual(this.recentlyViewed, defaultResults.recentlyViewed);
        }

        public final int hashCode() {
            return this.recentlyViewed.hashCode() + (this.suggested.hashCode() * 31);
        }

        public final String toString() {
            return "DefaultResults(suggested=" + this.suggested + ", recentlyViewed=" + this.recentlyViewed + ")";
        }
    }

    public final class SearchResults {
        public final Map results;
        public final String text;

        public SearchResults(String str, Map map) {
            str.getClass();
            this.text = str;
            this.results = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchResults)) {
                return false;
            }
            SearchResults searchResults = (SearchResults) obj;
            return Intrinsics.areEqual(this.text, searchResults.text) && this.results.equals(searchResults.results);
        }

        public final int hashCode() {
            return this.results.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "SearchResults(text=" + this.text + ", results=" + this.results + ")";
        }
    }

    public final class State {
        public final DefaultResults defaultResults;
        public final boolean isSearching;
        public final String searchPlaceholder;
        public final SearchResults searchResults;
        public final String viewToken;

        public State(SearchResults searchResults, DefaultResults defaultResults, boolean z, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.searchResults = searchResults;
            this.defaultResults = defaultResults;
            this.isSearching = z;
            this.viewToken = str;
            this.searchPlaceholder = str2;
        }

        public static State copy$default(State state, SearchResults searchResults, DefaultResults defaultResults, boolean z, String str, int i) {
            if ((i & 1) != 0) {
                searchResults = state.searchResults;
            }
            SearchResults searchResults2 = searchResults;
            if ((i & 2) != 0) {
                defaultResults = state.defaultResults;
            }
            DefaultResults defaultResults2 = defaultResults;
            if ((i & 8) != 0) {
                str = state.viewToken;
            }
            String str2 = str;
            String str3 = state.searchPlaceholder;
            state.getClass();
            defaultResults2.getClass();
            str2.getClass();
            str3.getClass();
            return new State(searchResults2, defaultResults2, z, str2, str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.searchResults, state.searchResults) && this.defaultResults.equals(state.defaultResults) && this.isSearching == state.isSearching && Intrinsics.areEqual(this.viewToken, state.viewToken) && Intrinsics.areEqual(this.searchPlaceholder, state.searchPlaceholder);
        }

        public final int hashCode() {
            SearchResults searchResults = this.searchResults;
            return this.searchPlaceholder.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.defaultResults.hashCode() + ((searchResults == null ? 0 : searchResults.hashCode()) * 31)) * 31, 31, this.isSearching), 31, this.viewToken);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(searchResults=");
            sb.append(this.searchResults);
            sb.append(", defaultResults=");
            sb.append(this.defaultResults);
            sb.append(", isSearching=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.isSearching, ", viewToken=", this.viewToken, ", searchPlaceholder=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.searchPlaceholder, ")");
        }
    }

    public SupportSearchPresenter(RealSupportLinkNavigator realSupportLinkNavigator, MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3, AndroidStringManager androidStringManager, Analytics analytics, RealViewTokenGenerator realViewTokenGenerator, RealArticlesService realArticlesService, FeatureFlagManager featureFlagManager, RealSupportPhoneService realSupportPhoneService, AndroidDateFormatManager androidDateFormatManager, AndroidClock androidClock, RealRouter$Factory$Impl realRouter$Factory$Impl, Moshi moshi, RealSupportFlowManager realSupportFlowManager, SupportScreens.FlowScreens.SupportSearchScreen supportSearchScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        supportSearchScreen.getClass();
        this.linkNavigator = realSupportLinkNavigator;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.viewTokenGenerator = realViewTokenGenerator;
        this.articlesService = realArticlesService;
        this.featureFlagManager = featureFlagManager;
        this.supportPhoneService = realSupportPhoneService;
        this.dateFormatManager = androidDateFormatManager;
        this.clock = androidClock;
        this.args = supportSearchScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        if (realSupportFlowManager.articles.get(supportSearchScreen.nodeToken) != null) {
            a$$ExternalSyntheticBUOutline0.m$1();
            throw null;
        }
        TextSetter textSetter = (TextSetter) ((MarkMarketingMessageAsViewed$MetroFactory) materialButton$$ExternalSyntheticLambda3.f$0).invoke();
        this.supportSearchService = textSetter;
        SupportSearchService$DefaultNodes defaultNodes = textSetter.getDefaultNodes(supportSearchScreen.suggestedArticles);
        List list = defaultNodes.recentlyViewed;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Object obj : list) {
            linkedHashMap.put(((SupportSearchService$SearchNode) obj).token, obj);
        }
        List list2 = defaultNodes.suggested;
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        for (Object obj2 : list2) {
            linkedHashMap2.put(((SupportSearchService$SearchNode) obj2).token, obj2);
        }
        this.storedDefaultResults = new DefaultResults(linkedHashMap2, linkedHashMap);
        this.nodeTokenAdapter$delegate = LazyKt.lazy(new ArticlePresenter$$ExternalSyntheticLambda0(moshi, 3));
        this.isInAppPhoneFlagEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportShowInAppPhoneInSearch.INSTANCE)).enabled();
        Duration.Companion companion = Duration.Companion;
        this.searchDebounceInMilliSeconds = DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SupportSearchDebounce.INSTANCE)).value, DurationUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processSearch(SupportSearchPresenter supportSearchPresenter, String str, MutableState mutableState, Continuation continuation) {
        SupportSearchPresenter$processSearch$1 supportSearchPresenter$processSearch$1;
        int i;
        MutableState mutableState2;
        String str2;
        boolean z;
        Map map;
        String str3;
        String str4 = str;
        Lazy lazy = supportSearchPresenter.nodeTokenAdapter$delegate;
        Analytics analytics = supportSearchPresenter.analytics;
        DefaultResults defaultResults = supportSearchPresenter.storedDefaultResults;
        RealViewTokenGenerator realViewTokenGenerator = supportSearchPresenter.viewTokenGenerator;
        SupportScreens.FlowScreens.SupportSearchScreen supportSearchScreen = supportSearchPresenter.args;
        if (continuation instanceof SupportSearchPresenter$processSearch$1) {
            supportSearchPresenter$processSearch$1 = (SupportSearchPresenter$processSearch$1) continuation;
            int i2 = supportSearchPresenter$processSearch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportSearchPresenter$processSearch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = supportSearchPresenter$processSearch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportSearchPresenter$processSearch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str4.length() < 2) {
                        String generate = realViewTokenGenerator.generate();
                        Map map2 = defaultResults.suggested;
                        Map map3 = defaultResults.suggested;
                        Map map4 = defaultResults.recentlyViewed;
                        if (CollectionsKt.plus((Iterable) map4.values(), map2.values()).isEmpty() || str4.length() != 0) {
                            str2 = generate;
                        } else {
                            ArrayList arrayList = new ArrayList(map3.size());
                            for (Map.Entry entry : map3.entrySet()) {
                                arrayList.add("suggested");
                            }
                            ArrayList arrayList2 = new ArrayList(map4.size());
                            for (Map.Entry entry2 : map4.entrySet()) {
                                arrayList2.add("recently_viewed");
                            }
                            String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList), ",", null, null, 0, null, null, 62);
                            String str5 = supportSearchScreen.data.flowToken;
                            JsonAdapter jsonAdapter = (JsonAdapter) lazy.getValue();
                            ArrayList plus = CollectionsKt.plus((Iterable) map4.values(), map3.values());
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
                            Iterator it = plus.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((SupportSearchService$SearchNode) it.next()).token);
                            }
                            String json = jsonAdapter.toJson(arrayList3);
                            String lowerCase = str4.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            str2 = generate;
                            analytics.track(new CustomerSupportAccessViewNodes(joinToString$default, str5, json, null, null, lowerCase, Integer.valueOf(CollectionsKt.plus((Iterable) map4.values(), map3.values()).size()), CustomerSupportAccessViewNodes.Trigger.SEARCH, str2, null, null, 7688), null);
                        }
                        mutableState.setValue(State.copy$default((State) mutableState.getValue(), null, supportSearchPresenter.storedDefaultResults, false, str2, 16));
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(State.copy$default((State) mutableState.getValue(), null, null, true, null, 27));
                    TextSetter textSetter = supportSearchPresenter.supportSearchService;
                    String str6 = supportSearchScreen.data.flowToken;
                    supportSearchPresenter$processSearch$1.L$0 = str4;
                    supportSearchPresenter$processSearch$1.L$1 = mutableState;
                    supportSearchPresenter$processSearch$1.label = 1;
                    obj = textSetter.search(str6, str4, supportSearchPresenter$processSearch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableState2 = mutableState;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState2 = supportSearchPresenter$processSearch$1.L$1;
                    str4 = supportSearchPresenter$processSearch$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SupportSearchService$Result supportSearchService$Result = (SupportSearchService$Result) obj;
                z = supportSearchService$Result instanceof SupportSearchService$Result.Success;
                if (!z) {
                    List list = ((SupportSearchService$Result.Success) supportSearchService$Result).searchResults;
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    map = new LinkedHashMap(mapCapacity);
                    for (Object obj2 : list) {
                        map.put(((SupportSearchService$SearchNode) obj2).token, obj2);
                    }
                } else {
                    if (!Intrinsics.areEqual(supportSearchService$Result, SupportSearchService$Result.Failed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    map = EmptyMap.INSTANCE;
                    map.getClass();
                }
                SearchResults searchResults = new SearchResults(str4, map);
                String generate2 = realViewTokenGenerator.generate();
                if (StringsKt.isBlank(str4)) {
                    ArrayList arrayList4 = new ArrayList(map.size());
                    for (Map.Entry entry3 : map.entrySet()) {
                        arrayList4.add("search");
                    }
                    String joinToString$default2 = z ? CollectionsKt.joinToString$default(arrayList4, ",", null, null, 0, null, null, 62) : null;
                    String str7 = supportSearchScreen.data.flowToken;
                    String json2 = z ? ((JsonAdapter) lazy.getValue()).toJson(CollectionsKt.toList(map.keySet())) : null;
                    CustomerSupportAccessViewNodes.SearchStatus searchStatus = z ? CustomerSupportAccessViewNodes.SearchStatus.SUCCESS : CustomerSupportAccessViewNodes.SearchStatus.FAILURE;
                    String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str3 = generate2;
                    analytics.track(new CustomerSupportAccessViewNodes(joinToString$default2, str7, json2, null, searchStatus, lowerCase2, z ? Integer.valueOf(map.size()) : null, CustomerSupportAccessViewNodes.Trigger.SEARCH, str3, null, null, 7688), null);
                } else {
                    str3 = generate2;
                }
                mutableState2.setValue(State.copy$default((State) mutableState2.getValue(), searchResults, DefaultResults.Empty, false, str3, 16));
                return Unit.INSTANCE;
            }
        }
        supportSearchPresenter$processSearch$1 = new SupportSearchPresenter$processSearch$1(supportSearchPresenter, continuation);
        Object obj3 = supportSearchPresenter$processSearch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportSearchPresenter$processSearch$1.label;
        if (i != 0) {
        }
        SupportSearchService$Result supportSearchService$Result2 = (SupportSearchService$Result) obj3;
        z = supportSearchService$Result2 instanceof SupportSearchService$Result.Success;
        if (!z) {
        }
        SearchResults searchResults2 = new SearchResults(str4, map);
        String generate22 = realViewTokenGenerator.generate();
        if (StringsKt.isBlank(str4)) {
        }
        mutableState2.setValue(State.copy$default((State) mutableState2.getValue(), searchResults2, DefaultResults.Empty, false, str3, 16));
        return Unit.INSTANCE;
    }

    public static SupportSearchViewModel.HighlightedString highlight(String str, String str2) {
        List split$default;
        if (str.length() == 0 || str2.length() == 0) {
            return new SupportSearchViewModel.HighlightedString(str, EmptyList.INSTANCE);
        }
        split$default = StringsKt__StringsKt.split$default(StringsKt.trim(str2).toString(), new String[]{" "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        Pair findAnyOf = StringsKt.findAnyOf(0, str, arrayList);
        while (findAnyOf != null) {
            int intValue = ((Number) findAnyOf.first).intValue();
            int length = ((String) findAnyOf.second).length() + intValue;
            createListBuilder.add(new IntRange(intValue, length, 1));
            findAnyOf = StringsKt.findAnyOf(length, str, arrayList);
        }
        return new SupportSearchViewModel.HighlightedString(str, CollectionsKt__CollectionsJVMKt.build(createListBuilder));
    }

    public static SupportSearchViewModel.SearchResultViewModel.Item toItem(SupportSearchService$SearchNode supportSearchService$SearchNode, SupportSearchViewModel.Node.Type type2, String str) {
        SupportSearchViewModel.Icon icon;
        Link link = supportSearchService$SearchNode.link;
        Link.Target target = link.target;
        if (target instanceof Link.Target.Article) {
            icon = SupportSearchViewModel.Icon.ARTICLE;
        } else if ((target instanceof Link.Target.ClientRoute) || (target instanceof Link.Target.ClientScenario)) {
            icon = SupportSearchViewModel.Icon.INTERNAL_LINK;
        } else {
            if (!(target instanceof Link.Target.External)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            icon = SupportSearchViewModel.Icon.EXTERNAL_LINK;
        }
        SupportSearchViewModel.Icon icon2 = icon;
        SupportSearchViewModel.Node node = new SupportSearchViewModel.Node(supportSearchService$SearchNode.token, type2);
        SupportSearchViewModel.HighlightedString highlight = highlight(link.title, str);
        String str2 = link.previewText;
        SupportSearchViewModel.HighlightedString highlight2 = str2 != null ? highlight(str2, str) : null;
        SupportSearchViewModel.Node.Type type3 = SupportSearchViewModel.Node.Type.SEARCH;
        return new SupportSearchViewModel.SearchResultViewModel.Item(node, highlight, highlight2, icon2, type2 == type3, type2 == type3);
    }

    public final ListBuilder buildContactOptions(SupportPhoneStatus supportPhoneStatus, boolean z) {
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        AndroidStringManager androidStringManager = this.stringManager;
        createListBuilder.add(new SupportSearchViewModel.SearchResultViewModel.Header(androidStringManager.get(R.string.support_flow_search_contact_section_title)));
        String str = androidStringManager.get(R.string.support_flow_search_chat_title);
        SupportSearchViewModel.Icon icon = SupportSearchViewModel.Icon.ARTICLE;
        SupportSearchViewModel.ContactOptionType contactOptionType = SupportSearchViewModel.ContactOptionType.CHAT;
        createListBuilder.add(new SupportSearchViewModel.SearchResultViewModel.ContactOption(str, null, SupportSearchViewModel.Icon.CHAT, true, SupportSearchViewModel.ContactOptionType.CHAT));
        if (z && (supportPhoneStatus instanceof SupportPhoneStatus.IsEligible)) {
            createListBuilder.add(new SupportSearchViewModel.SearchResultViewModel.ContactOption(androidStringManager.get(R.string.support_flow_search_phone_title), MpeghUtil.subtitle(supportPhoneStatus, androidStringManager, this.dateFormatManager, this.clock), SupportSearchViewModel.Icon.PHONE, ((SupportPhoneStatus.IsEligible) supportPhoneStatus).getAvailability().isAvailable, SupportSearchViewModel.ContactOptionType.PHONE));
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        Object loaded;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-374375435);
        SupportScreens.FlowScreens.SupportSearchScreen supportSearchScreen = this.args;
        SupportSearchService$DefaultNodes defaultNodes = this.supportSearchService.getDefaultNodes(supportSearchScreen.suggestedArticles);
        List list = defaultNodes.recentlyViewed;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj2 : list) {
            linkedHashMap.put(((SupportSearchService$SearchNode) obj2).token, obj2);
        }
        List list2 = defaultNodes.suggested;
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        for (Object obj3 : list2) {
            linkedHashMap2.put(((SupportSearchService$SearchNode) obj3).token, obj3);
        }
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj4 = Composer.Companion.Empty;
        if (rememberedValue == obj4) {
            rememberedValue = this.supportPhoneService._phoneStatus;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj4) {
            rememberedValue2 = Updater.mutableStateOf$default(new State(null, new DefaultResults(linkedHashMap2, linkedHashMap), false, this.viewTokenGenerator.generate(), supportSearchScreen.searchPlaceholder.search));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj4) {
            rememberedValue3 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Object obj5 = (MutableSharedFlow) rememberedValue3;
        boolean changedInstance = gapComposer.changedInstance(flow) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == obj4) {
            rememberedValue4 = new ShoppingWebBridge$loadUrl$1(flow, this, null, 26);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, flow, (Function2) rememberedValue4);
        SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) collectAsState.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == obj4) {
            rememberedValue5 = new WorkflowNode$tick$1$1(this, collectAsState, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, supportPhoneStatus, (Function2) rememberedValue5);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance3 = gapComposer.changedInstance(obj5) | gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == obj4) {
            obj = obj5;
            Object articlePresenter$models$1$1 = new ArticlePresenter$models$1$1(22, mutableState, obj, this, continuation);
            gapComposer.updateRememberedValue(articlePresenter$models$1$1);
            rememberedValue6 = articlePresenter$models$1$1;
        } else {
            obj = obj5;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue6);
        Updater.LaunchedEffect(gapComposer, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, mutableState, obj, collectAsState, 13));
        State state = (State) mutableState.getValue();
        SupportPhoneStatus supportPhoneStatus2 = (SupportPhoneStatus) collectAsState.getValue();
        boolean z = state.isSearching;
        String str = state.searchPlaceholder;
        DefaultResults defaultResults = state.defaultResults;
        Map map = defaultResults.suggested;
        SearchResults searchResults = state.searchResults;
        if (z) {
            loaded = new SupportSearchViewModel.Loading(str);
        } else {
            boolean z2 = this.isInAppPhoneFlagEnabled;
            if (searchResults == null || !searchResults.results.isEmpty()) {
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                SupportSearchViewModel.SearchResultViewModel.Divider divider = SupportSearchViewModel.SearchResultViewModel.Divider.INSTANCE;
                AndroidStringManager androidStringManager = this.stringManager;
                if (searchResults == null) {
                    Map map2 = defaultResults.recentlyViewed;
                    if (!map.isEmpty()) {
                        createListBuilder.add(new SupportSearchViewModel.SearchResultViewModel.Header(androidStringManager.get(R.string.support_flow_search_suggested_title)));
                        Collection values = map.values();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            arrayList.add(toItem((SupportSearchService$SearchNode) it.next(), SupportSearchViewModel.Node.Type.SUGGESTED, ""));
                        }
                        createListBuilder.addAll(arrayList);
                    }
                    if (!map2.isEmpty()) {
                        createListBuilder.add(new SupportSearchViewModel.SearchResultViewModel.Header(androidStringManager.get(R.string.support_flow_search_recently_viewed_title)));
                        Collection values2 = map2.values();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values2, 10));
                        Iterator it2 = values2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(toItem((SupportSearchService$SearchNode) it2.next(), SupportSearchViewModel.Node.Type.RECENTLY_VIEWED, ""));
                        }
                        createListBuilder.addAll(arrayList2);
                        createListBuilder.add(divider);
                    }
                    createListBuilder.addAll(buildContactOptions(supportPhoneStatus2, z2));
                } else {
                    createListBuilder.add(new SupportSearchViewModel.SearchResultViewModel.Header(androidStringManager.get(R.string.support_flow_search_title)));
                    Collection values3 = searchResults.results.values();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values3, 10));
                    Iterator it3 = values3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(toItem((SupportSearchService$SearchNode) it3.next(), SupportSearchViewModel.Node.Type.SEARCH, searchResults.text));
                    }
                    createListBuilder.addAll(arrayList3);
                    createListBuilder.add(divider);
                    createListBuilder.addAll(buildContactOptions(supportPhoneStatus2, z2));
                }
                loaded = new SupportSearchViewModel.Loaded(CollectionsKt__CollectionsJVMKt.build(createListBuilder), str);
            } else {
                loaded = new SupportSearchViewModel.NoResults(str, buildContactOptions(supportPhoneStatus2, z2));
            }
        }
        gapComposer.end(false);
        return loaded;
    }
}
