package com.baidu.xclient.gdid;

import android.content.Context;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.my.lib.data.ErrorCode;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f10719a;

    /* renamed from: b, reason: collision with root package name */
    public Context f10720b;

    public static c a() {
        if (f10719a == null) {
            synchronized (c.class) {
                try {
                    if (f10719a == null) {
                        f10719a = new c();
                    }
                } finally {
                }
            }
        }
        return f10719a;
    }

    public void b() {
        long f8 = e.e().f();
        if (System.currentTimeMillis() - f8 < e.e().g()) {
            return;
        }
        c();
    }

    public final void c() {
        String b8;
        try {
            if (com.baidu.xclient.gdid.k.d.a(this.f10720b) && com.baidu.mshield.b.e.a.d(this.f10720b) && (b8 = new com.baidu.xclient.gdid.g.a(this.f10720b, null).b()) != null) {
                e.e().a(System.currentTimeMillis());
                if ("".equals(b8)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(b8);
                e.e().a(jSONObject.optInt("1", 1));
                JSONObject optJSONObject = jSONObject.optJSONObject("2");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("j");
                    if (optLong >= 0) {
                        e.e().d(optLong * com.baidu.xclient.gdid.i.a.f10743a);
                    }
                    int optInt = optJSONObject.optInt("m", -1);
                    if (optInt != -1) {
                        if (optInt == 1) {
                            e.e().a(true);
                        } else {
                            e.e().a(false);
                        }
                    }
                    int optInt2 = optJSONObject.optInt("e", -1);
                    if (optInt2 != -1) {
                        if (optInt2 == 1) {
                            e.e().b(true);
                        } else {
                            e.e().b(false);
                        }
                    }
                    int optInt3 = optJSONObject.optInt("d", -1);
                    if (optInt3 == 1) {
                        e.e().c(true);
                    } else if (optInt3 == 0) {
                        e.e().c(false);
                    }
                    int optInt4 = optJSONObject.optInt(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, -1);
                    if (optInt4 != -1) {
                        if (optInt4 == 1) {
                            e.e().g(true);
                        } else {
                            e.e().g(false);
                        }
                    }
                    int optInt5 = optJSONObject.optInt("w", -1);
                    if (optInt5 != -1) {
                        if (optInt5 == 1) {
                            e.e().i(true);
                        } else {
                            e.e().i(false);
                        }
                    }
                    String optString = optJSONObject.optString("p", "-1");
                    if (!optString.equals("-1")) {
                        e.e().f(optString);
                    }
                    e.e().b(Base64.encodeToString(optJSONObject.toString().getBytes(), 1));
                    int optInt6 = optJSONObject.optInt("o", -1);
                    if (optInt6 == 1) {
                        e.e().h(true);
                    } else if (optInt6 == 0) {
                        e.e().h(false);
                    }
                    int optInt7 = optJSONObject.optInt("a", -1);
                    if (optInt7 == 1) {
                        e.e().j(true);
                    } else if (optInt7 == 0) {
                        e.e().j(false);
                    }
                    int optInt8 = optJSONObject.optInt("t", -1);
                    if (optInt8 == 1) {
                        e.e().k(true);
                    } else if (optInt8 == 0) {
                        e.e().k(false);
                    }
                    int optInt9 = optJSONObject.optInt("n", -1);
                    if (optInt9 == 1) {
                        e.e().l(true);
                    } else if (optInt9 == 0) {
                        e.e().l(false);
                    }
                    int optInt10 = optJSONObject.optInt(CmcdHeadersFactory.STREAMING_FORMAT_HLS, -1);
                    if (optInt10 == 1) {
                        e.e().e(true);
                    } else if (optInt10 == 0) {
                        e.e().e(false);
                    }
                    int optInt11 = optJSONObject.optInt("f", -1);
                    if (optInt11 == 1) {
                        e.e().f(true);
                    } else if (optInt11 == 0) {
                        e.e().f(false);
                    }
                    int optInt12 = optJSONObject.optInt("aa", -1);
                    if (optInt12 == 1) {
                        e.e().d(true);
                    } else if (optInt12 == 0) {
                        e.e().d(false);
                    }
                }
                if (jSONObject.optJSONObject("6") != null) {
                    e.e().b(r0.optInt("1", 0) * com.baidu.xclient.gdid.i.a.f10743a);
                    e.e().f(r0.optInt("2", 0) * com.baidu.xclient.gdid.i.a.f10743a);
                    e.e().h(r0.optInt("4", 0) * com.baidu.xclient.gdid.i.a.f10743a);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("7");
                if (optJSONObject2 != null) {
                    e.e().e(optJSONObject2.optInt("s", -1));
                    e.e().b(optJSONObject2.optInt("d", -1));
                    e.e().c(optJSONObject2.optInt("j", -1));
                    e.e().d(optJSONObject2.optInt("c", -1));
                    e.e().f(optJSONObject2.optInt("o", -1));
                }
                String optString2 = jSONObject.optString(ErrorCode.PARAMETER_ERROR);
                if (e.e().j().equals(optString2)) {
                    return;
                }
                e.e().a(optString2);
                String optString3 = jSONObject.optString(ExifInterface.GPS_MEASUREMENT_3D, "");
                String optString4 = jSONObject.optString("4", "");
                String optString5 = jSONObject.optString("8", "");
                e.e().d(optString3);
                e.e().e(optString4);
                e.e().g(optString5);
            }
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }

    public void a(Context context) {
        this.f10720b = context;
        b();
    }
}
