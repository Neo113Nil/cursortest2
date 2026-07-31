package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
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
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import com.onesignal.location.internal.common.LocationConstants;
import com.startapp.sdk.adsbase.remoteconfig.LocationMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class vg extends ld {
    public final pa j;
    public final p5 k;
    public final q5 l;

    public vg(Context context, pa paVar, pa paVar2, pa paVar3, p5 p5Var, q5 q5Var) {
        super(context, paVar, paVar2, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.j = paVar3;
        this.k = p5Var;
        this.l = q5Var;
    }

    @Override // com.startapp.sdk.internal.ld
    public final Object a(String str) {
        if (str != null) {
            try {
                return new sg(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #0 {all -> 0x00d3, blocks: (B:22:0x00c7, B:29:0x00bb, B:31:0x00c1, B:25:0x00b2), top: B:18:0x00b0, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        tg tgVar;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f165a.getSystemService("phone");
            sg sgVar = new sg();
            sgVar.a(7, Integer.valueOf(telephonyManager.getSimState()));
            sgVar.a(8, telephonyManager.getSimOperator());
            sgVar.a(9, telephonyManager.getSimOperatorName());
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                sgVar.a(15, String.valueOf(telephonyManager.getSimCarrierId()));
                sgVar.a(16, String.valueOf(telephonyManager.getSimCarrierIdName()));
            }
            sgVar.a(10, Integer.valueOf(telephonyManager.getPhoneType()));
            sgVar.a(11, g.b(telephonyManager.getNetworkOperator()));
            sgVar.a(12, g.b(telephonyManager.getNetworkOperatorName()));
            this.l.getClass();
            LocationMetadata C = MetaData.A().C();
            if ((C == null || !C.a()) ? false : m0.a(this.f165a, LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING)) {
                if (i >= 29 && z) {
                    this.k.getClass();
                    TelephonyMetadata V = MetaData.A().V();
                    if (V != null && V.d()) {
                        try {
                            if (i >= 29) {
                                try {
                                    tgVar = new tg(this);
                                } catch (Throwable th) {
                                    if (a(32)) {
                                        n8.a(th);
                                    }
                                }
                                if (tgVar != null) {
                                    telephonyManager.requestCellInfoUpdate((Executor) this.f.a(), tgVar);
                                }
                            }
                            tgVar = null;
                            if (tgVar != null) {
                            }
                        } catch (Throwable th2) {
                            if (a(64)) {
                                n8.a(th2);
                            }
                        }
                    }
                }
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    a(sgVar, allCellInfo);
                }
            }
            b(sgVar);
        } catch (Throwable th3) {
            if (a(128)) {
                n8.a(th3);
            }
        }
    }

    @Override // com.startapp.sdk.internal.ld
    public final String c(Object obj) {
        sg sgVar = (sg) obj;
        if (sgVar != null) {
            return sgVar.f425a.toString();
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.ld
    public final long d() {
        return 60000L;
    }

    @Override // com.startapp.sdk.internal.ld
    public final boolean f() {
        if (((x5) this.j.a()).b()) {
            this.k.getClass();
            TelephonyMetadata V = MetaData.A().V();
            if (V != null && V.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ld
    public final void g() {
        b(true);
    }

    public final boolean a(int i) {
        this.k.getClass();
        TelephonyMetadata V = MetaData.A().V();
        if (V == null || !V.c()) {
            V = null;
        }
        return V != null && (V.a() & i) == i && ((Random) zh.d.a()).nextDouble() < V.b();
    }

    @Override // com.startapp.sdk.internal.a6
    public final Object c() {
        return sg.b;
    }

    public static int a(CellInfo cellInfo) {
        CellSignalStrength cellSignalStrength;
        if (cellInfo instanceof CellInfoCdma) {
            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoGsm) {
            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoLte) {
            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                cellSignalStrength = ((CellInfoNr) cellInfo).getCellSignalStrength();
            } else if (i >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                cellSignalStrength = ((CellInfoTdscdma) cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = cellInfo instanceof CellInfoWcdma ? ((CellInfoWcdma) cellInfo).getCellSignalStrength() : null;
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    public static void a(sg sgVar, List list) {
        int timingAdvance;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new ug());
        sgVar.a(6, g.b(arrayList.toString()));
        int size = arrayList.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CellInfo cellInfo = (CellInfo) obj;
            if (z) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
                    int latitude = cellIdentity.getLatitude();
                    int longitude = cellIdentity.getLongitude();
                    if (latitude != Integer.MAX_VALUE && longitude != Integer.MAX_VALUE) {
                        sgVar.a(1, g.b(String.valueOf(latitude)));
                        sgVar.a(2, g.b(String.valueOf(longitude)));
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    int lac = cellIdentity2.getLac();
                    if (lac != Integer.MAX_VALUE) {
                        sgVar.a(3, g.b(String.valueOf(lac)));
                    }
                    int cid = cellIdentity2.getCid();
                    if (cid != Integer.MAX_VALUE) {
                        sgVar.a(4, g.b(String.valueOf(cid)));
                    }
                    if (Build.VERSION.SDK_INT >= 26 && (timingAdvance = cellInfoGsm.getCellSignalStrength().getTimingAdvance()) != Integer.MAX_VALUE) {
                        sgVar.a(13, String.valueOf(timingAdvance));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    int tac = cellInfoLte.getCellIdentity().getTac();
                    if (tac != Integer.MAX_VALUE) {
                        sgVar.a(5, g.b(String.valueOf(tac)));
                    }
                    int timingAdvance2 = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    if (timingAdvance2 != Integer.MAX_VALUE) {
                        sgVar.a(13, String.valueOf(timingAdvance2));
                    }
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 29 && (cellInfo instanceof CellInfoNr)) {
                        int tac2 = ((CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity()).getTac();
                        if (tac2 != Integer.MAX_VALUE) {
                            sgVar.a(5, g.b(String.valueOf(tac2)));
                        }
                    } else if (i2 >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                        CellIdentityTdscdma cellIdentity3 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                        int lac2 = cellIdentity3.getLac();
                        if (lac2 != Integer.MAX_VALUE) {
                            sgVar.a(3, g.b(String.valueOf(lac2)));
                        }
                        int cid2 = cellIdentity3.getCid();
                        if (cid2 != Integer.MAX_VALUE) {
                            sgVar.a(4, g.b(String.valueOf(cid2)));
                        }
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        int lac3 = cellIdentity4.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            sgVar.a(3, g.b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity4.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            sgVar.a(4, g.b(String.valueOf(cid3)));
                        }
                    }
                }
                z = false;
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoNr)) {
                sgVar.a(14, 1);
            }
        }
    }
}
