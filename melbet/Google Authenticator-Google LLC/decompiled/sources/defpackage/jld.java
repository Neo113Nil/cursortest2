package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jld extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public jld(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public jld(String str) {
        super(str);
    }

    public jld(IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}
