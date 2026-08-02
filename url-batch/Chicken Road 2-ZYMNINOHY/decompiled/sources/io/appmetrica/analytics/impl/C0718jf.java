package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718jf implements Ui {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12132a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12133b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final String f12134c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final String f12135d = "additional_parameters";

    public C0718jf(Context context) {
        this.f12132a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ui, o3.InterfaceC1328a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0900qf invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f12132a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0619fj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f12132a.getContentResolver().query(Uri.parse(this.f12133b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0619fj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f12134c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f12135d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0619fj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0619fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C0900qf c0900qf = new C0900qf(string, jSONObject2, !TextUtils.isEmpty(string), false, S7.f10934d);
                                AbstractC0779lo.a(cursor);
                                return c0900qf;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0619fj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0619fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        C0900qf c0900qf2 = new C0900qf(string, jSONObject22, !TextUtils.isEmpty(string), false, S7.f10934d);
                        AbstractC0779lo.a(cursor);
                        return c0900qf2;
                    }
                    AbstractC0619fj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        AbstractC0779lo.a(cursor);
        return null;
    }
}
