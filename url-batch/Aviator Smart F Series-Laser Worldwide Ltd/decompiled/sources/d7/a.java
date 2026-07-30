package d7;

/* loaded from: classes5.dex */
public class a extends org.bouncycastle.crypto.params.a {
    private String params;

    public a(boolean z7, String str) {
        super(z7);
        this.params = str;
    }

    public String getDigest() {
        return this.params;
    }
}
