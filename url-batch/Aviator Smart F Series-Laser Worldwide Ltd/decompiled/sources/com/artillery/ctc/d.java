package com.artillery.ctc;

import com.artillery.ctc.base.AnalysisModel;
import com.artillery.ctc.h;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

/* loaded from: classes.dex */
public abstract class d {
    public static final String a(String str, String tid) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(tid, "tid");
        JsonObject jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
        jsonObject.addProperty("tid", tid);
        String obj = jsonObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(obj, "Gson().fromJson(this, Js…d\", tid)\n    }.toString()");
        return obj;
    }

    public static final AnalysisModel b(String action, String tid) {
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        kotlin.jvm.internal.s.checkNotNullParameter(tid, "tid");
        h.b bVar = h.f791d;
        return new AnalysisModel(bVar.a().c().getDeviceId(), bVar.a().c().getMac(), action, null, null, tid, null, null, null, 472, null);
    }

    public static final void c(String str, String tag) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(tag, "tag");
        if (h.f791d.a().f()) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("SDK_Version = overseas_2.0.013 ");
            if (tag.length() == 0) {
                tag = "ChatApi";
            }
            sb.append(tag);
            sb.append(" logcat: ");
            sb.append(str);
            objArr[0] = sb.toString();
            j.a(objArr);
        }
    }

    public static final void d(String str, String tag) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(tag, "tag");
    }

    public static final String a(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        JsonObject jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
        jsonObject.remove("tid");
        String obj = jsonObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(obj, "Gson().fromJson(this, Js…ove(TID)\n    }.toString()");
        return obj;
    }

    public static /* synthetic */ void b(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "";
        }
        d(str, str2);
    }

    public static final String a(String str, String... keys) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keys, "keys");
        JsonObject jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
        for (String str2 : keys) {
            jsonObject.remove(str2);
        }
        String obj = jsonObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(obj, "Gson().fromJson(this, Js…       }\n    }.toString()");
        return obj;
    }

    public static /* synthetic */ void a(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "";
        }
        c(str, str2);
    }
}
