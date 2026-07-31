package com.google.android.gms.internal.ads;

import android.util.JsonReader;

/* loaded from: classes.dex */
public final class tr2 {

    /* renamed from: a, reason: collision with root package name */
    private String f12363a;

    tr2(JsonReader jsonReader) {
        char c7;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c7 = 0;
                }
                c7 = 65535;
            } else {
                if (nextName.equals("description")) {
                    c7 = 1;
                }
                c7 = 65535;
            }
            if (c7 == 0) {
                jsonReader.nextInt();
            } else if (c7 != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f12363a = str;
    }

    public final String a() {
        return this.f12363a;
    }
}
