package com.crrepa.f1;

import com.crrepa.a1.h;
import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;
import com.crrepa.ble.conn.callback.CRPWatchFaceStoreCallback;
import com.crrepa.ble.trans.watchface.entity.SifliWatchFaceStoreEntity;
import com.crrepa.ble.trans.watchface.entity.WatchFaceStoreEntity;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import com.crrepa.y.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12877b = "https://api.moyoung.com/v2/faces";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12878c = "https://api.moyoung.com/sifli/faces";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12879d = "tpls";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12880e = "fv";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12881f = "per_page";

    /* renamed from: g, reason: collision with root package name */
    private static final String f12882g = "p";

    /* renamed from: h, reason: collision with root package name */
    private static final String f12883h = "max_size";

    /* renamed from: a, reason: collision with root package name */
    private CRPWatchFaceStoreCallback f12884a;

    class a extends d {
        a() {
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            c.this.a();
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            if (!(obj instanceof String)) {
                c.this.a();
            } else {
                c.this.b((String) obj);
            }
        }
    }

    class b extends d {
        b() {
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            c.this.a();
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            if (!(obj instanceof String)) {
                c.this.a();
            } else {
                c.this.a((String) obj);
            }
        }
    }

    public c(CRPWatchFaceStoreCallback cRPWatchFaceStoreCallback) {
        this.f12884a = cRPWatchFaceStoreCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f12884a.onError("Network exception");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BleLog.d("response: " + str);
        WatchFaceStoreEntity watchFaceStoreEntity = (WatchFaceStoreEntity) k.a(str, WatchFaceStoreEntity.class);
        if (watchFaceStoreEntity == null || watchFaceStoreEntity.getCode() != 0) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<WatchFaceStoreEntity.FacesBean> faces = watchFaceStoreEntity.getFaces();
        if (faces == null || faces.isEmpty()) {
            this.f12884a.onWatchFaceStoreChange(null);
            return;
        }
        for (WatchFaceStoreEntity.FacesBean facesBean : faces) {
            arrayList.add(new CRPWatchFaceStoreInfo.WatchFaceBean(facesBean.getId(), facesBean.getPreview(), facesBean.getFile()));
        }
        try {
            this.f12884a.onWatchFaceStoreChange(new CRPWatchFaceStoreInfo(watchFaceStoreEntity.getTotal(), arrayList));
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    public void a(int i8, String str, int i9, int i10, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put("tpls", String.valueOf(i8));
        hashMap.put("fv", str);
        hashMap.put("per_page", String.valueOf(i9));
        hashMap.put("p", String.valueOf(i10));
        hashMap.put("max_size", String.valueOf(i11));
        com.crrepa.x.a.b(f12878c, hashMap, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BleLog.d("response: " + str);
        SifliWatchFaceStoreEntity sifliWatchFaceStoreEntity = (SifliWatchFaceStoreEntity) k.a(str, SifliWatchFaceStoreEntity.class);
        if (sifliWatchFaceStoreEntity == null || sifliWatchFaceStoreEntity.getCode() != 0) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<SifliWatchFaceStoreEntity.FacesBean> faces = sifliWatchFaceStoreEntity.getFaces();
        if (faces == null || faces.isEmpty()) {
            this.f12884a.onWatchFaceStoreChange(null);
            return;
        }
        for (SifliWatchFaceStoreEntity.FacesBean facesBean : faces) {
            arrayList.add(new CRPWatchFaceStoreInfo.WatchFaceBean(facesBean.getId(), facesBean.getPreview(), facesBean.getFile()));
        }
        try {
            this.f12884a.onWatchFaceStoreChange(new CRPWatchFaceStoreInfo(sifliWatchFaceStoreEntity.getTotal(), arrayList));
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    public void a(List<Integer> list, String str, int i8, int i9) {
        String a8 = h.a(list);
        HashMap hashMap = new HashMap();
        hashMap.put("tpls", a8);
        hashMap.put("fv", str);
        hashMap.put("per_page", String.valueOf(i8));
        hashMap.put("p", String.valueOf(i9));
        com.crrepa.x.a.b(f12877b, hashMap, new a());
    }
}
