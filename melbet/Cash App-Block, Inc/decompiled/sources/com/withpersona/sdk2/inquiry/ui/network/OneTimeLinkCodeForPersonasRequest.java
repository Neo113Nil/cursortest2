package com.withpersona.sdk2.inquiry.ui.network;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;", "", "Meta", "TransitionParams", "NamedComponentParam", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTimeLinkCodeForPersonasRequest {
    public final Meta meta;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$Meta;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        public final TransitionParams transitionParams;

        public Meta(TransitionParams transitionParams) {
            this.transitionParams = transitionParams;
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$NamedComponentParam;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NamedComponentParam {
        public final String name;
        public final ComponentParam value;

        public NamedComponentParam(String str, ComponentParam componentParam) {
            str.getClass();
            componentParam.getClass();
            this.name = str;
            this.value = componentParam;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NamedComponentParam)) {
                return false;
            }
            NamedComponentParam namedComponentParam = (NamedComponentParam) obj;
            return Intrinsics.areEqual(this.name, namedComponentParam.name) && Intrinsics.areEqual(this.value, namedComponentParam.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return "NamedComponentParam(name=" + this.name + ", value=" + this.value + ")";
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$TransitionParams;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransitionParams {
        public final List componentData;

        public TransitionParams(List list) {
            this.componentData = list;
        }
    }

    public OneTimeLinkCodeForPersonasRequest(Meta meta) {
        this.meta = meta;
    }
}
