package p7;

import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends z {
    public static final s INSTANCE = new s();
    private static final String content = "null";

    private s() {
        super(null);
    }

    @Override // p7.z
    public String getContent() {
        return content;
    }

    @Override // p7.z
    public boolean isString() {
        return false;
    }

    public final KSerializer serializer() {
        return t.f7236a;
    }
}
