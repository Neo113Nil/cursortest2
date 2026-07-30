package com.baidu.ar;

import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.platform.comapi.map.MapController;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t8 {

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f3300a;

        public a(e eVar) {
            this.f3300a = eVar;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.f3300a.a(false, null, null, null, null);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                t8.this.a(iHttpResponse.getContent(), this.f3300a);
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f3300a.a(false, "ar inner exception", null, null, null);
            }
        }
    }

    public class b implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f3302a;

        public b(f fVar) {
            this.f3302a = fVar;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.f3302a.onUploadProtobufResult(null, true);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            t8.this.a(iHttpResponse, this.f3302a, true);
        }
    }

    public class c implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f3304a;

        public c(f fVar) {
            this.f3304a = fVar;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.f3304a.onUploadProtobufResult(null, false);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            t8.this.a(iHttpResponse, this.f3304a, false);
        }
    }

    public class d implements Comparator<String> {
        public d(t8 t8Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public interface e {
        void a(boolean z7, String str, String str2, float[] fArr, String str3);
    }

    public interface f {
        void onUploadProtobufResult(byte[] bArr, boolean z7);
    }

    public final String a(Map<String, Object> map) {
        String format;
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : map.keySet()) {
            if ((map.get(str) instanceof Float) || (map.get(str) instanceof Double)) {
                NumberFormat numberInstance = NumberFormat.getNumberInstance();
                numberInstance.setMaximumFractionDigits(5);
                numberInstance.setRoundingMode(RoundingMode.HALF_DOWN);
                format = new DecimalFormat("0.00000").format(Double.parseDouble(numberInstance.format(map.get(str))));
            } else {
                boolean z7 = map.get(str) instanceof Boolean;
                Object obj = map.get(str);
                if (z7) {
                    format = ((Boolean) obj).booleanValue() ? "true" : "false";
                } else {
                    stringBuffer.append(obj);
                }
            }
            stringBuffer.append(format);
        }
        stringBuffer.append("313d1d593314c7bff96422b0f29432d9c50a");
        return k8.b(stringBuffer.toString());
    }

    public final TreeMap<String, Object> b() {
        return new TreeMap<>(new d(this));
    }

    public void a() {
        r8.a();
    }

    public void b(byte[] bArr, f fVar) {
        r8.a(id.q(), bArr, new c(fVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[Catch: IOException -> 0x003c, TRY_ENTER, TryCatch #6 {IOException -> 0x003c, blocks: (B:19:0x0035, B:28:0x0058, B:30:0x005d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[Catch: IOException -> 0x003c, TRY_LEAVE, TryCatch #6 {IOException -> 0x003c, blocks: (B:19:0x0035, B:28:0x0058, B:30:0x005d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[Catch: IOException -> 0x006a, TRY_LEAVE, TryCatch #1 {IOException -> 0x006a, blocks: (B:46:0x0066, B:39:0x006e), top: B:45:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(IHttpResponse iHttpResponse, f fVar, boolean z7) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e8;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = iHttpResponse.getStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e9) {
                    e8 = e9;
                    byteArrayOutputStream = null;
                    try {
                        e8.printStackTrace();
                        fVar.onUploadProtobufResult(null, z7);
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        if (inputStream == null) {
                            inputStream.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        inputStream = inputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                throw th;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    inputStream = inputStream2;
                    if (byteArrayOutputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                return;
            }
        } catch (IOException e12) {
            e8 = e12;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            inputStream = inputStream2;
            if (byteArrayOutputStream != null) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            inputStream.close();
            if (byteArray != null && byteArray.length > 0) {
                fVar.onUploadProtobufResult(byteArray, z7);
                byteArrayOutputStream.close();
                inputStream.close();
            }
            fVar.onUploadProtobufResult(null, z7);
            byteArrayOutputStream.close();
            inputStream.close();
        } catch (IOException e13) {
            e8 = e13;
            e8.printStackTrace();
            fVar.onUploadProtobufResult(null, z7);
            if (byteArrayOutputStream != null) {
            }
            if (inputStream == null) {
            }
        } catch (Throwable th5) {
            th = th5;
            if (byteArrayOutputStream != null) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public void a(byte[] bArr, f fVar) {
        if (fVar == null) {
            return;
        }
        r8.a(id.p(), bArr, new b(fVar));
    }

    public void a(double[] dArr, String str, int i8, int i9, e eVar) {
        double d8;
        double d9;
        if (eVar == null) {
            return;
        }
        String m8 = id.m();
        long currentTimeMillis = System.currentTimeMillis();
        TreeMap<String, Object> b8 = b();
        if (dArr == null) {
            d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            d9 = 0.0d;
        } else {
            double d10 = dArr[0];
            d8 = dArr[1];
            d9 = d10;
        }
        b8.put("lat", Double.valueOf(d9));
        b8.put("lng", Double.valueOf(d8));
        b8.put("frame_width", String.valueOf(i8));
        b8.put("frame_height", String.valueOf(i9));
        b8.put("phonetype", "Android_" + Build.MODEL);
        b8.put("timestamp", Long.valueOf(currentTimeMillis));
        b8.put("version", String.valueOf(o.a()));
        if (!TextUtils.isEmpty(str)) {
            b8.put("building_id", str);
        }
        b8.put("userid", TextUtils.isEmpty(q8.a()) ? MapController.DEFAULT_LAYER_TAG : q8.a());
        b8.put(HttpConstants.SIGN, a(b8).toUpperCase());
        r8.a(m8, new JSONObject(b8), new a(eVar));
    }

    public final boolean a(String str, e eVar) {
        String str2;
        float[] fArr;
        String string;
        boolean z7;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("err_code") || jSONObject.getInt("err_code") == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                str2 = (String) jSONObject2.get(StatisticConstants.VPS_SESSION_ID);
                if (jSONObject2.has(PixelReadParams.DEFAULT_FILTER_ID)) {
                    String[] split = jSONObject2.getString(PixelReadParams.DEFAULT_FILTER_ID).split(SystemInfoUtil.COMMA);
                    float[] fArr2 = new float[split.length];
                    for (int i8 = 0; i8 < split.length; i8++) {
                        fArr2[i8] = Float.parseFloat(split[i8]);
                    }
                    fArr = fArr2;
                } else {
                    fArr = null;
                }
                string = jSONObject2.has("conf") ? jSONObject2.getString("conf") : null;
                if (TextUtils.isEmpty(str2)) {
                    eVar.a(false, null, null, null, null);
                } else {
                    z7 = true;
                    str3 = FirebaseAnalytics.Param.SUCCESS;
                }
            } else {
                str3 = jSONObject.getString("err_msg");
                z7 = false;
                str2 = null;
                fArr = null;
                string = null;
            }
            eVar.a(z7, str3, str2, fArr, string);
            return true;
        }
        return false;
    }
}
