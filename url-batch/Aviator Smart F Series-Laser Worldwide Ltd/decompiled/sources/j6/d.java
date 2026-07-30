package j6;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ int a(double d8) {
        long doubleToLongBits = Double.doubleToLongBits(d8);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
