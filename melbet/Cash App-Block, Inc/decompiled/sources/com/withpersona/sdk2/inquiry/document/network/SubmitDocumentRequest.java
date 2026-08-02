package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "", "Data", "Meta", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitDocumentRequest {
    public final Data data;
    public final Meta meta;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        public final String fromComponent;
        public final String fromStep;

        public Meta(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.fromStep = str;
            this.fromComponent = str2;
        }
    }

    public SubmitDocumentRequest(Data data, Meta meta) {
        data.getClass();
        meta.getClass();
        this.data = data;
        this.meta = meta;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        /* renamed from: type, reason: collision with root package name */
        public final String f1451type;

        public /* synthetic */ Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "inquiry" : str);
        }

        public Data(String str) {
            str.getClass();
            this.f1451type = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SubmitDocumentRequest(Data data, Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Data(null, 1, 0 == true ? 1 : 0) : data, meta);
    }
}
