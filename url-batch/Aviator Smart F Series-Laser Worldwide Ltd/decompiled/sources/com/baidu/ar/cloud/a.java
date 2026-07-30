package com.baidu.ar.cloud;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.c6;
import com.baidu.ar.d4;
import com.baidu.ar.f2;
import com.baidu.ar.i2;
import com.baidu.ar.id;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.l2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f1991a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f1992b;

    /* renamed from: c, reason: collision with root package name */
    public c f1993c;

    /* renamed from: com.baidu.ar.cloud.a$a, reason: collision with other inner class name */
    public class C0034a implements c6 {
        public C0034a() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            if (a.this.f1993c != null) {
                a.this.f1993c.onResourceResponse(null);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                InputStream stream = iHttpResponse.getStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = stream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                stream.close();
                if (a.this.f1993c != null) {
                    a.this.f1993c.onResourceResponse(byteArray);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public class b implements c6 {
        public b() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            if (a.this.f1993c != null) {
                a.this.f1993c.onRequestLibraryResult(null);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                String content = iHttpResponse.getContent();
                if (TextUtils.isEmpty(content)) {
                    return;
                }
                a.this.b(content);
            } catch (IOException | JSONException e8) {
                e8.printStackTrace();
            }
        }
    }

    public interface c {
        void onRequestLibraryResult(String str);

        void onResourceRequest(i2 i2Var);

        void onResourceResponse(byte[] bArr);
    }

    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public l2 f1996a;

        public d(Looper looper, l2 l2Var) {
            super(looper);
            this.f1996a = l2Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f1996a.handleMessage(message);
        }
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public String f1997a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap<String, String> f1998b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f1999c;

        public e(a aVar, String str, HashMap<String, String> hashMap, byte[] bArr) {
            this.f1997a = str;
            this.f1998b = hashMap;
            this.f1999c = bArr;
        }
    }

    public a() {
        b();
    }

    public final void b() {
        if (c()) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CloudSearchThread");
        this.f1991a = handlerThread;
        handlerThread.start();
        this.f1992b = new d(this.f1991a.getLooper(), this);
    }

    public final boolean c() {
        HandlerThread handlerThread = this.f1991a;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void d() {
        HandlerThread handlerThread = this.f1991a;
        if (handlerThread != null) {
            handlerThread.getLooper().quit();
        }
        this.f1993c = null;
        this.f1991a = null;
        this.f1992b = null;
    }

    public void e() {
        Handler handler = this.f1992b;
        if (handler != null) {
            handler.removeMessages(1007);
            Handler handler2 = this.f1992b;
            handler2.sendMessage(handler2.obtainMessage(1009));
        }
    }

    @Override // com.baidu.ar.l2
    public void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 1001) {
            e eVar = (e) message.obj;
            a(eVar.f1997a, eVar.f1998b, eVar.f1999c);
        } else if (i8 == 1008) {
            a(((e) message.obj).f1999c);
        } else {
            if (i8 != 1009) {
                return;
            }
            a();
        }
    }

    public final void a() {
        f2.a(new b());
    }

    public final void b(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("err_num")) {
            if (jSONObject.getInt("err_num") == 0 && jSONObject.has("data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2.has("cloud_recognize")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("cloud_recognize");
                    if (jSONObject3.has("url")) {
                        str2 = jSONObject3.getString("url");
                        a(str2);
                    }
                }
            }
            str2 = null;
            a(str2);
        }
    }

    public void a(c cVar) {
        this.f1993c = cVar;
    }

    public void b(byte[] bArr) {
        Handler handler = this.f1992b;
        if (handler != null) {
            handler.removeMessages(1007);
            e eVar = new e(this, id.e(), null, bArr);
            Handler handler2 = this.f1992b;
            handler2.sendMessage(handler2.obtainMessage(1008, eVar));
        }
    }

    public final void a(String str) {
        c cVar = this.f1993c;
        if (cVar != null) {
            cVar.onRequestLibraryResult(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: JSONException -> 0x003c, TryCatch #0 {JSONException -> 0x003c, blocks: (B:11:0x002c, B:13:0x0037, B:14:0x0049, B:15:0x004c, B:17:0x0052, B:18:0x0061, B:19:0x0064, B:21:0x006a, B:23:0x0078, B:25:0x0087, B:26:0x008e, B:28:0x0094, B:29:0x009b, B:31:0x00a1, B:32:0x00a8, B:34:0x00ad, B:41:0x0057, B:43:0x005d, B:44:0x003f, B:46:0x0045), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: JSONException -> 0x003c, TryCatch #0 {JSONException -> 0x003c, blocks: (B:11:0x002c, B:13:0x0037, B:14:0x0049, B:15:0x004c, B:17:0x0052, B:18:0x0061, B:19:0x0064, B:21:0x006a, B:23:0x0078, B:25:0x0087, B:26:0x008e, B:28:0x0094, B:29:0x009b, B:31:0x00a1, B:32:0x00a8, B:34:0x00ad, B:41:0x0057, B:43:0x005d, B:44:0x003f, B:46:0x0045), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[Catch: JSONException -> 0x003c, TryCatch #0 {JSONException -> 0x003c, blocks: (B:11:0x002c, B:13:0x0037, B:14:0x0049, B:15:0x004c, B:17:0x0052, B:18:0x0061, B:19:0x0064, B:21:0x006a, B:23:0x0078, B:25:0x0087, B:26:0x008e, B:28:0x0094, B:29:0x009b, B:31:0x00a1, B:32:0x00a8, B:34:0x00ad, B:41:0x0057, B:43:0x005d, B:44:0x003f, B:46:0x0045), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: JSONException -> 0x003c, TryCatch #0 {JSONException -> 0x003c, blocks: (B:11:0x002c, B:13:0x0037, B:14:0x0049, B:15:0x004c, B:17:0x0052, B:18:0x0061, B:19:0x0064, B:21:0x006a, B:23:0x0078, B:25:0x0087, B:26:0x008e, B:28:0x0094, B:29:0x009b, B:31:0x00a1, B:32:0x00a8, B:34:0x00ad, B:41:0x0057, B:43:0x005d, B:44:0x003f, B:46:0x0045), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: JSONException -> 0x003c, TryCatch #0 {JSONException -> 0x003c, blocks: (B:11:0x002c, B:13:0x0037, B:14:0x0049, B:15:0x004c, B:17:0x0052, B:18:0x0061, B:19:0x0064, B:21:0x006a, B:23:0x0078, B:25:0x0087, B:26:0x008e, B:28:0x0094, B:29:0x009b, B:31:0x00a1, B:32:0x00a8, B:34:0x00ad, B:41:0x0057, B:43:0x005d, B:44:0x003f, B:46:0x0045), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057 A[Catch: JSONException -> 0x003c, TryCatch #0 {JSONException -> 0x003c, blocks: (B:11:0x002c, B:13:0x0037, B:14:0x0049, B:15:0x004c, B:17:0x0052, B:18:0x0061, B:19:0x0064, B:21:0x006a, B:23:0x0078, B:25:0x0087, B:26:0x008e, B:28:0x0094, B:29:0x009b, B:31:0x00a1, B:32:0x00a8, B:34:0x00ad, B:41:0x0057, B:43:0x005d, B:44:0x003f, B:46:0x0045), top: B:10:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, HashMap<String, String> hashMap, byte[] bArr) {
        c cVar;
        JSONObject jSONObject;
        int i8;
        String string;
        JSONObject jSONObject2;
        long currentTimeMillis = System.currentTimeMillis();
        String a8 = f2.a(str, hashMap, bArr);
        if (TextUtils.isEmpty(a8)) {
            c cVar2 = this.f1993c;
            if (cVar2 != null) {
                cVar2.onResourceRequest(null);
                return;
            }
            return;
        }
        i2 i2Var = new i2();
        try {
            jSONObject = new JSONObject(a8);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        if (jSONObject.has("errorNum")) {
            i8 = jSONObject.getInt("errorNum");
        } else {
            if (jSONObject.has("err_code")) {
                i8 = jSONObject.getInt("err_code");
            }
            if (jSONObject.has("errorMsg")) {
                if (jSONObject.has("err_msg")) {
                    string = jSONObject.getString("err_msg");
                }
                if (jSONObject.has("data") && !TextUtils.isEmpty(jSONObject.get("data").toString())) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                    d4 d4Var = new d4();
                    if (jSONObject2.has("ar_key")) {
                        d4Var.a(jSONObject2.getString("ar_key"));
                    }
                    if (jSONObject2.has("ar_type")) {
                        d4Var.b(jSONObject2.getString("ar_type"));
                    }
                    if (jSONObject2.has("image_md5")) {
                        d4Var.c(jSONObject2.getString("image_md5"));
                    }
                    i2Var.a(d4Var);
                    Log.e("qatest", "云端识图: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                cVar = this.f1993c;
                if (cVar != null) {
                    cVar.onResourceRequest(i2Var);
                    return;
                }
                return;
            }
            string = jSONObject.getString("errorMsg");
            i2Var.a(string);
            if (jSONObject.has("data")) {
                jSONObject2 = jSONObject.getJSONObject("data");
                d4 d4Var2 = new d4();
                if (jSONObject2.has("ar_key")) {
                }
                if (jSONObject2.has("ar_type")) {
                }
                if (jSONObject2.has("image_md5")) {
                }
                i2Var.a(d4Var2);
                Log.e("qatest", "云端识图: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            }
            cVar = this.f1993c;
            if (cVar != null) {
            }
        }
        i2Var.a(i8);
        if (jSONObject.has("errorMsg")) {
        }
        i2Var.a(string);
        if (jSONObject.has("data")) {
        }
        cVar = this.f1993c;
        if (cVar != null) {
        }
    }

    public final void a(byte[] bArr) {
        f2.a(new C0034a(), bArr);
    }
}
