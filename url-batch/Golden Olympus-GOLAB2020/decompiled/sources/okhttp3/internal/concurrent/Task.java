package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public abstract class Task {

    /* renamed from: a, reason: collision with root package name */
    private final String f42704a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42705b;

    /* renamed from: c, reason: collision with root package name */
    private TaskQueue f42706c;

    /* renamed from: d, reason: collision with root package name */
    private long f42707d;

    public Task(String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f42704a = name;
        this.f42705b = z4;
        this.f42707d = -1L;
    }

    public final boolean a() {
        return this.f42705b;
    }

    public final String b() {
        return this.f42704a;
    }

    public final long c() {
        return this.f42707d;
    }

    public final TaskQueue d() {
        return this.f42706c;
    }

    public final void e(TaskQueue queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        TaskQueue taskQueue = this.f42706c;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f42706c = queue;
    }

    public abstract long f();

    public final void g(long j4) {
        this.f42707d = j4;
    }

    public String toString() {
        return this.f42704a;
    }

    public /* synthetic */ Task(String str, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? true : z4);
    }
}
