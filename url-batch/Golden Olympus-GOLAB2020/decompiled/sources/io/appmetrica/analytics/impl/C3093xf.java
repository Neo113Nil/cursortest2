package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3093xf implements InterfaceC2683hj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40174b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final String f40175c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final String f40176d = "additional_parameters";

    public C3093xf(@NotNull Context context) {
        this.f40173a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2683hj, kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ef invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f40173a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC2967sj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f40173a.getContentResolver().query(Uri.parse(this.f40174b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC2967sj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f40175c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f40176d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC2967sj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC2967sj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                Ef ef = new Ef(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC2775l8.f39394d);
                                AbstractC2713io.a(cursor);
                                return ef;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC2967sj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC2967sj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        Ef ef2 = new Ef(string, jSONObject22, !TextUtils.isEmpty(string), false, EnumC2775l8.f39394d);
                        AbstractC2713io.a(cursor);
                        return ef2;
                    }
                    AbstractC2967sj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        AbstractC2713io.a(cursor);
        return null;
    }
}
