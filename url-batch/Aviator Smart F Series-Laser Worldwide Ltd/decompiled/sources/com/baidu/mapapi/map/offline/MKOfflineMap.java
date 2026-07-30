package com.baidu.mapapi.map.offline;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.mapsdkplatform.comapi.map.e;
import com.baidu.mapsdkplatform.comapi.map.j;
import com.baidu.mapsdkplatform.comapi.map.k;
import com.baidu.mapsdkplatform.comapi.map.l;
import com.baidu.mapsdkplatform.comapi.map.m;
import com.baidu.mapsdkplatform.comapi.map.n;
import com.baidu.platform.comapi.logstatistics.SDKLogFactory;
import com.my.lib.data.ErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MKOfflineMap {
    public static final int TYPE_DOWNLOAD_UPDATE = 0;
    public static final int TYPE_NETWORK_ERROR = 2;
    public static final int TYPE_NEW_OFFLINE = 6;
    public static final int TYPE_VER_UPDATE = 4;

    /* renamed from: a, reason: collision with root package name */
    private k f6529a;

    /* renamed from: b, reason: collision with root package name */
    private MKOfflineMapListener f6530b;

    class a implements n {
        a() {
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.n
        public void a(int i8, int i9) {
            if (i8 == 4) {
                ArrayList<MKOLUpdateElement> allUpdateInfo = MKOfflineMap.this.getAllUpdateInfo();
                if (allUpdateInfo != null) {
                    for (MKOLUpdateElement mKOLUpdateElement : allUpdateInfo) {
                        if (mKOLUpdateElement.update) {
                            MKOfflineMap.this.f6530b.onGetOfflineMapState(4, mKOLUpdateElement.cityID);
                        }
                    }
                    return;
                }
                return;
            }
            if (i8 == 6) {
                MKOfflineMap.this.f6530b.onGetOfflineMapState(6, i9);
                return;
            }
            if (i8 == 8) {
                MKOfflineMap.this.f6530b.onGetOfflineMapState(0, i9 >> 8);
            } else if (i8 == 10) {
                MKOfflineMap.this.f6530b.onGetOfflineMapState(2, i9);
            } else {
                if (i8 != 12) {
                    return;
                }
                MKOfflineMap.this.f6529a.a(true, false);
            }
        }
    }

    public void destroy() {
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", "1", null);
        this.f6529a.f(0);
        this.f6529a.b((n) null);
        this.f6529a.b();
        e.a();
    }

    public ArrayList<MKOLUpdateElement> getAllUpdateInfo() {
        ArrayList<m> d8 = this.f6529a.d();
        if (d8 == null) {
            return null;
        }
        ArrayList<MKOLUpdateElement> arrayList = new ArrayList<>();
        Iterator<m> it = d8.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getUpdatElementFromLocalMapElement(it.next().a()));
        }
        return arrayList;
    }

    public ArrayList<MKOLSearchRecord> getHotCityList() {
        ArrayList<j> e8 = this.f6529a.e();
        if (e8 == null) {
            return null;
        }
        ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
        Iterator<j> it = e8.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public ArrayList<MKOLSearchRecord> getOfflineCityList() {
        ArrayList<j> c8 = this.f6529a.c();
        if (c8 == null) {
            return null;
        }
        ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
        Iterator<j> it = c8.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public MKOLUpdateElement getUpdateInfo(int i8) {
        m b8 = this.f6529a.b(i8);
        if (b8 == null) {
            return null;
        }
        return OfflineMapUtil.getUpdatElementFromLocalMapElement(b8.a());
    }

    @Deprecated
    public int importOfflineData() {
        return importOfflineData(false);
    }

    public boolean init(MKOfflineMapListener mKOfflineMapListener) {
        e.c();
        k f8 = k.f();
        this.f6529a = f8;
        if (f8 == null) {
            return false;
        }
        f8.a(new a());
        this.f6530b = mKOfflineMapListener;
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", "0", null);
        return true;
    }

    public boolean pause(int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("I", Integer.valueOf(i8));
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", "4", hashMap);
        return this.f6529a.e(i8);
    }

    public boolean remove(int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("I", Integer.valueOf(i8));
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", ErrorCode.PARAMETER_ERROR, hashMap);
        return this.f6529a.c(i8);
    }

    public ArrayList<MKOLSearchRecord> searchCity(String str) {
        ArrayList<j> a8 = this.f6529a.a(str);
        if (a8 == null) {
            return null;
        }
        ArrayList<MKOLSearchRecord> arrayList = new ArrayList<>();
        Iterator<j> it = a8.iterator();
        while (it.hasNext()) {
            arrayList.add(OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public boolean start(int i8) {
        int i9;
        HashMap hashMap = new HashMap();
        if (this.f6529a == null) {
            hashMap.put("I", "null");
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", "2", hashMap);
            return false;
        }
        hashMap.put("I", Integer.valueOf(i8));
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", "2", hashMap);
        if (this.f6529a.d() != null) {
            Iterator<m> it = this.f6529a.d().iterator();
            while (it.hasNext()) {
                l lVar = it.next().f8130a;
                if (lVar.f8118a == i8) {
                    if (lVar.f8127j || (i9 = lVar.f8129l) == 2 || i9 == 3 || i9 == 6) {
                        return this.f6529a.d(i8);
                    }
                    return false;
                }
            }
        }
        return this.f6529a.a(i8);
    }

    public boolean update(int i8) {
        HashMap hashMap = new HashMap();
        if (this.f6529a == null) {
            hashMap.put("I", "null");
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", ExifInterface.GPS_MEASUREMENT_3D, hashMap);
            return false;
        }
        hashMap.put("I", Integer.valueOf(i8));
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "OFF", ExifInterface.GPS_MEASUREMENT_3D, hashMap);
        if (this.f6529a.d() != null) {
            Iterator<m> it = this.f6529a.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = it.next().f8130a;
                if (lVar.f8118a == i8) {
                    if (lVar.f8127j) {
                        return this.f6529a.g(i8);
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    public int importOfflineData(boolean z7) {
        int i8;
        int i9;
        ArrayList<m> d8 = this.f6529a.d();
        if (d8 != null) {
            i8 = d8.size();
            i9 = i8;
        } else {
            i8 = 0;
            i9 = 0;
        }
        this.f6529a.a(z7, true);
        ArrayList<m> d9 = this.f6529a.d();
        if (d9 != null) {
            i8 = d9.size();
        }
        return i8 - i9;
    }
}
