package j1;

import com.yandex.authsdk.YandexAuthToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40849a = new a();

        private a() {
        }
    }

    /* renamed from: j1.b$b, reason: collision with other inner class name */
    public static final class C0221b implements b {

        /* renamed from: a, reason: collision with root package name */
        private final C3184a f40850a;

        public C0221b(C3184a exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f40850a = exception;
        }

        public final C3184a a() {
            return this.f40850a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0221b) && Intrinsics.areEqual(this.f40850a, ((C0221b) obj).f40850a);
        }

        public int hashCode() {
            return this.f40850a.hashCode();
        }

        public String toString() {
            return "Failure(exception=" + this.f40850a + ')';
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final YandexAuthToken f40851a;

        public c(YandexAuthToken token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.f40851a = token;
        }

        public final YandexAuthToken a() {
            return this.f40851a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f40851a, ((c) obj).f40851a);
        }

        public int hashCode() {
            return this.f40851a.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f40851a + ')';
        }
    }
}
