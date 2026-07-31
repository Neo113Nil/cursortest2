package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0535tk implements Jc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        Z6 z6;
        C0510sk c0510sk = new C0510sk();
        C0485rk c0485rk = new C0485rk();
        C0287jn c0287jn = new C0287jn(c0485rk, c0485rk, new C0451qa(false), new InterfaceC0313kn() { // from class: io.appmetrica.analytics.impl.tk$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC0313kn
            public final boolean a(SQLiteDatabase sQLiteDatabase) {
                return C0535tk.a(sQLiteDatabase);
            }
        });
        C0685zk B = C0401oa.I.B();
        synchronized (B) {
            C0065b7 c0065b7 = B.f1601a;
            z6 = new Z6(context, new C0039a7(c0065b7.f1179a, c0065b7.b, false).a(context, c0510sk), c0287jn, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new T2(new C0486rl(z6), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C0401oa.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(Context context) {
        Sm sm = (Sm) Qm.a(C0312km.class);
        ProtobufStateStorage<Object> a2 = sm.a(context, sm.b(context));
        C0312km c0312km = (C0312km) a2.read();
        C0286jm a3 = c0312km.a(c0312km.m);
        a3.o = 0L;
        a2.save(new C0312km(a3));
        b(context);
    }
}
