package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import n2.EnumC3267b;

/* loaded from: classes3.dex */
class d extends c {
    public static final EnumC3267b d(char c4, boolean z4) {
        if (!z4) {
            if (c4 == 'D') {
                return EnumC3267b.f41385i;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c4);
        }
        if (c4 == 'H') {
            return EnumC3267b.f41384h;
        }
        if (c4 == 'M') {
            return EnumC3267b.f41383g;
        }
        if (c4 == 'S') {
            return EnumC3267b.f41382f;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c4);
    }

    public static final EnumC3267b e(String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return EnumC3267b.f41380d;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC3267b.f41379c;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC3267b.f41381e;
                        }
                    } else if (shortName.equals("s")) {
                        return EnumC3267b.f41382f;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC3267b.f41383g;
                }
            } else if (shortName.equals("h")) {
                return EnumC3267b.f41384h;
            }
        } else if (shortName.equals("d")) {
            return EnumC3267b.f41385i;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
