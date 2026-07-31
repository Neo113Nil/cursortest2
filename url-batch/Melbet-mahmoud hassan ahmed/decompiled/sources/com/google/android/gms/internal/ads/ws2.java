package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class ws2 {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f13936a;

    public ws2() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) sw.c().b(m10.f8246l5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f13936a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f13936a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
