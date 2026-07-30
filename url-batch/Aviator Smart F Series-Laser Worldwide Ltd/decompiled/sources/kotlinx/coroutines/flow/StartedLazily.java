package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
final class StartedLazily implements r {
    @Override // kotlinx.coroutines.flow.r
    public e command(t tVar) {
        return g.flow(new StartedLazily$command$1(tVar, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
