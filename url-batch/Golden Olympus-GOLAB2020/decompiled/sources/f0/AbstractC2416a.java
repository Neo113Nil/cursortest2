package f0;

import a2.AbstractC1241b;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.m;
import androidx.privacysandbox.ads.adservices.measurement.n;
import androidx.privacysandbox.ads.adservices.measurement.o;
import com.google.common.util.concurrent.ListenableFuture;
import e0.AbstractC2410b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.K;
import o2.Q;
import o2.Z;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2416a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f36609a = new b(null);

    /* renamed from: f0.a$a, reason: collision with other inner class name */
    private static final class C0214a extends AbstractC2416a {

        /* renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.measurement.b f36610b;

        /* renamed from: f0.a$a$a, reason: collision with other inner class name */
        static final class C0215a extends l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f36611l;

            C0215a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0214a.this.new C0215a(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f36611l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0214a.this.f36610b;
                    this.f36611l = 1;
                    if (bVar.a(null, this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((C0215a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        /* renamed from: f0.a$a$b */
        static final class b extends l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f36613l;

            b(kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0214a.this.new b(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f36613l;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return obj;
                }
                ResultKt.a(obj);
                androidx.privacysandbox.ads.adservices.measurement.b bVar = C0214a.this.f36610b;
                this.f36613l = 1;
                Object b4 = bVar.b(this);
                return b4 == f4 ? f4 : b4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((b) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        /* renamed from: f0.a$a$c */
        static final class c extends l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f36615l;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Uri f36617n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ InputEvent f36618o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f36617n = uri;
                this.f36618o = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0214a.this.new c(this.f36617n, this.f36618o, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f36615l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0214a.this.f36610b;
                    Uri uri = this.f36617n;
                    InputEvent inputEvent = this.f36618o;
                    this.f36615l = 1;
                    if (bVar.c(uri, inputEvent, this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((c) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        /* renamed from: f0.a$a$d */
        static final class d extends l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f36619l;

            d(m mVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0214a.this.new d(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f36619l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0214a.this.f36610b;
                    this.f36619l = 1;
                    if (bVar.d(null, this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((d) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        /* renamed from: f0.a$a$e */
        static final class e extends l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f36621l;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Uri f36623n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f36623n = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0214a.this.new e(this.f36623n, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f36621l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0214a.this.f36610b;
                    Uri uri = this.f36623n;
                    this.f36621l = 1;
                    if (bVar.e(uri, this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((e) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        /* renamed from: f0.a$a$f */
        static final class f extends l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f36624l;

            f(n nVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0214a.this.new f(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f36624l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0214a.this.f36610b;
                    this.f36624l = 1;
                    if (bVar.f(null, this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((f) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        /* renamed from: f0.a$a$g */
        static final class g extends l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f36626l;

            g(o oVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0214a.this.new g(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object f4 = AbstractC1241b.f();
                int i4 = this.f36626l;
                if (i4 == 0) {
                    ResultKt.a(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0214a.this.f36610b;
                    this.f36626l = 1;
                    if (bVar.g(null, this) == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return Unit.f41027a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
                return ((g) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
            }
        }

        public C0214a(androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f36610b = mMeasurementManager;
        }

        @Override // f0.AbstractC2416a
        public ListenableFuture<Integer> b() {
            Q b4;
            b4 = AbstractC3337k.b(K.a(Z.a()), null, null, new b(null), 3, null);
            return AbstractC2410b.c(b4, null, 1, null);
        }

        @Override // f0.AbstractC2416a
        public ListenableFuture<Unit> c(Uri trigger) {
            Q b4;
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            b4 = AbstractC3337k.b(K.a(Z.a()), null, null, new e(trigger, null), 3, null);
            return AbstractC2410b.c(b4, null, 1, null);
        }

        public ListenableFuture<Unit> e(androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            Q b4;
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            b4 = AbstractC3337k.b(K.a(Z.a()), null, null, new C0215a(deletionRequest, null), 3, null);
            return AbstractC2410b.c(b4, null, 1, null);
        }

        public ListenableFuture<Unit> f(Uri attributionSource, InputEvent inputEvent) {
            Q b4;
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            b4 = AbstractC3337k.b(K.a(Z.a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return AbstractC2410b.c(b4, null, 1, null);
        }

        public ListenableFuture<Unit> g(m request) {
            Q b4;
            Intrinsics.checkNotNullParameter(request, "request");
            b4 = AbstractC3337k.b(K.a(Z.a()), null, null, new d(request, null), 3, null);
            return AbstractC2410b.c(b4, null, 1, null);
        }

        public ListenableFuture<Unit> h(n request) {
            Q b4;
            Intrinsics.checkNotNullParameter(request, "request");
            b4 = AbstractC3337k.b(K.a(Z.a()), null, null, new f(request, null), 3, null);
            return AbstractC2410b.c(b4, null, 1, null);
        }

        public ListenableFuture<Unit> i(o request) {
            Q b4;
            Intrinsics.checkNotNullParameter(request, "request");
            b4 = AbstractC3337k.b(K.a(Z.a()), null, null, new g(request, null), 3, null);
            return AbstractC2410b.c(b4, null, 1, null);
        }
    }

    /* renamed from: f0.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC2416a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.measurement.b a4 = androidx.privacysandbox.ads.adservices.measurement.b.f12759a.a(context);
            if (a4 != null) {
                return new C0214a(a4);
            }
            return null;
        }

        private b() {
        }
    }

    public static final AbstractC2416a a(Context context) {
        return f36609a.a(context);
    }

    public abstract ListenableFuture b();

    public abstract ListenableFuture c(Uri uri);
}
