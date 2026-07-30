package a;

/* loaded from: classes.dex */
public final class a {
    public final StackTraceElement coroutineBoundary() {
        StackTraceElement artificialFrame;
        artificialFrame = b.artificialFrame(new Exception(), c.class.getSimpleName());
        return artificialFrame;
    }

    public final StackTraceElement coroutineCreation() {
        StackTraceElement artificialFrame;
        artificialFrame = b.artificialFrame(new Exception(), d.class.getSimpleName());
        return artificialFrame;
    }
}
