package papa;

/* loaded from: classes3.dex */
public final /* synthetic */ class InteractionTrace$Companion$$ExternalSyntheticLambda0 implements InteractionTrace {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ InteractionTrace$Companion$$ExternalSyntheticLambda0(String str, int i) {
        this.f$0 = str;
        this.f$1 = i;
    }

    @Override // papa.InteractionTrace
    public final void endTrace() {
        SafeTrace.endAsyncSection(this.f$0, this.f$1);
    }
}
