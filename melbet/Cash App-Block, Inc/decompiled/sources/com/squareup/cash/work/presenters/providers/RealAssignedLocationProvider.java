package com.squareup.cash.work.presenters.providers;

import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes7.dex */
public final class RealAssignedLocationProvider {
    public final RealCurrentUserProvider currentUserProvider;
    public final RealLocationRepository locationRepository;
    public final RealMembershipRepository membershipRepository;
    public final RealSelectedMerchantProvider selectedMerchantProvider;

    public RealAssignedLocationProvider(RealLocationRepository realLocationRepository, RealMembershipRepository realMembershipRepository, RealCurrentUserProvider realCurrentUserProvider, RealSelectedMerchantProvider realSelectedMerchantProvider) {
        this.locationRepository = realLocationRepository;
        this.membershipRepository = realMembershipRepository;
        this.currentUserProvider = realCurrentUserProvider;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
    }

    public final ChannelFlowTransformLatest getLocations() {
        PersonIdentifier personIdentifier = this.currentUserProvider.getPersonIdentifier();
        Continuation continuation = null;
        String str = personIdentifier != null ? personIdentifier.entityId : null;
        if (str == null) {
            str = "";
        }
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.selectedMerchantProvider.getMerchantIdentifierFlow(), new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(null, this, str, 1))), new RealPasscodeProvider$getPasscode$1(continuation, this, 23));
    }
}
