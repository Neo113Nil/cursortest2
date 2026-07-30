package com.baidu.ar.recg;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.b3;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.c0;
import com.baidu.ar.e3;
import com.baidu.ar.h;
import com.baidu.ar.j4;
import com.baidu.ar.kb;
import com.baidu.ar.m9;
import com.baidu.ar.p4;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.ta;
import com.baidu.ar.va;
import com.baidu.ar.xa;
import com.baidu.ar.ya;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class RecgAR extends c0 implements IOnDeviceIR {

    /* renamed from: v, reason: collision with root package name */
    public ImageRecognitionManager f3086v;

    /* renamed from: w, reason: collision with root package name */
    public int f3087w;

    /* renamed from: x, reason: collision with root package name */
    public ta f3088x;

    /* renamed from: y, reason: collision with root package name */
    public e3 f3089y;

    /* renamed from: z, reason: collision with root package name */
    public IOnDeviceIRStateChangedListener f3090z;

    public class a implements e3 {
        public a() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (b3Var == null || !(b3Var instanceof ya)) {
                return;
            }
            p4 p4Var = new p4();
            p4Var.a(b3Var);
            RecgAR.this.f3086v.onDetected(p4Var);
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
        }
    }

    public class b implements ImageRecognitionCallback {
        public b() {
        }

        @Override // com.baidu.ar.recg.ImageRecognitionCallback
        public void onFeatureDBInit(boolean z7) {
            ArrayList<File> i8;
            if (!z7) {
                if (RecgAR.this.f3090z != null) {
                    RecgAR.this.f3090z.onStateChanged(OnDeviceIRState.ERROR, RecgAR.this.c("特征库初始化失败"));
                }
                h.b("bdar", "fea library init fail!");
                return;
            }
            if (RecgAR.this.f3090z != null) {
                RecgAR.this.f3090z.onStateChanged(OnDeviceIRState.START, null);
            }
            RecgAR.this.a(0);
            if (TextUtils.isEmpty(ARConfig.sFeaPointsDir)) {
                return;
            }
            File file = new File(ARConfig.sFeaPointsDir);
            if (!file.exists() || !file.isDirectory() || (i8 = j4.i(file)) == null || i8.size() <= 0) {
                return;
            }
            xa xaVar = new xa();
            xaVar.b(1280);
            xaVar.a(720);
            xaVar.a(j4.a(i8));
            RecgAR.this.f3088x.a(xaVar);
            RecgAR recgAR = RecgAR.this;
            recgAR.a(recgAR.f3088x, RecgAR.this.f3089y);
        }

        @Override // com.baidu.ar.recg.ImageRecognitionCallback
        public void onFeatureDownloadStart() {
        }

        @Override // com.baidu.ar.recg.ImageRecognitionCallback
        public void onRecognizeResult(boolean z7, String str, String str2) {
            RecgAR recgAR;
            int i8;
            if (RecgAR.this.f3087w == 4) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                recgAR = RecgAR.this;
                i8 = 0;
            } else {
                recgAR = RecgAR.this;
                i8 = 3;
            }
            recgAR.a(i8);
            if (!z7 || TextUtils.isEmpty(str)) {
                return;
            }
            if (RecgAR.this.f3086v != null) {
                RecgAR.this.f3086v.stopRecognition();
            }
            if (RecgAR.this.f3090z != null) {
                va vaVar = new va();
                vaVar.f3456a = true;
                vaVar.f3457b = str;
                vaVar.f3458c = Integer.parseInt(str2);
                StatisticApi.onEvent(StatisticConstants.DEVICE_SEARCH_SUCCESS);
                RecgAR.this.f3090z.onStateChanged(OnDeviceIRState.SUCCESS, vaVar);
            }
        }

        @Override // com.baidu.ar.recg.ImageRecognitionCallback
        public void onResourceDownload(boolean z7) {
            if (!z7) {
                if (RecgAR.this.f3090z != null) {
                    RecgAR.this.f3090z.onStateChanged(OnDeviceIRState.ERROR, RecgAR.this.c("特征库下载失败"));
                }
                h.b("bdar", "fea library download fail!");
            } else {
                if (RecgAR.this.f3086v != null) {
                    RecgAR.this.f3086v.startRecognition();
                }
                if (RecgAR.this.f3090z != null) {
                    RecgAR.this.f3090z.onStateChanged(OnDeviceIRState.START, null);
                }
            }
        }

        @Override // com.baidu.ar.recg.ImageRecognitionCallback
        public void onResourceRequest(boolean z7, int i8, String str) {
            if (z7) {
                return;
            }
            if (RecgAR.this.f3090z != null) {
                RecgAR.this.f3090z.onStateChanged(OnDeviceIRState.ERROR, RecgAR.this.c(str));
            }
            h.b("bdar", "request fail!");
        }

        @Override // com.baidu.ar.recg.ImageRecognitionCallback
        public void onSoLoadDownloadStart() {
        }

        @Override // com.baidu.ar.recg.ImageRecognitionCallback
        public void onSoLoadState(boolean z7) {
        }
    }

    public RecgAR() {
        Executors.newSingleThreadExecutor();
        this.f3087w = -1;
    }

    public void initRecognition(Context context) {
        if (m9.e(context)) {
            this.f3086v.initRecognition(context, new b());
            return;
        }
        h.b("bdar", "network disconnect！");
        IOnDeviceIRStateChangedListener iOnDeviceIRStateChangedListener = this.f3090z;
        if (iOnDeviceIRStateChangedListener != null) {
            iOnDeviceIRStateChangedListener.onStateChanged(OnDeviceIRState.NO_NETWORK, null);
        }
    }

    @Override // com.baidu.ar.c0
    public void onCaseCreate(String str) {
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void pause() {
        super.pause();
        if (this.f3087w != 3) {
            a(4);
        }
    }

    @Override // com.baidu.ar.c0
    public void release() {
        this.f3090z = null;
        ImageRecognitionManager imageRecognitionManager = this.f3086v;
        if (imageRecognitionManager != null) {
            imageRecognitionManager.release();
        }
        ta taVar = this.f3088x;
        if (taVar != null) {
            a(taVar);
            this.f3088x = null;
        }
        super.release();
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void resume() {
        super.resume();
        if (this.f3087w == 4) {
            a(0);
        }
    }

    @Override // com.baidu.ar.recg.IOnDeviceIR
    public void retry() {
        initRecognition(c());
    }

    @Override // com.baidu.ar.recg.IOnDeviceIR
    public void setStateChangedListener(IOnDeviceIRStateChangedListener iOnDeviceIRStateChangedListener) {
        this.f3090z = iOnDeviceIRStateChangedListener;
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        super.setup(hashMap);
        this.f3086v = new ImageRecognitionManager();
        this.f3088x = new ta();
        this.f3089y = new a();
        initRecognition(c());
    }

    public final va c(String str) {
        va vaVar = new va();
        vaVar.f3456a = false;
        vaVar.f3459d = str;
        return vaVar;
    }

    public final void a(int i8) {
        this.f3087w = i8;
    }
}
