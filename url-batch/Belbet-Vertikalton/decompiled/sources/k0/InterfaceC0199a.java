package k0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0199a extends Closeable {
    InterfaceC0203e C(String str);

    void c();

    void e();

    void f();

    Cursor g(InterfaceC0202d interfaceC0202d);

    Cursor i(InterfaceC0202d interfaceC0202d, CancellationSignal cancellationSignal);

    boolean isOpen();

    boolean o();

    void r(String str);

    Cursor u(String str);

    void w();

    boolean x();
}
