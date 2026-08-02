package com.stripe.android.financialconnections.features.accountpicker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AccountPickerState {
    public final boolean canRetry;
    public final Async institution;
    public final Async payload;
    public final Async selectAccounts;
    public final Set selectedIds;
    public final AccountPickerState$ViewEffect$OpenUrl viewEffect;

    public final class Payload {
        public final List accounts;
        public final String businessName;
        public final String dataAccessDisclaimer;
        public final DataAccessNotice dataAccessNotice;
        public final SelectionMode selectionMode;
        public final boolean singleAccount;
        public final boolean skipAccountSelection;
        public final boolean stripeDirect;
        public final boolean userSelectedSingleAccountInInstitution;

        public Payload(boolean z, List list, String str, DataAccessNotice dataAccessNotice, SelectionMode selectionMode, boolean z2, boolean z3, String str2, boolean z4) {
            list.getClass();
            this.skipAccountSelection = z;
            this.accounts = list;
            this.dataAccessDisclaimer = str;
            this.dataAccessNotice = dataAccessNotice;
            this.selectionMode = selectionMode;
            this.singleAccount = z2;
            this.stripeDirect = z3;
            this.businessName = str2;
            this.userSelectedSingleAccountInInstitution = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return this.skipAccountSelection == payload.skipAccountSelection && Intrinsics.areEqual(this.accounts, payload.accounts) && Intrinsics.areEqual(this.dataAccessDisclaimer, payload.dataAccessDisclaimer) && Intrinsics.areEqual(this.dataAccessNotice, payload.dataAccessNotice) && this.selectionMode == payload.selectionMode && this.singleAccount == payload.singleAccount && this.stripeDirect == payload.stripeDirect && Intrinsics.areEqual(this.businessName, payload.businessName) && this.userSelectedSingleAccountInInstitution == payload.userSelectedSingleAccountInInstitution;
        }

        public final ArrayList getSelectableAccounts() {
            List list = this.accounts;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Boolean bool = ((PartnerAccount) obj)._allowSelection;
                if (bool != null ? bool.booleanValue() : true) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.skipAccountSelection) * 31, 31, this.accounts);
            String str = this.dataAccessDisclaimer;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            DataAccessNotice dataAccessNotice = this.dataAccessNotice;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.selectionMode.hashCode() + ((hashCode + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31)) * 31, 31, this.singleAccount), 31, this.stripeDirect);
            String str2 = this.businessName;
            return Boolean.hashCode(this.userSelectedSingleAccountInInstitution) + ((m2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(skipAccountSelection=");
            sb.append(this.skipAccountSelection);
            sb.append(", accounts=");
            sb.append(this.accounts);
            sb.append(", dataAccessDisclaimer=");
            sb.append(this.dataAccessDisclaimer);
            sb.append(", dataAccessNotice=");
            sb.append(this.dataAccessNotice);
            sb.append(", selectionMode=");
            sb.append(this.selectionMode);
            sb.append(", singleAccount=");
            sb.append(this.singleAccount);
            sb.append(", stripeDirect=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.stripeDirect, ", businessName=", this.businessName, ", userSelectedSingleAccountInInstitution=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.userSelectedSingleAccountInInstitution, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SelectionMode {
        public static final /* synthetic */ SelectionMode[] $VALUES;
        public static final SelectionMode Multiple;
        public static final SelectionMode Single;

        static {
            SelectionMode selectionMode = new SelectionMode("Single", 0);
            Single = selectionMode;
            SelectionMode selectionMode2 = new SelectionMode("Multiple", 1);
            Multiple = selectionMode2;
            $VALUES = new SelectionMode[]{selectionMode, selectionMode2};
        }

        public static SelectionMode valueOf(String str) {
            return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
        }

        public static SelectionMode[] values() {
            return (SelectionMode[]) $VALUES.clone();
        }
    }

    public AccountPickerState(Async async, Async async2, boolean z, Async async3, Set set, AccountPickerState$ViewEffect$OpenUrl accountPickerState$ViewEffect$OpenUrl) {
        async.getClass();
        async2.getClass();
        async3.getClass();
        set.getClass();
        this.institution = async;
        this.payload = async2;
        this.canRetry = z;
        this.selectAccounts = async3;
        this.selectedIds = set;
        this.viewEffect = accountPickerState$ViewEffect$OpenUrl;
    }

    public static AccountPickerState copy$default(AccountPickerState accountPickerState, Async async, Async async2, Async async3, Set set, AccountPickerState$ViewEffect$OpenUrl accountPickerState$ViewEffect$OpenUrl, int i) {
        if ((i & 1) != 0) {
            async = accountPickerState.institution;
        }
        Async async4 = async;
        if ((i & 2) != 0) {
            async2 = accountPickerState.payload;
        }
        Async async5 = async2;
        boolean z = (i & 4) != 0 ? accountPickerState.canRetry : false;
        if ((i & 8) != 0) {
            async3 = accountPickerState.selectAccounts;
        }
        Async async6 = async3;
        if ((i & 16) != 0) {
            set = accountPickerState.selectedIds;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            accountPickerState$ViewEffect$OpenUrl = accountPickerState.viewEffect;
        }
        accountPickerState.getClass();
        async4.getClass();
        async5.getClass();
        async6.getClass();
        set2.getClass();
        return new AccountPickerState(async4, async5, z, async6, set2, accountPickerState$ViewEffect$OpenUrl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPickerState)) {
            return false;
        }
        AccountPickerState accountPickerState = (AccountPickerState) obj;
        return Intrinsics.areEqual(this.institution, accountPickerState.institution) && Intrinsics.areEqual(this.payload, accountPickerState.payload) && this.canRetry == accountPickerState.canRetry && Intrinsics.areEqual(this.selectAccounts, accountPickerState.selectAccounts) && Intrinsics.areEqual(this.selectedIds, accountPickerState.selectedIds) && Intrinsics.areEqual(this.viewEffect, accountPickerState.viewEffect);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.selectAccounts.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.payload.hashCode() + (this.institution.hashCode() * 31)) * 31, 31, this.canRetry)) * 31, 31, this.selectedIds);
        AccountPickerState$ViewEffect$OpenUrl accountPickerState$ViewEffect$OpenUrl = this.viewEffect;
        return m + (accountPickerState$ViewEffect$OpenUrl == null ? 0 : accountPickerState$ViewEffect$OpenUrl.hashCode());
    }

    public final String toString() {
        return "AccountPickerState(institution=" + this.institution + ", payload=" + this.payload + ", canRetry=" + this.canRetry + ", selectAccounts=" + this.selectAccounts + ", selectedIds=" + this.selectedIds + ", viewEffect=" + this.viewEffect + ")";
    }
}
