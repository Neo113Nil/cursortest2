package e0;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o2.Q;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2410b {

    /* renamed from: e0.b$a */
    static final class a extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ c.a f36602i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Q f36603j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, Q q4) {
            super(1);
            this.f36602i = aVar;
            this.f36603j = q4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                this.f36602i.b(this.f36603j.getCompleted());
            } else if (th instanceof CancellationException) {
                this.f36602i.c();
            } else {
                this.f36602i.e(th);
            }
        }
    }

    public static final ListenableFuture b(final Q q4, final Object obj) {
        Intrinsics.checkNotNullParameter(q4, "<this>");
        ListenableFuture a4 = c.a(new c.InterfaceC0085c() { // from class: e0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0085c
            public final Object a(c.a aVar) {
                Object d4;
                d4 = AbstractC2410b.d(Q.this, obj, aVar);
                return d4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a4, "getFuture { completer ->…      }\n        tag\n    }");
        return a4;
    }

    public static /* synthetic */ ListenableFuture c(Q q4, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(q4, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Q this_asListenableFuture, Object obj, c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}
