package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SuccessState {
    public final Async completeSession;
    public final Async payload;

    public final class Payload {
        public final String businessName;
        public final TextResource content;
        public final boolean skipSuccessPane;
        public final TextResource title;

        public Payload(String str, TextResource textResource, TextResource textResource2, boolean z) {
            this.businessName = str;
            this.title = textResource;
            this.content = textResource2;
            this.skipSuccessPane = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.areEqual(this.businessName, payload.businessName) && this.title.equals(payload.title) && this.content.equals(payload.content) && this.skipSuccessPane == payload.skipSuccessPane;
        }

        public final int hashCode() {
            String str = this.businessName;
            return Boolean.hashCode(this.skipSuccessPane) + ((this.content.hashCode() + ((this.title.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Payload(businessName=" + this.businessName + ", title=" + this.title + ", content=" + this.content + ", skipSuccessPane=" + this.skipSuccessPane + ")";
        }
    }

    public SuccessState(Async async, Async async2) {
        async.getClass();
        async2.getClass();
        this.payload = async;
        this.completeSession = async2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.stripe.android.financialconnections.presentation.Async] */
    public static SuccessState copy$default(SuccessState successState, Async async, Async.Loading loading, int i) {
        if ((i & 1) != 0) {
            async = successState.payload;
        }
        Async.Loading loading2 = loading;
        if ((i & 2) != 0) {
            loading2 = successState.completeSession;
        }
        successState.getClass();
        async.getClass();
        loading2.getClass();
        return new SuccessState(async, loading2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessState)) {
            return false;
        }
        SuccessState successState = (SuccessState) obj;
        return Intrinsics.areEqual(this.payload, successState.payload) && Intrinsics.areEqual(this.completeSession, successState.completeSession);
    }

    public final int hashCode() {
        return this.completeSession.hashCode() + (this.payload.hashCode() * 31);
    }

    public final String toString() {
        return "SuccessState(payload=" + this.payload + ", completeSession=" + this.completeSession + ")";
    }
}
