package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: e, reason: collision with root package name */
    public static final l f447e;

    /* renamed from: i, reason: collision with root package name */
    public static final G f448i;

    /* renamed from: l, reason: collision with root package name */
    public static final G f449l;

    /* renamed from: m, reason: collision with root package name */
    public static final G f450m;

    /* renamed from: n, reason: collision with root package name */
    public static final G f451n;

    /* renamed from: o, reason: collision with root package name */
    public static final G f452o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ G[] f453p;

    /* renamed from: d, reason: collision with root package name */
    public final String f454d;

    static {
        G g7 = new G("TLS_1_3", 0, "TLSv1.3");
        f448i = g7;
        G g8 = new G("TLS_1_2", 1, "TLSv1.2");
        f449l = g8;
        G g9 = new G("TLS_1_1", 2, "TLSv1.1");
        f450m = g9;
        G g10 = new G("TLS_1_0", 3, "TLSv1");
        f451n = g10;
        G g11 = new G("SSL_3_0", 4, "SSLv3");
        f452o = g11;
        G[] gArr = {g7, g8, g9, g10, g11};
        f453p = gArr;
        d4.c.o(gArr);
        f447e = new l();
    }

    public G(String str, int i2, String str2) {
        this.f454d = str2;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f453p.clone();
    }
}
