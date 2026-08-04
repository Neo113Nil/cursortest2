package co.touchlab.kermit;

import co.touchlab.kermit.MessageStringFormatter;
import kotlin.Metadata;

/* compiled from: MessageStringFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lco/touchlab/kermit/DefaultFormatter;", "Lco/touchlab/kermit/MessageStringFormatter;", "()V", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultFormatter implements MessageStringFormatter {
    public static final DefaultFormatter INSTANCE = new DefaultFormatter();

    private DefaultFormatter() {
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    /* renamed from: formatMessage-SNKSsE8, reason: not valid java name */
    public String mo212formatMessageSNKSsE8(Severity severity, String str, String str2) {
        return MessageStringFormatter.DefaultImpls.m221formatMessageSNKSsE8(this, severity, str, str2);
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    public String formatSeverity(Severity severity) {
        return MessageStringFormatter.DefaultImpls.formatSeverity(this, severity);
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    /* renamed from: formatTag-ntQDErM, reason: not valid java name */
    public String mo213formatTagntQDErM(String str) {
        return MessageStringFormatter.DefaultImpls.m222formatTagntQDErM(this, str);
    }
}
