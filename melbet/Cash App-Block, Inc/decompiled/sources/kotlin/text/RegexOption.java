package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public enum RegexOption {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128, 0, 2, null);

    public final int value;

    RegexOption(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = i;
    }
}
