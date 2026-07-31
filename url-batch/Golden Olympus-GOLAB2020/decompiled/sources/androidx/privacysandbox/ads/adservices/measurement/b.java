package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import d0.C2400b;
import d0.C2401c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12759a = new a(null);

    public static final class a {

        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        static final class C0119a extends s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Context f12760i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0119a(Context context) {
                super(1);
                this.f12760i = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new d(this.f12760i);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C2400b c2400b = C2400b.f36154a;
            sb.append(c2400b.a());
            Log.d("MeasurementManager", sb.toString());
            if (c2400b.a() >= 5) {
                return new g(context);
            }
            if (c2400b.b() >= 9) {
                return (b) C2401c.f36157a.a(context, "MeasurementManager", new C0119a(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d dVar);

    public abstract Object b(kotlin.coroutines.d dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar);

    public abstract Object d(m mVar, kotlin.coroutines.d dVar);

    public abstract Object e(Uri uri, kotlin.coroutines.d dVar);

    public abstract Object f(n nVar, kotlin.coroutines.d dVar);

    public abstract Object g(o oVar, kotlin.coroutines.d dVar);
}
