package D2;

import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class t extends A {
    public static final t INSTANCE = new t();
    private static final String content = "null";

    private t() {
        super(null);
    }

    @Override // D2.A
    public String getContent() {
        return content;
    }

    @Override // D2.A
    public boolean isString() {
        return false;
    }

    public final KSerializer serializer() {
        return u.f903a;
    }
}
