package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private final String f678b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String type, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f678b = type;
        this.f679c = charSequence;
    }
}
