package x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.mltcode.paycertification.call.VerificationListener;
import com.android.mltcode.paycertification.entitys.JsonData;
import com.android.mltcode.paycertification.entitys.ServerResponse;
import com.android.mltcode.paycertification.sm2.SM2Util;
import com.android.mltcode.paycertification.utils.Constant;
import com.android.mltcode.paycertificationapi.IWrite;
import com.baidu.ar.constants.HttpConstants;
import com.blankj.utilcode.util.i0;
import com.blankj.utilcode.util.n;
import com.blankj.utilcode.util.r;
import com.yanzhenjie.kalle.s;
import com.yanzhenjie.kalle.simple.g;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    public static h E;

    /* renamed from: r, reason: collision with root package name */
    public Context f17302r;

    /* renamed from: v, reason: collision with root package name */
    public int f17306v;

    /* renamed from: a, reason: collision with root package name */
    public final byte f17285a = a4.a.R1;

    /* renamed from: b, reason: collision with root package name */
    public final byte f17286b = a4.a.f28d2;

    /* renamed from: c, reason: collision with root package name */
    public final byte f17287c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final byte f17288d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final byte f17289e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final byte f17290f = 3;

    /* renamed from: g, reason: collision with root package name */
    public final byte f17291g = 4;

    /* renamed from: h, reason: collision with root package name */
    public final byte f17292h = 5;

    /* renamed from: i, reason: collision with root package name */
    public final byte f17293i = 6;

    /* renamed from: j, reason: collision with root package name */
    public final byte f17294j = 7;

    /* renamed from: k, reason: collision with root package name */
    public final byte f17295k = 8;

    /* renamed from: l, reason: collision with root package name */
    public final byte f17296l = 11;

    /* renamed from: m, reason: collision with root package name */
    public final byte f17297m = 12;

    /* renamed from: n, reason: collision with root package name */
    public final int f17298n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final int f17299o = 1;

    /* renamed from: p, reason: collision with root package name */
    public int f17300p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f17301q = 0;

    /* renamed from: s, reason: collision with root package name */
    public String f17303s = "";

    /* renamed from: t, reason: collision with root package name */
    public IWrite f17304t = null;

    /* renamed from: u, reason: collision with root package name */
    public Map<Integer, byte[]> f17305u = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public byte f17307w = 2;

    /* renamed from: x, reason: collision with root package name */
    public String f17308x = "";

    /* renamed from: y, reason: collision with root package name */
    public String f17309y = "";

    /* renamed from: z, reason: collision with root package name */
    public String f17310z = "";
    public l A = null;
    public byte[] B = null;
    public int C = 1000;
    public String D = "";

    public class a extends com.yanzhenjie.kalle.simple.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VerificationListener f17311a;

        public a(VerificationListener verificationListener) {
            this.f17311a = verificationListener;
        }

        @Override // com.yanzhenjie.kalle.simple.h, com.yanzhenjie.kalle.simple.d
        public void onException(Exception exc) {
            super.onException(exc);
            g.b("PayCertification", "错误信息 -> " + exc.getMessage());
            h.this.a(this.f17311a, Constant.RESULT_CODE_4305);
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public void onResponse(com.yanzhenjie.kalle.simple.j jVar) {
            ServerResponse serverResponse;
            boolean isSucceed = jVar.isSucceed();
            g.b("PayCertification", "onResponse: post -> " + isSucceed + ", httpCode -> " + jVar.code());
            if (!isSucceed) {
                h.this.C = jVar.code();
                g.a("PayCertification", "onResponse: 请求失败, 错误码 = " + h.this.C);
                h.this.a(this.f17311a, Constant.RESULT_CODE_4305);
                return;
            }
            String str = (String) jVar.succeed();
            g.a("PayCertification", "onResponse: 请求数据返回 = " + str);
            JsonData jsonData = null;
            try {
                serverResponse = (ServerResponse) n.fromJson(str, ServerResponse.class);
            } catch (Exception e8) {
                e8.printStackTrace();
                g.b("PayCertification", "onResponse: post -> tag Exception 01");
                serverResponse = null;
            }
            g.b("PayCertification", "onResponse: post -> tag 01");
            if (serverResponse == null) {
                g.a("PayCertification", "onResponse: 解析数据失败， serverResponse == null");
                h.this.a(this.f17311a, Constant.RESULT_CODE_4305);
                return;
            }
            g.b("PayCertification", "onResponse: post -> tag 02");
            try {
                jsonData = (JsonData) n.fromJson(com.blankj.utilcode.util.g.bytes2String(SM2Util.decrypt(SM2Engine.Mode.C1C2C3, x.a.a().b(), com.blankj.utilcode.util.g.hexString2Bytes(serverResponse.data))), JsonData.class);
            } catch (Exception e9) {
                e9.printStackTrace();
                g.b("PayCertification", "onResponse: post -> tag Exception 02");
            }
            g.a("PayCertification", "onResponse: serverResponse = " + n.toJson(serverResponse));
            if (jsonData == null) {
                g.a("PayCertification", "onResponse: dataModel == null， error Code = 3000");
                h.this.a(this.f17311a, 3000);
                return;
            }
            g.b("PayCertification", "onResponse: post -> tag 03");
            h.this.f17301q = jsonData.nextReqTime;
            h.this.C = jsonData.errCode;
            g.a("PayCertification", "onResponse: dataModel = " + n.toJson(jsonData));
            h hVar = h.this;
            hVar.a(hVar.b((int) (serverResponse.timestamp / 1000), hVar.f17307w), (byte) 7);
            h.this.D = jsonData.offlineVoiceKey;
            h hVar2 = h.this;
            hVar2.a(hVar2.a(com.blankj.utilcode.util.g.hexString2Bytes(jsonData.data)), (byte) 3);
            g.b("PayCertification", "onResponse: post -> tag 04");
        }
    }

    public class b extends com.yanzhenjie.kalle.simple.h {
        public b() {
        }

        @Override // com.yanzhenjie.kalle.simple.h, com.yanzhenjie.kalle.simple.d
        public void onCancel() {
            super.onCancel();
            g.b("PayCertification", "cancel http");
        }

        @Override // com.yanzhenjie.kalle.simple.h, com.yanzhenjie.kalle.simple.d
        public void onEnd() {
            super.onEnd();
            g.b("PayCertification", "end http");
        }

        @Override // com.yanzhenjie.kalle.simple.h, com.yanzhenjie.kalle.simple.d
        public void onException(Exception exc) {
            super.onException(exc);
            g.b("PayCertification", "sendSyncOfflineVoiceStatus error -> " + exc.getMessage());
        }

        @Override // com.yanzhenjie.kalle.simple.d
        public void onResponse(com.yanzhenjie.kalle.simple.j jVar) {
            if (jVar.isSucceed()) {
                g.a("PayCertification", "sendSyncOfflineVoiceStatus 上报 -> " + ((String) jVar.succeed()));
                return;
            }
            g.a("PayCertification", "sendSyncOfflineVoiceStatus: 上报失败, 错误码 = " + jVar.code());
        }

        @Override // com.yanzhenjie.kalle.simple.h, com.yanzhenjie.kalle.simple.d
        public void onStart() {
            super.onStart();
            g.b("PayCertification", "start http");
        }
    }

    public final int a(int i8, int i9) {
        byte b8 = (byte) (((i8 & 255) ^ i9) + 85);
        byte b9 = (byte) ((((i8 >> 8) & 255) ^ i9) + 85);
        byte b10 = (byte) ((((i8 >> 16) & 255) ^ i9) + 85);
        return ((((byte) ((((i8 >> 24) & 255) ^ i9) + 85)) << 24) & (-16777216)) | (b8 & 255) | ((b9 << 8) & 65280) | ((b10 << 16) & 16711680);
    }

    @SuppressLint({"MissingPermission"})
    public final boolean c() {
        if (this.f17304t == null) {
            return false;
        }
        k kVar = new k(4);
        kVar.a(a4.a.R1);
        kVar.a(a4.a.f28d2);
        kVar.a((byte) 1);
        kVar.a((byte) 0);
        return this.f17304t.onWrite(kVar.a());
    }

    public final void d(byte[] bArr, VerificationListener verificationListener) {
        i iVar = new i(bArr, bArr.length);
        iVar.b(4);
        if (iVar.b() != 0) {
            a(a(this.B), (byte) 1);
        } else {
            a(this.f17301q);
            verificationListener.onSuccess();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final boolean b(int i8) {
        this.f17300p = i8;
        k kVar = new k(4);
        kVar.a(a4.a.R1);
        kVar.a(a4.a.f28d2);
        kVar.a((byte) 5);
        kVar.a((byte) 0);
        return this.f17304t.onWrite(kVar.a());
    }

    public final void c(byte[] bArr, VerificationListener verificationListener) {
        i iVar = new i(bArr, bArr.length);
        iVar.b(4);
        byte b8 = iVar.b();
        if (b8 == 0) {
            a(this.f17301q);
            verificationListener.onSuccess();
            if (!TextUtils.isEmpty(this.D)) {
                a(this.D.getBytes(), (byte) 11);
                return;
            } else {
                g.a("PayCertification", "offlineVoiceKey is NULL");
                return;
            }
        }
        g.a("PayCertification", "receive0x04cmd: status = " + ((int) b8) + "， 错误码 = " + this.C);
        a(verificationListener, this.C);
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            try {
                if (E == null) {
                    E = new h();
                }
                hVar = E;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public final boolean b() {
        Context context = this.f17302r;
        if (context == null) {
            return false;
        }
        if (this.A == null) {
            this.A = new l(context);
        }
        return this.A.a(Constant.KEY_TIME_VALID, System.currentTimeMillis()) - System.currentTimeMillis() > 0;
    }

    @SuppressLint({"MissingPermission"})
    public synchronized boolean a(Context context, String str, IWrite iWrite) {
        g.a("PayCertification", "开始初始化");
        this.f17302r = context;
        this.f17303s = str;
        this.f17305u.clear();
        this.f17304t = iWrite;
        this.f17306v = 0;
        try {
            r.getConfig().setLogSwitch(true).setDir(i0.join(i0.getExternalAppDataPath(), "logs")).setLog2FileSwitch(true).setLogHeadSwitch(false).setBorderSwitch(false).setSaveDays(3);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        a(b((int) (System.currentTimeMillis() / 1000), 2), (byte) 8);
        if (b()) {
            g.a("PayCertification", "开始发送数据05");
            return b(0);
        }
        g.a("PayCertification", "开始发送数据01");
        return c();
    }

    public synchronized void b(byte[] bArr, VerificationListener verificationListener) {
        try {
            g.a("PayCertification", "distributionData: 接收蓝牙数据 = " + com.blankj.utilcode.util.g.bytes2HexString(bArr));
            i iVar = new i(bArr, bArr.length);
            byte b8 = iVar.b();
            byte b9 = iVar.b();
            byte b10 = iVar.b();
            iVar.b();
            if (b8 == -86 && b9 == -69) {
                if (b10 == 2) {
                    a(bArr, verificationListener);
                } else if (b10 == 6) {
                    d(bArr, verificationListener);
                } else if (b10 == 4) {
                    c(bArr, verificationListener);
                } else if (12 == b10) {
                    b(bArr);
                } else {
                    g.a("PayCertification", "distributionData: 没有匹配到命令 = command == " + ((int) b10) + ", 错误码 = " + this.C);
                    a(verificationListener, this.C);
                }
                return;
            }
            g.a("PayCertification", "distributionData: 包头不符合，错误码 = 1000");
            a(verificationListener, 1000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(byte[] bArr) {
        i iVar = new i(bArr, bArr.length);
        iVar.b(4);
        a(iVar.b());
    }

    public synchronized void a(byte[] bArr, VerificationListener verificationListener) {
        String str;
        try {
            i iVar = new i(bArr, bArr.length);
            byte b8 = iVar.b();
            byte b9 = iVar.b();
            byte b10 = iVar.b();
            int b11 = iVar.b() & 255;
            if (b8 == -86 && b9 == -69) {
                if (b10 != 2) {
                    return;
                }
                int length = bArr.length - 4;
                byte[] bArr2 = new byte[length];
                iVar.a(bArr2, length);
                this.f17305u.put(Integer.valueOf(b11), bArr2);
                int i8 = this.f17306v + length;
                this.f17306v = i8;
                if (b11 == 7 && this.f17305u != null && i8 >= 124) {
                    k kVar = new k(i8);
                    for (int i9 = 0; i9 < this.f17305u.size(); i9++) {
                        kVar.a(this.f17305u.get(Integer.valueOf(i9)));
                    }
                    i iVar2 = new i(kVar.a(), this.f17306v);
                    byte[] bArr3 = new byte[110];
                    iVar2.a(bArr3, 110);
                    byte[] bArr4 = new byte[2];
                    iVar2.a(bArr4, 2);
                    this.f17309y = new String(bArr4);
                    byte b12 = iVar2.b();
                    this.f17307w = b12;
                    byte b13 = iVar2.b();
                    byte b14 = iVar2.b();
                    byte b15 = iVar2.b();
                    iVar2.b(2);
                    byte[] bArr5 = new byte[6];
                    iVar2.a(bArr5, 6);
                    this.f17308x = new String(bArr5);
                    this.f17310z = this.f17302r.getPackageName();
                    try {
                        str = this.f17302r.getPackageManager().getPackageInfo(this.f17302r.getPackageName(), 0).versionName;
                    } catch (PackageManager.NameNotFoundException e8) {
                        e8.printStackTrace();
                        str = "0";
                    }
                    a(bArr3, bArr4, b12, b13, b14, b15, bArr5, this.f17310z, str, c.a(this.f17302r), iVar2.a(), verificationListener);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final byte[] b(int i8, int i9) {
        int a8 = a(i8, i9);
        k kVar = new k(4);
        kVar.b(a8);
        byte[] a9 = kVar.a();
        return new byte[]{a9[3], a9[2], a9[1], a9[0]};
    }

    public final void a(byte[] bArr, byte[] bArr2, byte b8, byte b9, byte b10, byte b11, byte[] bArr3, String str, String str2, String str3, byte[] bArr4, VerificationListener verificationListener) {
        g.b("PayCertification", "onResponse: authSyncTime -> start time");
        this.C = 1000;
        ByteBuffer allocate = ByteBuffer.allocate(14);
        try {
            allocate.put(bArr2);
            allocate.put(b8);
            allocate.put(b9);
            allocate.put(b10);
            allocate.put(b11);
            allocate.put(new byte[2]);
            allocate.put(bArr3);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", com.blankj.utilcode.util.g.bytes2HexString(bArr));
            jSONObject.put("manufactorCode", new String(bArr2, StandardCharsets.US_ASCII));
            jSONObject.put("productType", (int) b8);
            jSONObject.put("libType", (int) b9);
            jSONObject.put("mac", com.blankj.utilcode.util.g.bytes2HexString(bArr3));
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("deviceName", this.f17303s);
            jSONObject.put("packageName", str);
            jSONObject.put("weatchId", str3);
            jSONObject.put("versionInt", 100);
            jSONObject.put("appVersion", str2);
            jSONObject.put("appHexContent", com.blankj.utilcode.util.g.bytes2HexString(allocate.array()));
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        g.a("PayCertification", "authSyncTime: 发送数据参数:" + jSONObject2);
        byte[] bArr5 = new byte[0];
        try {
            bArr5 = SM2Util.encrypt(SM2Engine.Mode.C1C2C3, x.a.a().c(), com.blankj.utilcode.util.g.string2Bytes(jSONObject2));
        } catch (InvalidCipherTextException e10) {
            e10.printStackTrace();
        }
        String str4 = "01" + com.blankj.utilcode.util.g.bytes2HexString(bArr5);
        g.a("PayCertification", "authSyncTime: 加密后的的数据参数 = " + str4);
        g.b("PayCertification", "onResponse: authSyncTime -> start prepare time");
        ((g.b) ((g.b) ((g.b) com.yanzhenjie.kalle.k.post("https://api.lizheng.design/service/sdkConfigure/synTime").addHeader("appsign", "0773d4a362a84a6183f0764ff20b26ac")).addHeader("authsign", "204b2b54098a8e9126e61b3eb085ae6d")).body(new s(str4))).perform(new a(verificationListener));
    }

    public final void a(byte b8) {
        int i8 = b8 & 255;
        if (i8 == 0) {
            g.b("PayCertification", "sendSyncOfflineVoiceStatus OfflineVoice check SUCCESS");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", this.f17308x);
            jSONObject.put("pkg", this.f17310z);
            jSONObject.put(HttpConstants.HTTP_MANUFACTURER, this.f17309y);
            jSONObject.put("offlineStatus", i8);
            jSONObject.put("authorizationKey", this.D);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        g.b("PayCertification", "sendSyncOfflineVoiceStatus body ->" + jSONObject);
        ((g.b) ((g.b) ((g.b) com.yanzhenjie.kalle.k.post("https://api.lizheng.design/service/botwatch/api/errorReport").addHeader("appsign", "0773d4a362a84a6183f0764ff20b26ac")).addHeader("authsign", "204b2b54098a8e9126e61b3eb085ae6d")).body(new com.yanzhenjie.kalle.j(jSONObject.toString()))).perform(new b());
    }

    public final void a(byte[] bArr, byte b8) {
        int length = bArr == null ? 0 : bArr.length;
        ArrayList arrayList = new ArrayList();
        if (length > 16) {
            int i8 = length % 16;
            boolean z7 = i8 != 0;
            int i9 = z7 ? (length / 16) + 1 : length / 16;
            i iVar = new i(bArr, length);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                if (z7 && i10 == i9 - 1) {
                    byte[] bArr2 = new byte[i8];
                    iVar.a(bArr2, i8);
                    arrayList.add(bArr2);
                    break;
                } else {
                    byte[] bArr3 = new byte[16];
                    iVar.a(bArr3, 16);
                    arrayList.add(bArr3);
                    i10++;
                }
            }
        } else {
            arrayList.add(bArr);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr4 = (byte[]) arrayList.get(i11);
            k kVar = new k(bArr4.length + 4);
            kVar.a(a4.a.R1);
            kVar.a(a4.a.f28d2);
            kVar.a(b8);
            kVar.a((byte) i11);
            kVar.a(bArr4);
            this.f17304t.onWrite(kVar.a());
        }
    }

    public final void a(VerificationListener verificationListener, int i8) {
        if (verificationListener != null) {
            verificationListener.onError(i8);
        }
    }

    public final void a(int i8) {
        Context context = this.f17302r;
        if (context == null) {
            return;
        }
        if (this.A == null) {
            this.A = new l(context);
        }
        this.A.b(Constant.KEY_TIME_VALID, System.currentTimeMillis() + (i8 * 1000));
    }

    public final byte[] a(byte[] bArr) {
        k kVar = new k(bArr != null ? bArr.length : 0);
        if (bArr != null) {
            kVar.a(bArr, bArr.length);
        }
        return kVar.a();
    }
}
