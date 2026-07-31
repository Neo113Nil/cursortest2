package E2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: E2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0373d implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    private final char[] f599b;

    /* renamed from: c, reason: collision with root package name */
    private int f600c;

    public C0373d(char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f599b = buffer;
        this.f600c = buffer.length;
    }

    public char b(int i4) {
        return this.f599b[i4];
    }

    public int c() {
        return this.f600c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i4) {
        return b(i4);
    }

    public void d(int i4) {
        this.f600c = i4;
    }

    public final String e(int i4, int i5) {
        return StringsKt.s(this.f599b, i4, Math.min(i5, length()));
    }

    public final void f(int i4) {
        d(Math.min(this.f599b.length, i4));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return StringsKt.s(this.f599b, i4, Math.min(i5, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return e(0, length());
    }
}
