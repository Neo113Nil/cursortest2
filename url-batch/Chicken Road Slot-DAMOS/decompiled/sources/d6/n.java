package d6;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n f3647e = new n(1);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n f3648i = new n(3);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ n f3649r = new n(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3650d;

    public /* synthetic */ n(int i3) {
        this.f3650d = i3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3650d) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
