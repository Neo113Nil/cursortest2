package string;

import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes10.dex */
public final class AllReplace extends ReplaceMode {
    public final ReplaceData replaceData;

    public AllReplace(ReplaceData replaceData) {
        this.replaceData = replaceData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReplaceData replaceData = this.replaceData;
        return StringsKt__StringsJVMKt.replace$default(replaceData.replaceCandidate, replaceData.oldString, replaceData.newString);
    }
}
