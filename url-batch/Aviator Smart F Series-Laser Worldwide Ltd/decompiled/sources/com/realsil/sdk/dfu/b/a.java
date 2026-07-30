package com.realsil.sdk.dfu.b;

import android.content.Context;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import com.realsil.sdk.dfu.utils.DfuAdapter;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public b f15692a;

    /* renamed from: b, reason: collision with root package name */
    public BaseDfuTask f15693b;

    /* renamed from: c, reason: collision with root package name */
    public String f15694c;

    /* renamed from: d, reason: collision with root package name */
    public OtaDeviceInfo f15695d;

    /* renamed from: e, reason: collision with root package name */
    public Context f15696e;

    /* renamed from: f, reason: collision with root package name */
    public DfuAdapter.DfuHelperCallback f15697f = new C0326a();

    /* renamed from: com.realsil.sdk.dfu.b.a$a, reason: collision with other inner class name */
    public class C0326a extends DfuAdapter.DfuHelperCallback {
        public C0326a() {
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int i8, int i9) {
            super.onError(i8, i9);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int i8) {
            super.onProcessStateChanged(i8);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(DfuProgressInfo dfuProgressInfo) {
            super.onProgressChanged(dfuProgressInfo);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(int i8) {
            a aVar;
            OtaDeviceInfo otaDeviceInfo;
            super.onStateChanged(i8);
            if (i8 == 527) {
                aVar = a.this;
                otaDeviceInfo = aVar.f15692a.getOtaDeviceInfo();
            } else {
                if (i8 != 4097 && i8 != 4098) {
                    return;
                }
                aVar = a.this;
                otaDeviceInfo = null;
            }
            aVar.f15695d = otaDeviceInfo;
        }
    }

    public a(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        this.f15696e = context;
        this.f15693b = com.realsil.sdk.dfu.j.a.a(context, dfuConfig, dfuThreadCallback);
        this.f15692a = new b(context, this.f15697f);
        this.f15694c = dfuConfig.getAddress();
    }

    public void b() {
        this.f15692a.connectDevice(new ConnectParams.Builder().address(this.f15694c).build());
    }

    public boolean c() {
        this.f15693b.onDestroy();
        return true;
    }

    public void d() {
        this.f15693b.start();
    }

    public boolean a() {
        this.f15693b.abort();
        return true;
    }
}
