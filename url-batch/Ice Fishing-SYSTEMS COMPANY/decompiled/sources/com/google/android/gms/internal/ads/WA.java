package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class WA extends UA {

    /* renamed from: u, reason: collision with root package name */
    public static final int f28368u = Integer.numberOfLeadingZeros(31);

    /* renamed from: v, reason: collision with root package name */
    public static final WA f28369v = new WA("CharMatcher.whitespace()");

    @Override // com.google.android.gms.internal.ads.SA
    public final boolean a(char c4) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c4) >>> f28368u) == c4;
    }
}
