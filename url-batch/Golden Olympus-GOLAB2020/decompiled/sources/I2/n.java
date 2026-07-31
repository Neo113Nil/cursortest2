package I2;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class n extends h {
    public n(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // I2.h
    public void f(b bVar) {
        if (bVar == null) {
            throw new IOException("null object detected");
        }
        bVar.b().g().e(this);
    }

    @Override // I2.h
    h a() {
        return this;
    }
}
