package com.squareup.util.cash;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class FlowUriMatcher {
    public static final Pattern PATTERN_START_FLOW = Pattern.compile("^/f/(\\S+)$");
    public final Matcher flowMatcher;
    public final Pattern pattern;

    public FlowUriMatcher(String str) {
        String str2;
        str.getClass();
        Pattern pattern = PATTERN_START_FLOW;
        pattern.getClass();
        this.pattern = pattern;
        try {
            URI uri = new URI(str);
            if (uri.getQuery() != null) {
                str2 = uri.getPath() + "?" + uri.getQuery();
            } else {
                str2 = uri.getPath();
            }
            str2.getClass();
        } catch (URISyntaxException unused) {
            str2 = "";
        }
        Matcher matcher = this.pattern.matcher(str2);
        matcher.getClass();
        this.flowMatcher = matcher;
    }
}
