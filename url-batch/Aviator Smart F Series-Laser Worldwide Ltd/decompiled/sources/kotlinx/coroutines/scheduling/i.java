package kotlinx.coroutines.scheduling;

/* loaded from: classes5.dex */
final class i implements h {
    private final int taskMode;

    public i(int i8) {
        this.taskMode = i8;
    }

    @Override // kotlinx.coroutines.scheduling.h
    public void afterTask() {
    }

    @Override // kotlinx.coroutines.scheduling.h
    public int getTaskMode() {
        return this.taskMode;
    }
}
