package okhttp3.internal.ws;

import com.ironsource.cc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class WebSocketExtensions {

    /* renamed from: g, reason: collision with root package name */
    public static final Companion f43215g = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f43216a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f43217b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f43218c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f43219d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43220e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f43221f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebSocketExtensions a(Headers responseHeaders) {
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z4 = false;
            Integer num = null;
            boolean z5 = false;
            Integer num2 = null;
            boolean z6 = false;
            boolean z7 = false;
            for (int i4 = 0; i4 < size; i4++) {
                if (StringsKt.w(responseHeaders.d(i4), "Sec-WebSocket-Extensions", true)) {
                    String f4 = responseHeaders.f(i4);
                    int i5 = 0;
                    while (i5 < f4.length()) {
                        int i6 = i5;
                        int q4 = Util.q(f4, ',', i6, 0, 4, null);
                        int o4 = Util.o(f4, ';', i6, q4);
                        String Y3 = Util.Y(f4, i6, o4);
                        int i7 = o4 + 1;
                        if (StringsKt.w(Y3, "permessage-deflate", true)) {
                            if (!z4) {
                                z7 = true;
                                while (i7 < q4) {
                                    int o5 = Util.o(f4, ';', i7, q4);
                                    int o6 = Util.o(f4, cc.f15727T, i7, o5);
                                    String Y4 = Util.Y(f4, i7, o6);
                                    String x02 = o6 < o5 ? StringsKt.x0(Util.Y(f4, o6 + 1, o5), "\"") : null;
                                    int i8 = o5 + 1;
                                    if (StringsKt.w(Y4, "client_max_window_bits", true)) {
                                        if (num != null) {
                                            z7 = true;
                                        }
                                        num = x02 != null ? StringsKt.toIntOrNull(x02) : null;
                                        i7 = num == null ? i8 : i8;
                                    } else if (StringsKt.w(Y4, "client_no_context_takeover", true)) {
                                        if (z5) {
                                            z7 = true;
                                        }
                                        if (x02 != null) {
                                            z7 = true;
                                        }
                                        i7 = i8;
                                        z5 = true;
                                    } else if (StringsKt.w(Y4, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z7 = true;
                                        }
                                        num2 = x02 != null ? StringsKt.toIntOrNull(x02) : null;
                                        if (num2 == null) {
                                        }
                                    } else if (StringsKt.w(Y4, "server_no_context_takeover", true)) {
                                        if (z6) {
                                            z7 = true;
                                        }
                                        if (x02 != null) {
                                            z7 = true;
                                        }
                                        i7 = i8;
                                        z6 = true;
                                    }
                                }
                                i5 = i7;
                                z4 = true;
                            }
                            z7 = true;
                        } else {
                            i5 = i7;
                            z7 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z4, num, z5, num2, z6, z7);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public final boolean a(boolean z4) {
        return z4 ? this.f43218c : this.f43220e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f43216a == webSocketExtensions.f43216a && Intrinsics.areEqual(this.f43217b, webSocketExtensions.f43217b) && this.f43218c == webSocketExtensions.f43218c && Intrinsics.areEqual(this.f43219d, webSocketExtensions.f43219d) && this.f43220e == webSocketExtensions.f43220e && this.f43221f == webSocketExtensions.f43221f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z4 = this.f43216a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        Integer num = this.f43217b;
        int hashCode = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.f43218c;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode + i5) * 31;
        Integer num2 = this.f43219d;
        int hashCode2 = (i6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.f43220e;
        int i7 = r23;
        if (r23 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode2 + i7) * 31;
        boolean z5 = this.f43221f;
        return i8 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f43216a + ", clientMaxWindowBits=" + this.f43217b + ", clientNoContextTakeover=" + this.f43218c + ", serverMaxWindowBits=" + this.f43219d + ", serverNoContextTakeover=" + this.f43220e + ", unknownValues=" + this.f43221f + ')';
    }

    public WebSocketExtensions(boolean z4, Integer num, boolean z5, Integer num2, boolean z6, boolean z7) {
        this.f43216a = z4;
        this.f43217b = num;
        this.f43218c = z5;
        this.f43219d = num2;
        this.f43220e = z6;
        this.f43221f = z7;
    }

    public /* synthetic */ WebSocketExtensions(boolean z4, Integer num, boolean z5, Integer num2, boolean z6, boolean z7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? false : z5, (i4 & 8) != 0 ? null : num2, (i4 & 16) != 0 ? false : z6, (i4 & 32) != 0 ? false : z7);
    }
}
