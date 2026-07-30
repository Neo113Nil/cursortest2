package com.crrepa.f1;

import cn.hutool.core.util.g1;
import com.crrepa.a1.h;
import com.crrepa.ble.conn.bean.CRPWatchFaceDetailsInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceDetailsRequestInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceStoreRequestInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceStoreTagInfo;
import com.crrepa.ble.conn.callback.CRPWatchFaceDetailsCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceStoreCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceStoreTagCallback;
import com.crrepa.ble.conn.type.CRPWatchFaceStoreType;
import com.crrepa.ble.trans.watchface.entity.NewJieliWatchFaceListEntity;
import com.crrepa.ble.trans.watchface.entity.NewSifliWatchFaceListEntity;
import com.crrepa.ble.trans.watchface.entity.NewWatchFaceTagEntity;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12837a = "en";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12838b = "yes";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12839c = "";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12840d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12841e = "https://api.moyoung.com/faces/v3/tag-list";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12842f = "https://api.moyoung.com/faces/sifli/tag-list";

    /* renamed from: g, reason: collision with root package name */
    private static final String f12843g = "https://api.moyoung.com/faces/new/tag-face-list";

    /* renamed from: h, reason: collision with root package name */
    private static final String f12844h = "https://api.moyoung.com/faces/v3/list";

    /* renamed from: i, reason: collision with root package name */
    private static final String f12845i = "https://api.moyoung.com/faces/sifli";

    /* renamed from: j, reason: collision with root package name */
    private static final String f12846j = "https://api.moyoung.com/faces/new/face-list";

    /* renamed from: k, reason: collision with root package name */
    private static final String f12847k = "https://api.moyoung.com/faces/v3/face-detail";

    /* renamed from: l, reason: collision with root package name */
    private static final String f12848l = "https://api.moyoung.com/faces/sifli/";

    /* renamed from: m, reason: collision with root package name */
    private static final String f12849m = "https://api.moyoung.com/faces/new/face-detail";

    /* renamed from: n, reason: collision with root package name */
    private static final String f12850n = "lang";

    /* renamed from: o, reason: collision with root package name */
    private static final String f12851o = "tpls";

    /* renamed from: p, reason: collision with root package name */
    private static final String f12852p = "fv";

    /* renamed from: q, reason: collision with root package name */
    private static final String f12853q = "per_page";

    /* renamed from: r, reason: collision with root package name */
    private static final String f12854r = "p";

    /* renamed from: s, reason: collision with root package name */
    private static final String f12855s = "max_size";

    /* renamed from: t, reason: collision with root package name */
    private static final String f12856t = "tested";

    /* renamed from: u, reason: collision with root package name */
    private static final String f12857u = "ver";

    /* renamed from: v, reason: collision with root package name */
    private static final String f12858v = "api_ver";

    /* renamed from: w, reason: collision with root package name */
    private static final String f12859w = "func_ver";

    /* renamed from: x, reason: collision with root package name */
    private static final String f12860x = "key";

    /* renamed from: y, reason: collision with root package name */
    private static final String f12861y = "tag_id";

    /* renamed from: z, reason: collision with root package name */
    private static final String f12862z = "id";

    /* renamed from: com.crrepa.f1.a$a, reason: collision with other inner class name */
    class C0217a extends com.crrepa.y.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CRPWatchFaceStoreTagCallback f12863a;

        C0217a(CRPWatchFaceStoreTagCallback cRPWatchFaceStoreTagCallback) {
            this.f12863a = cRPWatchFaceStoreTagCallback;
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            this.f12863a.onError(str);
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            List<CRPWatchFaceStoreTagInfo> tagList;
            if (obj instanceof String) {
                String str = (String) obj;
                BleLog.d("result: " + str);
                NewWatchFaceTagEntity newWatchFaceTagEntity = (NewWatchFaceTagEntity) k.a(str, NewWatchFaceTagEntity.class);
                if (newWatchFaceTagEntity != null && (tagList = newWatchFaceTagEntity.getTagList()) != null) {
                    this.f12863a.onWatchFaceStoreTagChange(tagList);
                    return;
                }
            }
            this.f12863a.onError("Network exception");
        }
    }

    class b extends com.crrepa.y.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CRPWatchFaceStoreCallback f12865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CRPWatchFaceStoreRequestInfo f12866b;

        b(CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback, CRPWatchFaceStoreRequestInfo cRPWatchFaceStoreRequestInfo) {
            this.f12865a = cRPWatchFaceStoreCallback;
            this.f12866b = cRPWatchFaceStoreRequestInfo;
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            this.f12865a.onError(str);
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            if (obj instanceof String) {
                String str = (String) obj;
                BleLog.d("result: " + str);
                int i8 = d.f12871a[this.f12866b.getStoreType().ordinal()];
                if (i8 == 1) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.getInt("code") == 0) {
                            ArrayList arrayList = new ArrayList();
                            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("faces");
                            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i9);
                                arrayList.add(new CRPWatchFaceStoreInfo.WatchFaceBean(jSONObject2.getInt("id"), jSONObject2.getString("preview"), jSONObject2.getString(g1.URL_PROTOCOL_FILE)));
                            }
                            this.f12865a.onWatchFaceStoreChange(new CRPWatchFaceStoreInfo(arrayList.size(), arrayList));
                            return;
                        }
                        return;
                    } catch (Exception e8) {
                        throw new RuntimeException(e8);
                    }
                }
                if (i8 == 2) {
                    NewJieliWatchFaceListEntity newJieliWatchFaceListEntity = (NewJieliWatchFaceListEntity) k.a(str, NewJieliWatchFaceListEntity.class);
                    if (newJieliWatchFaceListEntity != null) {
                        this.f12865a.onWatchFaceStoreChange(newJieliWatchFaceListEntity.getWatchFaceList());
                        return;
                    }
                    return;
                }
                if (i8 == 3) {
                    NewSifliWatchFaceListEntity newSifliWatchFaceListEntity = (NewSifliWatchFaceListEntity) k.a(str, NewSifliWatchFaceListEntity.class);
                    if (newSifliWatchFaceListEntity != null) {
                        this.f12865a.onWatchFaceStoreChange(newSifliWatchFaceListEntity.getWatchFaceList());
                        return;
                    }
                    return;
                }
            }
            this.f12865a.onError("Network exception");
        }
    }

    class c extends com.crrepa.y.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CRPWatchFaceDetailsCallback f12868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CRPWatchFaceDetailsRequestInfo f12869b;

        c(CRPWatchFaceDetailsCallback cRPWatchFaceDetailsCallback, CRPWatchFaceDetailsRequestInfo cRPWatchFaceDetailsRequestInfo) {
            this.f12868a = cRPWatchFaceDetailsCallback;
            this.f12869b = cRPWatchFaceDetailsRequestInfo;
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            this.f12868a.onError(str);
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            if (obj instanceof String) {
                String str = (String) obj;
                BleLog.d("result: " + str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.getInt("code") == 0) {
                        CRPWatchFaceDetailsInfo cRPWatchFaceDetailsInfo = new CRPWatchFaceDetailsInfo();
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        cRPWatchFaceDetailsInfo.setId(jSONObject2.getInt("id"));
                        cRPWatchFaceDetailsInfo.setDownload(jSONObject2.getInt("download"));
                        cRPWatchFaceDetailsInfo.setFile(jSONObject2.getString(g1.URL_PROTOCOL_FILE));
                        cRPWatchFaceDetailsInfo.setName(jSONObject2.getString("name"));
                        cRPWatchFaceDetailsInfo.setPreview(jSONObject2.getString("preview"));
                        cRPWatchFaceDetailsInfo.setSize(jSONObject2.getInt("size"));
                        cRPWatchFaceDetailsInfo.setRemark(jSONObject2.getString(this.f12869b.getStoreType() == CRPWatchFaceStoreType.DEFAULT ? "remark_en" : "remark_lang"));
                        JSONArray jSONArray = jSONObject2.getJSONArray("face_list");
                        ArrayList arrayList = new ArrayList();
                        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i8);
                            CRPWatchFaceDetailsInfo.WatchFaceBean watchFaceBean = new CRPWatchFaceDetailsInfo.WatchFaceBean();
                            watchFaceBean.setId(jSONObject3.getInt("id"));
                            watchFaceBean.setName(jSONObject3.getString("name"));
                            watchFaceBean.setPreview(jSONObject3.getString("preview"));
                            watchFaceBean.setSize(jSONObject3.getInt("size"));
                            arrayList.add(watchFaceBean);
                        }
                        cRPWatchFaceDetailsInfo.setRecommendWatchFaceList(arrayList);
                        this.f12868a.onNewWatchFaceChange(cRPWatchFaceDetailsInfo);
                        return;
                    }
                } catch (Exception e8) {
                    throw new RuntimeException(e8);
                }
            }
            this.f12868a.onError("Network exception");
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12871a;

        static {
            int[] iArr = new int[CRPWatchFaceStoreType.values().length];
            f12871a = iArr;
            try {
                iArr[CRPWatchFaceStoreType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12871a[CRPWatchFaceStoreType.JIELI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12871a[CRPWatchFaceStoreType.SIFLI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void a(CRPWatchFaceDetailsRequestInfo cRPWatchFaceDetailsRequestInfo, CRPWatchFaceDetailsCallback cRPWatchFaceDetailsCallback) {
        String str;
        if (cRPWatchFaceDetailsRequestInfo == null) {
            throw new RuntimeException("CRPWatchFaceStoreRequestInfo is null!");
        }
        if (cRPWatchFaceDetailsCallback == null) {
            throw new RuntimeException("CRPWatchFaceStoreTagCallback is null!");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lang", "en");
        int i8 = d.f12871a[cRPWatchFaceDetailsRequestInfo.getStoreType().ordinal()];
        if (i8 == 1) {
            hashMap.put("id", String.valueOf(cRPWatchFaceDetailsRequestInfo.getId()));
            hashMap.put("fv", cRPWatchFaceDetailsRequestInfo.getFirmwareVersion());
            hashMap.put(f12857u, "");
            hashMap.put("max_size", String.valueOf(cRPWatchFaceDetailsRequestInfo.getMaxSize()));
            str = f12847k;
        } else if (i8 == 2) {
            hashMap.put("id", String.valueOf(cRPWatchFaceDetailsRequestInfo.getId()));
            hashMap.put("fv", cRPWatchFaceDetailsRequestInfo.getFirmwareVersion());
            hashMap.put("max_size", String.valueOf(cRPWatchFaceDetailsRequestInfo.getMaxSize()));
            hashMap.put("api_ver", String.valueOf(cRPWatchFaceDetailsRequestInfo.getApiVersion()));
            hashMap.put("func_ver", String.valueOf(cRPWatchFaceDetailsRequestInfo.getFeature()));
            str = f12849m;
        } else if (i8 != 3) {
            str = null;
        } else {
            str = f12848l + cRPWatchFaceDetailsRequestInfo.getId();
        }
        com.crrepa.x.a.b(str, hashMap, new c(cRPWatchFaceDetailsCallback, cRPWatchFaceDetailsRequestInfo));
    }

    public void a(CRPWatchFaceStoreRequestInfo cRPWatchFaceStoreRequestInfo, int i8, CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback) {
        String str;
        if (cRPWatchFaceStoreRequestInfo == null) {
            throw new RuntimeException("CRPWatchFaceStoreRequestInfo is null!");
        }
        if (cRPWatchFaceStoreCallback == null) {
            throw new RuntimeException("CRPWatchFaceStoreTagCallback is null!");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lang", "en");
        hashMap.put("tpls", h.a(cRPWatchFaceStoreRequestInfo.getTypeList()));
        hashMap.put("fv", cRPWatchFaceStoreRequestInfo.getFirmwareVersion());
        hashMap.put("per_page", String.valueOf(cRPWatchFaceStoreRequestInfo.getPerPageCount()));
        hashMap.put("p", String.valueOf(cRPWatchFaceStoreRequestInfo.getPageIndex()));
        hashMap.put("max_size", String.valueOf(cRPWatchFaceStoreRequestInfo.getMaxSize()));
        hashMap.put("tested", f12838b);
        hashMap.put("tag_id", String.valueOf(i8));
        int i9 = d.f12871a[cRPWatchFaceStoreRequestInfo.getStoreType().ordinal()];
        if (i9 == 1) {
            hashMap.put(f12857u, "");
            str = f12844h;
        } else if (i9 == 2) {
            hashMap.put("api_ver", String.valueOf(cRPWatchFaceStoreRequestInfo.getApiVersion()));
            hashMap.put("func_ver", String.valueOf(cRPWatchFaceStoreRequestInfo.getFeature()));
            str = f12846j;
        } else if (i9 != 3) {
            str = null;
        } else {
            hashMap.put(f12860x, "");
            hashMap.put(f12857u, "");
            str = f12845i;
        }
        com.crrepa.x.a.b(str, hashMap, new b(cRPWatchFaceStoreCallback, cRPWatchFaceStoreRequestInfo));
    }

    public void a(CRPWatchFaceStoreRequestInfo cRPWatchFaceStoreRequestInfo, CRPWatchFaceStoreTagCallback cRPWatchFaceStoreTagCallback) {
        String str;
        if (cRPWatchFaceStoreRequestInfo == null) {
            throw new RuntimeException("CRPWatchFaceStoreRequestInfo is null!");
        }
        if (cRPWatchFaceStoreTagCallback == null) {
            throw new RuntimeException("CRPWatchFaceStoreTagCallback is null!");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lang", "en");
        hashMap.put("tpls", h.a(cRPWatchFaceStoreRequestInfo.getTypeList()));
        hashMap.put("fv", cRPWatchFaceStoreRequestInfo.getFirmwareVersion());
        hashMap.put("per_page", String.valueOf(cRPWatchFaceStoreRequestInfo.getPerPageCount()));
        hashMap.put("p", String.valueOf(cRPWatchFaceStoreRequestInfo.getPageIndex()));
        hashMap.put("max_size", String.valueOf(cRPWatchFaceStoreRequestInfo.getMaxSize()));
        hashMap.put("tested", f12838b);
        int i8 = d.f12871a[cRPWatchFaceStoreRequestInfo.getStoreType().ordinal()];
        if (i8 == 1) {
            hashMap.put(f12857u, "");
            str = f12841e;
        } else if (i8 != 2) {
            str = i8 != 3 ? null : f12842f;
        } else {
            hashMap.put("api_ver", String.valueOf(cRPWatchFaceStoreRequestInfo.getApiVersion()));
            hashMap.put("func_ver", String.valueOf(cRPWatchFaceStoreRequestInfo.getFeature()));
            str = f12843g;
        }
        com.crrepa.x.a.b(str, hashMap, new C0217a(cRPWatchFaceStoreTagCallback));
    }
}
