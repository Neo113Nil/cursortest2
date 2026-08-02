package okio;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Segment {
    public final byte[] data;
    public int limit;
    public Segment next;
    public final boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        segment2.getClass();
        segment2.next = this.next;
        Segment segment3 = this.next;
        segment3.getClass();
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final void push(Segment segment) {
        segment.getClass();
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        segment2.getClass();
        segment2.prev = segment;
        this.next = segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final void writeTo(Segment segment, int i) {
        segment.getClass();
        if (!segment.owner) {
            a$$ExternalSyntheticBUOutline0.m$1("only owner can write");
            return;
        }
        int i2 = segment.limit;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (segment.shared) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            int i4 = segment.pos;
            if (i3 - i4 > 8192) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            byte[] bArr = segment.data;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2);
            segment.limit -= segment.pos;
            segment.pos = 0;
        }
        byte[] bArr2 = segment.data;
        int i5 = segment.limit;
        int i6 = this.pos;
        ArraysKt___ArraysJvmKt.copyInto(i5, this.data, i6, bArr2, i6 + i);
        segment.limit += i;
        this.pos += i;
    }

    public Segment() {
        this.data = new byte[PKIFailureInfo.certRevoked];
        this.owner = true;
        this.shared = false;
    }
}
