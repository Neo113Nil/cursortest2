package androidx.room.util;

import androidx.annotation.RestrictTo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljava/lang/StringBuilder;", "newStringBuilder", "()Ljava/lang/StringBuilder;", "builder", "", "count", "", "appendPlaceholders", "(Ljava/lang/StringBuilder;I)V", "", "", "EMPTY_STRING_ARRAY", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "room-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes14.dex */
public final class StringUtil {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final void appendPlaceholders(StringBuilder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            builder.append("?");
            if (i2 < i - 1) {
                builder.append(StringUtils.COMMA);
            }
        }
    }
}
