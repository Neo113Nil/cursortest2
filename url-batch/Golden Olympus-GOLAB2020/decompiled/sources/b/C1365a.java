package b;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f13295a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f13296b;

    public final void a(InterfaceC1366b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f13296b;
        if (context != null) {
            listener.a(context);
        }
        this.f13295a.add(listener);
    }

    public final void b() {
        this.f13296b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13296b = context;
        Iterator it = this.f13295a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1366b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f13296b;
    }

    public final void e(InterfaceC1366b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13295a.remove(listener);
    }
}
