package com.huawei.hms.framework.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.ironsource.x8;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class NetworkUtil {
    public static final int UNAVAILABLE = Integer.MAX_VALUE;
    public static volatile boolean isSupportIpv6Net = true;
    public static volatile int networkTypeByReceiver;

    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    private static String[] a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        LinkedList linkedList = new LinkedList();
        if (context != null && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                            Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                            while (it.hasNext()) {
                                linkedList.add(it.next().getHostAddress());
                            }
                        }
                    }
                }
            } catch (SecurityException e4) {
                Logger.i("NKUtil", "getActiveNetworkInfo failed, exception:" + e4.getClass().getSimpleName());
            } catch (RuntimeException e5) {
                Logger.i("NKUtil", "getActiveNetworkInfo failed, exception:" + e5.getClass().getSimpleName());
            }
        }
        return linkedList.isEmpty() ? new String[0] : (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    private static int b(Context context) {
        SignalStrength c4;
        List cellSignalStrengths;
        List cellSignalStrengths2;
        List cellSignalStrengths3;
        int dbm;
        List cellSignalStrengths4;
        List cellSignalStrengths5;
        int dbm2;
        if (Build.VERSION.SDK_INT <= 28 || (c4 = c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        int networkType = getNetworkType(context);
        try {
            if (networkType == 3) {
                cellSignalStrengths = c4.getCellSignalStrengths(CellSignalStrengthCdma.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthCdma) cellSignalStrengths.get(0)).getDbm();
                }
                cellSignalStrengths2 = c4.getCellSignalStrengths(g.a());
                if (cellSignalStrengths2.size() > 0) {
                    dbm = h.a(cellSignalStrengths2.get(0)).getDbm();
                    return dbm;
                }
                cellSignalStrengths3 = c4.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                if (cellSignalStrengths3.size() > 0) {
                    return ((CellSignalStrengthWcdma) cellSignalStrengths3.get(0)).getDbm();
                }
            } else if (networkType == 4) {
                cellSignalStrengths4 = c4.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths4.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths4.get(0)).getDbm();
                }
            } else if (networkType == 5) {
                cellSignalStrengths5 = c4.getCellSignalStrengths(a.a());
                if (cellSignalStrengths5.size() > 0) {
                    dbm2 = l.a(cellSignalStrengths5.get(0)).getDbm();
                    return dbm2;
                }
            }
        } catch (Throwable th) {
            Logger.i("NKUtil", "getMobileSingalStrength: throwable:" + th.getClass());
        }
        return Integer.MAX_VALUE;
    }

    private static SignalStrength c(Context context) {
        SignalStrength signalStrength;
        if (context == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        signalStrength = getTrafficCardTelephonyManager(context).getSignalStrength();
        return signalStrength;
    }

    private static int d(int i4) {
        int i5 = -1;
        if (i4 != -1) {
            i5 = 1;
            if (i4 != 1) {
                return (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 6 : 0;
            }
        }
        return i5;
    }

    public static int getCurrentNetworkType() {
        return networkTypeByReceiver;
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(a(context));
    }

    public static String getHost(String str) {
        return TextUtils.isEmpty(str) ? "" : X0.a.a(str);
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return Integer.MAX_VALUE;
            }
            final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, null);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    declaredMethod.setAccessible(true);
                    return null;
                }
            });
            return ((Integer) declaredMethod.invoke(signalStrength, null)).intValue();
        } catch (IllegalAccessException unused) {
            Logger.i("NKUtil", str + " : cannot access");
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            Logger.i("NKUtil", str + " : function not found");
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            Logger.i("NKUtil", str + " : InvocationTargetException");
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.i("NKUtil", str + " : throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        List cellSignalStrengths;
        int cqi;
        SignalStrength c4 = c(context);
        if (c4 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                return getInfoWithReflect(c4, "getLteCqi");
            }
            cellSignalStrengths = c4.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() <= 0) {
                return Integer.MAX_VALUE;
            }
            cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
            return cqi;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getLteCqi: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteRsrp(Context context) {
        List cellSignalStrengths;
        int rsrp;
        SignalStrength c4 = c(context);
        if (c4 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                return getInfoWithReflect(c4, "getLteRsrp");
            }
            cellSignalStrengths = c4.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() <= 0) {
                return Integer.MAX_VALUE;
            }
            rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
            return rsrp;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getLteRsrp: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteRsrq(Context context) {
        List cellSignalStrengths;
        int rsrq;
        SignalStrength c4 = c(context);
        if (c4 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                return getInfoWithReflect(c4, "getLteRsrq");
            }
            cellSignalStrengths = c4.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() <= 0) {
                return Integer.MAX_VALUE;
            }
            rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
            return rsrq;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getLteRsrq: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteRssi(Context context) {
        List cellSignalStrengths;
        int rssi;
        SignalStrength c4 = c(context);
        if (c4 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                return Integer.MAX_VALUE;
            }
            cellSignalStrengths = c4.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() <= 0) {
                return Integer.MAX_VALUE;
            }
            rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
            return rssi;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getLteRssi: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteRssnr(Context context) {
        List cellSignalStrengths;
        int rssnr;
        SignalStrength c4 = c(context);
        if (c4 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                return getInfoWithReflect(c4, "getLteRssnr");
            }
            cellSignalStrengths = c4.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() <= 0) {
                return Integer.MAX_VALUE;
            }
            rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
            return rssnr;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getLteRssnr: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        List cellSignalStrengths;
        int rsrp;
        int rsrq;
        int rssnr;
        int cqi;
        int rssi;
        HashMap hashMap = new HashMap();
        SignalStrength c4 = c(context);
        if (c4 != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(c4, "getDbm")));
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(c4, "getLteRsrp")));
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(c4, "getLteRsrq")));
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(c4, "getLteRssnr")));
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(c4, "getLteCqi")));
                    return hashMap;
                }
                cellSignalStrengths = c4.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(rsrp));
                    rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(rsrq));
                    rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(rssnr));
                    cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(cqi));
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    hashMap.put(SignalType.LTE_RSSI, Integer.valueOf(rssi));
                    return hashMap;
                }
            } catch (Throwable th) {
                Logger.i("NKUtil", "getLteRssi: throwable:" + th.getClass());
            }
        }
        return hashMap;
    }

    public static String getMNC(Context context) {
        if (context == null || !isSimReady(context)) {
            return "unknown";
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            Logger.e("NKUtil", "getSubscriptionOperatorType: other error!");
            return "unknown";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return ("46001".equals(networkOperator) || "46006".equals(networkOperator) || "46009".equals(networkOperator)) ? "China_Unicom" : ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46004".equals(networkOperator) || "46007".equals(networkOperator)) ? "China_Mobile" : ("46003".equals(networkOperator) || "46005".equals(networkOperator) || "46011".equals(networkOperator)) ? "China_Telecom" : "other";
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength c4 = c(context);
        if (c4 == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return Build.VERSION.SDK_INT > 28 ? b(context) : getInfoWithReflect(c4, "getDbm");
        } catch (Throwable th) {
            Logger.i("NKUtil", "getDbm: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            Logger.v("NKUtil", "phoneId " + default4GSlotId);
            boolean isNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            Logger.v("NKUtil", "isNsa " + isNsaState);
            return isNsaState ? "5G_NSA" : "5G_SA";
        } catch (Throwable unused) {
            Logger.v("NKUtil", "isNsaState error");
            return null;
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (RuntimeException e4) {
                Logger.i("NKUtil", "getActiveNetworkInfo failed, exception:" + e4.getClass().getSimpleName() + e4.getMessage());
            }
        }
        return null;
    }

    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            return activeNetworkInfo.getDetailedState();
                        }
                        Logger.i("NKUtil", "getNetworkStatus networkIsConnected netInfo is null!");
                        return detailedState;
                    }
                } catch (RuntimeException e4) {
                    Logger.i("NKUtil", "getNetworkStatus exception" + e4.getClass().getSimpleName() + e4.getMessage());
                }
            } else {
                Logger.i("NKUtil", "getNetworkStatus ConnectivityManager is null!");
            }
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength c4;
        List cellSignalStrengths;
        int csiRsrp;
        try {
            if (Build.VERSION.SDK_INT > 28 && (c4 = c(context)) != null) {
                cellSignalStrengths = c4.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() <= 0) {
                    return Integer.MAX_VALUE;
                }
                csiRsrp = l.a(cellSignalStrengths.get(0)).getCsiRsrp();
                return csiRsrp;
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getNrCsiRsrp: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength c4;
        List cellSignalStrengths;
        int csiRsrq;
        try {
            if (Build.VERSION.SDK_INT > 28 && (c4 = c(context)) != null) {
                cellSignalStrengths = c4.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() <= 0) {
                    return Integer.MAX_VALUE;
                }
                csiRsrq = l.a(cellSignalStrengths.get(0)).getCsiRsrq();
                return csiRsrq;
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getNrCsiRsrq: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength c4;
        List cellSignalStrengths;
        int csiSinr;
        try {
            if (Build.VERSION.SDK_INT > 28 && (c4 = c(context)) != null) {
                cellSignalStrengths = c4.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() <= 0) {
                    return Integer.MAX_VALUE;
                }
                csiSinr = l.a(cellSignalStrengths.get(0)).getCsiSinr();
                return csiSinr;
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getNrCsiSinr: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        List cellSignalStrengths;
        int dbm;
        int csiRsrp;
        int csiRsrq;
        int csiSinr;
        int ssRsrp;
        int ssRsrq;
        int ssSinr;
        HashMap hashMap = new HashMap();
        SignalStrength c4 = c(context);
        if (c4 != null) {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    cellSignalStrengths = c4.getCellSignalStrengths(a.a());
                    if (cellSignalStrengths.size() > 0) {
                        dbm = l.a(cellSignalStrengths.get(0)).getDbm();
                        hashMap.put(SignalType.NR_DBM, Integer.valueOf(dbm));
                        csiRsrp = l.a(cellSignalStrengths.get(0)).getCsiRsrp();
                        hashMap.put(SignalType.NR_CSIRSRP, Integer.valueOf(csiRsrp));
                        csiRsrq = l.a(cellSignalStrengths.get(0)).getCsiRsrq();
                        hashMap.put(SignalType.NR_CSIRSRQ, Integer.valueOf(csiRsrq));
                        csiSinr = l.a(cellSignalStrengths.get(0)).getCsiSinr();
                        hashMap.put(SignalType.NR_CSISINR, Integer.valueOf(csiSinr));
                        ssRsrp = l.a(cellSignalStrengths.get(0)).getSsRsrp();
                        hashMap.put(SignalType.NR_SSRSRP, Integer.valueOf(ssRsrp));
                        ssRsrq = l.a(cellSignalStrengths.get(0)).getSsRsrq();
                        hashMap.put(SignalType.NR_SSRSRQ, Integer.valueOf(ssRsrq));
                        ssSinr = l.a(cellSignalStrengths.get(0)).getSsSinr();
                        hashMap.put(SignalType.NR_SSSINR, Integer.valueOf(ssSinr));
                        return hashMap;
                    }
                }
            } catch (Throwable th) {
                Logger.i("NKUtil", "getLteRssi: throwable:" + th.getClass());
            }
        }
        return hashMap;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength c4;
        List cellSignalStrengths;
        int ssRsrp;
        try {
            if (Build.VERSION.SDK_INT > 28 && (c4 = c(context)) != null) {
                cellSignalStrengths = c4.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() <= 0) {
                    return Integer.MAX_VALUE;
                }
                ssRsrp = l.a(cellSignalStrengths.get(0)).getSsRsrp();
                return ssRsrp;
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getNrSsRsrp: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength c4;
        List cellSignalStrengths;
        int ssRsrq;
        try {
            if (Build.VERSION.SDK_INT > 28 && (c4 = c(context)) != null) {
                cellSignalStrengths = c4.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() <= 0) {
                    return Integer.MAX_VALUE;
                }
                ssRsrq = l.a(cellSignalStrengths.get(0)).getSsRsrq();
                return ssRsrq;
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getNrSsRsrq: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength c4;
        List cellSignalStrengths;
        int ssSinr;
        try {
            if (Build.VERSION.SDK_INT > 28 && (c4 = c(context)) != null) {
                cellSignalStrengths = c4.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() <= 0) {
                    return Integer.MAX_VALUE;
                }
                ssSinr = l.a(cellSignalStrengths.get(0)).getSsSinr();
                return ssSinr;
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.i("NKUtil", "getNrSsSinr: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getPrimaryNetworkType(Context context) {
        return d(getNetworkType(getNetworkInfo(context), context));
    }

    public static TelephonyManager getTrafficCardTelephonyManager(Context context) {
        if (context == null) {
            return null;
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            return ((TelephonyManager) systemService).createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId());
        }
        return null;
    }

    public static String getWifiGatewayIp(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), x8.f20294b);
            if (systemService instanceof WifiManager) {
                try {
                    int i4 = ((WifiManager) systemService).getDhcpInfo().gateway;
                    return InetAddress.getByAddress(new byte[]{(byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)}).getHostAddress();
                } catch (RuntimeException | UnknownHostException e4) {
                    Logger.i("NKUtil", "getWifiGatewayIp error!" + e4.getClass().getSimpleName() + e4.getMessage());
                }
            }
        }
        return " ";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r4 = r4.getTransportInfo();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getWifiRssi(Context context) {
        TransportInfo transportInfo;
        int i4 = -127;
        if (context != null && Build.VERSION.SDK_INT >= 31) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(1) && transportInfo != null && (transportInfo instanceof WifiInfo)) {
                        i4 = ((WifiInfo) transportInfo).getRssi();
                    }
                }
                return i4;
            } catch (RuntimeException e4) {
                Logger.i("NKUtil", "getWifiRssiLevel did not has permission!" + e4.getClass().getSimpleName() + e4.getMessage());
            }
        }
        return i4;
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo != null && networkInfo.isConnected()) || !networkInfo2.isConnected()) {
            return false;
        }
        Logger.v("NKUtil", "Find network state changed to connected");
        return true;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo2.isConnected() || getPrimaryNetworkType(networkInfo) == getPrimaryNetworkType(networkInfo2)) {
            return false;
        }
        Logger.v("NKUtil", "Find activity network changed");
        return true;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean isSimReady(Context context) {
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    public static boolean isSupportIpv6Net(Context context, int i4) {
        boolean z4 = i4 > 1;
        if (context == null) {
            return z4;
        }
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Logger.v("NKUtil", "has no network state permission");
            return z4;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Logger.e("NKUtil", "mConnectivityManager is null");
            return z4;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            Logger.e("NKUtil", "network is null");
            return z4;
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            Logger.e("NKUtil", "ipInfo is null");
            return z4;
        }
        List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
        for (int i5 = 0; i5 < linkAddresses.size(); i5++) {
            InetAddress address = linkAddresses.get(i5).getAddress();
            if ((address instanceof Inet6Address) && !address.isLinkLocalAddress() && !address.isLoopbackAddress()) {
                Logger.v("NKUtil", "has ipv6 interface");
                return true;
            }
        }
        Logger.v("NKUtil", "has not ipv6 interface");
        return false;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager = (UserManager) ContextCompat.getSystemService(context, "user");
        if (userManager == null) {
            return true;
        }
        try {
            return userManager.isUserUnlocked();
        } catch (RuntimeException e4) {
            Logger.e("NKUtil", "dealType rethrowFromSystemServer:", e4);
            return true;
        }
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        Logger.v("NKUtil", "networkType " + networkType);
        if (networkType == 4) {
            if (TextUtils.equals("5G_NSA", getNetWorkNSAorSA())) {
                return 7;
            }
            return networkType;
        }
        if (networkType == 5 && TextUtils.equals("5G_SA", getNetWorkNSAorSA())) {
            return 8;
        }
        return networkType;
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    public static int readDataSaverMode(Context context) {
        if (context != null && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        return connectivityManager.getRestrictBackgroundStatus();
                    }
                    Logger.v("NKUtil", "ConnectType is not Mobile Network!");
                    return 0;
                } catch (RuntimeException e4) {
                    Logger.e("NKUtil", "SystemServer error:", e4);
                }
            }
        }
        return 0;
    }

    public static void updateCurrentNetworkType() {
        networkTypeByReceiver = netWork(ContextHolder.getResourceContext());
        if (InitReport.isHasConnectNet()) {
            isSupportIpv6Net = isSupportIpv6Net(ContextHolder.getResourceContext(), networkTypeByReceiver);
            Logger.i("NKUtil", "update currentNetworkType: " + networkTypeByReceiver + ", isSupportIpv6Net:" + isSupportIpv6Net);
        }
    }

    public static boolean isForeground() {
        return ActivityUtil.getInstance().isForeground();
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i4;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        int i5 = 1;
        if (1 != type && 13 != type) {
            i5 = 0;
            if (type == 0) {
                int subtype = networkInfo.getSubtype();
                Logger.v("NKUtil", "getHwNetworkType return is: " + subtype);
                if (subtype == 0) {
                    subtype = networkInfo.getSubtype();
                }
                if (subtype != 20) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            i4 = 2;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            i4 = 3;
                            break;
                        case 13:
                            i4 = 4;
                            break;
                        default:
                            i4 = 0;
                            break;
                    }
                } else {
                    i4 = 5;
                }
                if (i4 != 0) {
                    return i4;
                }
                if (subtype != 16) {
                    return subtype != 17 ? 0 : 3;
                }
                return 2;
            }
        }
        return i5;
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        return d(getNetworkType(networkInfo));
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }

    public static boolean isSupportIpv6Net() {
        return isSupportIpv6Net;
    }
}
