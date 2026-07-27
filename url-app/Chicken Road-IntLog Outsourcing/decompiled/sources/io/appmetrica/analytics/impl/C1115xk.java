package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115xk implements Pc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        IBinaryDataHelper f3;
        C1089wk c1089wk = new C1089wk();
        C1063vk c1063vk = new C1063vk();
        C0807ln c0807ln = new C0807ln(c1063vk, c1063vk, new C1079wa(false), new Vo(2));
        C0662g7 a6 = C0662g7.a(context);
        a6.getClass();
        Context context2 = a6.f8239e;
        C0714i7 c0714i7 = a6.f8250p;
        byte[] bArr = new C0503a3(new C1038ul(new C0636f7(context2, new C0688h7(c0714i7.f8393a, c0714i7.f8394b, false).a(context2, c1089wk), c0807ln, PublicLogger.getAnonymousInstance())), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr == null) {
            int i2 = C1037uk.f9416a;
            return;
        }
        C0662g7 a7 = C0662g7.a(context);
        synchronized (a7) {
            f3 = a7.f();
        }
        ((C0503a3) f3).insert("auto_inapp_collecting_info_data", bArr);
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        Vm vm = (Vm) Tm.a(C0858nm.class);
        ProtobufStateStorage<Object> a6 = vm.a(context, vm.b(context));
        C0858nm c0858nm = (C0858nm) a6.read();
        C0832mm a7 = c0858nm.a(c0858nm.f8886m);
        a7.f8815o = 0L;
        a6.save(new C0858nm(a7));
        b(context);
    }
}
