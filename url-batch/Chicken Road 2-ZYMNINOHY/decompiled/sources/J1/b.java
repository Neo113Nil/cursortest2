package J1;

import T.G;
import a.AbstractC0124a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import m0.y;
import m0.z;
import v2.I;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1156a;

    /* renamed from: b, reason: collision with root package name */
    public long f1157b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1158c;

    public b(int i4, URL url, long j4) {
        this.f1156a = i4;
        this.f1158c = url;
        this.f1157b = j4;
    }

    public static byte[] b(byte b4, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b4, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public I a(byte[] bArr) {
        long j4;
        ArrayList arrayList = (ArrayList) this.f1158c;
        AbstractC0124a.h(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, y.f14470g);
        arrayList.add(str);
        int i4 = this.f1156a;
        if (i4 == 1) {
            if (!z.f14477a.matcher(str).matches() && !z.f14478b.matcher(str).matches()) {
                return null;
            }
            this.f1156a = 2;
            return null;
        }
        if (i4 != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = z.f14479c.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                j4 = Long.parseLong(group);
            } else {
                j4 = -1;
            }
            if (j4 != -1) {
                this.f1157b = j4;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f1157b > 0) {
                this.f1156a = 3;
                return null;
            }
            I k4 = I.k(arrayList);
            arrayList.clear();
            this.f1156a = 1;
            this.f1157b = 0L;
            return k4;
        } catch (NumberFormatException e4) {
            throw G.b(str, e4);
        }
    }
}
