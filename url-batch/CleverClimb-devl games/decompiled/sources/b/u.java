package b;

import java.io.IOException;

/* compiled from: Interceptor.java */
/* loaded from: classes.dex */
public interface u {

    /* compiled from: Interceptor.java */
    public interface a {
        aa a();

        ac a(aa aaVar) throws IOException;
    }

    ac intercept(a aVar) throws IOException;
}
