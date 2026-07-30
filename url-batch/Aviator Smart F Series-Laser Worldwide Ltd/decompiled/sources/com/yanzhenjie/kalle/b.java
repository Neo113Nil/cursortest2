package com.yanzhenjie.kalle;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public interface b extends f {
    @Override // com.yanzhenjie.kalle.f
    /* synthetic */ long contentLength();

    @Override // com.yanzhenjie.kalle.f
    /* synthetic */ String contentType();

    String name();

    @Override // com.yanzhenjie.kalle.f
    /* synthetic */ void writeTo(OutputStream outputStream);
}
