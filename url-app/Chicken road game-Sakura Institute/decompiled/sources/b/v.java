package b;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5586a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5587b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public M2.m f5588c;

    public v(boolean z4) {
        this.f5586a = z4;
    }

    public void a() {
    }

    public abstract void b();

    public void c(C0487b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void d(C0487b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }
}
