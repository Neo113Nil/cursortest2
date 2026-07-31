package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.ironsource.x8;
import com.my.tracker.obfuscated.C1622d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1627e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C1622d0.k f21267a = new C1622d0.k(null, Collections.EMPTY_LIST);

    /* renamed from: b, reason: collision with root package name */
    public static int f21268b = 5;

    private List a(Context context) {
        List<CellInfo> allCellInfo;
        C1622d0.h a4;
        C1622d0.b a5;
        if (Build.VERSION.SDK_INT >= 29 ? AbstractC1664n1.a("android.permission.ACCESS_FINE_LOCATION", context) : AbstractC1664n1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && (allCellInfo = telephonyManager.getAllCellInfo()) != null && !allCellInfo.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo.isRegistered()) {
                            if (cellInfo instanceof CellInfoCdma) {
                                a5 = a((CellInfoCdma) cellInfo);
                            } else if (cellInfo instanceof CellInfoGsm) {
                                a5 = a((CellInfoGsm) cellInfo);
                            } else if (cellInfo instanceof CellInfoLte) {
                                a5 = a((CellInfoLte) cellInfo);
                            } else if (cellInfo instanceof CellInfoWcdma) {
                                a5 = a((CellInfoWcdma) cellInfo);
                            } else {
                                int i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 29 && N0.a(cellInfo)) {
                                    a5 = a(O0.a(cellInfo));
                                } else if (i4 >= 29 && P0.a(cellInfo)) {
                                    a5 = a(Q0.a(cellInfo));
                                }
                            }
                            arrayList.add(a5);
                        }
                    }
                    if (arrayList.isEmpty() && (a4 = a(telephonyManager)) != null) {
                        arrayList.add(a4);
                    }
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            } catch (Throwable th) {
                AbstractC1708y2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
            }
        } else {
            AbstractC1708y2.a("EnvironmentParamsDataProvider: can't access information");
        }
        return Collections.EMPTY_LIST;
    }

    private C1622d0.k c(Context context) {
        C1622d0.j jVar;
        if (!AbstractC1664n1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            return f21267a;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(x8.f20294b);
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    String ssid = connectionInfo.getSSID();
                    String bssid = connectionInfo.getBSSID();
                    jVar = new C1622d0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                } else {
                    jVar = null;
                }
                if (!AbstractC1664n1.a("android.permission.ACCESS_FINE_LOCATION", context) && !AbstractC1664n1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                    return new C1622d0.k(jVar, Collections.EMPTY_LIST);
                }
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null && !scanResults.isEmpty()) {
                    Collections.sort(scanResults, new Comparator() { // from class: com.my.tracker.obfuscated.B1
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int a4;
                            a4 = C1627e0.a((ScanResult) obj, (ScanResult) obj2);
                            return a4;
                        }
                    });
                    int min = Math.min(scanResults.size(), f21268b);
                    ArrayList arrayList = new ArrayList(min);
                    for (int i4 = 0; i4 < min; i4++) {
                        ScanResult scanResult = scanResults.get(i4);
                        String str = scanResult.SSID;
                        String str2 = scanResult.BSSID;
                        if (str == null) {
                            str = "<null>";
                        }
                        if (str2 == null) {
                            str2 = "<null>";
                        }
                        arrayList.add(new C1622d0.a(str, str2, scanResult.level));
                    }
                    return new C1622d0.k(jVar, arrayList);
                }
                return new C1622d0.k(jVar, Collections.EMPTY_LIST);
            }
            return f21267a;
        } catch (Throwable th) {
            AbstractC1708y2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            return f21267a;
        }
    }

    private C1622d0.c a(CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        int networkId = cellIdentity.getNetworkId();
        int systemId = cellIdentity.getSystemId();
        int basestationId = cellIdentity.getBasestationId();
        int latitude = cellIdentity.getLatitude();
        int longitude = cellIdentity.getLongitude();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new C1622d0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    public C1622d0 b(Context context) {
        return new C1622d0(a(context), c(context));
    }

    private C1622d0.d a(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i4 = Build.VERSION.SDK_INT;
        return new C1622d0.d(i4 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i4 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getArfcn(), cellIdentity.getBsic(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i4 >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private C1622d0.e a(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i4 = Build.VERSION.SDK_INT;
        return new C1622d0.e(i4 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i4 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), cellIdentity.getEarfcn(), cellIdentity.getPci(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i4 >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private C1622d0.f a(CellInfoNr cellInfoNr) {
        CellIdentity cellIdentity;
        CellSignalStrength cellSignalStrength;
        String mccString;
        String mncString;
        long nci;
        int tac;
        int nrarfcn;
        int pci;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoNr.getCellIdentity();
        CellIdentityNr a4 = U0.a(cellIdentity);
        cellSignalStrength = cellInfoNr.getCellSignalStrength();
        CellSignalStrengthNr a5 = com.huawei.hms.framework.common.l.a(cellSignalStrength);
        mccString = a4.getMccString();
        mncString = a4.getMncString();
        nci = a4.getNci();
        tac = a4.getTac();
        nrarfcn = a4.getNrarfcn();
        pci = a4.getPci();
        level = a5.getLevel();
        dbm = a5.getDbm();
        asuLevel = a5.getAsuLevel();
        return new C1622d0.f(mccString, mncString, nci, tac, nrarfcn, pci, level, dbm, asuLevel);
    }

    private C1622d0.g a(CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity;
        CellSignalStrengthTdscdma cellSignalStrength;
        String mccString;
        String mncString;
        int cid;
        int lac;
        int uarfcn;
        int cpid;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoTdscdma.getCellIdentity();
        cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        mccString = cellIdentity.getMccString();
        mncString = cellIdentity.getMncString();
        cid = cellIdentity.getCid();
        lac = cellIdentity.getLac();
        uarfcn = cellIdentity.getUarfcn();
        cpid = cellIdentity.getCpid();
        level = cellSignalStrength.getLevel();
        dbm = cellSignalStrength.getDbm();
        asuLevel = cellSignalStrength.getAsuLevel();
        return new C1622d0.g(mccString, mncString, cid, lac, uarfcn, cpid, level, dbm, asuLevel);
    }

    private C1622d0.h a(TelephonyManager telephonyManager) {
        String str;
        String str2;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        String str3 = null;
        if (!(cellLocation instanceof GsmCellLocation)) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator)) {
            str = null;
        } else {
            try {
                str2 = networkOperator.substring(0, 3);
            } catch (Throwable unused) {
                str2 = null;
            }
            try {
                str3 = networkOperator.substring(3);
            } catch (Throwable unused2) {
                AbstractC1708y2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                str = str3;
                str3 = str2;
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                return new C1622d0.h(str3, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());
            }
            str = str3;
            str3 = str2;
        }
        GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
        return new C1622d0.h(str3, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac());
    }

    private C1622d0.i a(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i4 = Build.VERSION.SDK_INT;
        return new C1622d0.i(i4 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i4 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getPsc(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }
}
