package com.squareup.cash.storage;

import androidx.room.TransactorKt;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.storage.StorageLink;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class SessionManagerKt$launchStorageLinkStateMachine$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ RealSessionedLink $sessionedLink;
    public /* synthetic */ Pair L$0;
    public /* synthetic */ SessionState L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerKt$launchStorageLinkStateMachine$2(RealSessionedLink realSessionedLink, Continuation continuation) {
        super(3, continuation);
        this.$sessionedLink = realSessionedLink;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SessionManagerKt$launchStorageLinkStateMachine$2 sessionManagerKt$launchStorageLinkStateMachine$2 = new SessionManagerKt$launchStorageLinkStateMachine$2(this.$sessionedLink, (Continuation) obj3);
        sessionManagerKt$launchStorageLinkStateMachine$2.L$0 = (Pair) obj;
        sessionManagerKt$launchStorageLinkStateMachine$2.L$1 = (SessionState) obj2;
        return sessionManagerKt$launchStorageLinkStateMachine$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionLinkChangeEvent sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch;
        StorageLink storageLink;
        Pair pair = this.L$0;
        SessionState sessionState = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        SessionState sessionState2 = (SessionState) pair.first;
        StorageLinkState storageLinkState = (StorageLinkState) pair.second;
        StorageLink storageLink2 = storageLinkState.link;
        String accountToken = sessionState2 instanceof SwitchingState ? ((SwitchingState) sessionState2).targetAccountToken : sessionState2 instanceof SessionState.Authenticated ? ((AuthenticatedState) ((SessionState.Authenticated) sessionState2)).getAccountToken() : null;
        String accountToken2 = sessionState instanceof SwitchingState ? ((SwitchingState) sessionState).targetAccountToken : sessionState instanceof SessionState.Authenticated ? ((AuthenticatedState) ((SessionState.Authenticated) sessionState)).getAccountToken() : null;
        boolean z = accountToken == null && accountToken2 != null;
        boolean z2 = accountToken != null && accountToken2 == null;
        Timber.Forest forest = Timber.Forest;
        forest.tag("SandboxStateMachine");
        forest.i("prev sessionState: " + sessionState2, new Object[0]);
        forest.tag("SandboxStateMachine");
        forest.i("next sessionState: " + sessionState, new Object[0]);
        if (z) {
            accountToken2.getClass();
            sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch = new SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete(accountToken2);
        } else if (z2) {
            accountToken.getClass();
            sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch = new SessionLinkChangeEvent(accountToken) { // from class: com.squareup.cash.storage.SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignOut
                public final String associatedAccountToken;

                {
                    this.associatedAccountToken = accountToken;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignOut) && this.associatedAccountToken.equals(((SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignOut) obj2).associatedAccountToken);
                }

                @Override // com.squareup.cash.storage.SessionLinkChangeEvent
                public final String getAssociatedAccountToken() {
                    return this.associatedAccountToken;
                }

                public final int hashCode() {
                    return this.associatedAccountToken.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SignOut(associatedAccountToken=", this.associatedAccountToken, ")");
                }
            };
        } else {
            if (Intrinsics.areEqual(accountToken, accountToken2)) {
                forest.tag("SandboxStateMachine");
                forest.i("No change.", new Object[0]);
                return new Pair(sessionState, storageLinkState);
            }
            accountToken2.getClass();
            sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch = new SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch(accountToken2);
        }
        RealSessionedLink realSessionedLink = this.$sessionedLink;
        SessionQueries sessionQueries = realSessionedLink.storageLinkQueries;
        if (sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete) {
            storageLink = (StorageLink) TransactorKt.transactionWithResult$default(sessionQueries, new BottomSheet$$ExternalSyntheticLambda3(10, realSessionedLink, (SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete) sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch));
        } else if (sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch) {
            storageLink = (StorageLink) TransactorKt.transactionWithResult$default(sessionQueries, new BottomSheet$$ExternalSyntheticLambda3(11, (SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch) sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch, realSessionedLink));
        } else {
            if (!(sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignOut)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            storageLink = (StorageLink) TransactorKt.transactionWithResult$default(sessionQueries, new RealSandboxer$$ExternalSyntheticLambda0(realSessionedLink, 21));
        }
        forest.tag("SandboxStateMachine");
        forest.i("event: " + sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch + " oldLink: " + storageLink2 + " nextLink: " + storageLink, new Object[0]);
        return (Intrinsics.areEqual(storageLink2, storageLink) && (storageLink2 instanceof StorageLink.Legacy)) ? new Pair(sessionState, storageLinkState) : new Pair(sessionState, new StorageLinkState(storageLink, sessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch));
    }
}
