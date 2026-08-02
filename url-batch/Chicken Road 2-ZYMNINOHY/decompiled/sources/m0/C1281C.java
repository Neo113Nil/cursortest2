package m0;

import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import v2.a0;

/* renamed from: m0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281C {

    /* renamed from: a, reason: collision with root package name */
    public final long f14300a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14301b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f14302c;

    public C1281C(int i4, long j4, Uri uri) {
        this.f14300a = j4;
        this.f14301b = i4;
        this.f14302c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:7:0x0036, B:20:0x0082, B:25:0x0089, B:26:0x008e, B:29:0x008f, B:30:0x0094, B:32:0x0058, B:35:0x0064, B:38:0x006f), top: B:6:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a0 a(Uri uri, String str) {
        char c4;
        v2.r.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String str2 = J.f3263a;
        int i4 = -1;
        String[] split = str.split(StringUtils.COMMA, -1);
        int length = split.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            String str3 = split[i5];
            String[] split2 = str3.split(";", i4);
            int length2 = split2.length;
            int i7 = i4;
            int i8 = i5;
            long j4 = -9223372036854775807L;
            int i9 = 0;
            Uri uri2 = null;
            while (i9 < length2) {
                String str4 = split2[i9];
                try {
                    String[] split3 = str4.split("=", 2);
                    String str5 = split3[0];
                    String str6 = split3[1];
                    int hashCode = str5.hashCode();
                    String[] strArr = split;
                    if (hashCode == 113759) {
                        if (str5.equals("seq")) {
                            c4 = 1;
                            if (c4 != 0) {
                            }
                            i9++;
                            split = strArr;
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        i9++;
                        split = strArr;
                    } else if (hashCode != 116079) {
                        if (hashCode == 1524180539 && str5.equals("rtptime")) {
                            c4 = 2;
                            if (c4 != 0) {
                                uri2 = b(uri, str6);
                            } else if (c4 == 1) {
                                i7 = Integer.parseInt(str6);
                            } else {
                                if (c4 != 2) {
                                    throw T.G.b(str5, null);
                                }
                                j4 = Long.parseLong(str6);
                            }
                            i9++;
                            split = strArr;
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        i9++;
                        split = strArr;
                    } else {
                        if (str5.equals("url")) {
                            c4 = 0;
                            if (c4 != 0) {
                            }
                            i9++;
                            split = strArr;
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        i9++;
                        split = strArr;
                    }
                } catch (Exception e4) {
                    throw T.G.b(str4, e4);
                }
                throw T.G.b(str4, e4);
            }
            String[] strArr2 = split;
            if (uri2 != null && uri2.getScheme() != null) {
                i4 = -1;
                if (i7 != -1 || j4 != -9223372036854775807L) {
                    C1281C c1281c = new C1281C(i7, j4, uri2);
                    int i10 = i6 + 1;
                    int e5 = v2.C.e(objArr.length, i10);
                    if (e5 > objArr.length) {
                        objArr = Arrays.copyOf(objArr, e5);
                    }
                    objArr[i6] = c1281c;
                    i6 = i10;
                    split = strArr2;
                    i5 = i8 + 1;
                }
            }
            throw T.G.b(str3, null);
        }
        return v2.I.i(i6, objArr);
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        AbstractC0124a.h(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? AbstractC0108a.q(uri2, str) : AbstractC0108a.q(uri2.concat("/"), str);
    }
}
