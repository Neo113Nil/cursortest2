package v1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1018a extends Closeable {
    Cursor E(d dVar, CancellationSignal cancellationSignal);

    Cursor H(d dVar);

    Cursor K(String str);

    boolean M();

    void d();

    void f();

    boolean isOpen();

    boolean n();

    void q(String str);

    void s();

    e w(String str);

    void y();
}
