package kotlinx.serialization.json.internal;

import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AbstractJsonLexer.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0014J\b\u0010\u001f\u001a\u00020 H&J\u0006\u0010!\u001a\u00020 J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0004H\u0003J\u0006\u0010#\u001a\u00020 J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u000fH&J\b\u0010'\u001a\u00020(H&J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0016J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020\u000fJ \u0010-\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0005J3\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020 2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u001c01H\u0016J\u0006\u00105\u001a\u00020\u000fJ\u0006\u00106\u001a\u00020\u000fJ\u0018\u00107\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u00108\u001a\u00020\u001cJ\b\u00109\u001a\u00020\u001cH\u0016J\u0006\u0010:\u001a\u00020\u001cJ\u001f\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020(2\b\b\u0002\u0010>\u001a\u00020 H\u0000¢\u0006\u0002\b?J\"\u0010;\u001a\u00020<2\u0006\u0010@\u001a\u00020\u000f2\b\b\u0002\u0010A\u001a\u00020\u00042\b\b\u0002\u0010B\u001a\u00020\u000fJ\u000e\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u000fJ\u0018\u0010E\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0018\u0010H\u001a\u00020 2\u0006\u0010/\u001a\u00020 2\u0006\u0010G\u001a\u00020*H\u0002J\u0006\u0010I\u001a\u00020 J\u0010\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020*H\u0004J\u001a\u0010L\u001a\u0004\u0018\u00010\u000f2\u0006\u0010M\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020 H&J\u0006\u0010N\u001a\u00020(J\u0010\u0010O\u001a\u0004\u0018\u00010\u000f2\u0006\u0010/\u001a\u00020 J\u0010\u0010P\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0004H&J1\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020 2\b\b\u0002\u0010A\u001a\u00020\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0SH\u0080\bø\u0001\u0000¢\u0006\u0002\bTJ\u000e\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020 J\b\u0010W\u001a\u00020\u0004H\u0016J\u0018\u0010X\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0004H\u0016J\b\u0010Z\u001a\u00020\u000fH\u0002J\b\u0010[\u001a\u00020\u000fH\u0016J\b\u0010\\\u001a\u00020 H&J\u0010\u0010]\u001a\u00020 2\b\b\u0002\u0010^\u001a\u00020 J\u0010\u0010_\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0004J\b\u0010`\u001a\u00020 H\u0002J\"\u0010a\u001a\u0002Hb\"\u0004\b\u0000\u0010b2\f\u0010c\u001a\b\u0012\u0004\u0012\u0002Hb0SH\u0082\b¢\u0006\u0002\u0010dJC\u0010e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010f\u001a\u00020 2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u001c01H\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u0011X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "()V", "currentPosition", "", "escapedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "path", "Lkotlinx/serialization/json/internal/JsonPath;", "peekedString", "", "source", "", "getSource", "()Ljava/lang/CharSequence;", "appendEsc", "startPosition", "appendEscape", "lastPosition", "current", "appendHex", "startPos", "appendRange", "", "fromIndex", "toIndex", "canConsumeValue", "", "consumeBoolean", ViewProps.START, "consumeBooleanLenient", "consumeBooleanLiteral", "literalSuffix", "consumeKeyString", "consumeNextToken", "", "expected", "", "consumeNumericLiteral", "", "consumeString", "consumeStringChunked", "isLenient", "consumeChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "consumeStringLenient", "consumeStringLenientNotNull", "decodedString", "discardPeeked", "ensureHaveChars", "expectEof", "fail", "", "expectedToken", "wasConsumed", "fail$kotlinx_serialization_json", "message", ViewProps.POSITION, "hint", "failOnUnknownKey", "key", "fromHexChar", "indexOf", "char", "insideString", "isNotEof", "isValidValueStart", "c", "peekLeadingMatchingValue", "keyToMatch", "peekNextToken", "peekString", "prefetchOrEof", "require", "condition", "Lkotlin/Function0;", "require$kotlinx_serialization_json", "skipElement", "allowLenientStrings", "skipWhitespaces", "substring", "endPos", "takePeeked", "toString", "tryConsumeComma", "tryConsumeNull", "doConsume", "unexpectedToken", "wasUnquotedString", "withPositionRollback", "T", "action", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "writeRange", "currentChunkHasEscape", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractJsonLexer {
    public int currentPosition;
    private String peekedString;
    public final JsonPath path = new JsonPath();
    private StringBuilder escapedString = new StringBuilder();

    public abstract boolean canConsumeValue();

    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public void ensureHaveChars() {
    }

    protected abstract CharSequence getSource();

    protected final boolean isValidValueStart(char c) {
        return !(c == '}' || c == ']' || c == ':' || c == ',');
    }

    public abstract String peekLeadingMatchingValue(String keyToMatch, boolean isLenient);

    public abstract int prefetchOrEof(int position);

    public abstract boolean tryConsumeComma();

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    protected final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    protected final void setEscapedString(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<set-?>");
        this.escapedString = sb;
    }

    public final byte consumeNextToken(byte expected) {
        byte consumeNextToken = consumeNextToken();
        if (consumeNextToken == expected) {
            return consumeNextToken;
        }
        fail$kotlinx_serialization_json$default(this, expected, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public void consumeNextToken(char expected) {
        ensureHaveChars();
        CharSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                int i2 = prefetchOrEof + 1;
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = i2;
                    if (charAt == expected) {
                        return;
                    } else {
                        unexpectedToken(expected);
                    }
                }
                i = i2;
            } else {
                this.currentPosition = prefetchOrEof;
                unexpectedToken(expected);
                return;
            }
        }
    }

    protected final void unexpectedToken(char expected) {
        int i = this.currentPosition;
        if (i > 0 && expected == '\"') {
            try {
                this.currentPosition = i - 1;
                String consumeStringLenient = consumeStringLenient();
                this.currentPosition = i;
                if (Intrinsics.areEqual(consumeStringLenient, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.currentPosition = i;
                throw th;
            }
        }
        fail$kotlinx_serialization_json$default(this, AbstractJsonLexerKt.charToTokenClass(expected), false, 2, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, byte b, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return abstractJsonLexer.fail$kotlinx_serialization_json(b, z);
    }

    public final Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed) {
        String str = AbstractJsonLexerKt.tokenDescription(expectedToken);
        int i = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
        fail$default(this, "Expected " + str + ", but had '" + ((this.currentPosition == getSource().length() || i < 0) ? "EOF" : String.valueOf(getSource().charAt(i))) + "' instead", i, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final byte peekNextToken() {
        CharSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = prefetchOrEof;
                    return AbstractJsonLexerKt.charToTokenClass(charAt);
                }
                i = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return abstractJsonLexer.tryConsumeNull(z);
    }

    public final boolean tryConsumeNull(boolean doConsume) {
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - prefetchOrEof;
        if (length < 4 || prefetchOrEof == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (AbstractJsonLexerKt.NULL.charAt(i) != getSource().charAt(prefetchOrEof + i)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(prefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!doConsume) {
            return true;
        }
        this.currentPosition = prefetchOrEof + 4;
        return true;
    }

    public int skipWhitespaces() {
        int prefetchOrEof;
        char charAt;
        int i = this.currentPosition;
        while (true) {
            prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof == -1 || !((charAt = getSource().charAt(prefetchOrEof)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = prefetchOrEof + 1;
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }

    public final String peekString(boolean isLenient) {
        String consumeString;
        byte peekNextToken = peekNextToken();
        if (isLenient) {
            if (peekNextToken != 1 && peekNextToken != 0) {
                return null;
            }
            consumeString = consumeStringLenient();
        } else {
            if (peekNextToken != 1) {
                return null;
            }
            consumeString = consumeString();
        }
        this.peekedString = consumeString;
        return consumeString;
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public int indexOf(char r7, int startPos) {
        return StringsKt.indexOf$default(getSource(), r7, startPos, false, 4, (Object) null);
    }

    public String substring(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    private final boolean insideString(boolean isLenient, char r4) {
        return isLenient ? AbstractJsonLexerKt.charToTokenClass(r4) == 0 : r4 != '\"';
    }

    public void consumeStringChunked(boolean isLenient, Function1<? super String, Unit> consumeChunk) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        byte peekNextToken = peekNextToken();
        if (!isLenient || peekNextToken == 0) {
            if (!isLenient) {
                consumeNextToken('\"');
            }
            int i3 = this.currentPosition;
            char charAt = getSource().charAt(i3);
            boolean z = false;
            int i4 = i3;
            while (insideString(isLenient, charAt)) {
                if (isLenient || charAt != '\\') {
                    int i5 = i4 + 1;
                    i = i3;
                    i2 = i5;
                } else {
                    i2 = prefetchOrEof(appendEscape(i3, i4));
                    z = true;
                    i = i2;
                }
                if (i2 >= getSource().length()) {
                    writeRange(i, i2, z, consumeChunk);
                    int prefetchOrEof = prefetchOrEof(i2);
                    if (prefetchOrEof == -1) {
                        fail$default(this, "EOF", prefetchOrEof, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    z = false;
                    i3 = prefetchOrEof;
                    i4 = i3;
                } else {
                    int i6 = i;
                    i4 = i2;
                    i3 = i6;
                }
                charAt = getSource().charAt(i4);
            }
            writeRange(i3, i4, z, consumeChunk);
            this.currentPosition = i4;
            if (isLenient) {
                return;
            }
            consumeNextToken('\"');
        }
    }

    private final void writeRange(int fromIndex, int toIndex, boolean currentChunkHasEscape, Function1<? super String, Unit> consumeChunk) {
        if (currentChunkHasEscape) {
            consumeChunk.invoke(decodedString(fromIndex, toIndex));
        } else {
            consumeChunk.invoke(substring(fromIndex, toIndex));
        }
    }

    public final String consumeString() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        return consumeKeyString();
    }

    protected final String consumeString(CharSequence source, int startPosition, int current) {
        String decodedString;
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(current);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                int prefetchOrEof = prefetchOrEof(appendEscape(startPosition, current));
                if (prefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", prefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z = true;
                startPosition = prefetchOrEof;
                current = startPosition;
            } else {
                current++;
                if (current >= source.length()) {
                    appendRange(startPosition, current);
                    int prefetchOrEof2 = prefetchOrEof(current);
                    if (prefetchOrEof2 == -1) {
                        fail$default(this, "Unexpected EOF", prefetchOrEof2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    startPosition = prefetchOrEof2;
                    current = startPosition;
                    z = true;
                } else {
                    continue;
                }
            }
            charAt = source.charAt(current);
        }
        if (!z) {
            decodedString = substring(startPosition, current);
        } else {
            decodedString = decodedString(startPosition, current);
        }
        this.currentPosition = current + 1;
        return decodedString;
    }

    private final int appendEscape(int lastPosition, int current) {
        appendRange(lastPosition, current);
        return appendEsc(current + 1);
    }

    private final String decodedString(int lastPosition, int currentPosition) {
        appendRange(lastPosition, currentPosition);
        String sb = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        this.escapedString.setLength(0);
        return sb;
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    public final String consumeStringLenientNotNull() {
        String consumeStringLenient = consumeStringLenient();
        if (!Intrinsics.areEqual(consumeStringLenient, AbstractJsonLexerKt.NULL) || !wasUnquotedString()) {
            return consumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    public final String consumeStringLenient() {
        String decodedString;
        if (this.peekedString != null) {
            return takePeeked();
        }
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1) {
            fail$default(this, "EOF", skipWhitespaces, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces));
        if (charToTokenClass == 1) {
            return consumeString();
        }
        if (charToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(skipWhitespaces), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces)) == 0) {
            skipWhitespaces++;
            if (skipWhitespaces >= getSource().length()) {
                appendRange(this.currentPosition, skipWhitespaces);
                int prefetchOrEof = prefetchOrEof(skipWhitespaces);
                if (prefetchOrEof == -1) {
                    this.currentPosition = skipWhitespaces;
                    return decodedString(0, 0);
                }
                skipWhitespaces = prefetchOrEof;
                z = true;
            }
        }
        if (!z) {
            decodedString = substring(this.currentPosition, skipWhitespaces);
        } else {
            decodedString = decodedString(this.currentPosition, skipWhitespaces);
        }
        this.currentPosition = skipWhitespaces;
        return decodedString;
    }

    protected void appendRange(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    private final int appendEsc(int startPosition) {
        int prefetchOrEof = prefetchOrEof(startPosition);
        if (prefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i = prefetchOrEof + 1;
        char charAt = getSource().charAt(prefetchOrEof);
        if (charAt == 'u') {
            return appendHex(getSource(), i);
        }
        char escapeToChar = AbstractJsonLexerKt.escapeToChar(charAt);
        if (escapeToChar == 0) {
            fail$default(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.escapedString.append(escapeToChar);
        return i;
    }

    private final int appendHex(CharSequence source, int startPos) {
        int i = startPos + 4;
        if (i >= source.length()) {
            this.currentPosition = startPos;
            ensureHaveChars();
            if (this.currentPosition + 4 >= source.length()) {
                fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return appendHex(source, this.currentPosition);
        }
        this.escapedString.append((char) ((fromHexChar(source, startPos) << 12) + (fromHexChar(source, startPos + 1) << 8) + (fromHexChar(source, startPos + 2) << 4) + fromHexChar(source, startPos + 3)));
        return i;
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Function0 message, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.currentPosition;
        }
        int i3 = i;
        Intrinsics.checkNotNullParameter(message, "message");
        if (z) {
            return;
        }
        fail$default(abstractJsonLexer, (String) message.invoke(), i3, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void require$kotlinx_serialization_json(boolean condition, int position, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (condition) {
            return;
        }
        fail$default(this, message.invoke(), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private final int fromHexChar(CharSequence source, int currentPosition) {
        char charAt = source.charAt(currentPosition);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void skipElement(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte peekNextToken = peekNextToken();
        if (peekNextToken != 8 && peekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte peekNextToken2 = peekNextToken();
            if (peekNextToken2 != 1) {
                if (peekNextToken2 == 8 || peekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(peekNextToken2));
                } else if (peekNextToken2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (peekNextToken2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (peekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.currentPosition + ')';
    }

    public final void failOnUnknownKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        fail("Encountered an unknown key '" + key + '\'', StringsKt.lastIndexOf$default((CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (Object) null), AbstractJsonLexerKt.ignoreUnknownKeysHint);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.currentPosition;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i, str2);
    }

    public final Void fail(String message, int position, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        throw JsonExceptionsKt.JsonDecodingException(position, message + " at path: " + this.path.getPath() + (hint.length() == 0 ? "" : "\n" + hint), getSource());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
    
        fail$default(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0142, code lost:
    
        if (r1 == r2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
    
        if (r1 == (r2 - 1)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        if (r0 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
    
        if (r4 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0156, code lost:
    
        if (getSource().charAt(r2) != '\"') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        fail$default(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        fail$default(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        r18.currentPosition = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        if (r8 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        r1 = r10 * consumeNumericLiteral$calculateExponent(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019b, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019d, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019f, code lost:
    
        fail$default(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c1, code lost:
    
        fail$default(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d1, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d2, code lost:
    
        if (r9 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d4, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d9, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dc, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01dd, code lost:
    
        fail$default(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ed, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
    
        fail$default(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01fe, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0141, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long consumeNumericLiteral() {
        boolean z;
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (prefetchOrEof >= getSource().length() || prefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(prefetchOrEof) == '\"') {
            prefetchOrEof++;
            if (prefetchOrEof == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z = true;
        } else {
            z = false;
        }
        int i = prefetchOrEof;
        boolean z2 = false;
        boolean z3 = false;
        long j = 0;
        long j2 = 0;
        loop0: while (true) {
            boolean z4 = false;
            while (i != getSource().length()) {
                char charAt = getSource().charAt(i);
                if ((charAt == 'e' || charAt == 'E') && !z2) {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol " + charAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i++;
                    z2 = true;
                } else if (charAt == '-' && z2) {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i++;
                } else if (charAt != '+' || !z2) {
                    if (charAt != '-') {
                        if (AbstractJsonLexerKt.charToTokenClass(charAt) != 0) {
                            break loop0;
                        }
                        i++;
                        int i2 = charAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            break loop0;
                        }
                        if (z2) {
                            j2 = (j2 * 10) + i2;
                        } else {
                            j = (j * 10) - i2;
                            if (j > 0) {
                                fail$default(this, "Numeric value overflow", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                        }
                    } else {
                        if (i != prefetchOrEof) {
                            fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i++;
                        z3 = true;
                    }
                } else {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i++;
                }
                z4 = true;
            }
            break loop0;
        }
    }

    private static final double consumeNumericLiteral$calculateExponent(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (z) {
            return Math.pow(10.0d, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(skipWhitespaces) == '\"') {
            skipWhitespaces++;
            z = true;
        } else {
            z = false;
        }
        boolean consumeBoolean = consumeBoolean(skipWhitespaces);
        if (!z) {
            return consumeBoolean;
        }
        if (this.currentPosition == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(this.currentPosition) != '\"') {
            fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.currentPosition++;
        return consumeBoolean;
    }

    private final boolean consumeBoolean(int start) {
        int prefetchOrEof = prefetchOrEof(start);
        if (prefetchOrEof >= getSource().length() || prefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i = prefetchOrEof + 1;
        int charAt = getSource().charAt(prefetchOrEof) | ' ';
        if (charAt == 102) {
            consumeBooleanLiteral("alse", i);
            return false;
        }
        if (charAt == 116) {
            consumeBooleanLiteral("rue", i);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void consumeBooleanLiteral(String literalSuffix, int current) {
        if (getSource().length() - current < literalSuffix.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = literalSuffix.length();
        for (int i = 0; i < length; i++) {
            if (literalSuffix.charAt(i) != (getSource().charAt(current + i) | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = current + literalSuffix.length();
    }

    private final <T> T withPositionRollback(Function0<? extends T> action) {
        int i = this.currentPosition;
        try {
            return action.invoke();
        } finally {
            this.currentPosition = i;
        }
    }
}
