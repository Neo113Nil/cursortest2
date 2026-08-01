package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class yq implements ig0 {
    public static final String[] g = new String[0];
    public static final ww h;
    public static final ww i;
    public final SQLiteDatabase f;

    static {
        zw zwVar = zw.NONE;
        h = n9.B(zwVar, new z1(1));
        i = n9.B(zwVar, new z1(2));
    }

    public yq(SQLiteDatabase sQLiteDatabase) {
        this.f = sQLiteDatabase;
    }

    @Override // defpackage.ig0
    public final Cursor A(og0 og0Var, CancellationSignal cancellationSignal) {
        Cursor rawQueryWithFactory = this.f.rawQueryWithFactory(new wq(0, og0Var), og0Var.d(), g, null, cancellationSignal);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.ig0
    public final void C() {
        this.f.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    @Override // defpackage.ig0
    public final void d() {
        this.f.endTransaction();
    }

    @Override // defpackage.ig0
    public final void e() {
        this.f.beginTransaction();
    }

    @Override // defpackage.ig0
    public final Cursor f(og0 og0Var) {
        Cursor rawQueryWithFactory = this.f.rawQueryWithFactory(new wq(1, new xq(og0Var)), og0Var.d(), g, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.ig0
    public final boolean isOpen() {
        return this.f.isOpen();
    }

    @Override // defpackage.ig0
    public final rg0 k(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.f.compileStatement(str);
        compileStatement.getClass();
        return new gr(compileStatement);
    }

    @Override // defpackage.ig0
    public final void q() {
        ww wwVar = i;
        if (((Method) wwVar.getValue()) != null) {
            ww wwVar2 = h;
            if (((Method) wwVar2.getValue()) != null) {
                Method method = (Method) wwVar.getValue();
                method.getClass();
                Method method2 = (Method) wwVar2.getValue();
                method2.getClass();
                Object invoke = method2.invoke(this.f, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    s9.u("Required value was null.");
                    return;
                }
            }
        }
        e();
    }

    @Override // defpackage.ig0
    public final boolean t() {
        return this.f.inTransaction();
    }

    @Override // defpackage.ig0
    public final boolean x() {
        return this.f.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.ig0
    public final void z() {
        this.f.setTransactionSuccessful();
    }
}
