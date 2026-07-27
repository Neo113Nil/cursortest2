package r0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class B {
    public static int a(String str, int i2, int i4) {
        return (str.hashCode() + i2) * i4;
    }

    public static String b(int i2, int i4, String str, String str2) {
        return str + i2 + str2 + i4;
    }

    public static /* synthetic */ void c(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String d(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }
}
