package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
final class s implements r {
    @Override // kotlinx.coroutines.flow.r
    public e command(t tVar) {
        return g.flowOf(SharingCommand.START);
    }

    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
