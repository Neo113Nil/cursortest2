package com.yandex.mobile.ads.impl;

import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i22 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final gm1 f27073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27074b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f27075c;

    public static final class a {
        @NotNull
        public static i22 a(@NotNull String statusLine) {
            gm1 gm1Var;
            int i4;
            String str;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.K(statusLine, "HTTP/1.", false, 2, null)) {
                i4 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    gm1Var = gm1.f26228d;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    gm1Var = gm1.f26229e;
                }
            } else {
                if (!StringsKt.K(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                gm1Var = gm1.f26228d;
                i4 = 4;
            }
            int i5 = i4 + 3;
            if (statusLine.length() < i5) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String substring = statusLine.substring(i4, i5);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i5) {
                    str = "";
                } else {
                    if (statusLine.charAt(i5) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    str = statusLine.substring(i4 + 4);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
                return new i22(gm1Var, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }

    public i22(@NotNull gm1 protocol, int i4, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f27073a = protocol;
        this.f27074b = i4;
        this.f27075c = message;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f27073a == gm1.f26228d) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f27074b);
        sb.append(' ');
        sb.append(this.f27075c);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
