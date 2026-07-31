package com.chartboost.sdk.impl;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes12.dex */
public final class xh {
    public static final a l = new a(null);
    public final long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public zh g;
    public Function0 h;
    public b f = b.f;
    public ai i = ai.c;
    public String j = "Reward in %d seconds";
    public final CompletableJob k = SupervisorKt.SupervisorJob$default(null, 1, null);

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return xh.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                if (xh.this.d() == b.b) {
                    long uptimeMillis = (SystemClock.uptimeMillis() - xh.this.c) - xh.this.d;
                    xh xhVar = xh.this;
                    xhVar.b = RangesKt.coerceAtLeast(xhVar.a - uptimeMillis, 0L);
                    zh c = xh.this.c();
                    if (c != null) {
                        c.a(xh.this.b, xh.this.a);
                    }
                    if (xh.this.b == 0) {
                        xh.this.f = b.e;
                        Function0 b = xh.this.b();
                        if (b != null) {
                            b.mo4828invoke();
                        }
                    } else {
                        this.b = 1;
                    }
                }
                return Unit.INSTANCE;
            } while (DelayKt.delay(16L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public xh(long j, Function0 function0) {
        this.a = j;
        this.b = j;
        a(function0);
    }

    public final b d() {
        return this.f;
    }

    public final zh c() {
        return this.g;
    }

    public final Function0 b() {
        return this.h;
    }

    public final void g() {
        b bVar = this.f;
        b bVar2 = b.b;
        if (bVar == bVar2 || bVar == b.e) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = c.a[this.f.ordinal()];
        if (i == 1) {
            this.c = uptimeMillis;
            this.d = 0L;
        } else if (i == 2) {
            this.d += uptimeMillis - this.e;
        } else {
            if (i != 3) {
                return;
            }
            this.c = uptimeMillis;
            this.d = 0L;
        }
        this.f = bVar2;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(this.k)), null, null, new d(null), 3, null);
    }

    public final void e() {
        if (this.f == b.b) {
            this.f = b.c;
            this.e = SystemClock.uptimeMillis();
        }
    }

    public final void h() {
        this.f = b.d;
        a();
    }

    public final void f() {
        this.f = b.f;
        long j = this.a;
        this.b = j;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        zh zhVar = this.g;
        if (zhVar != null) {
            zhVar.a(j, j);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b b = new b("STARTED", 0);
        public static final b c = new b("PAUSED", 1);
        public static final b d = new b("STOPPED", 2);
        public static final b e = new b("COMPLETED", 3);
        public static final b f = new b("NOT_STARTED", 4);
        public static final /* synthetic */ b[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            b[] a = a();
            g = a;
            h = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{b, c, d, e, f};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }

        public b(String str, int i) {
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a() {
        a((zh) null);
        JobKt__JobKt.cancelChildren$default((Job) this.k, (CancellationException) null, 1, (Object) null);
    }

    public final void a(ai mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.i = mode;
        if (str != null) {
            this.j = str;
        }
        zh zhVar = this.g;
        if (zhVar != null) {
            zhVar.a(mode, str, str2);
        }
        zh zhVar2 = this.g;
        if (zhVar2 != null) {
            zhVar2.a(this.b, this.a);
        }
    }

    public final void a(Function0 function0) {
        this.h = function0;
    }

    public final void a(zh zhVar) {
        this.g = zhVar;
        if (zhVar != null) {
            zhVar.a(this.b, this.a);
        }
    }
}
