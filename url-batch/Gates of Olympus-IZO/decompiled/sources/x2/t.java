package x2;

import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class t extends A {
    public static final t INSTANCE = new t();
    private static final String content = "null";

    private t() {
        super(null);
    }

    @Override // x2.A
    public String getContent() {
        return content;
    }

    @Override // x2.A
    public boolean isString() {
        return false;
    }

    public final KSerializer serializer() {
        return u.f8763a;
    }
}
