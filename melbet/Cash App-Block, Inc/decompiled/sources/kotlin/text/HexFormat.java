package kotlin.text;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class HexFormat {
    public static final Companion Companion = new Companion(null);
    public static final HexFormat Default;
    public final BytesHexFormat bytes;
    public final NumberHexFormat number;
    public final boolean upperCase;

    public final class BytesHexFormat {
        public static final Companion Companion = new Companion(null);
        public static final BytesHexFormat Default = new BytesHexFormat();
        public final boolean ignoreCase;
        public final boolean noLineAndGroupSeparator = true;
        public final boolean shortByteSeparatorNoPrefixAndSuffix = true;

        public final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public BytesHexFormat() {
            boolean z = true;
            if (!UStringsKt.access$isCaseSensitive("  ") && !UStringsKt.access$isCaseSensitive("") && !UStringsKt.access$isCaseSensitive("") && !UStringsKt.access$isCaseSensitive("")) {
                z = false;
            }
            this.ignoreCase = z;
        }

        public final void appendOptionsTo$kotlin_stdlib(StringBuilder sb, String str) {
            Boxes$$ExternalSyntheticOutline1.m(sb, str, "bytesPerLine = ", Integer.MAX_VALUE, ",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            Boxes$$ExternalSyntheticOutline1.m(sb, str, "bytePrefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            appendOptionsTo$kotlin_stdlib(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final class NumberHexFormat {
        public static final Companion Companion = new Companion(null);
        public static final NumberHexFormat Default;

        public final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            NumberHexFormat numberHexFormat = new NumberHexFormat();
            if (!UStringsKt.access$isCaseSensitive("")) {
                UStringsKt.access$isCaseSensitive("");
            }
            Default = numberHexFormat;
        }

        public final void appendOptionsTo$kotlin_stdlib(StringBuilder sb, String str) {
            Boxes$$ExternalSyntheticOutline1.m(sb, str, "prefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            appendOptionsTo$kotlin_stdlib(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.Companion;
        companion.getClass();
        BytesHexFormat bytesHexFormat = BytesHexFormat.Default;
        NumberHexFormat.Companion companion2 = NumberHexFormat.Companion;
        companion2.getClass();
        NumberHexFormat numberHexFormat = NumberHexFormat.Default;
        Default = new HexFormat(false, bytesHexFormat, numberHexFormat);
        companion.getClass();
        companion2.getClass();
        new HexFormat(true, bytesHexFormat, numberHexFormat);
    }

    public HexFormat(boolean z, BytesHexFormat bytesHexFormat, NumberHexFormat numberHexFormat) {
        bytesHexFormat.getClass();
        numberHexFormat.getClass();
        this.upperCase = z;
        this.bytes = bytesHexFormat;
        this.number = numberHexFormat;
    }

    public final String toString() {
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("HexFormat(\n    upperCase = ");
        m.append(this.upperCase);
        m.append(",\n    bytes = BytesHexFormat(\n");
        this.bytes.appendOptionsTo$kotlin_stdlib(m, "        ");
        m.append('\n');
        m.append("    ),");
        m.append('\n');
        m.append("    number = NumberHexFormat(");
        m.append('\n');
        this.number.appendOptionsTo$kotlin_stdlib(m, "        ");
        m.append('\n');
        m.append("    )");
        m.append('\n');
        m.append(")");
        return m.toString();
    }
}
