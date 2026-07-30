package com.baidu.ar;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.SSLParameters;

/* loaded from: classes.dex */
public class q extends ve {

    /* renamed from: w, reason: collision with root package name */
    public h7 f2965w;

    public q(URI uri) {
        super(uri);
    }

    @Override // com.baidu.ar.ve
    public void a(int i8, String str, boolean z7) {
        h7 h7Var = this.f2965w;
        if (h7Var != null) {
            h7Var.a(i8, str, z7);
        }
    }

    public void s() {
        this.f2965w = null;
    }

    public void a(h7 h7Var) {
        this.f2965w = h7Var;
    }

    @Override // com.baidu.ar.ve
    public void a(pb pbVar) {
        h7 h7Var = this.f2965w;
        if (h7Var != null) {
            h7Var.onOpen();
        }
    }

    @Override // com.baidu.ar.ve
    public void a(Exception exc) {
        h7 h7Var = this.f2965w;
        if (h7Var != null) {
            h7Var.onError(1001, exc != null ? exc.getMessage() : "");
        }
    }

    @Override // com.baidu.ar.ve
    public void a(String str) {
        h7 h7Var = this.f2965w;
        if (h7Var != null) {
            h7Var.a(str);
        }
    }

    @Override // com.baidu.ar.ve
    public void a(ByteBuffer byteBuffer) {
        String str;
        super.a(byteBuffer);
        try {
            str = StandardCharsets.UTF_8.newDecoder().decode(byteBuffer.asReadOnlyBuffer()).toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            str = "";
        }
        h7 h7Var = this.f2965w;
        if (h7Var != null) {
            h7Var.a(str);
        }
    }

    @Override // com.baidu.ar.ve
    public void a(SSLParameters sSLParameters) {
    }
}
