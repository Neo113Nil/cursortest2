package g6;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0453b extends C0452a {
    public static int a(float f7) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f7);
    }
}
