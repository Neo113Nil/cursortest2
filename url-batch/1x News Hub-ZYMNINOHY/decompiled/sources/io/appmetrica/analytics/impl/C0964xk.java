package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964xk implements Pc {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        IBinaryDataHelper f;
        C0938wk c0938wk = new C0938wk();
        C0912vk c0912vk = new C0912vk();
        C0656ln c0656ln = new C0656ln(c0912vk, c0912vk, new C0928wa(false), new Y1.M(22));
        C0511g7 a3 = C0511g7.a(context);
        a3.getClass();
        Context context2 = a3.f7368e;
        C0563i7 c0563i7 = a3.f7377p;
        byte[] bArr = new C0352a3(new C0887ul(new C0485f7(context2, new C0537h7(c0563i7.f7509a, c0563i7.f7510b, false).a(context2, c0938wk), c0656ln, PublicLogger.getAnonymousInstance())), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr == null) {
            int i3 = C0886uk.f8467a;
            return;
        }
        C0511g7 a4 = C0511g7.a(context);
        synchronized (a4) {
            f = a4.f();
        }
        ((C0352a3) f).insert("auto_inapp_collecting_info_data", bArr);
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final void a(Context context) {
        Vm vm = (Vm) Tm.a(C0707nm.class);
        ProtobufStateStorage<Object> a3 = vm.a(context, vm.b(context));
        C0707nm c0707nm = (C0707nm) a3.read();
        C0681mm a4 = c0707nm.a(c0707nm.f7968m);
        a4.o = 0L;
        a3.save(new C0707nm(a4));
        b(context);
    }
}
