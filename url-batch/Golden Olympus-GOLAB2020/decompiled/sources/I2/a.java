package I2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public abstract class a extends j {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f776d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    protected final byte[] f777b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f778c;

    public a(byte[] bArr, int i4) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i4 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i4 > 7 || i4 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f777b = Z2.a.c(bArr);
        this.f778c = i4;
    }

    protected static byte[] h(byte[] bArr, int i4) {
        byte[] c4 = Z2.a.c(bArr);
        if (i4 > 0) {
            int length = bArr.length - 1;
            c4[length] = (byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i4) & c4[length]);
        }
        return c4;
    }

    @Override // I2.j
    protected boolean d(j jVar) {
        if (!(jVar instanceof a)) {
            return false;
        }
        a aVar = (a) jVar;
        return this.f778c == aVar.f778c && Z2.a.a(i(), aVar.i());
    }

    @Override // I2.j
    j g() {
        return new l(this.f777b, this.f778c);
    }

    @Override // I2.j, I2.e
    public int hashCode() {
        return this.f778c ^ Z2.a.h(i());
    }

    public byte[] i() {
        return h(this.f777b, this.f778c);
    }

    public int j() {
        return this.f778c;
    }

    public String k() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new h(byteArrayOutputStream).f(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i4 = 0; i4 != byteArray.length; i4++) {
                char[] cArr = f776d;
                stringBuffer.append(cArr[(byteArray[i4] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i4] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e4) {
            throw new i("Internal error encoding BitString: " + e4.getMessage(), e4);
        }
    }

    public String toString() {
        return k();
    }
}
