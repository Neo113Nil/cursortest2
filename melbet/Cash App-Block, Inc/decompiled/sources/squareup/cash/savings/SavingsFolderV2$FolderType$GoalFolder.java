package squareup.cash.savings;

import androidx.camera.camera2.pipe.AeMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class SavingsFolderV2$FolderType$GoalFolder extends AeMode.Companion {
    public final GoalFolder value;

    public SavingsFolderV2$FolderType$GoalFolder(GoalFolder goalFolder) {
        goalFolder.getClass();
        this.value = goalFolder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsFolderV2$FolderType$GoalFolder) && Intrinsics.areEqual(this.value, ((SavingsFolderV2$FolderType$GoalFolder) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GoalFolder(value=" + this.value + ")";
    }
}
