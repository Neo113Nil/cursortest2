package com.blankj.utilcode.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.blankj.utilcode.util.z0;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class NetworkUtils {
    private static final long SCAN_PERIOD_MILLIS = 3000;
    private static final Set<z0.b> SCAN_RESULT_CONSUMERS = new CopyOnWriteArraySet();
    private static k sPreWifiScanResults;
    private static Timer sScanWifiTimer;

    public static final class NetworkChangedReceiver extends BroadcastReceiver {
        private Set<j> mListeners = new HashSet();
        private NetworkType mType;

        class a implements Runnable {
            final /* synthetic */ j val$listener;

            a(j jVar) {
            }

            @Override // java.lang.Runnable
            @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
            public void run() {
                int size = NetworkChangedReceiver.this.mListeners.size();
                NetworkChangedReceiver.this.mListeners.add(null);
                if (size == 0 && NetworkChangedReceiver.this.mListeners.size() == 1) {
                    NetworkChangedReceiver.this.mType = NetworkUtils.getNetworkType();
                    z0.getApp().registerReceiver(NetworkChangedReceiver.getInstance(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        }

        class b implements Runnable {
            final /* synthetic */ j val$listener;

            b(j jVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                int size = NetworkChangedReceiver.this.mListeners.size();
                NetworkChangedReceiver.this.mListeners.remove(null);
                if (size == 1 && NetworkChangedReceiver.this.mListeners.size() == 0) {
                    z0.getApp().unregisterReceiver(NetworkChangedReceiver.getInstance());
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
            public void run() {
                NetworkType networkType = NetworkUtils.getNetworkType();
                if (NetworkChangedReceiver.this.mType == networkType) {
                    return;
                }
                NetworkChangedReceiver.this.mType = networkType;
                if (networkType == NetworkType.NETWORK_NO) {
                    Iterator it = NetworkChangedReceiver.this.mListeners.iterator();
                    if (it.hasNext()) {
                        cn.hutool.core.convert.impl.s.a(it.next());
                        throw null;
                    }
                    return;
                }
                Iterator it2 = NetworkChangedReceiver.this.mListeners.iterator();
                if (it2.hasNext()) {
                    cn.hutool.core.convert.impl.s.a(it2.next());
                    throw null;
                }
            }
        }

        private static class d {
            private static final NetworkChangedReceiver INSTANCE = new NetworkChangedReceiver();

            private d() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static NetworkChangedReceiver getInstance() {
            return d.INSTANCE;
        }

        boolean isRegistered(j jVar) {
            if (jVar == null) {
                return false;
            }
            return this.mListeners.contains(jVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                c1.runOnUiThreadDelayed(new c(), 1000L);
            }
        }

        @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
        void registerListener(j jVar) {
            if (jVar == null) {
                return;
            }
            c1.runOnUiThread(new a(jVar));
        }

        void unregisterListener(j jVar) {
            if (jVar == null) {
                return;
            }
            c1.runOnUiThread(new b(jVar));
        }
    }

    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    static class a extends z0.d {
        a(z0.b bVar) {
            super(bVar);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        @RequiresPermission("android.permission.INTERNET")
        public Boolean doInBackground() {
            return Boolean.valueOf(NetworkUtils.isAvailable());
        }
    }

    static class b extends z0.d {
        final /* synthetic */ String val$ip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z0.b bVar, String str) {
            super(bVar);
            this.val$ip = str;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        @RequiresPermission("android.permission.INTERNET")
        public Boolean doInBackground() {
            return Boolean.valueOf(NetworkUtils.isAvailableByPing(this.val$ip));
        }
    }

    static class c extends z0.d {
        final /* synthetic */ String val$domain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z0.b bVar, String str) {
            super(bVar);
            this.val$domain = str;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        @RequiresPermission("android.permission.INTERNET")
        public Boolean doInBackground() {
            return Boolean.valueOf(NetworkUtils.isAvailableByDns(this.val$domain));
        }
    }

    static class d extends z0.d {
        d(z0.b bVar) {
            super(bVar);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"})
        public Boolean doInBackground() {
            return Boolean.valueOf(NetworkUtils.isWifiAvailable());
        }
    }

    static class e extends z0.d {
        final /* synthetic */ boolean val$useIPv4;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z0.b bVar, boolean z7) {
            super(bVar);
            this.val$useIPv4 = z7;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        @RequiresPermission("android.permission.INTERNET")
        public String doInBackground() {
            return NetworkUtils.getIPAddress(this.val$useIPv4);
        }
    }

    static class f extends z0.d {
        final /* synthetic */ String val$domain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z0.b bVar, String str) {
            super(bVar);
            this.val$domain = str;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        @RequiresPermission("android.permission.INTERNET")
        public String doInBackground() {
            return NetworkUtils.getDomainAddress(this.val$domain);
        }
    }

    static class g implements Runnable {
        final /* synthetic */ z0.b val$consumer;

        g(z0.b bVar) {
            this.val$consumer = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkUtils.SCAN_RESULT_CONSUMERS.isEmpty()) {
                NetworkUtils.SCAN_RESULT_CONSUMERS.add(this.val$consumer);
                NetworkUtils.startScanWifi();
            } else {
                this.val$consumer.accept(NetworkUtils.sPreWifiScanResults);
                NetworkUtils.SCAN_RESULT_CONSUMERS.add(this.val$consumer);
            }
        }
    }

    static class h extends TimerTask {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = NetworkUtils.SCAN_RESULT_CONSUMERS.iterator();
                while (it.hasNext()) {
                    ((z0.b) it.next()).accept(NetworkUtils.sPreWifiScanResults);
                }
            }
        }

        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
        public void run() {
            NetworkUtils.startScanWifiIfEnabled();
            k wifiScanResult = NetworkUtils.getWifiScanResult();
            if (NetworkUtils.isSameScanResults(NetworkUtils.sPreWifiScanResults.allResults, wifiScanResult.allResults)) {
                return;
            }
            k unused = NetworkUtils.sPreWifiScanResults = wifiScanResult;
            c1.runOnUiThread(new a());
        }
    }

    static class i implements Runnable {
        final /* synthetic */ z0.b val$consumer;

        i(z0.b bVar) {
            this.val$consumer = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkUtils.SCAN_RESULT_CONSUMERS.remove(this.val$consumer);
            if (NetworkUtils.SCAN_RESULT_CONSUMERS.isEmpty()) {
                NetworkUtils.stopScanWifi();
            }
        }
    }

    public interface j {
    }

    public static final class k {
        private List<ScanResult> allResults = new ArrayList();
        private List<ScanResult> filterResults = new ArrayList();

        private static List<ScanResult> filterScanResult(List<ScanResult> list) {
            ScanResult scanResult;
            if (list == null || list.isEmpty()) {
                return new ArrayList();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
            for (ScanResult scanResult2 : list) {
                if (!TextUtils.isEmpty(scanResult2.SSID) && ((scanResult = (ScanResult) linkedHashMap.get(scanResult2.SSID)) == null || scanResult.level < scanResult2.level)) {
                    linkedHashMap.put(scanResult2.SSID, scanResult2);
                }
            }
            return new ArrayList(linkedHashMap.values());
        }

        public List<ScanResult> getAllResults() {
            return this.allResults;
        }

        public List<ScanResult> getFilterResults() {
            return this.filterResults;
        }

        public void setAllResults(List<ScanResult> list) {
            this.allResults = list;
            this.filterResults = filterScanResult(list);
        }
    }

    private NetworkUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
    public static void addOnWifiChangedConsumer(z0.b bVar) {
        if (bVar == null) {
            return;
        }
        c1.runOnUiThread(new g(bVar));
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    private static NetworkInfo getActiveNetworkInfo() {
        ConnectivityManager connectivityManager = (ConnectivityManager) z0.getApp().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static String getBroadcastIpAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            new LinkedList();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp() && !nextElement.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                    int size = interfaceAddresses.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        InetAddress broadcast = interfaceAddresses.get(i8).getBroadcast();
                        if (broadcast != null) {
                            return broadcast.getHostAddress();
                        }
                    }
                }
            }
            return "";
        } catch (SocketException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static String getDomainAddress(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static z0.d getDomainAddressAsync(String str, @NonNull z0.b bVar) {
        return c1.doAsync(new f(bVar, str));
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static String getGatewayByWifi() {
        WifiManager wifiManager = (WifiManager) z0.getApp().getSystemService("wifi");
        return wifiManager == null ? "" : Formatter.formatIpAddress(wifiManager.getDhcpInfo().gateway);
    }

    @RequiresPermission("android.permission.INTERNET")
    public static String getIPAddress(boolean z7) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            LinkedList linkedList = new LinkedList();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp() && !nextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        linkedList.addFirst(inetAddresses.nextElement());
                    }
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                InetAddress inetAddress = (InetAddress) it.next();
                if (!inetAddress.isLoopbackAddress()) {
                    String hostAddress = inetAddress.getHostAddress();
                    boolean z8 = hostAddress.indexOf(58) < 0;
                    if (z7) {
                        if (z8) {
                            return hostAddress;
                        }
                    } else if (!z8) {
                        int indexOf = hostAddress.indexOf(37);
                        return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                    }
                }
            }
            return "";
        } catch (SocketException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static z0.d getIPAddressAsync(boolean z7, @NonNull z0.b bVar) {
        return c1.doAsync(new e(bVar, z7));
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static String getIpAddressByWifi() {
        WifiManager wifiManager = (WifiManager) z0.getApp().getSystemService("wifi");
        return wifiManager == null ? "" : Formatter.formatIpAddress(wifiManager.getDhcpInfo().ipAddress);
    }

    public static boolean getMobileDataEnabled() {
        TelephonyManager telephonyManager;
        boolean isDataEnabled;
        try {
            telephonyManager = (TelephonyManager) z0.getApp().getSystemService("phone");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (telephonyManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            isDataEnabled = telephonyManager.isDataEnabled();
            return isDataEnabled;
        }
        Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getDataEnabled", new Class[0]);
        if (declaredMethod != null) {
            return ((Boolean) declaredMethod.invoke(telephonyManager, new Object[0])).booleanValue();
        }
        return false;
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static String getNetMaskByWifi() {
        WifiManager wifiManager = (WifiManager) z0.getApp().getSystemService("wifi");
        return wifiManager == null ? "" : Formatter.formatIpAddress(wifiManager.getDhcpInfo().netmask);
    }

    public static String getNetworkOperatorName() {
        TelephonyManager telephonyManager = (TelephonyManager) z0.getApp().getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperatorName();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkType getNetworkType() {
        if (isEthernet()) {
            return NetworkType.NETWORK_ETHERNET;
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return NetworkType.NETWORK_NO;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (activeNetworkInfo.getType() != 0) {
            return NetworkType.NETWORK_UNKNOWN;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.NETWORK_3G;
            case 13:
            case 18:
                return NetworkType.NETWORK_4G;
            case 19:
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NetworkType.NETWORK_3G : NetworkType.NETWORK_UNKNOWN;
            case 20:
                return NetworkType.NETWORK_5G;
        }
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static String getSSID() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) z0.getApp().getApplicationContext().getSystemService("wifi");
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return "";
        }
        String ssid = connectionInfo.getSSID();
        return TextUtils.isEmpty(ssid) ? "" : (ssid.length() > 2 && ssid.charAt(0) == '\"' && ssid.charAt(ssid.length() - 1) == '\"') ? ssid.substring(1, ssid.length() - 1) : ssid;
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static String getServerAddressByWifi() {
        WifiManager wifiManager = (WifiManager) z0.getApp().getSystemService("wifi");
        return wifiManager == null ? "" : Formatter.formatIpAddress(wifiManager.getDhcpInfo().serverAddress);
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    public static boolean getWifiEnabled() {
        WifiManager wifiManager = (WifiManager) z0.getApp().getSystemService("wifi");
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.isWifiEnabled();
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
    public static k getWifiScanResult() {
        k kVar = new k();
        if (!getWifiEnabled()) {
            return kVar;
        }
        List<ScanResult> scanResults = ((WifiManager) z0.getApp().getSystemService("wifi")).getScanResults();
        if (scanResults != null) {
            kVar.setAllResults(scanResults);
        }
        return kVar;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean is4G() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getSubtype() == 13;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean is5G() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getSubtype() == 20;
    }

    @RequiresPermission("android.permission.INTERNET")
    public static boolean isAvailable() {
        return isAvailableByDns() || isAvailableByPing(null);
    }

    @RequiresPermission("android.permission.INTERNET")
    public static z0.d isAvailableAsync(@NonNull z0.b bVar) {
        return c1.doAsync(new a(bVar));
    }

    @RequiresPermission("android.permission.INTERNET")
    public static boolean isAvailableByDns() {
        return isAvailableByDns("");
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void isAvailableByDnsAsync(z0.b bVar) {
        isAvailableByDnsAsync("", bVar);
    }

    @RequiresPermission("android.permission.INTERNET")
    public static boolean isAvailableByPing() {
        return isAvailableByPing("");
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void isAvailableByPingAsync(z0.b bVar) {
        isAvailableByPingAsync("", bVar);
    }

    public static boolean isBehindProxy() {
        return (System.getProperty("http.proxyHost") == null || System.getProperty("http.proxyPort") == null) ? false : true;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isConnected() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    private static boolean isEthernet() {
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) z0.getApp().getSystemService("connectivity");
        if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(9)) == null || (state = networkInfo.getState()) == null) {
            return false;
        }
        return state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isMobileData() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getType() == 0;
    }

    public static boolean isRegisteredNetworkStatusChangedListener(j jVar) {
        return NetworkChangedReceiver.getInstance().isRegistered(jVar);
    }

    private static boolean isSameScanResultContent(ScanResult scanResult, ScanResult scanResult2) {
        return scanResult != null && scanResult2 != null && c1.equals(scanResult.BSSID, scanResult2.BSSID) && c1.equals(scanResult.SSID, scanResult2.SSID) && c1.equals(scanResult.capabilities, scanResult2.capabilities) && scanResult.level == scanResult2.level;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSameScanResults(List<ScanResult> list, List<ScanResult> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!isSameScanResultContent(list.get(i8), list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUsingVPN() {
        ConnectivityManager connectivityManager = (ConnectivityManager) z0.getApp().getSystemService("connectivity");
        return Build.VERSION.SDK_INT >= 28 ? connectivityManager.getNetworkInfo(17).isConnectedOrConnecting() : connectivityManager.getNetworkInfo(4).isConnectedOrConnecting();
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"})
    public static boolean isWifiAvailable() {
        return getWifiEnabled() && isAvailable();
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"})
    public static z0.d isWifiAvailableAsync(@NonNull z0.b bVar) {
        return c1.doAsync(new d(bVar));
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isWifiConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) z0.getApp().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public static void openWirelessSettings() {
        z0.getApp().startActivity(new Intent("android.settings.WIRELESS_SETTINGS").setFlags(268435456));
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static void registerNetworkStatusChangedListener(j jVar) {
        NetworkChangedReceiver.getInstance().registerListener(jVar);
    }

    public static void removeOnWifiChangedConsumer(z0.b bVar) {
        if (bVar == null) {
            return;
        }
        c1.runOnUiThread(new i(bVar));
    }

    @RequiresPermission("android.permission.CHANGE_WIFI_STATE")
    public static void setWifiEnabled(boolean z7) {
        WifiManager wifiManager = (WifiManager) z0.getApp().getSystemService("wifi");
        if (wifiManager == null || z7 == wifiManager.isWifiEnabled()) {
            return;
        }
        wifiManager.setWifiEnabled(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startScanWifi() {
        sPreWifiScanResults = new k();
        Timer timer = new Timer();
        sScanWifiTimer = timer;
        timer.schedule(new h(), 0L, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"})
    public static void startScanWifiIfEnabled() {
        if (getWifiEnabled()) {
            ((WifiManager) z0.getApp().getSystemService("wifi")).startScan();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stopScanWifi() {
        Timer timer = sScanWifiTimer;
        if (timer != null) {
            timer.cancel();
            sScanWifiTimer = null;
        }
    }

    public static void unregisterNetworkStatusChangedListener(j jVar) {
        NetworkChangedReceiver.getInstance().unregisterListener(jVar);
    }

    @RequiresPermission("android.permission.INTERNET")
    public static boolean isAvailableByDns(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "www.baidu.com";
        }
        try {
            return InetAddress.getByName(str) != null;
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static z0.d isAvailableByDnsAsync(String str, @NonNull z0.b bVar) {
        return c1.doAsync(new c(bVar, str));
    }

    @RequiresPermission("android.permission.INTERNET")
    public static boolean isAvailableByPing(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "223.5.5.5";
        }
        return t0.execCmd(String.format("ping -c 1 %s", str), false).result == 0;
    }

    @RequiresPermission("android.permission.INTERNET")
    public static z0.d isAvailableByPingAsync(String str, @NonNull z0.b bVar) {
        return c1.doAsync(new b(bVar, str));
    }
}
