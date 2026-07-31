package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: TrieNode.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrieNodeKt$filterTo$1 implements Function1 {
    public static final TrieNodeKt$filterTo$1 INSTANCE = new TrieNodeKt$filterTo$1();

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj != TrieNode.INSTANCE.getEMPTY$runtime());
    }
}
