package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposedModifier.kt */
@Stable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifierN;", "Landroidx/compose/ui/ComposedModifier;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "fqName", "Ljava/lang/String;", "getFqName", "()Ljava/lang/String;", "", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    public boolean equals(Object other) {
        if (other instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) other;
            if (Intrinsics.areEqual(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
