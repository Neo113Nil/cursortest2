package kotlinx.serialization.descriptors;

import okio.Utf8;

/* loaded from: classes3.dex */
public abstract class StructureKind extends Utf8 {

    public final class CLASS extends StructureKind {
        public static final CLASS INSTANCE = new CLASS();
        public static final CLASS INSTANCE$1 = new CLASS();
    }

    /* loaded from: classes9.dex */
    public final class MAP extends StructureKind {
        public static final MAP INSTANCE$1 = new MAP();
        public static final MAP INSTANCE = new MAP();
    }
}
