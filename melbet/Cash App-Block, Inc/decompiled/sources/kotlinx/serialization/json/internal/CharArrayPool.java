package kotlinx.serialization.json.internal;

import kotlin.collections.ArrayDeque;

/* loaded from: classes10.dex */
public final class CharArrayPool {
    public static final CharArrayPool INSTANCE = new CharArrayPool();
    public final ArrayDeque arrays = new ArrayDeque();
    public int charsTotal;
}
