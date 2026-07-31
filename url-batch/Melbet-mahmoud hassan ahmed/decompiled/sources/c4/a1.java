package c4;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public String f1922b;

    /* renamed from: c, reason: collision with root package name */
    public String f1923c;

    /* renamed from: d, reason: collision with root package name */
    public String f1924d;

    /* renamed from: a, reason: collision with root package name */
    public int f1921a = w0.f2143i;

    /* renamed from: e, reason: collision with root package name */
    public List<String> f1925e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public List<z0> f1926f = Collections.emptyList();

    public static a1 a(JsonReader jsonReader) {
        a1 a1Var = new a1();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "consent_signal":
                    a1Var.f1921a = w0.d(jsonReader);
                    continue;
                case "error_message":
                    a1Var.f1924d = jsonReader.nextString();
                    continue;
                case "consent_form_base_url":
                    a1Var.f1923c = jsonReader.nextString();
                    continue;
                case "actions":
                    a1Var.f1926f = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        z0 z0Var = new z0();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("args_json")) {
                                z0Var.f2165b = jsonReader.nextString();
                            } else if (nextName2.equals("action_type")) {
                                z0Var.f2164a = w0.a(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        a1Var.f1926f.add(z0Var);
                    }
                    break;
                case "request_info_keys":
                    a1Var.f1925e = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a1Var.f1925e.add(jsonReader.nextString());
                    }
                    break;
                case "consent_form_payload":
                    a1Var.f1922b = jsonReader.nextString();
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.endArray();
        }
        jsonReader.endObject();
        return a1Var;
    }
}
