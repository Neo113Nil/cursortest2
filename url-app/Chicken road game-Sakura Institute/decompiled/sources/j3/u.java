package j3;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata
/* loaded from: classes.dex */
public final class u extends B {
    public static final u INSTANCE = new u();
    private static final String content = "null";

    private u() {
        super(null);
    }

    @Override // j3.B
    public String getContent() {
        return content;
    }

    @Override // j3.B
    public boolean isString() {
        return false;
    }

    public final KSerializer serializer() {
        return v.f7222a;
    }
}
