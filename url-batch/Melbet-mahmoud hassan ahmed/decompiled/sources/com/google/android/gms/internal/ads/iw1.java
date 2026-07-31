package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class iw1 {

    /* renamed from: a, reason: collision with root package name */
    private final v3.d f6808a;

    public iw1(v3.d dVar) {
        this.f6808a = dVar;
    }

    public final void a(List<Object> list, String str, String str2, Object... objArr) {
        if (d30.f4056a.e().booleanValue()) {
            long b7 = this.f6808a.b();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(b7);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    Object obj = objArr[i7];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e7) {
                io0.e("unable to log", e7);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            io0.f(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
