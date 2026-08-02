package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "", "Data", "Attributes", "Meta", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateDocumentRequest {
    public final Data data;
    public final Meta meta;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes {
        public final int fileLimit;
        public final String kind;

        public Attributes(String str, int i) {
            str.getClass();
            this.kind = str;
            this.fileLimit = i;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        public final Attributes attributes;

        /* renamed from: type, reason: collision with root package name */
        public final String f1450type;

        public Data(String str, Attributes attributes) {
            this.f1450type = str;
            this.attributes = attributes;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        public final String fieldKeyDocument;

        public Meta(String str) {
            str.getClass();
            this.fieldKeyDocument = str;
        }
    }

    public CreateDocumentRequest(Data data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }
}
