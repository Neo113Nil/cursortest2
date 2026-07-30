package com.baidu.mapsdkplatform.comapi.map;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static k f8113a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private static Handler f8114b;

    /* renamed from: c, reason: collision with root package name */
    private AppBaseMap f8115c;

    /* renamed from: d, reason: collision with root package name */
    private o f8116d;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        @SuppressLint({"HandlerLeak"})
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (k.f8113a != null) {
                k.this.f8116d.a(message);
            }
        }
    }

    private k() {
    }

    public static k f() {
        if (f8113a == null) {
            k kVar = new k();
            f8113a = kVar;
            kVar.g();
        }
        return f8113a;
    }

    private void g() {
        h();
        this.f8116d = new o();
        a aVar = new a();
        f8114b = aVar;
        MessageCenter.registMessage(65289, aVar);
    }

    private void h() {
        EnvironmentUtilities.initAppDirectory(BMapManager.getContext());
        AppBaseMap appBaseMap = new AppBaseMap();
        this.f8115c = appBaseMap;
        appBaseMap.Create();
        String moduleFileName = SysOSUtil.getModuleFileName();
        String appSDCardPath = EnvironmentUtilities.getAppSDCardPath();
        String appCachePath = EnvironmentUtilities.getAppCachePath();
        String appSecondCachePath = EnvironmentUtilities.getAppSecondCachePath();
        int mapTmpStgMax = EnvironmentUtilities.getMapTmpStgMax();
        int domTmpStgMax = EnvironmentUtilities.getDomTmpStgMax();
        int itsTmpStgMax = EnvironmentUtilities.getItsTmpStgMax();
        int ssgTmpStgMax = EnvironmentUtilities.getSsgTmpStgMax();
        String str = com.baidu.platform.comapi.util.SysOSUtil.getInstance().getDensityDPI() >= 180 ? "/h/" : "/l/";
        String str2 = moduleFileName + "/cfg";
        String str3 = appSDCardPath + "/vmp";
        String str4 = str2 + "/idrres/";
        String str5 = str3 + str;
        String str6 = str3 + str;
        String str7 = appCachePath + "/tmp/";
        this.f8115c.Init(str2 + "/a/", str4, str5, str7, appSecondCachePath + "/tmp/", str6, str2 + "/a/", com.baidu.platform.comapi.util.SysOSUtil.getInstance().getScreenWidth(), com.baidu.platform.comapi.util.SysOSUtil.getInstance().getScreenHeight(), com.baidu.platform.comapi.util.SysOSUtil.getInstance().getDensityDPI(), mapTmpStgMax, domTmpStgMax, itsTmpStgMax, ssgTmpStgMax, false, false);
        this.f8115c.OnResume();
    }

    public void b() {
        MessageCenter.unregistMessage(65289, f8114b);
        this.f8115c.releaseFromOfflineMap();
        f8113a = null;
    }

    public boolean c(int i8) {
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null || i8 < 0) {
            return false;
        }
        return appBaseMap.OnRecordRemove(i8, false);
    }

    public boolean d(int i8) {
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null || i8 < 0) {
            return false;
        }
        if (i8 <= 2000 || i8 == 2912 || i8 == 2911 || i8 == 9000) {
            return appBaseMap.OnRecordStart(i8, false, 0);
        }
        return false;
    }

    public boolean e(int i8) {
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null || i8 < 0) {
            return false;
        }
        return appBaseMap.OnRecordSuspend(i8, false, 0);
    }

    public ArrayList<j> c() {
        AppBaseMap appBaseMap = this.f8115c;
        ArrayList<j> arrayList = null;
        if (appBaseMap == null) {
            return null;
        }
        String OnSchcityGet = appBaseMap.OnSchcityGet("");
        ArrayList<j> arrayList2 = new ArrayList<>();
        try {
            JSONArray optJSONArray = new JSONObject(OnSchcityGet).optJSONArray("dataset");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            int i8 = 0;
            while (i8 < optJSONArray.length()) {
                j jVar = new j();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                int optInt = optJSONObject.optInt("id");
                if (optInt <= 2000 || optInt == 2912 || optInt == 2911 || optInt == 9000) {
                    jVar.f8108a = optInt;
                    jVar.f8109b = optJSONObject.optString("name");
                    jVar.f8110c = optJSONObject.optInt("mapsize");
                    jVar.f8111d = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                    if (optJSONObject.has(MapBundleKey.OfflineMapKey.OFFLINE_CHILD)) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray(MapBundleKey.OfflineMapKey.OFFLINE_CHILD);
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            ArrayList<j> arrayList3 = new ArrayList<>();
                            for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                                j jVar2 = new j();
                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i9);
                                try {
                                    jVar2.f8108a = optJSONObject2.optInt("id");
                                    jVar2.f8109b = optJSONObject2.optString("name");
                                    jVar2.f8110c = optJSONObject2.optInt("mapsize");
                                    jVar2.f8111d = optJSONObject2.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                                    arrayList3.add(jVar2);
                                } catch (JSONException unused) {
                                    return null;
                                } catch (Exception unused2) {
                                    return null;
                                }
                            }
                            jVar.a(arrayList3);
                        }
                    }
                    arrayList2.add(jVar);
                }
                i8++;
                arrayList = null;
            }
            return arrayList2;
        } catch (JSONException unused3) {
            return arrayList;
        } catch (Exception unused4) {
            return arrayList;
        }
    }

    public ArrayList<m> d() {
        String OnRecordGetAll;
        JSONArray optJSONArray;
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap != null && (OnRecordGetAll = appBaseMap.OnRecordGetAll()) != null && !OnRecordGetAll.equals("")) {
            ArrayList<m> arrayList = new ArrayList<>();
            try {
                JSONObject jSONObject = new JSONObject(OnRecordGetAll);
                if (jSONObject.length() != 0 && (optJSONArray = jSONObject.optJSONArray("dataset")) != null && optJSONArray.length() != 0) {
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        m mVar = new m();
                        l lVar = new l();
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                        lVar.f8118a = optJSONObject.optInt("id");
                        lVar.f8119b = optJSONObject.optString("name");
                        lVar.f8120c = optJSONObject.optString("pinyin");
                        lVar.f8125h = optJSONObject.optInt("mapoldsize");
                        lVar.f8126i = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_RATION);
                        lVar.f8129l = optJSONObject.optInt("status");
                        lVar.f8124g = new GeoPoint(optJSONObject.optInt("y"), optJSONObject.optInt("x"));
                        boolean z7 = true;
                        if (optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE) != 1) {
                            z7 = false;
                        }
                        lVar.f8127j = z7;
                        lVar.f8122e = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_LEVEL);
                        if (lVar.f8127j) {
                            lVar.f8128k = optJSONObject.optInt("mapsize");
                        } else {
                            lVar.f8128k = 0;
                        }
                        mVar.a(lVar);
                        arrayList.add(mVar);
                    }
                    return arrayList;
                }
                return null;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public ArrayList<j> e() {
        ArrayList<j> arrayList;
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null) {
            return null;
        }
        String OnHotcityGet = appBaseMap.OnHotcityGet();
        ArrayList<j> arrayList2 = new ArrayList<>();
        try {
            JSONArray optJSONArray = new JSONObject(OnHotcityGet).optJSONArray("dataset");
            if (optJSONArray != null) {
                try {
                    if (optJSONArray.length() != 0) {
                        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                            j jVar = new j();
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                            jVar.f8108a = optJSONObject.optInt("id");
                            jVar.f8109b = optJSONObject.optString("name");
                            jVar.f8110c = optJSONObject.optInt("mapsize");
                            jVar.f8111d = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                            if (optJSONObject.has(MapBundleKey.OfflineMapKey.OFFLINE_CHILD)) {
                                JSONArray optJSONArray2 = optJSONObject.optJSONArray(MapBundleKey.OfflineMapKey.OFFLINE_CHILD);
                                if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                                    ArrayList<j> arrayList3 = new ArrayList<>();
                                    for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                                        j jVar2 = new j();
                                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i9);
                                        jVar2.f8108a = optJSONObject2.optInt("id");
                                        jVar2.f8109b = optJSONObject2.optString("name");
                                        jVar2.f8110c = optJSONObject2.optInt("mapsize");
                                        jVar2.f8111d = optJSONObject2.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                                        arrayList3.add(jVar2);
                                    }
                                    jVar.a(arrayList3);
                                }
                            }
                            arrayList2.add(jVar);
                        }
                        return arrayList2;
                    }
                } catch (JSONException e8) {
                    e = e8;
                    arrayList = null;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return null;
        } catch (JSONException e9) {
            e = e9;
            arrayList = null;
        }
    }

    public void a(n nVar) {
        o oVar = this.f8116d;
        if (oVar != null) {
            oVar.a(nVar);
        }
    }

    public void b(n nVar) {
        o oVar = this.f8116d;
        if (oVar != null) {
            oVar.b(nVar);
        }
    }

    public boolean f(int i8) {
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.OnRecordSuspend(0, true, i8);
    }

    public boolean a(int i8) {
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null || i8 < 0) {
            return false;
        }
        if (i8 <= 2000 || i8 == 2912 || i8 == 2911 || i8 == 9000) {
            return appBaseMap.OnRecordAdd(i8);
        }
        return false;
    }

    public m b(int i8) {
        String OnRecordGetAt;
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap != null && i8 >= 0 && (OnRecordGetAt = appBaseMap.OnRecordGetAt(i8)) != null && !OnRecordGetAt.equals("")) {
            m mVar = new m();
            l lVar = new l();
            try {
                JSONObject jSONObject = new JSONObject(OnRecordGetAt);
                if (jSONObject.length() == 0) {
                    return null;
                }
                int optInt = jSONObject.optInt("id");
                if (optInt > 2000 && optInt != 2912 && optInt != 2911 && optInt != 9000) {
                    return null;
                }
                lVar.f8118a = optInt;
                lVar.f8119b = jSONObject.optString("name");
                lVar.f8120c = jSONObject.optString("pinyin");
                lVar.f8121d = jSONObject.optString("headchar");
                lVar.f8125h = jSONObject.optInt("mapoldsize");
                lVar.f8126i = jSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_RATION);
                lVar.f8129l = jSONObject.optInt("status");
                lVar.f8124g = new GeoPoint(jSONObject.optInt("y"), jSONObject.optInt("x"));
                boolean z7 = true;
                if (jSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE) != 1) {
                    z7 = false;
                }
                lVar.f8127j = z7;
                lVar.f8122e = jSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_LEVEL);
                if (lVar.f8127j) {
                    lVar.f8128k = jSONObject.optInt("mapsize");
                } else {
                    lVar.f8128k = 0;
                }
                lVar.f8123f = jSONObject.optInt("ver");
                mVar.a(lVar);
                return mVar;
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public boolean a(boolean z7, boolean z8) {
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.OnRecordImport(z7, z8);
    }

    public boolean g(int i8) {
        AppBaseMap appBaseMap = this.f8115c;
        if (appBaseMap == null || i8 < 0) {
            return false;
        }
        if (i8 <= 2000 || i8 == 2912 || i8 == 2911 || i8 == 9000) {
            return appBaseMap.OnRecordReload(i8, false);
        }
        return false;
    }

    public ArrayList<j> a(String str) {
        AppBaseMap appBaseMap;
        if (!str.equals("") && (appBaseMap = this.f8115c) != null) {
            String OnSchcityGet = appBaseMap.OnSchcityGet(str);
            if (OnSchcityGet == null || OnSchcityGet.equals("")) {
                return null;
            }
            ArrayList<j> arrayList = new ArrayList<>();
            try {
                JSONObject jSONObject = new JSONObject(OnSchcityGet);
                if (jSONObject.length() == 0) {
                    return null;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("dataset");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    return null;
                }
                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                    j jVar = new j();
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                    int optInt = jSONObject2.optInt("id");
                    if (optInt <= 2000 || optInt == 2912 || optInt == 2911 || optInt == 9000) {
                        jVar.f8108a = optInt;
                        jVar.f8109b = jSONObject2.optString("name");
                        jVar.f8110c = jSONObject2.optInt("mapsize");
                        jVar.f8111d = jSONObject2.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                        if (jSONObject2.has(MapBundleKey.OfflineMapKey.OFFLINE_CHILD)) {
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray(MapBundleKey.OfflineMapKey.OFFLINE_CHILD);
                            if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                                ArrayList<j> arrayList2 = new ArrayList<>();
                                for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                                    j jVar2 = new j();
                                    JSONObject optJSONObject = optJSONArray2.optJSONObject(i9);
                                    jVar2.f8108a = optJSONObject.optInt("id");
                                    jVar2.f8109b = optJSONObject.optString("name");
                                    jVar2.f8110c = optJSONObject.optInt("mapsize");
                                    jVar2.f8111d = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                                    arrayList2.add(jVar2);
                                }
                                jVar.a(arrayList2);
                            }
                        }
                        arrayList.add(jVar);
                    }
                }
                return arrayList;
            } catch (JSONException e8) {
                e8.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
