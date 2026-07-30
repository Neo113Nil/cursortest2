package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import javax.annotation.CheckForNull;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String str, int i8, boolean z7) {
        this.host = str;
        this.port = i8;
        this.hasBracketlessColons = z7;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort fromString = fromString(str);
        Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", str);
        return fromString;
    }

    public static HostAndPort fromParts(String str, int i8) {
        Preconditions.checkArgument(isValidPort(i8), "Port out of range: %s", i8);
        HostAndPort fromString = fromString(str);
        Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(fromString.host, i8, fromString.hasBracketlessColons);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    @CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HostAndPort fromString(String str) {
        String str2;
        boolean z7;
        String str3;
        String substring;
        Preconditions.checkNotNull(str);
        int i8 = -1;
        if (!str.startsWith("[")) {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int i9 = indexOf + 1;
                if (str.indexOf(58, i9) == -1) {
                    substring = str.substring(0, indexOf);
                    str3 = str.substring(i9);
                }
            }
            str2 = str;
            z7 = indexOf >= 0;
            str3 = null;
            if (!Strings.isNullOrEmpty(str3)) {
                Preconditions.checkArgument(!str3.startsWith("+") && CharMatcher.ascii().matchesAllOf(str3), "Unparseable port number: %s", str);
                try {
                    i8 = Integer.parseInt(str3);
                    Preconditions.checkArgument(isValidPort(i8), "Port number out of range: %s", str);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(str.length() != 0 ? "Unparseable port number: ".concat(str) : new String("Unparseable port number: "));
                }
            }
            return new HostAndPort(str2, i8, z7);
        }
        String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(str);
        substring = hostAndPortFromBracketedHost[0];
        str3 = hostAndPortFromBracketedHost[1];
        str2 = substring;
        z7 = false;
        if (!Strings.isNullOrEmpty(str3)) {
        }
        return new HostAndPort(str2, i8, z7);
    }

    private static String[] getHostAndPortFromBracketedHost(String str) {
        Preconditions.checkArgument(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int indexOf = str.indexOf(58);
        int lastIndexOf = str.lastIndexOf(93);
        Preconditions.checkArgument(indexOf > -1 && lastIndexOf > indexOf, "Invalid bracketed host/port: %s", str);
        String substring = str.substring(1, lastIndexOf);
        int i8 = lastIndexOf + 1;
        if (i8 == str.length()) {
            return new String[]{substring, ""};
        }
        Preconditions.checkArgument(str.charAt(i8) == ':', "Only a colon may follow a close bracket: %s", str);
        int i9 = lastIndexOf + 2;
        for (int i10 = i9; i10 < str.length(); i10++) {
            Preconditions.checkArgument(Character.isDigit(str.charAt(i10)), "Port must be numeric: %s", str);
        }
        return new String[]{substring, str.substring(i9)};
    }

    private static boolean isValidPort(int i8) {
        return i8 >= 0 && i8 <= 65535;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        return Objects.equal(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int i8) {
        return hasPort() ? this.port : i8;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.host, Integer.valueOf(this.port));
    }

    @CanIgnoreReturnValue
    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }

    public HostAndPort withDefaultPort(int i8) {
        Preconditions.checkArgument(isValidPort(i8));
        return hasPort() ? this : new HostAndPort(this.host, i8, this.hasBracketlessColons);
    }
}
