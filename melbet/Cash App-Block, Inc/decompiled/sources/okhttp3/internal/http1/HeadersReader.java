package okhttp3.internal.http1;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TouchSlopDetector$WhenMappings;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.time.zzbw;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.libraries.places.internal.zzbuy;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.http1.HeadersReader;
import okio.RealBufferedSource;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class HeadersReader implements ExtractorInput, ExtractorOutput, OnFailureListener {
    public final /* synthetic */ int $r8$classId;
    public long headerLimit;
    public Object source;

    public HeadersReader(ExtractorInput extractorInput, long j) {
        this.$r8$classId = 3;
        this.source = extractorInput;
        Trace.checkArgument(extractorInput.getPosition() >= j);
        this.headerLimit = j;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i) {
        ((ExtractorInput) this.source).advancePeekPosition(i);
    }

    public void clear(int i) {
        if (i < 64) {
            this.headerLimit &= ~(1 << i);
            return;
        }
        HeadersReader headersReader = (HeadersReader) this.source;
        if (headersReader != null) {
            headersReader.clear(i - 64);
        }
    }

    public int countOnesBefore(int i) {
        HeadersReader headersReader = (HeadersReader) this.source;
        if (headersReader == null) {
            long j = this.headerLimit;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.headerLimit);
        }
        return Long.bitCount(this.headerLimit) + headersReader.countOnesBefore(i - 64);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        ((ExtractorOutput) this.source).endTracks();
    }

    public void ensureNext() {
        if (((HeadersReader) this.source) == null) {
            this.source = new HeadersReader(6);
        }
    }

    public boolean get(int i) {
        if (i < 64) {
            return ((1 << i) & this.headerLimit) != 0;
        }
        ensureNext();
        return ((HeadersReader) this.source).get(i - 64);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return ((ExtractorInput) this.source).getLength() - this.headerLimit;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return ((ExtractorInput) this.source).getPeekPosition() - this.headerLimit;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return ((ExtractorInput) this.source).getPosition() - this.headerLimit;
    }

    /* renamed from: getPostSlopOffset-qto3Fdw, reason: not valid java name */
    public long m4323getPostSlopOffsetqto3Fdw(float f, long j, boolean z) {
        long m626plusMKHz9U;
        long j2 = this.headerLimit;
        if (z) {
            m626plusMKHz9U = Offset.m626plusMKHz9U(j2, j);
            this.headerLimit = m626plusMKHz9U;
        } else {
            m626plusMKHz9U = Offset.m626plusMKHz9U(j2, j);
        }
        if ((((Orientation) this.source) == null ? Offset.m623getDistanceimpl(m626plusMKHz9U) : Math.abs(m4325mainAxisk4lQ0M(m626plusMKHz9U))) < f) {
            return 9205357640488583168L;
        }
        Orientation orientation = (Orientation) this.source;
        long j3 = this.headerLimit;
        if (orientation == null) {
            return Offset.m625minusMKHz9U(this.headerLimit, Offset.m627timestuRUvjQ(Offset.m621divtuRUvjQ(j3, Offset.m623getDistanceimpl(j3)), f));
        }
        float m4325mainAxisk4lQ0M = m4325mainAxisk4lQ0M(j3) - (Math.signum(m4325mainAxisk4lQ0M(this.headerLimit)) * f);
        long j4 = this.headerLimit;
        Orientation orientation2 = (Orientation) this.source;
        Orientation orientation3 = Orientation.Horizontal;
        float intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == orientation3 ? j4 & BodyPartID.bodyIdMax : j4 >> 32));
        if (((Orientation) this.source) != orientation3) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(m4325mainAxisk4lQ0M) & BodyPartID.bodyIdMax);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(m4325mainAxisk4lQ0M) << 32);
    }

    public void insert(int i, boolean z) {
        if (i >= 64) {
            ensureNext();
            ((HeadersReader) this.source).insert(i - 64, z);
            return;
        }
        long j = this.headerLimit;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.headerLimit = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            set(i);
        } else {
            clear(i);
        }
        if (z2 || ((HeadersReader) this.source) != null) {
            ensureNext();
            ((HeadersReader) this.source).insert(0, z2);
        }
    }

    /* renamed from: isDeltaAtAngleOfInterest-k-4lQ0M, reason: not valid java name */
    public boolean m4324isDeltaAtAngleOfInterestk4lQ0M(long j) {
        long m626plusMKHz9U = Offset.m626plusMKHz9U(this.headerLimit, j);
        double atan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (m626plusMKHz9U & BodyPartID.bodyIdMax))), Math.abs(Float.intBitsToFloat((int) (m626plusMKHz9U >> 32))))) * 180.0f) / 3.141592653589793d;
        Orientation orientation = (Orientation) this.source;
        int i = orientation == null ? -1 : TouchSlopDetector$WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i != 2 || atan2 <= 30.0d) {
                return false;
            }
        } else if (atan2 >= 30.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public float m4325mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (((Orientation) this.source) == Orientation.Horizontal ? j >> 32 : j & BodyPartID.bodyIdMax));
    }

    public int nextClear(int i) {
        int numberOfTrailingZeros;
        if (i < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.headerLimit) >>> i) << i)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i < 128) {
            int i2 = i - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~0L) >>> i2) << i2);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i, 128);
        int i3 = (max / 64) - 2;
        long[] jArr = (long[]) this.source;
        int length = jArr.length;
        for (int i4 = i3; i4 < length; i4++) {
            long j = ~jArr[i4];
            if (i4 == i3) {
                int i5 = max % 64;
                j = (j >>> i5) << i5;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (numberOfTrailingZeros3 < 64) {
                return Boxes$$ExternalSyntheticOutline1.m(i4, 64, 128, numberOfTrailingZeros3);
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ConnectionResult connectionResult;
        switch (this.$r8$classId) {
            case 7:
                ((zzbw) this.source).zzb.set(this.headerLimit);
                break;
            case 8:
                ((zzoe) this.source).zzb.set(this.headerLimit);
                break;
            case 9:
                ((zzoe) this.source).zzb.set(this.headerLimit);
                break;
            case 10:
                zzbw zzbwVar = (zzbw) this.source;
                long j = this.headerLimit;
                if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).mStatus.zzd) != null && connectionResult.zzb == 24) {
                    zzbwVar.zzb.set(j);
                    break;
                }
                break;
            default:
                ((AtomicLong) ((zzah) this.source).zzc).set(this.headerLimit);
                break;
        }
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int peek(int i, int i2, byte[] bArr) {
        return ((ExtractorInput) this.source).peek(i, i2, bArr);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        return ((ExtractorInput) this.source).peekFully(bArr, i, i2, z);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        return ((ExtractorInput) this.source).read(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) {
        return ((ExtractorInput) this.source).readFully(bArr, 0, i2, z);
    }

    public boolean remove(int i) {
        if (i >= 64) {
            ensureNext();
            return ((HeadersReader) this.source).remove(i - 64);
        }
        long j = 1 << i;
        long j2 = this.headerLimit;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.headerLimit = j3;
        long j4 = j - 1;
        this.headerLimit = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        HeadersReader headersReader = (HeadersReader) this.source;
        if (headersReader != null) {
            if (headersReader.get(0)) {
                set(63);
            }
            ((HeadersReader) this.source).remove(0);
        }
        return z;
    }

    public void reset() {
        this.headerLimit = 0L;
        HeadersReader headersReader = (HeadersReader) this.source;
        if (headersReader != null) {
            headersReader.reset();
        }
    }

    /* renamed from: reset-k-4lQ0M, reason: not valid java name */
    public void m4326resetk4lQ0M(long j) {
        this.headerLimit = j;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        ((ExtractorInput) this.source).resetPeekPosition();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        ((ExtractorOutput) this.source).seekMap(new ForwardingSeekMap(seekMap) { // from class: androidx.media3.extractor.StartOffsetExtractorOutput$1
            @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
            public final SeekMap.SeekPoints getSeekPoints(long j) {
                SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                SeekPoint seekPoint = seekPoints.first;
                long j2 = seekPoint.timeUs;
                long j3 = seekPoint.position;
                long j4 = HeadersReader.this.headerLimit;
                SeekPoint seekPoint2 = new SeekPoint(j2, j3 + j4);
                SeekPoint seekPoint3 = seekPoints.second;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + j4));
            }
        });
    }

    public void set(int i) {
        if (i < 64) {
            this.headerLimit |= 1 << i;
        } else {
            ensureNext();
            ((HeadersReader) this.source).set(i - 64);
        }
    }

    public void setOrientation(Orientation orientation) {
        this.source = orientation;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int skip(int i) {
        return ((ExtractorInput) this.source).skip(i);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean skipFully(int i, boolean z) {
        return ((ExtractorInput) this.source).skipFully(i, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 2:
                StringBuilder sb = new StringBuilder("BitVector [");
                int length = (((long[]) this.source).length + 2) * 64;
                boolean z = true;
                for (0; i < length; i + 1) {
                    if (i < 64) {
                        i = ((1 << i) & this.headerLimit) == 0 ? i + 1 : 0;
                        if (!z) {
                            sb.append(", ");
                        }
                        sb.append(i);
                        z = false;
                    } else if (i < 128) {
                        if (((1 << (i - 64)) & 0) == 0) {
                        }
                        if (!z) {
                        }
                        sb.append(i);
                        z = false;
                    } else {
                        long[] jArr = (long[]) this.source;
                        int length2 = jArr.length;
                        if (length2 != 0 && (i / 64) - 2 < length2) {
                            if (((1 << (i % 64)) & jArr[i2]) == 0) {
                            }
                            if (!z) {
                            }
                            sb.append(i);
                            z = false;
                        }
                    }
                }
                sb.append(']');
                return sb.toString();
            case 6:
                if (((HeadersReader) this.source) == null) {
                    return Long.toBinaryString(this.headerLimit);
                }
                return ((HeadersReader) this.source).toString() + "xx" + Long.toBinaryString(this.headerLimit);
            default:
                return super.toString();
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return ((ExtractorOutput) this.source).track(i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void peekFully(int i, int i2, byte[] bArr) {
        ((ExtractorInput) this.source).peekFully(i, i2, bArr);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i, int i2) {
        ((ExtractorInput) this.source).readFully(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void skipFully(int i) {
        ((ExtractorInput) this.source).skipFully(i);
    }

    public /* synthetic */ HeadersReader(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.source = obj;
        this.headerLimit = j;
    }

    public /* synthetic */ HeadersReader(zzbuy zzbuyVar, long j) {
        this.$r8$classId = 12;
        Objects.requireNonNull(zzbuyVar);
        this.source = zzbuyVar;
        this.headerLimit = j;
    }

    public HeadersReader(RealBufferedSource realBufferedSource) {
        this.$r8$classId = 0;
        realBufferedSource.getClass();
        this.source = realBufferedSource;
        this.headerLimit = 262144L;
    }

    public /* synthetic */ HeadersReader(long j, Object obj, int i) {
        this.$r8$classId = i;
        this.headerLimit = j;
        this.source = obj;
    }

    public HeadersReader(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 6:
                this.headerLimit = 0L;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeadersReader(Orientation orientation, int i) {
        this((i & 1) != 0 ? null : orientation, 0L, 1);
        this.$r8$classId = 1;
    }
}
