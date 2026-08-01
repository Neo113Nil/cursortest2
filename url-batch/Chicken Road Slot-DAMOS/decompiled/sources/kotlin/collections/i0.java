package kotlin.collections;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.se;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements l1.i, l8.e, n0.f, r6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5570d;

    public /* synthetic */ i0(int i3) {
        this.f5570d = i3;
    }

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(int i3, int i10, Object obj, String str) {
        throw new IllegalArgumentException((str + i3 + obj + i10).toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new com.google.android.gms.internal.measurement.d0(str + obj + obj2, 3);
    }

    public static /* synthetic */ void g(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void i(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void j() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    @Override // l1.i
    public double a(double d10) {
        switch (this.f5570d) {
            case 2:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                float[] fArr = l1.d.f5758a;
                return l1.d.b(l1.d.f5760c, d10);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                float[] fArr2 = l1.d.f5758a;
                return l1.d.a(l1.d.f5760c, d10);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                float[] fArr3 = l1.d.f5758a;
                return l1.d.d(l1.d.f5761d, d10);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                float[] fArr4 = l1.d.f5758a;
                return l1.d.c(l1.d.f5761d, d10);
            default:
                return d10;
        }
    }

    @Override // r6.e
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                a1.n a9 = k6.i.a();
                a9.G(rawQuery.getString(1));
                a9.f42r = u6.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a9.f41i = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a9.k());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // l8.e
    public Object b(se seVar) {
        h6.e lambda$getComponents$0;
        h6.e lambda$getComponents$1;
        h6.e lambda$getComponents$2;
        switch (this.f5570d) {
            case RequestError.STOP_TRACKING /* 11 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3069a.get();
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3071c.get();
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3070b.get();
            case 14:
                l8.n nVar = ExecutorsRegistrar.f3069a;
                return m8.k.f6608d;
            case 24:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(seVar);
                return lambda$getComponents$0;
            case 25:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(seVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(seVar);
                return lambda$getComponents$2;
        }
    }

    @Override // n0.f
    public void cancel() {
    }
}
