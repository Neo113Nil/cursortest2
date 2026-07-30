package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class t61 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c71 c71Var = new c71(stringWriter);
            c71Var.q = true;
            n03 n03Var = r03.a;
            rt1.c(c71Var, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
