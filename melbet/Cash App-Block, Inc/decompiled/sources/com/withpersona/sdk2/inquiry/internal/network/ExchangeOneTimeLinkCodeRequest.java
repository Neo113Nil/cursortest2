package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "", "Data", "Attributes", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExchangeOneTimeLinkCodeRequest {
    public final Data data;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Attributes;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Attributes {
        public final String oneTimeLinkCode;

        public Attributes(String str) {
            str.getClass();
            this.oneTimeLinkCode = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Attributes) && Intrinsics.areEqual(this.oneTimeLinkCode, ((Attributes) obj).oneTimeLinkCode);
        }

        public final int hashCode() {
            return this.oneTimeLinkCode.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attributes(oneTimeLinkCode=", this.oneTimeLinkCode, ")");
        }
    }

    public ExchangeOneTimeLinkCodeRequest(Data data) {
        this.data = data;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Data;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {
        public final Attributes attributes;

        /* renamed from: type, reason: collision with root package name */
        public final String f1458type;

        public Data(Attributes attributes, String str) {
            attributes.getClass();
            str.getClass();
            this.attributes = attributes;
            this.f1458type = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.attributes, data.attributes) && Intrinsics.areEqual(this.f1458type, data.f1458type);
        }

        public final int hashCode() {
            return this.f1458type.hashCode() + (this.attributes.oneTimeLinkCode.hashCode() * 31);
        }

        public final String toString() {
            return "Data(attributes=" + this.attributes + ", type=" + this.f1458type + ")";
        }

        public /* synthetic */ Data(Attributes attributes, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(attributes, (i & 2) != 0 ? "inquiry-session" : str);
        }
    }
}
