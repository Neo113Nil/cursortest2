package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956sk implements Ic {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        Y6 y6;
        C0930rk c0930rk = new C0930rk();
        C0905qk c0905qk = new C0905qk();
        C0700in c0700in = new C0700in(c0905qk, c0905qk, new C0869pa(false), new Zo(1));
        C1112yk B4 = C0817na.f12417I.B();
        synchronized (B4) {
            C0478a7 c0478a7 = B4.f13067a;
            y6 = new Y6(context, new Z6(c0478a7.f11430a, c0478a7.f11431b, false).a(context, c0930rk), c0700in, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new S2(new C0906ql(y6), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C0817na.f12417I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(Context context) {
        Rm rm = (Rm) Pm.a(C0725jm.class);
        ProtobufStateStorage<Object> a3 = rm.a(context, rm.b(context));
        C0725jm c0725jm = (C0725jm) a3.read();
        C0699im a4 = c0725jm.a(c0725jm.f12168m);
        a4.o = 0L;
        a3.save(new C0725jm(a4));
        b(context);
    }
}
