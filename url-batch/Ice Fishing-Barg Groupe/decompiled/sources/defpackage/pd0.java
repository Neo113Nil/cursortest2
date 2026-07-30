package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pd0 implements Closeable {
    private static final od0 Companion = new od0();
    public static final String[] OPXfSBeufaJ8 = new String[0];
    public static final nx0 dgRBjINgWbAK;
    public static final nx0 wdg6QnbFHrFF;
    public final SQLiteDatabase rtx2ld2ELZv4;

    static {
        kb kbVar = new kb(8);
        pz0 pz0Var = pz0.rtx2ld2ELZv4;
        wdg6QnbFHrFF = vi0.ryVscX7ZL4Ux(pz0Var, kbVar);
        dgRBjINgWbAK = vi0.ryVscX7ZL4Ux(pz0Var, new kb(9));
    }

    public pd0(SQLiteDatabase sQLiteDatabase) {
        this.rtx2ld2ELZv4 = sQLiteDatabase;
    }

    public static Method lS5Rgt96tfkO() {
        Class<?> returnType;
        try {
            Companion.getClass();
            Method method = (Method) wdg6QnbFHrFF.getValue();
            if (method == null || (returnType = method.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void OPXfSBeufaJ8() {
        Companion.getClass();
        nx0 nx0Var = dgRBjINgWbAK;
        if (((Method) nx0Var.getValue()) != null) {
            nx0 nx0Var2 = wdg6QnbFHrFF;
            if (((Method) nx0Var2.getValue()) != null) {
                Method method = (Method) nx0Var.getValue();
                method.getClass();
                Method method2 = (Method) nx0Var2.getValue();
                method2.getClass();
                Object invoke = method2.invoke(this.rtx2ld2ELZv4, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    u9.rtx2ld2ELZv4("Required value was null.");
                    return;
                }
            }
        }
        a92UlCVFR9N8();
    }

    public final boolean S9EYkSpbGuxq() {
        return this.rtx2ld2ELZv4.inTransaction();
    }

    public final void a92UlCVFR9N8() {
        this.rtx2ld2ELZv4.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.rtx2ld2ELZv4.close();
    }

    public final void cpQdD2nAriOS() {
        this.rtx2ld2ELZv4.endTransaction();
    }

    public final boolean isOpen() {
        return this.rtx2ld2ELZv4.isOpen();
    }
}
