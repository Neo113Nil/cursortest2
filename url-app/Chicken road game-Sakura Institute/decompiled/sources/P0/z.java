package P0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f3781e;

    public /* synthetic */ z(Function0 function0, int i2) {
        this.f3780d = i2;
        this.f3781e = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3780d) {
            case 0:
                this.f3781e.invoke();
                break;
            default:
                this.f3781e.invoke();
                break;
        }
    }
}
