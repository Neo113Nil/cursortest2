package xyz.block.genie.expressions;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lxyz/block/genie/expressions/UnresolvedTemplateTokensException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UnresolvedTemplateTokensException extends RuntimeException {
    public final LinkedHashSet keys;

    public UnresolvedTemplateTokensException(LinkedHashSet linkedHashSet) {
        super("Unresolved template tokens: ".concat(CollectionsKt.joinToString$default(CollectionsKt.sorted(linkedHashSet), ", ", null, null, 0, null, null, 62)));
        this.keys = linkedHashSet;
    }
}
