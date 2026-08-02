package com.stripe.android.uicore.elements;

import com.stripe.android.core.strings.IdentifierResolvableString;
import com.stripe.android.core.strings.ResolvableString;
import java.util.regex.Pattern;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class EmailConfig {
    public static final Pattern PATTERN;
    public final ResolvableString label;
    public final int keyboard = 6;
    public final StateFlowImpl trailingIcon = FlowKt.MutableStateFlow(null);
    public final StateFlowImpl loading = FlowKt.MutableStateFlow(Boolean.FALSE);

    static {
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        compile.getClass();
        PATTERN = compile;
    }

    public EmailConfig(IdentifierResolvableString identifierResolvableString) {
        this.label = identifierResolvableString;
    }
}
