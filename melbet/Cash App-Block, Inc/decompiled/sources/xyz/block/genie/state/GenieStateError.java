package xyz.block.genie.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lxyz/block/genie/state/GenieStateError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "UnexpectedValueAtSegment", "TypeMismatch", "ItemScopedCollectionMutationUnsupported", "Lxyz/block/genie/state/GenieStateError$ItemScopedCollectionMutationUnsupported;", "Lxyz/block/genie/state/GenieStateError$TypeMismatch;", "Lxyz/block/genie/state/GenieStateError$UnexpectedValueAtSegment;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class GenieStateError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/state/GenieStateError$ItemScopedCollectionMutationUnsupported;", "Lxyz/block/genie/state/GenieStateError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ItemScopedCollectionMutationUnsupported extends GenieStateError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/state/GenieStateError$TypeMismatch;", "Lxyz/block/genie/state/GenieStateError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TypeMismatch extends GenieStateError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/state/GenieStateError$UnexpectedValueAtSegment;", "Lxyz/block/genie/state/GenieStateError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnexpectedValueAtSegment extends GenieStateError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedValueAtSegment(String str, GenieStateValue genieStateValue) {
            super("Unexpected value at segment '" + str + "': " + genieStateValue);
            str.getClass();
        }
    }
}
