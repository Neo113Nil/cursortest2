package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes3.dex */
final class SessionDescriptionParser {
    private static final String ATTRIBUTE_TYPE = "a";
    private static final String BANDWIDTH_TYPE = "b";
    private static final String CONNECTION_TYPE = "c";
    private static final String EMAIL_TYPE = "e";
    private static final String INFORMATION_TYPE = "i";
    private static final String KEY_TYPE = "k";
    private static final String MEDIA_TYPE = "m";
    private static final String ORIGIN_TYPE = "o";
    private static final String PHONE_NUMBER_TYPE = "p";
    private static final String REPEAT_TYPE = "r";
    private static final String SESSION_TYPE = "s";
    private static final String TIMING_TYPE = "t";
    private static final String URI_TYPE = "u";
    private static final String VERSION_TYPE = "v";
    private static final String ZONE_TYPE = "z";
    private static final Pattern SDP_LINE_PATTERN = Pattern.compile("([a-z])=\\s?(.+)");
    private static final Pattern ATTRIBUTE_PATTERN = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    private static final Pattern MEDIA_DESCRIPTION_PATTERN = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    private SessionDescriptionParser() {
    }

    private static void addMediaDescriptionToSession(SessionDescription.Builder builder, MediaDescription.Builder builder2) {
        try {
            builder.addMediaDescription(builder2.build());
        } catch (IllegalArgumentException | IllegalStateException e8) {
            throw ParserException.createForMalformedManifest(null, e8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SessionDescription parse(String str) {
        char c8;
        SessionDescription.Builder builder = new SessionDescription.Builder();
        MediaDescription.Builder builder2 = null;
        for (String str2 : RtspMessageUtil.splitRtspMessageBody(str)) {
            if (!"".equals(str2)) {
                Matcher matcher = SDP_LINE_PATTERN.matcher(str2);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Malformed SDP line: " + str2, null);
                }
                String str3 = (String) Assertions.checkNotNull(matcher.group(1));
                String str4 = (String) Assertions.checkNotNull(matcher.group(2));
                switch (str3.hashCode()) {
                    case 97:
                        if (str3.equals("a")) {
                            c8 = 11;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 98:
                        if (str3.equals(BANDWIDTH_TYPE)) {
                            c8 = '\b';
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 99:
                        if (str3.equals(CONNECTION_TYPE)) {
                            c8 = 7;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 106:
                    case 108:
                    case 110:
                    case 113:
                    case 119:
                    case 120:
                    case 121:
                    default:
                        c8 = 65535;
                        break;
                    case 101:
                        if (str3.equals(EMAIL_TYPE)) {
                            c8 = 5;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 105:
                        if (str3.equals("i")) {
                            c8 = 3;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 107:
                        if (str3.equals("k")) {
                            c8 = '\n';
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 109:
                        if (str3.equals(MEDIA_TYPE)) {
                            c8 = '\f';
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 111:
                        if (str3.equals(ORIGIN_TYPE)) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 112:
                        if (str3.equals("p")) {
                            c8 = 6;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 114:
                        if (str3.equals(REPEAT_TYPE)) {
                            c8 = '\r';
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 115:
                        if (str3.equals("s")) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 116:
                        if (str3.equals(TIMING_TYPE)) {
                            c8 = '\t';
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 117:
                        if (str3.equals(URI_TYPE)) {
                            c8 = 4;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 118:
                        if (str3.equals("v")) {
                            c8 = 0;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 122:
                        if (str3.equals("z")) {
                            c8 = 14;
                            break;
                        }
                        c8 = 65535;
                        break;
                }
                switch (c8) {
                    case 0:
                        if (!"0".equals(str4)) {
                            throw ParserException.createForMalformedManifest(String.format("SDP version %s is not supported.", str4), null);
                        }
                        break;
                    case 1:
                        builder.setOrigin(str4);
                        break;
                    case 2:
                        builder.setSessionName(str4);
                        break;
                    case 3:
                        if (builder2 == null) {
                            builder.setSessionInfo(str4);
                            break;
                        } else {
                            builder2.setMediaTitle(str4);
                            break;
                        }
                    case 4:
                        builder.setUri(Uri.parse(str4));
                        break;
                    case 5:
                        builder.setEmailAddress(str4);
                        break;
                    case 6:
                        builder.setPhoneNumber(str4);
                        break;
                    case 7:
                        if (builder2 == null) {
                            builder.setConnection(str4);
                            break;
                        } else {
                            builder2.setConnection(str4);
                            break;
                        }
                    case '\b':
                        String[] split = Util.split(str4, ":\\s?");
                        Assertions.checkArgument(split.length == 2);
                        int parseInt = Integer.parseInt(split[1]);
                        if (builder2 == null) {
                            builder.setBitrate(parseInt * 1000);
                            break;
                        } else {
                            builder2.setBitrate(parseInt * 1000);
                            break;
                        }
                    case '\t':
                        builder.setTiming(str4);
                        break;
                    case '\n':
                        if (builder2 == null) {
                            builder.setKey(str4);
                            break;
                        } else {
                            builder2.setKey(str4);
                            break;
                        }
                    case 11:
                        Matcher matcher2 = ATTRIBUTE_PATTERN.matcher(str4);
                        if (!matcher2.matches()) {
                            throw ParserException.createForMalformedManifest("Malformed Attribute line: " + str2, null);
                        }
                        String str5 = (String) Assertions.checkNotNull(matcher2.group(1));
                        String nullToEmpty = Strings.nullToEmpty(matcher2.group(2));
                        if (builder2 == null) {
                            builder.addAttribute(str5, nullToEmpty);
                            break;
                        } else {
                            builder2.addAttribute(str5, nullToEmpty);
                            break;
                        }
                    case '\f':
                        if (builder2 != null) {
                            addMediaDescriptionToSession(builder, builder2);
                        }
                        builder2 = parseMediaDescriptionLine(str4);
                        break;
                }
            }
        }
        if (builder2 != null) {
            addMediaDescriptionToSession(builder, builder2);
        }
        try {
            return builder.build();
        } catch (IllegalArgumentException | IllegalStateException e8) {
            throw ParserException.createForMalformedManifest(null, e8);
        }
    }

    private static MediaDescription.Builder parseMediaDescriptionLine(String str) {
        Matcher matcher = MEDIA_DESCRIPTION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, null);
        }
        try {
            return new MediaDescription.Builder((String) Assertions.checkNotNull(matcher.group(1)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))), (String) Assertions.checkNotNull(matcher.group(3)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4))));
        } catch (NumberFormatException e8) {
            throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, e8);
        }
    }
}
