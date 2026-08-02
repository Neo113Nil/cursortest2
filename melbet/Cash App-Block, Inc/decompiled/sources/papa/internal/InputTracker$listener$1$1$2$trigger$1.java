package papa.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.UUID;
import papa.InteractionTrace;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class InputTracker$listener$1$1$2$trigger$1 implements InteractionTrace {
    public int $cookie;
    public final String $traceSectionName;

    public InputTracker$listener$1$1$2$trigger$1() {
        this.$cookie = 3;
        this.$traceSectionName = UUID.randomUUID().toString();
    }

    @Override // papa.InteractionTrace
    public void endTrace() {
        SafeTrace.endAsyncSection(this.$traceSectionName, this.$cookie);
    }

    public void setEnvironment(int i) {
        if (i != 0) {
            if (i == 0) {
                i = 0;
            } else if (i != 2 && i != 1 && i != 23 && i != 3) {
                Locale locale = Locale.US;
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid environment value "));
                return;
            }
        }
        this.$cookie = i;
    }

    public InputTracker$listener$1$1$2$trigger$1(String str, int i) {
        this.$traceSectionName = str;
        this.$cookie = i;
    }
}
