package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Yi implements Zi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6910a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6911b = "content://" + a() + "/clids";

    /* renamed from: c, reason: collision with root package name */
    public final String f6912c = "clid_key";

    /* renamed from: d, reason: collision with root package name */
    public final String f6913d = "clid_value";

    public Yi(Context context) {
        this.f6910a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Zi, l2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0997z3 invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.f6910a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0626kj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f6910a.getContentResolver().query(Uri.parse(this.f6911b), null, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            try {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids" + IOUtils.LINE_SEPARATOR_UNIX + StringUtils.throwableToString(th), new Object[0]);
                return null;
            } finally {
                AbstractC0709no.a(cursor);
            }
        }
        if (cursor == null) {
            AbstractC0626kj.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f6912c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6913d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    AbstractC0626kj.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        AbstractC0626kj.a("Clids from satellite: %s", linkedHashMap);
        return new C0997z3(linkedHashMap, Y7.f6893d);
    }
}
