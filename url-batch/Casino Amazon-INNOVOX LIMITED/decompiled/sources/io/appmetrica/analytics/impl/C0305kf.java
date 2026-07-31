package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0305kf implements Vi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1343a;
    public final String b = "content://" + a() + "/preload_info";
    public final String c = "tracking_id";
    public final String d = "additional_parameters";

    public C0305kf(Context context) {
        this.f1343a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0480rf invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f1343a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0206gj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f1343a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0206gj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0206gj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0206gj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C0480rf c0480rf = new C0480rf(string, jSONObject2, !TextUtils.isEmpty(string), false, T7.d);
                                mo.a(cursor);
                                return c0480rf;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0206gj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0206gj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        C0480rf c0480rf2 = new C0480rf(string, jSONObject22, !TextUtils.isEmpty(string), false, T7.d);
                        mo.a(cursor);
                        return c0480rf2;
                    }
                    AbstractC0206gj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        mo.a(cursor);
        return null;
    }
}
