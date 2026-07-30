package com.baidu.platform.a.d;

import com.baidu.platform.base.g;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;

/* loaded from: classes2.dex */
public class c extends g {
    public c(String str) {
        b(str);
    }

    private void b(String str) {
        this.f8720d.a("qt", "ext");
        this.f8720d.a("num", "1000");
        this.f8720d.a(CmcdHeadersFactory.STREAM_TYPE_LIVE, "10");
        this.f8720d.a("ie", "utf-8");
        this.f8720d.a("oue", "1");
        this.f8720d.a("res", "api");
        this.f8720d.a("fromproduct", "android_map_sdk");
        this.f8720d.a("uid", str);
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.o();
    }
}
