package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentFileUploadResponse {
    public final DocumentFileData data;

    public DocumentFileUploadResponse(DocumentFileData documentFileData) {
        this.data = documentFileData;
    }
}
