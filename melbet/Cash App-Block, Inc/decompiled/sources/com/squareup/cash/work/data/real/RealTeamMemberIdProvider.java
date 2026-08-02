package com.squareup.cash.work.data.real;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes7.dex */
public final class RealTeamMemberIdProvider {
    public final RealCurrentUserProvider currentUserProvider;
    public final RealMembershipRepository membershipRepository;
    public final RealSelectedMerchantProvider selectedMerchantProvider;

    public RealTeamMemberIdProvider(RealMembershipRepository realMembershipRepository, RealCurrentUserProvider realCurrentUserProvider, RealSelectedMerchantProvider realSelectedMerchantProvider) {
        this.membershipRepository = realMembershipRepository;
        this.currentUserProvider = realCurrentUserProvider;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
    }

    public final Flow getTeamMemberId() {
        PersonIdentifier personIdentifier = this.currentUserProvider.getPersonIdentifier();
        Continuation continuation = null;
        return personIdentifier == null ? new AppLockMonitor$special$$inlined$map$2(continuation, 19) : FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.selectedMerchantProvider.getMerchantIdentifierFlow(), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, this, personIdentifier, 29)));
    }
}
