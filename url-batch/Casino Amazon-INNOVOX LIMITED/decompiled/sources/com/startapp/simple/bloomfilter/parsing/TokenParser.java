package com.startapp.simple.bloomfilter.parsing;

import com.startapp.simple.bloomfilter.data.TokenData;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class TokenParser {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");

    public TokenData fromTokenString(String str) {
        BloomVersion bloomVersion;
        long j;
        String[] split = str.split(TokenBuilder.TOKEN_DELIMITER);
        int length = split.length;
        if (length == 1) {
            bloomVersion = BloomVersion.ZERO;
            j = 0;
        } else if (length == 2) {
            bloomVersion = BloomVersion.THREE;
            if (!validTimestamp(split[0])) {
                return null;
            }
            j = Long.parseLong(split[0]);
            str = split[1];
        } else {
            if (length != 3 || !validTimestamp(split[0])) {
                return null;
            }
            j = Long.parseLong(split[0]);
            bloomVersion = versionByToken(split[1]);
            if (bloomVersion == null) {
                return null;
            }
            str = split[2];
        }
        return new TokenData(bloomVersion, j, str);
    }

    private boolean validTimestamp(String str) {
        return NUMBER_PATTERN.matcher(str).matches();
    }

    private BloomVersion versionByToken(String str) {
        if ("4".equals(str)) {
            return BloomVersion.FOUR;
        }
        if ("5".equals(str)) {
            return BloomVersion.FIVE;
        }
        return null;
    }
}
