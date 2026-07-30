package com.baidu.ar.cloud;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.ARType;
import com.baidu.ar.DuMixController;
import com.baidu.ar.ab;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.cloud.a;
import com.baidu.ar.f;
import com.baidu.ar.h;
import com.baidu.ar.h3;
import com.baidu.ar.i2;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.recognition.CloudAlgoController;
import com.baidu.ar.recognition.CloudRecognitionClient;
import com.baidu.ar.recognition.RecognitionAssembleCallback;
import com.baidu.ar.recognition.RequestRecognitionMode;
import com.baidu.ar.remoteres.DuMixResManager;
import com.baidu.ar.remoteres.IDuMixResProcessor;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public class CloudRecognitionManager implements a.c, RecognitionAssembleCallback {
    public static final int CLOUD_RECOGNITION_NO_TARGET = 1057;
    public static final int COMMON_ERROR_CODE = -1;

    /* renamed from: a, reason: collision with root package name */
    public com.baidu.ar.cloud.a f1981a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1982b;

    /* renamed from: c, reason: collision with root package name */
    public CloudCallback f1983c;

    /* renamed from: d, reason: collision with root package name */
    public CloudRecognitionClient f1984d;

    /* renamed from: f, reason: collision with root package name */
    public RequestRecognitionMode f1986f;

    /* renamed from: h, reason: collision with root package name */
    public DuMixResManager f1988h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1989i;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1985e = {1200.0f, 0.0f, 640.0f, 0.0f, 1200.0f, 360.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public float[] f1987g = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public class a implements ICallback {
        public a() {
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            DuMixResManager duMixResManager = CloudRecognitionManager.this.f1988h;
            ARType aRType = ARType.CLOUD_IR;
            if (duMixResManager.isARResReady(aRType)) {
                String modelRoot = CloudRecognitionManager.this.f1988h.getModelRoot();
                String libRoot = CloudRecognitionManager.this.f1988h.getLibRoot();
                IDuMixResProcessor resProcessor = CloudRecognitionManager.this.f1988h.getResProcessor(aRType);
                File file = new File(modelRoot);
                File file2 = new File(libRoot);
                CloudRecognitionManager.this.f1989i = resProcessor.load(null, file2, file);
                if (CloudRecognitionManager.this.f1984d == null) {
                    CloudRecognitionManager.this.f1984d = new CloudRecognitionClient();
                }
            }
        }
    }

    public boolean cloudAlgoIsReady() {
        return this.f1989i;
    }

    public void initCloudRecognition(Context context, CloudCallback cloudCallback) {
        this.f1982b = context.getApplicationContext();
        this.f1983c = cloudCallback;
        if (this.f1981a == null) {
            this.f1981a = new com.baidu.ar.cloud.a();
        }
        CloudAlgoController cloudAlgoController = new CloudAlgoController();
        this.f1981a.a(this);
        cloudAlgoController.setRecognitionAssembleCallback(this);
        this.f1981a.e();
        if (this.f1988h == null) {
            this.f1988h = new DuMixResManager(this.f1982b.getApplicationContext());
        }
        this.f1988h.downloadARRes(ARType.CLOUD_IR, new a());
    }

    @Override // com.baidu.ar.recognition.RecognitionAssembleCallback
    public void onAssembleResult(byte[] bArr) {
        com.baidu.ar.cloud.a aVar = this.f1981a;
        if (aVar != null) {
            aVar.b(bArr);
        }
    }

    @Override // com.baidu.ar.recognition.RecognitionAssembleCallback
    public void onProtobufParseResult(int i8, String str, String str2, String str3) {
        CloudCallback cloudCallback = this.f1983c;
        if (cloudCallback != null) {
            cloudCallback.onRecognizeResult(i8, str, str2, str3);
        }
    }

    @Override // com.baidu.ar.cloud.a.c
    public void onRequestLibraryResult(String str) {
    }

    @Override // com.baidu.ar.cloud.a.c
    public void onResourceRequest(i2 i2Var) {
        CloudCallback cloudCallback = this.f1983c;
        if (cloudCallback != null) {
            if (i2Var == null) {
                cloudCallback.onRecognizeResult(-1, "未知错误", "", "");
            } else if (i2Var.b() != null) {
                this.f1983c.onRecognizeResult(i2Var.a(), i2Var.c(), i2Var.b().a(), i2Var.b().b());
            } else {
                this.f1983c.onRecognizeResult(i2Var.a(), i2Var.c(), "", "");
            }
        }
    }

    @Override // com.baidu.ar.cloud.a.c
    public void onResourceResponse(byte[] bArr) {
        if (bArr == null) {
            CloudCallback cloudCallback = this.f1983c;
            if (cloudCallback != null) {
                cloudCallback.onRecognizeResult(-1, "error", "", "");
                return;
            }
            return;
        }
        try {
            CloudRecognitionClient cloudRecognitionClient = this.f1984d;
            if (cloudRecognitionClient != null) {
                cloudRecognitionClient.onServerReceiver(bArr);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void release() {
        com.baidu.ar.cloud.a aVar = this.f1981a;
        if (aVar != null) {
            aVar.d();
            this.f1981a = null;
        }
        this.f1989i = false;
    }

    public void setYUVFile(byte[] bArr, int i8, int i9) {
        if (bArr != null || this.f1989i) {
            try {
                CloudRecognitionClient cloudRecognitionClient = this.f1984d;
                if (cloudRecognitionClient != null) {
                    cloudRecognitionClient.recognition(a(bArr, i8, i9, 40.019558f, 116.31966f));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String b(Context context) {
        if (context == null) {
            h.b("CloudRecognitionManager", "get so download dir error");
            return null;
        }
        File file = new File(context.getFilesDir(), "arlibs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public final RequestRecognitionMode a(byte[] bArr, int i8, int i9, float f8, float f9) {
        if (this.f1986f == null) {
            this.f1986f = new RequestRecognitionMode();
        }
        this.f1986f.setImage(bArr);
        Object[] signatureAndTime = ARConfig.getSignatureAndTime();
        this.f1986f.setSign((String) signatureAndTime[0]);
        this.f1986f.setTimestamp(((Long) signatureAndTime[1]).longValue());
        this.f1986f.setWidth(i8);
        this.f1986f.setHeight(i9);
        this.f1986f.setIsAip(ExifInterface.GPS_MEASUREMENT_3D);
        this.f1986f.setAppId(f.a());
        this.f1986f.setAipAppId(DuMixARConfig.getAipAppId());
        this.f1986f.setPolicy(0);
        this.f1986f.setAppId(this.f1982b.getPackageName());
        this.f1986f.setCameraDistort(this.f1987g);
        this.f1986f.setGps(new float[]{f8, f9, 0.0f});
        UUID a8 = new h3(this.f1982b).a();
        if (a8 != null) {
            this.f1986f.setCuid(a8.toString());
        } else {
            this.f1986f.setCuid(ARConfig.getCUID());
        }
        this.f1986f.setFrameChannels(1);
        this.f1986f.setCameraIntrinsics(this.f1985e);
        return this.f1986f;
    }

    public void initCloudRecognition(Context context, CloudCallback cloudCallback, boolean z7) {
        if (z7) {
            a(context);
        }
        initCloudRecognition(context, cloudCallback);
    }

    public void setYUVFile(byte[] bArr, int i8, int i9, float f8, float f9) {
        if (bArr != null || this.f1989i) {
            try {
                CloudRecognitionClient cloudRecognitionClient = this.f1984d;
                if (cloudRecognitionClient != null) {
                    cloudRecognitionClient.recognition(a(bArr, i8, i9, f8, f9));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(Context context) {
        Object a8 = ab.a("com.baidu.ar.remoteres.RemoteResLoader", new Class[]{DuMixController.class, String.class}, new Object[]{null, b(context)});
        if (a8 != null) {
            com.baidu.ar.libloader.a.a((ILibLoader) a8);
        }
    }
}
