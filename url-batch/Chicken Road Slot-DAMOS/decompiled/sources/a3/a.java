package a3;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f192e;

    public /* synthetic */ a(int i3, Function0 function0) {
        this.f191d = i3;
        this.f192e = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f191d) {
            case 0:
                this.f192e.invoke();
                break;
            case 1:
                this.f192e.invoke();
                break;
            case 2:
                this.f192e.invoke();
                break;
            default:
                this.f192e.invoke();
                break;
        }
    }
}
