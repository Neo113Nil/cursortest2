package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0436pk implements Jc {

    /* renamed from: a, reason: collision with root package name */
    public final xo f1438a;
    public final String b = "startup_state";
    public final AESEncrypter c;

    public C0436pk(xo xoVar) {
        this.f1438a = xoVar;
        C0031a c0031a = new C0031a(C0401oa.k().g());
        this.c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0031a.b(), c0031a.a());
    }

    public static void a(xo xoVar, C0286jm c0286jm, Bb bb) {
        String optStringOrNull;
        synchronized (xoVar) {
            optStringOrNull = JsonUtils.optStringOrNull(xoVar.f1572a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(bb.d)) {
                xoVar.a(bb.d);
            }
            if (!TextUtils.isEmpty(bb.e)) {
                xoVar.b(bb.e);
            }
            if (TextUtils.isEmpty(bb.f775a)) {
                return;
            }
            c0286jm.f1327a = bb.f775a;
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C0401oa.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Bb a2 = a(readableDatabase);
                C0286jm c0286jm = new C0286jm(new C0345m4(new C0294k4()));
                if (a2 != null) {
                    a(this.f1438a, c0286jm, a2);
                    c0286jm.p = a2.c;
                    c0286jm.r = a2.b;
                }
                C0312km c0312km = new C0312km(c0286jm);
                Sm sm = (Sm) Qm.a(C0312km.class);
                sm.a(context, sm.b(context)).save(c0312km);
            } catch (Throwable unused) {
            }
        }
    }

    public final Bb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Bb bb = (Bb) MessageNano.mergeFrom(new Bb(), this.c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return bb;
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
