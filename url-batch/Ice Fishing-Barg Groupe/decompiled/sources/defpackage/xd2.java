package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xd2 extends ud2 {
    public final Runnable wdg6QnbFHrFF;

    public xd2(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.wdg6QnbFHrFF = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.wdg6QnbFHrFF.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.wdg6QnbFHrFF;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(zv.VhhvGxCb8gfr(runnable));
        sb.append(", ");
        sb.append(this.rtx2ld2ELZv4);
        sb.append(", ");
        return o0.QrzZRwfaDlRX(sb, this.OPXfSBeufaJ8 ? "Blocking" : "Non-blocking", ']');
    }
}
