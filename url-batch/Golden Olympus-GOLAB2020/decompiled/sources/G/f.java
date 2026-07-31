package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private final String f683b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String type, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f683b = type;
        this.f684c = charSequence;
    }
}
