package androidx.compose.runtime.tooling;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SourceInformation.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0019R\"\u0010$\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u001d¨\u0006)"}, d2 = {"Landroidx/compose/runtime/tooling/SourceInfoParserState;", "", "", "data", "<init>", "(Ljava/lang/String;)V", "", "char", "", "expect", "(C)V", "message", "", "throwParseError", "(Ljava/lang/String;)Ljava/lang/Void;", "", "matches", "(C)Z", "separator", "", "takeIntUntil", "(Ljava/lang/String;)I", "takeUntil", "(Ljava/lang/String;)Ljava/lang/String;", "takeUntilEnd", "()Ljava/lang/String;", "skipUntil", "count", "advance", "(I)V", "current", "()C", "atEnd", "()Z", "Ljava/lang/String;", "getData", "i", "I", "getI", "()I", "setI", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SourceInfoParserState {
    private final String data;
    private int i;

    public SourceInfoParserState(String str) {
        this.data = str;
    }

    public final String getData() {
        return this.data;
    }

    public final int getI() {
        return this.i;
    }

    public final void expect(char r3) {
        if (matches(r3)) {
            return;
        }
        throwParseError("expected " + r3);
        throw new KotlinNothingValueException();
    }

    public final Void throwParseError(String message) {
        int min = Math.min(this.i, this.data.length());
        StringBuilder sb = new StringBuilder();
        sb.append("Error while parsing source information: ");
        sb.append(message);
        sb.append(" at ");
        String substring = this.data.substring(0, min);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        sb.append('|');
        String substring2 = this.data.substring(min);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb.append(substring2);
        throw new ParseException(sb.toString());
    }

    public final boolean matches(char r3) {
        return this.i < this.data.length() && this.data.charAt(this.i) == r3;
    }

    public final int takeIntUntil(String separator) {
        Integer intOrNull = StringsKt.toIntOrNull(takeUntil(separator));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throwParseError("expected int");
        throw new KotlinNothingValueException();
    }

    public final String takeUntil(String separator) {
        int i = this.i;
        skipUntil(separator);
        int i2 = this.i;
        if (i2 <= i) {
            return "";
        }
        String substring = this.data.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String takeUntilEnd() {
        String str = this.data;
        String substring = str.substring(this.i, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final void skipUntil(String separator) {
        while (this.i < this.data.length() && !StringsKt.contains$default((CharSequence) separator, this.data.charAt(this.i), false, 2, (Object) null)) {
            this.i++;
        }
    }

    public static /* synthetic */ void advance$default(SourceInfoParserState sourceInfoParserState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        sourceInfoParserState.advance(i);
    }

    public final void advance(int count) {
        this.i += count;
    }

    public final char current() {
        return this.data.charAt(this.i);
    }

    public final boolean atEnd() {
        return this.i >= this.data.length();
    }
}
