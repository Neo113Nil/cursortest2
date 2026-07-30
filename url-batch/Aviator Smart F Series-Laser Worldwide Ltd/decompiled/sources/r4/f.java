package r4;

import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public class f extends a {
    @Override // r4.a
    public void param(String name, String str) {
        s.checkNotNullParameter(name, "name");
        if (str == null) {
            return;
        }
        getHttpUrl().setQueryParameter(name, str);
    }

    @Override // r4.a
    public void param(String name, String str, boolean z7) {
        s.checkNotNullParameter(name, "name");
        if (str == null) {
            return;
        }
        if (z7) {
            getHttpUrl().setEncodedQueryParameter(name, str);
        } else {
            getHttpUrl().setQueryParameter(name, str);
        }
    }

    @Override // r4.a
    public void param(String name, Number number) {
        s.checkNotNullParameter(name, "name");
        if (number == null) {
            return;
        }
        getHttpUrl().setQueryParameter(name, number.toString());
    }

    @Override // r4.a
    public void param(String name, Boolean bool) {
        s.checkNotNullParameter(name, "name");
        if (bool != null) {
            bool.booleanValue();
            getHttpUrl().setQueryParameter(name, bool.toString());
        }
    }
}
