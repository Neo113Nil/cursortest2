package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public interface ig0 extends Closeable {
    Cursor A(og0 og0Var, CancellationSignal cancellationSignal);

    void C();

    void d();

    void e();

    Cursor f(og0 og0Var);

    boolean isOpen();

    rg0 k(String str);

    void q();

    boolean t();

    boolean x();

    void z();
}
