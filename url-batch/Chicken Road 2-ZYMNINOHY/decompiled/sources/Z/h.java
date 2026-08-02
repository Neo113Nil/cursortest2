package Z;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f3788a = iVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e4) {
                throw new IllegalStateException(e4);
            }
        } while (this.f3788a.j());
    }
}
