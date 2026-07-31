package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: KeyboardOptions.kt */
@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B2\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u0016R \u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b \u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "<init>", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "singleLine", "Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions$foundation_release", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getCapitalization-IUNYP9k", "Z", "getAutoCorrect", "()Z", "getKeyboardType-PjHm6EE", "getImeAction-eUduSuo", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class KeyboardOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, false, 0, 0, 15, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3) {
        this.capitalization = i;
        this.autoCorrect = z;
        this.keyboardType = i2;
        this.imeAction = i3;
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m2362getNoneIUNYP9k() : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? KeyboardType.INSTANCE.m2378getTextPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.INSTANCE.m2343getDefaulteUduSuo() : i3, null);
    }

    /* compiled from: KeyboardOptions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }
    }

    public final ImeOptions toImeOptions$foundation_release(boolean singleLine) {
        return new ImeOptions(singleLine, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return KeyboardCapitalization.m2357equalsimpl0(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m2367equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m2339equalsimpl0(this.imeAction, keyboardOptions.imeAction);
    }

    public int hashCode() {
        return (((((KeyboardCapitalization.m2358hashCodeimpl(this.capitalization) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m2368hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m2340hashCodeimpl(this.imeAction);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m2359toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m2369toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m2341toStringimpl(this.imeAction)) + ')';
    }
}
