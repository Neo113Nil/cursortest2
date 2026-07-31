package androidx.window.core;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.div.core.DivActionHandler;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Version.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/window/core/Version;", "", "", "major", "minor", DivActionHandler.DivActionReason.PATCH, "", "description", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "compareTo", "(Landroidx/window/core/Version;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getMajor", "getMinor", "getPatch", "Ljava/lang/String;", "getDescription", "Ljava/math/BigInteger;", "bigInteger$delegate", "Lkotlin/Lazy;", "getBigInteger", "()Ljava/math/BigInteger;", "bigInteger", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;

    /* renamed from: bigInteger$delegate, reason: from kotlin metadata */
    private final Lazy bigInteger;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public /* synthetic */ Version(int i, int i2, int i3, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str);
    }

    private Version(int i, int i2, int i3, String str) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.description = str;
        this.bigInteger = LazyKt.lazy(new Function0() { // from class: androidx.window.core.Version$bigInteger$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final BigInteger mo4828invoke() {
                return BigInteger.valueOf(Version.this.getMajor()).shiftLeft(32).or(BigInteger.valueOf(Version.this.getMinor())).shiftLeft(32).or(BigInteger.valueOf(Version.this.getPatch()));
            }
        });
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public String toString() {
        String str;
        if (!StringsKt.isBlank(this.description)) {
            str = Intrinsics.stringPlus("-", this.description);
        } else {
            str = "";
        }
        return this.major + '.' + this.minor + '.' + this.patch + str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }

    public boolean equals(Object other) {
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "<init>", "()V", "", "versionString", "Landroidx/window/core/Version;", "parse", "(Ljava/lang/String;)Landroidx/window/core/Version;", "VERSION_0_1", "Landroidx/window/core/Version;", "getVERSION_0_1", "()Landroidx/window/core/Version;", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version parse(String versionString) {
            if (versionString == null || StringsKt.isBlank(versionString)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(versionString);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            Intrinsics.checkNotNullExpressionValue(description, "description");
            return new Version(intValue, intValue2, intValue3, description, null);
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }
}
