package com.baidu.bdhttpdns;

import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.bdhttpdns.h;

/* loaded from: classes.dex */
class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BDHttpDns.CompletionHandler f4219a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BDHttpDnsResult.ResolveType f4220b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.a f4221c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BDHttpDns f4222d;

    d(BDHttpDns bDHttpDns, BDHttpDns.CompletionHandler completionHandler, BDHttpDnsResult.ResolveType resolveType, h.a aVar) {
        this.f4222d = bDHttpDns;
        this.f4219a = completionHandler;
        this.f4220b = resolveType;
        this.f4221c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4219a.completionHandler(new BDHttpDnsResult(this.f4220b, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, this.f4221c.b(), this.f4221c.c()));
    }
}
