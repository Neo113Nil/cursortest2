package org.bouncycastle.pqc.crypto.xmss;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class z {

    private static class a extends ObjectInputStream {
        private static final Set components;
        private boolean found;
        private final Class mainClass;

        static {
            HashSet hashSet = new HashSet();
            components = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        a(Class cls, InputStream inputStream) {
            super(inputStream);
            this.found = false;
            this.mainClass = cls;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            if (this.found) {
                if (!components.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.mainClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.found = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (hasNullPointer(bArr) || hasNullPointer(bArr2)) {
            throw new NullPointerException("a or b == null");
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            if (!org.bouncycastle.util.a.areEqual(bArr[i8], bArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    public static long bytesToXBigEndian(byte[] bArr, int i8, int i9) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j8 = 0;
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            j8 = (j8 << 8) | (bArr[i10] & 255);
        }
        return j8;
    }

    public static int calculateTau(int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (((i8 >> i10) & 1) == 0) {
                return i10;
            }
        }
        return 0;
    }

    public static byte[] cloneArray(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void copyBytesAtOffset(byte[] bArr, byte[] bArr2, int i8) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i8 > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i9 = 0; i9 < bArr2.length; i9++) {
            bArr[i8 + i9] = bArr2[i9];
        }
    }

    public static Object deserialize(byte[] bArr, Class cls) {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object readObject = aVar.readObject();
        if (aVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(readObject)) {
            return readObject;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static void dumpByteArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("x has null pointers");
        }
        for (byte[] bArr2 : bArr) {
            System.out.println(org.bouncycastle.util.encoders.d.toHexString(bArr2));
        }
    }

    public static byte[] extractBytesAtOffset(byte[] bArr, int i8, int i9) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i8 + i9 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr2[i10] = bArr[i8 + i10];
        }
        return bArr2;
    }

    public static int getDigestSize(org.bouncycastle.crypto.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("digest == null");
        }
        String algorithmName = eVar.getAlgorithmName();
        if (algorithmName.equals(o.SHAKE128)) {
            return 32;
        }
        if (algorithmName.equals(o.SHAKE256)) {
            return 64;
        }
        return eVar.getDigestSize();
    }

    public static int getLeafIndex(long j8, int i8) {
        return (int) (j8 & ((1 << i8) - 1));
    }

    public static long getTreeIndex(long j8, int i8) {
        return j8 >> i8;
    }

    public static boolean hasNullPointer(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIndexValid(int i8, long j8) {
        if (j8 >= 0) {
            return j8 < (1 << i8);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean isNewAuthenticationPathNeeded(long j8, int i8, int i9) {
        return j8 != 0 && (j8 + 1) % ((long) Math.pow((double) (1 << i8), (double) i9)) == 0;
    }

    public static boolean isNewBDSInitNeeded(long j8, int i8, int i9) {
        return j8 != 0 && j8 % ((long) Math.pow((double) (1 << i8), (double) (i9 + 1))) == 0;
    }

    public static int log2(int i8) {
        int i9 = 0;
        while (true) {
            i8 >>= 1;
            if (i8 == 0) {
                return i9;
            }
            i9++;
        }
    }

    public static void longToBigEndian(long j8, byte[] bArr, int i8) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        if (bArr.length - i8 < 8) {
            throw new IllegalArgumentException("not enough space in array");
        }
        bArr[i8] = (byte) ((j8 >> 56) & 255);
        bArr[i8 + 1] = (byte) ((j8 >> 48) & 255);
        bArr[i8 + 2] = (byte) ((j8 >> 40) & 255);
        bArr[i8 + 3] = (byte) ((j8 >> 32) & 255);
        bArr[i8 + 4] = (byte) ((j8 >> 24) & 255);
        bArr[i8 + 5] = (byte) ((j8 >> 16) & 255);
        bArr[i8 + 6] = (byte) ((j8 >> 8) & 255);
        bArr[i8 + 7] = (byte) (j8 & 255);
    }

    public static byte[] serialize(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toBytesBigEndian(long j8, int i8) {
        byte[] bArr = new byte[i8];
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            bArr[i9] = (byte) j8;
            j8 >>>= 8;
        }
        return bArr;
    }

    public static byte[][] cloneArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte[] bArr3 = new byte[bArr[i8].length];
            bArr2[i8] = bArr3;
            byte[] bArr4 = bArr[i8];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }
}
