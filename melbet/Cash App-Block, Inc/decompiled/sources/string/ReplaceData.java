package string;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes10.dex */
public final class ReplaceData {
    public final String newString;
    public final String oldString;
    public final String replaceCandidate;

    public ReplaceData(String str, String str2, String str3) {
        this.replaceCandidate = str;
        this.oldString = str2;
        this.newString = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceData)) {
            return false;
        }
        ReplaceData replaceData = (ReplaceData) obj;
        return this.replaceCandidate.equals(replaceData.replaceCandidate) && this.oldString.equals(replaceData.oldString) && this.newString.equals(replaceData.newString);
    }

    public final int hashCode() {
        return this.newString.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.replaceCandidate.hashCode() * 31, 31, this.oldString);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReplaceData(replaceCandidate=", this.replaceCandidate, ", oldString=", this.oldString, ", newString="), this.newString, ")");
    }
}
