package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidTextStyle.android.kt */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "merge", "(Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformParagraphStyle;", "Z", "getIncludeFontPadding", "()Z", "getIncludeFontPadding$annotations", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlatformParagraphStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final boolean includeFontPadding;

    public final PlatformParagraphStyle merge(PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    /* compiled from: AndroidTextStyle.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
    }

    public PlatformParagraphStyle() {
        this(true);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlatformParagraphStyle) && this.includeFontPadding == ((PlatformParagraphStyle) other).includeFontPadding;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeFontPadding);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ')';
    }
}
