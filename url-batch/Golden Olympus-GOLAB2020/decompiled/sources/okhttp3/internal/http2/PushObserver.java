package okhttp3.internal.http2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.g;

@Metadata
/* loaded from: classes3.dex */
public interface PushObserver {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f43080a = Companion.f43082a;

    /* renamed from: b, reason: collision with root package name */
    public static final PushObserver f43081b = new Companion.PushObserverCancel();

    @Metadata
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f43082a = new Companion();

        @Metadata
        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean a(int i4, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean b(int i4, List responseHeaders, boolean z4) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void c(int i4, ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean d(int i4, g source, int i5, boolean z4) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.H(i5);
                return true;
            }
        }

        private Companion() {
        }
    }

    boolean a(int i4, List list);

    boolean b(int i4, List list, boolean z4);

    void c(int i4, ErrorCode errorCode);

    boolean d(int i4, g gVar, int i5, boolean z4);
}
