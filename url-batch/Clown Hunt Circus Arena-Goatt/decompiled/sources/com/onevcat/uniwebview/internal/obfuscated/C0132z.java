package com.onevcat.uniwebview.internal.obfuscated;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132z {
    public static final C0093p k = new C0093p(1.0f, 1.0f, 1.0f, 1.0f);
    public static final C0093p l = new C0093p(0.0f, 0.0f, 0.0f, 1.0f);
    public static final C0093p m = new C0093p(0.0f, 0.0f, 0.0f, 1.0f);
    public final boolean a;
    public final EnumC0116v b;
    public final Float c;
    public final C0093p d;
    public final C0093p e;
    public final C0093p f;
    public final List g;
    public final List h;
    public final List i;
    public final boolean j;

    public C0132z(boolean z, EnumC0116v position, Float f, C0093p backgroundColor, C0093p buttonTextColor, C0093p titleTextColor, List leftItems, List centerItems, List rightItems, boolean z2) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttonTextColor, "buttonTextColor");
        Intrinsics.checkNotNullParameter(titleTextColor, "titleTextColor");
        Intrinsics.checkNotNullParameter(leftItems, "leftItems");
        Intrinsics.checkNotNullParameter(centerItems, "centerItems");
        Intrinsics.checkNotNullParameter(rightItems, "rightItems");
        this.a = z;
        this.b = position;
        this.c = f;
        this.d = backgroundColor;
        this.e = buttonTextColor;
        this.f = titleTextColor;
        this.g = leftItems;
        this.h = centerItems;
        this.i = rightItems;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0132z)) {
            return false;
        }
        C0132z c0132z = (C0132z) obj;
        return this.a == c0132z.a && this.b == c0132z.b && Intrinsics.areEqual((Object) this.c, (Object) c0132z.c) && Intrinsics.areEqual(this.d, c0132z.d) && Intrinsics.areEqual(this.e, c0132z.e) && Intrinsics.areEqual(this.f, c0132z.f) && Intrinsics.areEqual(this.g, c0132z.g) && Intrinsics.areEqual(this.h, c0132z.h) && Intrinsics.areEqual(this.i, c0132z.i) && this.j == c0132z.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.b.hashCode() + (r0 * 31)) * 31;
        Float f = this.c;
        int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z2 = this.j;
        return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        return "EmbeddedToolbarConfigV1(visible=" + this.a + ", position=" + this.b + ", maxHeight=" + this.c + ", backgroundColor=" + this.d + ", buttonTextColor=" + this.e + ", titleTextColor=" + this.f + ", leftItems=" + this.g + ", centerItems=" + this.h + ", rightItems=" + this.i + ", hasNavigationButtons=" + this.j + ')';
    }
}
