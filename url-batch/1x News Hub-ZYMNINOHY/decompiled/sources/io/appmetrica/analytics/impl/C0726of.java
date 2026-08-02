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
public final class C0726of implements Zi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8007a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8008b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final String f8009c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final String f8010d = "additional_parameters";

    public C0726of(Context context) {
        this.f8007a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Zi, l2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0907vf invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f8007a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0626kj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f8007a.getContentResolver().query(Uri.parse(this.f8008b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0626kj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f8009c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f8010d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0626kj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0626kj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C0907vf c0907vf = new C0907vf(string, jSONObject2, !TextUtils.isEmpty(string), false, Y7.f6893d);
                                AbstractC0709no.a(cursor);
                                return c0907vf;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0626kj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0626kj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        C0907vf c0907vf2 = new C0907vf(string, jSONObject22, !TextUtils.isEmpty(string), false, Y7.f6893d);
                        AbstractC0709no.a(cursor);
                        return c0907vf2;
                    }
                    AbstractC0626kj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        AbstractC0709no.a(cursor);
        return null;
    }
}
