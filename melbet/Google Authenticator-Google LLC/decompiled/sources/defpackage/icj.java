package defpackage;

import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icj implements icy {
    private final eik b;
    private final hfm c;
    private final /* synthetic */ int d;

    public icj(int i, byte[] bArr) {
        this.d = i;
        this.b = eik.a(ick.a, new eik("ConsistencyTokenDemo"));
        this.c = new hjn("https://www.googleapis.com/auth/userinfo.email");
    }

    @Override // defpackage.icy
    public final eik a() {
        int i = this.d;
        return this.b;
    }

    @Override // defpackage.icy
    public final icz b() {
        switch (this.d) {
        }
        return jnn.l;
    }

    @Override // defpackage.icy
    public final Set c() {
        switch (this.d) {
            case 0:
                hfm hfmVar = this.c;
                return hfmVar.isEmpty() ? ick.i.k : hfmVar;
            case 1:
                hfm hfmVar2 = this.c;
                return hfmVar2.isEmpty() ? ick.i.k : hfmVar2;
            case 2:
                hfm hfmVar3 = this.c;
                return hfmVar3.isEmpty() ? ick.i.k : hfmVar3;
            case 3:
                hfm hfmVar4 = this.c;
                return hfmVar4.isEmpty() ? ick.i.k : hfmVar4;
            case 4:
                hfm hfmVar5 = this.c;
                return hfmVar5.isEmpty() ? ick.i.k : hfmVar5;
            case 5:
                hfm hfmVar6 = this.c;
                return hfmVar6.isEmpty() ? ick.i.k : hfmVar6;
            case 6:
                hfm hfmVar7 = this.c;
                return hfmVar7.isEmpty() ? ick.i.k : hfmVar7;
            case 7:
                hfm hfmVar8 = this.c;
                return hfmVar8.isEmpty() ? jnn.l.o : hfmVar8;
            case 8:
                hfm hfmVar9 = this.c;
                return hfmVar9.isEmpty() ? jnn.l.o : hfmVar9;
            case 9:
                hfm hfmVar10 = this.c;
                return hfmVar10.isEmpty() ? jnn.l.o : hfmVar10;
            case 10:
                hfm hfmVar11 = this.c;
                return hfmVar11.isEmpty() ? jnn.l.o : hfmVar11;
            case 11:
                hfm hfmVar12 = this.c;
                return hfmVar12.isEmpty() ? jnn.l.o : hfmVar12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hfm hfmVar13 = this.c;
                return hfmVar13.isEmpty() ? jnn.l.o : hfmVar13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                hfm hfmVar14 = this.c;
                return hfmVar14.isEmpty() ? jnn.l.o : hfmVar14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hfm hfmVar15 = this.c;
                return hfmVar15.isEmpty() ? jnn.l.o : hfmVar15;
            default:
                hfm hfmVar16 = this.c;
                return hfmVar16.isEmpty() ? jnn.l.o : hfmVar16;
        }
    }

    @Override // defpackage.icy
    public final int d() {
        int i = this.d;
        return (i == 0 || i == 3 || i == 4 || i == 5) ? 2 : 3;
    }

    public final String toString() {
        int i = this.d;
        return this.b.a;
    }

    public icj(int i) {
        this.d = i;
        this.b = eik.a(ick.a, new eik("Hello"));
        this.c = new hjn("https://www.googleapis.com/auth/userinfo.email");
    }

    public icj(int i, char[] cArr) {
        this.d = i;
        this.b = eik.a(ick.a, new eik("SetGreetingTemplate"));
        this.c = new hjn("https://www.googleapis.com/auth/userinfo.email");
    }

    public icj(int i, short[] sArr) {
        this.d = i;
        this.b = eik.a(ick.a, new eik("HelloWithAuth"));
        this.c = new hjn("https://www.googleapis.com/auth/userinfo.email");
    }

    public icj(int i, int[] iArr) {
        this.d = i;
        this.b = eik.a(ick.a, new eik("HelloWithReauth"));
        this.c = new hjn("https://www.googleapis.com/auth/userinfo.email");
    }

    public icj(int i, boolean[] zArr) {
        this.d = i;
        this.b = eik.a(ick.a, new eik("HelloWithLanguageContext"));
        this.c = new hjn("https://www.googleapis.com/auth/userinfo.email");
    }

    public icj(int i, float[] fArr) {
        this.d = i;
        this.b = eik.a(ick.a, new eik("CustomErrorDetails"));
        this.c = new hjn("https://www.googleapis.com/auth/userinfo.email");
    }

    public icj(int i, byte[][] bArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("CreateCredential"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, char[][] cArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("GetCredential"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, short[][] sArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("GetCredentialCount"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, int[][] iArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("ListCredentials"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, boolean[][] zArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("UpdateCredential"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, float[][] fArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("DeleteCredential"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, byte[][][] bArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("CheckExistCredential"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, char[][][] cArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("BatchDeleteCredentials"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }

    public icj(int i, short[][][] sArr) {
        this.d = i;
        this.b = eik.a(jnn.a, new eik("BatchUpdateCredentials"));
        this.c = new hjn("https://www.googleapis.com/auth/passbox.credential");
    }
}
