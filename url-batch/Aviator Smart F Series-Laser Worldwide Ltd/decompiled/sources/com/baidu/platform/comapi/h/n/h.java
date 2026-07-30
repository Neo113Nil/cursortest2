package com.baidu.platform.comapi.h.n;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.bikenavi.params.BikeNaviLaunchParam;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.walknavi.params.WalkNaviLaunchParam;
import com.baidu.mapsdkplatform.comapi.map.MessageCenter;
import com.baidu.platform.comapi.h.h.e;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.baidu.platform.comapi.wnplatform.model.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: c, reason: collision with root package name */
    private List<e> f9191c;

    /* renamed from: d, reason: collision with root package name */
    private List<b> f9192d;

    /* renamed from: e, reason: collision with root package name */
    private List<f> f9193e;

    /* renamed from: j, reason: collision with root package name */
    private Handler f9198j;

    /* renamed from: a, reason: collision with root package name */
    private f f9189a = null;

    /* renamed from: b, reason: collision with root package name */
    private d f9190b = null;

    /* renamed from: f, reason: collision with root package name */
    private Object f9194f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private int f9195g = 1;

    /* renamed from: h, reason: collision with root package name */
    private int f9196h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9197i = false;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        @SuppressLint({"HandlerLeak"})
        public void handleMessage(Message message) {
            com.baidu.platform.comapi.h.g.a.b("WRoutePlaner", "msg.arg1" + message.arg1 + "; msg.what" + message.what);
            int i8 = message.what;
            if (i8 != 4099) {
                if (i8 == 2008) {
                    if (com.baidu.platform.comapi.h.c.b().j() && h.this.f9191c != null && !h.this.f9191c.isEmpty() && !com.baidu.platform.comapi.walknavi.b.n().R()) {
                        if (com.baidu.platform.comapi.walknavi.b.n().g().a(h.this.b())) {
                            h.this.f9197i = true;
                            Iterator it = h.this.f9191c.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).b();
                            }
                        } else {
                            h.this.f9197i = false;
                            Iterator it2 = h.this.f9191c.iterator();
                            while (it2.hasNext()) {
                                ((e) it2.next()).a(message.arg1);
                            }
                        }
                    }
                    if (!com.baidu.platform.comapi.h.c.b().e() || h.this.f9192d == null || h.this.f9192d.isEmpty() || com.baidu.platform.comapi.walknavi.b.n().R()) {
                        return;
                    }
                    if (com.baidu.platform.comapi.walknavi.b.n().g().a(h.this.b())) {
                        h.this.f9197i = true;
                        Iterator it3 = h.this.f9192d.iterator();
                        while (it3.hasNext()) {
                            ((b) it3.next()).b();
                        }
                        return;
                    }
                    h.this.f9197i = false;
                    Iterator it4 = h.this.f9192d.iterator();
                    while (it4.hasNext()) {
                        ((b) it4.next()).a(message.arg1);
                    }
                    return;
                }
                return;
            }
            int i9 = message.arg1;
            int i10 = message.arg2;
            if (i9 == 0) {
                Bundle bundle = new Bundle();
                if (com.baidu.platform.comapi.walknavi.b.n().s().l(bundle)) {
                    j.a().a(message.what, 0, 0, bundle);
                }
            }
            if (i9 == 0 && com.baidu.platform.comapi.h.c.b().d()) {
                if (com.baidu.platform.comapi.walknavi.b.n().g().a(h.this.c())) {
                    com.baidu.platform.comapi.wnplatform.model.c g8 = com.baidu.platform.comapi.walknavi.b.n().g();
                    h hVar = h.this;
                    g8.a(hVar.c(hVar.f9195g), h.this.f9195g);
                    com.baidu.platform.comapi.walknavi.b.n().g().a(com.baidu.platform.comapi.walknavi.b.n().s().m());
                }
                h.this.d(0);
            }
            if (i10 == 1 || i10 == 0) {
                if (i9 != 0) {
                    h.this.a(2, i9);
                    if (h.this.f9190b != null) {
                        h.this.f9190b.a(i9);
                        return;
                    }
                    return;
                }
                if (com.baidu.platform.comapi.walknavi.b.n().g().a(h.this.c()) || com.baidu.platform.comapi.walknavi.b.n().N() != null) {
                    com.baidu.platform.comapi.wnplatform.model.c g9 = com.baidu.platform.comapi.walknavi.b.n().g();
                    h hVar2 = h.this;
                    g9.a(hVar2.c(hVar2.f9195g), h.this.f9195g);
                    com.baidu.platform.comapi.walknavi.b.n().g().a(com.baidu.platform.comapi.walknavi.b.n().s().m());
                }
                h.this.d(1);
                if (h.this.f9190b != null) {
                    h.this.f9190b.a();
                }
            }
        }
    }

    public h() {
        a aVar = new a();
        this.f9198j = aVar;
        MessageCenter.registMessage(2008, aVar);
        MessageCenter.registMessage(4099, this.f9198j);
        d();
    }

    private void d() {
    }

    public void e() {
        com.baidu.platform.comapi.walknavi.b.n().s().w();
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        MessageCenter.unregistMessage(4099, this.f9198j);
        MessageCenter.unregistMessage(2008, this.f9198j);
        this.f9189a = null;
        this.f9193e = null;
        this.f9190b = null;
        this.f9197i = false;
        this.f9198j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle c(int i8) {
        return com.baidu.platform.comapi.walknavi.b.n().s().f(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i8) {
        a(i8, 0);
    }

    public com.baidu.platform.comapi.h.h.a b() {
        if (this.f9196h != 0) {
            return com.baidu.platform.comapi.walknavi.b.n().s().d(this.f9196h);
        }
        return null;
    }

    public com.baidu.platform.comapi.h.h.a c() {
        return com.baidu.platform.comapi.walknavi.b.n().s().l();
    }

    public void b(f fVar) {
        synchronized (this.f9194f) {
            try {
                List<f> list = this.f9193e;
                if (list != null && list.size() > 0) {
                    this.f9193e.remove(fVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, int i9) {
        synchronized (this.f9194f) {
            try {
                List<f> list = this.f9193e;
                if (list != null && list.size() > 0) {
                    for (f fVar : new ArrayList(this.f9193e)) {
                        if (i8 == 0) {
                            fVar.a();
                        } else if (i8 == 1) {
                            fVar.onRoutePlanSuccess();
                        } else if (i8 == 2) {
                            fVar.a(i9);
                        } else if (i8 == 3) {
                            fVar.onRoutePlanStart();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(e eVar) {
        List<e> list = this.f9191c;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f9191c.remove(eVar);
    }

    public void b(b bVar) {
        List<b> list = this.f9192d;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f9192d.remove(bVar);
    }

    public void a(f fVar) {
        if (fVar != null) {
            if (this.f9193e == null) {
                this.f9193e = new ArrayList();
            }
            if (this.f9193e.contains(fVar)) {
                return;
            }
            this.f9193e.add(fVar);
        }
    }

    public void a(e eVar) {
        if (eVar != null) {
            if (this.f9191c == null) {
                this.f9191c = new ArrayList();
            }
            if (this.f9191c.contains(eVar)) {
                return;
            }
            this.f9191c.add(eVar);
        }
    }

    public void a(b bVar) {
        if (bVar != null) {
            if (this.f9192d == null) {
                this.f9192d = new ArrayList();
            }
            if (this.f9192d.contains(bVar)) {
                return;
            }
            this.f9192d.add(bVar);
        }
    }

    public boolean a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr) {
        return com.baidu.platform.comapi.walknavi.b.n().s().a(iArr, iArr2, iArr3, iArr4, strArr);
    }

    public boolean a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, String[] strArr2, String[] strArr3) {
        return com.baidu.platform.comapi.walknavi.b.n().s().a(iArr, iArr2, iArr3, iArr4, strArr, strArr2, strArr3);
    }

    public int a(int i8, int i9, int i10, int i11, byte[] bArr, MapLanguage mapLanguage, String str) {
        d(3);
        return com.baidu.platform.comapi.walknavi.b.n().s().a(i8, i9, i10, i11, bArr, mapLanguage, str);
    }

    public int a(WalkNaviLaunchParam walkNaviLaunchParam) {
        List<e> list = this.f9191c;
        if (list != null && !list.isEmpty()) {
            Iterator<e> it = this.f9191c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
        if (j8 != null && j8.e() != null) {
            mapLanguage = j8.e();
        }
        this.f9196h = com.baidu.platform.comapi.walknavi.b.n().s().a(a(walkNaviLaunchParam, mapLanguage));
        return 0;
    }

    public int a(BikeNaviLaunchParam bikeNaviLaunchParam) {
        List<b> list = this.f9192d;
        if (list != null && !list.isEmpty()) {
            Iterator<b> it = this.f9192d.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
        if (j8 != null && j8.e() != null) {
            mapLanguage = j8.e();
        }
        this.f9196h = com.baidu.platform.comapi.walknavi.b.n().s().a(a(bikeNaviLaunchParam, mapLanguage));
        return 0;
    }

    private String a(WalkNaviLaunchParam walkNaviLaunchParam, MapLanguage mapLanguage) {
        String str;
        com.baidu.platform.comapi.h.h.e eVar = new com.baidu.platform.comapi.h.h.e();
        eVar.a("language", MapLanguage.ENGLISH == mapLanguage ? "en" : "cn");
        eVar.a("qt", "walkplan");
        eVar.a("sn", walkNaviLaunchParam.getStartNodeInfo().toQuery());
        eVar.a("en", walkNaviLaunchParam.getEndNodeInfo().toQuery());
        eVar.a("run", 0);
        eVar.a("mt_rt", -1);
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < walkNaviLaunchParam.getViaNodes().size(); i8++) {
            try {
                jSONArray.put(new JSONObject(walkNaviLaunchParam.getViaNodes().get(i8).toQuery()));
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        if (jSONArray.length() != 0) {
            eVar.a("wp", jSONArray.toString());
        }
        int citycode = walkNaviLaunchParam.getStartNodeInfo().getCitycode();
        if (citycode != -1) {
            eVar.a("sc", citycode);
        }
        WLocData b8 = com.baidu.platform.comapi.walknavi.b.n().q().b();
        if (b8 != null && (str = b8.cityCode) != null && !str.isEmpty()) {
            eVar.a("c", str);
        }
        int citycode2 = walkNaviLaunchParam.getEndNodeInfo().getCitycode();
        if (citycode2 != -1) {
            eVar.a("ec", citycode2);
        }
        eVar.a("version", 6);
        eVar.a("rp_format", "pb");
        eVar.a("from_navi", 0);
        eVar.a("spath_type", 1);
        if (PermissionUtils.getInstance().isIndoorNaviAuthorized()) {
            eVar.a("with_indoor_navi", 1);
        }
        eVar.a(13);
        eVar.a(true);
        eVar.b(false);
        eVar.a(e.a.PROTOBUF);
        eVar.a(e.b.GET);
        eVar.b(FAUEnum.PR_ANIMATE_FAILED);
        return eVar.toString();
    }

    private String a(BikeNaviLaunchParam bikeNaviLaunchParam, MapLanguage mapLanguage) {
        int i8;
        String str;
        com.baidu.platform.comapi.h.h.e eVar = new com.baidu.platform.comapi.h.h.e();
        eVar.a("language", MapLanguage.ENGLISH == mapLanguage ? "en" : "cn");
        eVar.a("qt", "cycleplan");
        eVar.a("ie", "utf-8");
        eVar.a("sn", bikeNaviLaunchParam.getStartNodeInfo().toQuery());
        eVar.a("en", bikeNaviLaunchParam.getEndNodeInfo().toQuery());
        eVar.a("vehicle", bikeNaviLaunchParam.getVehicle());
        try {
            i8 = Integer.parseInt(bikeNaviLaunchParam.mRoadPrefer, 0);
        } catch (Exception unused) {
            i8 = 0;
        }
        eVar.a("road_prefer", i8);
        eVar.a("mt_rt", -1);
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < bikeNaviLaunchParam.getViaNodes().size(); i9++) {
            try {
                jSONArray.put(new JSONObject(bikeNaviLaunchParam.getViaNodes().get(i9).toQuery()));
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        if (jSONArray.length() != 0) {
            eVar.a("wp", jSONArray.toString());
        }
        int cityCode = bikeNaviLaunchParam.getStartNodeInfo().getCityCode();
        if (cityCode != -1) {
            eVar.a("sc", cityCode);
        }
        WLocData b8 = com.baidu.platform.comapi.walknavi.b.n().q().b();
        if (b8 != null && (str = b8.cityCode) != null && !str.isEmpty()) {
            eVar.a("c", str);
        }
        int cityCode2 = bikeNaviLaunchParam.getEndNodeInfo().getCityCode();
        if (cityCode2 != -1) {
            eVar.a("ec", cityCode2);
        }
        eVar.a("version", 6);
        eVar.a("rp_format", "pb");
        eVar.a("from_navi", 0);
        eVar.a("spath_type", 1);
        if (PermissionUtils.getInstance().isIndoorNaviAuthorized()) {
            eVar.a("with_indoor_navi", 1);
        }
        eVar.a("wb_ver", 1);
        eVar.a(14);
        eVar.a(true);
        eVar.b(false);
        eVar.a(e.a.PROTOBUF);
        eVar.a(e.b.GET);
        eVar.b(219);
        return eVar.toString();
    }
}
