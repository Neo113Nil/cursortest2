package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
final class TokenContents {
    private final byte[] mContents;
    private List mFingerprints;
    private String mPackageName;

    static TokenContents create(String str, List list) {
        return new TokenContents(createToken(str, list), str, list);
    }

    private TokenContents(byte[] bArr, String str, List list) {
        this.mContents = bArr;
        this.mPackageName = str;
        this.mFingerprints = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.mFingerprints.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public String getPackageName() {
        parseIfNeeded();
        String str = this.mPackageName;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public byte[] getFingerprint(int i) {
        parseIfNeeded();
        List list = this.mFingerprints;
        if (list == null) {
            throw new IllegalStateException();
        }
        return Arrays.copyOf((byte[]) list.get(i), ((byte[]) this.mFingerprints.get(i)).length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TokenContents.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.mContents, ((TokenContents) obj).mContents);
    }

    public int hashCode() {
        return Arrays.hashCode(this.mContents);
    }

    private static byte[] createToken(String str, List list) {
        Collections.sort(list, new Comparator() { // from class: androidx.browser.trusted.TokenContents$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareByteArrays;
                compareByteArrays = TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
                return compareByteArrays;
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    private void parseIfNeeded() {
        if (this.mPackageName != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.mContents));
        this.mPackageName = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.mFingerprints = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) != readInt2) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.mFingerprints.add(bArr);
        }
    }
}
