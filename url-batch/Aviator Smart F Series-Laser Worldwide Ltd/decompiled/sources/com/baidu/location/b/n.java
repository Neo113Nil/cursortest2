package com.baidu.location.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.Dns;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4796a;

    /* renamed from: b, reason: collision with root package name */
    private long f4797b;

    /* renamed from: c, reason: collision with root package name */
    private Context f4798c;

    /* renamed from: d, reason: collision with root package name */
    private BDHttpDns f4799d;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final n f4800a = new n();
    }

    public static class c implements Dns {

        /* renamed from: a, reason: collision with root package name */
        private static c f4801a;

        /* renamed from: b, reason: collision with root package name */
        private BDHttpDns f4802b;

        private c(BDHttpDns bDHttpDns) {
            this.f4802b = bDHttpDns;
        }

        public static c a(BDHttpDns bDHttpDns) {
            if (f4801a == null) {
                f4801a = new c(bDHttpDns);
            }
            return f4801a;
        }

        @Override // okhttp3.Dns
        public List<InetAddress> lookup(String str) {
            String str2;
            if (!com.baidu.location.e.e.f5202a.equals(str)) {
                return Dns.SYSTEM.lookup(str);
            }
            BDHttpDnsResult syncResolve = this.f4802b.syncResolve(str, true);
            ArrayList<String> ipv6List = syncResolve.getIpv6List();
            ArrayList<String> ipv4List = syncResolve.getIpv4List();
            if (ipv6List == null || ipv6List.isEmpty()) {
                str2 = (ipv4List == null || ipv4List.isEmpty()) ? null : ipv4List.get(0);
            } else {
                str2 = "[" + ipv6List.get(0) + "]";
            }
            return str2 != null ? Arrays.asList(InetAddress.getAllByName(str2)) : Dns.SYSTEM.lookup(str);
        }
    }

    private n() {
        this.f4796a = true;
        this.f4797b = 0L;
    }

    public static n a() {
        return b.f4800a;
    }

    public int b() {
        return this.f4796a ? 1 : 0;
    }

    public Dns c() {
        return this.f4796a ? Dns.SYSTEM : c.a(this.f4799d);
    }

    public void a(Context context) {
        if (e.b().f4661w4 == 0) {
            return;
        }
        this.f4798c = context;
        this.f4796a = u.a(context).getBoolean("IsDomestic", true);
        this.f4797b = u.a(context).getLong("update_result_time", 0L);
        if (this.f4796a) {
            com.baidu.location.e.e.a();
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("loc.map.baidu.com"));
        BDHttpDns service = BDHttpDns.getService(context);
        this.f4799d = service;
        try {
            service.setAccountID("110001");
            this.f4799d.setSecret("nHpsFU98hcqhzFWY17Ht");
        } catch (IllegalArgumentException e8) {
            e8.printStackTrace();
        }
        this.f4799d.setHttpsRequestEnable(true);
        this.f4799d.setNetworkSwitchPolicy(true, true);
        this.f4799d.setCachePolicy(BDHttpDns.CachePolicy.POLICY_TOLERANT);
        this.f4799d.setPreResolveHosts(arrayList);
    }

    public String b(String str) {
        String str2;
        if (this.f4796a) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            if (host != null && !host.isEmpty()) {
                BDHttpDnsResult syncResolve = this.f4799d.syncResolve(host, true);
                ArrayList<String> ipv6List = syncResolve.getIpv6List();
                ArrayList<String> ipv4List = syncResolve.getIpv4List();
                if (ipv6List == null || ipv6List.isEmpty()) {
                    str2 = (ipv4List == null || ipv4List.isEmpty()) ? null : ipv4List.get(0);
                } else {
                    str2 = "[" + ipv6List.get(0) + "]";
                }
                return str2 != null ? str.replaceFirst(host, str2) : str;
            }
            return str;
        } catch (MalformedURLException e8) {
            e8.printStackTrace();
            return str;
        }
    }

    public void a(BDLocation bDLocation) {
        if (e.b().f4661w4 != 1 || bDLocation.getLongitude() == Double.MIN_VALUE || bDLocation.getLatitude() == Double.MIN_VALUE || System.currentTimeMillis() - this.f4797b <= e.b().f4667x4) {
            return;
        }
        a(bDLocation, this.f4798c);
    }

    private void a(BDLocation bDLocation, Context context) {
        double longitude;
        double latitude;
        String str;
        double[] dArr = new double[2];
        String coorType = bDLocation.getCoorType();
        if ("wgs84".equals(coorType)) {
            dArr[0] = bDLocation.getLongitude();
            dArr[1] = bDLocation.getLatitude();
        } else {
            double[] dArr2 = new double[2];
            if ("bd09ll".equals(coorType)) {
                longitude = bDLocation.getLongitude();
                latitude = bDLocation.getLatitude();
                str = BDLocation.BDLOCATION_BD09LL_TO_GCJ02;
            } else if ("bd09".equals(coorType)) {
                longitude = bDLocation.getLongitude();
                latitude = bDLocation.getLatitude();
                str = BDLocation.BDLOCATION_BD09_TO_GCJ02;
            } else {
                dArr2[0] = bDLocation.getLongitude();
                dArr2[1] = bDLocation.getLatitude();
                dArr = Jni.coorEncrypt(dArr2[0], dArr2[1], "gcj2wgs");
            }
            dArr2 = Jni.coorEncrypt(longitude, latitude, str);
            dArr = Jni.coorEncrypt(dArr2[0], dArr2[1], "gcj2wgs");
        }
        boolean a8 = com.baidu.location.e.f.a().a(dArr[0], dArr[1]);
        try {
            this.f4797b = System.currentTimeMillis();
            SharedPreferences a9 = u.a(context);
            if (a9 != null) {
                SharedPreferences.Editor edit = a9.edit();
                edit.putBoolean("IsDomestic", a8);
                edit.putLong("update_result_time", this.f4797b);
                edit.apply();
            }
        } catch (Exception unused) {
        }
    }

    public boolean a(String str) {
        try {
            String host = new URL(str).getHost();
            if (this.f4796a) {
                return false;
            }
            return com.baidu.location.e.e.f5202a.equals(host);
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
