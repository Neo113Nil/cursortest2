package com.explorestack.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.memoizedSerializedSize = -1;
        this.count = i;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i3]), (ByteString) this.objects[i3]);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.tags[i3];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i4);
            int tagWireType = WireFormat.getTagWireType(i4);
            if (tagWireType == 0) {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i3]).longValue());
            } else if (tagWireType == 1) {
                computeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i3]).longValue());
            } else if (tagWireType == 2) {
                computeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i3]);
            } else if (tagWireType == 3) {
                computeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.objects[i3]).getSerializedSize();
            } else if (tagWireType == 5) {
                computeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i3]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i2 += computeUInt64Size;
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.count;
        return i == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    private static int hashCode(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int hashCode(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public int hashCode() {
        int i = this.count;
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31) + hashCode(this.tags, i)) * 31) + hashCode(this.objects, this.count);
    }

    void storeField(int i, Object obj) {
        checkMutable();
        ensureCapacity();
        int[] iArr = this.tags;
        int i2 = this.count;
        iArr[i2] = i;
        this.objects[i2] = obj;
        this.count = i2 + 1;
    }

    private void ensureCapacity() {
        int i = this.count;
        int[] iArr = this.tags;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.tags = Arrays.copyOf(iArr, i2);
            this.objects = Arrays.copyOf(this.objects, i2);
        }
    }
}
