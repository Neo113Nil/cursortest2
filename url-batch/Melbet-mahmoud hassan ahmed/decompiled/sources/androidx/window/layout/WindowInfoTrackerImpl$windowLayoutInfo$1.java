package androidx.window.layout;

import android.app.Activity;
import f6.p;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.i;
import o6.g;
import o6.h;
import v5.l;
import v5.q;

@f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends k implements p<p6.c<? super WindowLayoutInfo>, y5.d<? super q>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, y5.d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m7invokeSuspend$lambda0(o6.f fVar, WindowLayoutInfo windowLayoutInfo) {
        i.c(windowLayoutInfo, "info");
        fVar.a(windowLayoutInfo);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final y5.d<q> create(Object obj, y5.d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // f6.p
    public final Object invoke(p6.c<? super WindowLayoutInfo> cVar, y5.d<? super q> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(cVar, dVar)).invokeSuspend(q.f22838a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:11:0x0061, B:16:0x0073, B:18:0x007b), top: B:10:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0090 -> B:10:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c7;
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1;
        WindowBackend windowBackend;
        p6.c cVar;
        q.a<WindowLayoutInfo> aVar;
        WindowBackend windowBackend2;
        g it;
        WindowBackend windowBackend3;
        Object a7;
        c7 = z5.d.c();
        int i7 = this.label;
        try {
        } catch (Throwable th) {
            th = th;
            windowInfoTrackerImpl$windowLayoutInfo$1 = this;
        }
        try {
            if (i7 == 0) {
                l.b(obj);
                cVar = (p6.c) this.L$0;
                final o6.f b7 = h.b(10, o6.e.DROP_OLDEST, null, 4, null);
                aVar = new q.a() { // from class: androidx.window.layout.d
                    @Override // q.a
                    public final void accept(Object obj2) {
                        WindowInfoTrackerImpl$windowLayoutInfo$1.m7invokeSuspend$lambda0(o6.f.this, (WindowLayoutInfo) obj2);
                    }
                };
                windowBackend2 = this.this$0.windowBackend;
                windowBackend2.registerLayoutChangeCallback(this.$activity, new Executor() { // from class: androidx.window.layout.c
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, aVar);
                it = b7.iterator();
            } else if (i7 == 1) {
                it = (g) this.L$2;
                aVar = (q.a) this.L$1;
                p6.c cVar2 = (p6.c) this.L$0;
                l.b(obj);
                p6.c cVar3 = cVar2;
                windowInfoTrackerImpl$windowLayoutInfo$1 = this;
                if (!((Boolean) obj).booleanValue()) {
                    WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) it.next();
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar3;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = it;
                    windowInfoTrackerImpl$windowLayoutInfo$1.label = 2;
                    if (cVar3.emit(windowLayoutInfo, windowInfoTrackerImpl$windowLayoutInfo$1) == c7) {
                        return c7;
                    }
                    cVar = cVar3;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = it;
                    windowInfoTrackerImpl$windowLayoutInfo$1.label = 1;
                    a7 = it.a(windowInfoTrackerImpl$windowLayoutInfo$1);
                    if (a7 != c7) {
                        return c7;
                    }
                    cVar3 = cVar;
                    obj = a7;
                    if (!((Boolean) obj).booleanValue()) {
                        windowBackend3 = windowInfoTrackerImpl$windowLayoutInfo$1.this$0.windowBackend;
                        windowBackend3.unregisterLayoutChangeCallback(aVar);
                        return q.f22838a;
                    }
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (g) this.L$2;
                aVar = (q.a) this.L$1;
                p6.c cVar4 = (p6.c) this.L$0;
                l.b(obj);
                cVar = cVar4;
            }
            windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar;
            windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
            windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = it;
            windowInfoTrackerImpl$windowLayoutInfo$1.label = 1;
            a7 = it.a(windowInfoTrackerImpl$windowLayoutInfo$1);
            if (a7 != c7) {
            }
        } catch (Throwable th2) {
            th = th2;
            windowBackend = windowInfoTrackerImpl$windowLayoutInfo$1.this$0.windowBackend;
            windowBackend.unregisterLayoutChangeCallback(aVar);
            throw th;
        }
        windowInfoTrackerImpl$windowLayoutInfo$1 = this;
    }
}
