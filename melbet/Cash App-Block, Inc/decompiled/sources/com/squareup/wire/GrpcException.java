package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/wire/GrpcException;", "Ljava/io/IOException;", "Lokio/IOException;", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GrpcException extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GrpcException(GrpcStatus grpcStatus, String str, String str2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder();
        sb.append("grpc-status=" + grpcStatus.code + " grpc-status-name=" + grpcStatus.name);
        if (str != null) {
            sb.append(" grpc-message=".concat(str));
        }
        sb.append(" url=".concat(str2));
    }
}
