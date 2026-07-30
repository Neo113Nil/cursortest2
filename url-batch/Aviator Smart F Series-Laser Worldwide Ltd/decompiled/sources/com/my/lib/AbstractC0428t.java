package com.my.lib;

import com.my.lib.AbstractC0428t;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.TimeoutConfig;
import java.io.File;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* renamed from: com.my.lib.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0428t {
    public static final y5.w a(f6.l lVar, int i8, String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        if (i8 == 1) {
            AbstractC0409a.a(ErrorCode.TIME_OUT, msg, lVar);
        } else if (i8 != 2) {
            AbstractC0409a.a(ErrorCode.NO_ACCESS_SERVER, msg, lVar);
        } else {
            AbstractC0409a.a(ErrorCode.UNKNOWN_ERROR, msg, lVar);
        }
        return y5.w.INSTANCE;
    }

    public static void a(File file, String fileFormat, TimeoutConfig timeoutConfig, final f6.l onSuccess, final f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (file.exists()) {
            AbstractC0415g.a(file, fileFormat, timeoutConfig, new f6.l() { // from class: i5.a1
                @Override // f6.l
                public final Object invoke(Object obj) {
                    return AbstractC0428t.a(f6.l.this, onFailure, (Response) obj);
                }
            }, new f6.p() { // from class: i5.b1
                @Override // f6.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC0428t.a(f6.l.this, ((Integer) obj).intValue(), (String) obj2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("file does not exist");
    }

    public static final y5.w a(f6.l lVar, f6.l lVar2, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            ResponseBody body = response.body();
            String string = body != null ? body.string() : null;
            B.a("onResponse: " + string);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                int optInt = jSONObject.optInt("VzQn");
                if (optInt == 0) {
                    String optString = jSONObject.getJSONObject("Wlgj").optString("l3HAD");
                    kotlin.jvm.internal.s.checkNotNull(optString);
                    lVar.invoke(optString);
                } else {
                    String optString2 = jSONObject.optString("fpfBsZp");
                    String valueOf = String.valueOf(optInt);
                    kotlin.jvm.internal.s.checkNotNull(optString2);
                    lVar2.invoke(new ErrorCode(valueOf, optString2));
                }
            } else {
                lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, "response body is null"));
            }
        } catch (Exception e8) {
            lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
