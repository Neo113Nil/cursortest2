package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
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

/* loaded from: classes.dex */
public final class mh extends zd {

    /* renamed from: j, reason: collision with root package name */
    public final ib f7292j;

    /* renamed from: k, reason: collision with root package name */
    public final a6 f7293k;

    /* renamed from: l, reason: collision with root package name */
    public final g3 f7294l;

    public mh(Context context, ib ibVar, ib ibVar2, ib ibVar3, a6 a6Var, g3 g3Var) {
        super(context, ibVar, ibVar2, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.f7292j = ibVar3;
        this.f7293k = a6Var;
        this.f7294l = g3Var;
    }

    @Override // com.startapp.sdk.internal.zd
    public final Object a(String str) {
        if (str != null) {
            try {
                return new jh(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x00ce, B:29:0x00bf, B:31:0x00c5, B:25:0x00b6), top: B:18:0x00b4, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        kh khVar;
        int simCarrierId;
        CharSequence simCarrierIdName;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f7124a.getSystemService("phone");
            jh jhVar = new jh();
            jhVar.a(7, Integer.valueOf(telephonyManager.getSimState()));
            jhVar.a(8, telephonyManager.getSimOperator());
            jhVar.a(9, telephonyManager.getSimOperatorName());
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                simCarrierId = telephonyManager.getSimCarrierId();
                jhVar.a(15, String.valueOf(simCarrierId));
                simCarrierIdName = telephonyManager.getSimCarrierIdName();
                jhVar.a(16, String.valueOf(simCarrierIdName));
            }
            jhVar.a(10, Integer.valueOf(telephonyManager.getPhoneType()));
            jhVar.a(11, AbstractC0366g.b(telephonyManager.getNetworkOperator()));
            jhVar.a(12, AbstractC0366g.b(telephonyManager.getNetworkOperatorName()));
            this.f7294l.getClass();
            LocationMetadata G4 = MetaData.E().G();
            if ((G4 == null || !G4.a()) ? false : p0.a(this.f7124a, "android.permission.ACCESS_FINE_LOCATION")) {
                if (i4 >= 29 && z) {
                    this.f7293k.getClass();
                    TelephonyMetadata a02 = MetaData.E().a0();
                    if (a02 != null && a02.d()) {
                        try {
                            if (i4 >= 29) {
                                try {
                                    khVar = new kh(this);
                                } catch (Throwable th) {
                                    if (a(32)) {
                                        d9.a(th);
                                    }
                                }
                                if (khVar != null) {
                                    telephonyManager.requestCellInfoUpdate((Executor) this.f8038f.a(), khVar);
                                }
                            }
                            khVar = null;
                            if (khVar != null) {
                            }
                        } catch (Throwable th2) {
                            if (a(64)) {
                                d9.a(th2);
                            }
                        }
                    }
                }
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    a(jhVar, allCellInfo);
                }
            }
            b(jhVar);
        } catch (Throwable th3) {
            if (a(128)) {
                d9.a(th3);
            }
        }
    }

