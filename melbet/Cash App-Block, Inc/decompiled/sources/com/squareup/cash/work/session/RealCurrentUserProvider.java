package com.squareup.cash.work.session;

import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes7.dex */
public final class RealCurrentUserProvider {
    public final Lazy personIdentifierFlow$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 27));
    public final SquareAccountStore squareAccountStore;

    public RealCurrentUserProvider(SquareAccountStore squareAccountStore) {
        this.squareAccountStore = squareAccountStore;
    }

    public final PersonIdentifier getPersonIdentifier() {
        SharedPreferencesKeyValue sharedPreferencesKeyValue = this.squareAccountStore.userTokenKeyValue;
        String str = (String) sharedPreferencesKeyValue.reader.read(sharedPreferencesKeyValue);
        if (str != null) {
            return new PersonIdentifier(str);
        }
        return null;
    }
}
