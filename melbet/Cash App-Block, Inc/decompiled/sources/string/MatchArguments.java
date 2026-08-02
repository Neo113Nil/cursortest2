package string;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes10.dex */
public final class MatchArguments {
    public final List regexOptions;
    public final String regexPattern;
    public final String text;

    public MatchArguments(String str, String str2, List list) {
        this.text = str;
        this.regexPattern = str2;
        this.regexOptions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchArguments)) {
            return false;
        }
        MatchArguments matchArguments = (MatchArguments) obj;
        return this.text.equals(matchArguments.text) && this.regexPattern.equals(matchArguments.regexPattern) && this.regexOptions.equals(matchArguments.regexOptions);
    }

    public final int hashCode() {
        return this.regexOptions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.regexPattern);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MatchArguments(text=", this.text, ", regexPattern=", this.regexPattern, ", regexOptions="), this.regexOptions, ")");
    }
}
