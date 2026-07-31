package okhttp3.internal.http2;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class Header {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f42903d = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final h f42904e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f42905f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f42906g;

    /* renamed from: h, reason: collision with root package name */
    public static final h f42907h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f42908i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f42909j;

    /* renamed from: a, reason: collision with root package name */
    public final h f42910a;

    /* renamed from: b, reason: collision with root package name */
    public final h f42911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42912c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        h.a aVar = h.f43270e;
        f42904e = aVar.d(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f42905f = aVar.d(":status");
        f42906g = aVar.d(":method");
        f42907h = aVar.d(":path");
        f42908i = aVar.d(":scheme");
        f42909j = aVar.d(":authority");
    }

    public Header(h name, h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42910a = name;
        this.f42911b = value;
        this.f42912c = name.v() + 32 + value.v();
    }

    public final h a() {
        return this.f42910a;
    }

    public final h b() {
        return this.f42911b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.areEqual(this.f42910a, header.f42910a) && Intrinsics.areEqual(this.f42911b, header.f42911b);
    }

    public int hashCode() {
        return (this.f42910a.hashCode() * 31) + this.f42911b.hashCode();
    }

    public String toString() {
        return this.f42910a.y() + ": " + this.f42911b.y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Header(String name, String value) {
        this(r0.d(name), r0.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        h.a aVar = h.f43270e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(h name, String value) {
        this(name, h.f43270e.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
