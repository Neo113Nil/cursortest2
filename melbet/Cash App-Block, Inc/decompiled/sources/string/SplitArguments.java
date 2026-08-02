package string;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes10.dex */
public final class SplitArguments {
    public final List delimiters;
    public final String text;

    public SplitArguments(String str, List list) {
        this.text = str;
        this.delimiters = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitArguments)) {
            return false;
        }
        SplitArguments splitArguments = (SplitArguments) obj;
        return this.text.equals(splitArguments.text) && this.delimiters.equals(splitArguments.delimiters);
    }

    public final int hashCode() {
        return this.delimiters.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("SplitArguments(text=", this.text, ", delimiters=", ")", this.delimiters);
    }
}
