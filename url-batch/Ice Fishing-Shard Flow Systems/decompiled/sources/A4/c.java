package A4;

import D0.j;
import D6.z;
import S1.n;
import T1.k;
import a1.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f2.InterfaceC0397d;
import h1.f;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import k1.AbstractC0594a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements e, S1.e, K1.a, f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89d;

    public /* synthetic */ c(int i2) {
        this.f89d = i2;
    }

    @Override // A4.e
    public boolean a(View view) {
        return view.hasFocus();
    }

    @Override // h1.f
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                j a7 = i.a();
                a7.b0(rawQuery.getString(1));
                a7.f332l = AbstractC0594a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a7.f331i = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a7.A());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // S1.e
    public Object c(z zVar) {
        X0.e lambda$getComponents$0;
        X0.e lambda$getComponents$1;
        X0.e lambda$getComponents$2;
        InterfaceC0397d lambda$getComponents$02;
        switch (this.f89d) {
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4405a.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4407c.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4406b.get();
            case 18:
                n nVar = ExecutorsRegistrar.f4405a;
                return k.f2597d;
            case 19:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(zVar);
                return lambda$getComponents$0;
            case 20:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(zVar);
                return lambda$getComponents$1;
            case 21:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(zVar);
                return lambda$getComponents$2;
            default:
                lambda$getComponents$02 = FirebaseInstallationsRegistrar.lambda$getComponents$0(zVar);
                return lambda$getComponents$02;
        }
    }

    @Override // K1.a
    public Object h(Task task) {
        int i2;
        switch (this.f89d) {
            case 23:
                i2 = 403;
                break;
            default:
                i2 = -1;
                break;
        }
        return Integer.valueOf(i2);
    }
}
