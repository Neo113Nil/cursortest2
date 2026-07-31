package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3046vk implements InterfaceC2571dd {

    /* renamed from: a, reason: collision with root package name */
    public final C2998to f39983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39984b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f39985c;

    public C3046vk(@NotNull C2998to c2998to) {
        this.f39983a = c2998to;
        C2476a c2476a = new C2476a(Ia.j().f());
        this.f39985c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c2476a.b(), c2476a.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2571dd
    public final void a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = C3007u7.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Vb a4 = a(readableDatabase);
                C2711im c2711im = new C2711im(new G4(new E4()));
                if (a4 != null) {
                    a(this.f39983a, c2711im, a4);
                    c2711im.f39233p = a4.f38419c;
                    c2711im.f39235r = a4.f38418b;
                }
                C2737jm c2737jm = new C2737jm(c2711im);
                Rm a5 = Qm.a(C2737jm.class);
                a5.a(context, a5.d(context)).save(c2737jm);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(C2998to c2998to, C2711im c2711im, Vb vb) {
        String optStringOrNull;
        synchronized (c2998to) {
            optStringOrNull = JsonUtils.optStringOrNull(c2998to.f39884a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(vb.f38420d)) {
                c2998to.a(vb.f38420d);
            }
            if (!TextUtils.isEmpty(vb.f38421e)) {
                c2998to.b(vb.f38421e);
            }
            if (TextUtils.isEmpty(vb.f38417a)) {
                return;
            }
            c2711im.f39218a = vb.f38417a;
        }
    }

    public final Vb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f39984b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Vb vb = (Vb) MessageNano.mergeFrom(new Vb(), this.f39985c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return vb;
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
