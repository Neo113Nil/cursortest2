package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.facebook.CallbackManager;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.components.DependencyException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class b71 implements u3, nc0, rc2, dh2 {
    public static /* bridge */ /* synthetic */ MeasurementManager d(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void f() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void o() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void t() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.u3
    public void a(Object obj) {
        LoginButton.onAttachedToWindow$lambda$0((CallbackManager.ActivityResultParameters) obj);
    }

    @Override // defpackage.rc2
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                mh a = gm.a();
                a.F(rawQuery.getString(1));
                a.p = z42.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a.o = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a.i());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.dh2
    public bh2 c(kl3 kl3Var) {
        gn gnVar = (gn) kl3Var.d;
        return new bh2(gnVar.b(gnVar.b), gnVar.b(gnVar.c), kl3Var.b() == 1);
    }

    @Override // defpackage.nc0
    public double b(double d) {
        return d;
    }
}
