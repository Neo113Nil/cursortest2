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
public final class Ti implements Ui {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11007b = "content://" + a() + "/clids";

    /* renamed from: c, reason: collision with root package name */
    public final String f11008c = "clid_key";

    /* renamed from: d, reason: collision with root package name */
    public final String f11009d = "clid_value";

    public Ti(Context context) {
        this.f11006a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ui, o3.InterfaceC1328a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0913r3 invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.f11006a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0619fj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f11006a.getContentResolver().query(Uri.parse(this.f11007b), null, null, null, null);
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
                AbstractC0779lo.a(cursor);
            }
        }
        if (cursor == null) {
            AbstractC0619fj.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f11008c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f11009d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    AbstractC0619fj.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        AbstractC0619fj.a("Clids from satellite: %s", linkedHashMap);
        return new C0913r3(linkedHashMap, S7.f10934d);
    }
}
