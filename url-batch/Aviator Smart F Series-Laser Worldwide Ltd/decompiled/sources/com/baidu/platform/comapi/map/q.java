package com.baidu.platform.comapi.map;

import android.os.Bundle;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class q implements com.baidu.platform.comjni.map.basemap.a {

    /* renamed from: a, reason: collision with root package name */
    static final String f9783a = "com.baidu.platform.comapi.map.q";

    /* renamed from: b, reason: collision with root package name */
    Map<Long, InnerOverlay> f9784b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    AppBaseMap f9785c;

    public q(AppBaseMap appBaseMap) {
        this.f9785c = appBaseMap;
    }

    @Override // com.baidu.platform.comjni.map.basemap.a
    public int a(Bundle bundle, long j8, int i8) {
        long currentTimeMillis = l.f9781a ? System.currentTimeMillis() : 0L;
        InnerOverlay innerOverlay = this.f9784b.get(Long.valueOf(j8));
        if (innerOverlay != null && (innerOverlay instanceof com.baidu.mapsdkplatform.comapi.map.z.a)) {
            com.baidu.mapsdkplatform.comapi.map.z.a aVar = (com.baidu.mapsdkplatform.comapi.map.z.a) innerOverlay;
            if (aVar.c()) {
                bundle.putString("statusupdate", innerOverlay.getData());
                if (!aVar.b()) {
                    aVar.c(false);
                }
                return aVar.getType();
            }
        }
        if (innerOverlay == null) {
            return 0;
        }
        String data = innerOverlay.getData();
        if (this.f9785c.LayersIsShow(j8)) {
            bundle.putString("jsondata", data);
            Bundle param = innerOverlay.getParam();
            if (param != null) {
                bundle.putBundle("param", param);
            }
        } else {
            bundle.putString("jsondata", null);
        }
        if (l.f9781a) {
            l.a(f9783a, "MapLayerDataReq:" + j8 + " tag:" + innerOverlay.getLayerTag() + " [" + (System.currentTimeMillis() - currentTimeMillis) + "ms] LayerData:" + data);
        }
        return innerOverlay.getType();
    }

    @Override // com.baidu.platform.comjni.map.basemap.a
    public boolean a(long j8) {
        return this.f9784b.containsKey(Long.valueOf(j8));
    }

    public void a(InnerOverlay innerOverlay) {
        this.f9784b.put(Long.valueOf(innerOverlay.mLayerID), innerOverlay);
        innerOverlay.SetMapParam(innerOverlay.mLayerID, this.f9785c);
    }

    public void a(Overlay overlay) {
        this.f9784b.remove(Long.valueOf(overlay.mLayerID));
    }

    public void a() {
        if (this.f9785c != null) {
            for (Long l8 : this.f9784b.keySet()) {
                if (l8.longValue() > 0) {
                    this.f9785c.ClearLayer(l8.longValue());
                    this.f9785c.RemoveLayer(l8.longValue());
                }
            }
        }
        this.f9784b.clear();
    }
}
