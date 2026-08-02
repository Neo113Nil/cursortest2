package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes9.dex */
public final class VersionRequirement {
    public static final Companion Companion = new Companion(null);
    public final Integer errorCode;
    public final ProtoBuf.VersionRequirement.VersionKind kind;
    public final DeprecationLevel level;
    public final String message;
    public final Version version;

    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProtoBuf.VersionRequirement.Level.values().length];
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.WARNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final VersionRequirement create(int i, NameResolver nameResolver, VersionRequirementTable versionRequirementTable) {
            DeprecationLevel deprecationLevel;
            nameResolver.getClass();
            versionRequirementTable.getClass();
            ProtoBuf.VersionRequirement versionRequirement = versionRequirementTable.get(i);
            if (versionRequirement == null) {
                return null;
            }
            Version decode = Version.Companion.decode(versionRequirement.hasVersion() ? Integer.valueOf(versionRequirement.getVersion()) : null, versionRequirement.hasVersionFull() ? Integer.valueOf(versionRequirement.getVersionFull()) : null);
            ProtoBuf.VersionRequirement.Level level = versionRequirement.getLevel();
            level.getClass();
            int i2 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer valueOf = versionRequirement.hasErrorCode() ? Integer.valueOf(versionRequirement.getErrorCode()) : null;
            String string2 = versionRequirement.hasMessage() ? nameResolver.getString(versionRequirement.getMessage()) : null;
            ProtoBuf.VersionRequirement.VersionKind versionKind = versionRequirement.getVersionKind();
            versionKind.getClass();
            return new VersionRequirement(decode, versionKind, deprecationLevel2, valueOf, string2);
        }
    }

    public static final class Version {
        public static final Companion Companion = new Companion(null);
        public static final Version INFINITY = new Version(256, 256, 256);
        public final int major;
        public final int minor;
        public final int patch;

        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public final Version decode(Integer num, Integer num2) {
                return num2 != null ? new Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255) : num != null ? new Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127) : Version.INFINITY;
            }
        }

        public Version(int i, int i2, int i3) {
            this.major = i;
            this.minor = i2;
            this.patch = i3;
        }

        public final String asString() {
            int i = this.minor;
            int i2 = this.patch;
            int i3 = this.major;
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i3);
                sb.append('.');
                sb.append(i);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i3);
            sb2.append('.');
            sb2.append(i);
            sb2.append('.');
            sb2.append(i2);
            return sb2.toString();
        }

        public final int component1() {
            return this.major;
        }

        public final int component2() {
            return this.minor;
        }

        public final int component3() {
            return this.patch;
        }

        public final void encode(Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12) {
            function1.getClass();
            function12.getClass();
            if (equals(INFINITY)) {
                return;
            }
            int i = this.patch;
            int i2 = this.minor;
            int i3 = this.major;
            if (i3 > 7 || i2 > 15 || i > 127) {
                function12.invoke(Integer.valueOf(i3 | (i2 << 8) | (i << 16)));
            } else {
                function1.invoke(Integer.valueOf(i3 | (i2 << 3) | (i << 7)));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return false;
            }
            Version version = (Version) obj;
            return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
        }

        public int hashCode() {
            return Integer.hashCode(this.patch) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minor, Integer.hashCode(this.major) * 31, 31);
        }

        public String toString() {
            return asString();
        }
    }

    public VersionRequirement(Version version, ProtoBuf.VersionRequirement.VersionKind versionKind, DeprecationLevel deprecationLevel, Integer num, String str) {
        version.getClass();
        versionKind.getClass();
        deprecationLevel.getClass();
        this.version = version;
        this.kind = versionKind;
        this.level = deprecationLevel;
        this.errorCode = num;
        this.message = str;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final ProtoBuf.VersionRequirement.VersionKind getKind() {
        return this.kind;
    }

    public final DeprecationLevel getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Version getVersion() {
        return this.version;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("since ");
        sb.append(this.version);
        sb.append(' ');
        sb.append(this.level);
        String str2 = "";
        Integer num = this.errorCode;
        if (num != null) {
            str = " error " + num.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        String str3 = this.message;
        if (str3 != null) {
            str2 = ": " + str3;
        }
        sb.append(str2);
        return sb.toString();
    }
}
