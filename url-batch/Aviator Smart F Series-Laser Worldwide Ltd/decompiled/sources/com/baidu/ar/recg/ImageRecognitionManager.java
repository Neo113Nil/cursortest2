package com.baidu.ar.recg;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.b4;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.e4;
import com.baidu.ar.g4;
import com.baidu.ar.gb;
import com.baidu.ar.h;
import com.baidu.ar.h4;
import com.baidu.ar.id;
import com.baidu.ar.j4;
import com.baidu.ar.o;
import com.baidu.ar.p4;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ImageRecognitionManager implements g4 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f3077i = false;

    /* renamed from: a, reason: collision with root package name */
    public h4 f3078a = new h4();

    /* renamed from: b, reason: collision with root package name */
    public Context f3079b;

    /* renamed from: c, reason: collision with root package name */
    public ImageRecognitionCallback f3080c;

    /* renamed from: d, reason: collision with root package name */
    public String f3081d;

    /* renamed from: e, reason: collision with root package name */
    public String f3082e;

    /* renamed from: f, reason: collision with root package name */
    public String f3083f;

    /* renamed from: g, reason: collision with root package name */
    public e4 f3084g;

    /* renamed from: h, reason: collision with root package name */
    public String f3085h;

    public static void a(boolean z7) {
        f3077i = z7;
    }

    public void initRecognition(Context context, ImageRecognitionCallback imageRecognitionCallback) {
        this.f3079b = context;
        this.f3080c = imageRecognitionCallback;
        this.f3085h = j4.a(context);
        h4 h4Var = this.f3078a;
        if (h4Var != null) {
            h4Var.a(this);
            HashMap<String, Object> hashMap = new HashMap<>();
            gb.a(context, hashMap);
            hashMap.put(HttpConstants.HTTP_ENGINE_VERSION, String.valueOf(o.a()));
            hashMap.put(HttpConstants.OS_CPU_ABI, Build.CPU_ABI);
            this.f3078a.b(id.c(), hashMap);
        }
    }

    public void onDetected(p4 p4Var) {
        this.f3078a.a(p4Var);
    }

    @Override // com.baidu.ar.g4
    public void onFeatureFilesInit(boolean z7) {
        a(z7);
        ImageRecognitionCallback imageRecognitionCallback = this.f3080c;
        if (imageRecognitionCallback != null) {
            imageRecognitionCallback.onFeatureDBInit(z7);
        }
    }

    @Override // com.baidu.ar.g4
    public void onFeatureFilesUnzip(boolean z7) {
        if (!z7) {
            h.a("unzip failed");
            return;
        }
        h4 h4Var = this.f3078a;
        if (h4Var != null) {
            h4Var.b(this.f3082e, this.f3083f);
        }
    }

    @Override // com.baidu.ar.g4
    public void onFeatureJsonParse(boolean z7) {
    }

    @Override // com.baidu.ar.g4
    public void onFeaturesClear(boolean z7) {
        a(!z7);
    }

    @Override // com.baidu.ar.g4
    public void onResourceDownload(boolean z7, String str) {
        if (z7) {
            new b4(this.f3079b).a(str);
        }
        ImageRecognitionCallback imageRecognitionCallback = this.f3080c;
        if (imageRecognitionCallback != null) {
            imageRecognitionCallback.onResourceDownload(z7);
        }
    }

    @Override // com.baidu.ar.g4
    public void onResourceRequest(e4 e4Var) {
        ImageRecognitionCallback imageRecognitionCallback;
        if (e4Var == null || this.f3079b == null || (imageRecognitionCallback = this.f3080c) == null) {
            h.b("onResourceRequest error!!! response == null");
            return;
        }
        try {
            this.f3084g = e4Var;
            imageRecognitionCallback.onSoLoadDownloadStart();
            if (this.f3084g.d()) {
                String a8 = new b4(this.f3079b).a();
                String b8 = this.f3084g.c().b();
                String substring = this.f3084g.c().a().substring(this.f3084g.c().a().lastIndexOf("/"));
                this.f3081d = this.f3085h + "/feature";
                this.f3082e = this.f3081d + "/fea.json";
                String str = this.f3081d + "/fea";
                this.f3083f = str;
                ARConfig.sFeaPointsDir = str;
                File file = new File(this.f3081d + "/" + substring);
                if (this.f3078a != null) {
                    if (!TextUtils.isEmpty(a8) && a8.equals(b8) && file.exists()) {
                        this.f3078a.d(this.f3084g.c(), this.f3081d);
                    }
                    ImageRecognitionCallback imageRecognitionCallback2 = this.f3080c;
                    if (imageRecognitionCallback2 != null) {
                        imageRecognitionCallback2.onFeatureDownloadStart();
                    }
                    this.f3078a.a(this.f3084g.c(), this.f3081d);
                }
            }
            ImageRecognitionCallback imageRecognitionCallback3 = this.f3080c;
            if (imageRecognitionCallback3 != null) {
                imageRecognitionCallback3.onResourceRequest(this.f3084g.d(), this.f3084g.a(), this.f3084g.b());
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.baidu.ar.g4
    public void onThreadQuit() {
    }

    @Override // com.baidu.ar.g4
    public void onYuvImageSearch(boolean z7, String str, String str2) {
        ImageRecognitionCallback imageRecognitionCallback = this.f3080c;
        if (imageRecognitionCallback != null) {
            imageRecognitionCallback.onRecognizeResult(z7, str, str2);
        }
    }

    public void recognizeFrame(int i8, int i9, byte[] bArr) {
        h4 h4Var;
        if (!f3077i || (h4Var = this.f3078a) == null) {
            return;
        }
        h4Var.b(i8, i9, bArr);
    }

    public void release() {
        this.f3079b = null;
        this.f3080c = null;
    }

    public void startRecognition() {
        h4 h4Var;
        if (TextUtils.isEmpty(this.f3082e) || TextUtils.isEmpty(this.f3083f) || (h4Var = this.f3078a) == null) {
            return;
        }
        h4Var.a(this);
        this.f3078a.b(this.f3082e, this.f3083f);
    }

    public void stopRecognition() {
        h4 h4Var = this.f3078a;
        if (h4Var != null) {
            h4Var.a();
            this.f3078a.f();
        }
    }
}
