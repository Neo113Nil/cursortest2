package string;

/* loaded from: classes10.dex */
public final class FewReplace extends ReplaceMode {
    public final ReplaceData replaceData;
    public final int times;

    public FewReplace(ReplaceData replaceData, int i) {
        this.replaceData = replaceData;
        this.times = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReplaceData replaceData = this.replaceData;
        return ReplaceModeKt.replace(this.times, replaceData.replaceCandidate, replaceData.oldString, replaceData.newString);
    }
}
