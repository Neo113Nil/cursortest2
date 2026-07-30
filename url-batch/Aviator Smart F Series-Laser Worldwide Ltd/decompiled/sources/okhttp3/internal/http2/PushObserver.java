package okhttp3.internal.http2;

import java.util.List;
import kotlin.jvm.internal.s;
import okio.e;

/* loaded from: classes5.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i8, e source, int i9, boolean z7) {
                s.checkNotNullParameter(source, "source");
                source.skip(i9);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i8, List<Header> responseHeaders, boolean z7) {
                s.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i8, List<Header> requestHeaders) {
                s.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i8, ErrorCode errorCode) {
                s.checkNotNullParameter(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i8, e eVar, int i9, boolean z7);

    boolean onHeaders(int i8, List<Header> list, boolean z7);

    boolean onRequest(int i8, List<Header> list);

    void onReset(int i8, ErrorCode errorCode);
}
