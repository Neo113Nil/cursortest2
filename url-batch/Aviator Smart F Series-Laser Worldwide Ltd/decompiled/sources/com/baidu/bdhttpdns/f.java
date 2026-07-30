package com.baidu.bdhttpdns;

import com.baidu.bdhttpdns.BDHttpDnsResult;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f4225a;

    interface a {
        void a(int i8, ArrayList<String> arrayList, ArrayList<String> arrayList2, long j8, String str);
    }

    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private String f4226a;

        /* renamed from: b, reason: collision with root package name */
        private a f4227b;

        public b(String str, a aVar) {
            this.f4226a = str;
            this.f4227b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList2;
            Map b8 = f.this.b(this.f4226a);
            if (b8 != null) {
                ArrayList<String> arrayList3 = (ArrayList) b8.get("ipv4");
                arrayList2 = (ArrayList) b8.get("ipv6");
                arrayList = arrayList3;
            } else {
                arrayList = null;
                arrayList2 = null;
            }
            this.f4227b.a(((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? -1 : 0, arrayList, arrayList2, 60L, this.f4226a);
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, ArrayList> b(String str) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            if (allByName == null || allByName.length == 0) {
                l.a("Dns resolve failed, host(%s), get empty resolve result", str);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (InetAddress inetAddress : allByName) {
                if (inetAddress instanceof Inet4Address) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (e.a(hostAddress)) {
                        arrayList.add(hostAddress);
                    }
                } else if (inetAddress instanceof Inet6Address) {
                    String hostAddress2 = inetAddress.getHostAddress();
                    if (e.b(hostAddress2)) {
                        arrayList2.add(hostAddress2);
                    }
                }
            }
            hashMap.put("ipv4", arrayList);
            hashMap.put("ipv6", arrayList2);
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                l.a("Dns resolve failed, host(%s), get no valid resolve result", str);
                return null;
            }
            l.a("Dns resolve successful, host(%s), ipv4List(%s), ipv6List(%s)", str, arrayList.toString(), arrayList2.toString());
            return hashMap;
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
            l.a("Dns resolve failed, host(%s), caught UnknownHostException", str);
            return null;
        }
    }

    BDHttpDnsResult a(String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Map<String, ArrayList> b8 = b(str);
        if (b8 != null) {
            arrayList = b8.get("ipv4");
            arrayList2 = b8.get("ipv6");
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        return ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? new BDHttpDnsResult(BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveErrorDnsResolve) : new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_FROM_DNS, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, arrayList, arrayList2);
    }

    static f a() {
        if (f4225a == null) {
            synchronized (f.class) {
                try {
                    if (f4225a == null) {
                        f4225a = new f();
                    }
                } finally {
                }
            }
        }
        return f4225a;
    }

    void a(String str, a aVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        m.a().b().execute(new b(str, aVar));
    }
}
