package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdk {
    private static final jzt a = new kdj(null, true);

    private kdk() {
    }

    public static kaa a(Parcel parcel, jwt jwtVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new kaa();
        }
        Object[] objArr = new Object[readInt + readInt];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < readInt; i3++) {
            int readInt2 = parcel.readInt();
            int i4 = i + 4;
            byte[] c = c(parcel, readInt2, i4);
            int i5 = i4 + readInt2;
            int i6 = i3 + i3;
            objArr[i6] = c;
            int readInt3 = parcel.readInt();
            i = i5 + 4;
            if (readInt3 == -1) {
                kcf kcfVar = (kcf) jwtVar.a(kcs.e);
                if (!kcfVar.b) {
                    throw new kbr(kbq.f.e("Parcelable metadata values not allowed"));
                }
                int dataPosition = parcel.dataPosition();
                try {
                    Parcelable readParcelable = parcel.readParcelable(kdk.class.getClassLoader());
                    if (readParcelable == null) {
                        throw new kbr(kbq.k.e("Read null parcelable in metadata"));
                    }
                    jzt jztVar = a;
                    Charset charset = jyr.a;
                    objArr[i6 + 1] = new hvh(jztVar, readParcelable);
                    i2 += parcel.dataPosition() - dataPosition;
                    int i7 = kcfVar.c;
                    if (i2 > 32768) {
                        throw new kbr(kbq.h.e("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)"));
                    }
                } catch (AndroidRuntimeException e) {
                    throw new kbr(kbq.k.d(e).e("Failure reading parcelable in metadata"));
                }
            } else {
                if (readInt3 < 0) {
                    throw new kbr(kbq.k.e("Unrecognized metadata sentinel"));
                }
                byte[] c2 = c(parcel, readInt3, i);
                i += readInt3;
                objArr[i6 + 1] = c2;
            }
        }
        Charset charset2 = jyr.a;
        return new kaa(readInt, objArr);
    }

    public static void b(Parcel parcel, kaa kaaVar) {
        int i;
        int length;
        int read;
        if (kaaVar != null) {
            Charset charset = jyr.a;
            i = kaaVar.e;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        Charset charset2 = jyr.a;
        Object[] objArr = new Object[kaaVar.a()];
        for (int i2 = 0; i2 < kaaVar.e; i2++) {
            int i3 = i2 + i2;
            objArr[i3] = kaaVar.k(i2);
            int i4 = i3 + 1;
            Object d = kaaVar.d(i2);
            if (!(d instanceof byte[])) {
                d = ((hvh) d).c();
            }
            objArr[i4] = d;
        }
        parcel.writeInt(i);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i5 + i5;
            byte[] bArr = (byte[]) objArr[i6];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = objArr[i6 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (obj instanceof kdr) {
                parcel.writeInt(-1);
                ((kdr) obj).a(parcel);
            } else {
                byte[] b = kcy.b();
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i7 = 0;
                    while (true) {
                        length = b.length;
                        if (i7 >= length || (read = inputStream.read(b, i7, length - i7)) == -1) {
                            break;
                        } else {
                            i7 += read;
                        }
                    }
                    if (i7 == length) {
                        throw new kbr(kbq.h.e("Metadata value too large"));
                    }
                    parcel.writeInt(i7);
                    if (i7 > 0) {
                        parcel.writeByteArray(b, 0, i7);
                    }
                } finally {
                    kcy.a(b);
                }
            }
        }
    }

    private static byte[] c(Parcel parcel, int i, int i2) {
        if (i2 + i > 8192) {
            throw new kbr(kbq.h.e("Metadata too large"));
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
