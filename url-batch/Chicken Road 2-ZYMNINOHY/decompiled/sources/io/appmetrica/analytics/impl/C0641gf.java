package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641gf implements InterfaceC1097y5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC1097y5, o3.InterfaceC1339l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0900qf invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            AbstractC0619fj.a("Tracking id is empty", new Object[0]);
            return null;
        }
        if (ParseUtils.parseLong(asString) == null) {
            AbstractC0619fj.a("Tracking id from preload info content provider is not a number", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                AbstractC0619fj.a("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                AbstractC0619fj.a("Additional params are empty", new Object[0]);
                return null;
            }
            AbstractC0619fj.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C0900qf(asString, jSONObject, true, false, S7.f10935e);
        } catch (Throwable th) {
            ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Could not parse additional parameters\n" + StringUtils.throwableToString(th), new Object[0]);
            return null;
        }
    }
}
