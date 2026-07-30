package com.baidu.bdhttpdns;

import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BDHttpDns.CompletionHandler f4209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f4210b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BDHttpDns f4211c;

    a(BDHttpDns bDHttpDns, BDHttpDns.CompletionHandler completionHandler, ArrayList arrayList) {
        this.f4211c = bDHttpDns;
        this.f4209a = completionHandler;
        this.f4210b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4209a.completionHandler(new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONEED, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, this.f4210b, null));
    }
}
