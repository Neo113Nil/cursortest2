package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834sk implements Pc {

    /* renamed from: a, reason: collision with root package name */
    public final yo f8321a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8322b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f8323c;

    public C0834sk(yo yoVar) {
        this.f8321a = yoVar;
        C0348a c0348a = new C0348a(C0876ua.k().g());
        this.f8323c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0348a.b(), c0348a.a());
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C0511g7.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Hb a3 = a(readableDatabase);
                C0681mm c0681mm = new C0681mm(new C0818s4(new C0767q4()));
                if (a3 != null) {
                    a(this.f8321a, c0681mm, a3);
                    c0681mm.f7903p = a3.f6076c;
                    c0681mm.f7905r = a3.f6075b;
                }
                C0707nm c0707nm = new C0707nm(c0681mm);
                Vm vm = (Vm) Tm.a(C0707nm.class);
                vm.a(context, vm.b(context)).save(c0707nm);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(yo yoVar, C0681mm c0681mm, Hb hb) {
        String optStringOrNull;
        synchronized (yoVar) {
            optStringOrNull = JsonUtils.optStringOrNull(yoVar.f8654a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(hb.f6077d)) {
                yoVar.a(hb.f6077d);
            }
            if (!TextUtils.isEmpty(hb.f6078e)) {
                yoVar.b(hb.f6078e);
            }
            if (TextUtils.isEmpty(hb.f6074a)) {
                return;
            }
            c0681mm.f7890a = hb.f6074a;
        }
    }

    public final Hb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f8322b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Hb hb = (Hb) MessageNano.mergeFrom(new Hb(), this.f8323c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return hb;
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
