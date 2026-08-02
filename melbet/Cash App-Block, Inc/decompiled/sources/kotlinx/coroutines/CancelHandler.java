package kotlinx.coroutines;

/* loaded from: classes3.dex */
public interface CancelHandler extends NotCompleted {
    void invoke(Throwable th);
}
