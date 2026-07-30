package com.baidu.mapapi.favorite;

import android.util.Log;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi;
import com.baidu.mapsdkplatform.comapi.map.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FavoriteManager {

    /* renamed from: a, reason: collision with root package name */
    private static FavoriteManager f5439a;

    /* renamed from: b, reason: collision with root package name */
    private static com.baidu.mapsdkplatform.comapi.favrite.a f5440b;

    private FavoriteManager() {
    }

    public static FavoriteManager getInstance() {
        if (f5439a == null) {
            f5439a = new FavoriteManager();
        }
        return f5439a;
    }

    public int add(FavoritePoiInfo favoritePoiInfo) {
        if (f5440b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return 0;
        }
        if (favoritePoiInfo == null || favoritePoiInfo.f5443c == null) {
            Log.e("baidumapsdk", "object or pt can not be null!");
            return 0;
        }
        String str = favoritePoiInfo.f5442b;
        if (str == null || str.equals("")) {
            Log.e("baidumapsdk", "poiName can not be null or empty!");
            return -1;
        }
        FavSyncPoi a8 = a.a(favoritePoiInfo);
        int a9 = f5440b.a(a8.f8018b, a8);
        if (a9 == 1) {
            favoritePoiInfo.f5441a = a8.f8017a;
            favoritePoiInfo.f5447g = Long.parseLong(a8.f8024h);
        }
        return a9;
    }

    public boolean clearAllFavPois() {
        com.baidu.mapsdkplatform.comapi.favrite.a aVar = f5440b;
        if (aVar != null) {
            return aVar.a();
        }
        Log.e("baidumapsdk", "you may have not call init method!");
        return false;
    }

    public boolean deleteFavPoi(String str) {
        if (f5440b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return false;
        }
        if (str == null || str.equals("")) {
            return false;
        }
        return f5440b.a(str);
    }

    public void destroy() {
        com.baidu.mapsdkplatform.comapi.favrite.a aVar = f5440b;
        if (aVar != null) {
            aVar.b();
            f5440b = null;
            BMapManager.destroy();
            e.a();
        }
    }

    public List<FavoritePoiInfo> getAllFavPois() {
        JSONArray optJSONArray;
        com.baidu.mapsdkplatform.comapi.favrite.a aVar = f5440b;
        if (aVar == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return null;
        }
        String c8 = aVar.c();
        if (c8 != null && !c8.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(c8);
                if (jSONObject.optInt("favpoinum") != 0 && (optJSONArray = jSONObject.optJSONArray("favcontents")) != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                        if (jSONObject2 != null) {
                            arrayList.add(a.a(jSONObject2));
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public FavoritePoiInfo getFavPoi(String str) {
        FavSyncPoi b8;
        if (f5440b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return null;
        }
        if (str == null || str.equals("") || (b8 = f5440b.b(str)) == null) {
            return null;
        }
        return a.a(b8);
    }

    public void init() {
        if (f5440b == null) {
            e.c();
            BMapManager.init();
            f5440b = com.baidu.mapsdkplatform.comapi.favrite.a.f();
        }
    }

    public boolean updateFavPoi(String str, FavoritePoiInfo favoritePoiInfo) {
        if (f5440b == null) {
            Log.e("baidumapsdk", "you may have not call init method!");
            return false;
        }
        if (str != null && !str.equals("") && favoritePoiInfo != null) {
            if (favoritePoiInfo.f5443c == null) {
                Log.e("baidumapsdk", "object or pt can not be null!");
                return false;
            }
            String str2 = favoritePoiInfo.f5442b;
            if (str2 != null && !str2.equals("")) {
                favoritePoiInfo.f5441a = str;
                return f5440b.b(str, a.a(favoritePoiInfo));
            }
            Log.e("baidumapsdk", "poiName can not be null or empty!");
        }
        return false;
    }
}
