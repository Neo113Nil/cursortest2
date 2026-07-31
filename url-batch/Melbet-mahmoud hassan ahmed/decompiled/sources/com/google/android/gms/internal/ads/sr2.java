package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class sr2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11946b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11947c;

    public sr2(int i7, int i8, boolean z6) {
        this.f11945a = i7;
        this.f11946b = i8;
        this.f11947c = z6;
    }

    static List<sr2> a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i7 = 0;
            int i8 = 0;
            boolean z6 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i7 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i8 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z6 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new sr2(i7, i8, z6));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
