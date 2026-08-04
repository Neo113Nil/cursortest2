package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageStringFormatter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lco/touchlab/kermit/MessageStringFormatter;", "", "formatMessage", "", "severity", "Lco/touchlab/kermit/Severity;", "tag", "Lco/touchlab/kermit/Tag;", "message", "Lco/touchlab/kermit/Message;", "formatMessage-SNKSsE8", "(Lco/touchlab/kermit/Severity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "formatSeverity", "formatTag", "formatTag-ntQDErM", "(Ljava/lang/String;)Ljava/lang/String;", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MessageStringFormatter {
    /* renamed from: formatMessage-SNKSsE8 */
    String mo212formatMessageSNKSsE8(Severity severity, String tag, String message);

    String formatSeverity(Severity severity);

    /* renamed from: formatTag-ntQDErM */
    String mo213formatTagntQDErM(String tag);

    /* compiled from: MessageStringFormatter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String formatSeverity(MessageStringFormatter messageStringFormatter, Severity severity) {
            Intrinsics.checkNotNullParameter(severity, "severity");
            return new StringBuilder().append(severity).append(':').toString();
        }

        /* renamed from: formatTag-ntQDErM, reason: not valid java name */
        public static String m222formatTagntQDErM(MessageStringFormatter messageStringFormatter, String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return "(" + tag + ')';
        }

        /* renamed from: formatMessage-SNKSsE8, reason: not valid java name */
        public static String m221formatMessageSNKSsE8(MessageStringFormatter messageStringFormatter, Severity severity, String str, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (severity == null && str == null) {
                return message;
            }
            StringBuilder sb = new StringBuilder();
            if (severity != null) {
                sb.append(messageStringFormatter.formatSeverity(severity)).append(" ");
            }
            if (str != null && str.length() > 0) {
                sb.append(messageStringFormatter.mo213formatTagntQDErM(str)).append(" ");
            }
            sb.append(message);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
    }
}
