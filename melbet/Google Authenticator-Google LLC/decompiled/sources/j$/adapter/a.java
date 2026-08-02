package j$.adapter;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class a {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.util.StringJoiner");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        try {
            Class.forName("java.nio.file.FileSystems");
        } catch (ClassNotFoundException unused2) {
        }
        try {
            Class.forName("android.os.Build");
        } catch (ClassNotFoundException unused3) {
        }
    }
}
