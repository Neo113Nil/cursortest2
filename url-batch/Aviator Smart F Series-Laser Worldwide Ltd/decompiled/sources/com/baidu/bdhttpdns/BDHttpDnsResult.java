package com.baidu.bdhttpdns;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class BDHttpDnsResult {

    /* renamed from: a, reason: collision with root package name */
    private ResolveType f4197a;

    /* renamed from: b, reason: collision with root package name */
    private final ResolveStatus f4198b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<String> f4199c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<String> f4200d;

    public enum ResolveStatus {
        BDHttpDnsResolveOK,
        BDHttpDnsInputError,
        BDHttpDnsResolveErrorCacheMiss,
        BDHttpDnsResolveErrorDnsResolve
    }

    public enum ResolveType {
        RESOLVE_NONE,
        RESOLVE_NONEED,
        RESOLVE_FROM_HTTPDNS_CACHE,
        RESOLVE_FROM_HTTPDNS_EXPIRED_CACHE,
        RESOLVE_FROM_DNS_CACHE,
        RESOLVE_FROM_DNS
    }

    public BDHttpDnsResult(ResolveStatus resolveStatus) {
        this.f4197a = ResolveType.RESOLVE_NONE;
        this.f4198b = resolveStatus;
    }

    public ArrayList<String> getIpv4List() {
        return this.f4199c;
    }

    public ArrayList<String> getIpv6List() {
        return this.f4200d;
    }

    public ResolveStatus getResolveStatus() {
        return this.f4198b;
    }

    public ResolveType getResolveType() {
        return this.f4197a;
    }

    public BDHttpDnsResult(ResolveType resolveType, ResolveStatus resolveStatus, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ResolveType resolveType2 = ResolveType.RESOLVE_NONE;
        this.f4197a = resolveType;
        this.f4198b = resolveStatus;
        this.f4199c = arrayList;
        this.f4200d = arrayList2;
    }
}
