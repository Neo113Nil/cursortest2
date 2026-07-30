package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.algo.ARVPASJniClient;
import com.baidu.ar.algo.FrameType;
import com.baidu.ar.algo.JNICCallJava;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.callback.ICallbackWith;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ee implements f7, sd {

    /* renamed from: a, reason: collision with root package name */
    public la f2167a;

    /* renamed from: b, reason: collision with root package name */
    public int f2168b;

    /* renamed from: c, reason: collision with root package name */
    public int f2169c;

    /* renamed from: d, reason: collision with root package name */
    public ARVPASJniClient f2170d;

    /* renamed from: e, reason: collision with root package name */
    public m7 f2171e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f2172f = new float[12];

    /* renamed from: g, reason: collision with root package name */
    public float[] f2173g = {1200.0f, 0.0f, 640.0f, 0.0f, 1200.0f, 360.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: h, reason: collision with root package name */
    public String f2174h;

    /* renamed from: i, reason: collision with root package name */
    public double[] f2175i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2176j;

    /* renamed from: k, reason: collision with root package name */
    public b f2177k;

    public class a implements o5 {
        public a() {
        }

        @Override // com.baidu.ar.o5
        public void a(byte[] bArr) {
            if (ee.this.f2177k != null) {
                ee.this.f2177k.a(bArr);
            }
        }
    }

    public interface b {
        void a(byte[] bArr);
    }

    public ee(int i8, int i9, a6 a6Var) {
        this.f2167a = la.a(i8, i9);
        this.f2168b = i8;
        this.f2169c = i9;
        JNICCallJava.setGravityCallBack(a6Var);
        JNICCallJava.setAlgoGeneraProtobufCallBack(new a());
        JNICCallJava.setVPASsParamsTransCallback(this);
    }

    public void b(String str) {
        this.f2174h = str;
    }

    @Override // com.baidu.ar.sd
    public String c() {
        return this.f2174h;
    }

    public void d() {
        JNICCallJava.removeAllCallback();
        a((b) null);
        a((a7) null);
        ARVPASJniClient aRVPASJniClient = this.f2170d;
        if (aRVPASJniClient != null) {
            aRVPASJniClient.releaseVPS();
        }
    }

    public void e() {
        ARVPASJniClient aRVPASJniClient = this.f2170d;
        if (aRVPASJniClient == null) {
            return;
        }
        aRVPASJniClient.resetVPSAlgo();
    }

    public boolean f() {
        ARVPASJniClient aRVPASJniClient = this.f2170d;
        if (aRVPASJniClient == null) {
            return false;
        }
        return aRVPASJniClient.start(this.f2168b, this.f2169c, this.f2173g, this.f2167a.b());
    }

    public void g() {
        this.f2176j = true;
    }

    public void h() {
        this.f2176j = false;
    }

    @Override // com.baidu.ar.f7
    public void a() {
        this.f2170d = new ARVPASJniClient();
    }

    @Override // com.baidu.ar.sd
    public double[] b() {
        double[] dArr = this.f2175i;
        return dArr != null ? dArr : new double[]{40.019802d, 116.318888d};
    }

    public void c(String str) {
        JNICCallJava.setUserID(str);
    }

    public void a(a7 a7Var) {
        JNICCallJava.setsITransModelPointCallback(a7Var);
    }

    @Override // com.baidu.ar.f7
    public void a(FramePixels framePixels, ICallbackWith<oe> iCallbackWith) {
        boolean z7;
        if (this.f2170d == null || this.f2171e == null || TextUtils.isEmpty(this.f2174h) || !this.f2176j) {
            return;
        }
        ByteBuffer pixelsAddress = framePixels.getPixelsAddress();
        byte[] bArr = new byte[pixelsAddress.remaining()];
        pixelsAddress.get(bArr);
        if (this.f2170d.trackFrame(bArr, this.f2171e.d(), System.currentTimeMillis(), FrameType.TYPE_YUV) == -1) {
            return;
        }
        int trackerPose = this.f2170d.getTrackerPose(this.f2172f);
        dd ddVar = new dd();
        qe qeVar = new qe(framePixels.getTimestamp());
        if (trackerPose == 0) {
            ddVar.a(this.f2172f);
            z7 = true;
        } else {
            z7 = false;
        }
        qeVar.a(z7);
        qeVar.a(ddVar);
        iCallbackWith.run(new oe(qeVar));
    }

    public void a(b bVar) {
        this.f2177k = bVar;
    }

    public void a(m7 m7Var) {
        this.f2171e = m7Var;
    }

    public void a(byte[] bArr) {
        ARVPASJniClient aRVPASJniClient = this.f2170d;
        if (aRVPASJniClient != null) {
            aRVPASJniClient.reciveProtobufBuffer(bArr);
        }
    }

    public boolean a(String str) {
        try {
            ARVPASJniClient aRVPASJniClient = this.f2170d;
            if (aRVPASJniClient == null) {
                return false;
            }
            return aRVPASJniClient.addTrackingVPS(str);
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
