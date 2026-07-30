package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;

@Deprecated
/* loaded from: classes3.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    private RtspTrackTiming(long j8, int i8, Uri uri) {
        this.rtpTimestamp = j8;
        this.sequenceNumber = i8;
        this.uri = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: Exception -> 0x0053, TRY_LEAVE, TryCatch #0 {Exception -> 0x0053, blocks: (B:7:0x0027, B:19:0x0071, B:24:0x0078, B:25:0x007d, B:28:0x007e, B:29:0x0083, B:31:0x0049, B:34:0x0055, B:37:0x005f), top: B:6:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ImmutableList<RtspTrackTiming> parseTrackTiming(String str, Uri uri) {
        char c8;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        String[] split = Util.split(str, SystemInfoUtil.COMMA);
        int length = split.length;
        char c9 = 0;
        int i8 = 0;
        while (i8 < length) {
            String str2 = split[i8];
            String[] split2 = Util.split(str2, ";");
            int length2 = split2.length;
            int i9 = 0;
            Uri uri2 = null;
            int i10 = -1;
            long j8 = C.TIME_UNSET;
            while (i9 < length2) {
                String str3 = split2[i9];
                try {
                    String[] splitAtFirst = Util.splitAtFirst(str3, "=");
                    String str4 = splitAtFirst[c9];
                    String str5 = splitAtFirst[1];
                    int hashCode = str4.hashCode();
                    String[] strArr = split;
                    if (hashCode == 113759) {
                        if (str4.equals("seq")) {
                            c8 = 1;
                            if (c8 != 0) {
                            }
                            i9++;
                            split = strArr;
                            c9 = 0;
                        }
                        c8 = 65535;
                        if (c8 != 0) {
                        }
                        i9++;
                        split = strArr;
                        c9 = 0;
                    } else if (hashCode != 116079) {
                        if (hashCode == 1524180539 && str4.equals("rtptime")) {
                            c8 = 2;
                            if (c8 != 0) {
                                uri2 = resolveUri(str5, uri);
                            } else if (c8 == 1) {
                                i10 = Integer.parseInt(str5);
                            } else {
                                if (c8 != 2) {
                                    throw ParserException.createForMalformedManifest(str4, null);
                                }
                                j8 = Long.parseLong(str5);
                            }
                            i9++;
                            split = strArr;
                            c9 = 0;
                        }
                        c8 = 65535;
                        if (c8 != 0) {
                        }
                        i9++;
                        split = strArr;
                        c9 = 0;
                    } else {
                        if (str4.equals("url")) {
                            c8 = 0;
                            if (c8 != 0) {
                            }
                            i9++;
                            split = strArr;
                            c9 = 0;
                        }
                        c8 = 65535;
                        if (c8 != 0) {
                        }
                        i9++;
                        split = strArr;
                        c9 = 0;
                    }
                } catch (Exception e8) {
                    throw ParserException.createForMalformedManifest(str3, e8);
                }
                throw ParserException.createForMalformedManifest(str3, e8);
            }
            String[] strArr2 = split;
            if (uri2 != null && uri2.getScheme() != null) {
                long j9 = j8;
                if (i10 != -1 || j9 != C.TIME_UNSET) {
                    builder.add((ImmutableList.Builder) new RtspTrackTiming(j9, i10, uri2));
                    i8++;
                    split = strArr2;
                    c9 = 0;
                }
            }
            throw ParserException.createForMalformedManifest(str2, null);
        }
        return builder.build();
    }

    @VisibleForTesting
    static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        if (((String) Assertions.checkNotNull(parse2.getHost())).equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return UriUtil.resolveToUri(uri2, str);
        }
        return UriUtil.resolveToUri(uri2 + "/", str);
    }
}
