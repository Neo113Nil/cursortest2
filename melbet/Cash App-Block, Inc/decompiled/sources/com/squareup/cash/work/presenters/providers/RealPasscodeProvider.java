package com.squareup.cash.work.presenters.providers;

import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.service.api.passcode.PasscodeService;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;

/* loaded from: classes7.dex */
public final class RealPasscodeProvider {
    public final PasscodeService passcodeService;
    public final RealSelectedMerchantProvider selectedMerchantProvider;
    public final RealTeamMemberIdProvider teamMemberIdProvider;

    public RealPasscodeProvider(PasscodeService passcodeService, RealTeamMemberIdProvider realTeamMemberIdProvider, RealSelectedMerchantProvider realSelectedMerchantProvider) {
        this.passcodeService = passcodeService;
        this.teamMemberIdProvider = realTeamMemberIdProvider;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
    }
}
