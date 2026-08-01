package io.ktor.http.auth;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeaderValueEncoding.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/auth/HeaderValueEncoding;", "", "(Ljava/lang/String;I)V", "QUOTED_WHEN_REQUIRED", "QUOTED_ALWAYS", "URI_ENCODE", "ktor-http"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeaderValueEncoding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HeaderValueEncoding[] $VALUES;
    public static final HeaderValueEncoding QUOTED_WHEN_REQUIRED = new HeaderValueEncoding("QUOTED_WHEN_REQUIRED", 0);
    public static final HeaderValueEncoding QUOTED_ALWAYS = new HeaderValueEncoding("QUOTED_ALWAYS", 1);
    public static final HeaderValueEncoding URI_ENCODE = new HeaderValueEncoding("URI_ENCODE", 2);

    private static final /* synthetic */ HeaderValueEncoding[] $values() {
        return new HeaderValueEncoding[]{QUOTED_WHEN_REQUIRED, QUOTED_ALWAYS, URI_ENCODE};
    }

    public static EnumEntries<HeaderValueEncoding> getEntries() {
        return $ENTRIES;
    }

    public static HeaderValueEncoding valueOf(String str) {
        return (HeaderValueEncoding) Enum.valueOf(HeaderValueEncoding.class, str);
    }

    public static HeaderValueEncoding[] values() {
        return (HeaderValueEncoding[]) $VALUES.clone();
    }

    private HeaderValueEncoding(String str, int i) {
    }

    static {
        HeaderValueEncoding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
