package h1;

/* loaded from: classes2.dex */
public class X {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f36725b;

    /* renamed from: a, reason: collision with root package name */
    public W f36724a = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36726c = true;

    public X(Runnable runnable) {
        this.f36725b = runnable;
    }

    public void registerOnBackPressedCallback() {
        if (this.f36724a != null) {
            return;
        }
        this.f36724a = new W(this.f36725b);
    }

    public void unregisterOnBackPressedCallback() {
        this.f36724a = null;
    }
}
