package okhttp3.internal.http2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ironsource.im;
import com.ironsource.jn;
import com.ironsource.mediationsdk.IronSourceSegment;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.B;
import okio.C3372e;
import okio.g;
import okio.h;
import okio.p;

@Metadata
/* loaded from: classes3.dex */
public final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Hpack f42913a;

    /* renamed from: b, reason: collision with root package name */
    private static final Header[] f42914b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f42915c;

    static {
        Hpack hpack = new Hpack();
        f42913a = hpack;
        Header header = new Header(Header.f42909j, "");
        h hVar = Header.f42906g;
        Header header2 = new Header(hVar, jn.f16864a);
        Header header3 = new Header(hVar, jn.f16865b);
        h hVar2 = Header.f42907h;
        Header header4 = new Header(hVar2, "/");
        Header header5 = new Header(hVar2, "/index.html");
        h hVar3 = Header.f42908i;
        Header header6 = new Header(hVar3, "http");
        Header header7 = new Header(hVar3, "https");
        h hVar4 = Header.f42905f;
        f42914b = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(hVar4, "200"), new Header(hVar4, "204"), new Header(hVar4, "206"), new Header(hVar4, "304"), new Header(hVar4, "400"), new Header(hVar4, "404"), new Header(hVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header(IronSourceSegment.AGE, ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header(Constants.MessagePayloadKeys.FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(FirebaseAnalytics.Param.LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header(im.f16720a, ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f42915c = hpack.d();
    }

    private Hpack() {
    }

    private final Map d() {
        Header[] headerArr = f42914b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            Header[] headerArr2 = f42914b;
            if (!linkedHashMap.containsKey(headerArr2[i4].f42910a)) {
                linkedHashMap.put(headerArr2[i4].f42910a, Integer.valueOf(i4));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final h a(h name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int v4 = name.v();
        for (int i4 = 0; i4 < v4; i4++) {
            byte g4 = name.g(i4);
            if (65 <= g4 && g4 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.y());
            }
        }
        return name;
    }

    public final Map b() {
        return f42915c;
    }

    public final Header[] c() {
        return f42914b;
    }

    @Metadata
    public static final class Reader {

        /* renamed from: a, reason: collision with root package name */
        private final int f42916a;

        /* renamed from: b, reason: collision with root package name */
        private int f42917b;

        /* renamed from: c, reason: collision with root package name */
        private final List f42918c;

        /* renamed from: d, reason: collision with root package name */
        private final g f42919d;

        /* renamed from: e, reason: collision with root package name */
        public Header[] f42920e;

        /* renamed from: f, reason: collision with root package name */
        private int f42921f;

        /* renamed from: g, reason: collision with root package name */
        public int f42922g;

        /* renamed from: h, reason: collision with root package name */
        public int f42923h;

        public Reader(B source, int i4, int i5) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f42916a = i4;
            this.f42917b = i5;
            this.f42918c = new ArrayList();
            this.f42919d = p.d(source);
            this.f42920e = new Header[8];
            this.f42921f = r2.length - 1;
        }

        private final void a() {
            int i4 = this.f42917b;
            int i5 = this.f42923h;
            if (i4 < i5) {
                if (i4 == 0) {
                    b();
                } else {
                    d(i5 - i4);
                }
            }
        }

        private final void b() {
            AbstractC3219i.o(this.f42920e, null, 0, 0, 6, null);
            this.f42921f = this.f42920e.length - 1;
            this.f42922g = 0;
            this.f42923h = 0;
        }

        private final int c(int i4) {
            return this.f42921f + 1 + i4;
        }

        private final int d(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.f42920e.length;
                while (true) {
                    length--;
                    i5 = this.f42921f;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    Header header = this.f42920e[length];
                    Intrinsics.checkNotNull(header);
                    int i7 = header.f42912c;
                    i4 -= i7;
                    this.f42923h -= i7;
                    this.f42922g--;
                    i6++;
                }
                Header[] headerArr = this.f42920e;
                System.arraycopy(headerArr, i5 + 1, headerArr, i5 + 1 + i6, this.f42922g);
                this.f42921f += i6;
            }
            return i6;
        }

        private final h f(int i4) {
            if (h(i4)) {
                return Hpack.f42913a.c()[i4].f42910a;
            }
            int c4 = c(i4 - Hpack.f42913a.c().length);
            if (c4 >= 0) {
                Header[] headerArr = this.f42920e;
                if (c4 < headerArr.length) {
                    Header header = headerArr[c4];
                    Intrinsics.checkNotNull(header);
                    return header.f42910a;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        private final void g(int i4, Header header) {
            this.f42918c.add(header);
            int i5 = header.f42912c;
            if (i4 != -1) {
                Header header2 = this.f42920e[c(i4)];
                Intrinsics.checkNotNull(header2);
                i5 -= header2.f42912c;
            }
            int i6 = this.f42917b;
            if (i5 > i6) {
                b();
                return;
            }
            int d4 = d((this.f42923h + i5) - i6);
            if (i4 == -1) {
                int i7 = this.f42922g + 1;
                Header[] headerArr = this.f42920e;
                if (i7 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f42921f = this.f42920e.length - 1;
                    this.f42920e = headerArr2;
                }
                int i8 = this.f42921f;
                this.f42921f = i8 - 1;
                this.f42920e[i8] = header;
                this.f42922g++;
            } else {
                this.f42920e[i4 + c(i4) + d4] = header;
            }
            this.f42923h += i5;
        }

        private final boolean h(int i4) {
            return i4 >= 0 && i4 <= Hpack.f42913a.c().length - 1;
        }

        private final int i() {
            return Util.d(this.f42919d.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
        }

        private final void l(int i4) {
            if (h(i4)) {
                this.f42918c.add(Hpack.f42913a.c()[i4]);
                return;
            }
            int c4 = c(i4 - Hpack.f42913a.c().length);
            if (c4 >= 0) {
                Header[] headerArr = this.f42920e;
                if (c4 < headerArr.length) {
                    List list = this.f42918c;
                    Header header = headerArr[c4];
                    Intrinsics.checkNotNull(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i4 + 1));
        }

        private final void n(int i4) {
            g(-1, new Header(f(i4), j()));
        }

        private final void o() {
            g(-1, new Header(Hpack.f42913a.a(j()), j()));
        }

        private final void p(int i4) {
            this.f42918c.add(new Header(f(i4), j()));
        }

        private final void q() {
            this.f42918c.add(new Header(Hpack.f42913a.a(j()), j()));
        }

        public final List e() {
            List list = CollectionsKt.toList(this.f42918c);
            this.f42918c.clear();
            return list;
        }

        public final h j() {
            int i4 = i();
            boolean z4 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128;
            long m4 = m(i4, 127);
            if (!z4) {
                return this.f42919d.d(m4);
            }
            C3372e c3372e = new C3372e();
            Huffman.f43073a.b(this.f42919d, m4, c3372e);
            return c3372e.e0();
        }

        public final void k() {
            while (!this.f42919d.v()) {
                int d4 = Util.d(this.f42919d.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
                if (d4 == 128) {
                    throw new IOException("index == 0");
                }
                if ((d4 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
                    l(m(d4, 127) - 1);
                } else if (d4 == 64) {
                    o();
                } else if ((d4 & 64) == 64) {
                    n(m(d4, 63) - 1);
                } else if ((d4 & 32) == 32) {
                    int m4 = m(d4, 31);
                    this.f42917b = m4;
                    if (m4 < 0 || m4 > this.f42916a) {
                        throw new IOException("Invalid dynamic table size update " + this.f42917b);
                    }
                    a();
                } else if (d4 == 16 || d4 == 0) {
                    q();
                } else {
                    p(m(d4, 15) - 1);
                }
            }
        }

        public final int m(int i4, int i5) {
            int i6 = i4 & i5;
            if (i6 < i5) {
                return i6;
            }
            int i7 = 0;
            while (true) {
                int i8 = i();
                if ((i8 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    return i5 + (i8 << i7);
                }
                i5 += (i8 & 127) << i7;
                i7 += 7;
            }
        }

        public /* synthetic */ Reader(B b4, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(b4, i4, (i6 & 4) != 0 ? i4 : i5);
        }
    }

    @Metadata
    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public int f42924a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f42925b;

        /* renamed from: c, reason: collision with root package name */
        private final C3372e f42926c;

        /* renamed from: d, reason: collision with root package name */
        private int f42927d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f42928e;

        /* renamed from: f, reason: collision with root package name */
        public int f42929f;

        /* renamed from: g, reason: collision with root package name */
        public Header[] f42930g;

        /* renamed from: h, reason: collision with root package name */
        private int f42931h;

        /* renamed from: i, reason: collision with root package name */
        public int f42932i;

        /* renamed from: j, reason: collision with root package name */
        public int f42933j;

        public Writer(int i4, boolean z4, C3372e out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f42924a = i4;
            this.f42925b = z4;
            this.f42926c = out;
            this.f42927d = Integer.MAX_VALUE;
            this.f42929f = i4;
            this.f42930g = new Header[8];
            this.f42931h = r2.length - 1;
        }

        private final void a() {
            int i4 = this.f42929f;
            int i5 = this.f42933j;
            if (i4 < i5) {
                if (i4 == 0) {
                    b();
                } else {
                    c(i5 - i4);
                }
            }
        }

        private final void b() {
            AbstractC3219i.o(this.f42930g, null, 0, 0, 6, null);
            this.f42931h = this.f42930g.length - 1;
            this.f42932i = 0;
            this.f42933j = 0;
        }

        private final int c(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.f42930g.length;
                while (true) {
                    length--;
                    i5 = this.f42931h;
                    if (length < i5 || i4 <= 0) {
                        break;
                    }
                    Header header = this.f42930g[length];
                    Intrinsics.checkNotNull(header);
                    i4 -= header.f42912c;
                    int i7 = this.f42933j;
                    Header header2 = this.f42930g[length];
                    Intrinsics.checkNotNull(header2);
                    this.f42933j = i7 - header2.f42912c;
                    this.f42932i--;
                    i6++;
                }
                Header[] headerArr = this.f42930g;
                System.arraycopy(headerArr, i5 + 1, headerArr, i5 + 1 + i6, this.f42932i);
                Header[] headerArr2 = this.f42930g;
                int i8 = this.f42931h;
                Arrays.fill(headerArr2, i8 + 1, i8 + 1 + i6, (Object) null);
                this.f42931h += i6;
            }
            return i6;
        }

        private final void d(Header header) {
            int i4 = header.f42912c;
            int i5 = this.f42929f;
            if (i4 > i5) {
                b();
                return;
            }
            c((this.f42933j + i4) - i5);
            int i6 = this.f42932i + 1;
            Header[] headerArr = this.f42930g;
            if (i6 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f42931h = this.f42930g.length - 1;
                this.f42930g = headerArr2;
            }
            int i7 = this.f42931h;
            this.f42931h = i7 - 1;
            this.f42930g[i7] = header;
            this.f42932i++;
            this.f42933j += i4;
        }

        public final void e(int i4) {
            this.f42924a = i4;
            int min = Math.min(i4, 16384);
            int i5 = this.f42929f;
            if (i5 == min) {
                return;
            }
            if (min < i5) {
                this.f42927d = Math.min(this.f42927d, min);
            }
            this.f42928e = true;
            this.f42929f = min;
            a();
        }

        public final void f(h data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f42925b) {
                Huffman huffman = Huffman.f43073a;
                if (huffman.d(data) < data.v()) {
                    C3372e c3372e = new C3372e();
                    huffman.c(data, c3372e);
                    h e02 = c3372e.e0();
                    h(e02.v(), 127, UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.f42926c.M(e02);
                    return;
                }
            }
            h(data.v(), 127, 0);
            this.f42926c.M(data);
        }

        public final void g(List headerBlock) {
            int i4;
            int i5;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f42928e) {
                int i6 = this.f42927d;
                if (i6 < this.f42929f) {
                    h(i6, 31, 32);
                }
                this.f42928e = false;
                this.f42927d = Integer.MAX_VALUE;
                h(this.f42929f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i7 = 0; i7 < size; i7++) {
                Header header = (Header) headerBlock.get(i7);
                h x4 = header.f42910a.x();
                h hVar = header.f42911b;
                Hpack hpack = Hpack.f42913a;
                Integer num = (Integer) hpack.b().get(x4);
                if (num != null) {
                    int intValue = num.intValue();
                    i5 = intValue + 1;
                    if (2 <= i5 && i5 < 8) {
                        if (Intrinsics.areEqual(hpack.c()[intValue].f42911b, hVar)) {
                            i4 = i5;
                        } else if (Intrinsics.areEqual(hpack.c()[i5].f42911b, hVar)) {
                            i4 = i5;
                            i5 = intValue + 2;
                        }
                    }
                    i4 = i5;
                    i5 = -1;
                } else {
                    i4 = -1;
                    i5 = -1;
                }
                if (i5 == -1) {
                    int i8 = this.f42931h + 1;
                    int length = this.f42930g.length;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        Header header2 = this.f42930g[i8];
                        Intrinsics.checkNotNull(header2);
                        if (Intrinsics.areEqual(header2.f42910a, x4)) {
                            Header header3 = this.f42930g[i8];
                            Intrinsics.checkNotNull(header3);
                            if (Intrinsics.areEqual(header3.f42911b, hVar)) {
                                i5 = Hpack.f42913a.c().length + (i8 - this.f42931h);
                                break;
                            } else if (i4 == -1) {
                                i4 = (i8 - this.f42931h) + Hpack.f42913a.c().length;
                            }
                        }
                        i8++;
                    }
                }
                if (i5 != -1) {
                    h(i5, 127, UserVerificationMethods.USER_VERIFY_PATTERN);
                } else if (i4 == -1) {
                    this.f42926c.w(64);
                    f(x4);
                    f(hVar);
                    d(header);
                } else if (!x4.w(Header.f42904e) || Intrinsics.areEqual(Header.f42909j, x4)) {
                    h(i4, 63, 64);
                    f(hVar);
                    d(header);
                } else {
                    h(i4, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int i4, int i5, int i6) {
            if (i4 < i5) {
                this.f42926c.w(i4 | i6);
                return;
            }
            this.f42926c.w(i6 | i5);
            int i7 = i4 - i5;
            while (i7 >= 128) {
                this.f42926c.w(128 | (i7 & 127));
                i7 >>>= 7;
            }
            this.f42926c.w(i7);
        }

        public /* synthetic */ Writer(int i4, boolean z4, C3372e c3372e, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? Base64Utils.IO_BUFFER_SIZE : i4, (i5 & 2) != 0 ? true : z4, c3372e);
        }
    }
}
