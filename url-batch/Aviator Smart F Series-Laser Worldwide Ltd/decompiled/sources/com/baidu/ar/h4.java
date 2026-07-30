package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.ihttp.Downloader;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.recg.ImgRecognitionClient;
import com.baidu.ar.recg.RecognitionResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h4 implements j2 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2359e = "h4";

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f2360f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f2361g = false;

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f2362a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f2363b;

    /* renamed from: c, reason: collision with root package name */
    public g4 f2364c;

    /* renamed from: d, reason: collision with root package name */
    public List<f4> f2365d;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public c4 f2366a;

        /* renamed from: b, reason: collision with root package name */
        public String f2367b;

        public a(h4 h4Var, c4 c4Var, String str) {
            this.f2366a = c4Var;
            this.f2367b = str;
        }
    }

    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public j2 f2368a;

        public b(Looper looper, j2 j2Var) {
            super(looper);
            this.f2368a = j2Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f2368a.handleMessage(message);
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public String f2369a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap<String, Object> f2370b;

        public c(h4 h4Var, String str, HashMap<String, Object> hashMap) {
            this.f2369a = str;
            this.f2370b = hashMap;
        }
    }

    public h4() {
        d();
    }

    public final File a(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str + str2);
    }

    public final void b() {
        List<f4> list = this.f2365d;
        if (list != null) {
            list.clear();
            this.f2365d = null;
        }
        f2360f = false;
        g4 g4Var = this.f2364c;
        if (g4Var != null) {
            g4Var.onFeaturesClear(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<f4> c(String str) {
        String str2;
        JSONArray jSONArray;
        int i8;
        String str3;
        String str4 = "imageUrl";
        String str5 = "onlineStatus";
        if (str != null) {
            str2 = "imageMd5";
            try {
                if (str.contains(FirebaseAnalytics.Param.SUCCESS) && str.contains("feaList")) {
                    jSONArray = new JSONObject(str).getJSONArray("feaList");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray.length() > 0) {
                        return arrayList;
                    }
                    int i9 = 0;
                    ArrayList arrayList2 = arrayList;
                    while (i9 < jSONArray.length()) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i9);
                        JSONArray jSONArray2 = jSONArray;
                        f4 f4Var = new f4();
                        if (jSONObject.has("arFileName")) {
                            i8 = i9;
                            f4Var.a(jSONObject.getString("arFileName"));
                        } else {
                            i8 = i9;
                        }
                        if (jSONObject.has(ARConfigKey.OLD_AR_KEY)) {
                            f4Var.c(jSONObject.getString(ARConfigKey.OLD_AR_KEY));
                        }
                        if (jSONObject.has("arType")) {
                            f4Var.d(jSONObject.getString("arType"));
                        }
                        if (jSONObject.has("contentId")) {
                            f4Var.e(jSONObject.getString("contentId"));
                        }
                        if (jSONObject.has("contentTitle")) {
                            f4Var.f(jSONObject.getString("contentTitle"));
                        }
                        if (jSONObject.has("contentVersionId")) {
                            f4Var.g(jSONObject.getString("contentVersionId"));
                        }
                        if (jSONObject.has("createUser")) {
                            f4Var.h(jSONObject.getString("createUser"));
                        }
                        if (jSONObject.has("os")) {
                            f4Var.l(jSONObject.getString("os"));
                        }
                        if (jSONObject.has("sdkMax")) {
                            f4Var.m(jSONObject.getString("sdkMax"));
                        }
                        if (jSONObject.has("sdkMin")) {
                            f4Var.n(jSONObject.getString("sdkMin"));
                        }
                        if (jSONObject.has("tag")) {
                            f4Var.o(jSONObject.getString("tag"));
                        }
                        if (jSONObject.has("arId")) {
                            f4Var.b(jSONObject.getString("arId"));
                        }
                        if (jSONObject.has(str4)) {
                            f4Var.j(jSONObject.getString(str4));
                        }
                        String str6 = str2;
                        if (jSONObject.has(str6)) {
                            str3 = str4;
                            f4Var.i(jSONObject.getString(str6));
                        } else {
                            str3 = str4;
                        }
                        String str7 = str5;
                        if (jSONObject.has(str7)) {
                            f4Var.k(jSONObject.getString(str7));
                        }
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(f4Var);
                        arrayList2 = arrayList3;
                        str5 = str7;
                        str4 = str3;
                        str2 = str6;
                        i9 = i8 + 1;
                        jSONArray = jSONArray2;
                    }
                    return arrayList2;
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
                return null;
            }
        } else {
            str2 = "imageMd5";
        }
        jSONArray = new JSONArray(str);
        ArrayList arrayList4 = new ArrayList();
        if (jSONArray.length() > 0) {
        }
    }

    public final void d() {
        if (e()) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("FeatureSearchThread");
        this.f2362a = handlerThread;
        handlerThread.start();
        this.f2363b = new b(this.f2362a.getLooper(), this);
    }

    public final boolean e() {
        HandlerThread handlerThread = this.f2362a;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void f() {
        Handler handler = this.f2363b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1007));
        }
    }

    @Override // com.baidu.ar.j2
    public void handleMessage(Message message) {
        if (message == null) {
        }
        switch (message.what) {
            case 1001:
                c cVar = (c) message.obj;
                a(cVar.f2369a, cVar.f2370b);
                break;
            case 1002:
                a aVar = (a) message.obj;
                b(aVar.f2366a, aVar.f2367b);
                break;
            case 1003:
                b((String) message.obj);
                break;
            case 1004:
                a((String) message.obj);
                break;
            case 1005:
                b();
                break;
            case 1006:
                a(message.arg1, message.arg2, (byte[]) message.obj);
                break;
            case 1007:
                c();
                break;
            case 1008:
                a aVar2 = (a) message.obj;
                c(aVar2.f2366a, aVar2.f2367b);
                break;
        }
    }

    public void a() {
        a(true);
        Handler handler = this.f2363b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1005));
        }
    }

    public void b(int i8, int i9, byte[] bArr) {
        Handler handler = this.f2363b;
        if (handler != null) {
            handler.removeMessages(1006);
            Handler handler2 = this.f2363b;
            handler2.sendMessage(handler2.obtainMessage(1006, i8, i9, bArr));
        }
    }

    public final void c() {
        HandlerThread handlerThread = this.f2362a;
        if (handlerThread != null) {
            handlerThread.getLooper().quit();
        }
        g4 g4Var = this.f2364c;
        if (g4Var != null) {
            g4Var.onThreadQuit();
            this.f2364c = null;
        }
        this.f2362a = null;
        this.f2363b = null;
    }

    public void d(c4 c4Var, String str) {
        if (this.f2363b != null) {
            a aVar = new a(this, c4Var, str);
            Handler handler = this.f2363b;
            handler.sendMessage(handler.obtainMessage(1008, aVar));
        }
    }

    public final void a(int i8, int i9, byte[] bArr) {
        RecognitionResult recognitionResult;
        String str;
        boolean z7;
        String str2;
        List<f4> list;
        if (f2360f) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                recognitionResult = ImgRecognitionClient.recogniseImage(bArr, i8, i9);
            } catch (Throwable unused) {
                recognitionResult = null;
            }
            Log.e("qatest", "本地识图: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            if (recognitionResult != null && (list = this.f2365d) != null && list.size() > 0) {
                String str3 = recognitionResult.fileName;
                if (!TextUtils.isEmpty(str3)) {
                    for (f4 f4Var : this.f2365d) {
                        if (str3.equals(f4Var.a())) {
                            str = f4Var.b();
                            str2 = f4Var.c();
                            z7 = true;
                            break;
                        }
                    }
                }
            }
            str = "";
            z7 = false;
            str2 = "";
            if (this.f2364c == null || f2361g) {
                return;
            }
            this.f2364c.onYuvImageSearch(z7, str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r3.equals(r7.b()) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(c4 c4Var, String str) {
        boolean z7;
        g4 g4Var;
        File a8 = a(str, c4Var.a().substring(c4Var.a().lastIndexOf("/")));
        j4.d(a8);
        boolean z8 = true;
        try {
            new Downloader(c4Var.a()).download(a8.getAbsolutePath(), null);
            z7 = true;
        } catch (HttpException | IOException e8) {
            e8.printStackTrace();
            z7 = false;
        }
        if (z7) {
            try {
                String a9 = k8.a(a8);
                if (!TextUtils.isEmpty(a9)) {
                }
                z8 = false;
                if (!z8) {
                    try {
                        j4.d(a8);
                        h.b(f2359e, "handleDownloadResource md5 failed");
                    } catch (Exception e9) {
                        boolean z9 = z8;
                        e = e9;
                        z7 = z9;
                        e.printStackTrace();
                        if (z7) {
                            h.b(f2359e, "handleDownloadResource unzip failed");
                        }
                        g4Var = this.f2364c;
                        if (g4Var == null) {
                        }
                    }
                }
                z7 = z8;
            } catch (Exception e10) {
                e = e10;
            }
        }
        if (z7 && !(z7 = a(a8.getParentFile(), a8))) {
            h.b(f2359e, "handleDownloadResource unzip failed");
        }
        g4Var = this.f2364c;
        if (g4Var == null) {
            g4Var.onResourceDownload(z7, c4Var.b());
        }
    }

    public final void c(c4 c4Var, String str) {
        File a8 = a(str, c4Var.a().substring(c4Var.a().lastIndexOf("/")));
        boolean a9 = (!a8.exists() || a8.length() <= 0) ? false : a(a8.getParentFile(), a8);
        g4 g4Var = this.f2364c;
        if (g4Var != null) {
            g4Var.onFeatureFilesUnzip(a9);
        }
    }

    public void a(c4 c4Var, String str) {
        if (this.f2363b != null) {
            a aVar = new a(this, c4Var, str);
            Handler handler = this.f2363b;
            handler.sendMessage(handler.obtainMessage(1002, aVar));
        }
    }

    public final void b(String str) {
        boolean z7 = false;
        try {
            File file = new File(str);
            if (file.exists()) {
                List<f4> c8 = c(j4.k(file));
                this.f2365d = c8;
                if (c8 != null) {
                    if (c8.size() > 0) {
                        z7 = true;
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        g4 g4Var = this.f2364c;
        if (g4Var != null) {
            g4Var.onFeatureJsonParse(z7);
        }
    }

    public void a(g4 g4Var) {
        this.f2364c = g4Var;
    }

    public void b(String str, String str2) {
        a(false);
        Handler handler = this.f2363b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1003, str));
            Handler handler2 = this.f2363b;
            handler2.sendMessage(handler2.obtainMessage(1004, str2));
        }
    }

    public void a(p4 p4Var) {
        b3 b3Var;
        String str;
        String str2;
        List<f4> list;
        if (p4Var == null || p4Var.a() == null) {
            return;
        }
        boolean z7 = true;
        if (p4Var.a().size() >= 1 && (b3Var = p4Var.a().get(0)) != null && (b3Var instanceof ya)) {
            String a8 = ((ya) b3Var).d().a();
            if (!TextUtils.isEmpty(a8) && (list = this.f2365d) != null) {
                for (f4 f4Var : list) {
                    if (a8.equals(f4Var.a())) {
                        str = f4Var.b();
                        str2 = f4Var.c();
                        break;
                    }
                }
            }
            str = "";
            str2 = "";
            z7 = false;
            if (this.f2364c == null || f2361g) {
                return;
            }
            this.f2364c.onYuvImageSearch(z7, str, str2);
        }
    }

    public void b(String str, HashMap<String, Object> hashMap) {
        Handler handler = this.f2363b;
        if (handler != null) {
            handler.removeMessages(1007);
            c cVar = new c(this, str, hashMap);
            Handler handler2 = this.f2363b;
            handler2.sendMessage(handler2.obtainMessage(1001, cVar));
        }
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f2360f = true;
            g4 g4Var = this.f2364c;
            if (g4Var != null) {
                g4Var.onFeatureFilesInit(true);
            }
        } catch (Throwable unused) {
            g4 g4Var2 = this.f2364c;
            if (g4Var2 != null) {
                g4Var2.onFeatureFilesInit(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        if (r8.getInt("err_code") == 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[Catch: JSONException -> 0x0071, TryCatch #0 {JSONException -> 0x0071, blocks: (B:14:0x005f, B:16:0x006a, B:20:0x0082, B:21:0x0085, B:23:0x008b, B:24:0x009a, B:25:0x009d, B:27:0x00a3, B:29:0x00b2, B:30:0x00b9, B:32:0x00bf, B:33:0x00c6, B:35:0x00cc, B:36:0x00d3, B:43:0x0090, B:45:0x0096, B:47:0x0073, B:49:0x0079), top: B:13:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[Catch: JSONException -> 0x0071, TryCatch #0 {JSONException -> 0x0071, blocks: (B:14:0x005f, B:16:0x006a, B:20:0x0082, B:21:0x0085, B:23:0x008b, B:24:0x009a, B:25:0x009d, B:27:0x00a3, B:29:0x00b2, B:30:0x00b9, B:32:0x00bf, B:33:0x00c6, B:35:0x00cc, B:36:0x00d3, B:43:0x0090, B:45:0x0096, B:47:0x0073, B:49:0x0079), top: B:13:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090 A[Catch: JSONException -> 0x0071, TryCatch #0 {JSONException -> 0x0071, blocks: (B:14:0x005f, B:16:0x006a, B:20:0x0082, B:21:0x0085, B:23:0x008b, B:24:0x009a, B:25:0x009d, B:27:0x00a3, B:29:0x00b2, B:30:0x00b9, B:32:0x00bf, B:33:0x00c6, B:35:0x00cc, B:36:0x00d3, B:43:0x0090, B:45:0x0096, B:47:0x0073, B:49:0x0079), top: B:13:0x005f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, HashMap<String, Object> hashMap) {
        g4 g4Var;
        JSONObject jSONObject;
        String string;
        boolean z7;
        StringBuilder sb = new StringBuilder();
        if (hashMap != null) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                sb.append((Object) entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
            sb.deleteCharAt(sb.lastIndexOf("&"));
        }
        String a8 = n5.a(str, sb.toString());
        e4 e4Var = new e4();
        if (TextUtils.isEmpty(a8)) {
            return;
        }
        try {
            jSONObject = new JSONObject(a8);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        if (jSONObject.has("errorNum")) {
            z7 = jSONObject.getInt("errorNum") == 0;
        } else {
            if (jSONObject.has("err_code")) {
            }
            if (jSONObject.has("errorMsg")) {
                if (jSONObject.has("err_msg")) {
                    string = jSONObject.getString("err_msg");
                }
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    c4 c4Var = new c4();
                    if (jSONObject2.has("url")) {
                        c4Var.b(jSONObject2.getString("url"));
                    }
                    if (jSONObject2.has("ar_code_url")) {
                        c4Var.a(jSONObject2.getString("ar_code_url"));
                    }
                    if (jSONObject2.has("md5")) {
                        c4Var.c(jSONObject2.getString("md5"));
                    }
                    e4Var.a(c4Var);
                }
                g4Var = this.f2364c;
                if (g4Var != null) {
                    g4Var.onResourceRequest(e4Var);
                    return;
                }
                return;
            }
            string = jSONObject.getString("errorMsg");
            e4Var.a(string);
            if (jSONObject.has("data")) {
            }
            g4Var = this.f2364c;
            if (g4Var != null) {
            }
        }
        e4Var.a(z7);
        if (jSONObject.has("errorMsg")) {
        }
        e4Var.a(string);
        if (jSONObject.has("data")) {
        }
        g4Var = this.f2364c;
        if (g4Var != null) {
        }
    }

    public static void a(boolean z7) {
        f2361g = z7;
    }

    public final boolean a(File file, File file2) {
        j4.c(new File(file.toString() + "/fea"));
        boolean a8 = af.a(file2, file);
        if (!a8) {
            h.b(f2359e, "handleDownloadResource unzip failed");
        }
        return a8;
    }
}
