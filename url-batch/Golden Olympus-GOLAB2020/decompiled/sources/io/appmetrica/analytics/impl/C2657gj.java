package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2657gj implements InterfaceC2683hj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39097b = "content://" + a() + "/clids";

    /* renamed from: c, reason: collision with root package name */
    public final String f39098c = "clid_key";

    /* renamed from: d, reason: collision with root package name */
    public final String f39099d = "clid_value";

    public C2657gj(@NotNull Context context) {
        this.f39096a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2683hj, kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final N3 invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.f39096a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC2967sj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f39096a.getContentResolver().query(Uri.parse(this.f39097b), null, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            try {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
                return null;
            } finally {
                AbstractC2713io.a(cursor);
            }
        }
        if (cursor == null) {
            AbstractC2967sj.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f39098c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f39099d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    AbstractC2967sj.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        AbstractC2967sj.a("Clids from satellite: %s", linkedHashMap);
        return new N3(linkedHashMap, EnumC2775l8.f39394d);
    }
}
