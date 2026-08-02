package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "", "Attributes", "RemoteDocumentFile", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentFileData {
    public final Attributes attributes;
    public final String id;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes {
        public final List originals;

        public Attributes(List list) {
            this.originals = list;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteDocumentFile {
        public final String filename;
        public final String url;

        public RemoteDocumentFile(String str, String str2) {
            this.url = str;
            this.filename = str2;
        }
    }

    public DocumentFileData(String str, Attributes attributes) {
        this.id = str;
        this.attributes = attributes;
    }
}
