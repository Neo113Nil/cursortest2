package y3;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface a extends Closeable {
    void A();

    void B(String str, Object[] objArr);

    void C();

    Cursor O(String str);

    void d();

    void e();

    Cursor g(d dVar, CancellationSignal cancellationSignal);

    void i(String str);

    boolean isOpen();

    e m(String str);

    Cursor p(d dVar);

    boolean s();

    boolean x();
}
