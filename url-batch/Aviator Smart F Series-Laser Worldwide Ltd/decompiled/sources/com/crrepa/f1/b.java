package com.crrepa.f1;

import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;
import com.crrepa.ble.conn.callback.CRPWatchFaceDetailsCallback;
import com.crrepa.ble.trans.watchface.entity.WatchFaceEntity;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import com.crrepa.y.d;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12872b = "https://api.moyoung.com/face-detail";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12873c = "id";

    /* renamed from: a, reason: collision with root package name */
    private CRPWatchFaceDetailsCallback f12874a;

    class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12875a;

        a(int i8) {
            this.f12875a = i8;
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            b.this.a();
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            if (!(obj instanceof String)) {
                b.this.a();
            } else {
                b.this.a((String) obj, this.f12875a);
            }
        }
    }

    public b(CRPWatchFaceDetailsCallback cRPWatchFaceDetailsCallback) {
        this.f12874a = cRPWatchFaceDetailsCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f12874a.onError("Network exception");
    }

    public void a(int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(i8));
        com.crrepa.x.a.b(f12872b, hashMap, new a(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i8) {
        BleLog.d("response: " + str);
        WatchFaceEntity watchFaceEntity = (WatchFaceEntity) k.a(str, WatchFaceEntity.class);
        if (watchFaceEntity == null || watchFaceEntity.getCode() != 0) {
            a();
            return;
        }
        this.f12874a.onWatchFaceChange(new CRPWatchFaceStoreInfo.WatchFaceBean(i8, watchFaceEntity.getPreview(), watchFaceEntity.getFile()));
    }
}
