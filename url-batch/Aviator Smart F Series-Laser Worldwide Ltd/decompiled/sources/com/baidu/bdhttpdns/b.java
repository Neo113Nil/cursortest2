package com.baidu.bdhttpdns;

import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import java.util.ArrayList;

/* loaded from: classes.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BDHttpDns.CompletionHandler f4212a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f4213b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BDHttpDns f4214c;

    b(BDHttpDns bDHttpDns, BDHttpDns.CompletionHandler completionHandler, ArrayList arrayList) {
        this.f4214c = bDHttpDns;
        this.f4212a = completionHandler;
        this.f4213b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4212a.completionHandler(new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONEED, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, null, this.f4213b));
    }
}
