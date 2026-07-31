package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.we, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3066we {
    public static final V9 a(C3066we c3066we, EnumC2594ea enumC2594ea, Object obj) {
        int i4;
        c3066we.getClass();
        V9 v9 = new V9();
        switch (enumC2594ea) {
            case UNKNOWN:
                i4 = 0;
                break;
            case APPSFLYER:
                i4 = 1;
                break;
            case ADJUST:
                i4 = 2;
                break;
            case KOCHAVA:
                i4 = 3;
                break;
            case TENJIN:
                i4 = 4;
                break;
            case AIRBRIDGE:
                i4 = 5;
                break;
            case SINGULAR:
                i4 = 6;
                break;
            default:
                throw new W1.m();
        }
        v9.f38414a = i4;
        C3092xe.f40172b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        v9.f38415b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return v9;
    }
}
