package com.baidu.bdhttpdns;

import android.content.Context;
import android.content.IntentFilter;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.bdhttpdns.h;
import com.baidu.bdhttpdns.i;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class BDHttpDns {

    /* renamed from: a, reason: collision with root package name */
    private static volatile BDHttpDns f4186a;

    /* renamed from: f, reason: collision with root package name */
    private BDNetworkStateChangeReceiver f4191f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f4192g;

    /* renamed from: i, reason: collision with root package name */
    private long f4194i;

    /* renamed from: j, reason: collision with root package name */
    private long f4195j;

    /* renamed from: k, reason: collision with root package name */
    private int f4196k;

    /* renamed from: b, reason: collision with root package name */
    private final i f4187b = i.a();

    /* renamed from: c, reason: collision with root package name */
    private final f f4188c = f.a();

    /* renamed from: d, reason: collision with root package name */
    private final h f4189d = new h("DNS", true);

    /* renamed from: e, reason: collision with root package name */
    private final h f4190e = new h("HTTPDNS", false);

    /* renamed from: h, reason: collision with root package name */
    private CachePolicy f4193h = CachePolicy.POLICY_TOLERANT;

    public enum CachePolicy {
        POLICY_AGGRESSIVE,
        POLICY_TOLERANT,
        POLICY_STRICT
    }

    public interface CompletionHandler {
        void completionHandler(BDHttpDnsResult bDHttpDnsResult);
    }

    private BDHttpDns(Context context) {
        this.f4192g = context;
        f();
        this.f4191f.refreshIpReachable();
        this.f4195j = System.currentTimeMillis();
    }

    private void f() {
        this.f4191f = new BDNetworkStateChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f4192g.registerReceiver(this.f4191f, intentFilter);
    }

    public static BDHttpDns getService(Context context) {
        if (f4186a == null) {
            synchronized (BDHttpDns.class) {
                try {
                    if (f4186a == null) {
                        f4186a = new BDHttpDns(context);
                    }
                } finally {
                }
            }
        }
        return f4186a;
    }

    h a() {
        return this.f4190e;
    }

    public void asyncResolve(String str, CompletionHandler completionHandler) {
        if (e.a(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m.a().b().execute(new a(this, completionHandler, arrayList));
            return;
        }
        if (e.b(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str.replaceAll("[\\[\\]]", ""));
            m.a().b().execute(new b(this, completionHandler, arrayList2));
            return;
        }
        h.a a8 = this.f4190e.a(str);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<String> arrayList3 = new ArrayList<>();
        if (a(currentTimeMillis)) {
            if (a8 == null) {
                arrayList3.add(str);
            } else if (a8.a()) {
                this.f4187b.a(str);
            }
            if (b(currentTimeMillis)) {
                arrayList3.addAll(this.f4187b.c());
            }
            this.f4187b.a(arrayList3, new k(this.f4192g));
        } else {
            l.a("please wait a moment to send request for %s, until preResolve finished or has passed 1000ms ", str);
        }
        if (a8 != null) {
            BDHttpDnsResult.ResolveType resolveType = a8.a() ? BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_EXPIRED_CACHE : BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_CACHE;
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = a8.b() != null ? a8.b().toString() : null;
            objArr[2] = a8.c() != null ? a8.c().toString() : null;
            objArr[3] = resolveType.toString();
            l.a("Async resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", objArr);
            m.a().b().execute(new c(this, completionHandler, resolveType, a8));
            return;
        }
        h.a a9 = this.f4189d.a(str);
        if (a9 == null) {
            this.f4188c.a(str, new g(this.f4192g, completionHandler));
            return;
        }
        BDHttpDnsResult.ResolveType resolveType2 = BDHttpDnsResult.ResolveType.RESOLVE_FROM_DNS_CACHE;
        Object[] objArr2 = new Object[4];
        objArr2[0] = str;
        objArr2[1] = a9.b() != null ? a9.b().toString() : null;
        objArr2[2] = a9.c() != null ? a9.c().toString() : null;
        objArr2[3] = resolveType2.toString();
        l.a("Async resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", objArr2);
        m.a().b().execute(new d(this, completionHandler, resolveType2, a9));
    }

    h b() {
        return this.f4189d;
    }

    CachePolicy c() {
        return this.f4193h;
    }

    i d() {
        return this.f4187b;
    }

    int e() {
        return this.f4196k;
    }

    public void setAccountID(String str) {
        if (str.length() <= 64) {
            this.f4187b.c(str);
            l.a("Set account id to %s", str);
        } else {
            throw new IllegalArgumentException("accountID length(" + str.length() + ") is bigger than 64");
        }
    }

    public void setCachePolicy(CachePolicy cachePolicy) {
        this.f4193h = cachePolicy;
        if (cachePolicy == CachePolicy.POLICY_STRICT) {
            this.f4190e.a(true);
        } else {
            this.f4190e.a(false);
        }
        l.a("Set cache policy to %s", cachePolicy.name());
    }

    public void setHttpsRequestEnable(boolean z7) {
        this.f4187b.a(z7);
        l.a("Set https enabled to %b", Boolean.valueOf(z7));
    }

    public void setLogEnable(boolean z7) {
        l.a(z7);
        l.a("Set debug log enabled to %b", Boolean.valueOf(z7));
    }

    public void setNetworkSwitchPolicy(boolean z7, boolean z8) {
        this.f4191f.a(z7);
        this.f4191f.b(z8);
        l.a("Set network change policy, clearCache(%b), httpDnsPrefetch(%b)", Boolean.valueOf(z7), Boolean.valueOf(z8));
    }

    public void setPreResolveHosts(ArrayList<String> arrayList) {
        if (arrayList.size() <= 0) {
            l.a("Set pre resolve hosts error, get empty hosts", new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList(new HashSet(arrayList));
        int d8 = this.f4187b.d();
        if (arrayList2.size() > d8) {
            l.a("The current number of hosts is %d, and the max supported size is %s.Please reduce it to %s or less.", Integer.valueOf(arrayList2.size()), Integer.valueOf(d8), Integer.valueOf(d8));
            return;
        }
        int i8 = this.f4196k + 1;
        this.f4196k = i8;
        if (i8 > 1) {
            l.a("You have already set PreResolveHosts, it is best to set it only once.", new Object[0]);
        }
        this.f4194i = System.currentTimeMillis();
        String str = "";
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            str = str + ((String) arrayList2.get(i9)) + SystemInfoUtil.COMMA;
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        String substring = str.substring(0, str.length() - 1);
        l.a("Set pre resolve hosts: %s", substring);
        this.f4187b.a(substring, i.d.DNLIST_HOSTS, new k(this.f4192g));
    }

    public void setPreResolveTag(String str) {
        if (str == null || str.isEmpty()) {
            l.a("Set pre resolve hosts error, get empty tag", new Object[0]);
            return;
        }
        int i8 = this.f4196k + 1;
        this.f4196k = i8;
        if (i8 > 1) {
            l.a("You have already set PreResolveHosts, it is best to set it only once.", new Object[0]);
        }
        l.a(" Set preResolve tag : %s", str);
        k kVar = new k(this.f4192g);
        this.f4194i = System.currentTimeMillis();
        this.f4187b.a(str, i.d.TAG_OF_HOSTS, kVar);
    }

    public void setSecret(String str) {
        int length = str.length();
        if (length > 64 || length < 8) {
            throw new IllegalArgumentException("secret length(" + str.length() + ") check failed");
        }
        this.f4187b.d(str);
        String substring = str.substring(0, 3);
        for (int i8 = 0; i8 < length - 6; i8++) {
            substring = substring + String.valueOf('*');
        }
        l.a("Set secret to %s", substring + str.substring(length - 3));
    }

    public BDHttpDnsResult syncResolve(String str, boolean z7) {
        if (e.a(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            return new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONEED, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, arrayList, null);
        }
        if (e.b(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str.replaceAll("[\\[\\]]", ""));
            return new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONEED, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, null, arrayList2);
        }
        BDHttpDnsResult.ResolveType resolveType = BDHttpDnsResult.ResolveType.RESOLVE_NONE;
        h.a a8 = this.f4190e.a(str);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<String> arrayList3 = new ArrayList<>();
        if (a(currentTimeMillis)) {
            if (a8 == null) {
                arrayList3.add(str);
            } else if (a8.a()) {
                this.f4187b.a(str);
            }
            if (b(currentTimeMillis)) {
                arrayList3.addAll(this.f4187b.c());
            }
            this.f4187b.a(arrayList3, new k(this.f4192g));
        } else {
            l.a("please wait a moment to send request for %s, until preResolve finished or has passed 1000ms ", str);
        }
        if (a8 != null) {
            BDHttpDnsResult.ResolveType resolveType2 = a8.a() ? BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_EXPIRED_CACHE : BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_CACHE;
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = a8.b() != null ? a8.b().toString() : null;
            objArr[2] = a8.c() != null ? a8.c().toString() : null;
            objArr[3] = resolveType2.toString();
            l.a("Sync resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", objArr);
            return new BDHttpDnsResult(resolveType2, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, a8.b(), a8.c());
        }
        if (a8 == null && z7) {
            l.a("Sync resolve failed, host(%s), find no httpdns cache entry and cacheOnly is true", str);
            return new BDHttpDnsResult(resolveType, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveErrorCacheMiss, null, null);
        }
        h.a a9 = this.f4189d.a(str);
        if (a9 != null) {
            BDHttpDnsResult.ResolveType resolveType3 = BDHttpDnsResult.ResolveType.RESOLVE_FROM_DNS_CACHE;
            Object[] objArr2 = new Object[4];
            objArr2[0] = str;
            objArr2[1] = a9.b() != null ? a9.b().toString() : null;
            objArr2[2] = a9.c() != null ? a9.c().toString() : null;
            objArr2[3] = resolveType3.toString();
            l.a("Sync resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", objArr2);
            return new BDHttpDnsResult(resolveType3, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, a9.b(), a9.c());
        }
        BDHttpDnsResult a10 = this.f4188c.a(str);
        if (a10.getResolveStatus() == BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK) {
            h.a aVar = new h.a();
            aVar.a(60L);
            aVar.b(System.currentTimeMillis() / 1000);
            aVar.a(a10.getIpv4List());
            aVar.b(a10.getIpv6List());
            this.f4189d.a(str, aVar);
            Object[] objArr3 = new Object[4];
            objArr3[0] = str;
            objArr3[1] = aVar.b() != null ? aVar.b().toString() : null;
            objArr3[2] = aVar.c() != null ? aVar.c().toString() : null;
            objArr3[3] = a10.getResolveType().toString();
            l.a("Sync resolve successful, host(%s) ipList(%s) ipv6List(%s) resolveType(%s)", objArr3);
        } else {
            l.a("Sync resolve failed, host(%s), dns resolve failed", str);
        }
        return a10;
    }

    private boolean a(long j8) {
        return this.f4187b.f() || j8 - this.f4194i > 1000;
    }

    private boolean b(long j8) {
        if (j8 - this.f4195j <= 60000) {
            return false;
        }
        this.f4195j = j8;
        return true;
    }
}
