package com.squareup.cash.work.data.real;

import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealJobRepository;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes7.dex */
public final class RealAssignedJobProvider {
    public final RealCurrentUserProvider currentUserProvider;
    public final RealJobRepository jobRepository;
    public final RealMembershipRepository membershipRepository;
    public final RealSelectedMerchantProvider selectedMerchantProvider;

    public RealAssignedJobProvider(RealJobRepository realJobRepository, RealMembershipRepository realMembershipRepository, RealCurrentUserProvider realCurrentUserProvider, RealSelectedMerchantProvider realSelectedMerchantProvider) {
        this.jobRepository = realJobRepository;
        this.membershipRepository = realMembershipRepository;
        this.currentUserProvider = realCurrentUserProvider;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
    }

    public final ChannelFlowTransformLatest getAssignedJobs() {
        PersonIdentifier personIdentifier = this.currentUserProvider.getPersonIdentifier();
        Continuation continuation = null;
        String str = personIdentifier != null ? personIdentifier.entityId : null;
        if (str == null) {
            str = "";
        }
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.selectedMerchantProvider.getMerchantIdentifierFlow(), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, this, str, 27))), new RealPasscodeProvider$getPasscode$1(continuation, this, 17));
    }
}
