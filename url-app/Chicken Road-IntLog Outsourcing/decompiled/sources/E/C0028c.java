package E;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f1.AbstractC0416a;
import g2.C0453e;
import h2.C0480a;
import h2.C0481b;
import h2.C0482c;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0755jn;
import io.appmetrica.analytics.impl.C0793l9;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.InterfaceC0624el;
import io.appmetrica.analytics.impl.Pd;
import io.appmetrica.analytics.impl.T7;
import io.appmetrica.analytics.impl.Yd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0028c implements N1.d, c1.g, I1.a, S0.e, FunctionWithThrowable, Yd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f602a;

    public /* synthetic */ C0028c(int i2) {
        this.f602a = i2;
    }

    @Override // io.appmetrica.analytics.impl.Yd
    public InterfaceC0624el a(E0 e02) {
        switch (this.f602a) {
            case 26:
                return Pd.a(e02);
            default:
                return Pd.b(e02);
        }
    }

    @Override // c1.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Boolean a6;
        switch (this.f602a) {
            case C0793l9.f8682D /* 20 */:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    Cursor cursor = rawQuery;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        B4.i a7 = V0.i.a();
                        a7.R(cursor.getString(1));
                        a7.f313d = AbstractC0416a.b(cursor.getInt(2));
                        String string = cursor.getString(3);
                        a7.f312c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a7.v());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 23:
                C0453e c0453e = (C0453e) obj;
                B4.i iVar = f2.p.f5628a;
                iVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    iVar.B(byteArrayOutputStream, c0453e);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case C0793l9.f8684F /* 25 */:
                a6 = C2.a((ActivityManager) obj);
                return a6;
            case 28:
                return T7.a((UiModeManager) obj);
            default:
                return C0755jn.b((Activity) obj);
        }
    }

    @Override // N1.d
    public Object d(B.d dVar) {
        S0.f lambda$getComponents$0;
        S0.f lambda$getComponents$1;
        S0.f lambda$getComponents$2;
        Z1.d lambda$getComponents$02;
        switch (this.f602a) {
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.f5312a.get();
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.f5314c.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f5313b.get();
            case 9:
                N1.m mVar = ExecutorsRegistrar.f5312a;
                return O1.l.f2264a;
            case 10:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            case 11:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(dVar);
                return lambda$getComponents$1;
            case 12:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(dVar);
                return lambda$getComponents$2;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                Set d6 = dVar.d(N1.q.a(C0480a.class));
                C0482c c0482c = C0482c.f5781c;
                if (c0482c == null) {
                    synchronized (C0482c.class) {
                        try {
                            c0482c = C0482c.f5781c;
                            if (c0482c == null) {
                                c0482c = new C0482c(0);
                                C0482c.f5781c = c0482c;
                            }
                        } finally {
                        }
                    }
                }
                return new C0481b(d6, c0482c);
            case C0793l9.f8681C /* 19 */:
                lambda$getComponents$02 = FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$02;
        }
    }

    @Override // I1.a
    public Object j(Task task) {
        switch (this.f602a) {
            case C0793l9.f8683E /* 21 */:
                return 403;
            default:
                return -1;
        }
    }

    public /* synthetic */ C0028c(G2.i iVar) {
        this.f602a = 1;
    }
}
