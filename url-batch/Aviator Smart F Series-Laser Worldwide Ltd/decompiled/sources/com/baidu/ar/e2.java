package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelType;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.cloud.CloudCallback;
import com.baidu.ar.cloud.CloudRecognitionManager;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e2 extends o4 implements CloudCallback {

    /* renamed from: i, reason: collision with root package name */
    public CloudRecognitionManager f2131i;

    /* renamed from: j, reason: collision with root package name */
    public CloudCallback f2132j;

    /* renamed from: k, reason: collision with root package name */
    public int f2133k = -1;

    /* renamed from: l, reason: collision with root package name */
    public ExecutorService f2134l = Executors.newSingleThreadExecutor();

    /* renamed from: m, reason: collision with root package name */
    public Context f2135m;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f2136a;

        public a(byte[] bArr) {
            this.f2136a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e2.this.f2131i != null) {
                e2.this.f2131i.setYUVFile(this.f2136a, e2.this.f2878e.getOutputWidth(), e2.this.f2878e.getOutputHeight());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2138a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2139b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2140c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f2141d;

        public b(String str, String str2, int i8, String str3) {
            this.f2138a = str;
            this.f2139b = str2;
            this.f2140c = i8;
            this.f2141d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ar_key", this.f2138a);
                jSONObject.put("ar_type", this.f2139b);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (e2.this.f2132j != null) {
                e2.this.f2132j.onRecognizeResult(this.f2140c, this.f2141d, this.f2138a, this.f2139b);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2143a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2144b;

        public c(String str, int i8) {
            this.f2143a = str;
            this.f2144b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextUtils.isEmpty(this.f2143a);
            if (e2.this.f2132j != null) {
                e2.this.f2132j.onRecognizeResult(this.f2144b, this.f2143a, "", "");
            }
        }
    }

    public e2(Context context) {
        this.f2135m = context;
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.f2878e = pixelReadParams;
        pixelReadParams.setOutputWidth(1280);
        this.f2878e.setOutputHeight(720);
    }

    @Override // com.baidu.ar.o4
    public void e() {
        g();
    }

    @Override // com.baidu.ar.o4
    public void f() {
        CloudRecognitionManager cloudRecognitionManager = new CloudRecognitionManager();
        this.f2131i = cloudRecognitionManager;
        cloudRecognitionManager.initCloudRecognition(this.f2135m, this);
    }

    public void g() {
        CloudRecognitionManager cloudRecognitionManager = this.f2131i;
        if (cloudRecognitionManager != null) {
            cloudRecognitionManager.release();
        }
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return "CloudDetector";
    }

    public void h() {
        CloudRecognitionManager cloudRecognitionManager = this.f2131i;
        if (cloudRecognitionManager != null) {
            cloudRecognitionManager.release();
        }
        this.f2133k = 2;
    }

    public void i() {
        this.f2131i.initCloudRecognition(this.f2135m, this);
        this.f2133k = -1;
    }

    @Override // com.baidu.ar.cloud.CloudCallback
    public void onRecognizeResult(int i8, String str, String str2, String str3) {
        if (i8 == 0) {
            this.f2133k = 0;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            gd.a(new b(str2, str3, i8, str));
            return;
        }
        if (i8 == 1054 || i8 == 1057) {
            this.f2133k = -1;
        } else {
            this.f2133k = 2;
            gd.a(new c(str, i8));
        }
    }

    @Override // com.baidu.ar.cloud.CloudCallback
    public void onStart() {
        CloudCallback cloudCallback = this.f2132j;
        if (cloudCallback != null) {
            cloudCallback.onStart();
        }
    }

    public void a(int i8) {
        this.f2133k = i8;
    }

    public void a(CloudCallback cloudCallback) {
        this.f2132j = cloudCallback;
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        CloudCallback cloudCallback;
        ByteBuffer pixelsAddress = framePixels.getPixelsAddress();
        int remaining = pixelsAddress.remaining();
        byte[] bArr = new byte[remaining];
        pixelsAddress.get(bArr);
        if (remaining <= 0 || this.f2133k != -1) {
            return true;
        }
        if (TextUtils.isEmpty(ARConfig.getARKey()) && (cloudCallback = this.f2132j) != null) {
            cloudCallback.onStart();
        }
        this.f2133k = 2;
        this.f2134l.execute(new a(bArr));
        return true;
    }
}
