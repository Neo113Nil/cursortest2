package w;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends Closeable {
    void A();

    void B(String str, Object[] objArr);

    Cursor L(String str);

    Cursor N(e eVar, CancellationSignal cancellationSignal);

    void d();

    void g();

    boolean isOpen();

    List<Pair<String, String>> j();

    void k(String str);

    f n(String str);

    String r();

    boolean s();

    Cursor t(e eVar);
}
