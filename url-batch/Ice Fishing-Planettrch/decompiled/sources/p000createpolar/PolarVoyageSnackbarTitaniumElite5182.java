package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageSnackbarTitaniumElite5182 {
    public static final Integer PolarVoyageZipVortexCelestial6185;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            PolarVoyageZipVortexCelestial6185 = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        PolarVoyageZipVortexCelestial6185 = num2;
    }
}
