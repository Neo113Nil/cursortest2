package com.withpersona.sdk2.inquiry;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "", "CancelInquiry", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface InquiryActivityEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "skipBackendCall", "", "<init>", "(Z)V", "getSkipBackendCall", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelInquiry implements InquiryActivityEvent {
        private final boolean skipBackendCall;

        public /* synthetic */ CancelInquiry(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public static /* synthetic */ CancelInquiry copy$default(CancelInquiry cancelInquiry, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cancelInquiry.skipBackendCall;
            }
            return cancelInquiry.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSkipBackendCall() {
            return this.skipBackendCall;
        }

        public final CancelInquiry copy(boolean skipBackendCall) {
            return new CancelInquiry(skipBackendCall);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelInquiry) && this.skipBackendCall == ((CancelInquiry) other).skipBackendCall;
        }

        public final boolean getSkipBackendCall() {
            return this.skipBackendCall;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipBackendCall);
        }

        public String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("CancelInquiry(skipBackendCall=", ")", this.skipBackendCall);
        }

        public CancelInquiry(boolean z) {
            this.skipBackendCall = z;
        }

        public CancelInquiry() {
            this(false, 1, null);
        }
    }
}
