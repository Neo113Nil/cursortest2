package com.crrepa.n;

import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.crrepa.ble.conn.bean.CRPAppStoreInfo;
import com.crrepa.ble.conn.bean.CRPSupportAppInfo;
import com.crrepa.ble.conn.listener.CRPAppChangeListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import h4.g;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private CRPAppChangeListener f13361a;

    /* renamed from: b, reason: collision with root package name */
    private int f13362b;

    /* renamed from: c, reason: collision with root package name */
    private List<CRPAppInfo> f13363c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13364d;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13365a = new a();

        private b() {
        }
    }

    private a() {
        this.f13363c = new ArrayList();
        this.f13364d = true;
    }

    public static a a() {
        return b.f13365a;
    }

    public void b(byte[] bArr) {
        if (this.f13361a == null || bArr.length < 3) {
            return;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        String str = new String(bArr2, StandardCharsets.UTF_8);
        BleLog.d("onAppStoreInfo: " + str);
        CRPAppStoreInfo cRPAppStoreInfo = (CRPAppStoreInfo) k.a(str, CRPAppStoreInfo.class);
        if (cRPAppStoreInfo != null) {
            this.f13361a.onAppStoreInfo(cRPAppStoreInfo);
        }
    }

    public void c(byte[] bArr) {
        if (bArr.length < 2) {
            return;
        }
        if (this.f13364d) {
            com.crrepa.r0.a.b().a(com.crrepa.g1.c.a(bArr[1]));
            return;
        }
        CRPAppChangeListener cRPAppChangeListener = this.f13361a;
        if (cRPAppChangeListener == null) {
            return;
        }
        byte b8 = bArr[1];
        if (b8 == 0) {
            cRPAppChangeListener.onUninstallSuccess();
        } else {
            cRPAppChangeListener.onUninstallFail(com.crrepa.g1.c.a(b8));
        }
    }

    public void d(byte[] bArr) {
        if (this.f13361a == null || bArr.length < 13) {
            return;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 1, bArr2, 0, 4);
        int f8 = (int) com.crrepa.g1.c.f(bArr2);
        System.arraycopy(bArr, 5, bArr2, 0, 4);
        int f9 = (int) com.crrepa.g1.c.f(bArr2);
        System.arraycopy(bArr, 9, bArr2, 0, 4);
        int f10 = (int) com.crrepa.g1.c.f(bArr2);
        this.f13362b = f10;
        this.f13361a.onSupportAppInfo(new CRPSupportAppInfo(f8, f9, f10));
        this.f13363c.clear();
    }

    public void a(int i8) {
        CRPAppChangeListener cRPAppChangeListener = this.f13361a;
        if (cRPAppChangeListener == null) {
            return;
        }
        cRPAppChangeListener.onAvailableSize(i8);
    }

    public void a(CRPAppChangeListener cRPAppChangeListener) {
        this.f13361a = cRPAppChangeListener;
    }

    public void a(boolean z7) {
        this.f13364d = z7;
    }

    public void a(byte[] bArr) {
        if (this.f13361a == null || bArr.length < 9) {
            return;
        }
        this.f13363c.add(g.a(bArr));
        if (this.f13362b <= this.f13363c.size()) {
            this.f13361a.onInstalledAppList(this.f13363c);
        }
    }
}
