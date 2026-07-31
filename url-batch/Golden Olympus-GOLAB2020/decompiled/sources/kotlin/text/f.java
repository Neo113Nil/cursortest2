package kotlin.text;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f41277a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final Regex f41278b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f41278b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private f() {
    }
}
