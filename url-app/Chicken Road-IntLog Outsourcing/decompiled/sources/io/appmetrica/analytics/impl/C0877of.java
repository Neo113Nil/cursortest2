package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877of implements Zi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8927a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8928b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final String f8929c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final String f8930d = "additional_parameters";

    public C0877of(Context context) {
        this.f8927a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Zi, t4.InterfaceC1430a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1058vf invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (!PackageManagerUtils.hasContentProvider(this.f8927a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0777kj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f8927a.getContentResolver().query(Uri.parse(this.f8928b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0777kj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f8929c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f8930d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject2 = new JSONObject(string2);
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0777kj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0777kj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C1058vf c1058vf = new C1058vf(string, jSONObject2, !TextUtils.isEmpty(string), false, Y7.f7731d);
                                AbstractC0860no.a(cursor);
                                return c1058vf;
                            }
                        }
                        jSONObject = new JSONObject();
                        jSONObject2 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0777kj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0777kj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                        C1058vf c1058vf2 = new C1058vf(string, jSONObject2, !TextUtils.isEmpty(string), false, Y7.f7731d);
                        AbstractC0860no.a(cursor);
                        return c1058vf2;
                    }
                    AbstractC0777kj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        AbstractC0860no.a(cursor);
        return null;
    }
}
