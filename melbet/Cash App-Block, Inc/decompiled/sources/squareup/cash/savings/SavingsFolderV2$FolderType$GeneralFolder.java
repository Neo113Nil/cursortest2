package squareup.cash.savings;

import androidx.camera.camera2.pipe.AeMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class SavingsFolderV2$FolderType$GeneralFolder extends AeMode.Companion {
    public final GeneralFolder value;

    public SavingsFolderV2$FolderType$GeneralFolder(GeneralFolder generalFolder) {
        generalFolder.getClass();
        this.value = generalFolder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsFolderV2$FolderType$GeneralFolder) && Intrinsics.areEqual(this.value, ((SavingsFolderV2$FolderType$GeneralFolder) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GeneralFolder(value=" + this.value + ")";
    }
}
