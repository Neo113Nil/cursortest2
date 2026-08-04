package co.touchlab.kermit;

import co.touchlab.kermit.MessageStringFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageStringFormatter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lco/touchlab/kermit/NoTagFormatter;", "Lco/touchlab/kermit/MessageStringFormatter;", "()V", "formatMessage", "", "severity", "Lco/touchlab/kermit/Severity;", "tag", "Lco/touchlab/kermit/Tag;", "message", "Lco/touchlab/kermit/Message;", "formatMessage-SNKSsE8", "(Lco/touchlab/kermit/Severity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "formatTag", "formatTag-ntQDErM", "(Ljava/lang/String;)Ljava/lang/String;", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoTagFormatter implements MessageStringFormatter {
    public static final NoTagFormatter INSTANCE = new NoTagFormatter();

    private NoTagFormatter() {
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    public String formatSeverity(Severity severity) {
        return MessageStringFormatter.DefaultImpls.formatSeverity(this, severity);
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    /* renamed from: formatTag-ntQDErM */
    public String mo213formatTagntQDErM(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return "";
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    /* renamed from: formatMessage-SNKSsE8 */
    public String mo212formatMessageSNKSsE8(Severity severity, String tag, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return MessageStringFormatter.DefaultImpls.m221formatMessageSNKSsE8(this, severity, null, message);
    }
}