    @Override // com.startapp.sdk.internal.zd
    public final String c(Object obj) {
        jh jhVar = (jh) obj;
        if (jhVar != null) {
            return jhVar.f7161a.toString();
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.zd
    public final long d() {
        return 60000L;
    }

    @Override // com.startapp.sdk.internal.zd
    public final boolean f() {
        g6 g6Var = (g6) this.f7292j.a();
        Boolean valueOf = (g6Var.b() && ((sf) g6Var.f6973b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f6973b.a()).getBoolean("consentApc", false)) : null;
        if (valueOf != null && valueOf.booleanValue()) {
            this.f7293k.getClass();
            TelephonyMetadata a02 = MetaData.E().a0();
            if (a02 != null && a02.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.zd
    public final void g() {
        b(true);
    }

    public final boolean a(int i4) {
        this.f7293k.getClass();
        TelephonyMetadata a02 = MetaData.E().a0();
        if (a02 == null || !a02.c()) {
            a02 = null;
        }
        return a02 != null && (a02.a() & i4) == i4 && ((Random) si.f7578d.a()).nextDouble() < a02.b();
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object c() {
        return jh.f7160b;
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
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29 && E.M.v(cellInfo)) {
                cellSignalStrength = E.M.e(cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = (i4 < 29 || !F.w(cellInfo)) ? cellInfo instanceof CellInfoWcdma ? ((CellInfoWcdma) cellInfo).getCellSignalStrength() : null : F.f(cellInfo).getCellSignalStrength();
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        r3 = r3.getCellSignalStrength().getTimingAdvance();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(jh jhVar, List list) {
        CellIdentityTdscdma cellIdentity;
        int lac;
        int cid;
        CellIdentity cellIdentity2;
        int tac;
        int timingAdvance;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new lh());
        jhVar.a(6, AbstractC0366g.b(arrayList.toString()));
        int size = arrayList.size();
        boolean z = true;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            CellInfo cellInfo = (CellInfo) obj;
            if (z) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity3 = ((CellInfoCdma) cellInfo).getCellIdentity();
                    int latitude = cellIdentity3.getLatitude();
                    int longitude = cellIdentity3.getLongitude();
                    if (latitude != Integer.MAX_VALUE && longitude != Integer.MAX_VALUE) {
                        jhVar.a(1, AbstractC0366g.b(String.valueOf(latitude)));
                        jhVar.a(2, AbstractC0366g.b(String.valueOf(longitude)));
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity4 = cellInfoGsm.getCellIdentity();
                    int lac2 = cellIdentity4.getLac();
                    if (lac2 != Integer.MAX_VALUE) {
                        jhVar.a(3, AbstractC0366g.b(String.valueOf(lac2)));
                    }
                    int cid2 = cellIdentity4.getCid();
                    if (cid2 != Integer.MAX_VALUE) {
                        jhVar.a(4, AbstractC0366g.b(String.valueOf(cid2)));
                    }
                    if (Build.VERSION.SDK_INT >= 26 && timingAdvance != Integer.MAX_VALUE) {
                        jhVar.a(13, String.valueOf(timingAdvance));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    int tac2 = cellInfoLte.getCellIdentity().getTac();
                    if (tac2 != Integer.MAX_VALUE) {
                        jhVar.a(5, AbstractC0366g.b(String.valueOf(tac2)));
                    }
                    int timingAdvance2 = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    if (timingAdvance2 != Integer.MAX_VALUE) {
                        jhVar.a(13, String.valueOf(timingAdvance2));
                    }
                } else {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 29 && E.M.v(cellInfo)) {
                        cellIdentity2 = E.M.e(cellInfo).getCellIdentity();
                        tac = F.e(cellIdentity2).getTac();
                        if (tac != Integer.MAX_VALUE) {
                            jhVar.a(5, AbstractC0366g.b(String.valueOf(tac)));
                        }
                    } else if (i5 >= 29 && F.w(cellInfo)) {
                        cellIdentity = F.f(cellInfo).getCellIdentity();
                        lac = cellIdentity.getLac();
                        if (lac != Integer.MAX_VALUE) {
                            jhVar.a(3, AbstractC0366g.b(String.valueOf(lac)));
                        }
                        cid = cellIdentity.getCid();
                        if (cid != Integer.MAX_VALUE) {
                            jhVar.a(4, AbstractC0366g.b(String.valueOf(cid)));
                        }
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellIdentityWcdma cellIdentity5 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        int lac3 = cellIdentity5.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            jhVar.a(3, AbstractC0366g.b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity5.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            jhVar.a(4, AbstractC0366g.b(String.valueOf(cid3)));
                        }
                    }
                }
                z = false;
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && E.M.v(cellInfo)) {
                jhVar.a(14, 1);
            }
        }
    }
}
