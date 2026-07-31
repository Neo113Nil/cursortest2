package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class jr extends ScheduledThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Throwable, Unit> f16870a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f16871b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    public static final class a extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16872a = new a();

        a() {
            super(1);
        }

        public final void a(@Nullable Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f41027a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    public static final class b extends kotlin.jvm.internal.s implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16873a = new b();

        b() {
            super(1);
        }

        public final void a(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f41027a;
        }
    }

    public jr() {
        this(0, null, null, 7, null);
    }

    private final String a(String str) {
        return jr.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(@Nullable Runnable runnable, @Nullable Throwable th) {
        Function1<Throwable, Unit> function1;
        Throwable e4;
        super.afterExecute(runnable, th);
        if (th != null) {
            this.f16871b.invoke(a(th.toString()));
            this.f16870a.invoke(th);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e5) {
                o9.d().a(e5);
                this.f16871b.invoke(a(e5.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e6) {
                e4 = e6;
                o9.d().a(e4);
                this.f16871b.invoke(a(e4.toString()));
                function1 = this.f16870a;
                function1.invoke(e4);
            } catch (ExecutionException e7) {
                o9.d().a(e7);
                this.f16871b.invoke(a(e7.toString()));
                function1 = this.f16870a;
                e4 = e7.getCause();
                function1.invoke(e4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jr(int i4, @NotNull Function1<? super Throwable, Unit> report, @NotNull Function1<? super String, Unit> log) {
        super(i4, new kk());
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(log, "log");
        this.f16870a = report;
        this.f16871b = log;
    }

    public /* synthetic */ jr(int i4, Function1 function1, Function1 function12, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? kr.f16966a : i4, (i5 & 2) != 0 ? a.f16872a : function1, (i5 & 4) != 0 ? b.f16873a : function12);
    }
}
