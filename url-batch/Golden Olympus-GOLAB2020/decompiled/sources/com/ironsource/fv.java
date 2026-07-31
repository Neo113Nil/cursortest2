package com.ironsource;

import com.ironsource.ut;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class fv implements ip {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1525o1 f16312a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Runnable f16313b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16314c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<hp> f16315d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ut f16316e;

    /* JADX WARN: Multi-variable type inference failed */
    public fv(@NotNull C1525o1 adTools, @NotNull Runnable task, long j4, @NotNull List<? extends hp> pauseTriggers) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(pauseTriggers, "pauseTriggers");
        this.f16312a = adTools;
        this.f16313b = task;
        this.f16314c = j4;
        this.f16315d = pauseTriggers;
        this.f16316e = new ut(adTools.a(), new Runnable() { // from class: com.ironsource.Q0
            @Override // java.lang.Runnable
            public final void run() {
                fv.b(fv.this);
            }
        }, j4);
        for (hp hpVar : pauseTriggers) {
            hpVar.a(this);
            if (hpVar.d()) {
                a(hpVar.b());
            }
        }
        if (a()) {
            ut.a b4 = this.f16316e.b();
            List<hp> list = this.f16315d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((hp) obj).d()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                long c4 = ((hp) next).c();
                do {
                    Object next2 = it.next();
                    long c5 = ((hp) next2).c();
                    if (c4 > c5) {
                        next = next2;
                        c4 = c5;
                    }
                } while (it.hasNext());
            }
            a(((hp) next).b(), b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fv this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<hp> it = this$0.f16315d.iterator();
        while (it.hasNext()) {
            it.next().a((ip) null);
        }
        this$0.f16316e.b();
    }

    private final void b() {
        c();
        this.f16313b.run();
    }

    public /* synthetic */ fv(C1525o1 c1525o1, Runnable runnable, long j4, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1525o1, runnable, j4, (i4 & 8) != 0 ? new ArrayList() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fv this$0, hp pauseableTrigger) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.a(pauseableTrigger.b());
        if (!this$0.a() || this$0.f16316e.e()) {
            return;
        }
        this$0.a(pauseableTrigger.b(), this$0.f16316e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(fv this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    public final void c() {
        this.f16312a.d(new Runnable() { // from class: com.ironsource.P0
            @Override // java.lang.Runnable
            public final void run() {
                fv.a(fv.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(fv this$0, hp pauseableTrigger) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.b(pauseableTrigger.b());
        if (this$0.a() || !this$0.f16316e.e()) {
            return;
        }
        this$0.b(pauseableTrigger.b(), this$0.f16316e.a());
    }

    @Override // com.ironsource.ip
    public void a(@NotNull final hp pauseableTrigger) {
        Intrinsics.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.f16312a.d(new Runnable() { // from class: com.ironsource.O0
            @Override // java.lang.Runnable
            public final void run() {
                fv.a(fv.this, pauseableTrigger);
            }
        });
    }

    private final void a(String str) {
        this.f16312a.e().h().d(str);
    }

    @Override // com.ironsource.ip
    public void b(@NotNull final hp pauseableTrigger) {
        Intrinsics.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.f16312a.d(new Runnable() { // from class: com.ironsource.R0
            @Override // java.lang.Runnable
            public final void run() {
                fv.b(fv.this, pauseableTrigger);
            }
        });
    }

    private final void a(String str, ut.a aVar) {
        this.f16312a.e().h().a(str, this.f16314c, aVar.c(), aVar.d());
    }

    private final void b(String str) {
        this.f16312a.e().h().e(str);
    }

    private final boolean a() {
        List<hp> list = this.f16315d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((hp) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    private final void b(String str, ut.a aVar) {
        this.f16312a.e().h().b(str, this.f16314c, aVar.c(), aVar.d());
    }
}
