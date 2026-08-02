package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853ok implements Ic {

    /* renamed from: a, reason: collision with root package name */
    public final C1064wo f12528a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12529b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f12530c;

    public C0853ok(C1064wo c1064wo) {
        this.f12528a = c1064wo;
        C0470a c0470a = new C0470a(C0817na.k().g());
        this.f12530c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0470a.b(), c0470a.a());
    }

    public static void a(C1064wo c1064wo, C0699im c0699im, Ab ab) {
        String optStringOrNull;
        synchronized (c1064wo) {
            optStringOrNull = JsonUtils.optStringOrNull(c1064wo.f12987a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(ab.f10038d)) {
                c1064wo.a(ab.f10038d);
            }
            if (!TextUtils.isEmpty(ab.f10039e)) {
                c1064wo.b(ab.f10039e);
            }
            if (TextUtils.isEmpty(ab.f10035a)) {
                return;
            }
            c0699im.f12056a = ab.f10035a;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C0817na.f12417I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Ab a3 = a(readableDatabase);
                C0699im c0699im = new C0699im(new C0759l4(new C0707j4()));
                if (a3 != null) {
                    a(this.f12528a, c0699im, a3);
                    c0699im.f12069p = a3.f10037c;
                    c0699im.f12071r = a3.f10036b;
                }
                C0725jm c0725jm = new C0725jm(c0699im);
                Rm rm = (Rm) Pm.a(C0725jm.class);
                rm.a(context, rm.b(context)).save(c0725jm);
            } catch (Throwable unused) {
            }
        }
    }

    public final Ab a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f12529b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Ab ab = (Ab) MessageNano.mergeFrom(new Ab(), this.f12530c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return ab;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        CloseableUtilsKt.closeSafely(cursor);
        return null;
    }
}
