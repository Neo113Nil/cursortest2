package com.baidu.bdhttpdns;

import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.bdhttpdns.h;

/* loaded from: classes.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BDHttpDns.CompletionHandler f4215a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BDHttpDnsResult.ResolveType f4216b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.a f4217c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BDHttpDns f4218d;

    c(BDHttpDns bDHttpDns, BDHttpDns.CompletionHandler completionHandler, BDHttpDnsResult.ResolveType resolveType, h.a aVar) {
        this.f4218d = bDHttpDns;
        this.f4215a = completionHandler;
        this.f4216b = resolveType;
        this.f4217c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4215a.completionHandler(new BDHttpDnsResult(this.f4216b, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, this.f4217c.b(), null));
    }
}
