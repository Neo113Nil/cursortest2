package com.squareup.cash.tabprovider.real;

import app.cash.local.navigation.api.RealCashLocalNavigatorHelper;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.family.applets.backend.api.FamilyAppletConfig;
import com.squareup.cash.family.applets.backend.real.RealFamilyAppletConfigProvider;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.tabprovider.api.TabInfo;
import com.squareup.protos.cash.aegis.sync_values.FamilyTileContent;
import com.squareup.protos.cash.aegis.sync_values.FamilyTileContent$Type$SponsorTileContent;
import com.squareup.protos.cash.aegis.sync_values.SponsorTileContent;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyTile;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.cash.StringsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealTabProvider$setup$1$1 extends SuspendLambda implements Function5 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealTabProvider$setup$1$1(Object obj, Continuation continuation, int i) {
        super(5, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.$r8$classId;
        Object obj6 = this.this$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                RealTabProvider$setup$1$1 realTabProvider$setup$1$1 = new RealTabProvider$setup$1$1((RealTabProvider) obj6, (Continuation) obj5, 0);
                realTabProvider$setup$1$1.Z$0 = booleanValue;
                realTabProvider$setup$1$1.L$0 = (SessionState) obj2;
                realTabProvider$setup$1$1.Z$1 = booleanValue2;
                realTabProvider$setup$1$1.L$1 = (FamilyProfile) obj4;
                return realTabProvider$setup$1$1.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                RealTabProvider$setup$1$1 realTabProvider$setup$1$12 = new RealTabProvider$setup$1$1((RealFamilyAppletConfigProvider) obj6, (Continuation) obj5, 1);
                realTabProvider$setup$1$12.L$0 = (UiFamilyTile) obj;
                realTabProvider$setup$1$12.L$1 = (Set) obj2;
                realTabProvider$setup$1$12.Z$0 = booleanValue3;
                realTabProvider$setup$1$12.Z$1 = booleanValue4;
                return realTabProvider$setup$1$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SponsorTileContent sponsorTileContent;
        FamilyTileContent familyTileContent;
        switch (this.$r8$classId) {
            case 0:
                RealTabProvider realTabProvider = (RealTabProvider) this.this$0;
                TabInfo tabInfo = realTabProvider.paymentTab;
                TabInfo tabInfo2 = realTabProvider.moneyTab;
                boolean z = this.Z$0;
                SessionState sessionState = (SessionState) this.L$0;
                boolean z2 = this.Z$1;
                FamilyProfile familyProfile = (FamilyProfile) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!(sessionState instanceof SessionState.Authenticated)) {
                    return EmptyList.INSTANCE;
                }
                if (familyProfile instanceof FamilyProfile.ManagedAccount) {
                    return CollectionsKt__CollectionsJVMKt.listOf(tabInfo2);
                }
                if (z) {
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new TabInfo[]{tabInfo2, tabInfo, realTabProvider.activityTab});
                }
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder.add(tabInfo2);
                createListBuilder.add(tabInfo);
                if (z2) {
                    createListBuilder.add(new TabInfo(TabInfo.Id.Local, new ScannerView.AnonymousClass3(1, realTabProvider.localNavigatorHelper, RealCashLocalNavigatorHelper.class, "isLocalTabScreen", "isLocalTabScreen(Ljava/lang/Object;)Z", 0, 6)));
                }
                createListBuilder.add(realTabProvider.treehouseActivityTab);
                return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            default:
                UiFamilyTile uiFamilyTile = (UiFamilyTile) this.L$0;
                Set set = (Set) this.L$1;
                boolean z3 = this.Z$0;
                boolean z4 = this.Z$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((uiFamilyTile == null || (familyTileContent = uiFamilyTile.family_tile_content) == null) ? null : familyTileContent.f1247type) == null) {
                    if (z4) {
                        return FamilyAppletConfig.SponsoredTeen.INSTANCE;
                    }
                    if (set.contains(EligibleFeature.SPONSOR_ELIGIBLE) && z3) {
                        return FamilyAppletConfig.VerifiedNonSponsor.INSTANCE;
                    }
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (((EligibleFeature) it.next()) == EligibleFeature.SPONSOR_ELIGIBLE) {
                                return null;
                            }
                        }
                    }
                    if (z3) {
                        return null;
                    }
                    return FamilyAppletConfig.Unverified.INSTANCE;
                }
                if (uiFamilyTile == null) {
                    return null;
                }
                FamilyTileContent familyTileContent2 = uiFamilyTile.family_tile_content;
                FamilyTileContent$Type$SponsorTileContent familyTileContent$Type$SponsorTileContent = familyTileContent2 != null ? familyTileContent2.f1247type : null;
                if (familyTileContent$Type$SponsorTileContent == null) {
                    familyTileContent$Type$SponsorTileContent = null;
                }
                if (familyTileContent$Type$SponsorTileContent == null || (sponsorTileContent = familyTileContent$Type$SponsorTileContent.value) == null) {
                    return null;
                }
                LocalizedString localizedString = uiFamilyTile.localized_title;
                localizedString.getClass();
                String translated = StringsKt.translated(localizedString);
                String str = uiFamilyTile.tap_url;
                str.getClass();
                List list = sponsorTileContent.avatar_customer_tokens;
                LocalizedString localizedString2 = sponsorTileContent.localized_dependent_names;
                localizedString2.getClass();
                String translated2 = StringsKt.translated(localizedString2);
                Long l = sponsorTileContent.became_active_sponsor_at;
                LocalizedString localizedString3 = sponsorTileContent.localized_pending_requests;
                return new FamilyAppletConfig.Sponsor(translated, str, list, translated2, l, localizedString3 != null ? StringsKt.translated(localizedString3) : null);
        }
    }
}
