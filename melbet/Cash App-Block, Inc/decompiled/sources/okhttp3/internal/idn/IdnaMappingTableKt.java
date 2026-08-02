package okhttp3.internal.idn;

import okio.Path;

/* loaded from: classes3.dex */
public abstract class IdnaMappingTableKt {
    public static final Path.Companion IDNA_MAPPING_TABLE = new Path.Companion();

    public static final int read14BitInt(int i, String str) {
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }
}
